# AutomationsApi

All URIs are relative to *https://server.api.mailchimp.com/3.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addSubscriberToWorkflowEmail**](AutomationsApi.md#addSubscriberToWorkflowEmail) | **POST** /automations/{workflow_id}/emails/{workflow_email_id}/queue | Add subscriber to workflow email |
| [**archiveAction**](AutomationsApi.md#archiveAction) | **POST** /automations/{workflow_id}/actions/archive | Archive automation |
| [**classicAutomationSubscriberInfo**](AutomationsApi.md#classicAutomationSubscriberInfo) | **GET** /automations/{workflow_id}/emails/{workflow_email_id}/queue/{subscriber_hash} | Get automated email subscriber |
| [**createClassic**](AutomationsApi.md#createClassic) | **POST** /automations | Add automation |
| [**deleteWorkflowEmail**](AutomationsApi.md#deleteWorkflowEmail) | **DELETE** /automations/{workflow_id}/emails/{workflow_email_id} | Delete workflow email |
| [**getClassicWorkflowEmails**](AutomationsApi.md#getClassicWorkflowEmails) | **GET** /automations/{workflow_id}/emails | List automated emails |
| [**getClassicWorkflowInfo**](AutomationsApi.md#getClassicWorkflowInfo) | **GET** /automations/{workflow_id} | Get automation info |
| [**getEmailInfo**](AutomationsApi.md#getEmailInfo) | **GET** /automations/{workflow_id}/emails/{workflow_email_id} | Get workflow email info |
| [**getRemovedSubscriberInfo**](AutomationsApi.md#getRemovedSubscriberInfo) | **GET** /automations/{workflow_id}/removed-subscribers/{subscriber_hash} | Get subscriber removed from workflow |
| [**getRemovedSubscribers**](AutomationsApi.md#getRemovedSubscribers) | **GET** /automations/{workflow_id}/removed-subscribers | List subscribers removed from workflow |
| [**listQueueEmails**](AutomationsApi.md#listQueueEmails) | **GET** /automations/{workflow_id}/emails/{workflow_email_id}/queue | List automated email subscribers |
| [**listSummary**](AutomationsApi.md#listSummary) | **GET** /automations | List automations |
| [**pauseAutomatedEmail**](AutomationsApi.md#pauseAutomatedEmail) | **POST** /automations/{workflow_id}/emails/{workflow_email_id}/actions/pause | Pause automated email |
| [**pauseWorkflowEmails**](AutomationsApi.md#pauseWorkflowEmails) | **POST** /automations/{workflow_id}/actions/pause-all-emails | Pause automation emails |
| [**removeSubscriberFromWorkflow**](AutomationsApi.md#removeSubscriberFromWorkflow) | **POST** /automations/{workflow_id}/removed-subscribers | Remove subscriber from workflow |
| [**startAllEmails**](AutomationsApi.md#startAllEmails) | **POST** /automations/{workflow_id}/actions/start-all-emails | Start automation emails |
| [**startAutomatedEmail**](AutomationsApi.md#startAutomatedEmail) | **POST** /automations/{workflow_id}/emails/{workflow_email_id}/actions/start | Start automated email |
| [**updateWorkflowEmail**](AutomationsApi.md#updateWorkflowEmail) | **PATCH** /automations/{workflow_id}/emails/{workflow_email_id} | Update workflow email |


<a name="addSubscriberToWorkflowEmail"></a>
# **addSubscriberToWorkflowEmail**
> AutomationsAddSubscriberToWorkflowEmailResponse addSubscriberToWorkflowEmail(workflowId, workflowEmailId, automationsAddSubscriberToWorkflowEmailRequest).execute();

Add subscriber to workflow email

Manually add a subscriber to a workflow, bypassing the default trigger settings. You can also use this endpoint to trigger a series of automated emails in an API 3.0 workflow type.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutomationsApi;
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
    String emailAddress = "emailAddress_example"; // The list member's email address.
    String workflowId = "workflowId_example"; // The unique id for the Automation workflow.
    String workflowEmailId = "workflowEmailId_example"; // The unique id for the Automation workflow email.
    try {
      AutomationsAddSubscriberToWorkflowEmailResponse result = client
              .automations
              .addSubscriberToWorkflowEmail(emailAddress, workflowId, workflowEmailId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getWorkflowId());
      System.out.println(result.getEmailId());
      System.out.println(result.getListId());
      System.out.println(result.getListIsActive());
      System.out.println(result.getEmailAddress());
      System.out.println(result.getNextSend());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#addSubscriberToWorkflowEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AutomationsAddSubscriberToWorkflowEmailResponse> response = client
              .automations
              .addSubscriberToWorkflowEmail(emailAddress, workflowId, workflowEmailId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#addSubscriberToWorkflowEmail");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |
| **workflowEmailId** | **String**| The unique id for the Automation workflow email. | |
| **automationsAddSubscriberToWorkflowEmailRequest** | [**AutomationsAddSubscriberToWorkflowEmailRequest**](AutomationsAddSubscriberToWorkflowEmailRequest.md)|  | |

### Return type

[**AutomationsAddSubscriberToWorkflowEmailResponse**](AutomationsAddSubscriberToWorkflowEmailResponse.md)

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

<a name="archiveAction"></a>
# **archiveAction**
> archiveAction(workflowId).execute();

Archive automation

Archiving will permanently end your automation and keep the report data. You’ll be able to replicate your archived automation, but you can’t restart it.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutomationsApi;
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
    String workflowId = "workflowId_example"; // The unique id for the Automation workflow.
    try {
      client
              .automations
              .archiveAction(workflowId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#archiveAction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .automations
              .archiveAction(workflowId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#archiveAction");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |

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

<a name="classicAutomationSubscriberInfo"></a>
# **classicAutomationSubscriberInfo**
> AutomationsClassicAutomationSubscriberInfoResponse classicAutomationSubscriberInfo(workflowId, workflowEmailId, subscriberHash).execute();

Get automated email subscriber

Get information about a specific subscriber in a classic automation email queue.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutomationsApi;
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
    String workflowId = "workflowId_example"; // The unique id for the Automation workflow.
    String workflowEmailId = "workflowEmailId_example"; // The unique id for the Automation workflow email.
    String subscriberHash = "subscriberHash_example"; // The MD5 hash of the lowercase version of the list member's email address.
    try {
      AutomationsClassicAutomationSubscriberInfoResponse result = client
              .automations
              .classicAutomationSubscriberInfo(workflowId, workflowEmailId, subscriberHash)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getWorkflowId());
      System.out.println(result.getEmailId());
      System.out.println(result.getListId());
      System.out.println(result.getListIsActive());
      System.out.println(result.getEmailAddress());
      System.out.println(result.getNextSend());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#classicAutomationSubscriberInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AutomationsClassicAutomationSubscriberInfoResponse> response = client
              .automations
              .classicAutomationSubscriberInfo(workflowId, workflowEmailId, subscriberHash)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#classicAutomationSubscriberInfo");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |
| **workflowEmailId** | **String**| The unique id for the Automation workflow email. | |
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. | |

### Return type

[**AutomationsClassicAutomationSubscriberInfoResponse**](AutomationsClassicAutomationSubscriberInfoResponse.md)

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

<a name="createClassic"></a>
# **createClassic**
> AutomationsCreateClassicResponse createClassic(automationsCreateClassicRequest).execute();

Add automation

Create a new classic automation in your Mailchimp account.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutomationsApi;
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
    ListProperty recipients = new ListProperty();
    AutomationTriggerProperty triggerSettings = new AutomationTriggerProperty();
    AutomationCampaignSettingsProperty settings = new AutomationCampaignSettingsProperty();
    try {
      AutomationsCreateClassicResponse result = client
              .automations
              .createClassic(recipients, triggerSettings)
              .settings(settings)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCreateTime());
      System.out.println(result.getStartTime());
      System.out.println(result.getStatus());
      System.out.println(result.getEmailsSent());
      System.out.println(result.getRecipients());
      System.out.println(result.getSettings());
      System.out.println(result.getTracking());
      System.out.println(result.getTriggerSettings());
      System.out.println(result.getReportSummary());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#createClassic");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AutomationsCreateClassicResponse> response = client
              .automations
              .createClassic(recipients, triggerSettings)
              .settings(settings)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#createClassic");
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
| **automationsCreateClassicRequest** | [**AutomationsCreateClassicRequest**](AutomationsCreateClassicRequest.md)|  | |

### Return type

[**AutomationsCreateClassicResponse**](AutomationsCreateClassicResponse.md)

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

<a name="deleteWorkflowEmail"></a>
# **deleteWorkflowEmail**
> deleteWorkflowEmail(workflowId, workflowEmailId).execute();

Delete workflow email

Removes an individual classic automation workflow email. Emails from certain workflow types, including the Abandoned Cart Email (abandonedCart) and Product Retargeting Email (abandonedBrowse) Workflows, cannot be deleted.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutomationsApi;
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
    String workflowId = "workflowId_example"; // The unique id for the Automation workflow.
    String workflowEmailId = "workflowEmailId_example"; // The unique id for the Automation workflow email.
    try {
      client
              .automations
              .deleteWorkflowEmail(workflowId, workflowEmailId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#deleteWorkflowEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .automations
              .deleteWorkflowEmail(workflowId, workflowEmailId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#deleteWorkflowEmail");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |
| **workflowEmailId** | **String**| The unique id for the Automation workflow email. | |

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

<a name="getClassicWorkflowEmails"></a>
# **getClassicWorkflowEmails**
> AutomationsGetClassicWorkflowEmailsResponse getClassicWorkflowEmails(workflowId).execute();

List automated emails

Get a summary of the emails in a classic automation workflow.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutomationsApi;
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
    String workflowId = "workflowId_example"; // The unique id for the Automation workflow.
    try {
      AutomationsGetClassicWorkflowEmailsResponse result = client
              .automations
              .getClassicWorkflowEmails(workflowId)
              .execute();
      System.out.println(result);
      System.out.println(result.getEmails());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#getClassicWorkflowEmails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AutomationsGetClassicWorkflowEmailsResponse> response = client
              .automations
              .getClassicWorkflowEmails(workflowId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#getClassicWorkflowEmails");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |

### Return type

[**AutomationsGetClassicWorkflowEmailsResponse**](AutomationsGetClassicWorkflowEmailsResponse.md)

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

<a name="getClassicWorkflowInfo"></a>
# **getClassicWorkflowInfo**
> AutomationsGetClassicWorkflowInfoResponse getClassicWorkflowInfo(workflowId).fields(fields).excludeFields(excludeFields).execute();

Get automation info

Get a summary of an individual classic automation workflow&#39;s settings and content. The &#x60;trigger_settings&#x60; object returns information for the first email in the workflow.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutomationsApi;
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
    String workflowId = "workflowId_example"; // The unique id for the Automation workflow.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      AutomationsGetClassicWorkflowInfoResponse result = client
              .automations
              .getClassicWorkflowInfo(workflowId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCreateTime());
      System.out.println(result.getStartTime());
      System.out.println(result.getStatus());
      System.out.println(result.getEmailsSent());
      System.out.println(result.getRecipients());
      System.out.println(result.getSettings());
      System.out.println(result.getTracking());
      System.out.println(result.getTriggerSettings());
      System.out.println(result.getReportSummary());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#getClassicWorkflowInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AutomationsGetClassicWorkflowInfoResponse> response = client
              .automations
              .getClassicWorkflowInfo(workflowId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#getClassicWorkflowInfo");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**AutomationsGetClassicWorkflowInfoResponse**](AutomationsGetClassicWorkflowInfoResponse.md)

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

<a name="getEmailInfo"></a>
# **getEmailInfo**
> AutomationsGetEmailInfoResponse getEmailInfo(workflowId, workflowEmailId).execute();

Get workflow email info

Get information about an individual classic automation workflow email.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutomationsApi;
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
    String workflowId = "workflowId_example"; // The unique id for the Automation workflow.
    String workflowEmailId = "workflowEmailId_example"; // The unique id for the Automation workflow email.
    try {
      AutomationsGetEmailInfoResponse result = client
              .automations
              .getEmailInfo(workflowId, workflowEmailId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getWebId());
      System.out.println(result.getWorkflowId());
      System.out.println(result.getPosition());
      System.out.println(result.getDelay());
      System.out.println(result.getCreateTime());
      System.out.println(result.getStartTime());
      System.out.println(result.getArchiveUrl());
      System.out.println(result.getStatus());
      System.out.println(result.getEmailsSent());
      System.out.println(result.getSendTime());
      System.out.println(result.getContentType());
      System.out.println(result.getNeedsBlockRefresh());
      System.out.println(result.getHasLogoMergeTag());
      System.out.println(result.getRecipients());
      System.out.println(result.getSettings());
      System.out.println(result.getTracking());
      System.out.println(result.getSocialCard());
      System.out.println(result.getTriggerSettings());
      System.out.println(result.getReportSummary());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#getEmailInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AutomationsGetEmailInfoResponse> response = client
              .automations
              .getEmailInfo(workflowId, workflowEmailId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#getEmailInfo");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |
| **workflowEmailId** | **String**| The unique id for the Automation workflow email. | |

### Return type

[**AutomationsGetEmailInfoResponse**](AutomationsGetEmailInfoResponse.md)

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

<a name="getRemovedSubscriberInfo"></a>
# **getRemovedSubscriberInfo**
> AutomationsGetRemovedSubscriberInfoResponse getRemovedSubscriberInfo(workflowId, subscriberHash).execute();

Get subscriber removed from workflow

Get information about a specific subscriber who was removed from a classic automation workflow.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutomationsApi;
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
    String workflowId = "workflowId_example"; // The unique id for the Automation workflow.
    String subscriberHash = "subscriberHash_example"; // The MD5 hash of the lowercase version of the list member's email address.
    try {
      AutomationsGetRemovedSubscriberInfoResponse result = client
              .automations
              .getRemovedSubscriberInfo(workflowId, subscriberHash)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getWorkflowId());
      System.out.println(result.getListId());
      System.out.println(result.getEmailAddress());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#getRemovedSubscriberInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AutomationsGetRemovedSubscriberInfoResponse> response = client
              .automations
              .getRemovedSubscriberInfo(workflowId, subscriberHash)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#getRemovedSubscriberInfo");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. | |

### Return type

[**AutomationsGetRemovedSubscriberInfoResponse**](AutomationsGetRemovedSubscriberInfoResponse.md)

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

<a name="getRemovedSubscribers"></a>
# **getRemovedSubscribers**
> AutomationsGetRemovedSubscribersResponse getRemovedSubscribers(workflowId).execute();

List subscribers removed from workflow

Get information about subscribers who were removed from a classic automation workflow.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutomationsApi;
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
    String workflowId = "workflowId_example"; // The unique id for the Automation workflow.
    try {
      AutomationsGetRemovedSubscribersResponse result = client
              .automations
              .getRemovedSubscribers(workflowId)
              .execute();
      System.out.println(result);
      System.out.println(result.getWorkflowId());
      System.out.println(result.getSubscribers());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#getRemovedSubscribers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AutomationsGetRemovedSubscribersResponse> response = client
              .automations
              .getRemovedSubscribers(workflowId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#getRemovedSubscribers");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |

### Return type

[**AutomationsGetRemovedSubscribersResponse**](AutomationsGetRemovedSubscribersResponse.md)

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

<a name="listQueueEmails"></a>
# **listQueueEmails**
> AutomationsListQueueEmailsResponse listQueueEmails(workflowId, workflowEmailId).execute();

List automated email subscribers

Get information about a classic automation email queue.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutomationsApi;
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
    String workflowId = "workflowId_example"; // The unique id for the Automation workflow.
    String workflowEmailId = "workflowEmailId_example"; // The unique id for the Automation workflow email.
    try {
      AutomationsListQueueEmailsResponse result = client
              .automations
              .listQueueEmails(workflowId, workflowEmailId)
              .execute();
      System.out.println(result);
      System.out.println(result.getWorkflowId());
      System.out.println(result.getEmailId());
      System.out.println(result.getQueue());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#listQueueEmails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AutomationsListQueueEmailsResponse> response = client
              .automations
              .listQueueEmails(workflowId, workflowEmailId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#listQueueEmails");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |
| **workflowEmailId** | **String**| The unique id for the Automation workflow email. | |

### Return type

[**AutomationsListQueueEmailsResponse**](AutomationsListQueueEmailsResponse.md)

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

<a name="listSummary"></a>
# **listSummary**
> AutomationsListSummaryResponse listSummary().count(count).offset(offset).fields(fields).excludeFields(excludeFields).beforeCreateTime(beforeCreateTime).sinceCreateTime(sinceCreateTime).beforeStartTime(beforeStartTime).sinceStartTime(sinceStartTime).status(status).execute();

List automations

Get a summary of an account&#39;s classic automations.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutomationsApi;
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
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    OffsetDateTime beforeCreateTime = OffsetDateTime.now(); // Restrict the response to automations created before this time. Uses the ISO 8601 time format: 2015-10-21T15:41:36+00:00.
    OffsetDateTime sinceCreateTime = OffsetDateTime.now(); // Restrict the response to automations created after this time. Uses the ISO 8601 time format: 2015-10-21T15:41:36+00:00.
    OffsetDateTime beforeStartTime = OffsetDateTime.now(); // Restrict the response to automations started before this time. Uses the ISO 8601 time format: 2015-10-21T15:41:36+00:00.
    OffsetDateTime sinceStartTime = OffsetDateTime.now(); // Restrict the response to automations started after this time. Uses the ISO 8601 time format: 2015-10-21T15:41:36+00:00.
    String status = "save"; // Restrict the results to automations with the specified status.
    try {
      AutomationsListSummaryResponse result = client
              .automations
              .listSummary()
              .count(count)
              .offset(offset)
              .fields(fields)
              .excludeFields(excludeFields)
              .beforeCreateTime(beforeCreateTime)
              .sinceCreateTime(sinceCreateTime)
              .beforeStartTime(beforeStartTime)
              .sinceStartTime(sinceStartTime)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getAutomations());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#listSummary");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AutomationsListSummaryResponse> response = client
              .automations
              .listSummary()
              .count(count)
              .offset(offset)
              .fields(fields)
              .excludeFields(excludeFields)
              .beforeCreateTime(beforeCreateTime)
              .sinceCreateTime(sinceCreateTime)
              .beforeStartTime(beforeStartTime)
              .sinceStartTime(sinceStartTime)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#listSummary");
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
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **beforeCreateTime** | **OffsetDateTime**| Restrict the response to automations created before this time. Uses the ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **sinceCreateTime** | **OffsetDateTime**| Restrict the response to automations created after this time. Uses the ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **beforeStartTime** | **OffsetDateTime**| Restrict the response to automations started before this time. Uses the ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **sinceStartTime** | **OffsetDateTime**| Restrict the response to automations started after this time. Uses the ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **status** | **String**| Restrict the results to automations with the specified status. | [optional] [enum: save, paused, sending] |

### Return type

[**AutomationsListSummaryResponse**](AutomationsListSummaryResponse.md)

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

<a name="pauseAutomatedEmail"></a>
# **pauseAutomatedEmail**
> pauseAutomatedEmail(workflowId, workflowEmailId).execute();

Pause automated email

Pause an automated email.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutomationsApi;
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
    String workflowId = "workflowId_example"; // The unique id for the Automation workflow.
    String workflowEmailId = "workflowEmailId_example"; // The unique id for the Automation workflow email.
    try {
      client
              .automations
              .pauseAutomatedEmail(workflowId, workflowEmailId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#pauseAutomatedEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .automations
              .pauseAutomatedEmail(workflowId, workflowEmailId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#pauseAutomatedEmail");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |
| **workflowEmailId** | **String**| The unique id for the Automation workflow email. | |

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

<a name="pauseWorkflowEmails"></a>
# **pauseWorkflowEmails**
> pauseWorkflowEmails(workflowId).execute();

Pause automation emails

Pause all emails in a specific classic automation workflow.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutomationsApi;
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
    String workflowId = "workflowId_example"; // The unique id for the Automation workflow.
    try {
      client
              .automations
              .pauseWorkflowEmails(workflowId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#pauseWorkflowEmails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .automations
              .pauseWorkflowEmails(workflowId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#pauseWorkflowEmails");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |

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

<a name="removeSubscriberFromWorkflow"></a>
# **removeSubscriberFromWorkflow**
> AutomationsRemoveSubscriberFromWorkflowResponse removeSubscriberFromWorkflow(workflowId, automationsAddSubscriberToWorkflowEmailRequest).execute();

Remove subscriber from workflow

Remove a subscriber from a specific classic automation workflow. You can remove a subscriber at any point in an automation workflow, regardless of how many emails they&#39;ve been sent from that workflow. Once they&#39;re removed, they can never be added back to the same workflow.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutomationsApi;
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
    String emailAddress = "emailAddress_example"; // The list member's email address.
    String workflowId = "workflowId_example"; // The unique id for the Automation workflow.
    try {
      AutomationsRemoveSubscriberFromWorkflowResponse result = client
              .automations
              .removeSubscriberFromWorkflow(emailAddress, workflowId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getWorkflowId());
      System.out.println(result.getListId());
      System.out.println(result.getEmailAddress());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#removeSubscriberFromWorkflow");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AutomationsRemoveSubscriberFromWorkflowResponse> response = client
              .automations
              .removeSubscriberFromWorkflow(emailAddress, workflowId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#removeSubscriberFromWorkflow");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |
| **automationsAddSubscriberToWorkflowEmailRequest** | [**AutomationsAddSubscriberToWorkflowEmailRequest**](AutomationsAddSubscriberToWorkflowEmailRequest.md)|  | |

### Return type

[**AutomationsRemoveSubscriberFromWorkflowResponse**](AutomationsRemoveSubscriberFromWorkflowResponse.md)

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

<a name="startAllEmails"></a>
# **startAllEmails**
> startAllEmails(workflowId).execute();

Start automation emails

Start all emails in a classic automation workflow.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutomationsApi;
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
    String workflowId = "workflowId_example"; // The unique id for the Automation workflow.
    try {
      client
              .automations
              .startAllEmails(workflowId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#startAllEmails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .automations
              .startAllEmails(workflowId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#startAllEmails");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |

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

<a name="startAutomatedEmail"></a>
# **startAutomatedEmail**
> startAutomatedEmail(workflowId, workflowEmailId).execute();

Start automated email

Start an automated email.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutomationsApi;
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
    String workflowId = "workflowId_example"; // The unique id for the Automation workflow.
    String workflowEmailId = "workflowEmailId_example"; // The unique id for the Automation workflow email.
    try {
      client
              .automations
              .startAutomatedEmail(workflowId, workflowEmailId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#startAutomatedEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .automations
              .startAutomatedEmail(workflowId, workflowEmailId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#startAutomatedEmail");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |
| **workflowEmailId** | **String**| The unique id for the Automation workflow email. | |

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

<a name="updateWorkflowEmail"></a>
# **updateWorkflowEmail**
> AutomationsUpdateWorkflowEmailResponse updateWorkflowEmail(workflowId, workflowEmailId, automationsUpdateWorkflowEmailRequest).execute();

Update workflow email

Update settings for a classic automation workflow email.  Only works with workflows of type: abandonedBrowse, abandonedCart, emailFollowup, or singleWelcome.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AutomationsApi;
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
    String workflowId = "workflowId_example"; // The unique id for the Automation workflow.
    String workflowEmailId = "workflowEmailId_example"; // The unique id for the Automation workflow email.
    CampaignSettingsProperty settings = new CampaignSettingsProperty();
    AutomationDelayProperty delay = new AutomationDelayProperty();
    try {
      AutomationsUpdateWorkflowEmailResponse result = client
              .automations
              .updateWorkflowEmail(workflowId, workflowEmailId)
              .settings(settings)
              .delay(delay)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getWebId());
      System.out.println(result.getWorkflowId());
      System.out.println(result.getPosition());
      System.out.println(result.getDelay());
      System.out.println(result.getCreateTime());
      System.out.println(result.getStartTime());
      System.out.println(result.getArchiveUrl());
      System.out.println(result.getStatus());
      System.out.println(result.getEmailsSent());
      System.out.println(result.getSendTime());
      System.out.println(result.getContentType());
      System.out.println(result.getNeedsBlockRefresh());
      System.out.println(result.getHasLogoMergeTag());
      System.out.println(result.getRecipients());
      System.out.println(result.getSettings());
      System.out.println(result.getTracking());
      System.out.println(result.getSocialCard());
      System.out.println(result.getTriggerSettings());
      System.out.println(result.getReportSummary());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#updateWorkflowEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AutomationsUpdateWorkflowEmailResponse> response = client
              .automations
              .updateWorkflowEmail(workflowId, workflowEmailId)
              .settings(settings)
              .delay(delay)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#updateWorkflowEmail");
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
| **workflowId** | **String**| The unique id for the Automation workflow. | |
| **workflowEmailId** | **String**| The unique id for the Automation workflow email. | |
| **automationsUpdateWorkflowEmailRequest** | [**AutomationsUpdateWorkflowEmailRequest**](AutomationsUpdateWorkflowEmailRequest.md)|  | |

### Return type

[**AutomationsUpdateWorkflowEmailResponse**](AutomationsUpdateWorkflowEmailResponse.md)

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

