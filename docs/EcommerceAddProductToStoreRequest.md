

# EcommerceAddProductToStoreRequest

Information about a specific product.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title of a product. |  |
|**description** | **String** | The description of a product. |  [optional] |
|**id** | **String** | A unique identifier for the product. |  |
|**handle** | **String** | The handle of a product. |  [optional] |
|**url** | **String** | The URL for a product. |  [optional] |
|**type** | **String** | The type of product. |  [optional] |
|**vendor** | **String** | The vendor for a product. |  [optional] |
|**imageUrl** | **String** | The image URL for a product. |  [optional] |
|**variants** | [**List&lt;ECommerceProductVariant&gt;**](ECommerceProductVariant.md) | An array of the product&#39;s variants. At least one variant is required for each product. A variant can use the same &#x60;id&#x60; and &#x60;title&#x60; as the parent product. |  |
|**images** | [**List&lt;ECommerceProductImage&gt;**](ECommerceProductImage.md) | An array of the product&#39;s images. |  [optional] |
|**publishedAtForeign** | **OffsetDateTime** | The date and time the product was published. |  [optional] |



