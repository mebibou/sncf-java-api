package com.bibssoftware.libraries.sncf.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.bibssoftware.libraries.sncf.utils.DateAdapter;

/**
 * 
 * @author bibssoftware
 *
 */
public class TrainDate {
  
  public static enum TrainDateMode {
    REAL, THEORICAL
  }

  @XmlAttribute(name="mode")
  public String mode;
  
  @XmlValue
  @XmlJavaTypeAdapter(DateAdapter.class)
  public Date value;
  
  public TrainDateMode getMode() {
    if(mode.equalsIgnoreCase("R")) return TrainDateMode.REAL;
    else if(mode.equalsIgnoreCase("T")) return TrainDateMode.THEORICAL;
    else return null;
  }
  
  @Override
  public String toString() {
    return "("+this.value+" / " + this.getMode() + ")";
  }

}
