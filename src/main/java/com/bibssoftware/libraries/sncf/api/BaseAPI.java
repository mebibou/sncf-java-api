package com.bibssoftware.libraries.sncf.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.DefaultHttpClient;

import com.bibssoftware.libraries.sncf.utils.SNCFProperties;

public class BaseAPI {

  private String login;
  private String password;
  private SNCFProperties prop = SNCFProperties.getInstance();
  private JAXBContext jContext;
  private String api_url;

  public BaseAPI(String api_url) {
    this.api_url = api_url;
    this.login = prop.getProperty("sncf.login");
    this.password = prop.getProperty("sncf.password");
  }

  protected <T> T doGet(String url, Class<T> type) {
    String result = executeGet(this.api_url + url);
    try {
      this.jContext = JAXBContext.newInstance(type);
      Unmarshaller unmarshaller = jContext.createUnmarshaller();
      return type.cast(unmarshaller.unmarshal(new StringReader(result)));
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  private String executeGet(String url) {
    String result = null;
    try {
      HttpClient httpclient = new DefaultHttpClient();
      // Prepare a request object
      HttpGet httpget = new HttpGet(url);
      // Accept JSON
      httpget.addHeader("accept", "application/json");
      // Add authentication
      httpget.addHeader(BasicScheme.authenticate(new UsernamePasswordCredentials(this.login, this.password), "UTF-8", false));
      // Execute the request
      HttpResponse response = httpclient.execute(httpget);
      // Get the response entity
      HttpEntity entity = response.getEntity();
      // If response entity is not null
      if (entity != null) {
        // get entity contents and convert it to string
        InputStream instream = entity.getContent();
        result = getStringFromInputStream(instream);
        // Closing the input stream will trigger connection release
        instream.close();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    // Return the json
    return result;
  }

  // convert InputStream to String
  private static String getStringFromInputStream(InputStream is) {

    BufferedReader br = null;
    StringBuilder sb = new StringBuilder();

    String line;
    try {

      br = new BufferedReader(new InputStreamReader(is));
      while ((line = br.readLine()) != null) {
        sb.append(line);
      }

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (br != null) {
        try {
          br.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }

    return sb.toString();

  }

}
