

# Unsubscribes

A member who unsubscribed from a specific campaign.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emailId** | **String** | The MD5 hash of the lowercase version of the list member&#39;s email address. |  [optional] [readonly] |
|**emailAddress** | **String** | Email address for a subscriber. |  [optional] [readonly] |
|**mergeFields** | **Map&lt;String, Object&gt;** | A dictionary of merge fields where the keys are the merge tags. See the [Merge Fields documentation](https://mailchimp.com/developer/marketing/docs/merge-fields/#structure) for more about the structure. |  [optional] |
|**vip** | **Boolean** | [VIP status](https://mailchimp.com/help/designate-and-send-to-vip-contacts/) for subscriber. |  [optional] [readonly] |
|**timestamp** | **OffsetDateTime** | The date and time the member opted-out in ISO 8601 format. |  [optional] [readonly] |
|**reason** | **String** | If available, the reason listed by the member for unsubscribing. |  [optional] [readonly] |
|**campaignId** | **String** | The campaign id. |  [optional] [readonly] |
|**listId** | **String** | The list id. |  [optional] [readonly] |
|**listIsActive** | **Boolean** | The status of the list used, namely if it&#39;s deleted or disabled. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



