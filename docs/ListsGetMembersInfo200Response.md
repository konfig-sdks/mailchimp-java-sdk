

# ListsGetMembersInfo200Response

Manage members of a specific Mailchimp list, including currently subscribed, unsubscribed, and bounced members.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**members** | [**List&lt;ListMembers3&gt;**](ListMembers3.md) | An array of objects, each representing a specific list member. |  [optional] |
|**listId** | **String** | The list id. |  [optional] |
|**totalItems** | **Integer** | The total number of items matching the query regardless of pagination. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



