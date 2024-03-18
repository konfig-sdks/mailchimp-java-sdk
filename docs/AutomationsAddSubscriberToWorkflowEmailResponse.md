

# AutomationsAddSubscriberToWorkflowEmailResponse

Information about subscribers in an Automation email queue.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The MD5 hash of the lowercase version of the list member&#39;s email address. |  [optional] [readonly] |
|**workflowId** | **String** | A string that uniquely identifies an Automation workflow. |  [optional] [readonly] |
|**emailId** | **String** | A string that uniquely identifies an email in an Automation workflow. |  [optional] [readonly] |
|**listId** | **String** | A string that uniquely identifies a list. |  [optional] [readonly] |
|**listIsActive** | **Boolean** | The status of the list used, namely if it&#39;s deleted or disabled. |  [optional] [readonly] |
|**emailAddress** | **String** | The list member&#39;s email address. |  [optional] |
|**nextSend** | **OffsetDateTime** | The date and time of the next send for the workflow email in ISO 8601 format. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



