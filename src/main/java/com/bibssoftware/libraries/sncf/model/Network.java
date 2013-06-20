package com.bibssoftware.libraries.sncf.model;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * Marque commerciale, réseau de transport. Exemple : réseau Paris Saint-Lazare, réseau RER E
 * <Network NetworkIdx="131" NetworkId="658" NetworkName="STIVO" NetworkExternalCode="440"></Network>
 * 
 * @author bibssoftware
 *
 */
public class Network {
  
  @XmlAttribute(name="NetworkIdx", required=true)
  public Integer idx;
  @XmlAttribute(name="NetworkId", required=true)
  public Integer id;
  @XmlAttribute(name="NetworkName", required=true)
  public String name;
  @XmlAttribute(name="NetworkExternalCode", required=true)
  public String externalCode;

}
