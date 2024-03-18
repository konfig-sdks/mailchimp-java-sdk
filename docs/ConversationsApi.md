# ConversationsApi

All URIs are relative to *https://server.api.mailchimp.com/3.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllConversations**](ConversationsApi.md#getAllConversations) | **GET** /conversations | List conversations |
| [**getById**](ConversationsApi.md#getById) | **GET** /conversations/{conversation_id} | Get conversation |
| [**getMessageById**](ConversationsApi.md#getMessageById) | **GET** /conversations/{conversation_id}/messages/{message_id} | Get message |
| [**listMessagesFromConversation**](ConversationsApi.md#listMessagesFromConversation) | **GET** /conversations/{conversation_id}/messages | List messages |


<a name="getAllConversations"></a>
# **getAllConversations**
> ConversationsGetAllConversationsResponse getAllConversations().fields(fields).excludeFields(excludeFields).count(count).offset(offset).hasUnreadMessages(hasUnreadMessages).listId(listId).campaignId(campaignId).execute();

List conversations

Get a list of conversations for the account. Conversations has been deprecated in favor of Inbox and these endpoints don&#39;t include Inbox data. Past Conversations are still available via this endpoint, but new campaign replies and other Inbox messages aren’t available using this endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String hasUnreadMessages = "true"; // Whether the conversation has any unread messages.
    String listId = "listId_example"; // The unique id for the list.
    String campaignId = "campaignId_example"; // The unique id for the campaign.
    try {
      ConversationsGetAllConversationsResponse result = client
              .conversations
              .getAllConversations()
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .hasUnreadMessages(hasUnreadMessages)
              .listId(listId)
              .campaignId(campaignId)
              .execute();
      System.out.println(result);
      System.out.println(result.getConversations());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#getAllConversations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConversationsGetAllConversationsResponse> response = client
              .conversations
              .getAllConversations()
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .hasUnreadMessages(hasUnreadMessages)
              .listId(listId)
              .campaignId(campaignId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#getAllConversations");
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
| **hasUnreadMessages** | **String**| Whether the conversation has any unread messages. | [optional] [enum: true, false] |
| **listId** | **String**| The unique id for the list. | [optional] |
| **campaignId** | **String**| The unique id for the campaign. | [optional] |

### Return type

[**ConversationsGetAllConversationsResponse**](ConversationsGetAllConversationsResponse.md)

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

<a name="getById"></a>
# **getById**
> ConversationsGetByIdResponse getById(conversationId).fields(fields).excludeFields(excludeFields).execute();

Get conversation

Get details about an individual conversation. Conversations has been deprecated in favor of Inbox and these endpoints don&#39;t include Inbox data. Past Conversations are still available via this endpoint, but new campaign replies and other Inbox messages aren’t available using this endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String conversationId = "conversationId_example"; // The unique id for the conversation.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      ConversationsGetByIdResponse result = client
              .conversations
              .getById(conversationId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getMessageCount());
      System.out.println(result.getCampaignId());
      System.out.println(result.getListId());
      System.out.println(result.getUnreadMessages());
      System.out.println(result.getFromLabel());
      System.out.println(result.getFromEmail());
      System.out.println(result.getSubject());
      System.out.println(result.getLastMessage());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConversationsGetByIdResponse> response = client
              .conversations
              .getById(conversationId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#getById");
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
| **conversationId** | **String**| The unique id for the conversation. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ConversationsGetByIdResponse**](ConversationsGetByIdResponse.md)

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

<a name="getMessageById"></a>
# **getMessageById**
> ConversationsGetMessageByIdResponse getMessageById(conversationId, messageId).fields(fields).excludeFields(excludeFields).execute();

Get message

Get an individual message in a conversation. Conversations has been deprecated in favor of Inbox and these endpoints don&#39;t include Inbox data. Past Conversations are still available via this endpoint, but new campaign replies and other Inbox messages aren’t available using this endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String conversationId = "conversationId_example"; // The unique id for the conversation.
    String messageId = "messageId_example"; // The unique id for the conversation message.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      ConversationsGetMessageByIdResponse result = client
              .conversations
              .getMessageById(conversationId, messageId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getConversationId());
      System.out.println(result.getListId());
      System.out.println(result.getFromLabel());
      System.out.println(result.getFromEmail());
      System.out.println(result.getSubject());
      System.out.println(result.getMessage());
      System.out.println(result.getRead());
      System.out.println(result.getTimestamp());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#getMessageById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConversationsGetMessageByIdResponse> response = client
              .conversations
              .getMessageById(conversationId, messageId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#getMessageById");
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
| **conversationId** | **String**| The unique id for the conversation. | |
| **messageId** | **String**| The unique id for the conversation message. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ConversationsGetMessageByIdResponse**](ConversationsGetMessageByIdResponse.md)

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

<a name="listMessagesFromConversation"></a>
# **listMessagesFromConversation**
> ConversationsListMessagesFromConversationResponse listMessagesFromConversation(conversationId).fields(fields).excludeFields(excludeFields).isRead(isRead).beforeTimestamp(beforeTimestamp).sinceTimestamp(sinceTimestamp).execute();

List messages

Get messages from a specific conversation. Conversations has been deprecated in favor of Inbox and these endpoints don&#39;t include Inbox data. Past Conversations are still available via this endpoint, but new campaign replies and other Inbox messages aren’t available using this endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConversationsApi;
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
    String conversationId = "conversationId_example"; // The unique id for the conversation.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    String isRead = "true"; // Whether a conversation message has been marked as read.
    OffsetDateTime beforeTimestamp = OffsetDateTime.now(); // Restrict the response to messages created before the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
    OffsetDateTime sinceTimestamp = OffsetDateTime.now(); // Restrict the response to messages created after the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
    try {
      ConversationsListMessagesFromConversationResponse result = client
              .conversations
              .listMessagesFromConversation(conversationId)
              .fields(fields)
              .excludeFields(excludeFields)
              .isRead(isRead)
              .beforeTimestamp(beforeTimestamp)
              .sinceTimestamp(sinceTimestamp)
              .execute();
      System.out.println(result);
      System.out.println(result.getConversationMessages());
      System.out.println(result.getConversationId());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#listMessagesFromConversation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConversationsListMessagesFromConversationResponse> response = client
              .conversations
              .listMessagesFromConversation(conversationId)
              .fields(fields)
              .excludeFields(excludeFields)
              .isRead(isRead)
              .beforeTimestamp(beforeTimestamp)
              .sinceTimestamp(sinceTimestamp)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#listMessagesFromConversation");
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
| **conversationId** | **String**| The unique id for the conversation. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **isRead** | **String**| Whether a conversation message has been marked as read. | [optional] [enum: true, false] |
| **beforeTimestamp** | **OffsetDateTime**| Restrict the response to messages created before the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **sinceTimestamp** | **OffsetDateTime**| Restrict the response to messages created after the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |

### Return type

[**ConversationsListMessagesFromConversationResponse**](ConversationsListMessagesFromConversationResponse.md)

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

