package com.bibssoftware.libraries.sncf.model;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * 
 * @author bibssoftware
 *
 */
public class StopPointAddress {

  @XmlAttribute(name="StopPointAddressName", required=true)
  public String name;
  @XmlAttribute(name="StopPointAddressNumber", required=true)
  public String number;
  @XmlAttribute(name="StopPointAddressTypeName", required=true)
  public String typeName;
}
