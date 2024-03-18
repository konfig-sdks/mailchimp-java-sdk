

# ListsGetAllInfoResponse

A collection of subscriber lists for this account. Lists contain subscribers who have opted-in to receive correspondence from you or your organization.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lists** | [**List&lt;SubscriberList&gt;**](SubscriberList.md) | An array of objects, each representing a list. |  |
|**totalItems** | **Integer** | The total number of items matching the query regardless of pagination. |  [optional] [readonly] |
|**constraints** | [**CollectionAuthorizationProperty**](CollectionAuthorizationProperty.md) |  |  [optional] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



