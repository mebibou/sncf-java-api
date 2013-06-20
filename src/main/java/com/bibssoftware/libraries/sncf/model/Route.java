package com.bibssoftware.libraries.sncf.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * <Route RouteIdx="6901" RouteId="62978" RouteName="Ligne 36" RouteExternalCode="0594400360001" IsForward="0" RouteLineIdx="1188" IsFrequence="0" IsAdapted="0">
 * 
 * @author bibssoftware
 *
 */
public class Route {

  @XmlAttribute(name="RouteIdx", required=true)
  public Integer idx;
  @XmlAttribute(name="RouteId", required=true)
  public Integer id;
  @XmlAttribute(name="RouteName", required=true)
  public String name;
  @XmlAttribute(name="RouteExternalCode", required=true)
  public String externalCode;
  @XmlAttribute(name="IsForward", required=true)
  public Boolean isForward;
  @XmlAttribute(name="IsFrequence", required=true)
  public Boolean isFrequence;
  @XmlAttribute(name="IsAdapted", required=false)
  public Boolean isAdpated;
  
  @XmlElement(name="Line")
  public Line line;
}
