

# StatisticsProperty

Stats for the list. Many of these are cached for at least five minutes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**memberCount** | **Integer** | The number of active members in the list. |  [optional] [readonly] |
|**totalContacts** | **Integer** | The number of contacts in the list, including subscribed, unsubscribed, pending, cleaned, deleted, transactional, and those that need to be reconfirmed. Requires include_total_contacts query parameter to be included. |  [optional] [readonly] |
|**unsubscribeCount** | **Integer** | The number of members who have unsubscribed from the list. |  [optional] [readonly] |
|**cleanedCount** | **Integer** | The number of members cleaned from the list. |  [optional] [readonly] |
|**memberCountSinceSend** | **Integer** | The number of active members in the list since the last campaign was sent. |  [optional] [readonly] |
|**unsubscribeCountSinceSend** | **Integer** | The number of members who have unsubscribed since the last campaign was sent. |  [optional] [readonly] |
|**cleanedCountSinceSend** | **Integer** | The number of members cleaned from the list since the last campaign was sent. |  [optional] [readonly] |
|**campaignCount** | **Integer** | The number of campaigns in any status that use this list. |  [optional] [readonly] |
|**campaignLastSent** | **OffsetDateTime** | The date and time the last campaign was sent to this list in ISO 8601 format. This is updated when a campaign is sent to 10 or more recipients. |  [optional] [readonly] |
|**mergeFieldCount** | **Integer** | The number of merge fields ([audience field](https://mailchimp.com/help/getting-started-with-merge-tags/)) for this list (doesn&#39;t include EMAIL). |  [optional] [readonly] |
|**avgSubRate** | **Double** | The average number of subscriptions per month for the list (not returned if we haven&#39;t calculated it yet). |  [optional] [readonly] |
|**avgUnsubRate** | **Double** | The average number of unsubscriptions per month for the list (not returned if we haven&#39;t calculated it yet). |  [optional] [readonly] |
|**targetSubRate** | **Double** | The target number of subscriptions per month for the list to keep it growing (not returned if we haven&#39;t calculated it yet). |  [optional] [readonly] |
|**openRate** | **Double** | The average open rate (a percentage represented as a number between 0 and 100) per campaign for the list (not returned if we haven&#39;t calculated it yet). |  [optional] [readonly] |
|**clickRate** | **Double** | The average click rate (a percentage represented as a number between 0 and 100) per campaign for the list (not returned if we haven&#39;t calculated it yet). |  [optional] [readonly] |
|**lastSubDate** | **OffsetDateTime** | The date and time of the last time someone subscribed to this list in ISO 8601 format. |  [optional] [readonly] |
|**lastUnsubDate** | **OffsetDateTime** | The date and time of the last time someone unsubscribed from this list in ISO 8601 format. |  [optional] [readonly] |



