

# ListsGetInterestCategoryInfo200Response

Interest categories organize interests, which are used to group subscribers based on their preferences. These correspond to Group Titles the application.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The text description of this category. This field appears on signup forms and is often phrased as a question. |  [optional] |
|**listId** | **String** | The unique list id for the category. |  [optional] [readonly] |
|**id** | **String** | The id for the interest category. |  [optional] [readonly] |
|**displayOrder** | **Integer** | The order that the categories are displayed in the list. Lower numbers display first. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Determines how this category’s interests appear on signup forms. |  [optional] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CHECKBOXES | &quot;checkboxes&quot; |
| DROPDOWN | &quot;dropdown&quot; |
| RADIO | &quot;radio&quot; |
| HIDDEN | &quot;hidden&quot; |



