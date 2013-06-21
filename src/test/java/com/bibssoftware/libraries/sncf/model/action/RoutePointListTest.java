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
  public void testRoutePointByRoutePointIdx() {
    MSTransilienAPI api = new MSTransilienAPI();
    
    Integer idx = 159713;
    
    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(ActionRoutePointList.Params.RoutePointIdx, idx);
    
    ActionRoutePointList action = api.list(params, ActionRoutePointList.class);
    RoutePointList list = action.getList();
    assertTrue(list.count==1);
    for(RoutePoint point:list.routePoints) {
      assertTrue(point.idx.equals(idx));
    }
  }
  
  @Test
  public void testRoutePointByStopPointIdx() {
    MSTransilienAPI api = new MSTransilienAPI();
    
    Integer idx = 33464;
    
    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(ActionRoutePointList.Params.StopPointIdx, idx);
    
    ActionRoutePointList action = api.list(params, ActionRoutePointList.class);
    RoutePointList list = action.getList();
    assertTrue(list.count==4);
    for(RoutePoint point:list.routePoints) {
      assertTrue(point.stopPoint.idx.equals(idx));
    }
  }
  
  @Test
  public void testRoutePointByStopAreaIdx() {
    MSTransilienAPI api = new MSTransilienAPI();
    
    Integer idx = 14430;
    
    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(ActionRoutePointList.Params.StopAreaIdx, idx);
    
    ActionRoutePointList action = api.list(params, ActionRoutePointList.class);
    RoutePointList list = action.getList();
    assertTrue(list.count==4);
    for(RoutePoint point:list.routePoints) {
      assertTrue(point.stopPoint.stopArea.idx.equals(idx));
    }
  }
}
