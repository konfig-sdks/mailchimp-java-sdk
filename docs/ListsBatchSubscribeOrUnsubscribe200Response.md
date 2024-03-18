

# ListsBatchSubscribeOrUnsubscribe200Response

Batch update list members.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**newMembers** | [**List&lt;ListMembers&gt;**](ListMembers.md) | An array of objects, each representing a new member that was added to the list. |  [optional] |
|**updatedMembers** | [**List&lt;ListMembers&gt;**](ListMembers.md) | An array of objects, each representing an existing list member whose subscription status was updated. |  [optional] |
|**errors** | [**List&lt;ErrorsPropertyInner&gt;**](ErrorsPropertyInner.md) | An array of objects, each representing an email address that could not be added to the list or updated and an error message providing more details. |  [optional] |
|**totalCreated** | **Integer** | The total number of items matching the query, irrespective of pagination. |  [optional] |
|**totalUpdated** | **Integer** | The total number of items matching the query, irrespective of pagination. |  [optional] |
|**errorCount** | **Integer** | The total number of items matching the query, irrespective of pagination. |  [optional] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



