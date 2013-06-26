package com.bibssoftware.libraries.sncf.utils;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class CoordAdapater extends XmlAdapter<String, Float>  {

  @Override
  public String marshal(Float f) throws Exception {
    return f.toString().replace(".", ",");
  }

  @Override
  public Float unmarshal(String s) throws Exception {
    return new Float(s.replace(",", "."));
  }

}
