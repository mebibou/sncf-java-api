package com.bibssoftware.libraries.sncf.model;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * 
 * @author bibssoftware
 *
 */
public class Country {
  
  @XmlAttribute(name="CountryIdx", required=true)
  public Integer idx;
  @XmlAttribute(name="CountryId", required=true)
  public Integer id;
  @XmlAttribute(name="CountryName", required=true)
  public String name;
  @XmlAttribute(name="CountryExternalCode", required=true)
  public String externalCode;

}
