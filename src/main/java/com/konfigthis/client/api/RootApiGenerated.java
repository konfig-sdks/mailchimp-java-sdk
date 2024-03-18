/*
 * Mailchimp Marketing API
 * Mailchimp is a marketing platform for small businesses. It offers an all-in-one marketing solution that includes email marketing, ads, landing pages, and automation. With Mailchimp, businesses can design and send targeted campaigns, analyze their performance, and grow their audience.
 *
 * The version of the OpenAPI document: 3.0.55
 * Contact: apihelp@mailchimp.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.RootListResources200Response;
import com.konfigthis.client.model.RootListResourcesResponse;
import com.konfigthis.client.model.RootListResourcesdefaultResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class RootApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public RootApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public RootApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call listResourcesCall(List<String> fields, List<String> excludeFields, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (fields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "fields", fields));
        }

        if (excludeFields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "exclude_fields", excludeFields));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listResourcesValidateBeforeCall(List<String> fields, List<String> excludeFields, final ApiCallback _callback) throws ApiException {
        return listResourcesCall(fields, excludeFields, _callback);

    }


    private ApiResponse<RootListResourcesResponse> listResourcesWithHttpInfo(List<String> fields, List<String> excludeFields) throws ApiException {
        okhttp3.Call localVarCall = listResourcesValidateBeforeCall(fields, excludeFields, null);
        Type localVarReturnType = new TypeToken<RootListResourcesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listResourcesAsync(List<String> fields, List<String> excludeFields, final ApiCallback<RootListResourcesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listResourcesValidateBeforeCall(fields, excludeFields, _callback);
        Type localVarReturnType = new TypeToken<RootListResourcesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListResourcesRequestBuilder {
        private List<String> fields;
        private List<String> excludeFields;

        private ListResourcesRequestBuilder() {
        }

        /**
         * Set fields
         * @param fields A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. (optional)
         * @return ListResourcesRequestBuilder
         */
        public ListResourcesRequestBuilder fields(List<String> fields) {
            this.fields = fields;
            return this;
        }
        
        /**
         * Set excludeFields
         * @param excludeFields A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. (optional)
         * @return ListResourcesRequestBuilder
         */
        public ListResourcesRequestBuilder excludeFields(List<String> excludeFields) {
            this.excludeFields = excludeFields;
            return this;
        }
        
        /**
         * Build call for listResources
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error generated by the Mailchimp API. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listResourcesCall(fields, excludeFields, _callback);
        }


        /**
         * Execute listResources request
         * @return RootListResourcesResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error generated by the Mailchimp API. </td><td>  -  </td></tr>
         </table>
         */
        public RootListResourcesResponse execute() throws ApiException {
            ApiResponse<RootListResourcesResponse> localVarResp = listResourcesWithHttpInfo(fields, excludeFields);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listResources request with HTTP info returned
         * @return ApiResponse&lt;RootListResourcesResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error generated by the Mailchimp API. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<RootListResourcesResponse> executeWithHttpInfo() throws ApiException {
            return listResourcesWithHttpInfo(fields, excludeFields);
        }

        /**
         * Execute listResources request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error generated by the Mailchimp API. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<RootListResourcesResponse> _callback) throws ApiException {
            return listResourcesAsync(fields, excludeFields, _callback);
        }
    }

    /**
     * List api root resources
     * Get links to all other resources available in the API.
     * @return ListResourcesRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An error generated by the Mailchimp API. </td><td>  -  </td></tr>
     </table>
     */
    public ListResourcesRequestBuilder listResources() throws IllegalArgumentException {
        return new ListResourcesRequestBuilder();
    }
}
