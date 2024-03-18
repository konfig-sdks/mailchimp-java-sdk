

# ListsGetMemberNotes200Response

The last 10 notes for a specific list member, based on date created.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**notes** | [**List&lt;MemberNotes&gt;**](MemberNotes.md) | An array of objects, each representing a note resource. |  [optional] |
|**emailId** | **String** | The MD5 hash of the lowercase version of the list member&#39;s email address. |  [optional] [readonly] |
|**listId** | **String** | The list id. |  [optional] [readonly] |
|**totalItems** | **Integer** | The total number of items matching the query regardless of pagination. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



