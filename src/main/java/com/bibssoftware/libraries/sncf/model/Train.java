package com.bibssoftware.libraries.sncf.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @author bibssoftware
 *
 */
public class Train {
  
  @XmlElement(name="num")
  public Long num;
  
  @XmlElement(name="miss")
  public String miss;
  
  @XmlElement(name="date")
  public TrainDate date;
  
  @XmlElement(name="term")
  public Long term;
  
  @Override
  public String toString() {
    return this.num + this.date.toString();
  }

}
