

# ResourceLink1

This object represents a link from the resource where it is found to another resource or action that may be performed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rel** | **String** | As with an HTML &#39;rel&#39; attribute, this describes the type of link. |  [optional] [readonly] |
|**href** | **String** | This property contains a fully-qualified URL that can be called to retrieve the linked resource or perform the linked action. |  [optional] [readonly] |
|**method** | [**MethodEnum**](#MethodEnum) | The HTTP method that should be used when accessing the URL defined in &#39;href&#39;. |  [optional] [readonly] |
|**targetSchema** | **String** | For GETs, this is a URL representing the schema that the response should conform to. |  [optional] [readonly] |
|**schema** | **String** | For HTTP methods that can receive bodies (POST and PUT), this is a URL representing the schema that the body should conform to. |  [optional] [readonly] |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| GET | &quot;GET&quot; |
| POST | &quot;POST&quot; |
| PUT | &quot;PUT&quot; |
| PATCH | &quot;PATCH&quot; |
| DELETE | &quot;DELETE&quot; |
| OPTIONS | &quot;OPTIONS&quot; |
| HEAD | &quot;HEAD&quot; |



