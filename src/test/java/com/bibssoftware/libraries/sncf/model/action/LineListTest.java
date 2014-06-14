package com.bibssoftware.libraries.sncf.model.action;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.bibssoftware.libraries.sncf.api.MSTransilienAPI;
import com.bibssoftware.libraries.sncf.model.ModeType;
import com.bibssoftware.libraries.sncf.model.list.LineList;

public class LineListTest {

  @Test
  public void testLineList() {
    MSTransilienAPI api = new MSTransilienAPI();
    LineList list = api.list(null, ActionLineList.class).getList();
    assertTrue(list.count != 0);
  }

  @Test
  public void testLineByExternalCode() {
    MSTransilienAPI api = new MSTransilienAPI();

    String code = "DUA810801400";

    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(Action.Params.LineExternalCode, code);

    LineList list = api.list(params, ActionLineList.class).getList();
    assertTrue(list.count != 0);
    assertTrue(list.lines.get(0).externalCode.equals(code));
  }

  @Test
  public void testLineByModeTypeExternalCode() {
    MSTransilienAPI api = new MSTransilienAPI();

    String code = ModeType.Values.RapidTransit.name();

    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(Action.Params.ModeTypeExternalCode, code);

    LineList list = api.list(params, ActionLineList.class).getList();
    assertTrue(list.count != 0);
    assertTrue(list.lines.get(0).modeType.externalCode.equals(code));

  }

  @Test
  public void testLineByNetworkExternalCode() {
    MSTransilienAPI api = new MSTransilienAPI();

    String code = "DUA801";

    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(Action.Params.NetworkExternalCode, code);

    LineList list = api.list(params, ActionLineList.class).getList();
    assertTrue(list.count != 0);
    assertTrue(list.lines.get(0).network.externalCode.equals(code));
  }
}
