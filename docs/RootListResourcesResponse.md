

# RootListResourcesResponse

The API root resource links to all other resources available in the API.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | The Mailchimp account ID. |  [optional] [readonly] |
|**loginId** | **String** | The ID associated with the user who owns this API key. If you can login to multiple accounts, this ID will be the same for each account. |  [optional] [readonly] |
|**accountName** | **String** | The name of the account. |  [optional] [readonly] |
|**email** | **String** | The account email address. |  [optional] [readonly] |
|**firstName** | **String** | The first name tied to the account. |  [optional] [readonly] |
|**lastName** | **String** | The last name tied to the account. |  [optional] [readonly] |
|**username** | **String** | The username tied to the account. |  [optional] [readonly] |
|**avatarUrl** | **String** | URL of the avatar for the user. |  [optional] [readonly] |
|**role** | **String** | The [user role](https://mailchimp.com/help/manage-user-levels-in-your-account/) for the account. |  [optional] [readonly] |
|**memberSince** | **OffsetDateTime** | The date and time that the account was created in ISO 8601 format. |  [optional] [readonly] |
|**pricingPlanType** | [**PricingPlanTypeEnum**](#PricingPlanTypeEnum) | The type of pricing plan the account is on. |  [optional] [readonly] |
|**firstPayment** | **OffsetDateTime** | Date of first payment for monthly plans. |  [optional] [readonly] |
|**accountTimezone** | **String** | The timezone currently set for the account. |  [optional] [readonly] |
|**accountIndustry** | **String** | The user-specified industry associated with the account. |  [optional] [readonly] |
|**contact** | [**AccountContactProperty**](AccountContactProperty.md) |  |  [optional] |
|**proEnabled** | **Boolean** | Legacy - whether the account includes [Mailchimp Pro](https://mailchimp.com/help/about-mailchimp-pro/). |  [optional] [readonly] |
|**lastLogin** | **OffsetDateTime** | The date and time of the last login for this account in ISO 8601 format. |  [optional] [readonly] |
|**totalSubscribers** | **Integer** | The total number of subscribers across all lists in the account. |  [optional] [readonly] |
|**industryStats** | [**IndustryStatsProperty**](IndustryStatsProperty.md) |  |  [optional] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



## Enum: PricingPlanTypeEnum

| Name | Value |
|---- | -----|
| MONTHLY | &quot;monthly&quot; |
| PAY_AS_YOU_GO | &quot;pay_as_you_go&quot; |
| FOREVER_FREE | &quot;forever_free&quot; |



