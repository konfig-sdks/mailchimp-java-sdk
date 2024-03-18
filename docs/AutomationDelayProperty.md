

# AutomationDelayProperty

The delay settings for an automation email.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Integer** | The delay amount for an automation email. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of delay for an automation email. |  [optional] |
|**direction** | [**DirectionEnum**](#DirectionEnum) | Whether the delay settings describe before or after the delay action of an automation email. |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) | The action that triggers the delay of an automation emails. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NOW | &quot;now&quot; |
| DAY | &quot;day&quot; |
| HOUR | &quot;hour&quot; |
| WEEK | &quot;week&quot; |



## Enum: DirectionEnum

| Name | Value |
|---- | -----|
| AFTER | &quot;after&quot; |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| SIGNUP | &quot;signup&quot; |
| ECOMM_ABANDONED_BROWSE | &quot;ecomm_abandoned_browse&quot; |
| ECOMM_ABANDONED_CART | &quot;ecomm_abandoned_cart&quot; |



