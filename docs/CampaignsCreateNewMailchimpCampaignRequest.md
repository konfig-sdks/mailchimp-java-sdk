

# CampaignsCreateNewMailchimpCampaignRequest

A summary of an individual campaign's settings and content.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | There are four types of [campaigns](https://mailchimp.com/help/getting-started-with-campaigns/) you can create in Mailchimp. A/B Split campaigns have been deprecated and variate campaigns should be used instead. |  |
|**recipients** | [**ListProperty1**](ListProperty1.md) |  |  [optional] |
|**settings** | [**CampaignSettingsProperty1**](CampaignSettingsProperty1.md) |  |  [optional] |
|**variateSettings** | [**ABTestOptionsProperty**](ABTestOptionsProperty.md) |  |  [optional] |
|**tracking** | [**CampaignTrackingOptionsProperty**](CampaignTrackingOptionsProperty.md) |  |  [optional] |
|**rssOpts** | [**RSSOptionsProperty**](RSSOptionsProperty.md) |  |  [optional] |
|**socialCard** | [**CampaignSocialCardProperty**](CampaignSocialCardProperty.md) |  |  [optional] |
|**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) | How the campaign&#39;s content is put together. The old drag and drop editor uses &#39;template&#39; while the new editor uses &#39;multichannel&#39;. Defaults to template. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| REGULAR | &quot;regular&quot; |
| PLAINTEXT | &quot;plaintext&quot; |
| ABSPLIT | &quot;absplit&quot; |
| RSS | &quot;rss&quot; |
| VARIATE | &quot;variate&quot; |



## Enum: ContentTypeEnum

| Name | Value |
|---- | -----|
| TEMPLATE | &quot;template&quot; |
| MULTICHANNEL | &quot;multichannel&quot; |



