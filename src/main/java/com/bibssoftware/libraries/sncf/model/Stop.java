package com.bibssoftware.libraries.sncf.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * <Stop StopIdx="508972" StopPointIdx="8662" VehicleJourneyIdx="235698" HourNumber="0" MinuteNumber="0" DestinationPos="-1" ODTIdx="0" ODTPos="-1" ValidityPatternSetCommentPos="0"
          StopOrder="0" VehicleIdx="0">
 * @author groyer
 *
 */
public class Stop {

  @XmlAttribute(name="StopIdx", required=true)
  public Integer idx;
  @XmlAttribute(name="StopOrder", required=true)
  public Integer order;
  
  @XmlElement(name="StopTime")
  public StopTime stopTime;
  @XmlElement(name="StopArrivalTime")
  public StopArrivalTime stopArrivalTime;
  @XmlElement(name="StopPoint")
  public StopPoint stopPoint;

}
