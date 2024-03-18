

# SendingScheduleProperty

The schedule for sending the RSS Campaign.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hour** | **Integer** | The hour to send the campaign in local time. Acceptable hours are 0-23. For example, &#39;4&#39; would be 4am in [your account&#39;s default time zone](https://mailchimp.com/help/set-account-defaults/). |  [optional] |
|**dailySend** | [**DailySendingDaysProperty**](DailySendingDaysProperty.md) |  |  [optional] |
|**weeklySendDay** | [**WeeklySendDayEnum**](#WeeklySendDayEnum) | The day of the week to send a weekly RSS Campaign. |  [optional] |
|**monthlySendDate** | **Double** | The day of the month to send a monthly RSS Campaign. Acceptable days are 0-31, where &#39;0&#39; is always the last day of a month. Months with fewer than the selected number of days will not have an RSS campaign sent out that day. For example, RSS Campaigns set to send on the 30th will not go out in February. |  [optional] |



## Enum: WeeklySendDayEnum

| Name | Value |
|---- | -----|
| SUNDAY | &quot;sunday&quot; |
| MONDAY | &quot;monday&quot; |
| TUESDAY | &quot;tuesday&quot; |
| WEDNESDAY | &quot;wednesday&quot; |
| THURSDAY | &quot;thursday&quot; |
| FRIDAY | &quot;friday&quot; |
| SATURDAY | &quot;saturday&quot; |



