package com.bibssoftware.libraries.sncf.model.action;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.bibssoftware.libraries.sncf.api.MSTransilienAPI;
import com.bibssoftware.libraries.sncf.model.RoutePoint;
import com.bibssoftware.libraries.sncf.model.list.RoutePointList;

public class RoutePointListTest {
  
  @Test
  public void testRoutePointList() {
    MSTransilienAPI api = new MSTransilienAPI();
    
    ActionRoutePointList action = api.list(null, ActionRoutePointList.class);
    RoutePointList list = action.getList();
    assertTrue(list.count>1000);
  }
  
  @Test
  public void testRoutePointByRoutePointExternalCode() {
    MSTransilienAPI api = new MSTransilienAPI();
    
    String code = "DUA8108014001013:DUA8775820";
    
    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(Action.Params.RoutePointExternalCode, code);
    
    ActionRoutePointList action = api.list(params, ActionRoutePointList.class);
    RoutePointList list = action.getList();
    assertTrue(list.count==1);
    for(RoutePoint point:list.routePoints) {
      assertTrue(point.externalCode.equals(code));
    }
  }
  
  @Test
  public void testRoutePointByStopPointExternalCode() {
    MSTransilienAPI api = new MSTransilienAPI();
    
    String code = "DUA8775820";
    
    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(Action.Params.StopPointExternalCode, code);
    
    ActionRoutePointList action = api.list(params, ActionRoutePointList.class);
    RoutePointList list = action.getList();
    assertTrue(list.count==4);
    for(RoutePoint point:list.routePoints) {
      assertTrue(point.stopPoint.externalCode.equals(code));
    }
  }
  
  @Test
  public void testRoutePointByStopAreaExternalCode() {
    MSTransilienAPI api = new MSTransilienAPI();
    
    String code = "DUA8775820";
    
    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(Action.Params.StopAreaExternalCode, code);
    
    ActionRoutePointList action = api.list(params, ActionRoutePointList.class);
    RoutePointList list = action.getList();
    assertTrue(list.count==4);
    for(RoutePoint point:list.routePoints) {
      assertTrue(point.stopPoint.stopArea.externalCode.equals(code));
    }
  }
}
