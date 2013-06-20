package com.bibssoftware.libraries.sncf.model.action;

import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.bibssoftware.libraries.sncf.api.MSTransilienAPI;
import com.bibssoftware.libraries.sncf.model.lib.PagerInfo;
import com.bibssoftware.libraries.sncf.model.list.RouteList;

@XmlRootElement(name="ActionRouteList")
public class ActionRouteList extends Action {
  
  public static enum Params implements ActionParam {
    Sens, RouteIdx, CheckOrder
  }  

  @XmlElement(name="PagerInfo")
  public PagerInfo pagerInfo;
  @XmlElement(name="RouteList")
  public RouteList routeList;
  
  private MSTransilienAPI api;
  
  public ActionRouteList() {
    super();
    // add action type to url
    this.api = new MSTransilienAPI(RouteList.class);
  }
  
  @Override
  public RouteList execute(Map<ActionParam, Object> params) {
    String url = this.getUrl(params);
    
    ActionRouteList list = this.api.execute(url, ActionRouteList.class);
    
    return list.routeList;
  }
}
