

# LandingPagesCreateNewMailchimpLandingPageResponse

A summary of an individual landing page's settings and content.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title of this landing page seen in the browser&#39;s title bar. |  [optional] |
|**description** | **String** | The description of this landing page. |  [optional] |
|**id** | **String** | A string that uniquely identifies this landing page. |  [optional] [readonly] |
|**name** | **String** | The name of this landing page. |  [optional] |
|**templateId** | **Integer** | The template_id of this landing page. |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of this landing page. |  [optional] [readonly] |
|**listId** | **String** | The list&#39;s ID associated with this landing page. |  [optional] |
|**storeId** | **String** | The ID of the store associated with this landing page. |  [optional] |
|**webId** | **Integer** | The ID used in the Mailchimp web application. |  [optional] |
|**createdBySource** | **String** | Created by mobile or web |  [optional] [readonly] |
|**url** | **String** | The url of the published landing page. |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | The time this landing page was created. |  [optional] [readonly] |
|**publishedAt** | **OffsetDateTime** | The time this landing page was published. |  [optional] [readonly] |
|**unpublishedAt** | **OffsetDateTime** | The time this landing page was unpublished. |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | The time this landing page was updated at. |  [optional] [readonly] |
|**tracking** | [**TrackingSettingsProperty**](TrackingSettingsProperty.md) |  |  [optional] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PUBLISHED | &quot;published&quot; |
| UNPUBLISHED | &quot;unpublished&quot; |
| DRAFT | &quot;draft&quot; |



