

# ListsAddNewSegmentRequest

Information about a specific list segment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the segment. |  |
|**staticSegment** | **List&lt;String&gt;** | An array of emails to be used for a static segment. Any emails provided that are not present on the list will be ignored. Passing an empty array will create a static segment without any subscribers. This field cannot be provided with the options field. |  [optional] |
|**options** | [**ConditionsProperty**](ConditionsProperty.md) |  |  [optional] |



