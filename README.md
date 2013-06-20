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

Getting the list of next departure times for a train station:

    TransilienAPI api = new TransilienAPI();
    Passages passages = api.nextTrain(87393009L);
    
Getting the list of next departure times for a train station to another

    TransilienAPI api = new TransilienAPI();
    Passages passages = api.nextTrain(87393009L, 87758847L);

##Licensing
sncf-java-api is licensed under the Apache 2.0 license, see the LICENSE file for more details
