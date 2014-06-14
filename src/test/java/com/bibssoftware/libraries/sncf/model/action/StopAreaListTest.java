package com.bibssoftware.libraries.sncf.model.action;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.bibssoftware.libraries.sncf.api.MSTransilienAPI;
import com.bibssoftware.libraries.sncf.model.ModeType;
import com.bibssoftware.libraries.sncf.model.StopArea;
import com.bibssoftware.libraries.sncf.model.list.StopAreaList;

public class StopAreaListTest {

  @Test
  public void testStopAreaList() {
    MSTransilienAPI api = new MSTransilienAPI();

    StopAreaList list = api.list(null, ActionStopAreaList.class).getList();
    assertTrue(list.count > 500);

    // restrict to main areas only
    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(ActionStopAreaList.Params.MainStopArea, true);
    list = api.list(params, ActionStopAreaList.class).getList();
    assertTrue(list.count > 400);

    // restrict to multi modal only
    params = new HashMap<ActionParam, Object>();
    params.put(ActionStopAreaList.Params.MultiModal, true);
    list = api.list(params, ActionStopAreaList.class).getList();
    assertTrue(list.count == 0);
  }

  @Test
  public void testStopAreaByExternalCode() {
    MSTransilienAPI api = new MSTransilienAPI();

    String code = "DUA8775820";

    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(Action.Params.StopAreaExternalCode, code);

    ActionStopAreaList action = api.list(params, ActionStopAreaList.class);
    StopAreaList list = action.getList();
    assertTrue(list.count == 1);
    for(StopArea point:list.stopAreas) {
      assertTrue(point.externalCode.equals(code));
    }
  }

  @Test
  public void testStopAreaByCityExternalCode() {
    MSTransilienAPI api = new MSTransilienAPI();

    String code = "94004";

    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(Action.Params.CityExternalCode, code);

    ActionStopAreaList action = api.list(params, ActionStopAreaList.class);
    StopAreaList list = action.getList();
    assertTrue(list.count == 1);
    for(StopArea point:list.stopAreas) {
      assertTrue(point.city.externalCode.equals(code));
    }
  }

  @Test
  public void testStopAreaByModeTypeExternalCode() {
    MSTransilienAPI api = new MSTransilienAPI();

    String code = ModeType.Values.Tramway.name();

    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(Action.Params.ModeTypeExternalCode, code);

    ActionStopAreaList action = api.list(params, ActionStopAreaList.class);
    StopAreaList list = action.getList();
    assertTrue(list.count != 0);
    /*for(StopArea point:list.stopAreas) {
      assertTrue(point.modeList.equals(code));
    }*/
  }
}
