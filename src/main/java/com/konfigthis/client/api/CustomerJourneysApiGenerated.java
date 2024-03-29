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


import com.konfigthis.client.model.CustomerJourneysTriggerStepActionRequest;
import com.konfigthis.client.model.CustomerJourneysTriggerStepActiondefaultResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CustomerJourneysApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CustomerJourneysApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public CustomerJourneysApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call triggerStepActionCall(Integer journeyId, Integer stepId, CustomerJourneysTriggerStepActionRequest customerJourneysTriggerStepActionRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = customerJourneysTriggerStepActionRequest;

        // create path and map variables
        String localVarPath = "/customer-journeys/journeys/{journey_id}/steps/{step_id}/actions/trigger"
            .replace("{" + "journey_id" + "}", localVarApiClient.escapeString(journeyId.toString()))
            .replace("{" + "step_id" + "}", localVarApiClient.escapeString(stepId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json",
            "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call triggerStepActionValidateBeforeCall(Integer journeyId, Integer stepId, CustomerJourneysTriggerStepActionRequest customerJourneysTriggerStepActionRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'journeyId' is set
        if (journeyId == null) {
            throw new ApiException("Missing the required parameter 'journeyId' when calling triggerStepAction(Async)");
        }

        // verify the required parameter 'stepId' is set
        if (stepId == null) {
            throw new ApiException("Missing the required parameter 'stepId' when calling triggerStepAction(Async)");
        }

        // verify the required parameter 'customerJourneysTriggerStepActionRequest' is set
        if (customerJourneysTriggerStepActionRequest == null) {
            throw new ApiException("Missing the required parameter 'customerJourneysTriggerStepActionRequest' when calling triggerStepAction(Async)");
        }

        return triggerStepActionCall(journeyId, stepId, customerJourneysTriggerStepActionRequest, _callback);

    }


    private ApiResponse<Object> triggerStepActionWithHttpInfo(Integer journeyId, Integer stepId, CustomerJourneysTriggerStepActionRequest customerJourneysTriggerStepActionRequest) throws ApiException {
        okhttp3.Call localVarCall = triggerStepActionValidateBeforeCall(journeyId, stepId, customerJourneysTriggerStepActionRequest, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call triggerStepActionAsync(Integer journeyId, Integer stepId, CustomerJourneysTriggerStepActionRequest customerJourneysTriggerStepActionRequest, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = triggerStepActionValidateBeforeCall(journeyId, stepId, customerJourneysTriggerStepActionRequest, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class TriggerStepActionRequestBuilder {
        private final String emailAddress;
        private final Integer journeyId;
        private final Integer stepId;

        private TriggerStepActionRequestBuilder(String emailAddress, Integer journeyId, Integer stepId) {
            this.emailAddress = emailAddress;
            this.journeyId = journeyId;
            this.stepId = stepId;
        }

        /**
         * Build call for triggerStepAction
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> An empty response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error generated by the Mailchimp API. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            CustomerJourneysTriggerStepActionRequest customerJourneysTriggerStepActionRequest = buildBodyParams();
            return triggerStepActionCall(journeyId, stepId, customerJourneysTriggerStepActionRequest, _callback);
        }

        private CustomerJourneysTriggerStepActionRequest buildBodyParams() {
            CustomerJourneysTriggerStepActionRequest customerJourneysTriggerStepActionRequest = new CustomerJourneysTriggerStepActionRequest();
            customerJourneysTriggerStepActionRequest.emailAddress(this.emailAddress);
            return customerJourneysTriggerStepActionRequest;
        }

        /**
         * Execute triggerStepAction request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> An empty response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error generated by the Mailchimp API. </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            CustomerJourneysTriggerStepActionRequest customerJourneysTriggerStepActionRequest = buildBodyParams();
            ApiResponse<Object> localVarResp = triggerStepActionWithHttpInfo(journeyId, stepId, customerJourneysTriggerStepActionRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute triggerStepAction request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> An empty response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error generated by the Mailchimp API. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            CustomerJourneysTriggerStepActionRequest customerJourneysTriggerStepActionRequest = buildBodyParams();
            return triggerStepActionWithHttpInfo(journeyId, stepId, customerJourneysTriggerStepActionRequest);
        }

        /**
         * Execute triggerStepAction request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> An empty response </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> An error generated by the Mailchimp API. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            CustomerJourneysTriggerStepActionRequest customerJourneysTriggerStepActionRequest = buildBodyParams();
            return triggerStepActionAsync(journeyId, stepId, customerJourneysTriggerStepActionRequest, _callback);
        }
    }

    /**
     * Customer Journeys API trigger for a contact
     * A step trigger in a Customer Journey. To use it, create a starting point or step from the Customer Journey builder in the app using the Customer Journeys API condition. We’ll provide a url during the process that includes the {journey_id} and {step_id}. You’ll then be able to use this endpoint to trigger the condition for the posted contact.
     * @param journeyId The id for the Journey. (required)
     * @param stepId The id for the Step. (required)
     * @param customerJourneysTriggerStepActionRequest  (required)
     * @return TriggerStepActionRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> An empty response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An error generated by the Mailchimp API. </td><td>  -  </td></tr>
     </table>
     */
    public TriggerStepActionRequestBuilder triggerStepAction(String emailAddress, Integer journeyId, Integer stepId) throws IllegalArgumentException {
        if (emailAddress == null) throw new IllegalArgumentException("\"emailAddress\" is required but got null");
            

        if (journeyId == null) throw new IllegalArgumentException("\"journeyId\" is required but got null");
        if (stepId == null) throw new IllegalArgumentException("\"stepId\" is required but got null");
        return new TriggerStepActionRequestBuilder(emailAddress, journeyId, stepId);
    }
}
