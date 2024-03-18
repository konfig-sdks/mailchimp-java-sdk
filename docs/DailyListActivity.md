

# DailyListActivity

One day's worth of list activity. Doesn't include Automation activity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**day** | **String** | The date for the activity summary. |  [optional] [readonly] |
|**emailsSent** | **Integer** | The total number of emails sent on the date for the activity summary. |  [optional] [readonly] |
|**uniqueOpens** | **Integer** | The number of unique opens. |  [optional] [readonly] |
|**recipientClicks** | **Integer** | The number of clicks. |  [optional] [readonly] |
|**hardBounce** | **Integer** | The number of hard bounces. |  [optional] [readonly] |
|**softBounce** | **Integer** | The number of soft bounces |  [optional] [readonly] |
|**subs** | **Integer** | The number of subscribes. |  [optional] [readonly] |
|**unsubs** | **Integer** | The number of unsubscribes. |  [optional] [readonly] |
|**otherAdds** | **Integer** | The number of subscribers who may have been added outside of the [double opt-in process](https://mailchimp.com/help/about-double-opt-in/), such as imports or API activity. |  [optional] [readonly] |
|**otherRemoves** | **Integer** | The number of subscribers who may have been removed outside of unsubscribing or reporting an email as spam (for example, deleted subscribers). |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



