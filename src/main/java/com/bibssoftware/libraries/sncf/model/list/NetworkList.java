package com.bibssoftware.libraries.sncf.model.list;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.bibssoftware.libraries.sncf.model.Network;

/**
 * 
 * @author bibssoftware
 *
 */
public class NetworkList {

  @XmlAttribute(name="NetworkCount")
  public Integer count;
  
  @XmlElement(name="Network")
  public List<Network> networks = new ArrayList<Network>();

  public void add(Network network) {
    this.networks.add(network);
  }
}
