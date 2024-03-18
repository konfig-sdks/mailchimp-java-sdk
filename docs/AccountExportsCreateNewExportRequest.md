

# AccountExportsCreateNewExportRequest

Creates an account export with the given parameters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**includeStages** | [**List&lt;IncludeStagesEnum&gt;**](#List&lt;IncludeStagesEnum&gt;) | The stages of an account export to include. |  |
|**sinceTimestamp** | **OffsetDateTime** | An ISO 8601 date that will limit the export to only records created after a given time. For instance, the reports stage will contain any campaign sent after the given timestamp. Audiences, however, are excluded from this limit. |  [optional] |



## Enum: List&lt;IncludeStagesEnum&gt;

| Name | Value |
|---- | -----|
| AUDIENCES | &quot;audiences&quot; |
| CAMPAIGNS | &quot;campaigns&quot; |
| EVENTS | &quot;events&quot; |
| GALLERY_FILES | &quot;gallery_files&quot; |
| REPORTS | &quot;reports&quot; |
| TEMPLATES | &quot;templates&quot; |



