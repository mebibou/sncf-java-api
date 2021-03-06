package com.bibssoftware.libraries.sncf.model.action;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.bibssoftware.libraries.sncf.model.list.RouteList;

/**
 * 
 * @author bibssoftware
 *
 */
@XmlRootElement(name="ActionRouteList")
public class ActionRouteList extends Action {
  
  public static enum Params implements ActionParam {
    Sens, CheckOrder
  }
  
  @XmlElement(name="RouteList")
  private RouteList list;
  
  @Override
  public RouteList getList() {
    return this.list;
  }
}
