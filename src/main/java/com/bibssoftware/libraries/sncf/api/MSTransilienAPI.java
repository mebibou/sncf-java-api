package com.bibssoftware.libraries.sncf.api;

import java.util.Map;

import com.bibssoftware.libraries.sncf.model.action.Action;
import com.bibssoftware.libraries.sncf.model.action.ActionParam;


public class MSTransilienAPI extends BaseAPI {
  
  private static String API_URL = "http://ms.api.transilien.com/";

  public MSTransilienAPI() {
    super(API_URL);
  }
  
  public <T extends Action> T list(Map<ActionParam, Object> params, Class<T> type) {
    String url = "?action="+type.getSimpleName().replaceAll("Action", "") + Action.addParams(params);
    return this.doGet(url, type);
  }
  
  protected <T> T execute(String url, Class<T> type) {
    return this.doGet(url, type);
  }

}
