sncf-java-api
=============

Java Wrapper for the sncf open data APIs. see http://test.data-sncf.com/

##How to build it

    # you need to set your login/password for the API access
    cd into the sncf-java-api folder
    vi src/main/resources/config.properties
    # update credentials and save
    mvn install
    cd target
    # you can find the latest sncf-java-api.jar file here
    
##Usage

### API http://api.transilien.com/ for the next departure times:

Getting the list of next departure times for a train station:

    TransilienAPI api = new TransilienAPI();
    Passages passages = api.nextTrain(87393009L);
    
Getting the list of next departure times for a train station to another

    TransilienAPI api = new TransilienAPI();
    Passages passages = api.nextTrain(87393009L, 87758847L);

### API http://ms.api.transilien.com/ for routes, lines, stations, etc. (WORK IN PROGRESS):

Getting the stops close to a point in space

    ActionProximityList action = new ActionProximityList();

    Map<ActionParam, Object> params = new HashMap<ActionParam, Object>();
    // can be StopPoint or StopArea
    params.put(ActionProximityList.Params.Type, "StopPoint");
    // proximity PARIS GARE DE LYON
    params.put(ActionProximityList.Params.X, "602697,00");
    params.put(ActionProximityList.Params.Y, "2427309,00");

    ProximityList list = action.execute(params);

Getting the list of routes

    ActionRouteList action = new ActionRouteList();
    RouteList list = action.execute(null);

to see the list of available parameters, check http://files.transilien.com/hackdays/Manuel_Integration_API_Microservice.pdf

##Licensing
sncf-java-api is licensed under the Apache 2.0 license, see the LICENSE file for more details
