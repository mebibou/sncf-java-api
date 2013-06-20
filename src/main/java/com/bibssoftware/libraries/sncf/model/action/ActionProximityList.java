package com.bibssoftware.libraries.sncf.model.action;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.bibssoftware.libraries.sncf.model.list.ProximityList;

/**
 * 
 * @author bibssoftware
 *
 */
@XmlRootElement(name="ActionProximityList")
public class ActionProximityList extends Action {
  
  public static enum Params implements ActionParam {
    Type, X, Y, Distance, MinCount, NbMax, CircleFilter, MainStopArea, MultiModal, CarPark
  }
  
  @XmlElement(name="ProximityList")
  private ProximityList list;
  
  @Override
  public ProximityList getList() {
    return this.list;
  }
}
