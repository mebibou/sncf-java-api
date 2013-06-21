package com.bibssoftware.libraries.sncf.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @author bibssoftware
 *
 */
public class RoutePoint {

  @XmlAttribute(name="RoutePointIdx", required=true)
  public Integer idx;
  @XmlAttribute(name="RoutePointId", required=true)
  public Integer id;
  @XmlAttribute(name="RoutePointExternalCode", required=true)
  public String externalCode;
  @XmlAttribute(name="RouteIdx", required=true)
  public Integer routeIdx;
  @XmlAttribute(name="MainStopPoint", required=true)
  public String mainStopPoint;
  @XmlAttribute(name="FareSection", required=true)
  public Boolean fareSection;
  
  @XmlElement(name="StopPoint")
  public StopPoint stopPoint;
  @XmlElement(name="StopArea")
  public StopArea stopArea;
}
