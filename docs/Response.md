

# Response

A single question and the response to that question.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**questionId** | **String** | The unique ID for this question. |  [optional] |
|**questionType** | [**QuestionTypeEnum**](#QuestionTypeEnum) | The type of question this is. |  [optional] |
|**query** | **String** | The survey question. |  [optional] |
|**answer** | **String** | The answer to this survey question. |  [optional] |



## Enum: QuestionTypeEnum

| Name | Value |
|---- | -----|
| PICKONE | &quot;pickOne&quot; |
| PICKMANY | &quot;pickMany&quot; |
| RANGE | &quot;range&quot; |
| TEXT | &quot;text&quot; |
| EMAIL | &quot;email&quot; |



