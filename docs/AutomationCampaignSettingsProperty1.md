

# AutomationCampaignSettingsProperty1

The settings for the Automation workflow.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The title of the Automation. |  [optional] |
|**fromName** | **String** | The &#39;from&#39; name for the Automation (not an email address). |  [optional] |
|**replyTo** | **String** | The reply-to email address for the Automation. |  [optional] |
|**useConversation** | **Boolean** | Whether to use Mailchimp Conversation feature to manage replies |  [optional] |
|**toName** | **String** | The Automation&#39;s custom &#39;To&#39; name, typically the first name [audience field](https://mailchimp.com/help/getting-started-with-merge-tags/). |  [optional] |
|**authenticate** | **Boolean** | Whether Mailchimp [authenticated](https://mailchimp.com/help/about-email-authentication/) the Automation. Defaults to &#x60;true&#x60;. |  [optional] |
|**autoFooter** | **Boolean** | Whether to automatically append Mailchimp&#39;s [default footer](https://mailchimp.com/help/about-campaign-footers/) to the Automation. |  [optional] |
|**inlineCss** | **Boolean** | Whether to automatically inline the CSS included with the Automation content. |  [optional] |



