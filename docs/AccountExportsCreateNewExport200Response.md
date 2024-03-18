

# AccountExportsCreateNewExport200Response

An account export.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**exportId** | **Integer** | The ID for the export. |  [optional] |
|**started** | **OffsetDateTime** | Start time for the export. |  [optional] |
|**finished** | **OffsetDateTime** | If finished, the finish time for the export. |  [optional] |
|**sizeInBytes** | **Integer** | The size of the uncompressed export in bytes. |  [optional] |
|**downloadUrl** | **String** | If the export is finished, the download URL for an export. URLs are only valid for 90 days after the export completes. |  [optional] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



