package com.bibssoftware.libraries.sncf.model.action;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Map.Entry;


public abstract class Action {
  
  public static enum Params implements ActionParam {
    NetworkExternalCode, ModeTypeExternalCode, ModeExternalCode, LineExternalCode, RouteExternalCode, 
    VehicleJourneyExternalCode, StopAreaExternalCode, StopPointExternalCode
  }
  
  protected String url;
  
  public Action() {
    this.url = "";
  }
  
  public String getUrl(Map<ActionParam, Object> params) {
    return this.addParams(this.url, params);
  }
  
  public abstract Object execute(Map<ActionParam, Object> params);
  
  protected String addParams(String url, Map<ActionParam, Object> params) {
    if(params!=null) {
      for(Entry<ActionParam, Object> entry: params.entrySet()) {
        String name = entry.getKey().name();
        String value = entry.getValue().toString();
        url = this.addParam(url, name, value);
      }
    }
    return url;
  }
  
  protected String addParam(String url, String param_name, String param_value) {
    try {
      url += "&"+param_name+"="+URLEncoder.encode(param_value, "UTF-8");
    } catch (UnsupportedEncodingException e) {
      // could not encode? simply add value
      url += "&"+param_name+"="+param_value;
    }
    return url;
  }
  
}
