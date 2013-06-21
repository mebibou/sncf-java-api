package com.bibssoftware.libraries.sncf.model.action;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.bibssoftware.libraries.sncf.model.list.NetworkList;

/**
 * 
 * @author bibssoftware
 *
 */
@XmlRootElement(name="ActionNetworkList")
public class ActionNetworkList extends Action {
  
  @XmlElement(name="NetworkList")
  private NetworkList list;
  
  @Override
  public NetworkList getList() {
    return this.list;
  }
}
