

# ListsBatchAddRemoveMembers200Response

Batch add/remove List members to/from static segment

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**membersAdded** | [**List&lt;ListMembers&gt;**](ListMembers.md) | An array of objects, each representing a new member that was added to the static segment. |  [optional] |
|**membersRemoved** | [**List&lt;ListMembers&gt;**](ListMembers.md) | An array of objects, each representing an existing list member that got deleted from the static segment. |  [optional] |
|**errors** | [**List&lt;ErrorsPropertyInner1&gt;**](ErrorsPropertyInner1.md) | An array of objects, each representing an array of email addresses that could not be added to the segment or removed and an error message providing more details. |  [optional] |
|**totalAdded** | **Integer** | The total number of items matching the query, irrespective of pagination. |  [optional] |
|**totalRemoved** | **Integer** | The total number of items matching the query, irrespective of pagination. |  [optional] |
|**errorCount** | **Integer** | The total number of items matching the query, irrespective of pagination. |  [optional] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



