# FacebookAdsApi

All URIs are relative to *https://server.api.mailchimp.com/3.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getInfo**](FacebookAdsApi.md#getInfo) | **GET** /facebook-ads/{outreach_id} | Get facebook ad info |
| [**listAds**](FacebookAdsApi.md#listAds) | **GET** /facebook-ads | List facebook ads |


<a name="getInfo"></a>
# **getInfo**
> FacebookAdsGetInfoResponse getInfo(outreachId).fields(fields).excludeFields(excludeFields).execute();

Get facebook ad info

Get details of a Facebook ad.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FacebookAdsApi;
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
    String outreachId = "outreachId_example"; // The outreach id.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      FacebookAdsGetInfoResponse result = client
              .facebookAds
              .getInfo(outreachId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getWebId());
      System.out.println(result.getName());
      System.out.println(result.getType());
      System.out.println(result.getStatus());
      System.out.println(result.getShowReport());
      System.out.println(result.getCreateTime());
      System.out.println(result.getStartTime());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getCanceledAt());
      System.out.println(result.getPublishedTime());
      System.out.println(result.getHasSegment());
      System.out.println(result.getReportSummary());
      System.out.println(result.getRecipients());
      System.out.println(result.getThumbnail());
      System.out.println(result.getEmailSourceName());
      System.out.println(result.getPausedAt());
      System.out.println(result.getEndTime());
      System.out.println(result.getNeedsAttention());
      System.out.println(result.getWasCanceledByFacebook());
      System.out.println(result.getIsConnected());
      System.out.println(result.getHasAudience());
      System.out.println(result.getHasContent());
      System.out.println(result.getChannel());
      System.out.println(result.getFeedback());
      System.out.println(result.getSite());
      System.out.println(result.getAudience());
      System.out.println(result.getBudget());
      System.out.println(result.getContent());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling FacebookAdsApi#getInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FacebookAdsGetInfoResponse> response = client
              .facebookAds
              .getInfo(outreachId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FacebookAdsApi#getInfo");
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
| **outreachId** | **String**| The outreach id. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**FacebookAdsGetInfoResponse**](FacebookAdsGetInfoResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Facebook Ad Instance |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="listAds"></a>
# **listAds**
> FacebookAdsListAdsResponse listAds().fields(fields).excludeFields(excludeFields).count(count).offset(offset).sortField(sortField).sortDir(sortDir).execute();

List facebook ads

Get list of Facebook ads.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FacebookAdsApi;
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
    String sortField = "created_at"; // Returns files sorted by the specified field.
    String sortDir = "ASC"; // Determines the order direction for sorted results.
    try {
      FacebookAdsListAdsResponse result = client
              .facebookAds
              .listAds()
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .sortField(sortField)
              .sortDir(sortDir)
              .execute();
      System.out.println(result);
      System.out.println(result.getFacebookAds());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling FacebookAdsApi#listAds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<FacebookAdsListAdsResponse> response = client
              .facebookAds
              .listAds()
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
      System.err.println("Exception when calling FacebookAdsApi#listAds");
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
| **sortField** | **String**| Returns files sorted by the specified field. | [optional] [enum: created_at, updated_at, end_time] |
| **sortDir** | **String**| Determines the order direction for sorted results. | [optional] [enum: ASC, DESC] |

### Return type

[**FacebookAdsListAdsResponse**](FacebookAdsListAdsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Facebook Ad Instances |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

