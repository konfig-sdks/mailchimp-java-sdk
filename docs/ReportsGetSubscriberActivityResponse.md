

# ReportsGetSubscriberActivityResponse

A list of a member's subscriber activity in a specific campaign, including opens, clicks, and bounces.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**campaignId** | **String** | The unique id for the campaign. |  [optional] [readonly] |
|**listId** | **String** | The unique id for the list. |  [optional] [readonly] |
|**listIsActive** | **Boolean** | The status of the list used, namely if it&#39;s deleted or disabled. |  [optional] [readonly] |
|**emailId** | **String** | The MD5 hash of the lowercase version of the list member&#39;s email address. |  [optional] [readonly] |
|**emailAddress** | **String** | Email address for a subscriber. |  [optional] [readonly] |
|**activity** | [**List&lt;MemberActivity2&gt;**](MemberActivity2.md) | An array of objects, each showing an interaction with the email. Member activity limited to 1,000 open activities and 1,000 click activities per member per campaign. |  [optional] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



