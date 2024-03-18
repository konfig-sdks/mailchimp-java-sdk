# CampaignsApi

All URIs are relative to *https://server.api.mailchimp.com/3.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addFeedback**](CampaignsApi.md#addFeedback) | **POST** /campaigns/{campaign_id}/feedback | Add campaign feedback |
| [**cancelSendAction**](CampaignsApi.md#cancelSendAction) | **POST** /campaigns/{campaign_id}/actions/cancel-send | Cancel campaign |
| [**createNewMailchimpCampaign**](CampaignsApi.md#createNewMailchimpCampaign) | **POST** /campaigns | Add campaign |
| [**getAll**](CampaignsApi.md#getAll) | **GET** /campaigns | List campaigns |
| [**getContent**](CampaignsApi.md#getContent) | **GET** /campaigns/{campaign_id}/content | Get campaign content |
| [**getFeedbackMessage**](CampaignsApi.md#getFeedbackMessage) | **GET** /campaigns/{campaign_id}/feedback/{feedback_id} | Get campaign feedback message |
| [**getInfo**](CampaignsApi.md#getInfo) | **GET** /campaigns/{campaign_id} | Get campaign info |
| [**getSendChecklist**](CampaignsApi.md#getSendChecklist) | **GET** /campaigns/{campaign_id}/send-checklist | Get campaign send checklist |
| [**listFeedback**](CampaignsApi.md#listFeedback) | **GET** /campaigns/{campaign_id}/feedback | List campaign feedback |
| [**pauseRssCampaign**](CampaignsApi.md#pauseRssCampaign) | **POST** /campaigns/{campaign_id}/actions/pause | Pause rss campaign |
| [**removeCampaign**](CampaignsApi.md#removeCampaign) | **DELETE** /campaigns/{campaign_id} | Delete campaign |
| [**removeFeedbackMessage**](CampaignsApi.md#removeFeedbackMessage) | **DELETE** /campaigns/{campaign_id}/feedback/{feedback_id} | Delete campaign feedback message |
| [**replicateAction**](CampaignsApi.md#replicateAction) | **POST** /campaigns/{campaign_id}/actions/replicate | Replicate campaign |
| [**resendAction**](CampaignsApi.md#resendAction) | **POST** /campaigns/{campaign_id}/actions/create-resend | Resend campaign |
| [**resumeRssCampaign**](CampaignsApi.md#resumeRssCampaign) | **POST** /campaigns/{campaign_id}/actions/resume | Resume rss campaign |
| [**scheduleDelivery**](CampaignsApi.md#scheduleDelivery) | **POST** /campaigns/{campaign_id}/actions/schedule | Schedule campaign |
| [**sendAction**](CampaignsApi.md#sendAction) | **POST** /campaigns/{campaign_id}/actions/send | Send campaign |
| [**sendTestEmail**](CampaignsApi.md#sendTestEmail) | **POST** /campaigns/{campaign_id}/actions/test | Send test email |
| [**setContent**](CampaignsApi.md#setContent) | **PUT** /campaigns/{campaign_id}/content | Set campaign content |
| [**unscheduleAction**](CampaignsApi.md#unscheduleAction) | **POST** /campaigns/{campaign_id}/actions/unschedule | Unschedule campaign |
| [**updateFeedbackMessage**](CampaignsApi.md#updateFeedbackMessage) | **PATCH** /campaigns/{campaign_id}/feedback/{feedback_id} | Update campaign feedback message |
| [**updateSettings**](CampaignsApi.md#updateSettings) | **PATCH** /campaigns/{campaign_id} | Update campaign settings |


<a name="addFeedback"></a>
# **addFeedback**
> CampaignsAddFeedbackResponse addFeedback(campaignId, campaignsAddFeedbackRequest).execute();

Add campaign feedback

Add feedback on a specific campaign.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignsApi;
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
    String message = "message_example"; // The content of the feedback.
    String campaignId = "campaignId_example"; // The unique id for the campaign.
    Integer blockId = 56; // The block id for the editable block that the feedback addresses.
    Boolean isComplete = true; // The status of feedback.
    try {
      CampaignsAddFeedbackResponse result = client
              .campaigns
              .addFeedback(message, campaignId)
              .blockId(blockId)
              .isComplete(isComplete)
              .execute();
      System.out.println(result);
      System.out.println(result.getFeedbackId());
      System.out.println(result.getParentId());
      System.out.println(result.getBlockId());
      System.out.println(result.getMessage());
      System.out.println(result.getIsComplete());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getSource());
      System.out.println(result.getCampaignId());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#addFeedback");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CampaignsAddFeedbackResponse> response = client
              .campaigns
              .addFeedback(message, campaignId)
              .blockId(blockId)
              .isComplete(isComplete)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#addFeedback");
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
| **campaignId** | **String**| The unique id for the campaign. | |
| **campaignsAddFeedbackRequest** | [**CampaignsAddFeedbackRequest**](CampaignsAddFeedbackRequest.md)|  | |

### Return type

[**CampaignsAddFeedbackResponse**](CampaignsAddFeedbackResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="cancelSendAction"></a>
# **cancelSendAction**
> cancelSendAction(campaignId).execute();

Cancel campaign

Cancel a Regular or Plain-Text Campaign after you send, before all of your recipients receive it. This feature is included with Mailchimp Pro.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignsApi;
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
    String campaignId = "campaignId_example"; // The unique id for the campaign.
    try {
      client
              .campaigns
              .cancelSendAction(campaignId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#cancelSendAction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .campaigns
              .cancelSendAction(campaignId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#cancelSendAction");
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
| **campaignId** | **String**| The unique id for the campaign. | |

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
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="createNewMailchimpCampaign"></a>
# **createNewMailchimpCampaign**
> CampaignsCreateNewMailchimpCampaignResponse createNewMailchimpCampaign(campaignsCreateNewMailchimpCampaignRequest).execute();

Add campaign

Create a new Mailchimp campaign.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignsApi;
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
    String type = "regular"; // There are four types of [campaigns](https://mailchimp.com/help/getting-started-with-campaigns/) you can create in Mailchimp. A/B Split campaigns have been deprecated and variate campaigns should be used instead.
    ListProperty1 recipients = new ListProperty1();
    CampaignSettingsProperty1 settings = new CampaignSettingsProperty1();
    ABTestOptionsProperty variateSettings = new ABTestOptionsProperty();
    CampaignTrackingOptionsProperty tracking = new CampaignTrackingOptionsProperty();
    RSSOptionsProperty rssOpts = new RSSOptionsProperty();
    CampaignSocialCardProperty socialCard = new CampaignSocialCardProperty();
    String contentType = "template"; // How the campaign's content is put together. The old drag and drop editor uses 'template' while the new editor uses 'multichannel'. Defaults to template.
    try {
      CampaignsCreateNewMailchimpCampaignResponse result = client
              .campaigns
              .createNewMailchimpCampaign(type)
              .recipients(recipients)
              .settings(settings)
              .variateSettings(variateSettings)
              .tracking(tracking)
              .rssOpts(rssOpts)
              .socialCard(socialCard)
              .contentType(contentType)
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
      System.out.println(result.getResendShortcutEligibility());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#createNewMailchimpCampaign");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CampaignsCreateNewMailchimpCampaignResponse> response = client
              .campaigns
              .createNewMailchimpCampaign(type)
              .recipients(recipients)
              .settings(settings)
              .variateSettings(variateSettings)
              .tracking(tracking)
              .rssOpts(rssOpts)
              .socialCard(socialCard)
              .contentType(contentType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#createNewMailchimpCampaign");
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
| **campaignsCreateNewMailchimpCampaignRequest** | [**CampaignsCreateNewMailchimpCampaignRequest**](CampaignsCreateNewMailchimpCampaignRequest.md)|  | |

### Return type

[**CampaignsCreateNewMailchimpCampaignResponse**](CampaignsCreateNewMailchimpCampaignResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="getAll"></a>
# **getAll**
> CampaignsGetAllResponse getAll().fields(fields).excludeFields(excludeFields).count(count).offset(offset).type(type).status(status).beforeSendTime(beforeSendTime).sinceSendTime(sinceSendTime).beforeCreateTime(beforeCreateTime).sinceCreateTime(sinceCreateTime).listId(listId).folderId(folderId).memberId(memberId).sortField(sortField).sortDir(sortDir).includeResendShortcutEligibility(includeResendShortcutEligibility).execute();

List campaigns

Get all campaigns in an account.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignsApi;
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
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    String type = "regular"; // The campaign type.
    String status = "save"; // The status of the campaign.
    OffsetDateTime beforeSendTime = OffsetDateTime.now(); // Restrict the response to campaigns sent before the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
    OffsetDateTime sinceSendTime = OffsetDateTime.now(); // Restrict the response to campaigns sent after the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
    OffsetDateTime beforeCreateTime = OffsetDateTime.now(); // Restrict the response to campaigns created before the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
    OffsetDateTime sinceCreateTime = OffsetDateTime.now(); // Restrict the response to campaigns created after the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
    String listId = "listId_example"; // The unique id for the list.
    String folderId = "folderId_example"; // The unique folder id.
    String memberId = "memberId_example"; // Retrieve campaigns sent to a particular list member. Member ID is The MD5 hash of the lowercase version of the list member’s email address.
    String sortField = "create_time"; // Returns files sorted by the specified field.
    String sortDir = "ASC"; // Determines the order direction for sorted results.
    Boolean includeResendShortcutEligibility = true; // Return the `resend_shortcut_eligibility` field in the response, which tells you if the campaign is eligible for the various Campaign Resend Shortcuts offered.
    try {
      CampaignsGetAllResponse result = client
              .campaigns
              .getAll()
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .type(type)
              .status(status)
              .beforeSendTime(beforeSendTime)
              .sinceSendTime(sinceSendTime)
              .beforeCreateTime(beforeCreateTime)
              .sinceCreateTime(sinceCreateTime)
              .listId(listId)
              .folderId(folderId)
              .memberId(memberId)
              .sortField(sortField)
              .sortDir(sortDir)
              .includeResendShortcutEligibility(includeResendShortcutEligibility)
              .execute();
      System.out.println(result);
      System.out.println(result.getCampaigns());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CampaignsGetAllResponse> response = client
              .campaigns
              .getAll()
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .type(type)
              .status(status)
              .beforeSendTime(beforeSendTime)
              .sinceSendTime(sinceSendTime)
              .beforeCreateTime(beforeCreateTime)
              .sinceCreateTime(sinceCreateTime)
              .listId(listId)
              .folderId(folderId)
              .memberId(memberId)
              .sortField(sortField)
              .sortDir(sortDir)
              .includeResendShortcutEligibility(includeResendShortcutEligibility)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#getAll");
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
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **type** | **String**| The campaign type. | [optional] [enum: regular, plaintext, absplit, rss, variate] |
| **status** | **String**| The status of the campaign. | [optional] [enum: save, paused, schedule, sending, sent] |
| **beforeSendTime** | **OffsetDateTime**| Restrict the response to campaigns sent before the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **sinceSendTime** | **OffsetDateTime**| Restrict the response to campaigns sent after the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **beforeCreateTime** | **OffsetDateTime**| Restrict the response to campaigns created before the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **sinceCreateTime** | **OffsetDateTime**| Restrict the response to campaigns created after the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **listId** | **String**| The unique id for the list. | [optional] |
| **folderId** | **String**| The unique folder id. | [optional] |
| **memberId** | **String**| Retrieve campaigns sent to a particular list member. Member ID is The MD5 hash of the lowercase version of the list member’s email address. | [optional] |
| **sortField** | **String**| Returns files sorted by the specified field. | [optional] [enum: create_time, send_time] |
| **sortDir** | **String**| Determines the order direction for sorted results. | [optional] [enum: ASC, DESC] |
| **includeResendShortcutEligibility** | **Boolean**| Return the &#x60;resend_shortcut_eligibility&#x60; field in the response, which tells you if the campaign is eligible for the various Campaign Resend Shortcuts offered. | [optional] |

### Return type

[**CampaignsGetAllResponse**](CampaignsGetAllResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="getContent"></a>
# **getContent**
> CampaignsGetContentResponse getContent(campaignId).fields(fields).excludeFields(excludeFields).execute();

Get campaign content

Get the the HTML and plain-text content for a campaign.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignsApi;
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
    String campaignId = "campaignId_example"; // The unique id for the campaign.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      CampaignsGetContentResponse result = client
              .campaigns
              .getContent(campaignId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getVariateContents());
      System.out.println(result.getPlainText());
      System.out.println(result.getHtml());
      System.out.println(result.getArchiveHtml());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#getContent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CampaignsGetContentResponse> response = client
              .campaigns
              .getContent(campaignId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#getContent");
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
| **campaignId** | **String**| The unique id for the campaign. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**CampaignsGetContentResponse**](CampaignsGetContentResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="getFeedbackMessage"></a>
# **getFeedbackMessage**
> CampaignsGetFeedbackMessageResponse getFeedbackMessage(campaignId, feedbackId).fields(fields).excludeFields(excludeFields).execute();

Get campaign feedback message

Get a specific feedback message from a campaign.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignsApi;
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
    String campaignId = "campaignId_example"; // The unique id for the campaign.
    String feedbackId = "feedbackId_example"; // The unique id for the feedback message.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      CampaignsGetFeedbackMessageResponse result = client
              .campaigns
              .getFeedbackMessage(campaignId, feedbackId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getFeedbackId());
      System.out.println(result.getParentId());
      System.out.println(result.getBlockId());
      System.out.println(result.getMessage());
      System.out.println(result.getIsComplete());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getSource());
      System.out.println(result.getCampaignId());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#getFeedbackMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CampaignsGetFeedbackMessageResponse> response = client
              .campaigns
              .getFeedbackMessage(campaignId, feedbackId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#getFeedbackMessage");
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
| **campaignId** | **String**| The unique id for the campaign. | |
| **feedbackId** | **String**| The unique id for the feedback message. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**CampaignsGetFeedbackMessageResponse**](CampaignsGetFeedbackMessageResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="getInfo"></a>
# **getInfo**
> CampaignsGetInfoResponse getInfo(campaignId).fields(fields).excludeFields(excludeFields).includeResendShortcutEligibility(includeResendShortcutEligibility).execute();

Get campaign info

Get information about a specific campaign.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignsApi;
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
    String campaignId = "campaignId_example"; // The unique id for the campaign.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Boolean includeResendShortcutEligibility = true; // Return the `resend_shortcut_eligibility` field in the response, which tells you if the campaign is eligible for the various Campaign Resend Shortcuts offered.
    try {
      CampaignsGetInfoResponse result = client
              .campaigns
              .getInfo(campaignId)
              .fields(fields)
              .excludeFields(excludeFields)
              .includeResendShortcutEligibility(includeResendShortcutEligibility)
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
      System.out.println(result.getResendShortcutEligibility());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#getInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CampaignsGetInfoResponse> response = client
              .campaigns
              .getInfo(campaignId)
              .fields(fields)
              .excludeFields(excludeFields)
              .includeResendShortcutEligibility(includeResendShortcutEligibility)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#getInfo");
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
| **campaignId** | **String**| The unique id for the campaign. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **includeResendShortcutEligibility** | **Boolean**| Return the &#x60;resend_shortcut_eligibility&#x60; field in the response, which tells you if the campaign is eligible for the various Campaign Resend Shortcuts offered. | [optional] |

### Return type

[**CampaignsGetInfoResponse**](CampaignsGetInfoResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="getSendChecklist"></a>
# **getSendChecklist**
> CampaignsGetSendChecklistResponse getSendChecklist(campaignId).fields(fields).excludeFields(excludeFields).execute();

Get campaign send checklist

Review the send checklist for a campaign, and resolve any issues before sending.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignsApi;
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
    String campaignId = "campaignId_example"; // The unique id for the campaign.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      CampaignsGetSendChecklistResponse result = client
              .campaigns
              .getSendChecklist(campaignId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getIsReady());
      System.out.println(result.getItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#getSendChecklist");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CampaignsGetSendChecklistResponse> response = client
              .campaigns
              .getSendChecklist(campaignId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#getSendChecklist");
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
| **campaignId** | **String**| The unique id for the campaign. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**CampaignsGetSendChecklistResponse**](CampaignsGetSendChecklistResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="listFeedback"></a>
# **listFeedback**
> CampaignsListFeedbackResponse listFeedback(campaignId).fields(fields).excludeFields(excludeFields).execute();

List campaign feedback

Get team feedback while you&#39;re working together on a Mailchimp campaign.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignsApi;
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
    String campaignId = "campaignId_example"; // The unique id for the campaign.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      CampaignsListFeedbackResponse result = client
              .campaigns
              .listFeedback(campaignId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getFeedback());
      System.out.println(result.getCampaignId());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#listFeedback");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CampaignsListFeedbackResponse> response = client
              .campaigns
              .listFeedback(campaignId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#listFeedback");
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
| **campaignId** | **String**| The unique id for the campaign. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**CampaignsListFeedbackResponse**](CampaignsListFeedbackResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="pauseRssCampaign"></a>
# **pauseRssCampaign**
> pauseRssCampaign(campaignId).execute();

Pause rss campaign

Pause an RSS-Driven campaign.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignsApi;
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
    String campaignId = "campaignId_example"; // The unique id for the campaign.
    try {
      client
              .campaigns
              .pauseRssCampaign(campaignId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#pauseRssCampaign");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .campaigns
              .pauseRssCampaign(campaignId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#pauseRssCampaign");
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
| **campaignId** | **String**| The unique id for the campaign. | |

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
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="removeCampaign"></a>
# **removeCampaign**
> removeCampaign(campaignId).execute();

Delete campaign

Remove a campaign from your Mailchimp account.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignsApi;
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
    String campaignId = "campaignId_example"; // The unique id for the campaign.
    try {
      client
              .campaigns
              .removeCampaign(campaignId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#removeCampaign");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .campaigns
              .removeCampaign(campaignId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#removeCampaign");
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
| **campaignId** | **String**| The unique id for the campaign. | |

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
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="removeFeedbackMessage"></a>
# **removeFeedbackMessage**
> removeFeedbackMessage(campaignId, feedbackId).execute();

Delete campaign feedback message

Remove a specific feedback message for a campaign.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignsApi;
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
    String campaignId = "campaignId_example"; // The unique id for the campaign.
    String feedbackId = "feedbackId_example"; // The unique id for the feedback message.
    try {
      client
              .campaigns
              .removeFeedbackMessage(campaignId, feedbackId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#removeFeedbackMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .campaigns
              .removeFeedbackMessage(campaignId, feedbackId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#removeFeedbackMessage");
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
| **campaignId** | **String**| The unique id for the campaign. | |
| **feedbackId** | **String**| The unique id for the feedback message. | |

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
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="replicateAction"></a>
# **replicateAction**
> CampaignsReplicateActionResponse replicateAction(campaignId).execute();

Replicate campaign

Replicate a campaign in saved or send status.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignsApi;
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
    String campaignId = "campaignId_example"; // The unique id for the campaign.
    try {
      CampaignsReplicateActionResponse result = client
              .campaigns
              .replicateAction(campaignId)
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
      System.err.println("Exception when calling CampaignsApi#replicateAction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CampaignsReplicateActionResponse> response = client
              .campaigns
              .replicateAction(campaignId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#replicateAction");
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
| **campaignId** | **String**| The unique id for the campaign. | |

### Return type

[**CampaignsReplicateActionResponse**](CampaignsReplicateActionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="resendAction"></a>
# **resendAction**
> CampaignsResendActionResponse resendAction(campaignId).campaignsResendActionRequest(campaignsResendActionRequest).execute();

Resend campaign

Remove the guesswork for resending a campaign to certain segments. You can use this endpoint as a shortcut to replicate a campaign and resend it to common segments, such as those who didn&#39;t open the campaign, or any new subscribers since it was sent.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignsApi;
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
    String campaignId = "campaignId_example"; // The unique id for the campaign.
    String shortcutType = "to_non_openers"; // Which campaign resend shortcut to use. Default is `to_non_openers`.
    try {
      CampaignsResendActionResponse result = client
              .campaigns
              .resendAction(campaignId)
              .shortcutType(shortcutType)
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
      System.err.println("Exception when calling CampaignsApi#resendAction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CampaignsResendActionResponse> response = client
              .campaigns
              .resendAction(campaignId)
              .shortcutType(shortcutType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#resendAction");
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
| **campaignId** | **String**| The unique id for the campaign. | |
| **campaignsResendActionRequest** | [**CampaignsResendActionRequest**](CampaignsResendActionRequest.md)|  | [optional] |

### Return type

[**CampaignsResendActionResponse**](CampaignsResendActionResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="resumeRssCampaign"></a>
# **resumeRssCampaign**
> resumeRssCampaign(campaignId).execute();

Resume rss campaign

Resume an RSS-Driven campaign.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignsApi;
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
    String campaignId = "campaignId_example"; // The unique id for the campaign.
    try {
      client
              .campaigns
              .resumeRssCampaign(campaignId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#resumeRssCampaign");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .campaigns
              .resumeRssCampaign(campaignId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#resumeRssCampaign");
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
| **campaignId** | **String**| The unique id for the campaign. | |

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
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="scheduleDelivery"></a>
# **scheduleDelivery**
> scheduleDelivery(campaignId, campaignsScheduleDeliveryRequest).execute();

Schedule campaign

Schedule a campaign for delivery. If you&#39;re using Multivariate Campaigns to test send times or sending RSS Campaigns, use the send action instead.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignsApi;
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
    OffsetDateTime scheduleTime = OffsetDateTime.now(); // The UTC date and time to schedule the campaign for delivery in ISO 8601 format. Campaigns may only be scheduled to send on the quarter-hour (:00, :15, :30, :45).
    String campaignId = "campaignId_example"; // The unique id for the campaign.
    Boolean timewarp = true; // Choose whether the campaign should use [Timewarp](https://mailchimp.com/help/use-timewarp/) when sending. Campaigns scheduled with Timewarp are localized based on the recipients' time zones. For example, a Timewarp campaign with a `schedule_time` of 13:00 will be sent to each recipient at 1:00pm in their local time. Cannot be set to `true` for campaigns using [Batch Delivery](https://mailchimp.com/help/schedule-batch-delivery/).
    BatchDeliveryProperty batchDelivery = new BatchDeliveryProperty();
    try {
      client
              .campaigns
              .scheduleDelivery(scheduleTime, campaignId)
              .timewarp(timewarp)
              .batchDelivery(batchDelivery)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#scheduleDelivery");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .campaigns
              .scheduleDelivery(scheduleTime, campaignId)
              .timewarp(timewarp)
              .batchDelivery(batchDelivery)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#scheduleDelivery");
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
| **campaignId** | **String**| The unique id for the campaign. | |
| **campaignsScheduleDeliveryRequest** | [**CampaignsScheduleDeliveryRequest**](CampaignsScheduleDeliveryRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="sendAction"></a>
# **sendAction**
> sendAction(campaignId).execute();

Send campaign

Send a Mailchimp campaign. For RSS Campaigns, the campaign will send according to its schedule. All other campaigns will send immediately.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignsApi;
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
    String campaignId = "campaignId_example"; // The unique id for the campaign.
    try {
      client
              .campaigns
              .sendAction(campaignId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#sendAction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .campaigns
              .sendAction(campaignId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#sendAction");
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
| **campaignId** | **String**| The unique id for the campaign. | |

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
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="sendTestEmail"></a>
# **sendTestEmail**
> sendTestEmail(campaignId, campaignsSendTestEmailRequest).execute();

Send test email

Send a test email.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignsApi;
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
    List<String> testEmails = Arrays.asList(); // An array of email addresses to send the test email to.
    String sendType = "html"; // Choose the type of test email to send.
    String campaignId = "campaignId_example"; // The unique id for the campaign.
    try {
      client
              .campaigns
              .sendTestEmail(testEmails, sendType, campaignId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#sendTestEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .campaigns
              .sendTestEmail(testEmails, sendType, campaignId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#sendTestEmail");
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
| **campaignId** | **String**| The unique id for the campaign. | |
| **campaignsSendTestEmailRequest** | [**CampaignsSendTestEmailRequest**](CampaignsSendTestEmailRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="setContent"></a>
# **setContent**
> CampaignsSetContentResponse setContent(campaignId, campaignsSetContentRequest).execute();

Set campaign content

Set the content for a campaign.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignsApi;
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
    String campaignId = "campaignId_example"; // The unique id for the campaign.
    String plainText = "plainText_example"; // The plain-text portion of the campaign. If left unspecified, we'll generate this automatically.
    String html = "html_example"; // The raw HTML for the campaign.
    String url = "url_example"; // When importing a campaign, the URL where the HTML lives.
    TemplateContentProperty template = new TemplateContentProperty();
    UploadArchiveProperty archive = new UploadArchiveProperty();
    List<VariateContentsPropertyInner> variateContents = Arrays.asList(); // Content options for [Multivariate Campaigns](https://mailchimp.com/help/about-multivariate-campaigns/). Each content option must provide HTML content and may optionally provide plain text. For campaigns not testing content, only one object should be provided.
    try {
      CampaignsSetContentResponse result = client
              .campaigns
              .setContent(campaignId)
              .plainText(plainText)
              .html(html)
              .url(url)
              .template(template)
              .archive(archive)
              .variateContents(variateContents)
              .execute();
      System.out.println(result);
      System.out.println(result.getVariateContents());
      System.out.println(result.getPlainText());
      System.out.println(result.getHtml());
      System.out.println(result.getArchiveHtml());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#setContent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CampaignsSetContentResponse> response = client
              .campaigns
              .setContent(campaignId)
              .plainText(plainText)
              .html(html)
              .url(url)
              .template(template)
              .archive(archive)
              .variateContents(variateContents)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#setContent");
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
| **campaignId** | **String**| The unique id for the campaign. | |
| **campaignsSetContentRequest** | [**CampaignsSetContentRequest**](CampaignsSetContentRequest.md)|  | |

### Return type

[**CampaignsSetContentResponse**](CampaignsSetContentResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="unscheduleAction"></a>
# **unscheduleAction**
> unscheduleAction(campaignId).execute();

Unschedule campaign

Unschedule a scheduled campaign that hasn&#39;t started sending.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignsApi;
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
    String campaignId = "campaignId_example"; // The unique id for the campaign.
    try {
      client
              .campaigns
              .unscheduleAction(campaignId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#unscheduleAction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .campaigns
              .unscheduleAction(campaignId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#unscheduleAction");
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
| **campaignId** | **String**| The unique id for the campaign. | |

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
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="updateFeedbackMessage"></a>
# **updateFeedbackMessage**
> CampaignsUpdateFeedbackMessageResponse updateFeedbackMessage(campaignId, feedbackId, campaignsUpdateFeedbackMessageRequest).execute();

Update campaign feedback message

Update a specific feedback message for a campaign.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignsApi;
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
    String campaignId = "campaignId_example"; // The unique id for the campaign.
    String feedbackId = "feedbackId_example"; // The unique id for the feedback message.
    Integer blockId = 56; // The block id for the editable block that the feedback addresses.
    String message = "message_example"; // The content of the feedback.
    Boolean isComplete = true; // The status of feedback.
    try {
      CampaignsUpdateFeedbackMessageResponse result = client
              .campaigns
              .updateFeedbackMessage(campaignId, feedbackId)
              .blockId(blockId)
              .message(message)
              .isComplete(isComplete)
              .execute();
      System.out.println(result);
      System.out.println(result.getFeedbackId());
      System.out.println(result.getParentId());
      System.out.println(result.getBlockId());
      System.out.println(result.getMessage());
      System.out.println(result.getIsComplete());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getSource());
      System.out.println(result.getCampaignId());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#updateFeedbackMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CampaignsUpdateFeedbackMessageResponse> response = client
              .campaigns
              .updateFeedbackMessage(campaignId, feedbackId)
              .blockId(blockId)
              .message(message)
              .isComplete(isComplete)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#updateFeedbackMessage");
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
| **campaignId** | **String**| The unique id for the campaign. | |
| **feedbackId** | **String**| The unique id for the feedback message. | |
| **campaignsUpdateFeedbackMessageRequest** | [**CampaignsUpdateFeedbackMessageRequest**](CampaignsUpdateFeedbackMessageRequest.md)|  | |

### Return type

[**CampaignsUpdateFeedbackMessageResponse**](CampaignsUpdateFeedbackMessageResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="updateSettings"></a>
# **updateSettings**
> CampaignsUpdateSettingsResponse updateSettings(campaignId, campaignsUpdateSettingsRequest).execute();

Update campaign settings

Update some or all of the settings for a specific campaign.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CampaignsApi;
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
    CampaignSettingsProperty2 settings = new CampaignSettingsProperty2();
    String campaignId = "campaignId_example"; // The unique id for the campaign.
    ListProperty2 recipients = new ListProperty2();
    ABTestOptionsProperty variateSettings = new ABTestOptionsProperty();
    CampaignTrackingOptionsProperty tracking = new CampaignTrackingOptionsProperty();
    RSSOptionsProperty1 rssOpts = new RSSOptionsProperty1();
    CampaignSocialCardProperty socialCard = new CampaignSocialCardProperty();
    try {
      CampaignsUpdateSettingsResponse result = client
              .campaigns
              .updateSettings(settings, campaignId)
              .recipients(recipients)
              .variateSettings(variateSettings)
              .tracking(tracking)
              .rssOpts(rssOpts)
              .socialCard(socialCard)
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
      System.out.println(result.getResendShortcutEligibility());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#updateSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CampaignsUpdateSettingsResponse> response = client
              .campaigns
              .updateSettings(settings, campaignId)
              .recipients(recipients)
              .variateSettings(variateSettings)
              .tracking(tracking)
              .rssOpts(rssOpts)
              .socialCard(socialCard)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#updateSettings");
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
| **campaignId** | **String**| The unique id for the campaign. | |
| **campaignsUpdateSettingsRequest** | [**CampaignsUpdateSettingsRequest**](CampaignsUpdateSettingsRequest.md)|  | |

### Return type

[**CampaignsUpdateSettingsResponse**](CampaignsUpdateSettingsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

