package com.bibssoftware.libraries.sncf.api;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.bibssoftware.libraries.sncf.model.Proximity;
import com.bibssoftware.libraries.sncf.model.action.ActionParam;
import com.bibssoftware.libraries.sncf.model.action.ActionProximityList;
import com.bibssoftware.libraries.sncf.model.list.ProximityList;

public class MSTransilienAPITest {
  
  @Test
  public void testProximity() {
    MSTransilienAPI api = new MSTransilienAPI();
    
    float distance = 1000;
    float x = 602697;
    float y = 2427309;
    
    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(ActionProximityList.Params.Type, "StopPoint");
    // proximity PARIS GARE DE LYON
    params.put(ActionProximityList.Params.X, x);
    params.put(ActionProximityList.Params.Y, y);
    // default distance
    params.put(ActionProximityList.Params.Distance, distance);
    
    ActionProximityList action = api.list(params, ActionProximityList.class);
    ProximityList list = action.getList();
    assertTrue(list.count==6);
    for(Proximity proximity:list.proximities) {
      // proximity.distance must be under distance
      assertTrue(proximity.distance <= distance);
      
      // both x and y must have max distance as difference
      assertTrue(Math.abs(x - proximity.stopPoint.coordinates.x) <= distance);
      assertTrue(Math.abs(y - proximity.stopPoint.coordinates.y) <= distance);
    }
  }
  
}
