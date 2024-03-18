# LandingPagesApi

All URIs are relative to *https://server.api.mailchimp.com/3.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewMailchimpLandingPage**](LandingPagesApi.md#createNewMailchimpLandingPage) | **POST** /landing-pages | Add landing page |
| [**deletePage**](LandingPagesApi.md#deletePage) | **DELETE** /landing-pages/{page_id} | Delete landing page |
| [**getContent**](LandingPagesApi.md#getContent) | **GET** /landing-pages/{page_id}/content | Get landing page content |
| [**getPageInfo**](LandingPagesApi.md#getPageInfo) | **GET** /landing-pages/{page_id} | Get landing page info |
| [**list**](LandingPagesApi.md#list) | **GET** /landing-pages | List landing pages |
| [**publishAction**](LandingPagesApi.md#publishAction) | **POST** /landing-pages/{page_id}/actions/publish | Publish landing page |
| [**unpublishAction**](LandingPagesApi.md#unpublishAction) | **POST** /landing-pages/{page_id}/actions/unpublish | Unpublish landing page |
| [**updatePageById**](LandingPagesApi.md#updatePageById) | **PATCH** /landing-pages/{page_id} | Update landing page |


<a name="createNewMailchimpLandingPage"></a>
# **createNewMailchimpLandingPage**
> LandingPagesCreateNewMailchimpLandingPageResponse createNewMailchimpLandingPage(landingPagesCreateNewMailchimpLandingPageRequest).useDefaultList(useDefaultList).execute();

Add landing page

Create a new Mailchimp landing page.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LandingPagesApi;
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
    String title = "title_example"; // The title of this landing page seen in the browser's title bar.
    String description = "description_example"; // The description of this landing page.
    String name = "name_example"; // The name of this landing page.
    String storeId = "storeId_example"; // The ID of the store associated with this landing page.
    String listId = "listId_example"; // The list's ID associated with this landing page.
    String type = "signup"; // The type of template the landing page has.
    Integer templateId = 56; // The template_id of this landing page.
    TrackingSettingsProperty tracking = new TrackingSettingsProperty();
    Boolean useDefaultList = true; // Will create the Landing Page using the account's Default List instead of requiring a list_id.
    try {
      LandingPagesCreateNewMailchimpLandingPageResponse result = client
              .landingPages
              .createNewMailchimpLandingPage()
              .title(title)
              .description(description)
              .name(name)
              .storeId(storeId)
              .listId(listId)
              .type(type)
              .templateId(templateId)
              .tracking(tracking)
              .useDefaultList(useDefaultList)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getTemplateId());
      System.out.println(result.getStatus());
      System.out.println(result.getListId());
      System.out.println(result.getStoreId());
      System.out.println(result.getWebId());
      System.out.println(result.getCreatedBySource());
      System.out.println(result.getUrl());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getPublishedAt());
      System.out.println(result.getUnpublishedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getTracking());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling LandingPagesApi#createNewMailchimpLandingPage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LandingPagesCreateNewMailchimpLandingPageResponse> response = client
              .landingPages
              .createNewMailchimpLandingPage()
              .title(title)
              .description(description)
              .name(name)
              .storeId(storeId)
              .listId(listId)
              .type(type)
              .templateId(templateId)
              .tracking(tracking)
              .useDefaultList(useDefaultList)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LandingPagesApi#createNewMailchimpLandingPage");
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
| **landingPagesCreateNewMailchimpLandingPageRequest** | [**LandingPagesCreateNewMailchimpLandingPageRequest**](LandingPagesCreateNewMailchimpLandingPageRequest.md)|  | |
| **useDefaultList** | **Boolean**| Will create the Landing Page using the account&#39;s Default List instead of requiring a list_id. | [optional] |

### Return type

[**LandingPagesCreateNewMailchimpLandingPageResponse**](LandingPagesCreateNewMailchimpLandingPageResponse.md)

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

<a name="deletePage"></a>
# **deletePage**
> deletePage(pageId).execute();

Delete landing page

Delete a landing page.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LandingPagesApi;
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
    String pageId = "pageId_example"; // The unique id for the page.
    try {
      client
              .landingPages
              .deletePage(pageId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LandingPagesApi#deletePage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .landingPages
              .deletePage(pageId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LandingPagesApi#deletePage");
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
| **pageId** | **String**| The unique id for the page. | |

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

<a name="getContent"></a>
# **getContent**
> LandingPagesGetContentResponse getContent(pageId).fields(fields).excludeFields(excludeFields).execute();

Get landing page content

Get the the HTML for your landing page.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LandingPagesApi;
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
    String pageId = "pageId_example"; // The unique id for the page.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      LandingPagesGetContentResponse result = client
              .landingPages
              .getContent(pageId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getHtml());
      System.out.println(result.getJson());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling LandingPagesApi#getContent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LandingPagesGetContentResponse> response = client
              .landingPages
              .getContent(pageId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LandingPagesApi#getContent");
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
| **pageId** | **String**| The unique id for the page. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**LandingPagesGetContentResponse**](LandingPagesGetContentResponse.md)

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

<a name="getPageInfo"></a>
# **getPageInfo**
> LandingPagesGetPageInfoResponse getPageInfo(pageId).fields(fields).excludeFields(excludeFields).execute();

Get landing page info

Get information about a specific page.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LandingPagesApi;
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
    String pageId = "pageId_example"; // The unique id for the page.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      LandingPagesGetPageInfoResponse result = client
              .landingPages
              .getPageInfo(pageId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getTemplateId());
      System.out.println(result.getStatus());
      System.out.println(result.getListId());
      System.out.println(result.getStoreId());
      System.out.println(result.getWebId());
      System.out.println(result.getCreatedBySource());
      System.out.println(result.getUrl());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getPublishedAt());
      System.out.println(result.getUnpublishedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getTracking());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling LandingPagesApi#getPageInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LandingPagesGetPageInfoResponse> response = client
              .landingPages
              .getPageInfo(pageId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LandingPagesApi#getPageInfo");
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
| **pageId** | **String**| The unique id for the page. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**LandingPagesGetPageInfoResponse**](LandingPagesGetPageInfoResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Landing Pages Instance |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="list"></a>
# **list**
> LandingPagesListResponse list().sortDir(sortDir).sortField(sortField).fields(fields).excludeFields(excludeFields).count(count).execute();

List landing pages

Get all landing pages.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LandingPagesApi;
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
    String sortDir = "ASC"; // Determines the order direction for sorted results.
    String sortField = "created_at"; // Returns files sorted by the specified field.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    try {
      LandingPagesListResponse result = client
              .landingPages
              .list()
              .sortDir(sortDir)
              .sortField(sortField)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .execute();
      System.out.println(result);
      System.out.println(result.getLandingPages());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling LandingPagesApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LandingPagesListResponse> response = client
              .landingPages
              .list()
              .sortDir(sortDir)
              .sortField(sortField)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LandingPagesApi#list");
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
| **sortDir** | **String**| Determines the order direction for sorted results. | [optional] [enum: ASC, DESC] |
| **sortField** | **String**| Returns files sorted by the specified field. | [optional] [enum: created_at, updated_at] |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |

### Return type

[**LandingPagesListResponse**](LandingPagesListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Landing Pages Collection |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="publishAction"></a>
# **publishAction**
> publishAction(pageId).execute();

Publish landing page

Publish a landing page that is in draft, unpublished, or has been previously published and edited.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LandingPagesApi;
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
    String pageId = "pageId_example"; // The unique id for the page.
    try {
      client
              .landingPages
              .publishAction(pageId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LandingPagesApi#publishAction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .landingPages
              .publishAction(pageId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LandingPagesApi#publishAction");
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
| **pageId** | **String**| The unique id for the page. | |

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

<a name="unpublishAction"></a>
# **unpublishAction**
> unpublishAction(pageId).execute();

Unpublish landing page

Unpublish a landing page that is in draft or has been published.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LandingPagesApi;
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
    String pageId = "pageId_example"; // The unique id for the page.
    try {
      client
              .landingPages
              .unpublishAction(pageId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LandingPagesApi#unpublishAction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .landingPages
              .unpublishAction(pageId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LandingPagesApi#unpublishAction");
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
| **pageId** | **String**| The unique id for the page. | |

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

<a name="updatePageById"></a>
# **updatePageById**
> LandingPagesUpdatePageByIdResponse updatePageById(pageId, landingPagesUpdatePageByIdRequest).execute();

Update landing page

Update a landing page.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LandingPagesApi;
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
    String pageId = "pageId_example"; // The unique id for the page.
    String title = "title_example"; // The title of this landing page seen in the browser's title bar.
    String description = "description_example"; // The description of this landing page.
    String name = "name_example"; // The name of this landing page.
    String storeId = "storeId_example"; // The ID of the store associated with this landing page.
    String listId = "listId_example"; // The list's ID associated with this landing page.
    TrackingSettingsProperty tracking = new TrackingSettingsProperty();
    try {
      LandingPagesUpdatePageByIdResponse result = client
              .landingPages
              .updatePageById(pageId)
              .title(title)
              .description(description)
              .name(name)
              .storeId(storeId)
              .listId(listId)
              .tracking(tracking)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getTemplateId());
      System.out.println(result.getStatus());
      System.out.println(result.getListId());
      System.out.println(result.getStoreId());
      System.out.println(result.getWebId());
      System.out.println(result.getCreatedBySource());
      System.out.println(result.getUrl());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getPublishedAt());
      System.out.println(result.getUnpublishedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getTracking());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling LandingPagesApi#updatePageById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LandingPagesUpdatePageByIdResponse> response = client
              .landingPages
              .updatePageById(pageId)
              .title(title)
              .description(description)
              .name(name)
              .storeId(storeId)
              .listId(listId)
              .tracking(tracking)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LandingPagesApi#updatePageById");
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
| **pageId** | **String**| The unique id for the page. | |
| **landingPagesUpdatePageByIdRequest** | [**LandingPagesUpdatePageByIdRequest**](LandingPagesUpdatePageByIdRequest.md)|  | |

### Return type

[**LandingPagesUpdatePageByIdResponse**](LandingPagesUpdatePageByIdResponse.md)

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

