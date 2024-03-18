

# CampaignsResendActionResponse

A summary of an individual campaign's settings and content.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A string that uniquely identifies this campaign. |  [optional] [readonly] |
|**webId** | **Integer** | The ID used in the Mailchimp web application. View this campaign in your Mailchimp account at &#x60;https://{dc}.admin.mailchimp.com/campaigns/show/?id&#x3D;{web_id}&#x60;. |  [optional] [readonly] |
|**parentCampaignId** | **String** | If this campaign is the child of another campaign, this identifies the parent campaign. For Example, for RSS or Automation children. |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | There are four types of [campaigns](https://mailchimp.com/help/getting-started-with-campaigns/) you can create in Mailchimp. A/B Split campaigns have been deprecated and variate campaigns should be used instead. |  |
|**createTime** | **OffsetDateTime** | The date and time the campaign was created in ISO 8601 format. |  [optional] [readonly] |
|**archiveUrl** | **String** | The link to the campaign&#39;s archive version. |  [optional] [readonly] |
|**longArchiveUrl** | **String** | The original link to the campaign&#39;s archive version. |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the campaign. |  [optional] [readonly] |
|**emailsSent** | **Integer** | The total number of emails sent for this campaign. |  [optional] [readonly] |
|**sendTime** | **OffsetDateTime** | The date and time a campaign was sent in ISO 8601 format. |  [optional] [readonly] |
|**contentType** | **String** | How the campaign&#39;s content is put together (&#39;template&#39;, &#39;drag_and_drop&#39;, &#39;html&#39;, &#39;url&#39;). |  [optional] [readonly] |
|**needsBlockRefresh** | **Boolean** | Determines if the campaign needs its blocks refreshed by opening the web-based campaign editor. Deprecated and will always return false. |  [optional] [readonly] |
|**resendable** | **Boolean** | Determines if the campaign qualifies to be resent to non-openers. |  [optional] [readonly] |
|**recipients** | [**ListProperty25**](ListProperty25.md) |  |  [optional] |
|**settings** | [**CampaignSettingsProperty5**](CampaignSettingsProperty5.md) |  |  [optional] |
|**variateSettings** | [**ABTestOptionsProperty2**](ABTestOptionsProperty2.md) |  |  [optional] |
|**tracking** | [**CampaignTrackingOptionsProperty**](CampaignTrackingOptionsProperty.md) |  |  [optional] |
|**rssOpts** | [**RSSOptionsProperty3**](RSSOptionsProperty3.md) |  |  [optional] |
|**abSplitOpts** | [**ABTestingOptionsProperty**](ABTestingOptionsProperty.md) |  |  [optional] |
|**socialCard** | [**CampaignSocialCardProperty**](CampaignSocialCardProperty.md) |  |  [optional] |
|**reportSummary** | [**CampaignReportSummaryProperty3**](CampaignReportSummaryProperty3.md) |  |  [optional] |
|**deliveryStatus** | [**CampaignDeliveryStatusProperty**](CampaignDeliveryStatusProperty.md) |  |  [optional] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| REGULAR | &quot;regular&quot; |
| PLAINTEXT | &quot;plaintext&quot; |
| ABSPLIT | &quot;absplit&quot; |
| RSS | &quot;rss&quot; |
| VARIATE | &quot;variate&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SAVE | &quot;save&quot; |
| PAUSED | &quot;paused&quot; |
| SCHEDULE | &quot;schedule&quot; |
| SENDING | &quot;sending&quot; |
| SENT | &quot;sent&quot; |
| CANCELED | &quot;canceled&quot; |
| CANCELING | &quot;canceling&quot; |
| ARCHIVED | &quot;archived&quot; |



