package com.bibssoftware.libraries.sncf.model.action;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.bibssoftware.libraries.sncf.api.MSTransilienAPI;
import com.bibssoftware.libraries.sncf.model.StopPoint;
import com.bibssoftware.libraries.sncf.model.list.StopPointList;

public class StopPointListTest {
  
  @Test
  public void testStopPointList() {
    MSTransilienAPI api = new MSTransilienAPI();
    
    ActionStopPointList action = api.list(null, ActionStopPointList.class);
    StopPointList list = action.getList();
    assertTrue(list.count>500);
  }
  
  @Test
  public void testStopPointByExternalCode() {
    MSTransilienAPI api = new MSTransilienAPI();
    
    String code = "DUA8775819";
    
    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(Action.Params.StopPointExternalCode, code);
    
    ActionStopPointList action = api.list(params, ActionStopPointList.class);
    StopPointList list = action.getList();
    assertTrue(list.count==1);
    for(StopPoint point:list.stopPoints) {
      assertTrue(point.externalCode.equals(code));
    }
  }
  
  @Test
  public void testStopPointByStopAreaExternalCode() {
    MSTransilienAPI api = new MSTransilienAPI();
    
    String code = "DUA8775819";
    
    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(Action.Params.StopAreaExternalCode, code);
    
    ActionStopPointList action = api.list(params, ActionStopPointList.class);
    StopPointList list = action.getList();
    assertTrue(list.count==1);
    for(StopPoint point:list.stopPoints) {
      assertTrue(point.stopArea.externalCode.equals(code));
    }
  }
}
