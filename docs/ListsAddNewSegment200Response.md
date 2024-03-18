

# ListsAddNewSegment200Response

Information about a specific segment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The unique id for the segment. |  [optional] [readonly] |
|**name** | **String** | The name of the segment. |  [optional] |
|**memberCount** | **Integer** | The number of active subscribers currently included in the segment. |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of segment. Static segments are now known as tags. Learn more about [tags](https://mailchimp.com/help/getting-started-tags?utm_source&#x3D;mc-api&amp;utm_medium&#x3D;docs&amp;utm_campaign&#x3D;apidocs). |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | The date and time the segment was created in ISO 8601 format. |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | The date and time the segment was last updated in ISO 8601 format. |  [optional] [readonly] |
|**options** | [**ConditionsProperty2**](ConditionsProperty2.md) |  |  [optional] |
|**listId** | **String** | The list id. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SAVED | &quot;saved&quot; |
| STATIC | &quot;static&quot; |
| FUZZY | &quot;fuzzy&quot; |



