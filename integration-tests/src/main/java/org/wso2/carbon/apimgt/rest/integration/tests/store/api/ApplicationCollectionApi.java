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
import org.wso2.carbon.apimgt.rest.integration.tests.store.model.ApplicationList;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationCollectionApi {
    private ApiClient apiClient;

    public ApplicationCollectionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ApplicationCollectionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for applicationsGet
     *
     * @param query                   **Search condition**.  You can search for an application by specifying the name as \&quot;query\&quot; attribute.  Eg. \&quot;app1\&quot; will match an application if the name is exactly \&quot;app1\&quot;.  Currently this does not support wildcards. Given name must exactly match the application name.  (optional)
     * @param limit                   Maximum size of resource array to return.  (optional, default to 25)
     * @param offset                  Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param ifNoneMatch             Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call applicationsGetCall(String query, Integer limit, Integer offset, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/applications";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (query != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
        if (limit != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (offset != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

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

        String[] localVarAuthNames = new String[]{"OAuth2Security"};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call applicationsGetValidateBeforeCall(String query, Integer limit, Integer offset, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {


        com.squareup.okhttp.Call call = applicationsGetCall(query, limit, offset, ifNoneMatch, progressListener, progressRequestListener);
        return call;


    }

    /**
     * Get a list of applications
     *
     * @param query       **Search condition**.  You can search for an application by specifying the name as \&quot;query\&quot; attribute.  Eg. \&quot;app1\&quot; will match an application if the name is exactly \&quot;app1\&quot;.  Currently this does not support wildcards. Given name must exactly match the application name.  (optional)
     * @param limit       Maximum size of resource array to return.  (optional, default to 25)
     * @param offset      Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @return ApplicationList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApplicationList applicationsGet(String query, Integer limit, Integer offset, String ifNoneMatch) throws ApiException {
        ApiResponse<ApplicationList> resp = applicationsGetWithHttpInfo(query, limit, offset, ifNoneMatch);
        return resp.getData();
    }

    /**
     * Get a list of applications
     *
     * @param query       **Search condition**.  You can search for an application by specifying the name as \&quot;query\&quot; attribute.  Eg. \&quot;app1\&quot; will match an application if the name is exactly \&quot;app1\&quot;.  Currently this does not support wildcards. Given name must exactly match the application name.  (optional)
     * @param limit       Maximum size of resource array to return.  (optional, default to 25)
     * @param offset      Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @return ApiResponse&lt;ApplicationList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApplicationList> applicationsGetWithHttpInfo(String query, Integer limit, Integer offset, String ifNoneMatch) throws ApiException {
        com.squareup.okhttp.Call call = applicationsGetValidateBeforeCall(query, limit, offset, ifNoneMatch, null, null);
        Type localVarReturnType = new TypeToken<ApplicationList>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Get a list of applications
     *
     * @param query       **Search condition**.  You can search for an application by specifying the name as \&quot;query\&quot; attribute.  Eg. \&quot;app1\&quot; will match an application if the name is exactly \&quot;app1\&quot;.  Currently this does not support wildcards. Given name must exactly match the application name.  (optional)
     * @param limit       Maximum size of resource array to return.  (optional, default to 25)
     * @param offset      Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param callback    The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call applicationsGetAsync(String query, Integer limit, Integer offset, String ifNoneMatch, final ApiCallback<ApplicationList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = applicationsGetValidateBeforeCall(query, limit, offset, ifNoneMatch, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApplicationList>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
