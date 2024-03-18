

# EcommerceGetStoreOrderLines200Response

A collection of an order's line items.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**storeId** | **String** | The store id. |  [optional] |
|**orderId** | **String** | The order id. |  [optional] |
|**lines** | [**List&lt;ECommerceOrderLineItem2&gt;**](ECommerceOrderLineItem2.md) | An array of objects, each representing an order&#39;s line item. |  [optional] |
|**totalItems** | **Integer** | The total number of items matching the query regardless of pagination. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



