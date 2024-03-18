

# MergeField

A [merge field](https://mailchimp.com/developer/marketing/docs/merge-fields/) for an audience.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mergeId** | **Integer** | An unchanging id for the merge field. |  [optional] [readonly] |
|**tag** | **String** | The merge tag used for Mailchimp campaigns and [adding contact information](https://mailchimp.com/developer/marketing/docs/merge-fields/#add-merge-data-to-contacts). |  [optional] |
|**name** | **String** | The name of the merge field (audience field). |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The [type](https://mailchimp.com/developer/marketing/docs/merge-fields/#structure) for the merge field. |  [optional] [readonly] |
|**required** | **Boolean** | The boolean value if the merge field is required. |  [optional] |
|**defaultValue** | **String** | The default value for the merge field if &#x60;null&#x60;. |  [optional] |
|**_public** | **Boolean** | Whether the merge field is displayed on the signup form. |  [optional] |
|**displayOrder** | **Integer** | The order that the merge field displays on the list signup form. |  [optional] |
|**options** | [**MergeFieldOptionsProperty2**](MergeFieldOptionsProperty2.md) |  |  [optional] |
|**helpText** | **String** | Extra text to help the subscriber fill out the form. |  [optional] |
|**listId** | **String** | The ID that identifies this merge field&#39;s audience&#39;. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TEXT | &quot;text&quot; |
| NUMBER | &quot;number&quot; |
| ADDRESS | &quot;address&quot; |
| PHONE | &quot;phone&quot; |
| DATE | &quot;date&quot; |
| URL | &quot;url&quot; |
| IMAGEURL | &quot;imageurl&quot; |
| RADIO | &quot;radio&quot; |
| DROPDOWN | &quot;dropdown&quot; |
| BIRTHDAY | &quot;birthday&quot; |
| ZIP | &quot;zip&quot; |



