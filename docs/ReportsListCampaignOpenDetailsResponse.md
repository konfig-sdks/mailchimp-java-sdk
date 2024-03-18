

# ReportsListCampaignOpenDetailsResponse

A detailed report of any campaign emails that were opened by a list member.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**members** | [**List&lt;OpenActivity&gt;**](OpenActivity.md) | An array of objects, each representing a list member who opened a campaign email. Each members object will contain information about the number of total opens by a single member, as well as timestamps for each open event. |  [optional] |
|**campaignId** | **String** | The campaign id. |  [optional] [readonly] |
|**totalOpens** | **Integer** | The total number of opens matching the query regardless of pagination. |  [optional] |
|**totalItems** | **Integer** | The total number of items matching the query regardless of pagination. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



