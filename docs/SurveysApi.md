# SurveysApi

All URIs are relative to *https://server.api.mailchimp.com/3.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateCampaign**](SurveysApi.md#generateCampaign) | **POST** /lists/{list_id}/surveys/{survey_id}/actions/create-email | Create a Survey Campaign |
| [**publishSurveyAction**](SurveysApi.md#publishSurveyAction) | **POST** /lists/{list_id}/surveys/{survey_id}/actions/publish | Publish a Survey |
| [**unpublishSurveyAction**](SurveysApi.md#unpublishSurveyAction) | **POST** /lists/{list_id}/surveys/{survey_id}/actions/unpublish | Unpublish a Survey |


<a name="generateCampaign"></a>
# **generateCampaign**
> SurveysGenerateCampaignResponse generateCampaign(listId, surveyId).execute();

Create a Survey Campaign

Utilize the List ID and Survey ID to generate a Campaign that links to your survey.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SurveysApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://server.api.mailchimp.com/3.0";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    Mailchimp client = new Mailchimp(configuration);
    String listId = "listId_example"; // The unique ID for the list.
    String surveyId = "surveyId_example"; // The ID of the survey.
    try {
      SurveysGenerateCampaignResponse result = client
              .surveys
              .generateCampaign(listId, surveyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getWebId());
      System.out.println(result.getParentCampaignId());
      System.out.println(result.getType());
      System.out.println(result.getCreateTime());
      System.out.println(result.getArchiveUrl());
      System.out.println(result.getLongArchiveUrl());
      System.out.println(result.getStatus());
      System.out.println(result.getEmailsSent());
      System.out.println(result.getSendTime());
      System.out.println(result.getContentType());
      System.out.println(result.getNeedsBlockRefresh());
      System.out.println(result.getResendable());
      System.out.println(result.getRecipients());
      System.out.println(result.getSettings());
      System.out.println(result.getVariateSettings());
      System.out.println(result.getTracking());
      System.out.println(result.getRssOpts());
      System.out.println(result.getAbSplitOpts());
      System.out.println(result.getSocialCard());
      System.out.println(result.getReportSummary());
      System.out.println(result.getDeliveryStatus());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling SurveysApi#generateCampaign");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SurveysGenerateCampaignResponse> response = client
              .surveys
              .generateCampaign(listId, surveyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SurveysApi#generateCampaign");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **surveyId** | **String**| The ID of the survey. | |

### Return type

[**SurveysGenerateCampaignResponse**](SurveysGenerateCampaignResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Campaign Instance |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="publishSurveyAction"></a>
# **publishSurveyAction**
> publishSurveyAction(listId, surveyId).execute();

Publish a Survey

Publish a survey that is in draft, unpublished, or has been previously published and edited.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SurveysApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://server.api.mailchimp.com/3.0";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    Mailchimp client = new Mailchimp(configuration);
    String listId = "listId_example"; // The unique ID for the list.
    String surveyId = "surveyId_example"; // The ID of the survey.
    try {
      client
              .surveys
              .publishSurveyAction(listId, surveyId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SurveysApi#publishSurveyAction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .surveys
              .publishSurveyAction(listId, surveyId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SurveysApi#publishSurveyAction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **surveyId** | **String**| The ID of the survey. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Survey Published |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="unpublishSurveyAction"></a>
# **unpublishSurveyAction**
> unpublishSurveyAction(listId, surveyId).execute();

Unpublish a Survey

Unpublish a survey that has been published.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SurveysApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://server.api.mailchimp.com/3.0";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    Mailchimp client = new Mailchimp(configuration);
    String listId = "listId_example"; // The unique ID for the list.
    String surveyId = "surveyId_example"; // The ID of the survey.
    try {
      client
              .surveys
              .unpublishSurveyAction(listId, surveyId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SurveysApi#unpublishSurveyAction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .surveys
              .unpublishSurveyAction(listId, surveyId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SurveysApi#unpublishSurveyAction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The unique ID for the list. | |
| **surveyId** | **String**| The ID of the survey. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Survey Instance |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

