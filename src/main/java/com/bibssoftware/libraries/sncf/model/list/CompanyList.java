package com.bibssoftware.libraries.sncf.model.list;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import com.bibssoftware.libraries.sncf.model.Company;

public class CompanyList {

  @XmlAttribute(name="CompanyCount")
  public Integer count;
  
  @XmlElement(name="Company")
  public List<Company> companies = new ArrayList<Company>();

  public void add(Company company) {
    this.companies.add(company);
  }
}
