

# MergeFieldProperty

A [merge field](https://mailchimp.com/developer/marketing/docs/merge-fields/) for an audience.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | An unchanging id for the merge field. |  [optional] [readonly] |
|**label** | **String** | The [label](https://mailchimp.com/developer/marketing/docs/merge-fields/#structure) for the merge field. |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | The [type](https://mailchimp.com/developer/marketing/docs/merge-fields/#structure) for the merge field. |  [optional] [readonly] |



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



