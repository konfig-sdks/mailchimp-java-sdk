

# TemplatesUpdateTemplateById200Response

Information about a specific template.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The individual id for the template. |  [optional] [readonly] |
|**type** | **String** | The type of template (user, base, or gallery). |  [optional] [readonly] |
|**name** | **String** | The name of the template. |  [optional] |
|**dragAndDrop** | **Boolean** | Whether the template uses the drag and drop editor. |  [optional] [readonly] |
|**responsive** | **Boolean** | Whether the template contains media queries to make it responsive. |  [optional] [readonly] |
|**category** | **String** | If available, the category the template is listed in. |  [optional] [readonly] |
|**dateCreated** | **OffsetDateTime** | The date and time the template was created in ISO 8601 format. |  [optional] [readonly] |
|**dateEdited** | **OffsetDateTime** | The date and time the template was edited in ISO 8601 format. |  [optional] [readonly] |
|**createdBy** | **String** | The login name for template&#39;s creator. |  [optional] [readonly] |
|**editedBy** | **String** | The login name who last edited the template. |  [optional] [readonly] |
|**active** | **Boolean** | User templates are not &#39;deleted,&#39; but rather marked as &#39;inactive.&#39; Returns whether the template is still active. |  [optional] [readonly] |
|**folderId** | **String** | The id of the folder the template is currently in. |  [optional] |
|**thumbnail** | **String** | If available, the URL for a thumbnail of the template. |  [optional] [readonly] |
|**shareUrl** | **String** | The URL used for [template sharing](https://mailchimp.com/help/share-a-template/). |  [optional] [readonly] |
|**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) | How the template&#39;s content is put together. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



## Enum: ContentTypeEnum

| Name | Value |
|---- | -----|
| TEMPLATE | &quot;template&quot; |
| MULTICHANNEL | &quot;multichannel&quot; |
| HTML | &quot;html&quot; |



