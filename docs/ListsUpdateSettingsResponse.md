

# ListsUpdateSettingsResponse

Information about a specific list.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A string that uniquely identifies this list. |  [optional] [readonly] |
|**webId** | **Integer** | The ID used in the Mailchimp web application. View this list in your Mailchimp account at &#x60;https://{dc}.admin.mailchimp.com/lists/members/?id&#x3D;{web_id}&#x60;. |  [optional] [readonly] |
|**name** | **String** | The name of the list. |  [optional] |
|**contact** | [**ListContactProperty2**](ListContactProperty2.md) |  |  [optional] |
|**permissionReminder** | **String** | The [permission reminder](https://mailchimp.com/help/edit-the-permission-reminder/) for the list. |  [optional] |
|**useArchiveBar** | **Boolean** | Whether campaigns for this list use the [Archive Bar](https://mailchimp.com/help/about-email-campaign-archives-and-pages/) in archives by default. |  [optional] |
|**campaignDefaults** | [**CampaignDefaultsProperty1**](CampaignDefaultsProperty1.md) |  |  [optional] |
|**notifyOnSubscribe** | **String** | The email address to send [subscribe notifications](https://mailchimp.com/help/change-subscribe-and-unsubscribe-notifications/) to. |  [optional] |
|**notifyOnUnsubscribe** | **String** | The email address to send [unsubscribe notifications](https://mailchimp.com/help/change-subscribe-and-unsubscribe-notifications/) to. |  [optional] |
|**dateCreated** | **OffsetDateTime** | The date and time that this list was created in ISO 8601 format. |  [optional] [readonly] |
|**listRating** | **Integer** | An auto-generated activity score for the list (0-5). |  [optional] [readonly] |
|**emailTypeOption** | **Boolean** | Whether the list supports [multiple formats for emails](https://mailchimp.com/help/change-audience-name-defaults/). When set to &#x60;true&#x60;, subscribers can choose whether they want to receive HTML or plain-text emails. When set to &#x60;false&#x60;, subscribers will receive HTML emails, with a plain-text alternative backup. |  [optional] |
|**subscribeUrlShort** | **String** | Our [url shortened](https://mailchimp.com/help/share-your-signup-form/) version of this list&#39;s subscribe form. |  [optional] [readonly] |
|**subscribeUrlLong** | **String** | The full version of this list&#39;s subscribe form (host will vary). |  [optional] [readonly] |
|**beamerAddress** | **String** | The list&#39;s [Email Beamer](https://mailchimp.com/help/use-email-beamer-to-create-a-campaign/) address. |  [optional] [readonly] |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | Legacy - visibility settings are no longer used |  [optional] |
|**doubleOptin** | **Boolean** | Whether or not to require the subscriber to confirm subscription via email. |  [optional] |
|**hasWelcome** | **Boolean** | Whether or not this list has a welcome automation connected. Welcome Automations: welcomeSeries, singleWelcome, emailFollowup. |  [optional] |
|**marketingPermissions** | **Boolean** | Whether or not the list has marketing permissions (eg. GDPR) enabled. |  [optional] |
|**modules** | **List&lt;String&gt;** | Any list-specific modules installed for this list. |  [optional] [readonly] |
|**stats** | [**StatisticsProperty**](StatisticsProperty.md) |  |  [optional] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| PUB | &quot;pub&quot; |
| PRV | &quot;prv&quot; |



