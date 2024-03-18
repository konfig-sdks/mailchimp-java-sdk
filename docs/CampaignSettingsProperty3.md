

# CampaignSettingsProperty3

Settings for the campaign including the email subject, from name, and from email address.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title of the campaign. |  [optional] |
|**subjectLine** | **String** | The subject line for the campaign. |  [optional] |
|**previewText** | **String** | The preview text for the campaign. |  [optional] |
|**fromName** | **String** | The &#39;from&#39; name on the campaign (not an email address). |  [optional] |
|**replyTo** | **String** | The reply-to email address for the campaign. |  [optional] |
|**authenticate** | **Boolean** | Whether Mailchimp [authenticated](https://mailchimp.com/help/about-email-authentication/) the campaign. Defaults to &#x60;true&#x60;. |  [optional] |
|**autoFooter** | **Boolean** | Automatically append Mailchimp&#39;s [default footer](https://mailchimp.com/help/about-campaign-footers/) to the campaign. |  [optional] |
|**inlineCss** | **Boolean** | Automatically inline the CSS included with the campaign content. |  [optional] |
|**autoTweet** | **Boolean** | Automatically tweet a link to the [campaign archive](https://mailchimp.com/help/about-email-campaign-archives-and-pages/) page when the campaign is sent. |  [optional] |
|**autoFbPost** | **List&lt;String&gt;** | An array of [Facebook](https://mailchimp.com/help/connect-or-disconnect-the-facebook-integration/) page ids to auto-post to. |  [optional] |
|**fbComments** | **Boolean** | Allows Facebook comments on the campaign (also force-enables the Campaign Archive toolbar). Defaults to &#x60;true&#x60;. |  [optional] |
|**templateId** | **Integer** | The id for the template used in this campaign. |  [optional] |
|**dragAndDrop** | **Boolean** | Whether the campaign uses the drag-and-drop editor. |  [optional] [readonly] |



