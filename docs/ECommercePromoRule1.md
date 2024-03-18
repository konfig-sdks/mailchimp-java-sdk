

# ECommercePromoRule1

Information about an Ecommerce Store's specific Promo Rule

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title that will show up in promotion campaign. Restricted to UTF-8 characters with max length of 100 bytes. |  [optional] |
|**description** | **String** | The description of a promotion restricted to UTF-8 characters with max length 255. |  [optional] |
|**id** | **String** | A unique identifier for the promo rule. If Ecommerce platform does not support promo rule, use promo code id as promo rule id. Restricted to UTF-8 characters with max length 50. |  [optional] [readonly] |
|**startsAt** | **OffsetDateTime** | The date and time when the promotion is in effect in ISO 8601 format. |  [optional] |
|**endsAt** | **String** | The date and time when the promotion ends. Must be after starts_at and in ISO 8601 format. |  [optional] |
|**amount** | **Float** | The amount of the promo code discount. If &#39;type&#39; is &#39;fixed&#39;, the amount is treated as a monetary value. If &#39;type&#39; is &#39;percentage&#39;, amount must be a decimal value between 0.0 and 1.0, inclusive. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of discount. For free shipping set type to fixed. |  [optional] |
|**target** | [**TargetEnum**](#TargetEnum) | The target that the discount applies to. |  [optional] |
|**enabled** | **Boolean** | Whether the promo rule is currently enabled. |  [optional] |
|**createdAtForeign** | **OffsetDateTime** | The date and time the promotion was created in ISO 8601 format. |  [optional] |
|**updatedAtForeign** | **OffsetDateTime** | The date and time the promotion was updated in ISO 8601 format. |  [optional] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FIXED | &quot;fixed&quot; |
| PERCENTAGE | &quot;percentage&quot; |



## Enum: TargetEnum

| Name | Value |
|---- | -----|
| PER_ITEM | &quot;per_item&quot; |
| TOTAL | &quot;total&quot; |
| SHIPPING | &quot;shipping&quot; |



