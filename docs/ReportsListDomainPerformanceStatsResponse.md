

# ReportsListDomainPerformanceStatsResponse

Statistics for the top-performing email domains in a campaign.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**domains** | [**List&lt;EmailDomain&gt;**](EmailDomain.md) | The top 5 email domains based on total delivered emails. |  [optional] [readonly] |
|**totalSent** | **Integer** | The total number of emails sent for the campaign. |  [optional] [readonly] |
|**campaignId** | **String** | The unique id for the campaign. |  [optional] [readonly] |
|**totalItems** | **Integer** | The total number of items matching the query regardless of pagination. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



