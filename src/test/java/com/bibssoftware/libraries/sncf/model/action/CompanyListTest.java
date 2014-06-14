package com.bibssoftware.libraries.sncf.model.action;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.bibssoftware.libraries.sncf.api.MSTransilienAPI;
import com.bibssoftware.libraries.sncf.model.list.CompanyList;

public class CompanyListTest {

  @Test
  public void testCompanyList() {
    MSTransilienAPI api = new MSTransilienAPI();
    CompanyList list = api.list(null, ActionCompanyList.class).getList();
    assertTrue(list.count != 0);
  }

  @Test
  public void testCompanyByExternalCode() {
    MSTransilienAPI api = new MSTransilienAPI();

    String code = "DUA092";

    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(Action.Params.CompanyExternalCode, code);

    CompanyList list = api.list(params, ActionCompanyList.class).getList();
    assertTrue(list.count == 1);
    assertTrue(list.companies.get(0).externalCode.equals(code));
  }
}
