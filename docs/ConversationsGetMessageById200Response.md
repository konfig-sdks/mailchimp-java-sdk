

# ConversationsGetMessageById200Response

An individual message in a conversation. Conversation tracking is a feature available to paid accounts that lets you view replies to your campaigns in your Mailchimp account.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A string that uniquely identifies this message |  [optional] [readonly] |
|**conversationId** | **String** | A string that identifies this message&#39;s conversation |  [optional] [readonly] |
|**listId** | **Integer** | The list&#39;s web ID |  [optional] [readonly] |
|**fromLabel** | **String** | A label representing the sender of this message |  [optional] [readonly] |
|**fromEmail** | **String** | A label representing the email of the sender of this message |  [optional] |
|**subject** | **String** | The subject of this message |  [optional] |
|**message** | **String** | The plain-text content of the message |  [optional] |
|**read** | **Boolean** | Whether this message has been marked as read |  [optional] |
|**timestamp** | **OffsetDateTime** | The date and time the message was either sent or received in ISO 8601 format. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



