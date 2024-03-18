

# LandingPagesCreateNewMailchimpLandingPageRequest

A summary of an individual page's properties.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title of this landing page seen in the browser&#39;s title bar. |  [optional] |
|**description** | **String** | The description of this landing page. |  [optional] |
|**name** | **String** | The name of this landing page. |  [optional] |
|**storeId** | **String** | The ID of the store associated with this landing page. |  [optional] |
|**listId** | **String** | The list&#39;s ID associated with this landing page. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of template the landing page has. |  [optional] |
|**templateId** | **Integer** | The template_id of this landing page. |  [optional] |
|**tracking** | [**TrackingSettingsProperty**](TrackingSettingsProperty.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SIGNUP | &quot;signup&quot; |
| PRODUCT | &quot;product&quot; |



