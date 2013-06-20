package com.bibssoftware.libraries.sncf.model.action;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.bibssoftware.libraries.sncf.model.list.VehicleJourneyList;

@XmlRootElement(name="ActionVehicleJourneyList")
public class ActionVehicleJourneyList extends Action {
  
  public static enum Params implements ActionParam {
    ShowStop, VehicleJourneyIdx, VehicleJourneyExternalCode
  }
  
  @XmlElement(name="VehicleJourneyList")
  private VehicleJourneyList vehicleJourneyList;
  
  @Override
  public VehicleJourneyList getList() {
    return this.vehicleJourneyList;
  }
}
