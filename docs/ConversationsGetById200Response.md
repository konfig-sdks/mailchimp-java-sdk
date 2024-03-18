

# ConversationsGetById200Response

Details about an individual conversation. Conversation tracking is a feature available to paid accounts that lets you view replies to your campaigns in your Mailchimp account.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A string that uniquely identifies this conversation. |  [optional] [readonly] |
|**messageCount** | **Integer** | The total number of messages in this conversation. |  [optional] [readonly] |
|**campaignId** | **String** | The unique identifier of the campaign for this conversation. |  [optional] [readonly] |
|**listId** | **String** | The unique identifier of the list for this conversation. |  [optional] [readonly] |
|**unreadMessages** | **Integer** | The number of unread messages in this conversation. |  [optional] [readonly] |
|**fromLabel** | **String** | A label representing the sender of this message. |  [optional] [readonly] |
|**fromEmail** | **String** | A label representing the email of the sender of this message. |  [optional] [readonly] |
|**subject** | **String** | The subject of the message. |  [optional] [readonly] |
|**lastMessage** | [**LastMessageProperty**](LastMessageProperty.md) |  |  [optional] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



