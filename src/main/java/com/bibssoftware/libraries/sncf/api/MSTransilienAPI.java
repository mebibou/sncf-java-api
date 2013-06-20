package com.bibssoftware.libraries.sncf.api;


public class MSTransilienAPI extends BaseAPI {
  
  private static String API_URL = "http://ms.api.transilien.com/";

  public MSTransilienAPI() {
    super(API_URL);
  }

  public MSTransilienAPI(Class<?> action) {
    super(API_URL+"?action="+action.getSimpleName());
  }
  
  public <T> T execute(String url, Class<T> type) {
    return this.doGet(url, type);
  }

}
