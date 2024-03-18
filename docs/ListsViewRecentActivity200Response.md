

# ListsViewRecentActivity200Response

The member activity events for a given member.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activity** | **List&lt;Object&gt;** | An array of objects, each representing a contact event. There are multiple possible types, see the [activity schema documentation](https://mailchimp.com/developer/marketing/docs/alternative-schemas/#activity-schemas). |  [optional] [readonly] |
|**emailId** | **String** | The MD5 hash of the lowercase version of the list member&#39;s email address. |  [optional] [readonly] |
|**listId** | **String** | The list id. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



