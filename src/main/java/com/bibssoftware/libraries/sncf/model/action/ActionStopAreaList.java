package com.bibssoftware.libraries.sncf.model.action;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.bibssoftware.libraries.sncf.model.list.StopAreaList;

/**
 * 
 * @author bibssoftware
 *
 */
@XmlRootElement(name="ActionStopAreaList")
public class ActionStopAreaList extends Action {
  
  public static enum Params implements ActionParam {
    MainStopArea, MultiModal, CarPark
  }
  
  @XmlElement(name="StopAreaList")
  private StopAreaList list;
  
  @Override
  public StopAreaList getList() {
    return this.list;
  }
}
