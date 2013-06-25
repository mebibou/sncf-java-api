package com.bibssoftware.libraries.sncf.model.action;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.bibssoftware.libraries.sncf.api.MSTransilienAPI;
import com.bibssoftware.libraries.sncf.model.list.NetworkList;

public class NetworkListTest {

  @Test
  public void testNetworkList() {
    MSTransilienAPI api = new MSTransilienAPI();
    NetworkList list = api.list(null, ActionNetworkList.class).getList();
    assertTrue(list.count==11);
  }
  
  @Test
  public void testNetworkByExternalCode() {
    MSTransilienAPI api = new MSTransilienAPI();
    
    String code = "DUA801";
    
    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(Action.Params.NetworkExternalCode, code);
    
    NetworkList list = api.list(params, ActionNetworkList.class).getList();
    assertTrue(list.count==1);
    assertTrue(list.networks.get(0).externalCode.equals(code));
  }
}
