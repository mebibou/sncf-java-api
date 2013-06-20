package com.bibssoftware.libraries.sncf.model.list;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.bibssoftware.libraries.sncf.model.Route;

public class RouteList {

  @XmlAttribute(name="RouteCount")
  public Integer count;
  
  @XmlElement(name="Route")
  public List<Route> routes = new ArrayList<Route>();

  public void add(Route route) {
    this.routes.add(route);
  }
}
