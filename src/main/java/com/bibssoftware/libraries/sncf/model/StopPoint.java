package com.bibssoftware.libraries.sncf.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * <StopPoint StopPointIdx="8662" StopPointId="688235" StopPointName="COURDIMANCHE LES CROIZETTES" StopPointExternalCode="40&#124;458" FareZone="100">
 * @author groyer
 *
 */
public class StopPoint {
  
  @XmlAttribute(name="StopPointIdx", required=true)
  public Integer idx;
  @XmlAttribute(name="StopPointId", required=true)
  public Integer id;
  @XmlAttribute(name="StopPointName", required=true)
  public String name;
  @XmlAttribute(name="StopPointExternalCode", required=true)
  public String externalCode;
  
  @XmlElement(name="StopPointAddress")
  public StopPointAddress address;
  @XmlElement(name="Mode")
  public Mode mode;
  @XmlElement(name="City")
  public City city;
  @XmlElement(name="StopArea")
  public StopArea stopArea;
  @XmlElement(name="Coord")
  public Coordinates coordinates;

}
