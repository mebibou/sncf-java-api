package com.bibssoftware.libraries.sncf.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.bibssoftware.libraries.sncf.utils.CoordAdapater;

/**
 * 
 * @author bibssoftware
 *
 */
public class Coordinates {

  @XmlElement(name="CoordX")
  @XmlJavaTypeAdapter(CoordAdapater.class)
  public Float x;
  @XmlElement(name="CoordY")
  @XmlJavaTypeAdapter(CoordAdapater.class)
  public Float y;
  
  @Override
  public String toString() {
    return "x["+x+"], y["+y+"]";
  }
}
