

# ReportsGetCampaignClickDetailsResponse

A list of URLs and unique IDs included in HTML and plain-text versions of a campaign.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**urlsClicked** | [**List&lt;ClickDetailReport&gt;**](ClickDetailReport.md) | An array of objects, each representing a specific URL contained in the campaign. |  [optional] |
|**campaignId** | **String** | The campaign id. |  [optional] [readonly] |
|**totalItems** | **Integer** | The total number of items matching the query regardless of pagination. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



