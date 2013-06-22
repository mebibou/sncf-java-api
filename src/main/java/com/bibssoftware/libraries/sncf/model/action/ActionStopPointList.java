package com.bibssoftware.libraries.sncf.model.action;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.bibssoftware.libraries.sncf.model.list.StopPointList;

/**
 * 
 * @author bibssoftware
 *
 */
@XmlRootElement(name="ActionStopPointList")
public class ActionStopPointList extends Action {
  
  public static enum Params implements ActionParam {
    Sens
  }
  
  @XmlElement(name="StopPointList")
  private StopPointList list;
  
  @Override
  public StopPointList getList() {
    return this.list;
  }
}
