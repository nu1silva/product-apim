/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: 0.10.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.wso2.carbon.apimgt.rest.integration.tests.publisher.api;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.ApiException;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.API;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.APIBusinessInformation;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.APICorsConfiguration;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.APIEndpointSecurity;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.APIList;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.APIMaxTps;
import org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.Sequence;

import java.io.File;
import java.util.ArrayList;

/**
 * API tests for APIIndividualApi
 */
public class APIIndividualApiIT {

    private final APIIndividualApi api = new APIIndividualApi();
    private final APICollectionApi apiSetup = new APICollectionApi();

    private String APIID = null;

    @BeforeClass
    public void beforeClass() throws ApiException {

        // Create an API for testing
        API body = new API();
        String contentType = "application/json";
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
        body.setName("IndivAPI");
        body.setContext("iapi");
        body.setVersion("1.0.0");
        body.setProvider("admin");
        body.setLifeCycleStatus("CREATED");
        body.setTransport(new ArrayList<String>() {{
            add("http");
        }});
        body.setCacheTimeout(100);
        body.setPolicies(new ArrayList<String>() {{
            add("Unlimited");
        }});
        body.setVisibility(API.VisibilityEnum.PUBLIC);
        body.setTags(new ArrayList<String>());
        body.setMaxTps(new APIMaxTps());
        body.setVisibleRoles(new ArrayList<String>());
        body.setVisibleTenants(new ArrayList<String>());
        body.setEndpointSecurity(new APIEndpointSecurity());
        body.setSequences(new ArrayList<Sequence>());
        body.setBusinessInformation(new APIBusinessInformation());
        body.setCorsConfiguration(new APICorsConfiguration());
        API response = apiSetup.apisPost(body, contentType);
        APIID = response.getId();
    }

    /**
     * Delete an API
     * <p>
     * This operation can be used to delete an existing API proving the Id of the API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test(dependsOnMethods = "apisApiIdGetTest", expectedExceptions = ApiException.class, enabled = true)
    public void apisApiIdDeleteTest() throws ApiException {
        String apiId = APIID;
        String ifMatch = null;
        String ifUnmodifiedSince = null;
        api.apisApiIdDelete(apiId, ifMatch, ifUnmodifiedSince);

        String accept = null;
        String ifNoneMatch = null;
        String ifModifiedSince = null;
        API response = api.apisApiIdGet(apiId, accept, ifNoneMatch, ifModifiedSince);
        // TODO - assert API not found
    }

    /**
     * Get gateway definition
     * <p>
     * This operation can be used to retrieve the gateway configuration of an API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test(dependsOnMethods = "apisApiIdGetTest", enabled = true)
    public void apisApiIdGatewayConfigGetTest() throws ApiException {
        String apiId = APIID;
        String accept = null;
        String ifNoneMatch = null;
        String ifModifiedSince = null;
        api.apisApiIdGatewayConfigGet(apiId, accept, ifNoneMatch, ifModifiedSince);

        // TODO: test validations return type void
    }

    /**
     * Update gateway configuration
     * <p>
     * This operation can be used to update the gateway configuration of an existing API. gateway configuration to be updated is passed as a form data parameter &#x60;gatewayConfig&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test(enabled = false)
    public void apisApiIdGatewayConfigPutTest() throws ApiException {
        String apiId = APIID;
        String gatewayConfig = null;
        String contentType = null;
        String ifMatch = null;
        String ifUnmodifiedSince = null;
        api.apisApiIdGatewayConfigPut(apiId, gatewayConfig, contentType, ifMatch, ifUnmodifiedSince);

        // TODO: test validations return type void
    }

    /**
     * Get details of an API
     * <p>
     * Using this operation, you can retrieve complete details of a single API. You need to provide the Id of the API to retrive it.
     *
     * @throws ApiException if the Api call fails
     */
    @Test(enabled = true)
    public void apisApiIdGetTest() throws ApiException {
        String apiId = APIID;
        String accept = null;
        String ifNoneMatch = null;
        String ifModifiedSince = null;
        API response = api.apisApiIdGet(apiId, accept, ifNoneMatch, ifModifiedSince);
        Assert.assertEquals(response.getName(), "IndivAPI", "API name mismatch");
    }

