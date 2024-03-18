

# ABTestingOptionsProperty

[A/B Testing](https://mailchimp.com/help/about-ab-testing-campaigns/) options for a campaign.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**splitTest** | [**SplitTestEnum**](#SplitTestEnum) | The type of AB split to run. |  [optional] |
|**pickWinner** | [**PickWinnerEnum**](#PickWinnerEnum) | How we should evaluate a winner. Based on &#39;opens&#39;, &#39;clicks&#39;, or &#39;manual&#39;. |  [optional] |
|**waitUnits** | [**WaitUnitsEnum**](#WaitUnitsEnum) | How unit of time for measuring the winner (&#39;hours&#39; or &#39;days&#39;). This cannot be changed after a campaign is sent. |  [optional] |
|**waitTime** | **Integer** | The amount of time to wait before picking a winner. This cannot be changed after a campaign is sent. |  [optional] |
|**splitSize** | **Integer** | The size of the split groups. Campaigns split based on &#39;schedule&#39; are forced to have a 50/50 split. Valid split integers are between 1-50. |  [optional] |
|**fromNameA** | **String** | For campaigns split on &#39;From Name&#39;, the name for Group A. |  [optional] |
|**fromNameB** | **String** | For campaigns split on &#39;From Name&#39;, the name for Group B. |  [optional] |
|**replyEmailA** | **String** | For campaigns split on &#39;From Name&#39;, the reply-to address for Group A. |  [optional] |
|**replyEmailB** | **String** | For campaigns split on &#39;From Name&#39;, the reply-to address for Group B. |  [optional] |
|**subjectA** | **String** | For campaigns split on &#39;Subject Line&#39;, the subject line for Group A. |  [optional] |
|**subjectB** | **String** | For campaigns split on &#39;Subject Line&#39;, the subject line for Group B. |  [optional] |
|**sendTimeA** | **OffsetDateTime** | The send time for Group A. |  [optional] |
|**sendTimeB** | **OffsetDateTime** | The send time for Group B. |  [optional] |
|**sendTimeWinner** | **String** | The send time for the winning version. |  [optional] |



## Enum: SplitTestEnum

| Name | Value |
|---- | -----|
| SUBJECT | &quot;subject&quot; |
| FROM_NAME | &quot;from_name&quot; |
| SCHEDULE | &quot;schedule&quot; |



## Enum: PickWinnerEnum

| Name | Value |
|---- | -----|
| OPENS | &quot;opens&quot; |
| CLICKS | &quot;clicks&quot; |
| MANUAL | &quot;manual&quot; |



## Enum: WaitUnitsEnum

| Name | Value |
|---- | -----|
| HOURS | &quot;hours&quot; |
| DAYS | &quot;days&quot; |



