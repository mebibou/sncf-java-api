package com.bibssoftware.libraries.sncf.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.bibssoftware.libraries.sncf.model.list.StopList;

/**
 * <VehicleJourney VehicleJourneyIdx="235698" VehicleJourneyId="830461" VehicleJourneyName="830461" VehicleJourneyRouteIdx="6901" VehicleJourneyExternalCode="830461" IsAdapted="0">
 * 
 * @author groyer
 *
 */
public class VehicleJourney {

  @XmlAttribute(name="VehicleJourneyIdx", required=true)
  public Integer idx;
  @XmlAttribute(name="VehicleJourneyId", required=true)
  public Integer id;
  @XmlAttribute(name="VehicleJourneyName", required=true)
  public String name;
  @XmlAttribute(name="VehicleJourneyExternalCode", required=true)
  public String externalCode;
  @XmlAttribute(name="IsAdapted", required=true)
  public Boolean isAdpated;

  @XmlElement(name="Route")
  public Route route;
  @XmlElement(name="Mode")
  public Mode mode;
  @XmlElement(name="Company")
  public Company company;
  @XmlElement(name="Vehicle")
  public Vehicle vehicle;
  @XmlElement(name="StopList")
  public StopList stopList;
}
