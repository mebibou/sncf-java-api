package com.bibssoftware.libraries.sncf.model.lib;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * <PagerInfo ResponseCount="1" ResponseStartIndex="0" TotalCount="1" />
 * 
 * @author groyer
 *
 */
public class PagerInfo {

  @XmlAttribute(name="ResponseCount", required=true)
  public Integer count;
  @XmlAttribute(name="ResponseStartIndex", required=true)
  public Integer startIndex;
  @XmlAttribute(name="TotalCount", required=true)
  public Integer totalCount;
}
