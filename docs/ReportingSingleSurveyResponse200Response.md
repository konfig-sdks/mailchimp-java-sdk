

# ReportingSingleSurveyResponse200Response

A single survey response.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**responseId** | **String** | The ID for the survey response. |  [optional] [readonly] |
|**submittedAt** | **OffsetDateTime** | The date and time when the survey response was submitted in ISO 8601 format. |  [optional] [readonly] |
|**contact** | [**ContactProperty**](ContactProperty.md) |  |  [optional] |
|**isNewContact** | **Boolean** | If this contact was added to the Mailchimp audience via this survey. |  [optional] |
|**results** | [**List&lt;Response&gt;**](Response.md) | The survey questions and the answers to those questions. |  [optional] |



