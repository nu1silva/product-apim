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
import org.wso2.carbon.apimgt.rest.integration.tests.store.model.Rating;
import org.wso2.carbon.apimgt.rest.integration.tests.store.model.RatingList;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RetrieveRatingApi {
    private ApiClient apiClient;

    public RetrieveRatingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RetrieveRatingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for apisApiIdRatingsGet
     *
     * @param apiId                   **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  (required)
     * @param limit                   Maximum size of resource array to return.  (optional, default to 25)
     * @param offset                  Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apisApiIdRatingsGetCall(String apiId, Integer limit, Integer offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apis/{apiId}/ratings"
                .replaceAll("\\{" + "apiId" + "\\}", apiClient.escapeString(apiId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (limit != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (offset != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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
    private com.squareup.okhttp.Call apisApiIdRatingsGetValidateBeforeCall(String apiId, Integer limit, Integer offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'apiId' is set
        if (apiId == null) {
            throw new ApiException("Missing the required parameter 'apiId' when calling apisApiIdRatingsGet(Async)");
        }


        com.squareup.okhttp.Call call = apisApiIdRatingsGetCall(apiId, limit, offset, progressListener, progressRequestListener);
        return call;


    }

    /**
     * Get the rating of an API.
     *
     * @param apiId  **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  (required)
     * @param limit  Maximum size of resource array to return.  (optional, default to 25)
     * @param offset Starting point within the complete list of items qualified.  (optional, default to 0)
     * @return RatingList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RatingList apisApiIdRatingsGet(String apiId, Integer limit, Integer offset) throws ApiException {
        ApiResponse<RatingList> resp = apisApiIdRatingsGetWithHttpInfo(apiId, limit, offset);
        return resp.getData();
    }

    /**
     * Get the rating of an API.
     *
     * @param apiId  **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  (required)
     * @param limit  Maximum size of resource array to return.  (optional, default to 25)
     * @param offset Starting point within the complete list of items qualified.  (optional, default to 0)
     * @return ApiResponse&lt;RatingList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RatingList> apisApiIdRatingsGetWithHttpInfo(String apiId, Integer limit, Integer offset) throws ApiException {
        com.squareup.okhttp.Call call = apisApiIdRatingsGetValidateBeforeCall(apiId, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<RatingList>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Get the rating of an API.
     *
     * @param apiId    **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  (required)
     * @param limit    Maximum size of resource array to return.  (optional, default to 25)
     * @param offset   Starting point within the complete list of items qualified.  (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apisApiIdRatingsGetAsync(String apiId, Integer limit, Integer offset, final ApiCallback<RatingList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = apisApiIdRatingsGetValidateBeforeCall(apiId, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RatingList>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    /**
     * Build call for apisApiIdRatingsRatingIdGet
     *
     * @param apiId                   **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  (required)
     * @param ratingId                Rating Id  (required)
     * @param ifNoneMatch             Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param ifModifiedSince         Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource.  (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apisApiIdRatingsRatingIdGetCall(String apiId, String ratingId, String ifNoneMatch, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apis/{apiId}/ratings/{ratingId}"
                .replaceAll("\\{" + "apiId" + "\\}", apiClient.escapeString(apiId.toString()))
                .replaceAll("\\{" + "ratingId" + "\\}", apiClient.escapeString(ratingId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null)
            localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));
        if (ifModifiedSince != null)
            localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

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
    private com.squareup.okhttp.Call apisApiIdRatingsRatingIdGetValidateBeforeCall(String apiId, String ratingId, String ifNoneMatch, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'apiId' is set
        if (apiId == null) {
            throw new ApiException("Missing the required parameter 'apiId' when calling apisApiIdRatingsRatingIdGet(Async)");
        }

        // verify the required parameter 'ratingId' is set
        if (ratingId == null) {
            throw new ApiException("Missing the required parameter 'ratingId' when calling apisApiIdRatingsRatingIdGet(Async)");
        }


        com.squareup.okhttp.Call call = apisApiIdRatingsRatingIdGetCall(apiId, ratingId, ifNoneMatch, ifModifiedSince, progressListener, progressRequestListener);
        return call;


    }

    /**
     * Get a specific rating of an API.
     *
     * @param apiId           **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  (required)
     * @param ratingId        Rating Id  (required)
     * @param ifNoneMatch     Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource.  (optional)
     * @return Rating
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Rating apisApiIdRatingsRatingIdGet(String apiId, String ratingId, String ifNoneMatch, String ifModifiedSince) throws ApiException {
        ApiResponse<Rating> resp = apisApiIdRatingsRatingIdGetWithHttpInfo(apiId, ratingId, ifNoneMatch, ifModifiedSince);
        return resp.getData();
    }

    /**
     * Get a specific rating of an API.
     *
     * @param apiId           **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  (required)
     * @param ratingId        Rating Id  (required)
     * @param ifNoneMatch     Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource.  (optional)
     * @return ApiResponse&lt;Rating&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Rating> apisApiIdRatingsRatingIdGetWithHttpInfo(String apiId, String ratingId, String ifNoneMatch, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = apisApiIdRatingsRatingIdGetValidateBeforeCall(apiId, ratingId, ifNoneMatch, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<Rating>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * (asynchronously)
     * Get a specific rating of an API.
     *
     * @param apiId           **API ID** consisting of the **UUID** of the API. The combination of the provider of the API, name of the API and the version is also accepted as a valid API ID. Should be formatted as **provider-name-version**.  (required)
     * @param ratingId        Rating Id  (required)
     * @param ifNoneMatch     Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resourec.  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource.  (optional)
     * @param callback        The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apisApiIdRatingsRatingIdGetAsync(String apiId, String ratingId, String ifNoneMatch, String ifModifiedSince, final ApiCallback<Rating> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = apisApiIdRatingsRatingIdGetValidateBeforeCall(apiId, ratingId, ifNoneMatch, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Rating>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
