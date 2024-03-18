

# EcommerceUpdateSpecificOrderRequest

Information about a specific order.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customer** | [**ECommerceCustomerProperty3**](ECommerceCustomerProperty3.md) |  |  [optional] |
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
|**cancelledAtForeign** | **OffsetDateTime** | The date and time the order was cancelled in ISO 8601 format. Note: passing a value for this parameter will cancel the order being edited. |  [optional] |
|**updatedAtForeign** | **OffsetDateTime** | The date and time the order was updated in ISO 8601 format. |  [optional] |
|**shippingAddress** | [**ShippingAddressProperty1**](ShippingAddressProperty1.md) |  |  [optional] |
|**billingAddress** | [**BillingAddressProperty1**](BillingAddressProperty1.md) |  |  [optional] |
|**promos** | [**List&lt;PromosPropertyInner&gt;**](PromosPropertyInner.md) | The promo codes applied on the order. Note: Patch will completely replace the value of promos with the new one provided. |  [optional] |
|**lines** | [**List&lt;ECommerceOrderLineItem1&gt;**](ECommerceOrderLineItem1.md) | An array of the order&#39;s line items. |  [optional] |
|**outreach** | [**OutreachProperty1**](OutreachProperty1.md) |  |  [optional] |
|**trackingNumber** | **String** | The tracking number associated with the order. |  [optional] |
|**trackingCarrier** | **String** | The tracking carrier associated with the order. |  [optional] |
|**trackingUrl** | **String** | The tracking URL associated with the order. |  [optional] |



## Enum: TrackingCodeEnum

| Name | Value |
|---- | -----|
| PREC | &quot;prec&quot; |



