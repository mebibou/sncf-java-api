package com.bibssoftware.libraries.sncf.model;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * Transporteur. SNCF
 * <Company CompanyIdx="25" CompanyId="448" CompanyName="STIVO" CompanyExternalCode="059" />
 * 
 * @author groyer
 *
 */
public class Company {

  @XmlAttribute(name="CompanyIdx", required=true)
  public Integer idx;
  @XmlAttribute(name="CompanyId", required=true)
  public Integer id;
  @XmlAttribute(name="CompanyName", required=true)
  public String name;
  @XmlAttribute(name="CompanyExternalCode", required=true)
  public String externalCode;
}
