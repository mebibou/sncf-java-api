package com.bibssoftware.libraries.sncf.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * <City CityIdx="362" CityId="36434" CityName="Courdimanche" CityExternalCode="95183" CityCode="95183" />
 * 
 * @author groyer
 *
 */
public class City {
  
  @XmlAttribute(name="CityIdx", required=true)
  public Integer idx;
  @XmlAttribute(name="CityId", required=true)
  public Integer id;
  @XmlAttribute(name="CityName", required=true)
  public String name;
  @XmlAttribute(name="CityExternalCode", required=true)
  public String externalCode;
  @XmlAttribute(name="CityCode", required=true)
  public String code;
  
  @XmlElement(name="Country")
  public Country country;

}
