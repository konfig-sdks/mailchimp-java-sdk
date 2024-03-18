

# AutomationDelayProperty5

The delay settings for an Automation email.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Integer** | The delay amount for an Automation email. |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of delay for an Automation email. |  [optional] |
|**direction** | [**DirectionEnum**](#DirectionEnum) | Whether the delay settings describe before or after the delay action of an Automation email. |  [optional] |
|**action** | [**ActionEnum**](#ActionEnum) | The action that triggers the delay of an Automation email. |  [optional] |
|**actionDescription** | **String** | The user-friendly description of the action that triggers an Automation email. |  [optional] [readonly] |
|**fullDescription** | **String** | The user-friendly description of the delay and trigger action settings for an Automation email. |  [optional] [readonly] |



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
| BEFORE | &quot;before&quot; |
| AFTER | &quot;after&quot; |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| PREVIOUS_CAMPAIGN_SENT | &quot;previous_campaign_sent&quot; |
| PREVIOUS_CAMPAIGN_OPENED | &quot;previous_campaign_opened&quot; |
| PREVIOUS_CAMPAIGN_NOT_OPENED | &quot;previous_campaign_not_opened&quot; |
| PREVIOUS_CAMPAIGN_CLICKED_ANY | &quot;previous_campaign_clicked_any&quot; |
| PREVIOUS_CAMPAIGN_NOT_CLICKED_ANY | &quot;previous_campaign_not_clicked_any&quot; |
| PREVIOUS_CAMPAIGN_SPECIFIC_CLICKED | &quot;previous_campaign_specific_clicked&quot; |
| ECOMM_BOUGHT_ANY | &quot;ecomm_bought_any&quot; |
| ECOMM_BOUGHT_PRODUCT | &quot;ecomm_bought_product&quot; |
| ECOMM_BOUGHT_CATEGORY | &quot;ecomm_bought_category&quot; |
| ECOMM_NOT_BOUGHT_ANY | &quot;ecomm_not_bought_any&quot; |
| ECOMM_ABANDONED_CART | &quot;ecomm_abandoned_cart&quot; |
| CAMPAIGN_SENT | &quot;campaign_sent&quot; |
| OPENED_EMAIL | &quot;opened_email&quot; |
| NOT_OPENED_EMAIL | &quot;not_opened_email&quot; |
| CLICKED_EMAIL | &quot;clicked_email&quot; |
| NOT_CLICKED_EMAIL | &quot;not_clicked_email&quot; |
| CAMPAIGN_SPECIFIC_CLICKED | &quot;campaign_specific_clicked&quot; |
| MANUAL | &quot;manual&quot; |
| SIGNUP | &quot;signup&quot; |
| MERGE_CHANGED | &quot;merge_changed&quot; |
| GROUP_ADD | &quot;group_add&quot; |
| GROUP_REMOVE | &quot;group_remove&quot; |
| MANDRILL_SENT | &quot;mandrill_sent&quot; |
| MANDRILL_OPENED | &quot;mandrill_opened&quot; |
| MANDRILL_CLICKED | &quot;mandrill_clicked&quot; |
| MANDRILL_ANY | &quot;mandrill_any&quot; |
| API | &quot;api&quot; |
| GOAL | &quot;goal&quot; |
| ANNUAL | &quot;annual&quot; |
| BIRTHDAY | &quot;birthday&quot; |
| DATE | &quot;date&quot; |
| DATE_ADDED | &quot;date_added&quot; |
| TAG_ADD | &quot;tag_add&quot; |



