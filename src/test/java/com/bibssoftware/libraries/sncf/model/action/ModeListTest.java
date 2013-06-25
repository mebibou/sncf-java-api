package com.bibssoftware.libraries.sncf.model.action;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.bibssoftware.libraries.sncf.api.MSTransilienAPI;
import com.bibssoftware.libraries.sncf.model.ModeType;
import com.bibssoftware.libraries.sncf.model.list.ModeList;
import com.bibssoftware.libraries.sncf.model.list.ModeTypeList;

public class ModeListTest {

  @Test
  public void testModeList() {
    MSTransilienAPI api = new MSTransilienAPI();
    ModeList list = api.list(null, ActionModeList.class).getList();
    assertTrue(list.count==5);
  }
  
  /*@Test
   * does not work, external code expect values like 'ocetrain ter'
  public void testModeByExternalCode() {
    MSTransilienAPI api = new MSTransilienAPI();
    
    String code = "RER";
    
    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(Action.Params.ModeExternalCode, code);

    ModeList list = api.list(params, ActionModeList.class).getList();
    assertTrue(list.count==1);
    assertTrue(list.modes.get(0).externalCode.equals(code));
  }*/
  
  @Test
  public void testModeByModeTypeExternalCode() {
    MSTransilienAPI api = new MSTransilienAPI();
    
    String code = ModeType.Values.Tramway.name();
    
    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(Action.Params.ModeTypeExternalCode, code);

    ModeList list = api.list(params, ActionModeList.class).getList();
    assertTrue(list.count==1);
    assertTrue(list.modes.get(0).modeTypeExternalCode.equals(code));
  }
}
