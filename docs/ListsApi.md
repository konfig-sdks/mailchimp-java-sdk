# ListsApi

All URIs are relative to *https://server.api.mailchimp.com/3.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addInterestCategory**](ListsApi.md#addInterestCategory) | **POST** /lists/{list_id}/interest-categories | Add interest category |
| [**addInterestInCategory**](ListsApi.md#addInterestInCategory) | **POST** /lists/{list_id}/interest-categories/{interest_category_id}/interests | Add interest in category |
| [**addMemberEvent**](ListsApi.md#addMemberEvent) | **POST** /lists/{list_id}/members/{subscriber_hash}/events | Add event |
| [**addMemberNote**](ListsApi.md#addMemberNote) | **POST** /lists/{list_id}/members/{subscriber_hash}/notes | Add member note |
| [**addMemberTags**](ListsApi.md#addMemberTags) | **POST** /lists/{list_id}/members/{subscriber_hash}/tags | Add or remove member tags |
| [**addMemberToList**](ListsApi.md#addMemberToList) | **POST** /lists/{list_id}/members | Add member to list |
| [**addMemberToSegment**](ListsApi.md#addMemberToSegment) | **POST** /lists/{list_id}/segments/{segment_id}/members | Add member to segment |
| [**addMergeField**](ListsApi.md#addMergeField) | **POST** /lists/{list_id}/merge-fields | Add merge field |
| [**addNewSegment**](ListsApi.md#addNewSegment) | **POST** /lists/{list_id}/segments | Add segment |
| [**addOrUpdateMember**](ListsApi.md#addOrUpdateMember) | **PUT** /lists/{list_id}/members/{subscriber_hash} | Add or update list member |
| [**archiveMember**](ListsApi.md#archiveMember) | **DELETE** /lists/{list_id}/members/{subscriber_hash} | Archive list member |
| [**batchAddRemoveMembers**](ListsApi.md#batchAddRemoveMembers) | **POST** /lists/{list_id}/segments/{segment_id} | Batch add or remove members |
| [**batchSubscribeOrUnsubscribe**](ListsApi.md#batchSubscribeOrUnsubscribe) | **POST** /lists/{list_id} | Batch subscribe or unsubscribe |
| [**createNewList**](ListsApi.md#createNewList) | **POST** /lists | Add list |
| [**createWebhook**](ListsApi.md#createWebhook) | **POST** /lists/{list_id}/webhooks | Add webhook |
| [**customizeSignupForm**](ListsApi.md#customizeSignupForm) | **POST** /lists/{list_id}/signup-forms | Customize signup form |
| [**deleteInterestCategory**](ListsApi.md#deleteInterestCategory) | **DELETE** /lists/{list_id}/interest-categories/{interest_category_id} | Delete interest category |
| [**deleteInterestInCategory**](ListsApi.md#deleteInterestInCategory) | **DELETE** /lists/{list_id}/interest-categories/{interest_category_id}/interests/{interest_id} | Delete interest in category |
| [**deleteList**](ListsApi.md#deleteList) | **DELETE** /lists/{list_id} | Delete list |
| [**deleteMergeField**](ListsApi.md#deleteMergeField) | **DELETE** /lists/{list_id}/merge-fields/{merge_id} | Delete merge field |
| [**deleteNote**](ListsApi.md#deleteNote) | **DELETE** /lists/{list_id}/members/{subscriber_hash}/notes/{note_id} | Delete note |
| [**deleteSegment**](ListsApi.md#deleteSegment) | **DELETE** /lists/{list_id}/segments/{segment_id} | Delete segment |
| [**deleteWebhook**](ListsApi.md#deleteWebhook) | **DELETE** /lists/{list_id}/webhooks/{webhook_id} | Delete webhook |
| [**getAbuseReport**](ListsApi.md#getAbuseReport) | **GET** /lists/{list_id}/abuse-reports/{report_id} | Get abuse report |
| [**getAllAbuseReports**](ListsApi.md#getAllAbuseReports) | **GET** /lists/{list_id}/abuse-reports | List abuse reports |
| [**getAllInfo**](ListsApi.md#getAllInfo) | **GET** /lists | Get lists info |
| [**getGrowthHistoryByMonth**](ListsApi.md#getGrowthHistoryByMonth) | **GET** /lists/{list_id}/growth-history/{month} | Get growth history by month |
| [**getGrowthHistoryData**](ListsApi.md#getGrowthHistoryData) | **GET** /lists/{list_id}/growth-history | List growth history data |
| [**getInterestCategoryInfo**](ListsApi.md#getInterestCategoryInfo) | **GET** /lists/{list_id}/interest-categories/{interest_category_id} | Get interest category info |
| [**getInterestInCategory**](ListsApi.md#getInterestInCategory) | **GET** /lists/{list_id}/interest-categories/{interest_category_id}/interests/{interest_id} | Get interest in category |
| [**getListInfo**](ListsApi.md#getListInfo) | **GET** /lists/{list_id} | Get list info |
| [**getLocations**](ListsApi.md#getLocations) | **GET** /lists/{list_id}/locations | List locations |
| [**getMemberEvents**](ListsApi.md#getMemberEvents) | **GET** /lists/{list_id}/members/{subscriber_hash}/events | List member events |
| [**getMemberGoals**](ListsApi.md#getMemberGoals) | **GET** /lists/{list_id}/members/{subscriber_hash}/goals | List member goal events |
| [**getMemberInfo**](ListsApi.md#getMemberInfo) | **GET** /lists/{list_id}/members/{subscriber_hash} | Get member info |
| [**getMemberNote**](ListsApi.md#getMemberNote) | **GET** /lists/{list_id}/members/{subscriber_hash}/notes/{note_id} | Get member note |
| [**getMemberNotes**](ListsApi.md#getMemberNotes) | **GET** /lists/{list_id}/members/{subscriber_hash}/notes | List recent member notes |
| [**getMemberTags**](ListsApi.md#getMemberTags) | **GET** /lists/{list_id}/members/{subscriber_hash}/tags | List member tags |
| [**getMembersInfo**](ListsApi.md#getMembersInfo) | **GET** /lists/{list_id}/members | List members info |
| [**getMergeFieldInfo**](ListsApi.md#getMergeFieldInfo) | **GET** /lists/{list_id}/merge-fields/{merge_id} | Get merge field |
| [**getRecentActivityStats**](ListsApi.md#getRecentActivityStats) | **GET** /lists/{list_id}/activity | List recent activity |
| [**getSegmentInfo**](ListsApi.md#getSegmentInfo) | **GET** /lists/{list_id}/segments/{segment_id} | Get segment info |
| [**getSegmentMembers**](ListsApi.md#getSegmentMembers) | **GET** /lists/{list_id}/segments/{segment_id}/members | List members in segment |
| [**getSegmentsInfo**](ListsApi.md#getSegmentsInfo) | **GET** /lists/{list_id}/segments | List segments |
| [**getSignupForms**](ListsApi.md#getSignupForms) | **GET** /lists/{list_id}/signup-forms | List signup forms |
| [**getSurveyDetails**](ListsApi.md#getSurveyDetails) | **GET** /lists/{list_id}/surveys/{survey_id} | Get survey |
| [**getSurveysInfo**](ListsApi.md#getSurveysInfo) | **GET** /lists/{list_id}/surveys | Get information about all surveys for a list |
| [**getWebhookInfo**](ListsApi.md#getWebhookInfo) | **GET** /lists/{list_id}/webhooks/{webhook_id} | Get webhook info |
| [**getWebhooksInfo**](ListsApi.md#getWebhooksInfo) | **GET** /lists/{list_id}/webhooks | List webhooks |
| [**listCategoryInterests**](ListsApi.md#listCategoryInterests) | **GET** /lists/{list_id}/interest-categories/{interest_category_id}/interests | List interests in category |
| [**listInterestCategories**](ListsApi.md#listInterestCategories) | **GET** /lists/{list_id}/interest-categories | List interest categories |
| [**listMergeFields**](ListsApi.md#listMergeFields) | **GET** /lists/{list_id}/merge-fields | List merge fields |
| [**listTopEmailClients**](ListsApi.md#listTopEmailClients) | **GET** /lists/{list_id}/clients | List top email clients |
| [**removeMemberFromSegment**](ListsApi.md#removeMemberFromSegment) | **DELETE** /lists/{list_id}/segments/{segment_id}/members/{subscriber_hash} | Remove list member from segment |
| [**removeMemberPermanent**](ListsApi.md#removeMemberPermanent) | **POST** /lists/{list_id}/members/{subscriber_hash}/actions/delete-permanent | Delete list member |
| [**searchTagsByName**](ListsApi.md#searchTagsByName) | **GET** /lists/{list_id}/tag-search | Search for tags on a list by name. |
| [**updateInterestCategory**](ListsApi.md#updateInterestCategory) | **PATCH** /lists/{list_id}/interest-categories/{interest_category_id} | Update interest category |
| [**updateInterestCategoryInterest**](ListsApi.md#updateInterestCategoryInterest) | **PATCH** /lists/{list_id}/interest-categories/{interest_category_id}/interests/{interest_id} | Update interest in category |
| [**updateMember**](ListsApi.md#updateMember) | **PATCH** /lists/{list_id}/members/{subscriber_hash} | Update list member |
| [**updateMergeField**](ListsApi.md#updateMergeField) | **PATCH** /lists/{list_id}/merge-fields/{merge_id} | Update merge field |
| [**updateNoteSpecificListMember**](ListsApi.md#updateNoteSpecificListMember) | **PATCH** /lists/{list_id}/members/{subscriber_hash}/notes/{note_id} | Update note |
| [**updateSegmentById**](ListsApi.md#updateSegmentById) | **PATCH** /lists/{list_id}/segments/{segment_id} | Update segment |
| [**updateSettings**](ListsApi.md#updateSettings) | **PATCH** /lists/{list_id} | Update lists |
| [**updateWebhookSettings**](ListsApi.md#updateWebhookSettings) | **PATCH** /lists/{list_id}/webhooks/{webhook_id} | Update webhook |
| [**viewRecentActivity**](ListsApi.md#viewRecentActivity) | **GET** /lists/{list_id}/members/{subscriber_hash}/activity-feed | View recent activity |
| [**viewRecentActivityEvents**](ListsApi.md#viewRecentActivityEvents) | **GET** /lists/{list_id}/members/{subscriber_hash}/activity | View recent activity 50 |


<a name="addInterestCategory"></a>
# **addInterestCategory**
> ListsAddInterestCategoryResponse addInterestCategory(listId, listsAddInterestCategoryRequest).execute();

Add interest category

Create a new interest category.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String title = "title_example"; // The text description of this category. This field appears on signup forms and is often phrased as a question.
    String type = "checkboxes"; // Determines how this category’s interests appear on signup forms.
    String listId = "listId_example"; // The unique ID for the list.
    Integer displayOrder = 56; // The order that the categories are displayed in the list. Lower numbers display first.
    try {
      ListsAddInterestCategoryResponse result = client
              .lists
              .addInterestCategory(title, type, listId)
              .displayOrder(displayOrder)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getListId());
      System.out.println(result.getId());
      System.out.println(result.getDisplayOrder());
      System.out.println(result.getType());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#addInterestCategory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsAddInterestCategoryResponse> response = client
              .lists
              .addInterestCategory(title, type, listId)
              .displayOrder(displayOrder)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#addInterestCategory");
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
| **listsAddInterestCategoryRequest** | [**ListsAddInterestCategoryRequest**](ListsAddInterestCategoryRequest.md)|  | |

### Return type

[**ListsAddInterestCategoryResponse**](ListsAddInterestCategoryResponse.md)

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

<a name="addInterestInCategory"></a>
# **addInterestInCategory**
> ListsAddInterestInCategoryResponse addInterestInCategory(listId, interestCategoryId, listsAddInterestInCategoryRequest).execute();

Add interest in category

Create a new interest or &#39;group name&#39; for a specific category.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String name = "name_example"; // The name of the interest. This can be shown publicly on a subscription form.
    String listId = "listId_example"; // The unique ID for the list.
    String interestCategoryId = "interestCategoryId_example"; // The unique ID for the interest category.
    Integer displayOrder = 56; // The display order for interests.
    try {
      ListsAddInterestInCategoryResponse result = client
              .lists
              .addInterestInCategory(name, listId, interestCategoryId)
              .displayOrder(displayOrder)
              .execute();
      System.out.println(result);
      System.out.println(result.getCategoryId());
      System.out.println(result.getListId());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getSubscriberCount());
      System.out.println(result.getDisplayOrder());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#addInterestInCategory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsAddInterestInCategoryResponse> response = client
              .lists
              .addInterestInCategory(name, listId, interestCategoryId)
              .displayOrder(displayOrder)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#addInterestInCategory");
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
| **interestCategoryId** | **String**| The unique ID for the interest category. | |
| **listsAddInterestInCategoryRequest** | [**ListsAddInterestInCategoryRequest**](ListsAddInterestInCategoryRequest.md)|  | |

### Return type

[**ListsAddInterestInCategoryResponse**](ListsAddInterestInCategoryResponse.md)

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

<a name="addMemberEvent"></a>
# **addMemberEvent**
> addMemberEvent(listId, subscriberHash, listsAddMemberEventRequest).execute();

Add event

Add an event for a list member.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String name = "name_example"; // The name for this type of event ('purchased', 'visited', etc). Must be 2-30 characters in length
    String listId = "listId_example"; // The unique ID for the list.
    String subscriberHash = "subscriberHash_example"; // The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
    Map<String, String> properties = new HashMap(); // An optional list of properties
    Boolean isSyncing = true; // Events created with the is_syncing value set to `true` will not trigger automations.
    OffsetDateTime occurredAt = OffsetDateTime.now(); // The date and time the event occurred in ISO 8601 format.
    try {
      client
              .lists
              .addMemberEvent(name, listId, subscriberHash)
              .properties(properties)
              .isSyncing(isSyncing)
              .occurredAt(occurredAt)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#addMemberEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .lists
              .addMemberEvent(name, listId, subscriberHash)
              .properties(properties)
              .isSyncing(isSyncing)
              .occurredAt(occurredAt)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#addMemberEvent");
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
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. | |
| **listsAddMemberEventRequest** | [**ListsAddMemberEventRequest**](ListsAddMemberEventRequest.md)|  | |

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

<a name="addMemberNote"></a>
# **addMemberNote**
> ListsAddMemberNoteResponse addMemberNote(listId, subscriberHash, listsAddMemberNoteRequest).execute();

Add member note

Add a new note for a specific subscriber.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String subscriberHash = "subscriberHash_example"; // The MD5 hash of the lowercase version of the list member's email address.
    String note = "note_example"; // The content of the note. Note length is limited to 1,000 characters.
    try {
      ListsAddMemberNoteResponse result = client
              .lists
              .addMemberNote(listId, subscriberHash)
              .note(note)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getNote());
      System.out.println(result.getListId());
      System.out.println(result.getEmailId());
      System.out.println(result.getContactId());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#addMemberNote");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsAddMemberNoteResponse> response = client
              .lists
              .addMemberNote(listId, subscriberHash)
              .note(note)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#addMemberNote");
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
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. | |
| **listsAddMemberNoteRequest** | [**ListsAddMemberNoteRequest**](ListsAddMemberNoteRequest.md)|  | |

### Return type

[**ListsAddMemberNoteResponse**](ListsAddMemberNoteResponse.md)

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

<a name="addMemberTags"></a>
# **addMemberTags**
> addMemberTags(listId, subscriberHash, listsAddMemberTagsRequest).execute();

Add or remove member tags

Add or remove tags from a list member. If a tag that does not exist is passed in and set as &#39;active&#39;, a new tag will be created.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    List<MemberTag> tags = Arrays.asList(); // A list of tags assigned to the list member.
    String listId = "listId_example"; // The unique ID for the list.
    String subscriberHash = "subscriberHash_example"; // The MD5 hash of the lowercase version of the list member's email address.
    Boolean isSyncing = true; // When is_syncing is true, automations based on the tags in the request will not fire
    try {
      client
              .lists
              .addMemberTags(tags, listId, subscriberHash)
              .isSyncing(isSyncing)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#addMemberTags");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .lists
              .addMemberTags(tags, listId, subscriberHash)
              .isSyncing(isSyncing)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#addMemberTags");
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
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. | |
| **listsAddMemberTagsRequest** | [**ListsAddMemberTagsRequest**](ListsAddMemberTagsRequest.md)|  | |

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

<a name="addMemberToList"></a>
# **addMemberToList**
> ListsAddMemberToListResponse addMemberToList(listId, listsAddMemberToListRequest).skipMergeValidation(skipMergeValidation).execute();

Add member to list

Add a new member to the list.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String emailAddress = "emailAddress_example"; // Email address for a subscriber.
    String status = "subscribed"; // Subscriber's current status.
    String listId = "listId_example"; // The unique ID for the list.
    List<String> tags = Arrays.asList(); // The tags that are associated with a member.
    String emailType = "emailType_example"; // Type of email this member asked to get ('html' or 'text').
    Map<String, Object> mergeFields = new HashMap(); // A dictionary of merge fields where the keys are the merge tags. See the [Merge Fields documentation](https://mailchimp.com/developer/marketing/docs/merge-fields/#structure) for more about the structure.
    Map<String, Boolean> interests = new HashMap(); // The key of this object's properties is the ID of the interest in question.
    String language = "language_example"; // If set/detected, the [subscriber's language](https://mailchimp.com/help/view-and-edit-contact-languages/).
    Boolean vip = true; // [VIP status](https://mailchimp.com/help/designate-and-send-to-vip-contacts/) for subscriber.
    LocationProperty location = new LocationProperty();
    List<MarketingPermission> marketingPermissions = Arrays.asList(); // The marketing permissions for the subscriber.
    String ipSignup = "ipSignup_example"; // IP address the subscriber signed up from.
    OffsetDateTime timestampSignup = OffsetDateTime.now(); // The date and time the subscriber signed up for the list in ISO 8601 format.
    String ipOpt = "ipOpt_example"; // The IP address the subscriber used to confirm their opt-in status.
    OffsetDateTime timestampOpt = OffsetDateTime.now(); // The date and time the subscriber confirmed their opt-in status in ISO 8601 format.
    Boolean skipMergeValidation = true; // If skip_merge_validation is true, member data will be accepted without merge field values, even if the merge field is usually required. This defaults to false.
    try {
      ListsAddMemberToListResponse result = client
              .lists
              .addMemberToList(emailAddress, status, listId)
              .tags(tags)
              .emailType(emailType)
              .mergeFields(mergeFields)
              .interests(interests)
              .language(language)
              .vip(vip)
              .location(location)
              .marketingPermissions(marketingPermissions)
              .ipSignup(ipSignup)
              .timestampSignup(timestampSignup)
              .ipOpt(ipOpt)
              .timestampOpt(timestampOpt)
              .skipMergeValidation(skipMergeValidation)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getId());
      System.out.println(result.getEmailAddress());
      System.out.println(result.getUniqueEmailId());
      System.out.println(result.getContactId());
      System.out.println(result.getFullName());
      System.out.println(result.getWebId());
      System.out.println(result.getEmailType());
      System.out.println(result.getStatus());
      System.out.println(result.getUnsubscribeReason());
      System.out.println(result.getConsentsToOneToOneMessaging());
      System.out.println(result.getSmsPhoneNumber());
      System.out.println(result.getSmsSubscriptionStatus());
      System.out.println(result.getSmsSubscriptionLastUpdated());
      System.out.println(result.getMergeFields());
      System.out.println(result.getInterests());
      System.out.println(result.getStats());
      System.out.println(result.getIpSignup());
      System.out.println(result.getTimestampSignup());
      System.out.println(result.getIpOpt());
      System.out.println(result.getTimestampOpt());
      System.out.println(result.getMemberRating());
      System.out.println(result.getLastChanged());
      System.out.println(result.getLanguage());
      System.out.println(result.getVip());
      System.out.println(result.getEmailClient());
      System.out.println(result.getLocation());
      System.out.println(result.getMarketingPermissions());
      System.out.println(result.getLastNote());
      System.out.println(result.getSource());
      System.out.println(result.getTagsCount());
      System.out.println(result.getListId());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#addMemberToList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsAddMemberToListResponse> response = client
              .lists
              .addMemberToList(emailAddress, status, listId)
              .tags(tags)
              .emailType(emailType)
              .mergeFields(mergeFields)
              .interests(interests)
              .language(language)
              .vip(vip)
              .location(location)
              .marketingPermissions(marketingPermissions)
              .ipSignup(ipSignup)
              .timestampSignup(timestampSignup)
              .ipOpt(ipOpt)
              .timestampOpt(timestampOpt)
              .skipMergeValidation(skipMergeValidation)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#addMemberToList");
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
| **listsAddMemberToListRequest** | [**ListsAddMemberToListRequest**](ListsAddMemberToListRequest.md)|  | |
| **skipMergeValidation** | **Boolean**| If skip_merge_validation is true, member data will be accepted without merge field values, even if the merge field is usually required. This defaults to false. | [optional] |

### Return type

[**ListsAddMemberToListResponse**](ListsAddMemberToListResponse.md)

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

<a name="addMemberToSegment"></a>
# **addMemberToSegment**
> ListsAddMemberToSegmentResponse addMemberToSegment(listId, segmentId, listsAddMemberToSegmentRequest).execute();

Add member to segment

Add a member to a static segment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String emailAddress = "emailAddress_example"; // Email address for a subscriber.
    String listId = "listId_example"; // The unique ID for the list.
    String segmentId = "segmentId_example"; // The unique id for the segment.
    try {
      ListsAddMemberToSegmentResponse result = client
              .lists
              .addMemberToSegment(emailAddress, listId, segmentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEmailAddress());
      System.out.println(result.getUniqueEmailId());
      System.out.println(result.getEmailType());
      System.out.println(result.getStatus());
      System.out.println(result.getMergeFields());
      System.out.println(result.getInterests());
      System.out.println(result.getStats());
      System.out.println(result.getIpSignup());
      System.out.println(result.getTimestampSignup());
      System.out.println(result.getIpOpt());
      System.out.println(result.getTimestampOpt());
      System.out.println(result.getMemberRating());
      System.out.println(result.getLastChanged());
      System.out.println(result.getLanguage());
      System.out.println(result.getVip());
      System.out.println(result.getEmailClient());
      System.out.println(result.getLocation());
      System.out.println(result.getLastNote());
      System.out.println(result.getListId());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#addMemberToSegment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsAddMemberToSegmentResponse> response = client
              .lists
              .addMemberToSegment(emailAddress, listId, segmentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#addMemberToSegment");
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
| **segmentId** | **String**| The unique id for the segment. | |
| **listsAddMemberToSegmentRequest** | [**ListsAddMemberToSegmentRequest**](ListsAddMemberToSegmentRequest.md)|  | |

### Return type

[**ListsAddMemberToSegmentResponse**](ListsAddMemberToSegmentResponse.md)

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

<a name="addMergeField"></a>
# **addMergeField**
> ListsAddMergeFieldResponse addMergeField(listId, listsAddMergeFieldRequest).execute();

Add merge field

Add a new merge field for a specific audience.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String name = "name_example"; // The name of the merge field (audience field).
    String type = "text"; // The [type](https://mailchimp.com/developer/marketing/docs/merge-fields/#structure) for the merge field.
    String listId = "listId_example"; // The unique ID for the list.
    String tag = "tag_example"; // The merge tag used for Mailchimp campaigns and [adding contact information](https://mailchimp.com/developer/marketing/docs/merge-fields/#add-merge-data-to-contacts).
    Boolean required = true; // Whether the merge field is required to import a contact.
    String defaultValue = "defaultValue_example"; // The default value for the merge field if `null`.
    Boolean _public = true; // Whether the merge field is displayed on the signup form.
    Integer displayOrder = 56; // The order that the merge field displays on the list signup form.
    MergeFieldOptionsProperty options = new MergeFieldOptionsProperty();
    String helpText = "helpText_example"; // Extra text to help the subscriber fill out the form.
    try {
      ListsAddMergeFieldResponse result = client
              .lists
              .addMergeField(name, type, listId)
              .tag(tag)
              .required(required)
              .defaultValue(defaultValue)
              ._public(_public)
              .displayOrder(displayOrder)
              .options(options)
              .helpText(helpText)
              .execute();
      System.out.println(result);
      System.out.println(result.getMergeId());
      System.out.println(result.getTag());
      System.out.println(result.getName());
      System.out.println(result.getType());
      System.out.println(result.getRequired());
      System.out.println(result.getDefaultValue());
      System.out.println(result.getPublic());
      System.out.println(result.getDisplayOrder());
      System.out.println(result.getOptions());
      System.out.println(result.getHelpText());
      System.out.println(result.getListId());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#addMergeField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsAddMergeFieldResponse> response = client
              .lists
              .addMergeField(name, type, listId)
              .tag(tag)
              .required(required)
              .defaultValue(defaultValue)
              ._public(_public)
              .displayOrder(displayOrder)
              .options(options)
              .helpText(helpText)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#addMergeField");
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
| **listsAddMergeFieldRequest** | [**ListsAddMergeFieldRequest**](ListsAddMergeFieldRequest.md)|  | |

### Return type

[**ListsAddMergeFieldResponse**](ListsAddMergeFieldResponse.md)

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

<a name="addNewSegment"></a>
# **addNewSegment**
> ListsAddNewSegmentResponse addNewSegment(listId, listsAddNewSegmentRequest).execute();

Add segment

Create a new segment in a specific list.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String name = "name_example"; // The name of the segment.
    String listId = "listId_example"; // The unique ID for the list.
    List<String> staticSegment = Arrays.asList(); // An array of emails to be used for a static segment. Any emails provided that are not present on the list will be ignored. Passing an empty array will create a static segment without any subscribers. This field cannot be provided with the options field.
    ConditionsProperty options = new ConditionsProperty();
    try {
      ListsAddNewSegmentResponse result = client
              .lists
              .addNewSegment(name, listId)
              .staticSegment(staticSegment)
              .options(options)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getMemberCount());
      System.out.println(result.getType());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getOptions());
      System.out.println(result.getListId());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#addNewSegment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsAddNewSegmentResponse> response = client
              .lists
              .addNewSegment(name, listId)
              .staticSegment(staticSegment)
              .options(options)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#addNewSegment");
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
| **listsAddNewSegmentRequest** | [**ListsAddNewSegmentRequest**](ListsAddNewSegmentRequest.md)|  | |

### Return type

[**ListsAddNewSegmentResponse**](ListsAddNewSegmentResponse.md)

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

<a name="addOrUpdateMember"></a>
# **addOrUpdateMember**
> ListsAddOrUpdateMemberResponse addOrUpdateMember(listId, subscriberHash, listsAddOrUpdateMemberRequest).skipMergeValidation(skipMergeValidation).execute();

Add or update list member

Add or update a list member.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String emailAddress = "emailAddress_example"; // Email address for a subscriber. This value is required only if the email address is not already present on the list.
    String statusIfNew = "subscribed"; // Subscriber's status. This value is required only if the email address is not already present on the list.
    String listId = "listId_example"; // The unique ID for the list.
    String subscriberHash = "subscriberHash_example"; // The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
    String emailType = "emailType_example"; // Type of email this member asked to get ('html' or 'text').
    String status = "subscribed"; // Subscriber's current status.
    Map<String, Object> mergeFields = new HashMap(); // A dictionary of merge fields where the keys are the merge tags. See the [Merge Fields documentation](https://mailchimp.com/developer/marketing/docs/merge-fields/#structure) for more about the structure.
    Map<String, Boolean> interests = new HashMap(); // The key of this object's properties is the ID of the interest in question.
    String language = "language_example"; // If set/detected, the [subscriber's language](https://mailchimp.com/help/view-and-edit-contact-languages/).
    Boolean vip = true; // [VIP status](https://mailchimp.com/help/designate-and-send-to-vip-contacts/) for subscriber.
    LocationProperty location = new LocationProperty();
    List<MarketingPermission> marketingPermissions = Arrays.asList(); // The marketing permissions for the subscriber.
    String ipSignup = "ipSignup_example"; // IP address the subscriber signed up from.
    OffsetDateTime timestampSignup = OffsetDateTime.now(); // The date and time the subscriber signed up for the list in ISO 8601 format.
    String ipOpt = "ipOpt_example"; // The IP address the subscriber used to confirm their opt-in status.
    OffsetDateTime timestampOpt = OffsetDateTime.now(); // The date and time the subscriber confirmed their opt-in status in ISO 8601 format.
    Boolean skipMergeValidation = true; // If skip_merge_validation is true, member data will be accepted without merge field values, even if the merge field is usually required. This defaults to false.
    try {
      ListsAddOrUpdateMemberResponse result = client
              .lists
              .addOrUpdateMember(emailAddress, statusIfNew, listId, subscriberHash)
              .emailType(emailType)
              .status(status)
              .mergeFields(mergeFields)
              .interests(interests)
              .language(language)
              .vip(vip)
              .location(location)
              .marketingPermissions(marketingPermissions)
              .ipSignup(ipSignup)
              .timestampSignup(timestampSignup)
              .ipOpt(ipOpt)
              .timestampOpt(timestampOpt)
              .skipMergeValidation(skipMergeValidation)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getId());
      System.out.println(result.getEmailAddress());
      System.out.println(result.getUniqueEmailId());
      System.out.println(result.getContactId());
      System.out.println(result.getFullName());
      System.out.println(result.getWebId());
      System.out.println(result.getEmailType());
      System.out.println(result.getStatus());
      System.out.println(result.getUnsubscribeReason());
      System.out.println(result.getConsentsToOneToOneMessaging());
      System.out.println(result.getSmsPhoneNumber());
      System.out.println(result.getSmsSubscriptionStatus());
      System.out.println(result.getSmsSubscriptionLastUpdated());
      System.out.println(result.getMergeFields());
      System.out.println(result.getInterests());
      System.out.println(result.getStats());
      System.out.println(result.getIpSignup());
      System.out.println(result.getTimestampSignup());
      System.out.println(result.getIpOpt());
      System.out.println(result.getTimestampOpt());
      System.out.println(result.getMemberRating());
      System.out.println(result.getLastChanged());
      System.out.println(result.getLanguage());
      System.out.println(result.getVip());
      System.out.println(result.getEmailClient());
      System.out.println(result.getLocation());
      System.out.println(result.getMarketingPermissions());
      System.out.println(result.getLastNote());
      System.out.println(result.getSource());
      System.out.println(result.getTagsCount());
      System.out.println(result.getListId());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#addOrUpdateMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsAddOrUpdateMemberResponse> response = client
              .lists
              .addOrUpdateMember(emailAddress, statusIfNew, listId, subscriberHash)
              .emailType(emailType)
              .status(status)
              .mergeFields(mergeFields)
              .interests(interests)
              .language(language)
              .vip(vip)
              .location(location)
              .marketingPermissions(marketingPermissions)
              .ipSignup(ipSignup)
              .timestampSignup(timestampSignup)
              .ipOpt(ipOpt)
              .timestampOpt(timestampOpt)
              .skipMergeValidation(skipMergeValidation)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#addOrUpdateMember");
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
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. | |
| **listsAddOrUpdateMemberRequest** | [**ListsAddOrUpdateMemberRequest**](ListsAddOrUpdateMemberRequest.md)|  | |
| **skipMergeValidation** | **Boolean**| If skip_merge_validation is true, member data will be accepted without merge field values, even if the merge field is usually required. This defaults to false. | [optional] |

### Return type

[**ListsAddOrUpdateMemberResponse**](ListsAddOrUpdateMemberResponse.md)

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

<a name="archiveMember"></a>
# **archiveMember**
> archiveMember(listId, subscriberHash).execute();

Archive list member

Archive a list member. To permanently delete, use the delete-permanent action.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String subscriberHash = "subscriberHash_example"; // The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
    try {
      client
              .lists
              .archiveMember(listId, subscriberHash)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#archiveMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .lists
              .archiveMember(listId, subscriberHash)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#archiveMember");
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
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. | |

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

<a name="batchAddRemoveMembers"></a>
# **batchAddRemoveMembers**
> ListsBatchAddRemoveMembersResponse batchAddRemoveMembers(listId, segmentId, listsBatchAddRemoveMembersRequest).execute();

Batch add or remove members

Batch add/remove list members to static segment

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String segmentId = "segmentId_example"; // The unique id for the segment.
    List<String> membersToAdd = Arrays.asList(); // An array of emails to be used for a static segment. Any emails provided that are not present on the list will be ignored. A maximum of 500 members can be sent.
    List<String> membersToRemove = Arrays.asList(); // An array of emails to be used for a static segment. Any emails provided that are not present on the list will be ignored. A maximum of 500 members can be sent.
    try {
      ListsBatchAddRemoveMembersResponse result = client
              .lists
              .batchAddRemoveMembers(listId, segmentId)
              .membersToAdd(membersToAdd)
              .membersToRemove(membersToRemove)
              .execute();
      System.out.println(result);
      System.out.println(result.getMembersAdded());
      System.out.println(result.getMembersRemoved());
      System.out.println(result.getErrors());
      System.out.println(result.getTotalAdded());
      System.out.println(result.getTotalRemoved());
      System.out.println(result.getErrorCount());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#batchAddRemoveMembers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsBatchAddRemoveMembersResponse> response = client
              .lists
              .batchAddRemoveMembers(listId, segmentId)
              .membersToAdd(membersToAdd)
              .membersToRemove(membersToRemove)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#batchAddRemoveMembers");
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
| **segmentId** | **String**| The unique id for the segment. | |
| **listsBatchAddRemoveMembersRequest** | [**ListsBatchAddRemoveMembersRequest**](ListsBatchAddRemoveMembersRequest.md)|  | |

### Return type

[**ListsBatchAddRemoveMembersResponse**](ListsBatchAddRemoveMembersResponse.md)

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

<a name="batchSubscribeOrUnsubscribe"></a>
# **batchSubscribeOrUnsubscribe**
> ListsBatchSubscribeOrUnsubscribeResponse batchSubscribeOrUnsubscribe(listId, listsBatchSubscribeOrUnsubscribeRequest).skipMergeValidation(skipMergeValidation).skipDuplicateCheck(skipDuplicateCheck).execute();

Batch subscribe or unsubscribe

Batch subscribe or unsubscribe list members.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    List<AddListMembers> members = Arrays.asList(); // An array of objects, each representing an email address and the subscription status for a specific list. Up to 500 members may be added or updated with each API call.
    String listId = "listId_example"; // The unique ID for the list.
    Boolean syncTags = true; // Whether this batch operation will replace all existing tags with tags in request.
    Boolean updateExisting = true; // Whether this batch operation will change existing members' subscription status.
    Boolean skipMergeValidation = true; // If skip_merge_validation is true, member data will be accepted without merge field values, even if the merge field is usually required. This defaults to false.
    Boolean skipDuplicateCheck = true; // If skip_duplicate_check is true, we will ignore duplicates sent in the request when using the batch sub/unsub on the lists endpoint. The status of the first appearance in the request will be saved. This defaults to false.
    try {
      ListsBatchSubscribeOrUnsubscribeResponse result = client
              .lists
              .batchSubscribeOrUnsubscribe(members, listId)
              .syncTags(syncTags)
              .updateExisting(updateExisting)
              .skipMergeValidation(skipMergeValidation)
              .skipDuplicateCheck(skipDuplicateCheck)
              .execute();
      System.out.println(result);
      System.out.println(result.getNewMembers());
      System.out.println(result.getUpdatedMembers());
      System.out.println(result.getErrors());
      System.out.println(result.getTotalCreated());
      System.out.println(result.getTotalUpdated());
      System.out.println(result.getErrorCount());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#batchSubscribeOrUnsubscribe");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsBatchSubscribeOrUnsubscribeResponse> response = client
              .lists
              .batchSubscribeOrUnsubscribe(members, listId)
              .syncTags(syncTags)
              .updateExisting(updateExisting)
              .skipMergeValidation(skipMergeValidation)
              .skipDuplicateCheck(skipDuplicateCheck)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#batchSubscribeOrUnsubscribe");
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
| **listsBatchSubscribeOrUnsubscribeRequest** | [**ListsBatchSubscribeOrUnsubscribeRequest**](ListsBatchSubscribeOrUnsubscribeRequest.md)|  | |
| **skipMergeValidation** | **Boolean**| If skip_merge_validation is true, member data will be accepted without merge field values, even if the merge field is usually required. This defaults to false. | [optional] |
| **skipDuplicateCheck** | **Boolean**| If skip_duplicate_check is true, we will ignore duplicates sent in the request when using the batch sub/unsub on the lists endpoint. The status of the first appearance in the request will be saved. This defaults to false. | [optional] |

### Return type

[**ListsBatchSubscribeOrUnsubscribeResponse**](ListsBatchSubscribeOrUnsubscribeResponse.md)

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

<a name="createNewList"></a>
# **createNewList**
> ListsCreateNewListResponse createNewList(listsCreateNewListRequest).execute();

Add list

Create a new list in your Mailchimp account.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String name = "name_example"; // The name of the list.
    ListContactProperty contact = new ListContactProperty();
    String permissionReminder = "permissionReminder_example"; // The [permission reminder](https://mailchimp.com/help/edit-the-permission-reminder/) for the list.
    CampaignDefaultsProperty campaignDefaults = new CampaignDefaultsProperty();
    Boolean emailTypeOption = true; // Whether the list supports [multiple formats for emails](https://mailchimp.com/help/change-audience-name-defaults/). When set to `true`, subscribers can choose whether they want to receive HTML or plain-text emails. When set to `false`, subscribers will receive HTML emails, with a plain-text alternative backup.
    Boolean useArchiveBar = false; // Whether campaigns for this list use the [Archive Bar](https://mailchimp.com/help/about-email-campaign-archives-and-pages/) in archives by default.
    String notifyOnSubscribe = "false"; // The email address to send [subscribe notifications](https://mailchimp.com/help/change-subscribe-and-unsubscribe-notifications/) to.
    String notifyOnUnsubscribe = "false"; // The email address to send [unsubscribe notifications](https://mailchimp.com/help/change-subscribe-and-unsubscribe-notifications/) to.
    Boolean doubleOptin = false; // Whether or not to require the subscriber to confirm subscription via email.
    Boolean marketingPermissions = false; // Whether or not the list has marketing permissions (eg. GDPR) enabled.
    try {
      ListsCreateNewListResponse result = client
              .lists
              .createNewList(name, contact, permissionReminder, campaignDefaults, emailTypeOption)
              .useArchiveBar(useArchiveBar)
              .notifyOnSubscribe(notifyOnSubscribe)
              .notifyOnUnsubscribe(notifyOnUnsubscribe)
              .doubleOptin(doubleOptin)
              .marketingPermissions(marketingPermissions)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getWebId());
      System.out.println(result.getName());
      System.out.println(result.getContact());
      System.out.println(result.getPermissionReminder());
      System.out.println(result.getUseArchiveBar());
      System.out.println(result.getCampaignDefaults());
      System.out.println(result.getNotifyOnSubscribe());
      System.out.println(result.getNotifyOnUnsubscribe());
      System.out.println(result.getDateCreated());
      System.out.println(result.getListRating());
      System.out.println(result.getEmailTypeOption());
      System.out.println(result.getSubscribeUrlShort());
      System.out.println(result.getSubscribeUrlLong());
      System.out.println(result.getBeamerAddress());
      System.out.println(result.getVisibility());
      System.out.println(result.getDoubleOptin());
      System.out.println(result.getHasWelcome());
      System.out.println(result.getMarketingPermissions());
      System.out.println(result.getModules());
      System.out.println(result.getStats());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#createNewList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsCreateNewListResponse> response = client
              .lists
              .createNewList(name, contact, permissionReminder, campaignDefaults, emailTypeOption)
              .useArchiveBar(useArchiveBar)
              .notifyOnSubscribe(notifyOnSubscribe)
              .notifyOnUnsubscribe(notifyOnUnsubscribe)
              .doubleOptin(doubleOptin)
              .marketingPermissions(marketingPermissions)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#createNewList");
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
| **listsCreateNewListRequest** | [**ListsCreateNewListRequest**](ListsCreateNewListRequest.md)|  | |

### Return type

[**ListsCreateNewListResponse**](ListsCreateNewListResponse.md)

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

<a name="createWebhook"></a>
# **createWebhook**
> ListsCreateWebhookResponse createWebhook(listId, listsCreateWebhookRequest).execute();

Add webhook

Create a new webhook for a specific list.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String url = "url_example"; // A valid URL for the Webhook.
    EventsProperty events = new EventsProperty();
    SourcesProperty sources = new SourcesProperty();
    try {
      ListsCreateWebhookResponse result = client
              .lists
              .createWebhook(listId)
              .url(url)
              .events(events)
              .sources(sources)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUrl());
      System.out.println(result.getEvents());
      System.out.println(result.getSources());
      System.out.println(result.getListId());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#createWebhook");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsCreateWebhookResponse> response = client
              .lists
              .createWebhook(listId)
              .url(url)
              .events(events)
              .sources(sources)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#createWebhook");
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
| **listsCreateWebhookRequest** | [**ListsCreateWebhookRequest**](ListsCreateWebhookRequest.md)|  | |

### Return type

[**ListsCreateWebhookResponse**](ListsCreateWebhookResponse.md)

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

<a name="customizeSignupForm"></a>
# **customizeSignupForm**
> ListsCustomizeSignupFormResponse customizeSignupForm(listId, listsCustomizeSignupFormRequest).execute();

Customize signup form

Customize a list&#39;s default signup form.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    SignupFormHeaderOptionsProperty header = new SignupFormHeaderOptionsProperty();
    List<CollectionOfContentForListSignupForms> contents = Arrays.asList(); // The signup form body content.
    List<CollectionOfElementStyleForListSignupForms> styles = Arrays.asList(); // An array of objects, each representing an element style for the signup form.
    try {
      ListsCustomizeSignupFormResponse result = client
              .lists
              .customizeSignupForm(listId)
              .header(header)
              .contents(contents)
              .styles(styles)
              .execute();
      System.out.println(result);
      System.out.println(result.getHeader());
      System.out.println(result.getContents());
      System.out.println(result.getStyles());
      System.out.println(result.getSignupFormUrl());
      System.out.println(result.getListId());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#customizeSignupForm");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsCustomizeSignupFormResponse> response = client
              .lists
              .customizeSignupForm(listId)
              .header(header)
              .contents(contents)
              .styles(styles)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#customizeSignupForm");
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
| **listsCustomizeSignupFormRequest** | [**ListsCustomizeSignupFormRequest**](ListsCustomizeSignupFormRequest.md)|  | |

### Return type

[**ListsCustomizeSignupFormResponse**](ListsCustomizeSignupFormResponse.md)

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

<a name="deleteInterestCategory"></a>
# **deleteInterestCategory**
> deleteInterestCategory(listId, interestCategoryId).execute();

Delete interest category

Delete a specific interest category.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String interestCategoryId = "interestCategoryId_example"; // The unique ID for the interest category.
    try {
      client
              .lists
              .deleteInterestCategory(listId, interestCategoryId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#deleteInterestCategory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .lists
              .deleteInterestCategory(listId, interestCategoryId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#deleteInterestCategory");
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
| **interestCategoryId** | **String**| The unique ID for the interest category. | |

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

<a name="deleteInterestInCategory"></a>
# **deleteInterestInCategory**
> deleteInterestInCategory(listId, interestCategoryId, interestId).execute();

Delete interest in category

Delete interests or group names in a specific category.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String interestCategoryId = "interestCategoryId_example"; // The unique ID for the interest category.
    String interestId = "interestId_example"; // The specific interest or 'group name'.
    try {
      client
              .lists
              .deleteInterestInCategory(listId, interestCategoryId, interestId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#deleteInterestInCategory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .lists
              .deleteInterestInCategory(listId, interestCategoryId, interestId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#deleteInterestInCategory");
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
| **interestCategoryId** | **String**| The unique ID for the interest category. | |
| **interestId** | **String**| The specific interest or &#39;group name&#39;. | |

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

<a name="deleteList"></a>
# **deleteList**
> deleteList(listId).execute();

Delete list

Delete a list from your Mailchimp account. If you delete a list, you&#39;ll lose the list history—including subscriber activity, unsubscribes, complaints, and bounces. You’ll also lose subscribers’ email addresses, unless you exported and backed up your list.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    try {
      client
              .lists
              .deleteList(listId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#deleteList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .lists
              .deleteList(listId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#deleteList");
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

<a name="deleteMergeField"></a>
# **deleteMergeField**
> deleteMergeField(listId, mergeId).execute();

Delete merge field

Delete a specific merge field.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String mergeId = "mergeId_example"; // The id for the merge field.
    try {
      client
              .lists
              .deleteMergeField(listId, mergeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#deleteMergeField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .lists
              .deleteMergeField(listId, mergeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#deleteMergeField");
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
| **mergeId** | **String**| The id for the merge field. | |

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

<a name="deleteNote"></a>
# **deleteNote**
> deleteNote(listId, subscriberHash, noteId).execute();

Delete note

Delete a specific note for a specific list member.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String subscriberHash = "subscriberHash_example"; // The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
    String noteId = "noteId_example"; // The id for the note.
    try {
      client
              .lists
              .deleteNote(listId, subscriberHash, noteId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#deleteNote");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .lists
              .deleteNote(listId, subscriberHash, noteId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#deleteNote");
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
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. | |
| **noteId** | **String**| The id for the note. | |

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

<a name="deleteSegment"></a>
# **deleteSegment**
> deleteSegment(listId, segmentId).execute();

Delete segment

Delete a specific segment in a list.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String segmentId = "segmentId_example"; // The unique id for the segment.
    try {
      client
              .lists
              .deleteSegment(listId, segmentId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#deleteSegment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .lists
              .deleteSegment(listId, segmentId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#deleteSegment");
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
| **segmentId** | **String**| The unique id for the segment. | |

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

<a name="deleteWebhook"></a>
# **deleteWebhook**
> deleteWebhook(listId, webhookId).execute();

Delete webhook

Delete a specific webhook in a list.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String webhookId = "webhookId_example"; // The webhook's id.
    try {
      client
              .lists
              .deleteWebhook(listId, webhookId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#deleteWebhook");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .lists
              .deleteWebhook(listId, webhookId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#deleteWebhook");
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
| **webhookId** | **String**| The webhook&#39;s id. | |

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

<a name="getAbuseReport"></a>
# **getAbuseReport**
> ListsGetAbuseReportResponse getAbuseReport(listId, reportId).fields(fields).excludeFields(excludeFields).count(count).offset(offset).execute();

Get abuse report

Get details about a specific abuse report.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String reportId = "reportId_example"; // The id for the abuse report.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    try {
      ListsGetAbuseReportResponse result = client
              .lists
              .getAbuseReport(listId, reportId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCampaignId());
      System.out.println(result.getListId());
      System.out.println(result.getEmailId());
      System.out.println(result.getEmailAddress());
      System.out.println(result.getMergeFields());
      System.out.println(result.getVip());
      System.out.println(result.getDate());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getAbuseReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsGetAbuseReportResponse> response = client
              .lists
              .getAbuseReport(listId, reportId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getAbuseReport");
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
| **reportId** | **String**| The id for the abuse report. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |

### Return type

[**ListsGetAbuseReportResponse**](ListsGetAbuseReportResponse.md)

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

<a name="getAllAbuseReports"></a>
# **getAllAbuseReports**
> ListsGetAllAbuseReportsResponse getAllAbuseReports(listId).fields(fields).excludeFields(excludeFields).count(count).offset(offset).execute();

List abuse reports

Get all abuse reports for a specific list.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    try {
      ListsGetAllAbuseReportsResponse result = client
              .lists
              .getAllAbuseReports(listId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getAbuseReports());
      System.out.println(result.getListId());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getAllAbuseReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsGetAllAbuseReportsResponse> response = client
              .lists
              .getAllAbuseReports(listId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getAllAbuseReports");
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
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |

### Return type

[**ListsGetAllAbuseReportsResponse**](ListsGetAllAbuseReportsResponse.md)

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

<a name="getAllInfo"></a>
# **getAllInfo**
> ListsGetAllInfoResponse getAllInfo().fields(fields).excludeFields(excludeFields).count(count).offset(offset).beforeDateCreated(beforeDateCreated).sinceDateCreated(sinceDateCreated).beforeCampaignLastSent(beforeCampaignLastSent).sinceCampaignLastSent(sinceCampaignLastSent).email(email).sortField(sortField).sortDir(sortDir).hasEcommerceStore(hasEcommerceStore).includeTotalContacts(includeTotalContacts).execute();

Get lists info

Get information about all lists in the account.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String beforeDateCreated = "beforeDateCreated_example"; // Restrict response to lists created before the set date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
    String sinceDateCreated = "sinceDateCreated_example"; // Restrict results to lists created after the set date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
    String beforeCampaignLastSent = "beforeCampaignLastSent_example"; // Restrict results to lists created before the last campaign send date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
    String sinceCampaignLastSent = "sinceCampaignLastSent_example"; // Restrict results to lists created after the last campaign send date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
    String email = "email_example"; // Restrict results to lists that include a specific subscriber's email address.
    String sortField = "date_created"; // Returns files sorted by the specified field.
    String sortDir = "ASC"; // Determines the order direction for sorted results.
    Boolean hasEcommerceStore = true; // Restrict results to lists that contain an active, connected, undeleted ecommerce store.
    Boolean includeTotalContacts = true; // Return the total_contacts field in the stats response, which contains an approximate count of all contacts in any state.
    try {
      ListsGetAllInfoResponse result = client
              .lists
              .getAllInfo()
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .beforeDateCreated(beforeDateCreated)
              .sinceDateCreated(sinceDateCreated)
              .beforeCampaignLastSent(beforeCampaignLastSent)
              .sinceCampaignLastSent(sinceCampaignLastSent)
              .email(email)
              .sortField(sortField)
              .sortDir(sortDir)
              .hasEcommerceStore(hasEcommerceStore)
              .includeTotalContacts(includeTotalContacts)
              .execute();
      System.out.println(result);
      System.out.println(result.getLists());
      System.out.println(result.getTotalItems());
      System.out.println(result.getConstraints());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getAllInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsGetAllInfoResponse> response = client
              .lists
              .getAllInfo()
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .beforeDateCreated(beforeDateCreated)
              .sinceDateCreated(sinceDateCreated)
              .beforeCampaignLastSent(beforeCampaignLastSent)
              .sinceCampaignLastSent(sinceCampaignLastSent)
              .email(email)
              .sortField(sortField)
              .sortDir(sortDir)
              .hasEcommerceStore(hasEcommerceStore)
              .includeTotalContacts(includeTotalContacts)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getAllInfo");
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
| **beforeDateCreated** | **String**| Restrict response to lists created before the set date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **sinceDateCreated** | **String**| Restrict results to lists created after the set date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **beforeCampaignLastSent** | **String**| Restrict results to lists created before the last campaign send date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **sinceCampaignLastSent** | **String**| Restrict results to lists created after the last campaign send date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **email** | **String**| Restrict results to lists that include a specific subscriber&#39;s email address. | [optional] |
| **sortField** | **String**| Returns files sorted by the specified field. | [optional] [enum: date_created] |
| **sortDir** | **String**| Determines the order direction for sorted results. | [optional] [enum: ASC, DESC] |
| **hasEcommerceStore** | **Boolean**| Restrict results to lists that contain an active, connected, undeleted ecommerce store. | [optional] |
| **includeTotalContacts** | **Boolean**| Return the total_contacts field in the stats response, which contains an approximate count of all contacts in any state. | [optional] |

### Return type

[**ListsGetAllInfoResponse**](ListsGetAllInfoResponse.md)

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

<a name="getGrowthHistoryByMonth"></a>
# **getGrowthHistoryByMonth**
> ListsGetGrowthHistoryByMonthResponse getGrowthHistoryByMonth(listId, month).fields(fields).excludeFields(excludeFields).execute();

Get growth history by month

Get a summary of a specific list&#39;s growth activity for a specific month and year.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String month = "month_example"; // A specific month of list growth history.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      ListsGetGrowthHistoryByMonthResponse result = client
              .lists
              .getGrowthHistoryByMonth(listId, month)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getListId());
      System.out.println(result.getMonth());
      System.out.println(result.getExisting());
      System.out.println(result.getImports());
      System.out.println(result.getOptins());
      System.out.println(result.getSubscribed());
      System.out.println(result.getUnsubscribed());
      System.out.println(result.getReconfirm());
      System.out.println(result.getCleaned());
      System.out.println(result.getPending());
      System.out.println(result.getDeleted());
      System.out.println(result.getTransactional());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getGrowthHistoryByMonth");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsGetGrowthHistoryByMonthResponse> response = client
              .lists
              .getGrowthHistoryByMonth(listId, month)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getGrowthHistoryByMonth");
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
| **month** | **String**| A specific month of list growth history. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ListsGetGrowthHistoryByMonthResponse**](ListsGetGrowthHistoryByMonthResponse.md)

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

<a name="getGrowthHistoryData"></a>
# **getGrowthHistoryData**
> ListsGetGrowthHistoryDataResponse getGrowthHistoryData(listId).fields(fields).excludeFields(excludeFields).count(count).offset(offset).sortField(sortField).sortDir(sortDir).execute();

List growth history data

Get a month-by-month summary of a specific list&#39;s growth activity.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    String sortField = "month"; // Returns files sorted by the specified field.
    String sortDir = "ASC"; // Determines the order direction for sorted results.
    try {
      ListsGetGrowthHistoryDataResponse result = client
              .lists
              .getGrowthHistoryData(listId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .sortField(sortField)
              .sortDir(sortDir)
              .execute();
      System.out.println(result);
      System.out.println(result.getHistory());
      System.out.println(result.getListId());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getGrowthHistoryData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsGetGrowthHistoryDataResponse> response = client
              .lists
              .getGrowthHistoryData(listId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .sortField(sortField)
              .sortDir(sortDir)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getGrowthHistoryData");
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
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **sortField** | **String**| Returns files sorted by the specified field. | [optional] [enum: month] |
| **sortDir** | **String**| Determines the order direction for sorted results. | [optional] [enum: ASC, DESC] |

### Return type

[**ListsGetGrowthHistoryDataResponse**](ListsGetGrowthHistoryDataResponse.md)

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

<a name="getInterestCategoryInfo"></a>
# **getInterestCategoryInfo**
> ListsGetInterestCategoryInfoResponse getInterestCategoryInfo(listId, interestCategoryId).fields(fields).excludeFields(excludeFields).execute();

Get interest category info

Get information about a specific interest category.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String interestCategoryId = "interestCategoryId_example"; // The unique ID for the interest category.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      ListsGetInterestCategoryInfoResponse result = client
              .lists
              .getInterestCategoryInfo(listId, interestCategoryId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getListId());
      System.out.println(result.getId());
      System.out.println(result.getDisplayOrder());
      System.out.println(result.getType());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getInterestCategoryInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsGetInterestCategoryInfoResponse> response = client
              .lists
              .getInterestCategoryInfo(listId, interestCategoryId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getInterestCategoryInfo");
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
| **interestCategoryId** | **String**| The unique ID for the interest category. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ListsGetInterestCategoryInfoResponse**](ListsGetInterestCategoryInfoResponse.md)

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

<a name="getInterestInCategory"></a>
# **getInterestInCategory**
> ListsGetInterestInCategoryResponse getInterestInCategory(listId, interestCategoryId, interestId).fields(fields).excludeFields(excludeFields).execute();

Get interest in category

Get interests or &#39;group names&#39; for a specific category.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String interestCategoryId = "interestCategoryId_example"; // The unique ID for the interest category.
    String interestId = "interestId_example"; // The specific interest or 'group name'.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      ListsGetInterestInCategoryResponse result = client
              .lists
              .getInterestInCategory(listId, interestCategoryId, interestId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getCategoryId());
      System.out.println(result.getListId());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getSubscriberCount());
      System.out.println(result.getDisplayOrder());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getInterestInCategory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsGetInterestInCategoryResponse> response = client
              .lists
              .getInterestInCategory(listId, interestCategoryId, interestId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getInterestInCategory");
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
| **interestCategoryId** | **String**| The unique ID for the interest category. | |
| **interestId** | **String**| The specific interest or &#39;group name&#39;. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ListsGetInterestInCategoryResponse**](ListsGetInterestInCategoryResponse.md)

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

<a name="getListInfo"></a>
# **getListInfo**
> ListsGetListInfoResponse getListInfo(listId).fields(fields).excludeFields(excludeFields).includeTotalContacts(includeTotalContacts).execute();

Get list info

Get information about a specific list in your Mailchimp account. Results include list members who have signed up but haven&#39;t confirmed their subscription yet and unsubscribed or cleaned.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Boolean includeTotalContacts = true; // Return the total_contacts field in the stats response, which contains an approximate count of all contacts in any state.
    try {
      ListsGetListInfoResponse result = client
              .lists
              .getListInfo(listId)
              .fields(fields)
              .excludeFields(excludeFields)
              .includeTotalContacts(includeTotalContacts)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getWebId());
      System.out.println(result.getName());
      System.out.println(result.getContact());
      System.out.println(result.getPermissionReminder());
      System.out.println(result.getUseArchiveBar());
      System.out.println(result.getCampaignDefaults());
      System.out.println(result.getNotifyOnSubscribe());
      System.out.println(result.getNotifyOnUnsubscribe());
      System.out.println(result.getDateCreated());
      System.out.println(result.getListRating());
      System.out.println(result.getEmailTypeOption());
      System.out.println(result.getSubscribeUrlShort());
      System.out.println(result.getSubscribeUrlLong());
      System.out.println(result.getBeamerAddress());
      System.out.println(result.getVisibility());
      System.out.println(result.getDoubleOptin());
      System.out.println(result.getHasWelcome());
      System.out.println(result.getMarketingPermissions());
      System.out.println(result.getModules());
      System.out.println(result.getStats());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getListInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsGetListInfoResponse> response = client
              .lists
              .getListInfo(listId)
              .fields(fields)
              .excludeFields(excludeFields)
              .includeTotalContacts(includeTotalContacts)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getListInfo");
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
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **includeTotalContacts** | **Boolean**| Return the total_contacts field in the stats response, which contains an approximate count of all contacts in any state. | [optional] |

### Return type

[**ListsGetListInfoResponse**](ListsGetListInfoResponse.md)

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

<a name="getLocations"></a>
# **getLocations**
> ListsGetLocationsResponse getLocations(listId).fields(fields).excludeFields(excludeFields).execute();

List locations

Get the locations (countries) that the list&#39;s subscribers have been tagged to based on geocoding their IP address.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      ListsGetLocationsResponse result = client
              .lists
              .getLocations(listId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getLocations());
      System.out.println(result.getListId());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getLocations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsGetLocationsResponse> response = client
              .lists
              .getLocations(listId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getLocations");
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
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ListsGetLocationsResponse**](ListsGetLocationsResponse.md)

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

<a name="getMemberEvents"></a>
# **getMemberEvents**
> ListsGetMemberEventsResponse getMemberEvents(listId, subscriberHash).count(count).offset(offset).fields(fields).excludeFields(excludeFields).execute();

List member events

Get events for a contact.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String subscriberHash = "subscriberHash_example"; // The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      ListsGetMemberEventsResponse result = client
              .lists
              .getMemberEvents(listId, subscriberHash)
              .count(count)
              .offset(offset)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getEvents());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getMemberEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsGetMemberEventsResponse> response = client
              .lists
              .getMemberEvents(listId, subscriberHash)
              .count(count)
              .offset(offset)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getMemberEvents");
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
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. | |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ListsGetMemberEventsResponse**](ListsGetMemberEventsResponse.md)

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

<a name="getMemberGoals"></a>
# **getMemberGoals**
> ListsGetMemberGoalsResponse getMemberGoals(listId, subscriberHash).fields(fields).excludeFields(excludeFields).execute();

List member goal events

Get the last 50 Goal events for a member on a specific list.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String subscriberHash = "subscriberHash_example"; // The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      ListsGetMemberGoalsResponse result = client
              .lists
              .getMemberGoals(listId, subscriberHash)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getGoals());
      System.out.println(result.getListId());
      System.out.println(result.getEmailId());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getMemberGoals");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsGetMemberGoalsResponse> response = client
              .lists
              .getMemberGoals(listId, subscriberHash)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getMemberGoals");
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
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ListsGetMemberGoalsResponse**](ListsGetMemberGoalsResponse.md)

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

<a name="getMemberInfo"></a>
# **getMemberInfo**
> ListsGetMemberInfoResponse getMemberInfo(listId, subscriberHash).fields(fields).excludeFields(excludeFields).execute();

Get member info

Get information about a specific list member, including a currently subscribed, unsubscribed, or bounced member.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String subscriberHash = "subscriberHash_example"; // The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      ListsGetMemberInfoResponse result = client
              .lists
              .getMemberInfo(listId, subscriberHash)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getId());
      System.out.println(result.getEmailAddress());
      System.out.println(result.getUniqueEmailId());
      System.out.println(result.getContactId());
      System.out.println(result.getFullName());
      System.out.println(result.getWebId());
      System.out.println(result.getEmailType());
      System.out.println(result.getStatus());
      System.out.println(result.getUnsubscribeReason());
      System.out.println(result.getConsentsToOneToOneMessaging());
      System.out.println(result.getSmsPhoneNumber());
      System.out.println(result.getSmsSubscriptionStatus());
      System.out.println(result.getSmsSubscriptionLastUpdated());
      System.out.println(result.getMergeFields());
      System.out.println(result.getInterests());
      System.out.println(result.getStats());
      System.out.println(result.getIpSignup());
      System.out.println(result.getTimestampSignup());
      System.out.println(result.getIpOpt());
      System.out.println(result.getTimestampOpt());
      System.out.println(result.getMemberRating());
      System.out.println(result.getLastChanged());
      System.out.println(result.getLanguage());
      System.out.println(result.getVip());
      System.out.println(result.getEmailClient());
      System.out.println(result.getLocation());
      System.out.println(result.getMarketingPermissions());
      System.out.println(result.getLastNote());
      System.out.println(result.getSource());
      System.out.println(result.getTagsCount());
      System.out.println(result.getListId());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getMemberInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsGetMemberInfoResponse> response = client
              .lists
              .getMemberInfo(listId, subscriberHash)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getMemberInfo");
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
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ListsGetMemberInfoResponse**](ListsGetMemberInfoResponse.md)

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

<a name="getMemberNote"></a>
# **getMemberNote**
> ListsGetMemberNoteResponse getMemberNote(listId, subscriberHash, noteId).fields(fields).excludeFields(excludeFields).execute();

Get member note

Get a specific note for a specific list member.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String subscriberHash = "subscriberHash_example"; // The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
    String noteId = "noteId_example"; // The id for the note.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      ListsGetMemberNoteResponse result = client
              .lists
              .getMemberNote(listId, subscriberHash, noteId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getNote());
      System.out.println(result.getListId());
      System.out.println(result.getEmailId());
      System.out.println(result.getContactId());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getMemberNote");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsGetMemberNoteResponse> response = client
              .lists
              .getMemberNote(listId, subscriberHash, noteId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getMemberNote");
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
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. | |
| **noteId** | **String**| The id for the note. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ListsGetMemberNoteResponse**](ListsGetMemberNoteResponse.md)

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

<a name="getMemberNotes"></a>
# **getMemberNotes**
> ListsGetMemberNotesResponse getMemberNotes(listId, subscriberHash).sortField(sortField).sortDir(sortDir).fields(fields).excludeFields(excludeFields).count(count).offset(offset).execute();

List recent member notes

Get recent notes for a specific list member.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String subscriberHash = "subscriberHash_example"; // The MD5 hash of the lowercase version of the list member's email address.
    String sortField = "created_at"; // Returns notes sorted by the specified field.
    String sortDir = "ASC"; // Determines the order direction for sorted results.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    try {
      ListsGetMemberNotesResponse result = client
              .lists
              .getMemberNotes(listId, subscriberHash)
              .sortField(sortField)
              .sortDir(sortDir)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getNotes());
      System.out.println(result.getEmailId());
      System.out.println(result.getListId());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getMemberNotes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsGetMemberNotesResponse> response = client
              .lists
              .getMemberNotes(listId, subscriberHash)
              .sortField(sortField)
              .sortDir(sortDir)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getMemberNotes");
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
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. | |
| **sortField** | **String**| Returns notes sorted by the specified field. | [optional] [enum: created_at, updated_at, note_id] |
| **sortDir** | **String**| Determines the order direction for sorted results. | [optional] [enum: ASC, DESC] |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |

### Return type

[**ListsGetMemberNotesResponse**](ListsGetMemberNotesResponse.md)

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

<a name="getMemberTags"></a>
# **getMemberTags**
> ListsGetMemberTagsResponse getMemberTags(listId, subscriberHash).fields(fields).excludeFields(excludeFields).count(count).offset(offset).execute();

List member tags

Get the tags on a list member.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String subscriberHash = "subscriberHash_example"; // The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    try {
      ListsGetMemberTagsResponse result = client
              .lists
              .getMemberTags(listId, subscriberHash)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getMemberTags");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsGetMemberTagsResponse> response = client
              .lists
              .getMemberTags(listId, subscriberHash)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getMemberTags");
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
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |

### Return type

[**ListsGetMemberTagsResponse**](ListsGetMemberTagsResponse.md)

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

<a name="getMembersInfo"></a>
# **getMembersInfo**
> ListsGetMembersInfoResponse getMembersInfo(listId).fields(fields).excludeFields(excludeFields).count(count).offset(offset).emailType(emailType).status(status).sinceTimestampOpt(sinceTimestampOpt).beforeTimestampOpt(beforeTimestampOpt).sinceLastChanged(sinceLastChanged).beforeLastChanged(beforeLastChanged).uniqueEmailId(uniqueEmailId).vipOnly(vipOnly).interestCategoryId(interestCategoryId).interestIds(interestIds).interestMatch(interestMatch).sortField(sortField).sortDir(sortDir).sinceLastCampaign(sinceLastCampaign).unsubscribedSince(unsubscribedSince).execute();

List members info

Get information about members in a specific Mailchimp list.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    String emailType = "emailType_example"; // The email type.
    String status = "subscribed"; // The subscriber's status.
    String sinceTimestampOpt = "sinceTimestampOpt_example"; // Restrict results to subscribers who opted-in after the set timeframe. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
    String beforeTimestampOpt = "beforeTimestampOpt_example"; // Restrict results to subscribers who opted-in before the set timeframe. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
    String sinceLastChanged = "sinceLastChanged_example"; // Restrict results to subscribers whose information changed after the set timeframe. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
    String beforeLastChanged = "beforeLastChanged_example"; // Restrict results to subscribers whose information changed before the set timeframe. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
    String uniqueEmailId = "uniqueEmailId_example"; // A unique identifier for the email address across all Mailchimp lists.
    Boolean vipOnly = true; // A filter to return only the list's VIP members. Passing `true` will restrict results to VIP list members, passing `false` will return all list members.
    String interestCategoryId = "interestCategoryId_example"; // The unique id for the interest category.
    String interestIds = "interestIds_example"; // Used to filter list members by interests. Must be accompanied by interest_category_id and interest_match. The value must be a comma separated list of interest ids present for any supplied interest categories.
    String interestMatch = "any"; // Used to filter list members by interests. Must be accompanied by interest_category_id and interest_ids. \"any\" will match a member with any of the interest supplied, \"all\" will only match members with every interest supplied, and \"none\" will match members without any of the interest supplied.
    String sortField = "timestamp_opt"; // Returns files sorted by the specified field.
    String sortDir = "ASC"; // Determines the order direction for sorted results.
    Boolean sinceLastCampaign = true; // Filter subscribers by those subscribed/unsubscribed/pending/cleaned since last email campaign send. Member status is required to use this filter.
    String unsubscribedSince = "unsubscribedSince_example"; // Filter subscribers by those unsubscribed since a specific date. Using any status other than unsubscribed with this filter will result in an error.
    try {
      ListsGetMembersInfoResponse result = client
              .lists
              .getMembersInfo(listId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .emailType(emailType)
              .status(status)
              .sinceTimestampOpt(sinceTimestampOpt)
              .beforeTimestampOpt(beforeTimestampOpt)
              .sinceLastChanged(sinceLastChanged)
              .beforeLastChanged(beforeLastChanged)
              .uniqueEmailId(uniqueEmailId)
              .vipOnly(vipOnly)
              .interestCategoryId(interestCategoryId)
              .interestIds(interestIds)
              .interestMatch(interestMatch)
              .sortField(sortField)
              .sortDir(sortDir)
              .sinceLastCampaign(sinceLastCampaign)
              .unsubscribedSince(unsubscribedSince)
              .execute();
      System.out.println(result);
      System.out.println(result.getMembers());
      System.out.println(result.getListId());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getMembersInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsGetMembersInfoResponse> response = client
              .lists
              .getMembersInfo(listId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .emailType(emailType)
              .status(status)
              .sinceTimestampOpt(sinceTimestampOpt)
              .beforeTimestampOpt(beforeTimestampOpt)
              .sinceLastChanged(sinceLastChanged)
              .beforeLastChanged(beforeLastChanged)
              .uniqueEmailId(uniqueEmailId)
              .vipOnly(vipOnly)
              .interestCategoryId(interestCategoryId)
              .interestIds(interestIds)
              .interestMatch(interestMatch)
              .sortField(sortField)
              .sortDir(sortDir)
              .sinceLastCampaign(sinceLastCampaign)
              .unsubscribedSince(unsubscribedSince)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getMembersInfo");
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
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **emailType** | **String**| The email type. | [optional] |
| **status** | **String**| The subscriber&#39;s status. | [optional] [enum: subscribed, unsubscribed, cleaned, pending, transactional, archived] |
| **sinceTimestampOpt** | **String**| Restrict results to subscribers who opted-in after the set timeframe. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **beforeTimestampOpt** | **String**| Restrict results to subscribers who opted-in before the set timeframe. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **sinceLastChanged** | **String**| Restrict results to subscribers whose information changed after the set timeframe. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **beforeLastChanged** | **String**| Restrict results to subscribers whose information changed before the set timeframe. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **uniqueEmailId** | **String**| A unique identifier for the email address across all Mailchimp lists. | [optional] |
| **vipOnly** | **Boolean**| A filter to return only the list&#39;s VIP members. Passing &#x60;true&#x60; will restrict results to VIP list members, passing &#x60;false&#x60; will return all list members. | [optional] |
| **interestCategoryId** | **String**| The unique id for the interest category. | [optional] |
| **interestIds** | **String**| Used to filter list members by interests. Must be accompanied by interest_category_id and interest_match. The value must be a comma separated list of interest ids present for any supplied interest categories. | [optional] |
| **interestMatch** | **String**| Used to filter list members by interests. Must be accompanied by interest_category_id and interest_ids. \&quot;any\&quot; will match a member with any of the interest supplied, \&quot;all\&quot; will only match members with every interest supplied, and \&quot;none\&quot; will match members without any of the interest supplied. | [optional] [enum: any, all, none] |
| **sortField** | **String**| Returns files sorted by the specified field. | [optional] [enum: timestamp_opt, timestamp_signup, last_changed] |
| **sortDir** | **String**| Determines the order direction for sorted results. | [optional] [enum: ASC, DESC] |
| **sinceLastCampaign** | **Boolean**| Filter subscribers by those subscribed/unsubscribed/pending/cleaned since last email campaign send. Member status is required to use this filter. | [optional] |
| **unsubscribedSince** | **String**| Filter subscribers by those unsubscribed since a specific date. Using any status other than unsubscribed with this filter will result in an error. | [optional] |

### Return type

[**ListsGetMembersInfoResponse**](ListsGetMembersInfoResponse.md)

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

<a name="getMergeFieldInfo"></a>
# **getMergeFieldInfo**
> ListsGetMergeFieldInfoResponse getMergeFieldInfo(listId, mergeId).excludeFields(excludeFields).fields(fields).execute();

Get merge field

Get information about a specific merge field.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String mergeId = "mergeId_example"; // The id for the merge field.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    try {
      ListsGetMergeFieldInfoResponse result = client
              .lists
              .getMergeFieldInfo(listId, mergeId)
              .excludeFields(excludeFields)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getMergeId());
      System.out.println(result.getTag());
      System.out.println(result.getName());
      System.out.println(result.getType());
      System.out.println(result.getRequired());
      System.out.println(result.getDefaultValue());
      System.out.println(result.getPublic());
      System.out.println(result.getDisplayOrder());
      System.out.println(result.getOptions());
      System.out.println(result.getHelpText());
      System.out.println(result.getListId());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getMergeFieldInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsGetMergeFieldInfoResponse> response = client
              .lists
              .getMergeFieldInfo(listId, mergeId)
              .excludeFields(excludeFields)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getMergeFieldInfo");
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
| **mergeId** | **String**| The id for the merge field. | |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ListsGetMergeFieldInfoResponse**](ListsGetMergeFieldInfoResponse.md)

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

<a name="getRecentActivityStats"></a>
# **getRecentActivityStats**
> ListsGetRecentActivityStatsResponse getRecentActivityStats(listId).count(count).offset(offset).fields(fields).excludeFields(excludeFields).execute();

List recent activity

Get up to the previous 180 days of daily detailed aggregated activity stats for a list, not including Automation activity.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      ListsGetRecentActivityStatsResponse result = client
              .lists
              .getRecentActivityStats(listId)
              .count(count)
              .offset(offset)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getActivity());
      System.out.println(result.getListId());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getRecentActivityStats");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsGetRecentActivityStatsResponse> response = client
              .lists
              .getRecentActivityStats(listId)
              .count(count)
              .offset(offset)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getRecentActivityStats");
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
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ListsGetRecentActivityStatsResponse**](ListsGetRecentActivityStatsResponse.md)

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

<a name="getSegmentInfo"></a>
# **getSegmentInfo**
> ListsGetSegmentInfoResponse getSegmentInfo(listId, segmentId).fields(fields).excludeFields(excludeFields).includeCleaned(includeCleaned).includeTransactional(includeTransactional).includeUnsubscribed(includeUnsubscribed).execute();

Get segment info

Get information about a specific segment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String segmentId = "segmentId_example"; // The unique id for the segment.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Boolean includeCleaned = false; // Include cleaned members in response
    Boolean includeTransactional = false; // Include transactional members in response
    Boolean includeUnsubscribed = false; // Include unsubscribed members in response
    try {
      ListsGetSegmentInfoResponse result = client
              .lists
              .getSegmentInfo(listId, segmentId)
              .fields(fields)
              .excludeFields(excludeFields)
              .includeCleaned(includeCleaned)
              .includeTransactional(includeTransactional)
              .includeUnsubscribed(includeUnsubscribed)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getMemberCount());
      System.out.println(result.getType());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getOptions());
      System.out.println(result.getListId());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getSegmentInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsGetSegmentInfoResponse> response = client
              .lists
              .getSegmentInfo(listId, segmentId)
              .fields(fields)
              .excludeFields(excludeFields)
              .includeCleaned(includeCleaned)
              .includeTransactional(includeTransactional)
              .includeUnsubscribed(includeUnsubscribed)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getSegmentInfo");
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
| **segmentId** | **String**| The unique id for the segment. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **includeCleaned** | **Boolean**| Include cleaned members in response | [optional] |
| **includeTransactional** | **Boolean**| Include transactional members in response | [optional] |
| **includeUnsubscribed** | **Boolean**| Include unsubscribed members in response | [optional] |

### Return type

[**ListsGetSegmentInfoResponse**](ListsGetSegmentInfoResponse.md)

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

<a name="getSegmentMembers"></a>
# **getSegmentMembers**
> ListsGetSegmentMembersResponse getSegmentMembers(listId, segmentId).fields(fields).excludeFields(excludeFields).count(count).offset(offset).includeCleaned(includeCleaned).includeTransactional(includeTransactional).includeUnsubscribed(includeUnsubscribed).execute();

List members in segment

Get information about members in a saved segment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String segmentId = "segmentId_example"; // The unique id for the segment.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    Boolean includeCleaned = false; // Include cleaned members in response
    Boolean includeTransactional = false; // Include transactional members in response
    Boolean includeUnsubscribed = false; // Include unsubscribed members in response
    try {
      ListsGetSegmentMembersResponse result = client
              .lists
              .getSegmentMembers(listId, segmentId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .includeCleaned(includeCleaned)
              .includeTransactional(includeTransactional)
              .includeUnsubscribed(includeUnsubscribed)
              .execute();
      System.out.println(result);
      System.out.println(result.getMembers());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getSegmentMembers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsGetSegmentMembersResponse> response = client
              .lists
              .getSegmentMembers(listId, segmentId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .includeCleaned(includeCleaned)
              .includeTransactional(includeTransactional)
              .includeUnsubscribed(includeUnsubscribed)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getSegmentMembers");
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
| **segmentId** | **String**| The unique id for the segment. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **includeCleaned** | **Boolean**| Include cleaned members in response | [optional] |
| **includeTransactional** | **Boolean**| Include transactional members in response | [optional] |
| **includeUnsubscribed** | **Boolean**| Include unsubscribed members in response | [optional] |

### Return type

[**ListsGetSegmentMembersResponse**](ListsGetSegmentMembersResponse.md)

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

<a name="getSegmentsInfo"></a>
# **getSegmentsInfo**
> ListsGetSegmentsInfoResponse getSegmentsInfo(listId).fields(fields).excludeFields(excludeFields).count(count).offset(offset).type(type).sinceCreatedAt(sinceCreatedAt).beforeCreatedAt(beforeCreatedAt).includeCleaned(includeCleaned).includeTransactional(includeTransactional).includeUnsubscribed(includeUnsubscribed).sinceUpdatedAt(sinceUpdatedAt).beforeUpdatedAt(beforeUpdatedAt).execute();

List segments

Get information about all available segments for a specific list.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    String type = "type_example"; // Limit results based on segment type.
    String sinceCreatedAt = "sinceCreatedAt_example"; // Restrict results to segments created after the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
    String beforeCreatedAt = "beforeCreatedAt_example"; // Restrict results to segments created before the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
    Boolean includeCleaned = false; // Include cleaned members in response
    Boolean includeTransactional = false; // Include transactional members in response
    Boolean includeUnsubscribed = false; // Include unsubscribed members in response
    String sinceUpdatedAt = "sinceUpdatedAt_example"; // Restrict results to segments update after the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
    String beforeUpdatedAt = "beforeUpdatedAt_example"; // Restrict results to segments update before the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
    try {
      ListsGetSegmentsInfoResponse result = client
              .lists
              .getSegmentsInfo(listId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .type(type)
              .sinceCreatedAt(sinceCreatedAt)
              .beforeCreatedAt(beforeCreatedAt)
              .includeCleaned(includeCleaned)
              .includeTransactional(includeTransactional)
              .includeUnsubscribed(includeUnsubscribed)
              .sinceUpdatedAt(sinceUpdatedAt)
              .beforeUpdatedAt(beforeUpdatedAt)
              .execute();
      System.out.println(result);
      System.out.println(result.getSegments());
      System.out.println(result.getListId());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getSegmentsInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsGetSegmentsInfoResponse> response = client
              .lists
              .getSegmentsInfo(listId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .type(type)
              .sinceCreatedAt(sinceCreatedAt)
              .beforeCreatedAt(beforeCreatedAt)
              .includeCleaned(includeCleaned)
              .includeTransactional(includeTransactional)
              .includeUnsubscribed(includeUnsubscribed)
              .sinceUpdatedAt(sinceUpdatedAt)
              .beforeUpdatedAt(beforeUpdatedAt)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getSegmentsInfo");
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
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **type** | **String**| Limit results based on segment type. | [optional] |
| **sinceCreatedAt** | **String**| Restrict results to segments created after the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **beforeCreatedAt** | **String**| Restrict results to segments created before the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **includeCleaned** | **Boolean**| Include cleaned members in response | [optional] |
| **includeTransactional** | **Boolean**| Include transactional members in response | [optional] |
| **includeUnsubscribed** | **Boolean**| Include unsubscribed members in response | [optional] |
| **sinceUpdatedAt** | **String**| Restrict results to segments update after the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **beforeUpdatedAt** | **String**| Restrict results to segments update before the set time. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |

### Return type

[**ListsGetSegmentsInfoResponse**](ListsGetSegmentsInfoResponse.md)

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

<a name="getSignupForms"></a>
# **getSignupForms**
> ListsGetSignupFormsResponse getSignupForms(listId).execute();

List signup forms

Get signup forms for a specific list.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    try {
      ListsGetSignupFormsResponse result = client
              .lists
              .getSignupForms(listId)
              .execute();
      System.out.println(result);
      System.out.println(result.getSignupForms());
      System.out.println(result.getListId());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getSignupForms");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsGetSignupFormsResponse> response = client
              .lists
              .getSignupForms(listId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getSignupForms");
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

### Return type

[**ListsGetSignupFormsResponse**](ListsGetSignupFormsResponse.md)

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

<a name="getSurveyDetails"></a>
# **getSurveyDetails**
> getSurveyDetails(listId, surveyId).execute();

Get survey

Get details about a specific survey.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
              .lists
              .getSurveyDetails(listId, surveyId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getSurveyDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .lists
              .getSurveyDetails(listId, surveyId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getSurveyDetails");
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
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="getSurveysInfo"></a>
# **getSurveysInfo**
> getSurveysInfo(listId).execute();

Get information about all surveys for a list

Get information about all available surveys for a specific list.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    try {
      client
              .lists
              .getSurveysInfo(listId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getSurveysInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .lists
              .getSurveysInfo(listId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getSurveysInfo");
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
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="getWebhookInfo"></a>
# **getWebhookInfo**
> ListsGetWebhookInfoResponse getWebhookInfo(listId, webhookId).execute();

Get webhook info

Get information about a specific webhook.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String webhookId = "webhookId_example"; // The webhook's id.
    try {
      ListsGetWebhookInfoResponse result = client
              .lists
              .getWebhookInfo(listId, webhookId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUrl());
      System.out.println(result.getEvents());
      System.out.println(result.getSources());
      System.out.println(result.getListId());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getWebhookInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsGetWebhookInfoResponse> response = client
              .lists
              .getWebhookInfo(listId, webhookId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getWebhookInfo");
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
| **webhookId** | **String**| The webhook&#39;s id. | |

### Return type

[**ListsGetWebhookInfoResponse**](ListsGetWebhookInfoResponse.md)

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

<a name="getWebhooksInfo"></a>
# **getWebhooksInfo**
> ListsGetWebhooksInfoResponse getWebhooksInfo(listId).execute();

List webhooks

Get information about all webhooks for a specific list.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    try {
      ListsGetWebhooksInfoResponse result = client
              .lists
              .getWebhooksInfo(listId)
              .execute();
      System.out.println(result);
      System.out.println(result.getWebhooks());
      System.out.println(result.getListId());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getWebhooksInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsGetWebhooksInfoResponse> response = client
              .lists
              .getWebhooksInfo(listId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getWebhooksInfo");
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

### Return type

[**ListsGetWebhooksInfoResponse**](ListsGetWebhooksInfoResponse.md)

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

<a name="listCategoryInterests"></a>
# **listCategoryInterests**
> ListsListCategoryInterestsResponse listCategoryInterests(listId, interestCategoryId).fields(fields).excludeFields(excludeFields).count(count).offset(offset).execute();

List interests in category

Get a list of this category&#39;s interests.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String interestCategoryId = "interestCategoryId_example"; // The unique ID for the interest category.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    try {
      ListsListCategoryInterestsResponse result = client
              .lists
              .listCategoryInterests(listId, interestCategoryId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getInterests());
      System.out.println(result.getListId());
      System.out.println(result.getCategoryId());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listCategoryInterests");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsListCategoryInterestsResponse> response = client
              .lists
              .listCategoryInterests(listId, interestCategoryId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listCategoryInterests");
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
| **interestCategoryId** | **String**| The unique ID for the interest category. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |

### Return type

[**ListsListCategoryInterestsResponse**](ListsListCategoryInterestsResponse.md)

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

<a name="listInterestCategories"></a>
# **listInterestCategories**
> ListsListInterestCategoriesResponse listInterestCategories(listId).fields(fields).excludeFields(excludeFields).count(count).offset(offset).type(type).execute();

List interest categories

Get information about a list&#39;s interest categories.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    String type = "type_example"; // Restrict results a type of interest group
    try {
      ListsListInterestCategoriesResponse result = client
              .lists
              .listInterestCategories(listId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .type(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getListId());
      System.out.println(result.getCategories());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listInterestCategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsListInterestCategoriesResponse> response = client
              .lists
              .listInterestCategories(listId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listInterestCategories");
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
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **type** | **String**| Restrict results a type of interest group | [optional] |

### Return type

[**ListsListInterestCategoriesResponse**](ListsListInterestCategoriesResponse.md)

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

<a name="listMergeFields"></a>
# **listMergeFields**
> ListsListMergeFieldsResponse listMergeFields(listId).fields(fields).excludeFields(excludeFields).count(count).offset(offset).type(type).required(required).execute();

List merge fields

Get a list of all merge fields for an audience.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    String type = "type_example"; // The merge field type.
    Boolean required = true; // Whether it's a required merge field.
    try {
      ListsListMergeFieldsResponse result = client
              .lists
              .listMergeFields(listId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .type(type)
              .required(required)
              .execute();
      System.out.println(result);
      System.out.println(result.getMergeFields());
      System.out.println(result.getListId());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listMergeFields");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsListMergeFieldsResponse> response = client
              .lists
              .listMergeFields(listId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .type(type)
              .required(required)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listMergeFields");
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
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **type** | **String**| The merge field type. | [optional] |
| **required** | **Boolean**| Whether it&#39;s a required merge field. | [optional] |

### Return type

[**ListsListMergeFieldsResponse**](ListsListMergeFieldsResponse.md)

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

<a name="listTopEmailClients"></a>
# **listTopEmailClients**
> ListsListTopEmailClientsResponse listTopEmailClients(listId).fields(fields).excludeFields(excludeFields).execute();

List top email clients

Get a list of the top email clients based on user-agent strings.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      ListsListTopEmailClientsResponse result = client
              .lists
              .listTopEmailClients(listId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getClients());
      System.out.println(result.getListId());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listTopEmailClients");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsListTopEmailClientsResponse> response = client
              .lists
              .listTopEmailClients(listId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listTopEmailClients");
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
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ListsListTopEmailClientsResponse**](ListsListTopEmailClientsResponse.md)

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

<a name="removeMemberFromSegment"></a>
# **removeMemberFromSegment**
> removeMemberFromSegment(listId, segmentId, subscriberHash).execute();

Remove list member from segment

Remove a member from the specified static segment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String segmentId = "segmentId_example"; // The unique id for the segment.
    String subscriberHash = "subscriberHash_example"; // The MD5 hash of the lowercase version of the list member's email address.
    try {
      client
              .lists
              .removeMemberFromSegment(listId, segmentId, subscriberHash)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#removeMemberFromSegment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .lists
              .removeMemberFromSegment(listId, segmentId, subscriberHash)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#removeMemberFromSegment");
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
| **segmentId** | **String**| The unique id for the segment. | |
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. | |

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

<a name="removeMemberPermanent"></a>
# **removeMemberPermanent**
> removeMemberPermanent(listId, subscriberHash).execute();

Delete list member

Delete all personally identifiable information related to a list member, and remove them from a list. This will make it impossible to re-import the list member.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String subscriberHash = "subscriberHash_example"; // The MD5 hash of the lowercase version of the list member's email address.
    try {
      client
              .lists
              .removeMemberPermanent(listId, subscriberHash)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#removeMemberPermanent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .lists
              .removeMemberPermanent(listId, subscriberHash)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#removeMemberPermanent");
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
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. | |

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

<a name="searchTagsByName"></a>
# **searchTagsByName**
> ListsSearchTagsByNameResponse searchTagsByName(listId).name(name).execute();

Search for tags on a list by name.

Search for tags on a list by name. If no name is provided, will return all tags on the list.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String name = "name_example"; // The search query used to filter tags.  The search query will be compared to each tag as a prefix, so all tags that have a name starting with this field will be returned.
    try {
      ListsSearchTagsByNameResponse result = client
              .lists
              .searchTagsByName(listId)
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getTotalItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#searchTagsByName");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsSearchTagsByNameResponse> response = client
              .lists
              .searchTagsByName(listId)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#searchTagsByName");
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
| **name** | **String**| The search query used to filter tags.  The search query will be compared to each tag as a prefix, so all tags that have a name starting with this field will be returned. | [optional] |

### Return type

[**ListsSearchTagsByNameResponse**](ListsSearchTagsByNameResponse.md)

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

<a name="updateInterestCategory"></a>
# **updateInterestCategory**
> ListsUpdateInterestCategoryResponse updateInterestCategory(listId, interestCategoryId, listsAddInterestCategoryRequest).execute();

Update interest category

Update a specific interest category.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String title = "title_example"; // The text description of this category. This field appears on signup forms and is often phrased as a question.
    String type = "checkboxes"; // Determines how this category’s interests appear on signup forms.
    String listId = "listId_example"; // The unique ID for the list.
    String interestCategoryId = "interestCategoryId_example"; // The unique ID for the interest category.
    Integer displayOrder = 56; // The order that the categories are displayed in the list. Lower numbers display first.
    try {
      ListsUpdateInterestCategoryResponse result = client
              .lists
              .updateInterestCategory(title, type, listId, interestCategoryId)
              .displayOrder(displayOrder)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getListId());
      System.out.println(result.getId());
      System.out.println(result.getDisplayOrder());
      System.out.println(result.getType());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#updateInterestCategory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsUpdateInterestCategoryResponse> response = client
              .lists
              .updateInterestCategory(title, type, listId, interestCategoryId)
              .displayOrder(displayOrder)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#updateInterestCategory");
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
| **interestCategoryId** | **String**| The unique ID for the interest category. | |
| **listsAddInterestCategoryRequest** | [**ListsAddInterestCategoryRequest**](ListsAddInterestCategoryRequest.md)|  | |

### Return type

[**ListsUpdateInterestCategoryResponse**](ListsUpdateInterestCategoryResponse.md)

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

<a name="updateInterestCategoryInterest"></a>
# **updateInterestCategoryInterest**
> ListsUpdateInterestCategoryInterestResponse updateInterestCategoryInterest(listId, interestCategoryId, interestId, listsAddInterestInCategoryRequest).execute();

Update interest in category

Update interests or &#39;group names&#39; for a specific category.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String name = "name_example"; // The name of the interest. This can be shown publicly on a subscription form.
    String listId = "listId_example"; // The unique ID for the list.
    String interestCategoryId = "interestCategoryId_example"; // The unique ID for the interest category.
    String interestId = "interestId_example"; // The specific interest or 'group name'.
    Integer displayOrder = 56; // The display order for interests.
    try {
      ListsUpdateInterestCategoryInterestResponse result = client
              .lists
              .updateInterestCategoryInterest(name, listId, interestCategoryId, interestId)
              .displayOrder(displayOrder)
              .execute();
      System.out.println(result);
      System.out.println(result.getCategoryId());
      System.out.println(result.getListId());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getSubscriberCount());
      System.out.println(result.getDisplayOrder());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#updateInterestCategoryInterest");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsUpdateInterestCategoryInterestResponse> response = client
              .lists
              .updateInterestCategoryInterest(name, listId, interestCategoryId, interestId)
              .displayOrder(displayOrder)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#updateInterestCategoryInterest");
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
| **interestCategoryId** | **String**| The unique ID for the interest category. | |
| **interestId** | **String**| The specific interest or &#39;group name&#39;. | |
| **listsAddInterestInCategoryRequest** | [**ListsAddInterestInCategoryRequest**](ListsAddInterestInCategoryRequest.md)|  | |

### Return type

[**ListsUpdateInterestCategoryInterestResponse**](ListsUpdateInterestCategoryInterestResponse.md)

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

<a name="updateMember"></a>
# **updateMember**
> ListsUpdateMemberResponse updateMember(listId, subscriberHash, listsUpdateMemberRequest).skipMergeValidation(skipMergeValidation).execute();

Update list member

Update information for a specific list member.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String subscriberHash = "subscriberHash_example"; // The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
    String emailAddress = "emailAddress_example"; // Email address for a subscriber.
    String emailType = "emailType_example"; // Type of email this member asked to get ('html' or 'text').
    String status = "subscribed"; // Subscriber's current status.
    Map<String, Object> mergeFields = new HashMap(); // A dictionary of merge fields where the keys are the merge tags. See the [Merge Fields documentation](https://mailchimp.com/developer/marketing/docs/merge-fields/#structure) for more about the structure.
    Map<String, Boolean> interests = new HashMap(); // The key of this object's properties is the ID of the interest in question.
    String language = "language_example"; // If set/detected, the [subscriber's language](https://mailchimp.com/help/view-and-edit-contact-languages/).
    Boolean vip = true; // [VIP status](https://mailchimp.com/help/designate-and-send-to-vip-contacts/) for subscriber.
    LocationProperty location = new LocationProperty();
    List<MarketingPermission> marketingPermissions = Arrays.asList(); // The marketing permissions for the subscriber.
    String ipSignup = "ipSignup_example"; // IP address the subscriber signed up from.
    OffsetDateTime timestampSignup = OffsetDateTime.now(); // The date and time the subscriber signed up for the list in ISO 8601 format.
    String ipOpt = "ipOpt_example"; // The IP address the subscriber used to confirm their opt-in status.
    OffsetDateTime timestampOpt = OffsetDateTime.now(); // The date and time the subscriber confirmed their opt-in status in ISO 8601 format.
    Boolean skipMergeValidation = true; // If skip_merge_validation is true, member data will be accepted without merge field values, even if the merge field is usually required. This defaults to false.
    try {
      ListsUpdateMemberResponse result = client
              .lists
              .updateMember(listId, subscriberHash)
              .emailAddress(emailAddress)
              .emailType(emailType)
              .status(status)
              .mergeFields(mergeFields)
              .interests(interests)
              .language(language)
              .vip(vip)
              .location(location)
              .marketingPermissions(marketingPermissions)
              .ipSignup(ipSignup)
              .timestampSignup(timestampSignup)
              .ipOpt(ipOpt)
              .timestampOpt(timestampOpt)
              .skipMergeValidation(skipMergeValidation)
              .execute();
      System.out.println(result);
      System.out.println(result.getTags());
      System.out.println(result.getId());
      System.out.println(result.getEmailAddress());
      System.out.println(result.getUniqueEmailId());
      System.out.println(result.getContactId());
      System.out.println(result.getFullName());
      System.out.println(result.getWebId());
      System.out.println(result.getEmailType());
      System.out.println(result.getStatus());
      System.out.println(result.getUnsubscribeReason());
      System.out.println(result.getConsentsToOneToOneMessaging());
      System.out.println(result.getSmsPhoneNumber());
      System.out.println(result.getSmsSubscriptionStatus());
      System.out.println(result.getSmsSubscriptionLastUpdated());
      System.out.println(result.getMergeFields());
      System.out.println(result.getInterests());
      System.out.println(result.getStats());
      System.out.println(result.getIpSignup());
      System.out.println(result.getTimestampSignup());
      System.out.println(result.getIpOpt());
      System.out.println(result.getTimestampOpt());
      System.out.println(result.getMemberRating());
      System.out.println(result.getLastChanged());
      System.out.println(result.getLanguage());
      System.out.println(result.getVip());
      System.out.println(result.getEmailClient());
      System.out.println(result.getLocation());
      System.out.println(result.getMarketingPermissions());
      System.out.println(result.getLastNote());
      System.out.println(result.getSource());
      System.out.println(result.getTagsCount());
      System.out.println(result.getListId());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#updateMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsUpdateMemberResponse> response = client
              .lists
              .updateMember(listId, subscriberHash)
              .emailAddress(emailAddress)
              .emailType(emailType)
              .status(status)
              .mergeFields(mergeFields)
              .interests(interests)
              .language(language)
              .vip(vip)
              .location(location)
              .marketingPermissions(marketingPermissions)
              .ipSignup(ipSignup)
              .timestampSignup(timestampSignup)
              .ipOpt(ipOpt)
              .timestampOpt(timestampOpt)
              .skipMergeValidation(skipMergeValidation)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#updateMember");
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
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. | |
| **listsUpdateMemberRequest** | [**ListsUpdateMemberRequest**](ListsUpdateMemberRequest.md)|  | |
| **skipMergeValidation** | **Boolean**| If skip_merge_validation is true, member data will be accepted without merge field values, even if the merge field is usually required. This defaults to false. | [optional] |

### Return type

[**ListsUpdateMemberResponse**](ListsUpdateMemberResponse.md)

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

<a name="updateMergeField"></a>
# **updateMergeField**
> ListsUpdateMergeFieldResponse updateMergeField(listId, mergeId, listsUpdateMergeFieldRequest).execute();

Update merge field

Update a specific merge field.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String name = "name_example"; // The name of the merge field (audience field).
    String listId = "listId_example"; // The unique ID for the list.
    String mergeId = "mergeId_example"; // The id for the merge field.
    String tag = "tag_example"; // The merge tag used for Mailchimp campaigns and [adding contact information](https://mailchimp.com/developer/marketing/docs/merge-fields/#add-merge-data-to-contacts).
    Boolean required = true; // Whether the merge field is required to import a contact.
    String defaultValue = "defaultValue_example"; // The default value for the merge field if `null`.
    Boolean _public = true; // Whether the merge field is displayed on the signup form.
    Integer displayOrder = 56; // The order that the merge field displays on the list signup form.
    MergeFieldOptionsProperty1 options = new MergeFieldOptionsProperty1();
    String helpText = "helpText_example"; // Extra text to help the subscriber fill out the form.
    try {
      ListsUpdateMergeFieldResponse result = client
              .lists
              .updateMergeField(name, listId, mergeId)
              .tag(tag)
              .required(required)
              .defaultValue(defaultValue)
              ._public(_public)
              .displayOrder(displayOrder)
              .options(options)
              .helpText(helpText)
              .execute();
      System.out.println(result);
      System.out.println(result.getMergeId());
      System.out.println(result.getTag());
      System.out.println(result.getName());
      System.out.println(result.getType());
      System.out.println(result.getRequired());
      System.out.println(result.getDefaultValue());
      System.out.println(result.getPublic());
      System.out.println(result.getDisplayOrder());
      System.out.println(result.getOptions());
      System.out.println(result.getHelpText());
      System.out.println(result.getListId());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#updateMergeField");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsUpdateMergeFieldResponse> response = client
              .lists
              .updateMergeField(name, listId, mergeId)
              .tag(tag)
              .required(required)
              .defaultValue(defaultValue)
              ._public(_public)
              .displayOrder(displayOrder)
              .options(options)
              .helpText(helpText)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#updateMergeField");
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
| **mergeId** | **String**| The id for the merge field. | |
| **listsUpdateMergeFieldRequest** | [**ListsUpdateMergeFieldRequest**](ListsUpdateMergeFieldRequest.md)|  | |

### Return type

[**ListsUpdateMergeFieldResponse**](ListsUpdateMergeFieldResponse.md)

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

<a name="updateNoteSpecificListMember"></a>
# **updateNoteSpecificListMember**
> ListsUpdateNoteSpecificListMemberResponse updateNoteSpecificListMember(listId, subscriberHash, noteId, listsAddMemberNoteRequest).execute();

Update note

Update a specific note for a specific list member.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String subscriberHash = "subscriberHash_example"; // The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
    String noteId = "noteId_example"; // The id for the note.
    String note = "note_example"; // The content of the note. Note length is limited to 1,000 characters.
    try {
      ListsUpdateNoteSpecificListMemberResponse result = client
              .lists
              .updateNoteSpecificListMember(listId, subscriberHash, noteId)
              .note(note)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getNote());
      System.out.println(result.getListId());
      System.out.println(result.getEmailId());
      System.out.println(result.getContactId());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#updateNoteSpecificListMember");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsUpdateNoteSpecificListMemberResponse> response = client
              .lists
              .updateNoteSpecificListMember(listId, subscriberHash, noteId)
              .note(note)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#updateNoteSpecificListMember");
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
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. | |
| **noteId** | **String**| The id for the note. | |
| **listsAddMemberNoteRequest** | [**ListsAddMemberNoteRequest**](ListsAddMemberNoteRequest.md)|  | |

### Return type

[**ListsUpdateNoteSpecificListMemberResponse**](ListsUpdateNoteSpecificListMemberResponse.md)

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

<a name="updateSegmentById"></a>
# **updateSegmentById**
> ListsUpdateSegmentByIdResponse updateSegmentById(listId, segmentId, listsUpdateSegmentByIdRequest).execute();

Update segment

Update a specific segment in a list.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String name = "name_example"; // The name of the segment.
    String listId = "listId_example"; // The unique ID for the list.
    String segmentId = "segmentId_example"; // The unique id for the segment.
    List<String> staticSegment = Arrays.asList(); // An array of emails to be used for a static segment. Any emails provided that are not present on the list will be ignored. Passing an empty array for an existing static segment will reset that segment and remove all members. This field cannot be provided with the `options` field.
    ConditionsProperty1 options = new ConditionsProperty1();
    try {
      ListsUpdateSegmentByIdResponse result = client
              .lists
              .updateSegmentById(name, listId, segmentId)
              .staticSegment(staticSegment)
              .options(options)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getMemberCount());
      System.out.println(result.getType());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getOptions());
      System.out.println(result.getListId());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#updateSegmentById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsUpdateSegmentByIdResponse> response = client
              .lists
              .updateSegmentById(name, listId, segmentId)
              .staticSegment(staticSegment)
              .options(options)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#updateSegmentById");
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
| **segmentId** | **String**| The unique id for the segment. | |
| **listsUpdateSegmentByIdRequest** | [**ListsUpdateSegmentByIdRequest**](ListsUpdateSegmentByIdRequest.md)|  | |

### Return type

[**ListsUpdateSegmentByIdResponse**](ListsUpdateSegmentByIdResponse.md)

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
> ListsUpdateSettingsResponse updateSettings(listId, listsUpdateSettingsRequest).execute();

Update lists

Update the settings for a specific list.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String name = "name_example"; // The name of the list.
    ListContactProperty1 contact = new ListContactProperty1();
    String permissionReminder = "permissionReminder_example"; // The [permission reminder](https://mailchimp.com/help/edit-the-permission-reminder/) for the list.
    CampaignDefaultsProperty campaignDefaults = new CampaignDefaultsProperty();
    Boolean emailTypeOption = true; // Whether the list supports [multiple formats for emails](https://mailchimp.com/help/change-audience-name-defaults/). When set to `true`, subscribers can choose whether they want to receive HTML or plain-text emails. When set to `false`, subscribers will receive HTML emails, with a plain-text alternative backup.
    String listId = "listId_example"; // The unique ID for the list.
    Boolean useArchiveBar = false; // Whether campaigns for this list use the [Archive Bar](https://mailchimp.com/help/about-email-campaign-archives-and-pages/) in archives by default.
    String notifyOnSubscribe = "false"; // The email address to send [subscribe notifications](https://mailchimp.com/help/change-subscribe-and-unsubscribe-notifications/) to.
    String notifyOnUnsubscribe = "false"; // The email address to send [unsubscribe notifications](https://mailchimp.com/help/change-subscribe-and-unsubscribe-notifications/) to.
    Boolean doubleOptin = false; // Whether or not to require the subscriber to confirm subscription via email.
    Boolean marketingPermissions = false; // Whether or not the list has marketing permissions (eg. GDPR) enabled.
    try {
      ListsUpdateSettingsResponse result = client
              .lists
              .updateSettings(name, contact, permissionReminder, campaignDefaults, emailTypeOption, listId)
              .useArchiveBar(useArchiveBar)
              .notifyOnSubscribe(notifyOnSubscribe)
              .notifyOnUnsubscribe(notifyOnUnsubscribe)
              .doubleOptin(doubleOptin)
              .marketingPermissions(marketingPermissions)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getWebId());
      System.out.println(result.getName());
      System.out.println(result.getContact());
      System.out.println(result.getPermissionReminder());
      System.out.println(result.getUseArchiveBar());
      System.out.println(result.getCampaignDefaults());
      System.out.println(result.getNotifyOnSubscribe());
      System.out.println(result.getNotifyOnUnsubscribe());
      System.out.println(result.getDateCreated());
      System.out.println(result.getListRating());
      System.out.println(result.getEmailTypeOption());
      System.out.println(result.getSubscribeUrlShort());
      System.out.println(result.getSubscribeUrlLong());
      System.out.println(result.getBeamerAddress());
      System.out.println(result.getVisibility());
      System.out.println(result.getDoubleOptin());
      System.out.println(result.getHasWelcome());
      System.out.println(result.getMarketingPermissions());
      System.out.println(result.getModules());
      System.out.println(result.getStats());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#updateSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsUpdateSettingsResponse> response = client
              .lists
              .updateSettings(name, contact, permissionReminder, campaignDefaults, emailTypeOption, listId)
              .useArchiveBar(useArchiveBar)
              .notifyOnSubscribe(notifyOnSubscribe)
              .notifyOnUnsubscribe(notifyOnUnsubscribe)
              .doubleOptin(doubleOptin)
              .marketingPermissions(marketingPermissions)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#updateSettings");
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
| **listsUpdateSettingsRequest** | [**ListsUpdateSettingsRequest**](ListsUpdateSettingsRequest.md)|  | |

### Return type

[**ListsUpdateSettingsResponse**](ListsUpdateSettingsResponse.md)

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

<a name="updateWebhookSettings"></a>
# **updateWebhookSettings**
> ListsUpdateWebhookSettingsResponse updateWebhookSettings(listId, webhookId, listsCreateWebhookRequest).execute();

Update webhook

Update the settings for an existing webhook.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String webhookId = "webhookId_example"; // The webhook's id.
    String url = "url_example"; // A valid URL for the Webhook.
    EventsProperty events = new EventsProperty();
    SourcesProperty sources = new SourcesProperty();
    try {
      ListsUpdateWebhookSettingsResponse result = client
              .lists
              .updateWebhookSettings(listId, webhookId)
              .url(url)
              .events(events)
              .sources(sources)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUrl());
      System.out.println(result.getEvents());
      System.out.println(result.getSources());
      System.out.println(result.getListId());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#updateWebhookSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsUpdateWebhookSettingsResponse> response = client
              .lists
              .updateWebhookSettings(listId, webhookId)
              .url(url)
              .events(events)
              .sources(sources)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#updateWebhookSettings");
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
| **webhookId** | **String**| The webhook&#39;s id. | |
| **listsCreateWebhookRequest** | [**ListsCreateWebhookRequest**](ListsCreateWebhookRequest.md)|  | |

### Return type

[**ListsUpdateWebhookSettingsResponse**](ListsUpdateWebhookSettingsResponse.md)

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

<a name="viewRecentActivity"></a>
# **viewRecentActivity**
> ListsViewRecentActivityResponse viewRecentActivity(listId, subscriberHash).fields(fields).excludeFields(excludeFields).count(count).offset(offset).activityFilters(activityFilters).execute();

View recent activity

Get a member&#39;s activity on a specific list, including opens, clicks, and unsubscribes.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String subscriberHash = "subscriberHash_example"; // The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    List<String> activityFilters = Arrays.asList(); // A comma-separated list of activity filters that correspond to a set of activity types, e.g \"?activity_filters=open,bounce,click\".
    try {
      ListsViewRecentActivityResponse result = client
              .lists
              .viewRecentActivity(listId, subscriberHash)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .activityFilters(activityFilters)
              .execute();
      System.out.println(result);
      System.out.println(result.getActivity());
      System.out.println(result.getEmailId());
      System.out.println(result.getListId());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#viewRecentActivity");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsViewRecentActivityResponse> response = client
              .lists
              .viewRecentActivity(listId, subscriberHash)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .activityFilters(activityFilters)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#viewRecentActivity");
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
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **activityFilters** | [**List&lt;String&gt;**](String.md)| A comma-separated list of activity filters that correspond to a set of activity types, e.g \&quot;?activity_filters&#x3D;open,bounce,click\&quot;. | [optional] [enum: ["bounce"], ["click"], ["conversation"], ["ecommerce_signup"], ["event"], ["web_engagement"], ["generic_signup"], ["landing_page_signup"], ["marketing_permission"], ["note"], ["open"], ["order"], ["postcard_sent"], ["sent"], ["signup"], ["squatter_signup"], ["unsub"], ["website_signup"], ["survey_response"], ["sms_bulk_sent"], ["inbox_thread"]] |

### Return type

[**ListsViewRecentActivityResponse**](ListsViewRecentActivityResponse.md)

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

<a name="viewRecentActivityEvents"></a>
# **viewRecentActivityEvents**
> ListsViewRecentActivityEventsResponse viewRecentActivityEvents(listId, subscriberHash).fields(fields).excludeFields(excludeFields).action(action).execute();

View recent activity 50

Get the last 50 events of a member&#39;s activity on a specific list, including opens, clicks, and unsubscribes.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ListsApi;
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
    String subscriberHash = "subscriberHash_example"; // The MD5 hash of the lowercase version of the list member's email address. This endpoint also accepts a list member's email address or contact_id.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    List<String> action = Arrays.asList(); // A comma seperated list of actions to return.
    try {
      ListsViewRecentActivityEventsResponse result = client
              .lists
              .viewRecentActivityEvents(listId, subscriberHash)
              .fields(fields)
              .excludeFields(excludeFields)
              .action(action)
              .execute();
      System.out.println(result);
      System.out.println(result.getActivity());
      System.out.println(result.getEmailId());
      System.out.println(result.getContactId());
      System.out.println(result.getListId());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#viewRecentActivityEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListsViewRecentActivityEventsResponse> response = client
              .lists
              .viewRecentActivityEvents(listId, subscriberHash)
              .fields(fields)
              .excludeFields(excludeFields)
              .action(action)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#viewRecentActivityEvents");
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
| **subscriberHash** | **String**| The MD5 hash of the lowercase version of the list member&#39;s email address. This endpoint also accepts a list member&#39;s email address or contact_id. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **action** | [**List&lt;String&gt;**](String.md)| A comma seperated list of actions to return. | [optional] [enum: ["abuse"], ["bounce"], ["click"], ["open"], ["sent"], ["unsub"], ["ecomm"]] |

### Return type

[**ListsViewRecentActivityEventsResponse**](ListsViewRecentActivityEventsResponse.md)

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

