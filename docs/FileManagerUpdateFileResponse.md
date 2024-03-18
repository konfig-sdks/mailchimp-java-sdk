

# FileManagerUpdateFileResponse

An individual file listed in the File Manager.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The unique id of the file. |  [optional] [readonly] |
|**folderId** | **Integer** | The id of the folder. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of file in the File Manager. |  [optional] [readonly] |
|**name** | **String** | The name of the file. |  [optional] |
|**fullSizeUrl** | **URI** | The url of the full-size file. |  [optional] [readonly] |
|**thumbnailUrl** | **URI** | The url of the thumbnail preview. |  [optional] [readonly] |
|**size** | **Integer** | The size of the file in bytes. |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | The date and time a file was added to the File Manager in ISO 8601 format. |  [optional] [readonly] |
|**createdBy** | **String** | The username of the profile that uploaded the file. |  [optional] [readonly] |
|**width** | **Integer** | The width of the image. |  [optional] [readonly] |
|**height** | **Integer** | The height of an image. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IMAGE | &quot;image&quot; |
| FILE | &quot;file&quot; |



