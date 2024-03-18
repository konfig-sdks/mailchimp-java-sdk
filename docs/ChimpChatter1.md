

# ChimpChatter1

A Chimp Chatter message

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** |  |  [optional] [readonly] |
|**message** | **String** |  |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of activity |  [optional] [readonly] |
|**updateTime** | **OffsetDateTime** | The date and time this activity was updated. |  [optional] [readonly] |
|**url** | **String** | URL to a report that includes this activity |  [optional] [readonly] |
|**listId** | **String** | If it exists, list ID for the associated list |  [optional] [readonly] |
|**campaignId** | **String** | If it exists, campaign ID for the associated campaign |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LISTS_NEW_SUBSCRIBER | &quot;lists:new-subscriber&quot; |
| LISTS_UNSUBSCRIBES | &quot;lists:unsubscribes&quot; |
| LISTS_PROFILE_UPDATES | &quot;lists:profile-updates&quot; |
| CAMPAIGNS_FACEBOOK_LIKES | &quot;campaigns:facebook-likes&quot; |
| CAMPAIGNS_FORWARD_TO_FRIEND | &quot;campaigns:forward-to-friend&quot; |
| LISTS_IMPORTS | &quot;lists:imports&quot; |



