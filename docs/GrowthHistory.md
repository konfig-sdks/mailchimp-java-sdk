

# GrowthHistory

A summary of a specific list's growth activity for a specific month and year.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**listId** | **String** | The list id for the growth activity report. |  [optional] [readonly] |
|**month** | **String** | The month that the growth history is describing. |  [optional] [readonly] |
|**existing** | **Integer** | (deprecated) |  [optional] [readonly] |
|**imports** | **Integer** | (deprecated) |  [optional] [readonly] |
|**optins** | **Integer** | (deprecated) |  [optional] [readonly] |
|**subscribed** | **Integer** | Total subscribed members on the list at the end of the month. |  [optional] [readonly] |
|**unsubscribed** | **Integer** | Newly unsubscribed members on the list for a specific month. |  [optional] [readonly] |
|**reconfirm** | **Integer** | Newly reconfirmed members on the list for a specific month. |  [optional] [readonly] |
|**cleaned** | **Integer** | Newly cleaned (hard-bounced) members on the list for a specific month. |  [optional] [readonly] |
|**pending** | **Integer** | Pending members on the list for a specific month. |  [optional] [readonly] |
|**deleted** | **Integer** | Newly deleted members on the list for a specific month. |  [optional] [readonly] |
|**transactional** | **Integer** | Subscribers that have been sent transactional emails via Mandrill. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



