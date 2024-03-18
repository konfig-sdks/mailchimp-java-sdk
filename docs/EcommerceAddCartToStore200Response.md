

# EcommerceAddCartToStore200Response

Information about a specific cart.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier for the cart. |  [optional] [readonly] |
|**customer** | [**ECommerceCustomerProperty9**](ECommerceCustomerProperty9.md) |  |  [optional] |
|**campaignId** | **String** | A string that uniquely identifies the campaign associated with a cart. |  [optional] |
|**checkoutUrl** | **String** | The URL for the cart. This parameter is required for [Abandoned Cart](https://mailchimp.com/help/create-an-abandoned-cart-email/) automations. |  [optional] |
|**currencyCode** | **String** | The three-letter ISO 4217 code for the currency that the cart uses. |  [optional] |
|**orderTotal** | **Double** | The order total for the cart. |  [optional] |
|**taxTotal** | **Double** | The total tax for the cart. |  [optional] |
|**lines** | [**List&lt;ECommerceCartLineItem2&gt;**](ECommerceCartLineItem2.md) | An array of the cart&#39;s line items. |  [optional] |
|**createdAt** | **OffsetDateTime** | The date and time the cart was created in ISO 8601 format. |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | The date and time the cart was last updated in ISO 8601 format. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



