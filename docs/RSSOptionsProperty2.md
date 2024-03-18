

# RSSOptionsProperty2

[RSS](https://mailchimp.com/help/share-your-blog-posts-with-mailchimp/) options for a campaign.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feedUrl** | **URI** | The URL for the RSS feed. |  [optional] |
|**frequency** | [**FrequencyEnum**](#FrequencyEnum) | The frequency of the RSS Campaign. |  [optional] |
|**schedule** | [**SendingScheduleProperty**](SendingScheduleProperty.md) |  |  [optional] |
|**lastSent** | **OffsetDateTime** | The date the campaign was last sent. |  [optional] [readonly] |
|**constrainRssImg** | **Boolean** | Whether to add CSS to images in the RSS feed to constrain their width in campaigns. |  [optional] |



## Enum: FrequencyEnum

| Name | Value |
|---- | -----|
| DAILY | &quot;daily&quot; |
| WEEKLY | &quot;weekly&quot; |
| MONTHLY | &quot;monthly&quot; |



