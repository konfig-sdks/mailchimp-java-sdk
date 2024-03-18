

# ECommerceCustomerProperty13

Information about a specific customer.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique identifier for the customer. |  [optional] [readonly] |
|**emailAddress** | **String** | The customer&#39;s email address. |  [optional] [readonly] |
|**optInStatus** | **Boolean** | The customer&#39;s opt-in status. This value will never overwrite the opt-in status of a pre-existing Mailchimp list member, but will apply to list members that are added through the e-commerce API endpoints. Customers who don&#39;t opt in to your Mailchimp list [will be added as &#x60;Transactional&#x60; members](https://mailchimp.com/developer/marketing/docs/e-commerce/#customers). |  [optional] |
|**company** | **String** | The customer&#39;s company. |  [optional] |
|**firstName** | **String** | The customer&#39;s first name. |  [optional] |
|**lastName** | **String** | The customer&#39;s last name. |  [optional] |
|**ordersCount** | **Integer** | The customer&#39;s total order count. |  [optional] [readonly] |
|**totalSpent** | **Double** | The total amount the customer has spent. |  [optional] [readonly] |
|**address** | [**AddressProperty26**](AddressProperty26.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | The date and time the customer was created in ISO 8601 format. |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | The date and time the customer was last updated in ISO 8601 format. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



