package com.bibssoftware.libraries.sncf.model.action;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.bibssoftware.libraries.sncf.model.list.RoutePointList;

/**
 * 
 * @author bibssoftware
 *
 */
@XmlRootElement(name="ActionRoutePointList")
public class ActionRoutePointList extends Action {
  
  public static enum Params implements ActionParam {
    RoutePointIdx, RoutePointExternalCode, Sens,
    RouteIdx, StopPointIdx, StopAreaIdx
  }
  
  @XmlElement(name="RoutePointList")
  private RoutePointList list;
  
  @Override
  public RoutePointList getList() {
    return this.list;
  }
}
