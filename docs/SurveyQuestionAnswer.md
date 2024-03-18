

# SurveyQuestionAnswer

The details of a survey question's answer.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the answer. |  [optional] [readonly] |
|**value** | **String** | The raw text answer. |  [optional] [readonly] |
|**responseId** | **String** | The ID of the survey response. |  [optional] [readonly] |
|**submittedAt** | **OffsetDateTime** | The date and time when the survey response was submitted in ISO 8601 format. |  [optional] [readonly] |
|**contact** | [**ContactProperty**](ContactProperty.md) |  |  [optional] |
|**isNewContact** | **Boolean** | If this contact was added to the Mailchimp audience via this survey. |  [optional] |



