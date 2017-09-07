/*
 * WSO2 API Manager - Store
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Store.  It is written with [swagger 2](http://swagger.io/). 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.rest.integration.tests.store.api;

import org.testng.annotations.Test;
import org.wso2.carbon.apimgt.rest.integration.tests.store.ApiException;
import org.wso2.carbon.apimgt.rest.integration.tests.store.model.Application;
import org.wso2.carbon.apimgt.rest.integration.tests.store.model.Comment;
import org.wso2.carbon.apimgt.rest.integration.tests.store.model.Rating;
import org.wso2.carbon.apimgt.rest.integration.tests.store.model.Subscription;

/**
 * API tests for CreateApi
 */
public class CreateApiTest {

    private final CreateApi api = new CreateApi();


    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apisApiIdCommentsPostTest() throws ApiException {
        String apiId = null;
        Comment body = null;
        Comment response = api.apisApiIdCommentsPost(apiId, body);

        // TODO: test validations
    }

    /**
     * Adds or updates a rating
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apisApiIdUserRatingPutTest() throws ApiException {
        String apiId = null;
        Rating body = null;
        Rating response = api.apisApiIdUserRatingPut(apiId, body);

        // TODO: test validations
    }

    /**
     * Create a new application.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void applicationsPostTest() throws ApiException {
        Application body = null;
        Application response = api.applicationsPost(body);

        // TODO: test validations
    }

    /**
     * Add a new subscription
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void subscriptionsPostTest() throws ApiException {
        Subscription body = null;
        Subscription response = api.subscriptionsPost(body);

        // TODO: test validations
    }

}