

# CampaignDeliveryStatusProperty

Updates on campaigns in the process of sending.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **Boolean** | Whether Campaign Delivery Status is enabled for this account and campaign. |  [optional] [readonly] |
|**canCancel** | **Boolean** | Whether a campaign send can be canceled. |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | The current state of a campaign delivery. |  [optional] [readonly] |
|**emailsSent** | **Integer** | The total number of emails confirmed sent for this campaign so far. |  [optional] [readonly] |
|**emailsCanceled** | **Integer** | The total number of emails canceled for this campaign. |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DELIVERING | &quot;delivering&quot; |
| DELIVERED | &quot;delivered&quot; |
| CANCELING | &quot;canceling&quot; |
| CANCELED | &quot;canceled&quot; |



