

# Operations


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**method** | [**MethodEnum**](#MethodEnum) | The HTTP method to use for the operation. |  |
|**path** | **String** | The relative path to use for the operation. |  |
|**params** | **Object** | Any request query parameters. Example parameters: {\&quot;count\&quot;:10, \&quot;offset\&quot;:0} |  [optional] |
|**body** | **String** | A string containing the JSON body to use with the request. |  [optional] |
|**operationId** | **String** | An optional client-supplied id returned with the operation results. |  [optional] |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| GET | &quot;GET&quot; |
| POST | &quot;POST&quot; |
| PUT | &quot;PUT&quot; |
| PATCH | &quot;PATCH&quot; |
| DELETE | &quot;DELETE&quot; |



