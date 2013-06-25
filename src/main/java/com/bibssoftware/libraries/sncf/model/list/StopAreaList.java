package com.bibssoftware.libraries.sncf.model.list;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.bibssoftware.libraries.sncf.model.StopArea;

/**
 * 
 * @author bibssoftware
 *
 */
public class StopAreaList {

  @XmlAttribute(name="StopAreaCount")
  public Integer count;
  
  @XmlElement(name="StopArea")
  public List<StopArea> stopAreas = new ArrayList<StopArea>();

  public void add(StopArea stopArea) {
    this.stopAreas.add(stopArea);
  }
}
