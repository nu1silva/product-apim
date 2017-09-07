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
import org.wso2.carbon.apimgt.rest.integration.tests.store.model.Tier;

/**
 * API tests for TierIndividualApi
 */
public class TierIndividualApiTest {

    private final TierIndividualApi api = new TierIndividualApi();


    /**
     * Get policy details
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void policiesTierLevelTierNameGetTest() throws ApiException {
        String tierName = null;
        String tierLevel = null;
        String ifNoneMatch = null;
        String ifModifiedSince = null;
        Tier response = api.policiesTierLevelTierNameGet(tierName, tierLevel, ifNoneMatch, ifModifiedSince);

        // TODO: test validations
    }

}