package org.wso2.carbon.apimgt.rest.integration.tests.store.common;

import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.API;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.APIBusinessInformation;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.APICorsConfiguration;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.APIEndpointSecurity;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.APIMaxTps;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.Sequence;

import java.util.ArrayList;

public class SampleTestObjectCreator {

    public API createSampleAPI(String apiName, String apiContext, String apiVersion, String provider, String lcState) {
        org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.API body =
                new org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.API();
        if (body != null) {
            body.setApiDefinition("{ \t\"paths\": { \t\t\"/order\": { \t\t\t\"post\": { \t\t\t\t\"x-auth-type\": " +
                    "\"Application & Application User\", \t\t\t\t\"x-throttling-tier\": \"Unlimited\", \t\t\t\t\"description\":" +
                    " \"Create a new Order\", \t\t\t\t\"parameters\": [{ \t\t\t\t\t\"schema\": { \t\t\t\t\t\t\"$ref\"" +
                    ": \"#/definitions/Order\" \t\t\t\t\t}, \t\t\t\t\t\"description\": \"Order object that needs to be added\"," +
                    " \t\t\t\t\t\"name\": \"body\", \t\t\t\t\t\"required\": true, \t\t\t\t\t\"in\": \"body\" \t\t\t\t}]," +
                    " \t\t\t\t\"responses\": { \t\t\t\t\t\"201\": { \t\t\t\t\t\t\"headers\": { \t\t\t\t\t\t\t\"Location\"" +
                    ": { \t\t\t\t\t\t\t\t\"description\": \"The URL of the newly created resource.\", \t\t\t\t\t\t\t\t\"type" +
                    "\": \"string\" \t\t\t\t\t\t\t} \t\t\t\t\t\t}, \t\t\t\t\t\t\"schema\": { \t\t\t\t\t\t\t\"$ref\":" +
                    " \"#/definitions/Order\" \t\t\t\t\t\t}, \t\t\t\t\t\t\"description\": \"Created.\" \t\t\t\t\t} " +
                    "\t\t\t\t} \t\t\t} \t\t}, \t\t\"/menu\": { \t\t\t\"get\": { \t\t\t\t\"x-auth-type\": " +
                    "\"Application & Application User\", \t\t\t\t\"x-throttling-tier\": \"Unlimited\", " +
                    "\t\t\t\t\"description\": \"Return a list of available menu items\", \t\t\t\t\"parameters\":" +
                    " [], \t\t\t\t\"responses\": { \t\t\t\t\t\"200\": { \t\t\t\t\t\t\"headers\": {}, \t\t\t\t\t\t\"schema\":" +
                    " { \t\t\t\t\t\t\t\"title\": \"Menu\", \t\t\t\t\t\t\t\"properties\": { \t\t\t\t\t\t\t\t\"list\": " +
                    "{ \t\t\t\t\t\t\t\t\t\"items\": { \t\t\t\t\t\t\t\t\t\t\"$ref\": \"#/definitions/MenuItem\" " +
                    "\t\t\t\t\t\t\t\t\t}, \t\t\t\t\t\t\t\t\t\"type\": \"array\" \t\t\t\t\t\t\t\t} \t\t\t\t\t\t\t}, " +
                    "\t\t\t\t\t\t\t\"type\": \"object\" \t\t\t\t\t\t}, \t\t\t\t\t\t\"description\": \"OK.\" \t\t\t\t\t} " +
                    "\t\t\t\t} \t\t\t} \t\t} \t}, \t\"schemes\": [\"https\"], \t\"produces\": [\"application/json\"]," +
                    " \t\"swagger\": \"2.0\", \t\"definitions\": { \t\t\"MenuItem\": { \t\t\t\"title\": \"Pizza menu Item\", " +
                    "\t\t\t\"properties\": { \t\t\t\t\"price\": { \t\t\t\t\t\"type\": \"string\" \t\t\t\t}, \t\t\t\t\"description\":" +
                    " { \t\t\t\t\t\"type\": \"string\" \t\t\t\t}, \t\t\t\t\"name\": { \t\t\t\t\t\"type\": \"string\" \t\t\t\t}," +
                    " \t\t\t\t\"image\": { \t\t\t\t\t\"type\": \"string\" \t\t\t\t} \t\t\t}, \t\t\t\"required\": [\"name\"] \t\t}," +
                    " \t\t\"Order\": { \t\t\t\"title\": \"Pizza Order\", \t\t\t\"properties\": { \t\t\t\t\"customerName\": " +
                    "{ \t\t\t\t\t\"type\": \"string\" \t\t\t\t}, \t\t\t\t\"delivered\": { \t\t\t\t\t\"type\":" +
                    " \"boolean\" \t\t\t\t}, \t\t\t\t\"address\": { \t\t\t\t\t\"type\": \"string\" \t\t\t\t}," +
                    " \t\t\t\t\"pizzaType\": { \t\t\t\t\t\"type\": \"string\" \t\t\t\t}, \t\t\t\t\"creditCardNumber\":" +
                    " { \t\t\t\t\t\"type\": \"string\" \t\t\t\t}, \t\t\t\t\"quantity\": { \t\t\t\t\t\"type\": \"number\" \t\t\t\t}, " +
                    "\t\t\t\t\"orderId\": { \t\t\t\t\t\"type\": \"integer\" \t\t\t\t} \t\t\t}, \t\t\t\"required\": " +
                    "[\"orderId\"] \t\t} \t}, \t\"consumes\": [\"application/json\"], \t\"info\": { \t\t\"title\": " +
                    "\"PizzaShackAPI\", \t\t\"description\":" +
                    " \"This document describe a RESTFul API for Pizza Shack online pizza delivery store.\\n\", \t\t\"license\": " +
                    "{ \t\t\t\"name\": \"Apache 2.0\", \t\t\t\"url\": \"http://www.apache.org/licenses/LICENSE-2.0.html\" \t\t}, " +
                    "\t\t\"contact\": { \t\t\t\"email\": \"architecture@pizzashack.com\", \t\t\t\"name\": \"John Doe\", " +
                    "\t\t\t\"url\": \"http://www.pizzashack.com\" \t\t}, \t\t\"version\": \"1.0.0\" \t} }");
        }
        body.setName(apiName);
        body.setContext(apiContext);
        body.setVersion(apiVersion);
        body.setProvider(provider);
        body.setLifeCycleStatus(lcState);
        body.setTransport(new ArrayList<String>() {{
            add("http");
        }});
        body.setCacheTimeout(100);
        body.setPolicies(new ArrayList<String>() {{
            add("Unlimited");
        }});
        body.setVisibility(org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.API.VisibilityEnum.PUBLIC);
        body.setTags(new ArrayList<String>());
        body.setMaxTps(new APIMaxTps());
        body.setVisibleRoles(new ArrayList<String>());
        body.setVisibleTenants(new ArrayList<String>());
        body.setEndpointSecurity(new APIEndpointSecurity());
        body.setSequences(new ArrayList<Sequence>());
        body.setBusinessInformation(new APIBusinessInformation());
        body.setCorsConfiguration(new APICorsConfiguration());

        return body;
    }
}
