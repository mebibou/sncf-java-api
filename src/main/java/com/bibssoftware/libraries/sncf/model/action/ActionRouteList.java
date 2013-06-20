package com.bibssoftware.libraries.sncf.model.action;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.bibssoftware.libraries.sncf.model.list.RouteList;

@XmlRootElement(name="ActionRouteList")
public class ActionRouteList extends Action {
  
  public static enum Params implements ActionParam {
    Sens, RouteIdx, CheckOrder
  }
  
  @XmlElement(name="RouteList")
  private RouteList routeList;
  
  @Override
  public RouteList getList() {
    return this.routeList;
  }
}
