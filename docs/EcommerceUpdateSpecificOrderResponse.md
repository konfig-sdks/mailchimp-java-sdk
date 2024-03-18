

# EcommerceUpdateSpecificOrderResponse

Information about a specific order.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier for the order. |  [optional] [readonly] |
|**customer** | [**ECommerceCustomerProperty20**](ECommerceCustomerProperty20.md) |  |  [optional] |
|**storeId** | **String** | The unique identifier for the store. |  [optional] [readonly] |
|**campaignId** | **String** | A string that uniquely identifies the campaign associated with an order. |  [optional] |
|**landingSite** | **String** | The URL for the page where the buyer landed when entering the shop. |  [optional] |
|**financialStatus** | **String** | The order status. Use this parameter to trigger [Order Notifications](https://mailchimp.com/developer/marketing/docs/e-commerce/#order-notifications). |  [optional] |
|**fulfillmentStatus** | **String** | The fulfillment status for the order. Use this parameter to trigger [Order Notifications](https://mailchimp.com/developer/marketing/docs/e-commerce/#order-notifications). |  [optional] |
|**currencyCode** | **String** | The three-letter ISO 4217 code for the currency that the store accepts. |  [optional] |
|**orderTotal** | **Double** | The order total associated with an order. |  [optional] |
|**orderUrl** | **String** | The URL for the order. |  [optional] |
|**discountTotal** | **Double** | The total amount of the discounts to be applied to the price of the order. |  [optional] |
|**taxTotal** | **Double** | The tax total associated with an order. |  [optional] |
|**shippingTotal** | **Double** | The shipping total for the order. |  [optional] |
|**trackingCode** | [**TrackingCodeEnum**](#TrackingCodeEnum) | The Mailchimp tracking code for the order. Uses the &#39;mc_tc&#39; parameter in E-Commerce tracking URLs. |  [optional] |
|**processedAtForeign** | **OffsetDateTime** | The date and time the order was processed in ISO 8601 format. |  [optional] |
|**cancelledAtForeign** | **OffsetDateTime** | The date and time the order was cancelled in ISO 8601 format. |  [optional] |
|**updatedAtForeign** | **OffsetDateTime** | The date and time the order was updated in ISO 8601 format. |  [optional] |
|**shippingAddress** | [**ShippingAddressProperty10**](ShippingAddressProperty10.md) |  |  [optional] |
|**billingAddress** | [**BillingAddressProperty10**](BillingAddressProperty10.md) |  |  [optional] |
|**promos** | [**List&lt;PromosPropertyInner1&gt;**](PromosPropertyInner1.md) | The promo codes applied on the order |  [optional] |
|**lines** | [**List&lt;ECommerceOrderLineItem2&gt;**](ECommerceOrderLineItem2.md) | An array of the order&#39;s line items. |  [optional] |
|**outreach** | [**OutreachProperty10**](OutreachProperty10.md) |  |  [optional] |
|**trackingNumber** | **String** | The tracking number associated with the order. |  [optional] |
|**trackingCarrier** | **String** | The tracking carrier associated with the order. |  [optional] |
|**trackingUrl** | **String** | The tracking URL associated with the order. |  [optional] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



## Enum: TrackingCodeEnum

| Name | Value |
|---- | -----|
| PREC | &quot;prec&quot; |



