

# ReportsListEepurlActivity200Response

A summary of social activity for the campaign, tracked by EepURL.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**twitter** | [**TwitterStatsProperty**](TwitterStatsProperty.md) |  |  [optional] |
|**clicks** | [**ClickSummaryProperty1**](ClickSummaryProperty1.md) |  |  [optional] |
|**referrers** | [**List&lt;Referrer&gt;**](Referrer.md) | A summary of the top referrers for the campaign. |  [optional] [readonly] |
|**eepurl** | **String** | The shortened link used for tracking. |  [optional] [readonly] |
|**campaignId** | **String** | The unique id for the campaign. |  [optional] [readonly] |
|**totalItems** | **Integer** | The total number of items matching the query regardless of pagination. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



