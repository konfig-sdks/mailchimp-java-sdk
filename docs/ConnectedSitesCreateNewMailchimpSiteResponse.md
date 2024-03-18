

# ConnectedSitesCreateNewMailchimpSiteResponse

Information about a specific connected site.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**foreignId** | **String** | The unique identifier for the site. |  [optional] [readonly] |
|**storeId** | **String** | The unique identifier for the ecommerce store that&#39;s associated with the connected site (if any). The store_id for a specific connected site can&#39;t change. |  [optional] [readonly] |
|**platform** | **String** | The platform of the connected site. |  [optional] [readonly] |
|**domain** | **String** | The connected site domain. |  [optional] [readonly] |
|**siteScript** | [**ScriptProperty2**](ScriptProperty2.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | The date and time the connected site was created in ISO 8601 format. |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** | The date and time the connected site was last updated in ISO 8601 format. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



