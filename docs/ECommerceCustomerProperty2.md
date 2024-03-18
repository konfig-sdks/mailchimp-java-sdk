

# ECommerceCustomerProperty2

Information about a specific customer. For existing customers include only the `id` parameter in the `customer` object body.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier for the customer. Limited to 50 characters. |  |
|**emailAddress** | **String** | The customer&#39;s email address. |  [optional] |
|**optInStatus** | **Boolean** | The customer&#39;s opt-in status. This value will never overwrite the opt-in status of a pre-existing Mailchimp list member, but will apply to list members that are added through the e-commerce API endpoints. Customers who don&#39;t opt in to your Mailchimp list [will be added as &#x60;Transactional&#x60; members](https://mailchimp.com/developer/marketing/docs/e-commerce/#customers). |  [optional] |
|**company** | **String** | The customer&#39;s company. |  [optional] |
|**firstName** | **String** | The customer&#39;s first name. |  [optional] |
|**lastName** | **String** | The customer&#39;s last name. |  [optional] |
|**address** | [**AddressProperty7**](AddressProperty7.md) |  |  [optional] |



