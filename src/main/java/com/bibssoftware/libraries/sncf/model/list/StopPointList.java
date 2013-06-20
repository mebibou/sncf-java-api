package com.bibssoftware.libraries.sncf.model.list;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.bibssoftware.libraries.sncf.model.StopPoint;

/**
 * 
 * <StopPointList StopPointCount="1">
 * 
 * @author bibssoftware
 *
 */
public class StopPointList {

  @XmlAttribute(name="StopPointCount")
  public Integer count;
  
  @XmlElement(name="StopPoint")
  public List<StopPoint> stopPoints = new ArrayList<StopPoint>();

  public void add(StopPoint stopPoint) {
    this.stopPoints.add(stopPoint);
  }
}
