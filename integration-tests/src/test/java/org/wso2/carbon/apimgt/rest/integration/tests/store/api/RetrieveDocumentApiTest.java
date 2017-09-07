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
import org.wso2.carbon.apimgt.rest.integration.tests.store.model.Document;

/**
 * API tests for RetrieveDocumentApi
 */
public class RetrieveDocumentApiTest {

    private final RetrieveDocumentApi api = new RetrieveDocumentApi();


    /**
     * Downloads a FILE type document/get the inline content or source url of a certain document.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apisApiIdDocumentsDocumentIdContentGetTest() throws ApiException {
        String apiId = null;
        String documentId = null;
        String ifNoneMatch = null;
        String ifModifiedSince = null;
        api.apisApiIdDocumentsDocumentIdContentGet(apiId, documentId, ifNoneMatch, ifModifiedSince);

        // TODO: test validations
    }

    /**
     * Get a particular document associated with an API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apisApiIdDocumentsDocumentIdGetTest() throws ApiException {
        String apiId = null;
        String documentId = null;
        String ifNoneMatch = null;
        String ifModifiedSince = null;
        Document response = api.apisApiIdDocumentsDocumentIdGet(apiId, documentId, ifNoneMatch, ifModifiedSince);

        // TODO: test validations
    }

}