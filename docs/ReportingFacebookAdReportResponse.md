

# ReportingFacebookAdReportResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique ID of an Outreach. |  [optional] |
|**webId** | **Integer** | The ID used in the Mailchimp web application. For example, for a &#x60;regular&#x60; outreach, you can view this campaign in your Mailchimp account at &#x60;https://{dc}.admin.mailchimp.com/campaigns/show/?id&#x3D;{web_id}&#x60;. |  [optional] |
|**name** | **String** | Title or name of an Outreach. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of outreach this object is. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of this outreach. |  [optional] |
|**showReport** | **Boolean** | Outreach report availability. Note: This property is hotly debated in what it _should_ convey. See [MCP-1371](https://jira.mailchimp.com/browse/MCP-1371) for more context. |  [optional] |
|**createTime** | **OffsetDateTime** | The date and time the outreach was created in ISO 8601 format. |  [optional] |
|**startTime** | **OffsetDateTime** | The date and time the outreach was started in ISO 8601 format. |  [optional] |
|**updatedAt** | **OffsetDateTime** | The date and time the outreach was last updated in ISO 8601 format. |  [optional] |
|**canceledAt** | **OffsetDateTime** | The date and time the outreach was canceled in ISO 8601 format. |  [optional] |
|**publishedTime** | **OffsetDateTime** | The date and time the outreach was (or will be) published in ISO 8601 format. |  [optional] |
|**hasSegment** | **Boolean** | If this outreach targets a segment of your audience. |  [optional] |
|**reportSummary** | [**ReportingFacebookAdReportResponseAllOf1ReportSummary**](ReportingFacebookAdReportResponseAllOf1ReportSummary.md) |  |  [optional] |
|**recipients** | [**Recipients2**](Recipients2.md) |  |  [optional] |
|**thumbnail** | **String** | The URL of the thumbnail for this outreach. |  [optional] |
|**emailSourceName** | **String** |  |  [optional] |
|**pausedAt** | **OffsetDateTime** | The date and time the ad was paused in ISO 8601 format. |  [optional] |
|**endTime** | **OffsetDateTime** | The date and time the ad was ended in ISO 8601 format. |  [optional] |
|**needsAttention** | **Boolean** | If the ad has a problem and needs attention. |  [optional] |
|**wasCanceledByFacebook** | **Boolean** |  |  [optional] |
|**channel** | [**ReportingFacebookAdReportResponseAllOf1Channel**](ReportingFacebookAdReportResponseAllOf1Channel.md) |  |  [optional] |
|**audience** | [**FacebookAdsGetInfoResponseAllOf2Audience**](FacebookAdsGetInfoResponseAllOf2Audience.md) |  |  [optional] |
|**budget** | [**ReportingFacebookAdReportResponseAllOf1Budget**](ReportingFacebookAdReportResponseAllOf1Budget.md) |  |  [optional] |
|**audienceActivity** | [**ReportingFacebookAdReportResponseAllOf1AudienceActivity**](ReportingFacebookAdReportResponseAllOf1AudienceActivity.md) |  |  [optional] |
|**links** | [**List&lt;ResourceLink1&gt;**](ResourceLink1.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| REGULAR | &quot;regular&quot; |
| EMAIL_TOUCHPOINT | &quot;email-touchpoint&quot; |
| PLAINTEXT | &quot;plaintext&quot; |
| RSS | &quot;rss&quot; |
| RECONFIRM | &quot;reconfirm&quot; |
| VARIATE | &quot;variate&quot; |
| ABSPLIT | &quot;absplit&quot; |
| AUTOMATION | &quot;automation&quot; |
| FACEBOOK | &quot;facebook&quot; |
| GOOGLE | &quot;google&quot; |
| AUTORESPONDER | &quot;autoresponder&quot; |
| TRANSACTIONAL | &quot;transactional&quot; |
| PAGE | &quot;page&quot; |
| WEBSITE | &quot;website&quot; |
| SOCIAL_POST | &quot;social_post&quot; |
| SURVEY | &quot;survey&quot; |
| CUSTOMER_JOURNEY | &quot;customer_journey&quot; |
| SMS | &quot;sms&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SAVE | &quot;save&quot; |
| PAUSED | &quot;paused&quot; |
| SCHEDULE | &quot;schedule&quot; |
| SCHEDULED | &quot;scheduled&quot; |
| SENDING | &quot;sending&quot; |
| SENT | &quot;sent&quot; |
| CANCELED | &quot;canceled&quot; |
| CANCELING | &quot;canceling&quot; |
| ACTIVE | &quot;active&quot; |
| DISCONNECTED | &quot;disconnected&quot; |
| SOMEPAUSED | &quot;somepaused&quot; |
| DRAFT | &quot;draft&quot; |
| COMPLETED | &quot;completed&quot; |
| PARTIALREJECTED | &quot;partialRejected&quot; |
| PENDING | &quot;pending&quot; |
| REJECTED | &quot;rejected&quot; |
| PUBLISHED | &quot;published&quot; |
| UNPUBLISHED | &quot;unpublished&quot; |



