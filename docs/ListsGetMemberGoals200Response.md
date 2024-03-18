

# ListsGetMemberGoals200Response

The last 50 Goal events for a member on a specific list.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**goals** | [**List&lt;Goal&gt;**](Goal.md) | The last 50 Goal events triggered by a member. |  [optional] |
|**listId** | **String** | The list id. |  [optional] [readonly] |
|**emailId** | **String** | The MD5 hash of the lowercase version of the list member&#39;s email address. |  [optional] [readonly] |
|**totalItems** | **Integer** | The total number of items matching the query regardless of pagination. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



