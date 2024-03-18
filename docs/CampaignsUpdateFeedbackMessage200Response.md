

# CampaignsUpdateFeedbackMessage200Response

A specific feedback message from a specific campaign.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feedbackId** | **Integer** | The individual id for the feedback item. |  [optional] [readonly] |
|**parentId** | **Integer** | If a reply, the id of the parent feedback item. |  [optional] [readonly] |
|**blockId** | **Integer** | The block id for the editable block that the feedback addresses. |  [optional] |
|**message** | **String** | The content of the feedback. |  [optional] |
|**isComplete** | **Boolean** | The status of feedback. |  [optional] |
|**createdBy** | **String** | The login name of the user who created the feedback. |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | The date and time the feedback item was created in ISO 8601 format. |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | The date and time the feedback was last updated in ISO 8601 format. |  [optional] [readonly] |
|**source** | [**SourceEnum**](#SourceEnum) | The source of the feedback. |  [optional] [readonly] |
|**campaignId** | **String** | The unique id for the campaign. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| API | &quot;api&quot; |
| EMAIL | &quot;email&quot; |
| SMS | &quot;sms&quot; |
| WEB | &quot;web&quot; |
| IOS | &quot;ios&quot; |
| ANDROID | &quot;android&quot; |



