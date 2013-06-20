package com.bibssoftware.libraries.sncf.model.list;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.bibssoftware.libraries.sncf.model.Stop;

/**
 * 
 * <StopList StopCount="4"></StopList>
 * @author groyer
 *
 */
public class StopList {

  @XmlAttribute(name="StopCount")
  public Integer count;
  
  @XmlElement(name="Stop")
  public List<Stop> stops = new ArrayList<Stop>();

  public void add(Stop stop) {
    this.stops.add(stop);
  }
}
