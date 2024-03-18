

# EcommerceUpdateOrderLine200Response

Information about a specific order line.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier for an order line item. |  [optional] [readonly] |
|**productId** | **String** | A unique identifier for the product associated with an order line item. |  [optional] |
|**productTitle** | **String** | The name of the product for an order line item. |  [optional] [readonly] |
|**productVariantId** | **String** | A unique identifier for the product variant associated with an order line item. |  [optional] |
|**productVariantTitle** | **String** | The name of the product variant for an order line item. |  [optional] [readonly] |
|**imageUrl** | **String** | The image URL for a product. |  [optional] [readonly] |
|**quantity** | **Integer** | The order line item quantity. |  [optional] |
|**price** | **Double** | The order line item price. |  [optional] |
|**discount** | **Double** | The total discount amount applied to a line item. |  [optional] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



