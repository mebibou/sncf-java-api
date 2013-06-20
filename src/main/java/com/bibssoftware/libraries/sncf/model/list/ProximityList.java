package com.bibssoftware.libraries.sncf.model.list;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.bibssoftware.libraries.sncf.model.Proximity;

/**
 * 
 * @author bibssoftware
 *
 */
public class ProximityList {

  @XmlAttribute(name="ProximityCount")
  public Integer count;
  
  @XmlElement(name="Proximity")
  public List<Proximity> proximities = new ArrayList<Proximity>();

  public void add(Proximity proximity) {
    this.proximities.add(proximity);
  }

}
