package com.bibssoftware.libraries.sncf.model.list;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.bibssoftware.libraries.sncf.model.Mode;

/**
 * 
 * @author bibssoftware
 *
 */
public class ModeList {

  @XmlAttribute(name="ModeCount")
  public Integer count;
  
  @XmlElement(name="Mode")
  public List<Mode> modes = new ArrayList<Mode>();

  public void add(Mode mode) {
    this.modes.add(mode);
  }
}
