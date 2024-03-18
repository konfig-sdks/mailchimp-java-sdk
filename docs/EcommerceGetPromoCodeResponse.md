

# EcommerceGetPromoCodeResponse

Information about an Ecommerce Store's specific Promo Code

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier for the promo Code. |  [optional] [readonly] |
|**code** | **String** | The discount code. Restricted to UTF-8 characters with max length 50. |  [optional] |
|**redemptionUrl** | **String** | The url that should be used in the promotion campaign restricted to UTF-8 characters with max length 2000. |  [optional] |
|**usageCount** | **Integer** | Number of times promo code has been used. |  [optional] |
|**enabled** | **Boolean** | Whether the promo code is currently enabled. |  [optional] |
|**createdAtForeign** | **OffsetDateTime** | The date and time the promotion was created in ISO 8601 format. |  [optional] |
|**updatedAtForeign** | **OffsetDateTime** | The date and time the promotion was updated in ISO 8601 format. |  [optional] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