    /**
     * Update an API
     * <p>
     * This operation can be used to update an existing API. But the properties &#x60;name&#x60;, &#x60;version&#x60;, &#x60;context&#x60;, &#x60;provider&#x60;, &#x60;state&#x60; will not be changed by this operation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apisApiIdPutTest() throws ApiException {

        String newApiDescription = "New API Description";
        String apiId = APIID;
        API body = api.apisApiIdGet(APIID, null, null, null);
        body.setDescription(newApiDescription);
        String contentType = "application/json";
        String ifMatch = null;
        String ifUnmodifiedSince = null;
        API response = api.apisApiIdPut(apiId, body, contentType, ifMatch, ifUnmodifiedSince);
        Assert.assertEquals(response.getDescription(), newApiDescription, "description mismatch");
    }

    /**
     * Get swagger definition
     * <p>
     * This operation can be used to retrieve the swagger definition of an API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apisApiIdSwaggerGetTest() throws ApiException {
        String apiId = null;
        String accept = null;
        String ifNoneMatch = null;
        String ifModifiedSince = null;
        // api.apisApiIdSwaggerGet(apiId, accept, ifNoneMatch, ifModifiedSince);

        // TODO: test validations return type void
    }

    /**
     * Update swagger definition
     * <p>
     * This operation can be used to update the swagger definition of an existing API. Swagger definition to be updated is passed as a form data parameter &#x60;apiDefinition&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apisApiIdSwaggerPutTest() throws ApiException {
        String apiId = null;
        String apiDefinition = null;
        String contentType = null;
        String ifMatch = null;
        String ifUnmodifiedSince = null;
        // api.apisApiIdSwaggerPut(apiId, apiDefinition, contentType, ifMatch, ifUnmodifiedSince);

        // TODO: test validations
    }

    /**
     * Get thumbnail image
     * <p>
     * This operation can be used to download a thumbnail image of an API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apisApiIdThumbnailGetTest() throws ApiException {
        String apiId = APIID;
        String accept = null;
        String ifNoneMatch = null;
        String ifModifiedSince = null;
        api.apisApiIdThumbnailGet(apiId, accept, ifNoneMatch, ifModifiedSince);

        // TODO: test validations
    }

    /**
     * Upload a thumbnail image
     * <p>
     * This operation can be used to upload a thumbnail image of an API. The thumbnail to be uploaded should be given as a form data parameter &#x60;file&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apisApiIdThumbnailPostTest() throws ApiException {
        String apiId = null;
        File file = null;
        String contentType = null;
        String ifMatch = null;
        String ifUnmodifiedSince = null;
        // FileInfo response = api.apisApiIdThumbnailPost(apiId, file, contentType, ifMatch, ifUnmodifiedSince);

        // TODO: test validations
    }

    /**
     * Change API Status
     * <p>
     * This operation is used to change the lifecycle of an API. Eg: Publish an API which is in &#x60;CREATED&#x60; state. In order to change the lifecycle, we need to provide the lifecycle &#x60;action&#x60; as a query parameter.  For example, to Publish an API, &#x60;action&#x60; should be &#x60;Publish&#x60;.  Some actions supports providing additional paramters which should be provided as &#x60;lifecycleChecklist&#x60; parameter. Please see parameters table for more information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apisChangeLifecyclePostTest() throws ApiException {
        String action = null;
        String apiId = APIID;
        String lifecycleChecklist = null;
        String ifMatch = null;
        String ifUnmodifiedSince = null;
        API response;

        // Created --> Published
        api.apisChangeLifecyclePost("Published", apiId, null, null, null);
        response = api.apisApiIdGet(apiId, null, null, null);
        Assert.assertEquals("Published", response.getLifeCycleStatus(), "API status mismatch in Published state");

        // Published --> Prototyped
        api.apisChangeLifecyclePost("Prototyped", apiId, null, null, null);
        response = api.apisApiIdGet(apiId, null, null, null);
        Assert.assertEquals("Prototyped", response.getLifeCycleStatus(), "API status mismatch in Prototyped state");

        // Prototyped --> Published
        api.apisChangeLifecyclePost("Published", apiId, null, null, null);
        response = api.apisApiIdGet(apiId, null, null, null);
        Assert.assertEquals("Published", response.getLifeCycleStatus(), "API status mismatch in Published state");

        // Published --> Blocked
        api.apisChangeLifecyclePost("Blocked", apiId, null, null, null);
        response = api.apisApiIdGet(apiId, null, null, null);
        Assert.assertEquals("Blocked", response.getLifeCycleStatus(), "API status mismatch in Blocked state");

        // Blocked --> Deprecated
        api.apisChangeLifecyclePost("Deprecated", apiId, null, null, null);
        response = api.apisApiIdGet(apiId, null, null, null);
        Assert.assertEquals("Deprecated", response.getLifeCycleStatus(), "API status mismatch in Deprecated state");

        // Deprecated --> Retired
        api.apisChangeLifecyclePost("Retired", apiId, null, null, null);
        response = api.apisApiIdGet(apiId, null, null, null);
        Assert.assertEquals("Retired", response.getLifeCycleStatus(), "API status mismatch in Retired state");
    }

    /**
     * Create a new API version
     * <p>
     * This operation can be used to create a new version of an existing API. The new version is specified as &#x60;newVersion&#x60; query parameter. New API will be in &#x60;CREATED&#x60; state.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apisCopyApiPostTest() throws ApiException {
        String newVersion = "1.1.0";
        String apiId = APIID;
        api.apisCopyApiPost(newVersion, apiId);

        // TODO - needs search implementation to assert properly - comented.
        //APIList response = apiSetup.apisGet(1, 1, "version:1.1.0", null, null);
        //Assert.assertEquals(response.getList().get(0).getVersion(), newVersion, "API version mismatch on new API");
    }


    @AfterClass
    public void afterClass() throws ApiException {
        // remove IndivAPI version 1.1.0
        APIList response = apiSetup.apisGet(1, 1, null, null, null);
        api.apisApiIdDelete(response.getList().get(0).getId(), null, null);
    }
}