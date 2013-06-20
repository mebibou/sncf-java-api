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
    
##API Access

### [Next Train API (http://api.transilien.com/)](https://github.com/mebibou/sncf-java-api/wiki/Next-Train-API)
### [Micro Services API (http://ms.api.transilien.com/)](https://github.com/mebibou/sncf-java-api/wiki/Routes,-lines,-stations,-etc.-API)

##Licensing
sncf-java-api is licensed under the Apache 2.0 license, see the LICENSE file for more details
