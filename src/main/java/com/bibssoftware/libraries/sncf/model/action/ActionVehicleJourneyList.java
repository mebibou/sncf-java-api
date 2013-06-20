package com.bibssoftware.libraries.sncf.model.action;

import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.bibssoftware.libraries.sncf.api.MSTransilienAPI;
import com.bibssoftware.libraries.sncf.model.lib.PagerInfo;
import com.bibssoftware.libraries.sncf.model.list.VehicleJourneyList;

@XmlRootElement(name="ActionVehicleJourneyList")
public class ActionVehicleJourneyList extends Action {
  
  public static enum Params implements ActionParam {
    ShowStop, VehicleJourneyIdx, VehicleJourneyExternalCode
  }  

  @XmlElement(name="PagerInfo")
  public PagerInfo pagerInfo;
  @XmlElement(name="VehicleJourneyList")
  public VehicleJourneyList vehicleJourneyList;
  
  private MSTransilienAPI api;
  
  public ActionVehicleJourneyList() {
    super();
    // add action type to url
    this.api = new MSTransilienAPI(VehicleJourneyList.class);
  }
  
  @Override
  public VehicleJourneyList execute(Map<ActionParam, Object> params) {
    String url = this.getUrl(params);
    
    ActionVehicleJourneyList list = this.api.execute(url, ActionVehicleJourneyList.class);
    
    return list.vehicleJourneyList;
  }
}
