# ReportingApi

All URIs are relative to *https://server.api.mailchimp.com/3.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**facebookAdReport**](ReportingApi.md#facebookAdReport) | **GET** /reporting/facebook-ads/{outreach_id} | Get facebook ad report |
| [**getLandingPageReport**](ReportingApi.md#getLandingPageReport) | **GET** /reporting/landing-pages/{outreach_id} | Get landing page report |
| [**getSurveyReport**](ReportingApi.md#getSurveyReport) | **GET** /reporting/surveys/{survey_id} | Get survey report |
| [**listFacebookAdsReports**](ReportingApi.md#listFacebookAdsReports) | **GET** /reporting/facebook-ads | List facebook ads reports |
| [**listFacebookEcommerceReport**](ReportingApi.md#listFacebookEcommerceReport) | **GET** /reporting/facebook-ads/{outreach_id}/ecommerce-product-activity | List facebook ecommerce report |
| [**listLandingPagesReports**](ReportingApi.md#listLandingPagesReports) | **GET** /reporting/landing-pages | List landing pages reports |
| [**listSurveyQuestionsReports**](ReportingApi.md#listSurveyQuestionsReports) | **GET** /reporting/surveys/{survey_id}/questions | List survey question reports |
| [**listSurveyReports**](ReportingApi.md#listSurveyReports) | **GET** /reporting/surveys | List survey reports |
| [**singleSurveyResponse**](ReportingApi.md#singleSurveyResponse) | **GET** /reporting/surveys/{survey_id}/responses/{response_id} | Get survey response |
| [**surveyQuestionAnswersList**](ReportingApi.md#surveyQuestionAnswersList) | **GET** /reporting/surveys/{survey_id}/questions/{question_id}/answers | List answers for question |
| [**surveyQuestionReport**](ReportingApi.md#surveyQuestionReport) | **GET** /reporting/surveys/{survey_id}/questions/{question_id} | Get survey question report |
| [**surveyResponsesList**](ReportingApi.md#surveyResponsesList) | **GET** /reporting/surveys/{survey_id}/responses | List survey responses |


<a name="facebookAdReport"></a>
# **facebookAdReport**
> ReportingFacebookAdReportResponse facebookAdReport(outreachId).fields(fields).excludeFields(excludeFields).execute();

Get facebook ad report

Get report of a Facebook ad.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportingApi;
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
      ReportingFacebookAdReportResponse result = client
              .reporting
              .facebookAdReport(outreachId)
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
      System.out.println(result.getChannel());
      System.out.println(result.getAudience());
      System.out.println(result.getBudget());
      System.out.println(result.getAudienceActivity());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#facebookAdReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportingFacebookAdReportResponse> response = client
              .reporting
              .facebookAdReport(outreachId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#facebookAdReport");
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

[**ReportingFacebookAdReportResponse**](ReportingFacebookAdReportResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Facebook Ad report Instance |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="getLandingPageReport"></a>
# **getLandingPageReport**
> ReportingGetLandingPageReportResponse getLandingPageReport(outreachId).fields(fields).excludeFields(excludeFields).execute();

Get landing page report

Get report of a landing page.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportingApi;
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
      ReportingGetLandingPageReportResponse result = client
              .reporting
              .getLandingPageReport(outreachId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getUrl());
      System.out.println(result.getPublishedAt());
      System.out.println(result.getUnpublishedAt());
      System.out.println(result.getStatus());
      System.out.println(result.getListId());
      System.out.println(result.getVisits());
      System.out.println(result.getUniqueVisits());
      System.out.println(result.getSubscribes());
      System.out.println(result.getClicks());
      System.out.println(result.getConversionRate());
      System.out.println(result.getTimeseries());
      System.out.println(result.getEcommerce());
      System.out.println(result.getWebId());
      System.out.println(result.getListName());
      System.out.println(result.getSignupTags());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#getLandingPageReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportingGetLandingPageReportResponse> response = client
              .reporting
              .getLandingPageReport(outreachId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#getLandingPageReport");
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

[**ReportingGetLandingPageReportResponse**](ReportingGetLandingPageReportResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Landing Page Report Instance |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="getSurveyReport"></a>
# **getSurveyReport**
> ReportingGetSurveyReportResponse getSurveyReport(surveyId).fields(fields).excludeFields(excludeFields).execute();

Get survey report

Get report for a survey.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportingApi;
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
    String surveyId = "surveyId_example"; // The ID of the survey.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      ReportingGetSurveyReportResponse result = client
              .reporting
              .getSurveyReport(surveyId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getId());
      System.out.println(result.getWebId());
      System.out.println(result.getListId());
      System.out.println(result.getListName());
      System.out.println(result.getUrl());
      System.out.println(result.getStatus());
      System.out.println(result.getPublishedAt());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getTotalResponses());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#getSurveyReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportingGetSurveyReportResponse> response = client
              .reporting
              .getSurveyReport(surveyId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#getSurveyReport");
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
| **surveyId** | **String**| The ID of the survey. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ReportingGetSurveyReportResponse**](ReportingGetSurveyReportResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Survey Report Instance |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="listFacebookAdsReports"></a>
# **listFacebookAdsReports**
> ReportingListFacebookAdsReportsResponse listFacebookAdsReports().fields(fields).excludeFields(excludeFields).count(count).offset(offset).sortField(sortField).sortDir(sortDir).execute();

List facebook ads reports

Get reports of Facebook ads.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportingApi;
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
      ReportingListFacebookAdsReportsResponse result = client
              .reporting
              .listFacebookAdsReports()
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
      System.err.println("Exception when calling ReportingApi#listFacebookAdsReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportingListFacebookAdsReportsResponse> response = client
              .reporting
              .listFacebookAdsReports()
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
      System.err.println("Exception when calling ReportingApi#listFacebookAdsReports");
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

[**ReportingListFacebookAdsReportsResponse**](ReportingListFacebookAdsReportsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Facebook Ad Report Instances |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="listFacebookEcommerceReport"></a>
# **listFacebookEcommerceReport**
> ReportingListFacebookEcommerceReportResponse listFacebookEcommerceReport(outreachId).fields(fields).excludeFields(excludeFields).count(count).offset(offset).sortField(sortField).execute();

List facebook ecommerce report

Get breakdown of product activity for an outreach.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportingApi;
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
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    String sortField = "title"; // Returns files sorted by the specified field.
    try {
      ReportingListFacebookEcommerceReportResponse result = client
              .reporting
              .listFacebookEcommerceReport(outreachId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .sortField(sortField)
              .execute();
      System.out.println(result);
      System.out.println(result.getProducts());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#listFacebookEcommerceReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportingListFacebookEcommerceReportResponse> response = client
              .reporting
              .listFacebookEcommerceReport(outreachId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .sortField(sortField)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#listFacebookEcommerceReport");
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
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **sortField** | **String**| Returns files sorted by the specified field. | [optional] [enum: title, total_revenue, total_purchased] |

### Return type

[**ReportingListFacebookEcommerceReportResponse**](ReportingListFacebookEcommerceReportResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ecommerce Product Activity Instance |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="listLandingPagesReports"></a>
# **listLandingPagesReports**
> ReportingListLandingPagesReportsResponse listLandingPagesReports().fields(fields).excludeFields(excludeFields).count(count).offset(offset).execute();

List landing pages reports

Get reports of landing pages.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportingApi;
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
    try {
      ReportingListLandingPagesReportsResponse result = client
              .reporting
              .listLandingPagesReports()
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getLandingPages());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#listLandingPagesReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportingListLandingPagesReportsResponse> response = client
              .reporting
              .listLandingPagesReports()
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
      System.err.println("Exception when calling ReportingApi#listLandingPagesReports");
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

### Return type

[**ReportingListLandingPagesReportsResponse**](ReportingListLandingPagesReportsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Landing Page Report Instances |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="listSurveyQuestionsReports"></a>
# **listSurveyQuestionsReports**
> ReportingListSurveyQuestionsReportsResponse listSurveyQuestionsReports(surveyId).fields(fields).excludeFields(excludeFields).execute();

List survey question reports

Get reports for survey questions.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportingApi;
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
    String surveyId = "surveyId_example"; // The ID of the survey.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      ReportingListSurveyQuestionsReportsResponse result = client
              .reporting
              .listSurveyQuestionsReports(surveyId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getQuestions());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#listSurveyQuestionsReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportingListSurveyQuestionsReportsResponse> response = client
              .reporting
              .listSurveyQuestionsReports(surveyId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#listSurveyQuestionsReports");
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
| **surveyId** | **String**| The ID of the survey. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ReportingListSurveyQuestionsReportsResponse**](ReportingListSurveyQuestionsReportsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Survey Question Report Instances |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="listSurveyReports"></a>
# **listSurveyReports**
> ReportingListSurveyReportsResponse listSurveyReports().fields(fields).excludeFields(excludeFields).count(count).offset(offset).execute();

List survey reports

Get reports for surveys.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportingApi;
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
    try {
      ReportingListSurveyReportsResponse result = client
              .reporting
              .listSurveyReports()
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getSurveys());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#listSurveyReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportingListSurveyReportsResponse> response = client
              .reporting
              .listSurveyReports()
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
      System.err.println("Exception when calling ReportingApi#listSurveyReports");
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

### Return type

[**ReportingListSurveyReportsResponse**](ReportingListSurveyReportsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Survey Report Instances |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="singleSurveyResponse"></a>
# **singleSurveyResponse**
> ReportingSingleSurveyResponseResponse singleSurveyResponse(surveyId, responseId).execute();

Get survey response

Get a single survey response.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportingApi;
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
    String surveyId = "surveyId_example"; // The ID of the survey.
    String responseId = "responseId_example"; // The ID of the survey response.
    try {
      ReportingSingleSurveyResponseResponse result = client
              .reporting
              .singleSurveyResponse(surveyId, responseId)
              .execute();
      System.out.println(result);
      System.out.println(result.getResponseId());
      System.out.println(result.getSubmittedAt());
      System.out.println(result.getContact());
      System.out.println(result.getIsNewContact());
      System.out.println(result.getResults());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#singleSurveyResponse");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportingSingleSurveyResponseResponse> response = client
              .reporting
              .singleSurveyResponse(surveyId, responseId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#singleSurveyResponse");
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
| **surveyId** | **String**| The ID of the survey. | |
| **responseId** | **String**| The ID of the survey response. | |

### Return type

[**ReportingSingleSurveyResponseResponse**](ReportingSingleSurveyResponseResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a single survey response. |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="surveyQuestionAnswersList"></a>
# **surveyQuestionAnswersList**
> ReportingSurveyQuestionAnswersListResponse surveyQuestionAnswersList(surveyId, questionId).fields(fields).excludeFields(excludeFields).respondentFamiliarityIs(respondentFamiliarityIs).execute();

List answers for question

Get answers for a survey question.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportingApi;
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
    String surveyId = "surveyId_example"; // The ID of the survey.
    String questionId = "questionId_example"; // The ID of the survey question.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    String respondentFamiliarityIs = "new"; // Filter survey responses by familiarity of the respondents.
    try {
      ReportingSurveyQuestionAnswersListResponse result = client
              .reporting
              .surveyQuestionAnswersList(surveyId, questionId)
              .fields(fields)
              .excludeFields(excludeFields)
              .respondentFamiliarityIs(respondentFamiliarityIs)
              .execute();
      System.out.println(result);
      System.out.println(result.getAnswers());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#surveyQuestionAnswersList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportingSurveyQuestionAnswersListResponse> response = client
              .reporting
              .surveyQuestionAnswersList(surveyId, questionId)
              .fields(fields)
              .excludeFields(excludeFields)
              .respondentFamiliarityIs(respondentFamiliarityIs)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#surveyQuestionAnswersList");
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
| **surveyId** | **String**| The ID of the survey. | |
| **questionId** | **String**| The ID of the survey question. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **respondentFamiliarityIs** | **String**| Filter survey responses by familiarity of the respondents. | [optional] [enum: new, known, unknown] |

### Return type

[**ReportingSurveyQuestionAnswersListResponse**](ReportingSurveyQuestionAnswersListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Survey Question Answers |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="surveyQuestionReport"></a>
# **surveyQuestionReport**
> ReportingSurveyQuestionReportResponse surveyQuestionReport(surveyId, questionId).fields(fields).excludeFields(excludeFields).execute();

Get survey question report

Get report for a survey question.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportingApi;
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
    String surveyId = "surveyId_example"; // The ID of the survey.
    String questionId = "questionId_example"; // The ID of the survey question.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      ReportingSurveyQuestionReportResponse result = client
              .reporting
              .surveyQuestionReport(surveyId, questionId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getSurveyId());
      System.out.println(result.getQuery());
      System.out.println(result.getType());
      System.out.println(result.getTotalResponses());
      System.out.println(result.getIsRequired());
      System.out.println(result.getHasOther());
      System.out.println(result.getOtherLabel());
      System.out.println(result.getAverageRating());
      System.out.println(result.getRangeLowLabel());
      System.out.println(result.getRangeHighLabel());
      System.out.println(result.getPlaceholderLabel());
      System.out.println(result.getSubscribeCheckboxEnabled());
      System.out.println(result.getSubscribeCheckboxLabel());
      System.out.println(result.getMergeField());
      System.out.println(result.getOptions());
      System.out.println(result.getContactCounts());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#surveyQuestionReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportingSurveyQuestionReportResponse> response = client
              .reporting
              .surveyQuestionReport(surveyId, questionId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#surveyQuestionReport");
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
| **surveyId** | **String**| The ID of the survey. | |
| **questionId** | **String**| The ID of the survey question. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**ReportingSurveyQuestionReportResponse**](ReportingSurveyQuestionReportResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Survey Question Report Instance |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="surveyResponsesList"></a>
# **surveyResponsesList**
> ReportingSurveyResponsesListResponse surveyResponsesList(surveyId).fields(fields).excludeFields(excludeFields).answeredQuestion(answeredQuestion).choseAnswer(choseAnswer).respondentFamiliarityIs(respondentFamiliarityIs).execute();

List survey responses

Get responses to a survey.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportingApi;
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
    String surveyId = "surveyId_example"; // The ID of the survey.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Integer answeredQuestion = 56; // The ID of the question that was answered.
    String choseAnswer = "choseAnswer_example"; // The ID of the option chosen to filter responses on.
    String respondentFamiliarityIs = "new"; // Filter survey responses by familiarity of the respondents.
    try {
      ReportingSurveyResponsesListResponse result = client
              .reporting
              .surveyResponsesList(surveyId)
              .fields(fields)
              .excludeFields(excludeFields)
              .answeredQuestion(answeredQuestion)
              .choseAnswer(choseAnswer)
              .respondentFamiliarityIs(respondentFamiliarityIs)
              .execute();
      System.out.println(result);
      System.out.println(result.getResponses());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#surveyResponsesList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportingSurveyResponsesListResponse> response = client
              .reporting
              .surveyResponsesList(surveyId)
              .fields(fields)
              .excludeFields(excludeFields)
              .answeredQuestion(answeredQuestion)
              .choseAnswer(choseAnswer)
              .respondentFamiliarityIs(respondentFamiliarityIs)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingApi#surveyResponsesList");
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
| **surveyId** | **String**| The ID of the survey. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **answeredQuestion** | **Integer**| The ID of the question that was answered. | [optional] |
| **choseAnswer** | **String**| The ID of the option chosen to filter responses on. | [optional] |
| **respondentFamiliarityIs** | **String**| Filter survey responses by familiarity of the respondents. | [optional] [enum: new, known, unknown] |

### Return type

[**ReportingSurveyResponsesListResponse**](ReportingSurveyResponsesListResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of survey responses |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

