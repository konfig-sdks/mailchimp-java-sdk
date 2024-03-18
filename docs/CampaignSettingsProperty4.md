

# CampaignSettingsProperty4

The settings for your campaign, including subject, from name, reply-to address, and more.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title of the campaign. |  [optional] |
|**subjectLine** | **String** | The subject line for the campaign. |  [optional] |
|**previewText** | **String** | The preview text for the campaign. |  [optional] |
|**fromName** | **String** | The &#39;from&#39; name on the campaign (not an email address). |  [optional] |
|**replyTo** | **String** | The reply-to email address for the campaign. |  [optional] |
|**useConversation** | **Boolean** | Use Mailchimp Conversation feature to manage out-of-office replies. |  [optional] |
|**toName** | **String** | The campaign&#39;s custom &#39;To&#39; name. Typically the first name [audience field](https://mailchimp.com/help/getting-started-with-merge-tags/). |  [optional] |
|**folderId** | **String** | If the campaign is listed in a folder, the id for that folder. |  [optional] |
|**authenticate** | **Boolean** | Whether Mailchimp [authenticated](https://mailchimp.com/help/about-email-authentication/) the campaign. Defaults to &#x60;true&#x60;. |  [optional] |
|**autoFooter** | **Boolean** | Automatically append Mailchimp&#39;s [default footer](https://mailchimp.com/help/about-campaign-footers/) to the campaign. |  [optional] |
|**inlineCss** | **Boolean** | Automatically inline the CSS included with the campaign content. |  [optional] |
|**autoTweet** | **Boolean** | Automatically tweet a link to the [campaign archive](https://mailchimp.com/help/about-email-campaign-archives-and-pages/) page when the campaign is sent. |  [optional] |
|**autoFbPost** | **List&lt;String&gt;** | An array of [Facebook](https://mailchimp.com/help/connect-or-disconnect-the-facebook-integration/) page ids to auto-post to. |  [optional] |
|**fbComments** | **Boolean** | Allows Facebook comments on the campaign (also force-enables the Campaign Archive toolbar). Defaults to &#x60;true&#x60;. |  [optional] |
|**timewarp** | **Boolean** | Send this campaign using [Timewarp](https://mailchimp.com/help/use-timewarp/). |  [optional] [readonly] |
|**templateId** | **Integer** | The id for the template used in this campaign. |  [optional] |
|**dragAndDrop** | **Boolean** | Whether the campaign uses the drag-and-drop editor. |  [optional] [readonly] |



