

# ListsGetGrowthHistoryData200Response

A month-by-month summary of a specific list's growth activity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**history** | [**List&lt;GrowthHistory&gt;**](GrowthHistory.md) | An array of objects, each representing a monthly growth report for a list. |  [optional] |
|**listId** | **String** | The list id. |  [optional] [readonly] |
|**totalItems** | **Integer** | The total number of items matching the query regardless of pagination. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



