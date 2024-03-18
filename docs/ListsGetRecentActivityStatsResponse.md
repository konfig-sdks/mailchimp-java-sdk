

# ListsGetRecentActivityStatsResponse

Up to the previous 180 days of daily detailed aggregated activity stats for a specific list. Does not include AutoResponder or Automation activity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activity** | [**List&lt;DailyListActivity&gt;**](DailyListActivity.md) | Recent list activity. |  [optional] |
|**listId** | **String** | The unique id for the list. |  [optional] |
|**totalItems** | **Integer** | The total number of items matching the query regardless of pagination. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



