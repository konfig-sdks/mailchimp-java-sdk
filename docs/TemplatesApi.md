# TemplatesApi

All URIs are relative to *https://server.api.mailchimp.com/3.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewTemplate**](TemplatesApi.md#createNewTemplate) | **POST** /templates | Add template |
| [**deleteSpecificTemplate**](TemplatesApi.md#deleteSpecificTemplate) | **DELETE** /templates/{template_id} | Delete template |
| [**getInfo**](TemplatesApi.md#getInfo) | **GET** /templates/{template_id} | Get template info |
| [**listAvailableTemplates**](TemplatesApi.md#listAvailableTemplates) | **GET** /templates | List templates |
| [**updateTemplateById**](TemplatesApi.md#updateTemplateById) | **PATCH** /templates/{template_id} | Update template |
| [**viewDefaultContent**](TemplatesApi.md#viewDefaultContent) | **GET** /templates/{template_id}/default-content | View default content |


<a name="createNewTemplate"></a>
# **createNewTemplate**
> TemplatesCreateNewTemplateResponse createNewTemplate(templatesCreateNewTemplateRequest).execute();

Add template

Create a new template for the account. Only Classic templates are supported.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplatesApi;
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
    String name = "name_example"; // The name of the template.
    String html = "html_example"; // The raw HTML for the template. We  support the Mailchimp [Template Language](https://mailchimp.com/help/getting-started-with-mailchimps-template-language/) in any HTML code passed via the API.
    String folderId = "folderId_example"; // The id of the folder the template is currently in.
    try {
      TemplatesCreateNewTemplateResponse result = client
              .templates
              .createNewTemplate(name, html)
              .folderId(folderId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getName());
      System.out.println(result.getDragAndDrop());
      System.out.println(result.getResponsive());
      System.out.println(result.getCategory());
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateEdited());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getEditedBy());
      System.out.println(result.getActive());
      System.out.println(result.getFolderId());
      System.out.println(result.getThumbnail());
      System.out.println(result.getShareUrl());
      System.out.println(result.getContentType());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#createNewTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TemplatesCreateNewTemplateResponse> response = client
              .templates
              .createNewTemplate(name, html)
              .folderId(folderId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#createNewTemplate");
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
| **templatesCreateNewTemplateRequest** | [**TemplatesCreateNewTemplateRequest**](TemplatesCreateNewTemplateRequest.md)|  | |

### Return type

[**TemplatesCreateNewTemplateResponse**](TemplatesCreateNewTemplateResponse.md)

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

<a name="deleteSpecificTemplate"></a>
# **deleteSpecificTemplate**
> deleteSpecificTemplate(templateId).execute();

Delete template

Delete a specific template.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplatesApi;
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
    String templateId = "templateId_example"; // The unique id for the template.
    try {
      client
              .templates
              .deleteSpecificTemplate(templateId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#deleteSpecificTemplate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .templates
              .deleteSpecificTemplate(templateId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#deleteSpecificTemplate");
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
| **templateId** | **String**| The unique id for the template. | |

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

<a name="getInfo"></a>
# **getInfo**
> TemplatesGetInfoResponse getInfo(templateId).fields(fields).excludeFields(excludeFields).execute();

Get template info

Get information about a specific template.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplatesApi;
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
    String templateId = "templateId_example"; // The unique id for the template.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      TemplatesGetInfoResponse result = client
              .templates
              .getInfo(templateId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getName());
      System.out.println(result.getDragAndDrop());
      System.out.println(result.getResponsive());
      System.out.println(result.getCategory());
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateEdited());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getEditedBy());
      System.out.println(result.getActive());
      System.out.println(result.getFolderId());
      System.out.println(result.getThumbnail());
      System.out.println(result.getShareUrl());
      System.out.println(result.getContentType());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#getInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TemplatesGetInfoResponse> response = client
              .templates
              .getInfo(templateId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#getInfo");
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
| **templateId** | **String**| The unique id for the template. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**TemplatesGetInfoResponse**](TemplatesGetInfoResponse.md)

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

<a name="listAvailableTemplates"></a>
# **listAvailableTemplates**
> TemplatesListAvailableTemplatesResponse listAvailableTemplates().fields(fields).excludeFields(excludeFields).count(count).offset(offset).createdBy(createdBy).sinceDateCreated(sinceDateCreated).beforeDateCreated(beforeDateCreated).type(type).category(category).folderId(folderId).sortField(sortField).contentType(contentType).sortDir(sortDir).execute();

List templates

Get a list of an account&#39;s available templates.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplatesApi;
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
    String createdBy = "createdBy_example"; // The Mailchimp account user who created the template.
    String sinceDateCreated = "sinceDateCreated_example"; // Restrict the response to templates created after the set date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
    String beforeDateCreated = "beforeDateCreated_example"; // Restrict the response to templates created before the set date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
    String type = "type_example"; // Limit results based on template type.
    String category = "category_example"; // Limit results based on category.
    String folderId = "folderId_example"; // The unique folder id.
    String sortField = "date_created"; // Returns user templates sorted by the specified field.
    String contentType = "html"; // Limit results based on how the template's content is put together. Only templates of type `user` can be filtered by `content_type`. If you want to retrieve saved templates created with the legacy email editor, then filter `content_type` to `template`. If you'd rather pull your saved templates for the new editor, filter to `multichannel`. For code your own templates, filter to `html`.
    String sortDir = "ASC"; // Determines the order direction for sorted results.
    try {
      TemplatesListAvailableTemplatesResponse result = client
              .templates
              .listAvailableTemplates()
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .createdBy(createdBy)
              .sinceDateCreated(sinceDateCreated)
              .beforeDateCreated(beforeDateCreated)
              .type(type)
              .category(category)
              .folderId(folderId)
              .sortField(sortField)
              .contentType(contentType)
              .sortDir(sortDir)
              .execute();
      System.out.println(result);
      System.out.println(result.getTemplates());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#listAvailableTemplates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TemplatesListAvailableTemplatesResponse> response = client
              .templates
              .listAvailableTemplates()
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .createdBy(createdBy)
              .sinceDateCreated(sinceDateCreated)
              .beforeDateCreated(beforeDateCreated)
              .type(type)
              .category(category)
              .folderId(folderId)
              .sortField(sortField)
              .contentType(contentType)
              .sortDir(sortDir)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#listAvailableTemplates");
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
| **createdBy** | **String**| The Mailchimp account user who created the template. | [optional] |
| **sinceDateCreated** | **String**| Restrict the response to templates created after the set date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **beforeDateCreated** | **String**| Restrict the response to templates created before the set date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00. | [optional] |
| **type** | **String**| Limit results based on template type. | [optional] |
| **category** | **String**| Limit results based on category. | [optional] |
| **folderId** | **String**| The unique folder id. | [optional] |
| **sortField** | **String**| Returns user templates sorted by the specified field. | [optional] [enum: date_created, date_edited, name] |
| **contentType** | **String**| Limit results based on how the template&#39;s content is put together. Only templates of type &#x60;user&#x60; can be filtered by &#x60;content_type&#x60;. If you want to retrieve saved templates created with the legacy email editor, then filter &#x60;content_type&#x60; to &#x60;template&#x60;. If you&#39;d rather pull your saved templates for the new editor, filter to &#x60;multichannel&#x60;. For code your own templates, filter to &#x60;html&#x60;. | [optional] [enum: html, template, multichannel] |
| **sortDir** | **String**| Determines the order direction for sorted results. | [optional] [enum: ASC, DESC] |

### Return type

[**TemplatesListAvailableTemplatesResponse**](TemplatesListAvailableTemplatesResponse.md)

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

<a name="updateTemplateById"></a>
# **updateTemplateById**
> TemplatesUpdateTemplateByIdResponse updateTemplateById(templateId, templatesCreateNewTemplateRequest).execute();

Update template

Update the name, HTML, or &#x60;folder_id&#x60; of an existing template.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplatesApi;
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
    String name = "name_example"; // The name of the template.
    String html = "html_example"; // The raw HTML for the template. We  support the Mailchimp [Template Language](https://mailchimp.com/help/getting-started-with-mailchimps-template-language/) in any HTML code passed via the API.
    String templateId = "templateId_example"; // The unique id for the template.
    String folderId = "folderId_example"; // The id of the folder the template is currently in.
    try {
      TemplatesUpdateTemplateByIdResponse result = client
              .templates
              .updateTemplateById(name, html, templateId)
              .folderId(folderId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getType());
      System.out.println(result.getName());
      System.out.println(result.getDragAndDrop());
      System.out.println(result.getResponsive());
      System.out.println(result.getCategory());
      System.out.println(result.getDateCreated());
      System.out.println(result.getDateEdited());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getEditedBy());
      System.out.println(result.getActive());
      System.out.println(result.getFolderId());
      System.out.println(result.getThumbnail());
      System.out.println(result.getShareUrl());
      System.out.println(result.getContentType());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#updateTemplateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TemplatesUpdateTemplateByIdResponse> response = client
              .templates
              .updateTemplateById(name, html, templateId)
              .folderId(folderId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#updateTemplateById");
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
| **templateId** | **String**| The unique id for the template. | |
| **templatesCreateNewTemplateRequest** | [**TemplatesCreateNewTemplateRequest**](TemplatesCreateNewTemplateRequest.md)|  | |

### Return type

[**TemplatesUpdateTemplateByIdResponse**](TemplatesUpdateTemplateByIdResponse.md)

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

<a name="viewDefaultContent"></a>
# **viewDefaultContent**
> TemplatesViewDefaultContentResponse viewDefaultContent(templateId).fields(fields).excludeFields(excludeFields).execute();

View default content

Get the sections that you can edit in a template, including each section&#39;s default content.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TemplatesApi;
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
    String templateId = "templateId_example"; // The unique id for the template.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      TemplatesViewDefaultContentResponse result = client
              .templates
              .viewDefaultContent(templateId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getSections());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#viewDefaultContent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TemplatesViewDefaultContentResponse> response = client
              .templates
              .viewDefaultContent(templateId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#viewDefaultContent");
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
| **templateId** | **String**| The unique id for the template. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**TemplatesViewDefaultContentResponse**](TemplatesViewDefaultContentResponse.md)

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

