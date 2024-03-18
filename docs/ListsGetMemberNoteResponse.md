

# ListsGetMemberNoteResponse

A specific note for a specific member.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The note id. |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | The date and time the note was created in ISO 8601 format. |  [optional] [readonly] |
|**createdBy** | **String** | The author of the note. |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | The date and time the note was last updated in ISO 8601 format. |  [optional] [readonly] |
|**note** | **String** | The content of the note. |  [optional] |
|**listId** | **String** | The unique id for the list. |  [optional] [readonly] |
|**emailId** | **String** | The MD5 hash of the lowercase version of the list member&#39;s email address. |  [optional] [readonly] |
|**contactId** | **String** | As Mailchimp evolves beyond email, you may eventually have contacts without email addresses. While the &#x60;email_id&#x60; is the MD5 hash of their email address, this &#x60;contact_id&#x60; is agnostic of contact’s inclusion of an email address. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



