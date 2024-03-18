

# ListMembers1

Individuals who are currently or have been previously subscribed to this list, including members who have bounced or unsubscribed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The MD5 hash of the lowercase version of the list member&#39;s email address. |  [optional] [readonly] |
|**emailAddress** | **String** | Email address for a subscriber. |  [optional] [readonly] |
|**uniqueEmailId** | **String** | An identifier for the address across all of Mailchimp. |  [optional] [readonly] |
|**emailType** | **String** | Type of email this member asked to get (&#39;html&#39; or &#39;text&#39;). |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Subscriber&#39;s current status. |  [optional] |
|**mergeFields** | **Map&lt;String, Object&gt;** | A dictionary of merge fields where the keys are the merge tags. See the [Merge Fields documentation](https://mailchimp.com/developer/marketing/docs/merge-fields/#structure) for more about the structure. |  [optional] |
|**interests** | **Map&lt;String, Boolean&gt;** | The key of this object&#39;s properties is the ID of the interest in question. |  [optional] |
|**stats** | [**SubscriberStatsProperty**](SubscriberStatsProperty.md) |  |  [optional] |
|**ipSignup** | **String** | IP address the subscriber signed up from. |  [optional] [readonly] |
|**timestampSignup** | **OffsetDateTime** | The date and time the subscriber signed up for the list in ISO 8601 format. |  [optional] [readonly] |
|**ipOpt** | **String** | The IP address the subscriber used to confirm their opt-in status. |  [optional] [readonly] |
|**timestampOpt** | **OffsetDateTime** | The date and time the subscriber confirmed their opt-in status in ISO 8601 format. |  [optional] [readonly] |
|**memberRating** | **Integer** | Star rating for this member, between 1 and 5. |  [optional] [readonly] |
|**lastChanged** | **OffsetDateTime** | The date and time the member&#39;s info was last changed in ISO 8601 format. |  [optional] [readonly] |
|**language** | **String** | If set/detected, the [subscriber&#39;s language](https://mailchimp.com/help/view-and-edit-contact-languages/). |  [optional] |
|**vip** | **Boolean** | [VIP status](https://mailchimp.com/help/designate-and-send-to-vip-contacts/) for subscriber. |  [optional] |
|**emailClient** | **String** | The list member&#39;s email client. |  [optional] [readonly] |
|**location** | [**LocationProperty1**](LocationProperty1.md) |  |  [optional] |
|**lastNote** | [**NotesProperty**](NotesProperty.md) |  |  [optional] |
|**listId** | **String** | The list id. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUBSCRIBED | &quot;subscribed&quot; |
| UNSUBSCRIBED | &quot;unsubscribed&quot; |
| CLEANED | &quot;cleaned&quot; |
| PENDING | &quot;pending&quot; |
| TRANSACTIONAL | &quot;transactional&quot; |



