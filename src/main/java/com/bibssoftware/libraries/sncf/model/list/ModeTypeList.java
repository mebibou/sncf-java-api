package com.bibssoftware.libraries.sncf.model.list;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.bibssoftware.libraries.sncf.model.ModeType;

/**
 * 
 * @author bibssoftware
 *
 */
public class ModeTypeList {

  @XmlAttribute(name="ModeTypeCount")
  public Integer count;
  
  @XmlElement(name="ModeType")
  public List<ModeType> modeTypes = new ArrayList<ModeType>();

  public void add(ModeType modeType) {
    this.modeTypes.add(modeType);
  }
}
