package com.bibssoftware.libraries.sncf.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author bibssoftware
 *
 */
@XmlRootElement(name="passages")
public class Passages {
  
  @XmlAttribute(name="gare")
  public Long gareId;
  
  @XmlElement(name="train")
  public List<Train> trains = new ArrayList<Train>();

  public void add(Train train) {
    this.trains.add(train);
  }
  
  @Override
  public String toString() {
    return this.trains.toString();
  }

}
