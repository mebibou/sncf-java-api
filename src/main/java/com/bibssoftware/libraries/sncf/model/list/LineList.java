package com.bibssoftware.libraries.sncf.model.list;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.bibssoftware.libraries.sncf.model.Line;

/**
 * 
 * @author bibssoftware
 *
 */
public class LineList {

  @XmlAttribute(name="LineCount")
  public Integer count;
  
  @XmlElement(name="Line")
  public List<Line> lines = new ArrayList<Line>();

  public void add(Line line) {
    this.lines.add(line);
  }
}
