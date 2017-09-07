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

import org.testng.Assert;
import org.testng.annotations.Test;
import org.wso2.carbon.apimgt.rest.integration.tests.store.ApiException;
import org.wso2.carbon.apimgt.rest.integration.tests.store.model.User;

import java.util.UUID;

/**
 * API tests for SignupApi
 */
public class SignupApiTest {

    private final SignupApi api = new SignupApi();


    /**
     * User self signup API
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void selfSignupPostTest() throws ApiException {
        String username = "ThisIs12333";
        String password = UUID.randomUUID().toString();
        String firstName = "fname";
        String lastname = "lname";
        String email = "test@example.com";
        User body = new User();
        body.setUsername(username);
        body.setEmail(email);
        body.setFirstName(firstName);
        body.setLastName(lastname);
        body.setPassword(password);
        User response = api.selfSignupPost(body);

        Assert.assertEquals(response.getUsername(), username);
        Assert.assertEquals(response.getPassword(), password);
        Assert.assertEquals(response.getEmail(), email);
    }

}
