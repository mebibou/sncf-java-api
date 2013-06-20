package com.bibssoftware.libraries.sncf.model.action;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.bibssoftware.libraries.sncf.model.list.CompanyList;

/**
 * 
 * @author bibssoftware
 *
 */
@XmlRootElement(name="ActionCompanyList")
public class ActionCompanyList extends Action {
  
  public static enum Params implements ActionParam {
    ShowStop, VehicleJourneyIdx, VehicleJourneyExternalCode
  }
  
  @XmlElement(name="CompanyList")
  private CompanyList list;
  
  @Override
  public CompanyList getList() {
    return this.list;
  }
}
