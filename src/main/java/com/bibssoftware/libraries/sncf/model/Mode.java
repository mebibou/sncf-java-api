package com.bibssoftware.libraries.sncf.model;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * <Mode ModeIdx="10" ModeId="2" ModeName="BUS" ModeExternalCode="RATP" ModeTypeExternalCode="" />
 * 
 * @author bibssoftware
 *
 */
public class Mode {
  
  @XmlAttribute(name="ModeIdx", required=true)
  public Integer idx;
  @XmlAttribute(name="ModeId", required=true)
  public Integer id;
  @XmlAttribute(name="ModeName", required=true)
  public String name;
  @XmlAttribute(name="ModeExternalCode", required=true)
  public String externalCode;
  @XmlAttribute(name="ModeTypeExternalCode", required=true)
  public String modeTypeExternalCode;

}
