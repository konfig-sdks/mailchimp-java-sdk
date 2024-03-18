

# ListsAddOrUpdateMemberRequest

Individuals who are currently or have been previously subscribed to this list, including members who have bounced or unsubscribed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emailAddress** | **String** | Email address for a subscriber. This value is required only if the email address is not already present on the list. |  |
|**statusIfNew** | [**StatusIfNewEnum**](#StatusIfNewEnum) | Subscriber&#39;s status. This value is required only if the email address is not already present on the list. |  |
|**emailType** | **String** | Type of email this member asked to get (&#39;html&#39; or &#39;text&#39;). |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Subscriber&#39;s current status. |  [optional] |
|**mergeFields** | **Map&lt;String, Object&gt;** | A dictionary of merge fields where the keys are the merge tags. See the [Merge Fields documentation](https://mailchimp.com/developer/marketing/docs/merge-fields/#structure) for more about the structure. |  [optional] |
|**interests** | **Map&lt;String, Boolean&gt;** | The key of this object&#39;s properties is the ID of the interest in question. |  [optional] |
|**language** | **String** | If set/detected, the [subscriber&#39;s language](https://mailchimp.com/help/view-and-edit-contact-languages/). |  [optional] |
|**vip** | **Boolean** | [VIP status](https://mailchimp.com/help/designate-and-send-to-vip-contacts/) for subscriber. |  [optional] |
|**location** | [**LocationProperty**](LocationProperty.md) |  |  [optional] |
|**marketingPermissions** | [**List&lt;MarketingPermission&gt;**](MarketingPermission.md) | The marketing permissions for the subscriber. |  [optional] |
|**ipSignup** | **String** | IP address the subscriber signed up from. |  [optional] |
|**timestampSignup** | **OffsetDateTime** | The date and time the subscriber signed up for the list in ISO 8601 format. |  [optional] |
|**ipOpt** | **String** | The IP address the subscriber used to confirm their opt-in status. |  [optional] |
|**timestampOpt** | **OffsetDateTime** | The date and time the subscriber confirmed their opt-in status in ISO 8601 format. |  [optional] |



## Enum: StatusIfNewEnum

| Name | Value |
|---- | -----|
| SUBSCRIBED | &quot;subscribed&quot; |
| UNSUBSCRIBED | &quot;unsubscribed&quot; |
| CLEANED | &quot;cleaned&quot; |
| PENDING | &quot;pending&quot; |
| TRANSACTIONAL | &quot;transactional&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUBSCRIBED | &quot;subscribed&quot; |
| UNSUBSCRIBED | &quot;unsubscribed&quot; |
| CLEANED | &quot;cleaned&quot; |
| PENDING | &quot;pending&quot; |
| TRANSACTIONAL | &quot;transactional&quot; |



