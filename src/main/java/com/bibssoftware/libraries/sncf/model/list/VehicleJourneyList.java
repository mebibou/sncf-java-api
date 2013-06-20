package com.bibssoftware.libraries.sncf.model.list;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.bibssoftware.libraries.sncf.model.VehicleJourney;

public class VehicleJourneyList {

  @XmlAttribute(name="VehicleJourneyCount")
  public Integer count;
  
  @XmlElement(name="VehicleJourney")
  public List<VehicleJourney> vehicleJourneys = new ArrayList<VehicleJourney>();

  public void add(VehicleJourney vehicleJourney) {
    this.vehicleJourneys.add(vehicleJourney);
  }
}
