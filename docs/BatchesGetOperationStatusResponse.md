

# BatchesGetOperationStatusResponse

The status of a batch request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A string that uniquely identifies this batch request. |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the batch call. [Learn more](https://mailchimp.com/developer/marketing/guides/run-async-requests-batch-endpoint/#check-the-status-of-a-batch-operation) about the batch operation status. |  [optional] [readonly] |
|**totalOperations** | **Integer** | The total number of operations to complete as part of this batch request. For GET requests requiring pagination, each page counts as a separate operation. |  [optional] [readonly] |
|**finishedOperations** | **Integer** | The number of completed operations. This includes operations that returned an error. |  [optional] [readonly] |
|**erroredOperations** | **Integer** | The number of completed operations that returned an error. |  [optional] [readonly] |
|**submittedAt** | **OffsetDateTime** | The date and time when the server received the batch request in ISO 8601 format. |  [optional] [readonly] |
|**completedAt** | **OffsetDateTime** | The date and time when all operations in the batch request completed in ISO 8601 format. |  [optional] [readonly] |
|**responseBodyUrl** | **String** | The URL of the gzipped archive of the results of all the operations. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| PREPROCESSING | &quot;preprocessing&quot; |
| STARTED | &quot;started&quot; |
| FINALIZING | &quot;finalizing&quot; |
| FINISHED | &quot;finished&quot; |



