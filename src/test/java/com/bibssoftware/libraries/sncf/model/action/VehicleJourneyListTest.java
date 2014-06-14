package com.bibssoftware.libraries.sncf.model.action;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.bibssoftware.libraries.sncf.api.MSTransilienAPI;
import com.bibssoftware.libraries.sncf.model.ModeType;
import com.bibssoftware.libraries.sncf.model.VehicleJourney;
import com.bibssoftware.libraries.sncf.model.list.VehicleJourneyList;

public class VehicleJourneyListTest {

  @Test
  public void testVehicleJourney() {
    MSTransilienAPI api = new MSTransilienAPI();

    String code = "DUA801";

    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(Action.Params.NetworkExternalCode, code);

    VehicleJourneyList list = api.list(params, ActionVehicleJourneyList.class).getList();
    assertTrue(list.count == 1000);

    params.put(ActionVehicleJourneyList.Params.StartTime, "10|00");
    params.put(ActionVehicleJourneyList.Params.EndTime, "11|00");

    list = api.list(params, ActionVehicleJourneyList.class).getList();
    assertTrue(list.count != 0);
  }

  @Test
  public void testVehicleJourneyByVehicleJourneyExternalCode() {
    MSTransilienAPI api = new MSTransilienAPI();

    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(Action.Params.VehicleJourneyExternalCode, "DUASN080999F01001");

    VehicleJourneyList list = api.list(params, ActionVehicleJourneyList.class).getList();
    assertTrue(list.count == 1);
  }

  @Test
  public void testVehicleJourneyByVehicleJourneyName() {
    MSTransilienAPI api = new MSTransilienAPI();

    String name = "ZEMA";

    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(ActionVehicleJourneyList.Params.VehicleJourneyName, name);

    VehicleJourneyList list = api.list(params, ActionVehicleJourneyList.class).getList();
    assertTrue(list.count  != 0);
    for(VehicleJourney journey:list.vehicleJourneys) {
      assertTrue(journey.name.equals(name));
    }
  }

  @Test
  public void testVehicleJourneyByStopAreaExternalCode() {
    MSTransilienAPI api = new MSTransilienAPI();

    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(Action.Params.StopAreaExternalCode, "DUA8775819");
    params.put(Action.Params.ModeTypeExternalCode, ModeType.Values.RapidTransit);

    ActionVehicleJourneyList action = api.list(params, ActionVehicleJourneyList.class);
    VehicleJourneyList list = action.getList();
    assertTrue(list.count > 500);
  }

  @Test
  public void testVehicleJourneyByRouteExternalCode() {
    MSTransilienAPI api = new MSTransilienAPI();

    String code = "DUA8108010461004";

    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(Action.Params.RouteExternalCode, code);

    VehicleJourneyList list = api.list(params, ActionVehicleJourneyList.class).getList();
    assertTrue(list.count > 100);
    for(VehicleJourney journey:list.vehicleJourneys) {
      assertTrue(journey.route.externalCode.equals(code));
    }
  }

  @Test
  public void testVehicleJourneyByLineExternalCode() {
    MSTransilienAPI api = new MSTransilienAPI();

    String code = "DUA810801046";

    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(Action.Params.LineExternalCode, code);

    VehicleJourneyList list = api.list(params, ActionVehicleJourneyList.class).getList();
    assertTrue(list.count > 200);
    for(VehicleJourney journey:list.vehicleJourneys) {
      assertTrue(journey.route.line.externalCode.equals(code));
    }
  }

  @Test
  public void testVehicleJourneyByNetworkExternalCode() {
    MSTransilienAPI api = new MSTransilienAPI();

    String code = "DUA801";

    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    params.put(Action.Params.NetworkExternalCode, code);

    VehicleJourneyList list = api.list(params, ActionVehicleJourneyList.class).getList();
    assertTrue(list.count == 1000);
    for(VehicleJourney journey:list.vehicleJourneys) {
      assertTrue(journey.route.line.network.externalCode.equals(code));
    }
  }
}
