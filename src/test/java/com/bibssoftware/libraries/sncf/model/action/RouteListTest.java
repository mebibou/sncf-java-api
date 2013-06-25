package com.bibssoftware.libraries.sncf.model.action;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.bibssoftware.libraries.sncf.api.MSTransilienAPI;
import com.bibssoftware.libraries.sncf.model.ModeType;
import com.bibssoftware.libraries.sncf.model.Route;
import com.bibssoftware.libraries.sncf.model.list.RouteList;

public class RouteListTest {

  @Test
  public void testRouteList() {
    MSTransilienAPI api = new MSTransilienAPI();
    
    ActionRouteList action = api.list(null, ActionRouteList.class);
    RouteList list = action.getList();
    assertTrue(list.count>500);
  }
  
  @Test
  public void testRouteByExternalCode() {
    MSTransilienAPI api = new MSTransilienAPI();
    
    String code = "DUA0141460142097";
    
    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(Action.Params.RouteExternalCode, code);

    RouteList list = api.list(params, ActionRouteList.class).getList();
    assertTrue(list.count==1);
    assertTrue(list.routes.get(0).externalCode.equals(code));
  }
  
  @Test
  public void testRouteByLineExternalCode() {
    MSTransilienAPI api = new MSTransilienAPI();
    
    String code = "DUA810801400";
    
    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(Action.Params.LineExternalCode, code);

    RouteList list = api.list(params, ActionRouteList.class).getList();
    assertTrue(list.count==3);
    for(Route route:list.routes) {
      assertTrue(route.line.externalCode.equals(code));
    }
  }
  
  @Test
  public void testRouteByModeTypeExternalCode() {
    MSTransilienAPI api = new MSTransilienAPI();
    
    String code = ModeType.Values.Bus.name();
    
    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(Action.Params.ModeTypeExternalCode, code);

    RouteList list = api.list(params, ActionRouteList.class).getList();
    assertTrue(list.count==83);
    for(Route route:list.routes) {
      assertTrue(route.line.modeType.externalCode.equals(code));
    }
  }
  
  @Test
  public void testRouteByNetworkExternalCode() {
    MSTransilienAPI api = new MSTransilienAPI();
    
    String code = "DUA802";
    
    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(Action.Params.NetworkExternalCode, code);

    RouteList list = api.list(params, ActionRouteList.class).getList();
    assertTrue(list.count==73);
    for(Route route:list.routes) {
      assertTrue(route.line.network.externalCode.equals(code));
    }
  }
}
