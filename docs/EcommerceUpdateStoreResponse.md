

# EcommerceUpdateStoreResponse

An individual store in an account.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for the store. |  [optional] [readonly] |
|**listId** | **String** | The unique identifier for the list that&#39;s associated with the store. The &#x60;list_id&#x60; for a specific store can&#39;t change. |  [optional] [readonly] |
|**name** | **String** | The name of the store. |  [optional] |
|**platform** | **String** | The e-commerce platform of the store. |  [optional] |
|**domain** | **String** | The store domain.  The store domain must be unique within a user account. |  [optional] |
|**isSyncing** | **Boolean** | Whether to disable automations because the store is currently [syncing](https://mailchimp.com/developer/marketing/docs/e-commerce/#pausing-store-automations). |  [optional] |
|**emailAddress** | **String** | The email address for the store. |  [optional] |
|**currencyCode** | **String** | The three-letter ISO 4217 code for the currency that the store accepts. |  [optional] |
|**moneyFormat** | **String** | The currency format for the store. For example: &#x60;$&#x60;, &#x60;£&#x60;, etc. |  [optional] |
|**primaryLocale** | **String** | The primary locale for the store. For example: &#x60;en&#x60;, &#x60;de&#x60;, etc. |  [optional] |
|**timezone** | **String** | The timezone for the store. |  [optional] |
|**phone** | **String** | The store phone number. |  [optional] |
|**address** | [**AddressProperty17**](AddressProperty17.md) |  |  [optional] |
|**connectedSite** | [**ConnectedSiteProperty6**](ConnectedSiteProperty6.md) |  |  [optional] |
|**automations** | [**AutomationsProperty6**](AutomationsProperty6.md) |  |  [optional] |
|**listIsActive** | **Boolean** | The status of the list connected to the store, namely if it&#39;s deleted or disabled. |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** | The date and time the store was created in ISO 8601 format. |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | The date and time the store was last updated in ISO 8601 format. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



