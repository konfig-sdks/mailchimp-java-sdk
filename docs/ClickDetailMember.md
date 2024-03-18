

# ClickDetailMember

A subscriber who clicked a specific URL in a specific campaign.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emailId** | **String** | The MD5 hash of the lowercase version of the list member&#39;s email address. |  [optional] [readonly] |
|**emailAddress** | **String** | Email address for a subscriber. |  [optional] [readonly] |
|**mergeFields** | **Map&lt;String, Object&gt;** | A dictionary of merge fields where the keys are the merge tags. See the [Merge Fields documentation](https://mailchimp.com/developer/marketing/docs/merge-fields/#structure) for more about the structure. |  [optional] |
|**vip** | **Boolean** | [VIP status](https://mailchimp.com/help/designate-and-send-to-vip-contacts/) for subscriber. |  [optional] [readonly] |
|**clicks** | **Integer** | The total number of times the subscriber clicked on the link. |  [optional] [readonly] |
|**campaignId** | **String** | The campaign id. |  [optional] [readonly] |
|**urlId** | **String** | The id for the tracked URL in the campaign. |  [optional] [readonly] |
|**listId** | **String** | The list id. |  [optional] [readonly] |
|**listIsActive** | **Boolean** | The status of the list used, namely if it&#39;s deleted or disabled. |  [optional] [readonly] |
|**contactStatus** | **String** | The status of the member, namely if they are subscribed, unsubscribed, deleted, non-subscribed, transactional, pending, or need reconfirmation. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



