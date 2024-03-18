

# AutomationTriggerProperty1

Available triggers for Automation workflows.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**workflowType** | [**WorkflowTypeEnum**](#WorkflowTypeEnum) | The type of Automation workflow. |  |
|**workflowTitle** | **String** | The title of the workflow type. |  [optional] [readonly] |
|**runtime** | [**AutomationWorkflowRuntimeSettingsProperty**](AutomationWorkflowRuntimeSettingsProperty.md) |  |  [optional] |
|**workflowEmailsCount** | **Integer** | The number of emails in the Automation workflow. |  [optional] [readonly] |



## Enum: WorkflowTypeEnum

| Name | Value |
|---- | -----|
| ABANDONEDBROWSE | &quot;abandonedBrowse&quot; |
| ABANDONEDCART | &quot;abandonedCart&quot; |
| API | &quot;api&quot; |
| BESTCUSTOMERS | &quot;bestCustomers&quot; |
| CATEGORYFOLLOWUP | &quot;categoryFollowup&quot; |
| DATEADDED | &quot;dateAdded&quot; |
| EMAILFOLLOWUP | &quot;emailFollowup&quot; |
| EMAILSERIES | &quot;emailSeries&quot; |
| GROUPADD | &quot;groupAdd&quot; |
| GROUPREMOVE | &quot;groupRemove&quot; |
| MANDRILL | &quot;mandrill&quot; |
| PRODUCTFOLLOWUP | &quot;productFollowup&quot; |
| PURCHASEFOLLOWUP | &quot;purchaseFollowup&quot; |
| RECURRINGEVENT | &quot;recurringEvent&quot; |
| SPECIALEVENT | &quot;specialEvent&quot; |
| VISITURL | &quot;visitUrl&quot; |
| WELCOMESERIES | &quot;welcomeSeries&quot; |



