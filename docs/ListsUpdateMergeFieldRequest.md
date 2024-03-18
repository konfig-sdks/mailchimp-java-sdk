

# ListsUpdateMergeFieldRequest

A [merge field](https://mailchimp.com/developer/marketing/docs/merge-fields/) for an audience.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tag** | **String** | The merge tag used for Mailchimp campaigns and [adding contact information](https://mailchimp.com/developer/marketing/docs/merge-fields/#add-merge-data-to-contacts). |  [optional] |
|**name** | **String** | The name of the merge field (audience field). |  |
|**required** | **Boolean** | Whether the merge field is required to import a contact. |  [optional] |
|**defaultValue** | **String** | The default value for the merge field if &#x60;null&#x60;. |  [optional] |
|**_public** | **Boolean** | Whether the merge field is displayed on the signup form. |  [optional] |
|**displayOrder** | **Integer** | The order that the merge field displays on the list signup form. |  [optional] |
|**options** | [**MergeFieldOptionsProperty1**](MergeFieldOptionsProperty1.md) |  |  [optional] |
|**helpText** | **String** | Extra text to help the subscriber fill out the form. |  [optional] |



