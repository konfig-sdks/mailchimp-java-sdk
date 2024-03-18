

# CampaignsSetContentRequest

The HTML and plain-text content for a campaign

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**plainText** | **String** | The plain-text portion of the campaign. If left unspecified, we&#39;ll generate this automatically. |  [optional] |
|**html** | **String** | The raw HTML for the campaign. |  [optional] |
|**url** | **String** | When importing a campaign, the URL where the HTML lives. |  [optional] |
|**template** | [**TemplateContentProperty**](TemplateContentProperty.md) |  |  [optional] |
|**archive** | [**UploadArchiveProperty**](UploadArchiveProperty.md) |  |  [optional] |
|**variateContents** | [**List&lt;VariateContentsPropertyInner&gt;**](VariateContentsPropertyInner.md) | Content options for [Multivariate Campaigns](https://mailchimp.com/help/about-multivariate-campaigns/). Each content option must provide HTML content and may optionally provide plain text. For campaigns not testing content, only one object should be provided. |  [optional] |



