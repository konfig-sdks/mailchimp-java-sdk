

# ContactProperty

Information about the contact.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emailId** | **String** | The MD5 hash of the lowercase version of the list member&#39;s email address. |  [optional] [readonly] |
|**contactId** | **String** | The ID of this contact. |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | The contact&#39;s current status. |  [optional] [readonly] |
|**email** | **String** | The contact&#39;s email address. |  [optional] [readonly] |
|**phone** | **String** | The contact&#39;s sms phone number. |  [optional] [readonly] |
|**fullName** | **String** | The contact&#39;s full name. |  [optional] [readonly] |
|**consentsToOneToOneMessaging** | **Boolean** | Indicates whether a contact consents to 1:1 messaging. |  [optional] [readonly] |
|**avatarUrl** | **String** | URL for the contact&#39;s avatar or profile image. |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUBSCRIBED | &quot;Subscribed&quot; |
| UNSUBSCRIBED | &quot;Unsubscribed&quot; |
| NON_SUBSCRIBED | &quot;Non-Subscribed&quot; |
| CLEANED | &quot;Cleaned&quot; |
| ARCHIVED | &quot;Archived&quot; |



