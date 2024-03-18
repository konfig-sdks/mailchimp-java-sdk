

# ErrorsPropertyInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emailAddress** | **String** | The email address that could not be added or updated. |  [optional] |
|**error** | **String** | The error message indicating why the email address could not be added or updated. |  [optional] |
|**errorCode** | [**ErrorCodeEnum**](#ErrorCodeEnum) | A unique code that identifies this specifc error. |  [optional] |
|**field** | **String** | If the error is field-related, information about which field is at issue. |  [optional] |
|**fieldMessage** | **String** | Message indicating how to resolve a field-related error. |  [optional] |



## Enum: ErrorCodeEnum

| Name | Value |
|---- | -----|
| CONTACT_EXISTS | &quot;ERROR_CONTACT_EXISTS&quot; |
| GENERIC | &quot;ERROR_GENERIC&quot; |



