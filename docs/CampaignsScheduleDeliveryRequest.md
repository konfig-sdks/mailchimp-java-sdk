

# CampaignsScheduleDeliveryRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scheduleTime** | **OffsetDateTime** | The UTC date and time to schedule the campaign for delivery in ISO 8601 format. Campaigns may only be scheduled to send on the quarter-hour (:00, :15, :30, :45). |  |
|**timewarp** | **Boolean** | Choose whether the campaign should use [Timewarp](https://mailchimp.com/help/use-timewarp/) when sending. Campaigns scheduled with Timewarp are localized based on the recipients&#39; time zones. For example, a Timewarp campaign with a &#x60;schedule_time&#x60; of 13:00 will be sent to each recipient at 1:00pm in their local time. Cannot be set to &#x60;true&#x60; for campaigns using [Batch Delivery](https://mailchimp.com/help/schedule-batch-delivery/). |  [optional] |
|**batchDelivery** | [**BatchDeliveryProperty**](BatchDeliveryProperty.md) |  |  [optional] |



