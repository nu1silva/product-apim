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
import org.wso2.carbon.apimgt.rest.integration.tests.store.model.Rating;
import org.wso2.carbon.apimgt.rest.integration.tests.store.model.RatingList;

/**
 * API tests for RetrieveRatingApi
 */
public class RetrieveRatingApiTest {

    private final RetrieveRatingApi api = new RetrieveRatingApi();


    /**
     * Get the rating of an API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apisApiIdRatingsGetTest() throws ApiException {
        String apiId = null;
        Integer limit = null;
        Integer offset = null;
        RatingList response = api.apisApiIdRatingsGet(apiId, limit, offset);

        // TODO: test validations
    }

    /**
     * Get a specific rating of an API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apisApiIdRatingsRatingIdGetTest() throws ApiException {
        String apiId = null;
        String ratingId = null;
        String ifNoneMatch = null;
        String ifModifiedSince = null;
        Rating response = api.apisApiIdRatingsRatingIdGet(apiId, ratingId, ifNoneMatch, ifModifiedSince);

        // TODO: test validations
    }

}
