

# ListsGetAllAbuseReports200Response

A collection of abuse complaints for a specific list. An abuse complaint occurs when your recipient clicks to 'report spam' in their email program.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**abuseReports** | [**List&lt;AbuseComplaint&gt;**](AbuseComplaint.md) | An array of objects, each representing an abuse report resource. |  [optional] |
|**listId** | **String** | The list id for the abuse report. |  [optional] |
|**totalItems** | **Integer** | The total number of items matching the query regardless of pagination. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



