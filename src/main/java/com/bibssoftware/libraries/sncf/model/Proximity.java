package com.bibssoftware.libraries.sncf.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Proximity {

  @XmlAttribute(name="Distance", required=true)
  public Integer distance;
  
  @XmlElement(name="StopArea")
  public StopArea stopArea;
  @XmlElement(name="StopPoint")
  public StopPoint stopPoint;
}
