package com.bibssoftware.libraries.sncf.model.action;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.bibssoftware.libraries.sncf.model.list.ModeList;

/**
 * 
 * @author bibssoftware
 *
 */
@XmlRootElement(name="ActionModeList")
public class ActionModeList extends Action {
  
  @XmlElement(name="ModeList")
  private ModeList list;
  
  @Override
  public ModeList getList() {
    return this.list;
  }
}
