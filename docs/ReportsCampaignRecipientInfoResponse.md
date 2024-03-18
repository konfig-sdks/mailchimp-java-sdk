

# ReportsCampaignRecipientInfoResponse

A subscriber's status for a specific campaign.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emailId** | **String** | The MD5 hash of the lowercase version of the list member&#39;s email address. |  [optional] [readonly] |
|**emailAddress** | **String** | Email address for a subscriber. |  [optional] [readonly] |
|**mergeFields** | **Map&lt;String, Object&gt;** | A dictionary of merge fields where the keys are the merge tags. See the [Merge Fields documentation](https://mailchimp.com/developer/marketing/docs/merge-fields/#structure) for more about the structure. |  [optional] |
|**vip** | **Boolean** | [VIP status](https://mailchimp.com/help/designate-and-send-to-vip-contacts/) for subscriber. |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the email delivered to this subscriber. &#x60;hard&#x60; and &#x60;soft&#x60; refer to different [bounce types](https://mailchimp.com/help/soft-vs-hard-bounces/). |  [optional] |
|**openCount** | **Integer** | The number of times a campaign was opened by this member. |  [optional] |
|**lastOpen** | **OffsetDateTime** | The date and time of the last open for this member in ISO 8601 format. |  [optional] |
|**absplitGroup** | [**AbsplitGroupEnum**](#AbsplitGroupEnum) | For A/B Split Campaigns, the group the member was apart of. |  [optional] |
|**gmtOffset** | **Integer** | For campaigns sent with timewarp, the time zone group the member is apart of. |  [optional] |
|**campaignId** | **String** | The campaign id. |  [optional] [readonly] |
|**listId** | **String** | The unique list id. |  [optional] [readonly] |
|**listIsActive** | **Boolean** | The status of the list used, namely if it&#39;s deleted or disabled. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SENT | &quot;sent&quot; |
| HARD | &quot;hard&quot; |
| SOFT | &quot;soft&quot; |



## Enum: AbsplitGroupEnum

| Name | Value |
|---- | -----|
| A | &quot;a&quot; |
| B | &quot;b&quot; |
| WINNER | &quot;winner&quot; |



