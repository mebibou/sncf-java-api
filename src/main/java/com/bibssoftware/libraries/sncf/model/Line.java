package com.bibssoftware.libraries.sncf.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * Ligne commerciale. Regroupe les propriétés principales d’une ligne quelle que soit sa complexité (ligne 
 * avec terminus différents, lignes en boucles…) 
 * La définition d’une ligne commerciale dans TRANSMODEL est exprimée par le fait 
 * qu’elle représente un groupe de ligne (d’itinéraires) qui sont en général connus du 
 * public par une appellation commune (nom ou numéro).
 * 
 * <Line LineIdx="1188" LineId="32068" LineName="Ligne 36" LineCode="Ligne 36" LineExternalCode="059440036" LineAdditionalData="" SortOrder="1188" LineColor="" HasAdaptedRoute="0">
 *  <ModeType ModeTypeIdx="0" ModeTypeExternalCode="" ModeTypeName="" />
 *  <Network NetworkIdx="131" NetworkId="658" NetworkName="STIVO" NetworkExternalCode="440">
 *  </Network>
 *  <Forward ForwardName="Ligne 36">
 *  </Forward>
 *  <Backward BackwardName="Ligne 36">
 *  </Backward>
 * </Line>
 * 
 * @author bibssoftware
 *
 */
public class Line {

  @XmlAttribute(name="LineIdx", required=true)
  public Integer idx;
  @XmlAttribute(name="LineId", required=true)
  public Integer id;
  @XmlAttribute(name="LineName", required=true)
  public String name;
  @XmlAttribute(name="LineCode", required=true)
  public String code;
  @XmlAttribute(name="LineExternalCode", required=true)
  public String externalCode;
  @XmlAttribute(name="SortOrder", required=true)
  public Integer sortOrder;
  @XmlAttribute(name="LineColor", required=false)
  public String color;
  @XmlAttribute(name="HasAdaptedRoute", required=false)
  public Boolean hasAdaptedRoute;
  
  @XmlElement(name="ModeType")
  public ModeType modeType;
  @XmlElement(name="Network")
  public Network network;
}
