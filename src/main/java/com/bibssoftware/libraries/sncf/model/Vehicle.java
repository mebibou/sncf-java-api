package com.bibssoftware.libraries.sncf.model;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * <Vehicle VehicleIdx="0" VehicleId="-1" VehicleName="" VehicleExternalCode="" MIPAccess="False" BikeAccepted="False" AirConditioned="False" />
 * 
 * @author groyer
 *
 */
public class Vehicle {

  @XmlAttribute(name="VehicleIdx")
  public Long idx;
  @XmlAttribute(name="VehicleId")
  public Long id;
  @XmlAttribute(name="VehicleName")
  public String name;
  @XmlAttribute(name="VehicleExternalCode")
  public String externalCode;
  @XmlAttribute(name="MIPAccess", required=false)
  public Boolean MIPAccess;
  @XmlAttribute(name="BikeAccepted", required=false)
  public Boolean bikeAccepted;
  @XmlAttribute(name="AirConditioned", required=false)
  public Boolean airConditionned;
}
