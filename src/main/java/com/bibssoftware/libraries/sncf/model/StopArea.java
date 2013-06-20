package com.bibssoftware.libraries.sncf.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * <StopArea StopAreaIdx="4124" StopAreaId="9417" StopAreaName="Les Croizettes" StopAreaExternalCode="NAV&#124;575322&#124;2449799" MainStopArea="0" MultiModal="0" CarPark="0"
 *             MainConnection="0" AdditionalData="" ResaRailCode="">
 *             
 * @author groyer
 *
 */
public class StopArea {
  
  @XmlAttribute(name="StopAreaIdx", required=true)
  public Integer idx;
  @XmlAttribute(name="StopAreaId", required=true)
  public Integer id;
  @XmlAttribute(name="StopAreaName", required=true)
  public String name;
  @XmlAttribute(name="StopAreaExternalCode")
  public String externalCode;
  @XmlAttribute(name="MainStopArea", required=true)
  public Boolean mainStopArea;
  @XmlAttribute(name="CarPark")
  public Boolean carpark;
  @XmlAttribute(name="ResaRailCode")
  public String resaRailCode;
  
  @XmlElement(name="Coord")
  public Coordinates coordinates;
}
