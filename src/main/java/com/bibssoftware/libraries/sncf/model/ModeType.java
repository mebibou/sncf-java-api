package com.bibssoftware.libraries.sncf.model;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * Mode générique de transport (normalisé TRIDENT). Exemples : bus, train, rapidTransit… 
 * <ModeType ModeTypeIdx="0" ModeTypeExternalCode="" ModeTypeName="" />
 * 
 * @author groyer
 *
 */
public class ModeType {

  @XmlAttribute(name="ModeTypeIdx", required=true)
  public Integer idx;
  @XmlAttribute(name="ModeTypeExternalCode, required=true")
  public String externalCode;
  @XmlAttribute(name="ModeTypeName", required=true)
  public String name;
}
