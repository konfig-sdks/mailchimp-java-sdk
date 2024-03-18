

# CampaignsGetContentResponse

The HTML and plain-text content for a campaign.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**variateContents** | [**List&lt;VariateContentsPropertyInner1&gt;**](VariateContentsPropertyInner1.md) | Content options for multivariate campaigns. |  [optional] |
|**plainText** | **String** | The plain-text portion of the campaign. If left unspecified, we&#39;ll generate this automatically. |  [optional] |
|**html** | **String** | The raw HTML for the campaign. |  [optional] |
|**archiveHtml** | **String** | The Archive HTML for the campaign. |  [optional] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



