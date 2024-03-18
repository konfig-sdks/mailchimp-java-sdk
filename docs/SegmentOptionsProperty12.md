

# SegmentOptionsProperty12

An object representing all segmentation options. This object should contain a `saved_segment_id` to use an existing segment, or you can create a new segment by including both `match` and `conditions` options.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**savedSegmentId** | **Integer** | The id for an existing saved segment. |  [optional] |
|**prebuiltSegmentId** | **String** | The prebuilt segment id, if a prebuilt segment has been designated for this campaign. |  [optional] |
|**match** | [**MatchEnum**](#MatchEnum) | Segment match type. |  [optional] |
|**conditions** | **List&lt;Object&gt;** | Segment match conditions. There are multiple possible types, see the [condition types documentation](https://mailchimp.com/developer/marketing/docs/alternative-schemas/#segment-condition-schemas). |  [optional] |



## Enum: MatchEnum

| Name | Value |
|---- | -----|
| ANY | &quot;any&quot; |
| ALL | &quot;all&quot; |



