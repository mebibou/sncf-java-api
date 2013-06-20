package com.bibssoftware.libraries.sncf.model.action;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.bind.annotation.XmlElement;

import com.bibssoftware.libraries.sncf.model.lib.PagerInfo;


public abstract class Action {
  
  public static enum Params implements ActionParam {
    NetworkExternalCode, ModeTypeExternalCode, ModeExternalCode, LineExternalCode, RouteExternalCode, 
    VehicleJourneyExternalCode, StopAreaExternalCode, StopPointExternalCode, RoutePointExternalCode,
    CityExternalCode, CompanyExternalCode, LineCode
  }

  @XmlElement(name="PagerInfo")
  protected PagerInfo pagerInfo;
  
  public PagerInfo getPagerInfo() {
    return this.pagerInfo;
  }
  
  public abstract Object getList();
  
  public static String addParams(Map<ActionParam, Object> params) {
    String url = "";
    if(params!=null) {
      for(Entry<ActionParam, Object> entry: params.entrySet()) {
        String name = entry.getKey().name();
        String value = entry.getValue().toString();
        url += Action.addParam(name, value);
      }
    }
    return url;
  }
  
  protected static String addParam(String param_name, String param_value) {
    try {
      return "&"+param_name+"="+URLEncoder.encode(param_value, "UTF-8");
    } catch (UnsupportedEncodingException e) {
      // could not encode? simply add value
      return "&"+param_name+"="+param_value;
    }
  }
  
}
