package com.bibssoftware.libraries.sncf.model.list;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.bibssoftware.libraries.sncf.model.RoutePoint;

/**
 * 
 * @author bibssoftware
 *
 */
public class RoutePointList {

  @XmlAttribute(name="RoutePointCount")
  public Integer count;
  
  @XmlElement(name="RoutePoint")
  public List<RoutePoint> routePoints = new ArrayList<RoutePoint>();

  public void add(RoutePoint routePoint) {
    this.routePoints.add(routePoint);
  }
}
