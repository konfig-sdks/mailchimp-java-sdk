

# AutomationWorkflowEmail

A summary of an individual Automation workflow email.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A string that uniquely identifies the Automation email. |  [optional] [readonly] |
|**webId** | **Integer** | The ID used in the Mailchimp web application. View this automation in your Mailchimp account at &#x60;https://{dc}.admin.mailchimp.com/campaigns/show/?id&#x3D;{web_id}&#x60;. |  [optional] [readonly] |
|**workflowId** | **String** | A string that uniquely identifies an Automation workflow. |  [optional] [readonly] |
|**position** | **Integer** | The position of an Automation email in a workflow. |  [optional] [readonly] |
|**delay** | [**AutomationDelayProperty1**](AutomationDelayProperty1.md) |  |  [optional] |
|**createTime** | **OffsetDateTime** | The date and time the campaign was created in ISO 8601 format. |  [optional] [readonly] |
|**startTime** | **OffsetDateTime** | The date and time the campaign was started in ISO 8601 format. |  [optional] [readonly] |
|**archiveUrl** | **String** | The link to the campaign&#39;s archive version in ISO 8601 format. |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the campaign. |  [optional] [readonly] |
|**emailsSent** | **Integer** | The total number of emails sent for this campaign. |  [optional] [readonly] |
|**sendTime** | **OffsetDateTime** |  The date and time a campaign was sent in ISO 8601 format |  [optional] [readonly] |
|**contentType** | **String** | How the campaign&#39;s content is put together (&#39;template&#39;, &#39;drag_and_drop&#39;, &#39;html&#39;, &#39;url&#39;). |  [optional] [readonly] |
|**needsBlockRefresh** | **Boolean** | Determines if the automation email needs its blocks refreshed by opening the web-based campaign editor. |  [optional] [readonly] |
|**hasLogoMergeTag** | **Boolean** | Determines if the campaign contains the *|BRAND:LOGO|* merge tag. |  [optional] [readonly] |
|**recipients** | [**ListProperty9**](ListProperty9.md) |  |  [optional] |
|**settings** | [**CampaignSettingsProperty3**](CampaignSettingsProperty3.md) |  |  [optional] |
|**tracking** | [**CampaignTrackingOptionsProperty1**](CampaignTrackingOptionsProperty1.md) |  |  [optional] |
|**socialCard** | [**CampaignSocialCardProperty**](CampaignSocialCardProperty.md) |  |  [optional] |
|**triggerSettings** | [**AutomationTriggerProperty1**](AutomationTriggerProperty1.md) |  |  [optional] |
|**reportSummary** | [**CampaignReportSummaryProperty1**](CampaignReportSummaryProperty1.md) |  |  [optional] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SAVE | &quot;save&quot; |
| PAUSED | &quot;paused&quot; |
| SENDING | &quot;sending&quot; |



