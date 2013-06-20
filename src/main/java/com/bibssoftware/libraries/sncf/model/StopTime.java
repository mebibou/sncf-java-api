package com.bibssoftware.libraries.sncf.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * <StopTime>
 *           <TotalSeconds>26220</TotalSeconds>
 *           <Day>0</Day>
 *           <Hour>07</Hour>
 *           <Minute>17</Minute>
 *         </StopTime>
 *
 * @author groyer
 *
 */
public class StopTime {

  @XmlElement(name="TotalSeconds")
  public Integer seconds;
  @XmlElement(name="Day")
  public Integer day;
  @XmlElement(name="Hour")
  public Integer hour;
  @XmlElement(name="Minute")
  public Integer minute;
}
