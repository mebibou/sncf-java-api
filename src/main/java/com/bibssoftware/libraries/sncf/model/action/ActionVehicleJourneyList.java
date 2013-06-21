package com.bibssoftware.libraries.sncf.model.action;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.bibssoftware.libraries.sncf.model.list.VehicleJourneyList;

/**
 * 
 * @author bibssoftware
 *
 */
@XmlRootElement(name="ActionVehicleJourneyList")
public class ActionVehicleJourneyList extends Action {
  
  public static enum Params implements ActionParam {
    VehicleJourneyName, ShowStop, Date, EndDate, StartTime, EndTime
  }
  
  @XmlElement(name="VehicleJourneyList")
  private VehicleJourneyList list;
  
  @Override
  public VehicleJourneyList getList() {
    return this.list;
  }
}
