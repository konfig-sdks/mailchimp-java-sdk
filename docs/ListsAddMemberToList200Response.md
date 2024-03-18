

# ListsAddMemberToList200Response

Individuals who are currently or have been previously subscribed to this list, including members who have bounced or unsubscribed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | [**List&lt;TagsPropertyInner&gt;**](TagsPropertyInner.md) | Returns up to 50 tags applied to this member. To retrieve all tags see [Member Tags](https://mailchimp.com/developer/marketing/api/list-member-tags/). |  [optional] |
|**id** | **String** | The MD5 hash of the lowercase version of the list member&#39;s email address. |  [optional] [readonly] |
|**emailAddress** | **String** | Email address for a subscriber. |  [optional] |
|**uniqueEmailId** | **String** | An identifier for the address across all of Mailchimp. |  [optional] [readonly] |
|**contactId** | **String** | As Mailchimp evolves beyond email, you may eventually have contacts without email addresses. While the &#x60;id&#x60; is the MD5 hash of their email address, this &#x60;contact_id&#x60; is agnostic of contact’s inclusion of an email address. |  [optional] [readonly] |
|**fullName** | **String** | The contact&#39;s full name. |  [optional] [readonly] |
|**webId** | **Integer** | The ID used in the Mailchimp web application. View this member in your Mailchimp account at &#x60;https://{dc}.admin.mailchimp.com/lists/members/view?id&#x3D;{web_id}&#x60;. |  [optional] [readonly] |
|**emailType** | **String** | Type of email this member asked to get (&#39;html&#39; or &#39;text&#39;). |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Subscriber&#39;s current status. |  [optional] |
|**unsubscribeReason** | **String** | A subscriber&#39;s reason for unsubscribing. |  [optional] |
|**consentsToOneToOneMessaging** | **Boolean** | Indicates whether a contact consents to 1:1 messaging. |  [optional] [readonly] |
|**smsPhoneNumber** | **String** | A US phone number for SMS contact. |  [optional] |
|**smsSubscriptionStatus** | [**SmsSubscriptionStatusEnum**](#SmsSubscriptionStatusEnum) | The status of an SMS subscription. |  [optional] |
|**smsSubscriptionLastUpdated** | **String** | The datetime when the SMS subscription was last updated |  [optional] |
|**mergeFields** | **Map&lt;String, Object&gt;** | A dictionary of merge fields where the keys are the merge tags. See the [Merge Fields documentation](https://mailchimp.com/developer/marketing/docs/merge-fields/#structure) for more about the structure. |  [optional] |
|**interests** | **Map&lt;String, Boolean&gt;** | The key of this object&#39;s properties is the ID of the interest in question. |  [optional] |
|**stats** | [**SubscriberStatsProperty4**](SubscriberStatsProperty4.md) |  |  [optional] |
|**ipSignup** | **String** | IP address the subscriber signed up from. |  [optional] [readonly] |
|**timestampSignup** | **OffsetDateTime** | The date and time the subscriber signed up for the list in ISO 8601 format. |  [optional] [readonly] |
|**ipOpt** | **String** | The IP address the subscriber used to confirm their opt-in status. |  [optional] [readonly] |
|**timestampOpt** | **OffsetDateTime** | The date and time the subscriber confirmed their opt-in status in ISO 8601 format. |  [optional] [readonly] |
|**memberRating** | **Integer** | Star rating for this member, between 1 and 5. |  [optional] [readonly] |
|**lastChanged** | **OffsetDateTime** | The date and time the member&#39;s info was last changed in ISO 8601 format. |  [optional] [readonly] |
|**language** | **String** | If set/detected, the [subscriber&#39;s language](https://mailchimp.com/help/view-and-edit-contact-languages/). |  [optional] |
|**vip** | **Boolean** | [VIP status](https://mailchimp.com/help/designate-and-send-to-vip-contacts/) for subscriber. |  [optional] |
|**emailClient** | **String** | The list member&#39;s email client. |  [optional] [readonly] |
|**location** | [**LocationProperty2**](LocationProperty2.md) |  |  [optional] |
|**marketingPermissions** | [**List&lt;MarketingPermission1&gt;**](MarketingPermission1.md) | The marketing permissions for the subscriber. |  [optional] |
|**lastNote** | [**NotesProperty**](NotesProperty.md) |  |  [optional] |
|**source** | **String** | The source from which the subscriber was added to this list. |  [optional] [readonly] |
|**tagsCount** | **Integer** | The number of tags applied to this member. |  [optional] [readonly] |
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
| ARCHIVED | &quot;archived&quot; |



## Enum: SmsSubscriptionStatusEnum

| Name | Value |
|---- | -----|
| SUBSCRIBED | &quot;subscribed&quot; |
| UNSUBSCRIBED | &quot;unsubscribed&quot; |
| NONSUBSCRIBED | &quot;nonsubscribed&quot; |
| PENDING | &quot;pending&quot; |



