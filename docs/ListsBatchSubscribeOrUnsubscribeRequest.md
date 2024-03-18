

# ListsBatchSubscribeOrUnsubscribeRequest

Members to subscribe to or unsubscribe from a list.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**members** | [**List&lt;AddListMembers&gt;**](AddListMembers.md) | An array of objects, each representing an email address and the subscription status for a specific list. Up to 500 members may be added or updated with each API call. |  |
|**syncTags** | **Boolean** | Whether this batch operation will replace all existing tags with tags in request. |  [optional] |
|**updateExisting** | **Boolean** | Whether this batch operation will change existing members&#39; subscription status. |  [optional] |



