

# ClickDetailReport

A report of links clicked in a specific campaign.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique id for the link. |  [optional] [readonly] |
|**url** | **String** | The URL for the link in the campaign. |  [optional] [readonly] |
|**totalClicks** | **Integer** | The number of total clicks for a link. |  [optional] [readonly] |
|**clickPercentage** | **Double** | The percentage of total clicks a link generated for a campaign. |  [optional] [readonly] |
|**uniqueClicks** | **Integer** | Number of unique clicks for a link. |  [optional] [readonly] |
|**uniqueClickPercentage** | **Double** | The percentage of unique clicks a link generated for a campaign. |  [optional] [readonly] |
|**lastClick** | **OffsetDateTime** | The date and time for the last recorded click for a link in ISO 8601 format. |  [optional] [readonly] |
|**abSplit** | [**ABSplitProperty**](ABSplitProperty.md) |  |  [optional] |
|**campaignId** | **String** | The campaign id. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



