

# ListsUpdateSegmentByIdRequest

Information about a specific list segment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the segment. |  |
|**staticSegment** | **List&lt;String&gt;** | An array of emails to be used for a static segment. Any emails provided that are not present on the list will be ignored. Passing an empty array for an existing static segment will reset that segment and remove all members. This field cannot be provided with the &#x60;options&#x60; field. |  [optional] |
|**options** | [**ConditionsProperty1**](ConditionsProperty1.md) |  |  [optional] |



