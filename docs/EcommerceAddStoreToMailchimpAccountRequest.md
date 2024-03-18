

# EcommerceAddStoreToMailchimpAccountRequest

An individual store in an account.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for the store. |  |
|**listId** | **String** | The unique identifier for the list associated with the store. The &#x60;list_id&#x60; for a specific store cannot change. |  |
|**name** | **String** | The name of the store. |  |
|**platform** | **String** | The e-commerce platform of the store. |  [optional] |
|**domain** | **String** | The store domain. This parameter is required for Connected Sites and Google Ads. |  [optional] |
|**isSyncing** | **Boolean** | Whether to disable automations because the store is currently [syncing](https://mailchimp.com/developer/marketing/docs/e-commerce/#pausing-store-automations). |  [optional] |
|**emailAddress** | **String** | The email address for the store. |  [optional] |
|**currencyCode** | **String** | The three-letter ISO 4217 code for the currency that the store accepts. |  |
|**moneyFormat** | **String** | The currency format for the store. For example: &#x60;$&#x60;, &#x60;£&#x60;, etc. |  [optional] |
|**primaryLocale** | **String** | The primary locale for the store. For example: &#x60;en&#x60;, &#x60;de&#x60;, etc. |  [optional] |
|**timezone** | **String** | The timezone for the store. |  [optional] |
|**phone** | **String** | The store phone number. |  [optional] |
|**address** | [**AddressProperty**](AddressProperty.md) |  |  [optional] |



