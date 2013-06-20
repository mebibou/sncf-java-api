package com.bibssoftware.libraries.sncf.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @author groyer
 *
 */
public class Coordinates {

  @XmlElement(name="CoordX")
  public Float x;
  @XmlElement(name="CoordY")
  public Float y;
}
