package com.bibssoftware.libraries.sncf.model.action;

import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.bibssoftware.libraries.sncf.api.MSTransilienAPI;
import com.bibssoftware.libraries.sncf.model.lib.PagerInfo;
import com.bibssoftware.libraries.sncf.model.list.ProximityList;

@XmlRootElement(name="ActionProximityList")
public class ActionProximityList extends Action {
  
  public static enum Params implements ActionParam {
    Type, X, Y, Distance, MinCount, NbMax, CircleFilter, MainStopArea, MultiModal, CarPark
  }  

  @XmlElement(name="PagerInfo")
  public PagerInfo pagerInfo;
  @XmlElement(name="ProximityList")
  public ProximityList proximityList;
  
  private MSTransilienAPI api;
  
  public ActionProximityList() {
    super();
    // add action type to url
    this.api = new MSTransilienAPI(ProximityList.class);
  }
  
  @Override
  public ProximityList execute(Map<ActionParam, Object> params) {
    String url = this.getUrl(params);
    
    ActionProximityList list = this.api.execute(url, ActionProximityList.class);
    
    return list.proximityList;
  }
}
