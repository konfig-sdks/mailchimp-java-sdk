

# CampaignTrackingOptionsProperty

The tracking options for a campaign.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**opens** | **Boolean** | Whether to [track opens](https://mailchimp.com/help/about-open-tracking/). Defaults to &#x60;true&#x60;. Cannot be set to false for variate campaigns. |  [optional] |
|**htmlClicks** | **Boolean** | Whether to [track clicks](https://mailchimp.com/help/enable-and-view-click-tracking/) in the HTML version of the campaign. Defaults to &#x60;true&#x60;. Cannot be set to false for variate campaigns. |  [optional] |
|**textClicks** | **Boolean** | Whether to [track clicks](https://mailchimp.com/help/enable-and-view-click-tracking/) in the plain-text version of the campaign. Defaults to &#x60;true&#x60;. Cannot be set to false for variate campaigns. |  [optional] |
|**goalTracking** | **Boolean** | Deprecated |  [optional] |
|**ecomm360** | **Boolean** | Whether to enable e-commerce tracking. |  [optional] |
|**googleAnalytics** | **String** | The custom slug for [Google Analytics](https://mailchimp.com/help/integrate-google-analytics-with-mailchimp/) tracking (max of 50 bytes). |  [optional] |
|**clicktale** | **String** | The custom slug for [ClickTale](https://mailchimp.com/help/additional-tracking-options-for-campaigns/) tracking (max of 50 bytes). |  [optional] |
|**salesforce** | [**SalesforceCRMTrackingProperty**](SalesforceCRMTrackingProperty.md) |  |  [optional] |
|**capsule** | [**CapsuleCRMTrackingProperty**](CapsuleCRMTrackingProperty.md) |  |  [optional] |



