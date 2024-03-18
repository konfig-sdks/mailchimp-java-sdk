

# CampaignAdvice

Campaign feedback details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The sentiment type for a feedback message. |  [optional] [readonly] |
|**message** | **String** | The advice message. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NEGATIVE | &quot;negative&quot; |
| POSITIVE | &quot;positive&quot; |
| NEUTRAL | &quot;neutral&quot; |



