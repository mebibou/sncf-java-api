package com.bibssoftware.libraries.sncf.model.action;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.bibssoftware.libraries.sncf.model.list.LineList;

/**
 * 
 * @author bibssoftware
 *
 */
@XmlRootElement(name="ActionLineList")
public class ActionLineList extends Action {
  
  @XmlElement(name="LineList")
  private LineList list;
  
  @Override
  public LineList getList() {
    return this.list;
  }
}
