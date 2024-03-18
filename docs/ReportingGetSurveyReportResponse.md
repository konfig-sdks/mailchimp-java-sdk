

# ReportingGetSurveyReportResponse

The report for a survey.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title of the survey. |  [optional] [readonly] |
|**id** | **String** | A string that uniquely identifies this survey. |  [optional] [readonly] |
|**webId** | **Integer** | The ID used in the Mailchimp web application. View this survey report in your Mailchimp account at &#x60;https://{dc}.admin.mailchimp.com/lists/surveys/results?survey_id&#x3D;{web_id}&#x60;. |  [optional] [readonly] |
|**listId** | **String** | The ID of the list connected to this survey. |  [optional] [readonly] |
|**listName** | **String** | The name of the list connected to this survey. |  [optional] [readonly] |
|**url** | **String** | The URL for the survey. |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | The survey&#39;s status. |  [optional] [readonly] |
|**publishedAt** | **OffsetDateTime** | The date and time the survey was published in ISO 8601 format. |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | The date and time the survey was created in ISO 8601 format. |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | The date and time the survey was last updated in ISO 8601 format. |  [optional] [readonly] |
|**totalResponses** | **Integer** | The total number of responses to this survey. |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PUBLISHED | &quot;published&quot; |
| UNPUBLISHED | &quot;unpublished&quot; |



