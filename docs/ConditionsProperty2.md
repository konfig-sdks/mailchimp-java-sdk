

# ConditionsProperty2

The conditions of the segment. Static segments (tags) and fuzzy segments don't have conditions.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**match** | [**MatchEnum**](#MatchEnum) | Match type. |  [optional] |
|**conditions** | **List&lt;Object&gt;** | Segment match conditions. There are multiple possible types, see the [condition types documentation](https://mailchimp.com/developer/marketing/docs/alternative-schemas/#segment-condition-schemas). |  [optional] |



## Enum: MatchEnum

| Name | Value |
|---- | -----|
| ANY | &quot;any&quot; |
| ALL | &quot;all&quot; |



