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

import com.google.gson.reflect.TypeToken;
import org.wso2.carbon.apimgt.rest.integration.tests.store.ApiCallback;
import org.wso2.carbon.apimgt.rest.integration.tests.store.ApiClient;
import org.wso2.carbon.apimgt.rest.integration.tests.store.ApiException;
import org.wso2.carbon.apimgt.rest.integration.tests.store.ApiResponse;
import org.wso2.carbon.apimgt.rest.integration.tests.store.Configuration;
import org.wso2.carbon.apimgt.rest.integration.tests.store.Pair;
import org.wso2.carbon.apimgt.rest.integration.tests.store.ProgressRequestBody;
import org.wso2.carbon.apimgt.rest.integration.tests.store.ProgressResponseBody;
import org.wso2.carbon.apimgt.rest.integration.tests.store.model.APIList;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class APICollectionApi {
    private ApiClient apiClient;

    public APICollectionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public APICollectionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for apisGet
     *
     * @param limit                   Maximum size of resource array to return.  (optional, default to 25)
     * @param offset                  Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param query                   **Search condition**.  You can search in attributes by using an **\&quot;attribute:\&quot;** modifier.  Eg. \&quot;provider:wso2\&quot; will match an API if the provider of the API is exactly \&quot;wso2\&quot;.  Additionally you can use wildcards.  Eg. \&quot;provider:wso2*\&quot; will match an API if the provider of the API starts with \&quot;wso2\&quot;.  Supported attribute modifiers are [**version, context, lifeCycleStatus, description, subcontext, doc, provider, tag **]  If no advanced attribute modifier has been specified, search will match the given query string against API Name.  (optional)
     * @param ifNoneMatch             Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apisGetCall(Integer limit, Integer offset, String query, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apis";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (limit != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (offset != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
        if (query != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null)
            localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apisGetValidateBeforeCall(Integer limit, Integer offset, String query, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {


        com.squareup.okhttp.Call call = apisGetCall(limit, offset, query, ifNoneMatch, progressListener, progressRequestListener);
        return call;


    }

    /**
     * Retrieving APIs
     * Get a list of available APIs qualifying under a given search condition.
     *
     * @param limit       Maximum size of resource array to return.  (optional, default to 25)
     * @param offset      Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param query       **Search condition**.  You can search in attributes by using an **\&quot;attribute:\&quot;** modifier.  Eg. \&quot;provider:wso2\&quot; will match an API if the provider of the API is exactly \&quot;wso2\&quot;.  Additionally you can use wildcards.  Eg. \&quot;provider:wso2*\&quot; will match an API if the provider of the API starts with \&quot;wso2\&quot;.  Supported attribute modifiers are [**version, context, lifeCycleStatus, description, subcontext, doc, provider, tag **]  If no advanced attribute modifier has been specified, search will match the given query string against API Name.  (optional)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @return APIList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public APIList apisGet(Integer limit, Integer offset, String query, String ifNoneMatch) throws ApiException {
        ApiResponse<APIList> resp = apisGetWithHttpInfo(limit, offset, query, ifNoneMatch);
        return resp.getData();
    }

    /**
     * Retrieving APIs
     * Get a list of available APIs qualifying under a given search condition.
     *
     * @param limit       Maximum size of resource array to return.  (optional, default to 25)
     * @param offset      Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param query       **Search condition**.  You can search in attributes by using an **\&quot;attribute:\&quot;** modifier.  Eg. \&quot;provider:wso2\&quot; will match an API if the provider of the API is exactly \&quot;wso2\&quot;.  Additionally you can use wildcards.  Eg. \&quot;provider:wso2*\&quot; will match an API if the provider of the API starts with \&quot;wso2\&quot;.  Supported attribute modifiers are [**version, context, lifeCycleStatus, description, subcontext, doc, provider, tag **]  If no advanced attribute modifier has been specified, search will match the given query string against API Name.  (optional)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @return ApiResponse&lt;APIList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<APIList> apisGetWithHttpInfo(Integer limit, Integer offset, String query, String ifNoneMatch) throws ApiException {
        com.squareup.okhttp.Call call = apisGetValidateBeforeCall(limit, offset, query, ifNoneMatch, null, null);
        Type localVarReturnType = new TypeToken<APIList>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieving APIs  (asynchronously)
     * Get a list of available APIs qualifying under a given search condition.
     *
     * @param limit       Maximum size of resource array to return.  (optional, default to 25)
     * @param offset      Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param query       **Search condition**.  You can search in attributes by using an **\&quot;attribute:\&quot;** modifier.  Eg. \&quot;provider:wso2\&quot; will match an API if the provider of the API is exactly \&quot;wso2\&quot;.  Additionally you can use wildcards.  Eg. \&quot;provider:wso2*\&quot; will match an API if the provider of the API starts with \&quot;wso2\&quot;.  Supported attribute modifiers are [**version, context, lifeCycleStatus, description, subcontext, doc, provider, tag **]  If no advanced attribute modifier has been specified, search will match the given query string against API Name.  (optional)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param callback    The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apisGetAsync(Integer limit, Integer offset, String query, String ifNoneMatch, final ApiCallback<APIList> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apisGetValidateBeforeCall(limit, offset, query, ifNoneMatch, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<APIList>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
