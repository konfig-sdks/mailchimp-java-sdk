

# AutomationsListQueueEmailsResponse

An automation workflow

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**workflowId** | **String** | A string that uniquely identifies an Automation workflow. |  [optional] [readonly] |
|**emailId** | **String** | A string that uniquely identifies an email in an Automation workflow. |  [optional] [readonly] |
|**queue** | [**List&lt;SubscriberInAutomationQueue&gt;**](SubscriberInAutomationQueue.md) | An array of objects, each representing a subscriber queue for an email in an Automation workflow. |  [optional] [readonly] |
|**totalItems** | **Integer** | The total number of items matching the query regardless of pagination. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



