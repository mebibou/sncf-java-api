package com.bibssoftware.libraries.sncf.model.action;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.bibssoftware.libraries.sncf.api.MSTransilienAPI;
import com.bibssoftware.libraries.sncf.model.ModeType;
import com.bibssoftware.libraries.sncf.model.list.ModeTypeList;

public class ModeTypeListTest {

  @Test
  public void testModeTypeList() {
    MSTransilienAPI api = new MSTransilienAPI();
    ModeTypeList list = api.list(null, ActionModeTypeList.class).getList();
    assertTrue(list.count==3);
  }
  
  @Test
  public void testModeTypeByExternalCode() {
    MSTransilienAPI api = new MSTransilienAPI();
    
    String code = ModeType.Values.Tramway.name();
    
    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(Action.Params.ModeTypeExternalCode, code);

    ModeTypeList list = api.list(params, ActionModeTypeList.class).getList();
    assertTrue(list.count==1);
    assertTrue(list.modeTypes.get(0).externalCode.equals(code));
  }
}
