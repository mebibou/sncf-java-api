package com.bibssoftware.libraries.sncf.model.action;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.bibssoftware.libraries.sncf.model.list.ModeTypeList;

/**
 * 
 * @author bibssoftware
 *
 */
@XmlRootElement(name="ActionModeTypeList")
public class ActionModeTypeList extends Action {
  
  @XmlElement(name="ModeTypeList")
  private ModeTypeList list;
  
  @Override
  public ModeTypeList getList() {
    return this.list;
  }
}
