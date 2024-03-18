<div align="left">

[![Visit Mailchimp](./header.png)](https://mailchimp.com&#x2F;)

# [Mailchimp](https://mailchimp.com&#x2F;)

Mailchimp is a marketing platform for small businesses. It offers an all-in-one marketing solution that includes email marketing, ads, landing pages, and automation. With Mailchimp, businesses can design and send targeted campaigns, analyze their performance, and grow their audience.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Mailchimp&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>mailchimp-java-sdk</artifactId>
  <version>3.0.55</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:mailchimp-java-sdk:3.0.55"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/mailchimp-java-sdk-3.0.55.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SurveysApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://server.api.mailchimp.com/3.0";
    
    // Configure HTTP basic authorization: basicAuth
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    Mailchimp client = new Mailchimp(configuration);
    String listId = "listId_example"; // The unique ID for the list.
    String surveyId = "surveyId_example"; // The ID of the survey.
    try {
      SurveysGenerateCampaignResponse result = client
              .surveys
              .generateCampaign(listId, surveyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getWebId());
      System.out.println(result.getParentCampaignId());
      System.out.println(result.getType());
      System.out.println(result.getCreateTime());
      System.out.println(result.getArchiveUrl());
      System.out.println(result.getLongArchiveUrl());
      System.out.println(result.getStatus());
      System.out.println(result.getEmailsSent());
      System.out.println(result.getSendTime());
      System.out.println(result.getContentType());
      System.out.println(result.getNeedsBlockRefresh());
      System.out.println(result.getResendable());
      System.out.println(result.getRecipients());
      System.out.println(result.getSettings());
      System.out.println(result.getVariateSettings());
      System.out.println(result.getTracking());
      System.out.println(result.getRssOpts());
      System.out.println(result.getAbSplitOpts());
      System.out.println(result.getSocialCard());
      System.out.println(result.getReportSummary());
      System.out.println(result.getDeliveryStatus());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling SurveysApi#generateCampaign");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SurveysGenerateCampaignResponse> response = client
              .surveys
              .generateCampaign(listId, surveyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SurveysApi#generateCampaign");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://server.api.mailchimp.com/3.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*SurveysApi* | [**generateCampaign**](docs/SurveysApi.md#generateCampaign) | **POST** /lists/{list_id}/surveys/{survey_id}/actions/create-email | Create a Survey Campaign
*SurveysApi* | [**publishSurveyAction**](docs/SurveysApi.md#publishSurveyAction) | **POST** /lists/{list_id}/surveys/{survey_id}/actions/publish | Publish a Survey
*SurveysApi* | [**unpublishSurveyAction**](docs/SurveysApi.md#unpublishSurveyAction) | **POST** /lists/{list_id}/surveys/{survey_id}/actions/unpublish | Unpublish a Survey
*AccountExportApi* | [**info**](docs/AccountExportApi.md#info) | **GET** /account-exports/{export_id} | Get account export info
*AccountExportsApi* | [**createNewExport**](docs/AccountExportsApi.md#createNewExport) | **POST** /account-exports | Add export
*AccountExportsApi* | [**listForGivenAccount**](docs/AccountExportsApi.md#listForGivenAccount) | **GET** /account-exports | List account exports
*ActivityFeedApi* | [**getLatestChimpChatter**](docs/ActivityFeedApi.md#getLatestChimpChatter) | **GET** /activity-feed/chimp-chatter | Get latest chimp chatter
*AuthorizedAppsApi* | [**getInfo**](docs/AuthorizedAppsApi.md#getInfo) | **GET** /authorized-apps/{app_id} | Get authorized app info
*AuthorizedAppsApi* | [**listConnectedApplications**](docs/AuthorizedAppsApi.md#listConnectedApplications) | **GET** /authorized-apps | List authorized apps
*AutomationsApi* | [**addSubscriberToWorkflowEmail**](docs/AutomationsApi.md#addSubscriberToWorkflowEmail) | **POST** /automations/{workflow_id}/emails/{workflow_email_id}/queue | Add subscriber to workflow email
*AutomationsApi* | [**archiveAction**](docs/AutomationsApi.md#archiveAction) | **POST** /automations/{workflow_id}/actions/archive | Archive automation
*AutomationsApi* | [**classicAutomationSubscriberInfo**](docs/AutomationsApi.md#classicAutomationSubscriberInfo) | **GET** /automations/{workflow_id}/emails/{workflow_email_id}/queue/{subscriber_hash} | Get automated email subscriber
*AutomationsApi* | [**createClassic**](docs/AutomationsApi.md#createClassic) | **POST** /automations | Add automation
*AutomationsApi* | [**deleteWorkflowEmail**](docs/AutomationsApi.md#deleteWorkflowEmail) | **DELETE** /automations/{workflow_id}/emails/{workflow_email_id} | Delete workflow email
*AutomationsApi* | [**getClassicWorkflowEmails**](docs/AutomationsApi.md#getClassicWorkflowEmails) | **GET** /automations/{workflow_id}/emails | List automated emails
*AutomationsApi* | [**getClassicWorkflowInfo**](docs/AutomationsApi.md#getClassicWorkflowInfo) | **GET** /automations/{workflow_id} | Get automation info
*AutomationsApi* | [**getEmailInfo**](docs/AutomationsApi.md#getEmailInfo) | **GET** /automations/{workflow_id}/emails/{workflow_email_id} | Get workflow email info
*AutomationsApi* | [**getRemovedSubscriberInfo**](docs/AutomationsApi.md#getRemovedSubscriberInfo) | **GET** /automations/{workflow_id}/removed-subscribers/{subscriber_hash} | Get subscriber removed from workflow
*AutomationsApi* | [**getRemovedSubscribers**](docs/AutomationsApi.md#getRemovedSubscribers) | **GET** /automations/{workflow_id}/removed-subscribers | List subscribers removed from workflow
*AutomationsApi* | [**listQueueEmails**](docs/AutomationsApi.md#listQueueEmails) | **GET** /automations/{workflow_id}/emails/{workflow_email_id}/queue | List automated email subscribers
*AutomationsApi* | [**listSummary**](docs/AutomationsApi.md#listSummary) | **GET** /automations | List automations
*AutomationsApi* | [**pauseAutomatedEmail**](docs/AutomationsApi.md#pauseAutomatedEmail) | **POST** /automations/{workflow_id}/emails/{workflow_email_id}/actions/pause | Pause automated email
*AutomationsApi* | [**pauseWorkflowEmails**](docs/AutomationsApi.md#pauseWorkflowEmails) | **POST** /automations/{workflow_id}/actions/pause-all-emails | Pause automation emails
*AutomationsApi* | [**removeSubscriberFromWorkflow**](docs/AutomationsApi.md#removeSubscriberFromWorkflow) | **POST** /automations/{workflow_id}/removed-subscribers | Remove subscriber from workflow
*AutomationsApi* | [**startAllEmails**](docs/AutomationsApi.md#startAllEmails) | **POST** /automations/{workflow_id}/actions/start-all-emails | Start automation emails
*AutomationsApi* | [**startAutomatedEmail**](docs/AutomationsApi.md#startAutomatedEmail) | **POST** /automations/{workflow_id}/emails/{workflow_email_id}/actions/start | Start automated email
*AutomationsApi* | [**updateWorkflowEmail**](docs/AutomationsApi.md#updateWorkflowEmail) | **PATCH** /automations/{workflow_id}/emails/{workflow_email_id} | Update workflow email
*BatchWebhooksApi* | [**addWebhook**](docs/BatchWebhooksApi.md#addWebhook) | **POST** /batch-webhooks | Add batch webhook
*BatchWebhooksApi* | [**getInfo**](docs/BatchWebhooksApi.md#getInfo) | **GET** /batch-webhooks/{batch_webhook_id} | Get batch webhook info
*BatchWebhooksApi* | [**listWebhooks**](docs/BatchWebhooksApi.md#listWebhooks) | **GET** /batch-webhooks | List batch webhooks
*BatchWebhooksApi* | [**removeWebhook**](docs/BatchWebhooksApi.md#removeWebhook) | **DELETE** /batch-webhooks/{batch_webhook_id} | Delete batch webhook
*BatchWebhooksApi* | [**updateWebhook**](docs/BatchWebhooksApi.md#updateWebhook) | **PATCH** /batch-webhooks/{batch_webhook_id} | Update batch webhook
*BatchesApi* | [**getOperationStatus**](docs/BatchesApi.md#getOperationStatus) | **GET** /batches/{batch_id} | Get batch operation status
*BatchesApi* | [**listRequestsSummary**](docs/BatchesApi.md#listRequestsSummary) | **GET** /batches | List batch requests
*BatchesApi* | [**startOperationProcess**](docs/BatchesApi.md#startOperationProcess) | **POST** /batches | Start batch operation
*BatchesApi* | [**stopRequest**](docs/BatchesApi.md#stopRequest) | **DELETE** /batches/{batch_id} | Delete batch request
*CampaignFoldersApi* | [**addNewFolder**](docs/CampaignFoldersApi.md#addNewFolder) | **POST** /campaign-folders | Add campaign folder
*CampaignFoldersApi* | [**deleteFolder**](docs/CampaignFoldersApi.md#deleteFolder) | **DELETE** /campaign-folders/{folder_id} | Delete campaign folder
*CampaignFoldersApi* | [**getFolderInfo**](docs/CampaignFoldersApi.md#getFolderInfo) | **GET** /campaign-folders/{folder_id} | Get campaign folder
*CampaignFoldersApi* | [**listCampaignFolders**](docs/CampaignFoldersApi.md#listCampaignFolders) | **GET** /campaign-folders | List campaign folders
*CampaignFoldersApi* | [**updateSpecificFolder**](docs/CampaignFoldersApi.md#updateSpecificFolder) | **PATCH** /campaign-folders/{folder_id} | Update campaign folder
*CampaignsApi* | [**addFeedback**](docs/CampaignsApi.md#addFeedback) | **POST** /campaigns/{campaign_id}/feedback | Add campaign feedback
*CampaignsApi* | [**cancelSendAction**](docs/CampaignsApi.md#cancelSendAction) | **POST** /campaigns/{campaign_id}/actions/cancel-send | Cancel campaign
*CampaignsApi* | [**createNewMailchimpCampaign**](docs/CampaignsApi.md#createNewMailchimpCampaign) | **POST** /campaigns | Add campaign
*CampaignsApi* | [**getAll**](docs/CampaignsApi.md#getAll) | **GET** /campaigns | List campaigns
*CampaignsApi* | [**getContent**](docs/CampaignsApi.md#getContent) | **GET** /campaigns/{campaign_id}/content | Get campaign content
*CampaignsApi* | [**getFeedbackMessage**](docs/CampaignsApi.md#getFeedbackMessage) | **GET** /campaigns/{campaign_id}/feedback/{feedback_id} | Get campaign feedback message
*CampaignsApi* | [**getInfo**](docs/CampaignsApi.md#getInfo) | **GET** /campaigns/{campaign_id} | Get campaign info
*CampaignsApi* | [**getSendChecklist**](docs/CampaignsApi.md#getSendChecklist) | **GET** /campaigns/{campaign_id}/send-checklist | Get campaign send checklist
*CampaignsApi* | [**listFeedback**](docs/CampaignsApi.md#listFeedback) | **GET** /campaigns/{campaign_id}/feedback | List campaign feedback
*CampaignsApi* | [**pauseRssCampaign**](docs/CampaignsApi.md#pauseRssCampaign) | **POST** /campaigns/{campaign_id}/actions/pause | Pause rss campaign
*CampaignsApi* | [**removeCampaign**](docs/CampaignsApi.md#removeCampaign) | **DELETE** /campaigns/{campaign_id} | Delete campaign
*CampaignsApi* | [**removeFeedbackMessage**](docs/CampaignsApi.md#removeFeedbackMessage) | **DELETE** /campaigns/{campaign_id}/feedback/{feedback_id} | Delete campaign feedback message
*CampaignsApi* | [**replicateAction**](docs/CampaignsApi.md#replicateAction) | **POST** /campaigns/{campaign_id}/actions/replicate | Replicate campaign
*CampaignsApi* | [**resendAction**](docs/CampaignsApi.md#resendAction) | **POST** /campaigns/{campaign_id}/actions/create-resend | Resend campaign
*CampaignsApi* | [**resumeRssCampaign**](docs/CampaignsApi.md#resumeRssCampaign) | **POST** /campaigns/{campaign_id}/actions/resume | Resume rss campaign
*CampaignsApi* | [**scheduleDelivery**](docs/CampaignsApi.md#scheduleDelivery) | **POST** /campaigns/{campaign_id}/actions/schedule | Schedule campaign
*CampaignsApi* | [**sendAction**](docs/CampaignsApi.md#sendAction) | **POST** /campaigns/{campaign_id}/actions/send | Send campaign
*CampaignsApi* | [**sendTestEmail**](docs/CampaignsApi.md#sendTestEmail) | **POST** /campaigns/{campaign_id}/actions/test | Send test email
*CampaignsApi* | [**setContent**](docs/CampaignsApi.md#setContent) | **PUT** /campaigns/{campaign_id}/content | Set campaign content
*CampaignsApi* | [**unscheduleAction**](docs/CampaignsApi.md#unscheduleAction) | **POST** /campaigns/{campaign_id}/actions/unschedule | Unschedule campaign
*CampaignsApi* | [**updateFeedbackMessage**](docs/CampaignsApi.md#updateFeedbackMessage) | **PATCH** /campaigns/{campaign_id}/feedback/{feedback_id} | Update campaign feedback message
*CampaignsApi* | [**updateSettings**](docs/CampaignsApi.md#updateSettings) | **PATCH** /campaigns/{campaign_id} | Update campaign settings
*ConnectedSitesApi* | [**createNewMailchimpSite**](docs/ConnectedSitesApi.md#createNewMailchimpSite) | **POST** /connected-sites | Add connected site
*ConnectedSitesApi* | [**getInfo**](docs/ConnectedSitesApi.md#getInfo) | **GET** /connected-sites/{connected_site_id} | Get connected site
*ConnectedSitesApi* | [**listAll**](docs/ConnectedSitesApi.md#listAll) | **GET** /connected-sites | List connected sites
*ConnectedSitesApi* | [**removeSite**](docs/ConnectedSitesApi.md#removeSite) | **DELETE** /connected-sites/{connected_site_id} | Delete connected site
*ConnectedSitesApi* | [**verifyScriptInstallation**](docs/ConnectedSitesApi.md#verifyScriptInstallation) | **POST** /connected-sites/{connected_site_id}/actions/verify-script-installation | Verify connected site script
*ConversationsApi* | [**getAllConversations**](docs/ConversationsApi.md#getAllConversations) | **GET** /conversations | List conversations
*ConversationsApi* | [**getById**](docs/ConversationsApi.md#getById) | **GET** /conversations/{conversation_id} | Get conversation
*ConversationsApi* | [**getMessageById**](docs/ConversationsApi.md#getMessageById) | **GET** /conversations/{conversation_id}/messages/{message_id} | Get message
*ConversationsApi* | [**listMessagesFromConversation**](docs/ConversationsApi.md#listMessagesFromConversation) | **GET** /conversations/{conversation_id}/messages | List messages
*CustomerJourneysApi* | [**triggerStepAction**](docs/CustomerJourneysApi.md#triggerStepAction) | **POST** /customer-journeys/journeys/{journey_id}/steps/{step_id}/actions/trigger | Customer Journeys API trigger for a contact
*EcommerceApi* | [**addCartLineItem**](docs/EcommerceApi.md#addCartLineItem) | **POST** /ecommerce/stores/{store_id}/carts/{cart_id}/lines | Add cart line item
*EcommerceApi* | [**addCartToStore**](docs/EcommerceApi.md#addCartToStore) | **POST** /ecommerce/stores/{store_id}/carts | Add cart
*EcommerceApi* | [**addCustomerToStore**](docs/EcommerceApi.md#addCustomerToStore) | **POST** /ecommerce/stores/{store_id}/customers | Add customer
*EcommerceApi* | [**addOrUpdateCustomer**](docs/EcommerceApi.md#addOrUpdateCustomer) | **PUT** /ecommerce/stores/{store_id}/customers/{customer_id} | Add or update customer
*EcommerceApi* | [**addOrUpdateProductVariant**](docs/EcommerceApi.md#addOrUpdateProductVariant) | **PUT** /ecommerce/stores/{store_id}/products/{product_id}/variants/{variant_id} | Add or update product variant
*EcommerceApi* | [**addOrderLineItem**](docs/EcommerceApi.md#addOrderLineItem) | **POST** /ecommerce/stores/{store_id}/orders/{order_id}/lines | Add order line item
*EcommerceApi* | [**addOrderToStore**](docs/EcommerceApi.md#addOrderToStore) | **POST** /ecommerce/stores/{store_id}/orders | Add order
*EcommerceApi* | [**addProductImage**](docs/EcommerceApi.md#addProductImage) | **POST** /ecommerce/stores/{store_id}/products/{product_id}/images | Add product image
*EcommerceApi* | [**addProductToStore**](docs/EcommerceApi.md#addProductToStore) | **POST** /ecommerce/stores/{store_id}/products | Add product
*EcommerceApi* | [**addProductVariant**](docs/EcommerceApi.md#addProductVariant) | **POST** /ecommerce/stores/{store_id}/products/{product_id}/variants | Add product variant
*EcommerceApi* | [**addPromoCode**](docs/EcommerceApi.md#addPromoCode) | **POST** /ecommerce/stores/{store_id}/promo-rules/{promo_rule_id}/promo-codes | Add promo code
*EcommerceApi* | [**addPromoRule**](docs/EcommerceApi.md#addPromoRule) | **POST** /ecommerce/stores/{store_id}/promo-rules | Add promo rule
*EcommerceApi* | [**addStoreToMailchimpAccount**](docs/EcommerceApi.md#addStoreToMailchimpAccount) | **POST** /ecommerce/stores | Add store
*EcommerceApi* | [**deleteCartLineItem**](docs/EcommerceApi.md#deleteCartLineItem) | **DELETE** /ecommerce/stores/{store_id}/carts/{cart_id}/lines/{line_id} | Delete cart line item
*EcommerceApi* | [**deleteOrder**](docs/EcommerceApi.md#deleteOrder) | **DELETE** /ecommerce/stores/{store_id}/orders/{order_id} | Delete order
*EcommerceApi* | [**deleteOrderLine**](docs/EcommerceApi.md#deleteOrderLine) | **DELETE** /ecommerce/stores/{store_id}/orders/{order_id}/lines/{line_id} | Delete order line item
*EcommerceApi* | [**deleteProduct**](docs/EcommerceApi.md#deleteProduct) | **DELETE** /ecommerce/stores/{store_id}/products/{product_id} | Delete product
*EcommerceApi* | [**deleteProductImage**](docs/EcommerceApi.md#deleteProductImage) | **DELETE** /ecommerce/stores/{store_id}/products/{product_id}/images/{image_id} | Delete product image
*EcommerceApi* | [**deleteProductVariant**](docs/EcommerceApi.md#deleteProductVariant) | **DELETE** /ecommerce/stores/{store_id}/products/{product_id}/variants/{variant_id} | Delete product variant
*EcommerceApi* | [**deletePromoCode**](docs/EcommerceApi.md#deletePromoCode) | **DELETE** /ecommerce/stores/{store_id}/promo-rules/{promo_rule_id}/promo-codes/{promo_code_id} | Delete promo code
*EcommerceApi* | [**deletePromoRule**](docs/EcommerceApi.md#deletePromoRule) | **DELETE** /ecommerce/stores/{store_id}/promo-rules/{promo_rule_id} | Delete promo rule
*EcommerceApi* | [**deleteStore**](docs/EcommerceApi.md#deleteStore) | **DELETE** /ecommerce/stores/{store_id} | Delete store
*EcommerceApi* | [**getCartInfo**](docs/EcommerceApi.md#getCartInfo) | **GET** /ecommerce/stores/{store_id}/carts/{cart_id} | Get cart info
*EcommerceApi* | [**getCartLineItem**](docs/EcommerceApi.md#getCartLineItem) | **GET** /ecommerce/stores/{store_id}/carts/{cart_id}/lines/{line_id} | Get cart line item
*EcommerceApi* | [**getCustomerInfo**](docs/EcommerceApi.md#getCustomerInfo) | **GET** /ecommerce/stores/{store_id}/customers/{customer_id} | Get customer info
*EcommerceApi* | [**getOrderLineItem**](docs/EcommerceApi.md#getOrderLineItem) | **GET** /ecommerce/stores/{store_id}/orders/{order_id}/lines/{line_id} | Get order line item
*EcommerceApi* | [**getProductImageInfo**](docs/EcommerceApi.md#getProductImageInfo) | **GET** /ecommerce/stores/{store_id}/products/{product_id}/images/{image_id} | Get product image info
*EcommerceApi* | [**getProductImages**](docs/EcommerceApi.md#getProductImages) | **GET** /ecommerce/stores/{store_id}/products/{product_id}/images | List product images
*EcommerceApi* | [**getProductVariantInfo**](docs/EcommerceApi.md#getProductVariantInfo) | **GET** /ecommerce/stores/{store_id}/products/{product_id}/variants/{variant_id} | Get product variant info
*EcommerceApi* | [**getPromoCode**](docs/EcommerceApi.md#getPromoCode) | **GET** /ecommerce/stores/{store_id}/promo-rules/{promo_rule_id}/promo-codes/{promo_code_id} | Get promo code
*EcommerceApi* | [**getStoreCarts**](docs/EcommerceApi.md#getStoreCarts) | **GET** /ecommerce/stores/{store_id}/carts | List carts
*EcommerceApi* | [**getStoreCustomers**](docs/EcommerceApi.md#getStoreCustomers) | **GET** /ecommerce/stores/{store_id}/customers | List customers
*EcommerceApi* | [**getStoreInfo**](docs/EcommerceApi.md#getStoreInfo) | **GET** /ecommerce/stores/{store_id} | Get store info
*EcommerceApi* | [**getStoreOrderInfo**](docs/EcommerceApi.md#getStoreOrderInfo) | **GET** /ecommerce/stores/{store_id}/orders/{order_id} | Get order info
*EcommerceApi* | [**getStoreOrderLines**](docs/EcommerceApi.md#getStoreOrderLines) | **GET** /ecommerce/stores/{store_id}/orders/{order_id}/lines | List order line items
*EcommerceApi* | [**getStoreProductInfo**](docs/EcommerceApi.md#getStoreProductInfo) | **GET** /ecommerce/stores/{store_id}/products/{product_id} | Get product info
*EcommerceApi* | [**getStoreProducts**](docs/EcommerceApi.md#getStoreProducts) | **GET** /ecommerce/stores/{store_id}/products | List product
*EcommerceApi* | [**getStorePromoCodes**](docs/EcommerceApi.md#getStorePromoCodes) | **GET** /ecommerce/stores/{store_id}/promo-rules/{promo_rule_id}/promo-codes | List promo codes
*EcommerceApi* | [**getStorePromoRule**](docs/EcommerceApi.md#getStorePromoRule) | **GET** /ecommerce/stores/{store_id}/promo-rules/{promo_rule_id} | Get promo rule
*EcommerceApi* | [**getStorePromoRules**](docs/EcommerceApi.md#getStorePromoRules) | **GET** /ecommerce/stores/{store_id}/promo-rules | List promo rules
*EcommerceApi* | [**listAccountOrders**](docs/EcommerceApi.md#listAccountOrders) | **GET** /ecommerce/orders | List account orders
*EcommerceApi* | [**listCartLines**](docs/EcommerceApi.md#listCartLines) | **GET** /ecommerce/stores/{store_id}/carts/{cart_id}/lines | List cart line items
*EcommerceApi* | [**listProductVariants**](docs/EcommerceApi.md#listProductVariants) | **GET** /ecommerce/stores/{store_id}/products/{product_id}/variants | List product variants
*EcommerceApi* | [**listStoreOrders**](docs/EcommerceApi.md#listStoreOrders) | **GET** /ecommerce/stores/{store_id}/orders | List orders
*EcommerceApi* | [**listStores**](docs/EcommerceApi.md#listStores) | **GET** /ecommerce/stores | List stores
*EcommerceApi* | [**removeCart**](docs/EcommerceApi.md#removeCart) | **DELETE** /ecommerce/stores/{store_id}/carts/{cart_id} | Delete cart
*EcommerceApi* | [**removeCustomer**](docs/EcommerceApi.md#removeCustomer) | **DELETE** /ecommerce/stores/{store_id}/customers/{customer_id} | Delete customer
*EcommerceApi* | [**updateCartById**](docs/EcommerceApi.md#updateCartById) | **PATCH** /ecommerce/stores/{store_id}/carts/{cart_id} | Update cart
*EcommerceApi* | [**updateCartLineItem**](docs/EcommerceApi.md#updateCartLineItem) | **PATCH** /ecommerce/stores/{store_id}/carts/{cart_id}/lines/{line_id} | Update cart line item
*EcommerceApi* | [**updateCustomer**](docs/EcommerceApi.md#updateCustomer) | **PATCH** /ecommerce/stores/{store_id}/customers/{customer_id} | Update customer
*EcommerceApi* | [**updateOrderLine**](docs/EcommerceApi.md#updateOrderLine) | **PATCH** /ecommerce/stores/{store_id}/orders/{order_id}/lines/{line_id} | Update order line item
*EcommerceApi* | [**updateProduct**](docs/EcommerceApi.md#updateProduct) | **PATCH** /ecommerce/stores/{store_id}/products/{product_id} | Update product
*EcommerceApi* | [**updateProductImage**](docs/EcommerceApi.md#updateProductImage) | **PATCH** /ecommerce/stores/{store_id}/products/{product_id}/images/{image_id} | Update product image
*EcommerceApi* | [**updateProductVariant**](docs/EcommerceApi.md#updateProductVariant) | **PATCH** /ecommerce/stores/{store_id}/products/{product_id}/variants/{variant_id} | Update product variant
*EcommerceApi* | [**updatePromoCode**](docs/EcommerceApi.md#updatePromoCode) | **PATCH** /ecommerce/stores/{store_id}/promo-rules/{promo_rule_id}/promo-codes/{promo_code_id} | Update promo code
*EcommerceApi* | [**updatePromoRule**](docs/EcommerceApi.md#updatePromoRule) | **PATCH** /ecommerce/stores/{store_id}/promo-rules/{promo_rule_id} | Update promo rule
*EcommerceApi* | [**updateSpecificOrder**](docs/EcommerceApi.md#updateSpecificOrder) | **PATCH** /ecommerce/stores/{store_id}/orders/{order_id} | Update order
*EcommerceApi* | [**updateStore**](docs/EcommerceApi.md#updateStore) | **PATCH** /ecommerce/stores/{store_id} | Update store
*FacebookAdsApi* | [**getInfo**](docs/FacebookAdsApi.md#getInfo) | **GET** /facebook-ads/{outreach_id} | Get facebook ad info
*FacebookAdsApi* | [**listAds**](docs/FacebookAdsApi.md#listAds) | **GET** /facebook-ads | List facebook ads
*FileManagerApi* | [**addNewFolder**](docs/FileManagerApi.md#addNewFolder) | **POST** /file-manager/folders | Add folder
*FileManagerApi* | [**deleteFolderById**](docs/FileManagerApi.md#deleteFolderById) | **DELETE** /file-manager/folders/{folder_id} | Delete folder
*FileManagerApi* | [**getFile**](docs/FileManagerApi.md#getFile) | **GET** /file-manager/files/{file_id} | Get file
*FileManagerApi* | [**getFolderInfo**](docs/FileManagerApi.md#getFolderInfo) | **GET** /file-manager/folders/{folder_id} | Get folder
*FileManagerApi* | [**getFolderList**](docs/FileManagerApi.md#getFolderList) | **GET** /file-manager/folders | List folders
*FileManagerApi* | [**listStoredFiles**](docs/FileManagerApi.md#listStoredFiles) | **GET** /file-manager/files | List stored files
*FileManagerApi* | [**listStoredFiles_0**](docs/FileManagerApi.md#listStoredFiles_0) | **GET** /file-manager/folders/{folder_id}/files | List stored files
*FileManagerApi* | [**removeFileById**](docs/FileManagerApi.md#removeFileById) | **DELETE** /file-manager/files/{file_id} | Delete file
*FileManagerApi* | [**updateFile**](docs/FileManagerApi.md#updateFile) | **PATCH** /file-manager/files/{file_id} | Update file
*FileManagerApi* | [**updateSpecificFolder**](docs/FileManagerApi.md#updateSpecificFolder) | **PATCH** /file-manager/folders/{folder_id} | Update folder
*FileManagerApi* | [**uploadFile**](docs/FileManagerApi.md#uploadFile) | **POST** /file-manager/files | Add file
*LandingPagesApi* | [**createNewMailchimpLandingPage**](docs/LandingPagesApi.md#createNewMailchimpLandingPage) | **POST** /landing-pages | Add landing page
*LandingPagesApi* | [**deletePage**](docs/LandingPagesApi.md#deletePage) | **DELETE** /landing-pages/{page_id} | Delete landing page
*LandingPagesApi* | [**getContent**](docs/LandingPagesApi.md#getContent) | **GET** /landing-pages/{page_id}/content | Get landing page content
*LandingPagesApi* | [**getPageInfo**](docs/LandingPagesApi.md#getPageInfo) | **GET** /landing-pages/{page_id} | Get landing page info
*LandingPagesApi* | [**list**](docs/LandingPagesApi.md#list) | **GET** /landing-pages | List landing pages
*LandingPagesApi* | [**publishAction**](docs/LandingPagesApi.md#publishAction) | **POST** /landing-pages/{page_id}/actions/publish | Publish landing page
*LandingPagesApi* | [**unpublishAction**](docs/LandingPagesApi.md#unpublishAction) | **POST** /landing-pages/{page_id}/actions/unpublish | Unpublish landing page
*LandingPagesApi* | [**updatePageById**](docs/LandingPagesApi.md#updatePageById) | **PATCH** /landing-pages/{page_id} | Update landing page
*ListsApi* | [**addInterestCategory**](docs/ListsApi.md#addInterestCategory) | **POST** /lists/{list_id}/interest-categories | Add interest category
*ListsApi* | [**addInterestInCategory**](docs/ListsApi.md#addInterestInCategory) | **POST** /lists/{list_id}/interest-categories/{interest_category_id}/interests | Add interest in category
*ListsApi* | [**addMemberEvent**](docs/ListsApi.md#addMemberEvent) | **POST** /lists/{list_id}/members/{subscriber_hash}/events | Add event
*ListsApi* | [**addMemberNote**](docs/ListsApi.md#addMemberNote) | **POST** /lists/{list_id}/members/{subscriber_hash}/notes | Add member note
*ListsApi* | [**addMemberTags**](docs/ListsApi.md#addMemberTags) | **POST** /lists/{list_id}/members/{subscriber_hash}/tags | Add or remove member tags
*ListsApi* | [**addMemberToList**](docs/ListsApi.md#addMemberToList) | **POST** /lists/{list_id}/members | Add member to list
*ListsApi* | [**addMemberToSegment**](docs/ListsApi.md#addMemberToSegment) | **POST** /lists/{list_id}/segments/{segment_id}/members | Add member to segment
*ListsApi* | [**addMergeField**](docs/ListsApi.md#addMergeField) | **POST** /lists/{list_id}/merge-fields | Add merge field
*ListsApi* | [**addNewSegment**](docs/ListsApi.md#addNewSegment) | **POST** /lists/{list_id}/segments | Add segment
*ListsApi* | [**addOrUpdateMember**](docs/ListsApi.md#addOrUpdateMember) | **PUT** /lists/{list_id}/members/{subscriber_hash} | Add or update list member
*ListsApi* | [**archiveMember**](docs/ListsApi.md#archiveMember) | **DELETE** /lists/{list_id}/members/{subscriber_hash} | Archive list member
*ListsApi* | [**batchAddRemoveMembers**](docs/ListsApi.md#batchAddRemoveMembers) | **POST** /lists/{list_id}/segments/{segment_id} | Batch add or remove members
*ListsApi* | [**batchSubscribeOrUnsubscribe**](docs/ListsApi.md#batchSubscribeOrUnsubscribe) | **POST** /lists/{list_id} | Batch subscribe or unsubscribe
*ListsApi* | [**createNewList**](docs/ListsApi.md#createNewList) | **POST** /lists | Add list
*ListsApi* | [**createWebhook**](docs/ListsApi.md#createWebhook) | **POST** /lists/{list_id}/webhooks | Add webhook
*ListsApi* | [**customizeSignupForm**](docs/ListsApi.md#customizeSignupForm) | **POST** /lists/{list_id}/signup-forms | Customize signup form
*ListsApi* | [**deleteInterestCategory**](docs/ListsApi.md#deleteInterestCategory) | **DELETE** /lists/{list_id}/interest-categories/{interest_category_id} | Delete interest category
*ListsApi* | [**deleteInterestInCategory**](docs/ListsApi.md#deleteInterestInCategory) | **DELETE** /lists/{list_id}/interest-categories/{interest_category_id}/interests/{interest_id} | Delete interest in category
*ListsApi* | [**deleteList**](docs/ListsApi.md#deleteList) | **DELETE** /lists/{list_id} | Delete list
*ListsApi* | [**deleteMergeField**](docs/ListsApi.md#deleteMergeField) | **DELETE** /lists/{list_id}/merge-fields/{merge_id} | Delete merge field
*ListsApi* | [**deleteNote**](docs/ListsApi.md#deleteNote) | **DELETE** /lists/{list_id}/members/{subscriber_hash}/notes/{note_id} | Delete note
*ListsApi* | [**deleteSegment**](docs/ListsApi.md#deleteSegment) | **DELETE** /lists/{list_id}/segments/{segment_id} | Delete segment
*ListsApi* | [**deleteWebhook**](docs/ListsApi.md#deleteWebhook) | **DELETE** /lists/{list_id}/webhooks/{webhook_id} | Delete webhook
*ListsApi* | [**getAbuseReport**](docs/ListsApi.md#getAbuseReport) | **GET** /lists/{list_id}/abuse-reports/{report_id} | Get abuse report
*ListsApi* | [**getAllAbuseReports**](docs/ListsApi.md#getAllAbuseReports) | **GET** /lists/{list_id}/abuse-reports | List abuse reports
*ListsApi* | [**getAllInfo**](docs/ListsApi.md#getAllInfo) | **GET** /lists | Get lists info
*ListsApi* | [**getGrowthHistoryByMonth**](docs/ListsApi.md#getGrowthHistoryByMonth) | **GET** /lists/{list_id}/growth-history/{month} | Get growth history by month
*ListsApi* | [**getGrowthHistoryData**](docs/ListsApi.md#getGrowthHistoryData) | **GET** /lists/{list_id}/growth-history | List growth history data
*ListsApi* | [**getInterestCategoryInfo**](docs/ListsApi.md#getInterestCategoryInfo) | **GET** /lists/{list_id}/interest-categories/{interest_category_id} | Get interest category info
*ListsApi* | [**getInterestInCategory**](docs/ListsApi.md#getInterestInCategory) | **GET** /lists/{list_id}/interest-categories/{interest_category_id}/interests/{interest_id} | Get interest in category
*ListsApi* | [**getListInfo**](docs/ListsApi.md#getListInfo) | **GET** /lists/{list_id} | Get list info
*ListsApi* | [**getLocations**](docs/ListsApi.md#getLocations) | **GET** /lists/{list_id}/locations | List locations
*ListsApi* | [**getMemberEvents**](docs/ListsApi.md#getMemberEvents) | **GET** /lists/{list_id}/members/{subscriber_hash}/events | List member events
*ListsApi* | [**getMemberGoals**](docs/ListsApi.md#getMemberGoals) | **GET** /lists/{list_id}/members/{subscriber_hash}/goals | List member goal events
*ListsApi* | [**getMemberInfo**](docs/ListsApi.md#getMemberInfo) | **GET** /lists/{list_id}/members/{subscriber_hash} | Get member info
*ListsApi* | [**getMemberNote**](docs/ListsApi.md#getMemberNote) | **GET** /lists/{list_id}/members/{subscriber_hash}/notes/{note_id} | Get member note
*ListsApi* | [**getMemberNotes**](docs/ListsApi.md#getMemberNotes) | **GET** /lists/{list_id}/members/{subscriber_hash}/notes | List recent member notes
*ListsApi* | [**getMemberTags**](docs/ListsApi.md#getMemberTags) | **GET** /lists/{list_id}/members/{subscriber_hash}/tags | List member tags
*ListsApi* | [**getMembersInfo**](docs/ListsApi.md#getMembersInfo) | **GET** /lists/{list_id}/members | List members info
*ListsApi* | [**getMergeFieldInfo**](docs/ListsApi.md#getMergeFieldInfo) | **GET** /lists/{list_id}/merge-fields/{merge_id} | Get merge field
*ListsApi* | [**getRecentActivityStats**](docs/ListsApi.md#getRecentActivityStats) | **GET** /lists/{list_id}/activity | List recent activity
*ListsApi* | [**getSegmentInfo**](docs/ListsApi.md#getSegmentInfo) | **GET** /lists/{list_id}/segments/{segment_id} | Get segment info
*ListsApi* | [**getSegmentMembers**](docs/ListsApi.md#getSegmentMembers) | **GET** /lists/{list_id}/segments/{segment_id}/members | List members in segment
*ListsApi* | [**getSegmentsInfo**](docs/ListsApi.md#getSegmentsInfo) | **GET** /lists/{list_id}/segments | List segments
*ListsApi* | [**getSignupForms**](docs/ListsApi.md#getSignupForms) | **GET** /lists/{list_id}/signup-forms | List signup forms
*ListsApi* | [**getSurveyDetails**](docs/ListsApi.md#getSurveyDetails) | **GET** /lists/{list_id}/surveys/{survey_id} | Get survey
*ListsApi* | [**getSurveysInfo**](docs/ListsApi.md#getSurveysInfo) | **GET** /lists/{list_id}/surveys | Get information about all surveys for a list
*ListsApi* | [**getWebhookInfo**](docs/ListsApi.md#getWebhookInfo) | **GET** /lists/{list_id}/webhooks/{webhook_id} | Get webhook info
*ListsApi* | [**getWebhooksInfo**](docs/ListsApi.md#getWebhooksInfo) | **GET** /lists/{list_id}/webhooks | List webhooks
*ListsApi* | [**listCategoryInterests**](docs/ListsApi.md#listCategoryInterests) | **GET** /lists/{list_id}/interest-categories/{interest_category_id}/interests | List interests in category
*ListsApi* | [**listInterestCategories**](docs/ListsApi.md#listInterestCategories) | **GET** /lists/{list_id}/interest-categories | List interest categories
*ListsApi* | [**listMergeFields**](docs/ListsApi.md#listMergeFields) | **GET** /lists/{list_id}/merge-fields | List merge fields
*ListsApi* | [**listTopEmailClients**](docs/ListsApi.md#listTopEmailClients) | **GET** /lists/{list_id}/clients | List top email clients
*ListsApi* | [**removeMemberFromSegment**](docs/ListsApi.md#removeMemberFromSegment) | **DELETE** /lists/{list_id}/segments/{segment_id}/members/{subscriber_hash} | Remove list member from segment
*ListsApi* | [**removeMemberPermanent**](docs/ListsApi.md#removeMemberPermanent) | **POST** /lists/{list_id}/members/{subscriber_hash}/actions/delete-permanent | Delete list member
*ListsApi* | [**searchTagsByName**](docs/ListsApi.md#searchTagsByName) | **GET** /lists/{list_id}/tag-search | Search for tags on a list by name.
*ListsApi* | [**updateInterestCategory**](docs/ListsApi.md#updateInterestCategory) | **PATCH** /lists/{list_id}/interest-categories/{interest_category_id} | Update interest category
*ListsApi* | [**updateInterestCategoryInterest**](docs/ListsApi.md#updateInterestCategoryInterest) | **PATCH** /lists/{list_id}/interest-categories/{interest_category_id}/interests/{interest_id} | Update interest in category
*ListsApi* | [**updateMember**](docs/ListsApi.md#updateMember) | **PATCH** /lists/{list_id}/members/{subscriber_hash} | Update list member
*ListsApi* | [**updateMergeField**](docs/ListsApi.md#updateMergeField) | **PATCH** /lists/{list_id}/merge-fields/{merge_id} | Update merge field
*ListsApi* | [**updateNoteSpecificListMember**](docs/ListsApi.md#updateNoteSpecificListMember) | **PATCH** /lists/{list_id}/members/{subscriber_hash}/notes/{note_id} | Update note
*ListsApi* | [**updateSegmentById**](docs/ListsApi.md#updateSegmentById) | **PATCH** /lists/{list_id}/segments/{segment_id} | Update segment
*ListsApi* | [**updateSettings**](docs/ListsApi.md#updateSettings) | **PATCH** /lists/{list_id} | Update lists
*ListsApi* | [**updateWebhookSettings**](docs/ListsApi.md#updateWebhookSettings) | **PATCH** /lists/{list_id}/webhooks/{webhook_id} | Update webhook
*ListsApi* | [**viewRecentActivity**](docs/ListsApi.md#viewRecentActivity) | **GET** /lists/{list_id}/members/{subscriber_hash}/activity-feed | View recent activity
*ListsApi* | [**viewRecentActivityEvents**](docs/ListsApi.md#viewRecentActivityEvents) | **GET** /lists/{list_id}/members/{subscriber_hash}/activity | View recent activity 50
*PingApi* | [**healthCheck**](docs/PingApi.md#healthCheck) | **GET** /ping | Ping
*ReportingApi* | [**facebookAdReport**](docs/ReportingApi.md#facebookAdReport) | **GET** /reporting/facebook-ads/{outreach_id} | Get facebook ad report
*ReportingApi* | [**getLandingPageReport**](docs/ReportingApi.md#getLandingPageReport) | **GET** /reporting/landing-pages/{outreach_id} | Get landing page report
*ReportingApi* | [**getSurveyReport**](docs/ReportingApi.md#getSurveyReport) | **GET** /reporting/surveys/{survey_id} | Get survey report
*ReportingApi* | [**listFacebookAdsReports**](docs/ReportingApi.md#listFacebookAdsReports) | **GET** /reporting/facebook-ads | List facebook ads reports
*ReportingApi* | [**listFacebookEcommerceReport**](docs/ReportingApi.md#listFacebookEcommerceReport) | **GET** /reporting/facebook-ads/{outreach_id}/ecommerce-product-activity | List facebook ecommerce report
*ReportingApi* | [**listLandingPagesReports**](docs/ReportingApi.md#listLandingPagesReports) | **GET** /reporting/landing-pages | List landing pages reports
*ReportingApi* | [**listSurveyQuestionsReports**](docs/ReportingApi.md#listSurveyQuestionsReports) | **GET** /reporting/surveys/{survey_id}/questions | List survey question reports
*ReportingApi* | [**listSurveyReports**](docs/ReportingApi.md#listSurveyReports) | **GET** /reporting/surveys | List survey reports
*ReportingApi* | [**singleSurveyResponse**](docs/ReportingApi.md#singleSurveyResponse) | **GET** /reporting/surveys/{survey_id}/responses/{response_id} | Get survey response
*ReportingApi* | [**surveyQuestionAnswersList**](docs/ReportingApi.md#surveyQuestionAnswersList) | **GET** /reporting/surveys/{survey_id}/questions/{question_id}/answers | List answers for question
*ReportingApi* | [**surveyQuestionReport**](docs/ReportingApi.md#surveyQuestionReport) | **GET** /reporting/surveys/{survey_id}/questions/{question_id} | Get survey question report
*ReportingApi* | [**surveyResponsesList**](docs/ReportingApi.md#surveyResponsesList) | **GET** /reporting/surveys/{survey_id}/responses | List survey responses
*ReportsApi* | [**campaignRecipientInfo**](docs/ReportsApi.md#campaignRecipientInfo) | **GET** /reports/{campaign_id}/sent-to/{subscriber_hash} | Get campaign recipient info
*ReportsApi* | [**getAbuseReport**](docs/ReportsApi.md#getAbuseReport) | **GET** /reports/{campaign_id}/abuse-reports/{report_id} | Get abuse report
*ReportsApi* | [**getCampaignClickDetails**](docs/ReportsApi.md#getCampaignClickDetails) | **GET** /reports/{campaign_id}/click-details | List campaign details
*ReportsApi* | [**getCampaignProductActivity**](docs/ReportsApi.md#getCampaignProductActivity) | **GET** /reports/{campaign_id}/ecommerce-product-activity | List campaign product activity
*ReportsApi* | [**getSubscriberActivity**](docs/ReportsApi.md#getSubscriberActivity) | **GET** /reports/{campaign_id}/email-activity/{subscriber_hash} | Get subscriber email activity
*ReportsApi* | [**getUnsubscribedMemberInfo**](docs/ReportsApi.md#getUnsubscribedMemberInfo) | **GET** /reports/{campaign_id}/unsubscribed/{subscriber_hash} | Get unsubscribed member
*ReportsApi* | [**listAbuseReports**](docs/ReportsApi.md#listAbuseReports) | **GET** /reports/{campaign_id}/abuse-reports | List abuse reports
*ReportsApi* | [**listCampaignFeedback**](docs/ReportsApi.md#listCampaignFeedback) | **GET** /reports/{campaign_id}/advice | List campaign feedback
*ReportsApi* | [**listCampaignOpenDetails**](docs/ReportsApi.md#listCampaignOpenDetails) | **GET** /reports/{campaign_id}/open-details | List campaign open details
*ReportsApi* | [**listCampaignRecipients**](docs/ReportsApi.md#listCampaignRecipients) | **GET** /reports/{campaign_id}/sent-to | List campaign recipients
*ReportsApi* | [**listCampaignReports**](docs/ReportsApi.md#listCampaignReports) | **GET** /reports | List campaign reports
*ReportsApi* | [**listChildCampaignReports**](docs/ReportsApi.md#listChildCampaignReports) | **GET** /reports/{campaign_id}/sub-reports | List child campaign reports
*ReportsApi* | [**listClickedLinkSubscribers**](docs/ReportsApi.md#listClickedLinkSubscribers) | **GET** /reports/{campaign_id}/click-details/{link_id}/members | List clicked link subscribers
*ReportsApi* | [**listDomainPerformanceStats**](docs/ReportsApi.md#listDomainPerformanceStats) | **GET** /reports/{campaign_id}/domain-performance | List domain performance stats
*ReportsApi* | [**listEepurlActivity**](docs/ReportsApi.md#listEepurlActivity) | **GET** /reports/{campaign_id}/eepurl | List EepURL activity
*ReportsApi* | [**listEmailActivity**](docs/ReportsApi.md#listEmailActivity) | **GET** /reports/{campaign_id}/email-activity | List email activity
*ReportsApi* | [**listTopOpenLocations**](docs/ReportsApi.md#listTopOpenLocations) | **GET** /reports/{campaign_id}/locations | List top open activities
*ReportsApi* | [**listUnsubscribedMembers**](docs/ReportsApi.md#listUnsubscribedMembers) | **GET** /reports/{campaign_id}/unsubscribed | List unsubscribed members
*ReportsApi* | [**openSubscriberDetails**](docs/ReportsApi.md#openSubscriberDetails) | **GET** /reports/{campaign_id}/open-details/{subscriber_hash} | Get opened campaign subscriber
*ReportsApi* | [**specificCampaignReport**](docs/ReportsApi.md#specificCampaignReport) | **GET** /reports/{campaign_id} | Get campaign report
*ReportsApi* | [**specificLinkDetails**](docs/ReportsApi.md#specificLinkDetails) | **GET** /reports/{campaign_id}/click-details/{link_id} | Get campaign link details
*ReportsApi* | [**specificLinkSubscriber**](docs/ReportsApi.md#specificLinkSubscriber) | **GET** /reports/{campaign_id}/click-details/{link_id}/members/{subscriber_hash} | Get clicked link subscriber
*RootApi* | [**listResources**](docs/RootApi.md#listResources) | **GET** / | List api root resources
*SearchCampaignsApi* | [**byQueryTerms**](docs/SearchCampaignsApi.md#byQueryTerms) | **GET** /search-campaigns | Search campaigns
*SearchMembersApi* | [**listMembers**](docs/SearchMembersApi.md#listMembers) | **GET** /search-members | Search members
*TemplateFoldersApi* | [**addNewFolder**](docs/TemplateFoldersApi.md#addNewFolder) | **POST** /template-folders | Add template folder
*TemplateFoldersApi* | [**deleteSpecificFolder**](docs/TemplateFoldersApi.md#deleteSpecificFolder) | **DELETE** /template-folders/{folder_id} | Delete template folder
*TemplateFoldersApi* | [**getInfo**](docs/TemplateFoldersApi.md#getInfo) | **GET** /template-folders/{folder_id} | Get template folder
*TemplateFoldersApi* | [**listFolders**](docs/TemplateFoldersApi.md#listFolders) | **GET** /template-folders | List template folders
*TemplateFoldersApi* | [**updateSpecificFolder**](docs/TemplateFoldersApi.md#updateSpecificFolder) | **PATCH** /template-folders/{folder_id} | Update template folder
*TemplatesApi* | [**createNewTemplate**](docs/TemplatesApi.md#createNewTemplate) | **POST** /templates | Add template
*TemplatesApi* | [**deleteSpecificTemplate**](docs/TemplatesApi.md#deleteSpecificTemplate) | **DELETE** /templates/{template_id} | Delete template
*TemplatesApi* | [**getInfo**](docs/TemplatesApi.md#getInfo) | **GET** /templates/{template_id} | Get template info
*TemplatesApi* | [**listAvailableTemplates**](docs/TemplatesApi.md#listAvailableTemplates) | **GET** /templates | List templates
*TemplatesApi* | [**updateTemplateById**](docs/TemplatesApi.md#updateTemplateById) | **PATCH** /templates/{template_id} | Update template
*TemplatesApi* | [**viewDefaultContent**](docs/TemplatesApi.md#viewDefaultContent) | **GET** /templates/{template_id}/default-content | View default content
*VerifiedDomainsApi* | [**addDomainToAccount**](docs/VerifiedDomainsApi.md#addDomainToAccount) | **POST** /verified-domains | Add domain to account
*VerifiedDomainsApi* | [**deleteDomain**](docs/VerifiedDomainsApi.md#deleteDomain) | **DELETE** /verified-domains/{domain_name} | Delete domain
*VerifiedDomainsApi* | [**getInfo**](docs/VerifiedDomainsApi.md#getInfo) | **GET** /verified-domains/{domain_name} | Get domain info
*VerifiedDomainsApi* | [**listSendingDomains**](docs/VerifiedDomainsApi.md#listSendingDomains) | **GET** /verified-domains | List sending domains
*VerifiedDomainsApi* | [**verifyDomainForSending**](docs/VerifiedDomainsApi.md#verifyDomainForSending) | **POST** /verified-domains/{domain_name}/actions/verify | Verify domain


## Documentation for Models

 - [ABSplitProperty](docs/ABSplitProperty.md)
 - [ABSplitStatsProperty](docs/ABSplitStatsProperty.md)
 - [ABTestOptionsProperty](docs/ABTestOptionsProperty.md)
 - [ABTestOptionsProperty1](docs/ABTestOptionsProperty1.md)
 - [ABTestOptionsProperty2](docs/ABTestOptionsProperty2.md)
 - [ABTestingOptionsProperty](docs/ABTestingOptionsProperty.md)
 - [AbandonedBrowseAutomationProperty](docs/AbandonedBrowseAutomationProperty.md)
 - [AbandonedBrowseAutomationProperty1](docs/AbandonedBrowseAutomationProperty1.md)
 - [AbandonedBrowseAutomationProperty2](docs/AbandonedBrowseAutomationProperty2.md)
 - [AbandonedBrowseAutomationProperty3](docs/AbandonedBrowseAutomationProperty3.md)
 - [AbandonedBrowseAutomationProperty4](docs/AbandonedBrowseAutomationProperty4.md)
 - [AbandonedBrowseAutomationProperty5](docs/AbandonedBrowseAutomationProperty5.md)
 - [AbandonedBrowseAutomationProperty6](docs/AbandonedBrowseAutomationProperty6.md)
 - [AbandonedBrowseAutomationProperty7](docs/AbandonedBrowseAutomationProperty7.md)
 - [AbandonedCartAutomationProperty](docs/AbandonedCartAutomationProperty.md)
 - [AbandonedCartAutomationProperty1](docs/AbandonedCartAutomationProperty1.md)
 - [AbandonedCartAutomationProperty2](docs/AbandonedCartAutomationProperty2.md)
 - [AbandonedCartAutomationProperty3](docs/AbandonedCartAutomationProperty3.md)
 - [AbandonedCartAutomationProperty4](docs/AbandonedCartAutomationProperty4.md)
 - [AbandonedCartAutomationProperty5](docs/AbandonedCartAutomationProperty5.md)
 - [AbandonedCartAutomationProperty6](docs/AbandonedCartAutomationProperty6.md)
 - [AbandonedCartAutomationProperty7](docs/AbandonedCartAutomationProperty7.md)
 - [AbuseComplaint](docs/AbuseComplaint.md)
 - [AbuseComplaint1](docs/AbuseComplaint1.md)
 - [AccountContactProperty](docs/AccountContactProperty.md)
 - [AccountExportInfo200Response](docs/AccountExportInfo200Response.md)
 - [AccountExportInfoResponse](docs/AccountExportInfoResponse.md)
 - [AccountExportInfodefaultResponse](docs/AccountExportInfodefaultResponse.md)
 - [AccountExportsCreateNewExport200Response](docs/AccountExportsCreateNewExport200Response.md)
 - [AccountExportsCreateNewExportRequest](docs/AccountExportsCreateNewExportRequest.md)
 - [AccountExportsCreateNewExportResponse](docs/AccountExportsCreateNewExportResponse.md)
 - [AccountExportsCreateNewExportdefaultResponse](docs/AccountExportsCreateNewExportdefaultResponse.md)
 - [AccountExportsListForGivenAccount200Response](docs/AccountExportsListForGivenAccount200Response.md)
 - [AccountExportsListForGivenAccountResponse](docs/AccountExportsListForGivenAccountResponse.md)
 - [AccountExportsListForGivenAccountdefaultResponse](docs/AccountExportsListForGivenAccountdefaultResponse.md)
 - [AccountExportsPropertyInner](docs/AccountExportsPropertyInner.md)
 - [ActivityFeedGetLatestChimpChatter200Response](docs/ActivityFeedGetLatestChimpChatter200Response.md)
 - [ActivityFeedGetLatestChimpChatterResponse](docs/ActivityFeedGetLatestChimpChatterResponse.md)
 - [ActivityFeedGetLatestChimpChatterdefaultResponse](docs/ActivityFeedGetLatestChimpChatterdefaultResponse.md)
 - [AddListMembers](docs/AddListMembers.md)
 - [AddressProperty](docs/AddressProperty.md)
 - [AddressProperty1](docs/AddressProperty1.md)
 - [AddressProperty10](docs/AddressProperty10.md)
 - [AddressProperty11](docs/AddressProperty11.md)
 - [AddressProperty12](docs/AddressProperty12.md)
 - [AddressProperty13](docs/AddressProperty13.md)
 - [AddressProperty14](docs/AddressProperty14.md)
 - [AddressProperty15](docs/AddressProperty15.md)
 - [AddressProperty16](docs/AddressProperty16.md)
 - [AddressProperty17](docs/AddressProperty17.md)
 - [AddressProperty18](docs/AddressProperty18.md)
 - [AddressProperty19](docs/AddressProperty19.md)
 - [AddressProperty2](docs/AddressProperty2.md)
 - [AddressProperty20](docs/AddressProperty20.md)
 - [AddressProperty21](docs/AddressProperty21.md)
 - [AddressProperty22](docs/AddressProperty22.md)
 - [AddressProperty23](docs/AddressProperty23.md)
 - [AddressProperty24](docs/AddressProperty24.md)
 - [AddressProperty25](docs/AddressProperty25.md)
 - [AddressProperty26](docs/AddressProperty26.md)
 - [AddressProperty27](docs/AddressProperty27.md)
 - [AddressProperty28](docs/AddressProperty28.md)
 - [AddressProperty29](docs/AddressProperty29.md)
 - [AddressProperty3](docs/AddressProperty3.md)
 - [AddressProperty30](docs/AddressProperty30.md)
 - [AddressProperty31](docs/AddressProperty31.md)
 - [AddressProperty32](docs/AddressProperty32.md)
 - [AddressProperty33](docs/AddressProperty33.md)
 - [AddressProperty34](docs/AddressProperty34.md)
 - [AddressProperty35](docs/AddressProperty35.md)
 - [AddressProperty36](docs/AddressProperty36.md)
 - [AddressProperty37](docs/AddressProperty37.md)
 - [AddressProperty38](docs/AddressProperty38.md)
 - [AddressProperty39](docs/AddressProperty39.md)
 - [AddressProperty4](docs/AddressProperty4.md)
 - [AddressProperty40](docs/AddressProperty40.md)
 - [AddressProperty41](docs/AddressProperty41.md)
 - [AddressProperty42](docs/AddressProperty42.md)
 - [AddressProperty43](docs/AddressProperty43.md)
 - [AddressProperty44](docs/AddressProperty44.md)
 - [AddressProperty5](docs/AddressProperty5.md)
 - [AddressProperty6](docs/AddressProperty6.md)
 - [AddressProperty7](docs/AddressProperty7.md)
 - [AddressProperty8](docs/AddressProperty8.md)
 - [AddressProperty9](docs/AddressProperty9.md)
 - [AnOptionForSignupFormStyles](docs/AnOptionForSignupFormStyles.md)
 - [AnOptionForSignupFormStyles1](docs/AnOptionForSignupFormStyles1.md)
 - [AnOptionForSignupFormStyles2](docs/AnOptionForSignupFormStyles2.md)
 - [AnOptionForSignupFormStyles3](docs/AnOptionForSignupFormStyles3.md)
 - [AnOptionForSignupFormStyles4](docs/AnOptionForSignupFormStyles4.md)
 - [AuthorizedApplicationsPropertyInner](docs/AuthorizedApplicationsPropertyInner.md)
 - [AuthorizedAppsGetInfo200Response](docs/AuthorizedAppsGetInfo200Response.md)
 - [AuthorizedAppsGetInfoResponse](docs/AuthorizedAppsGetInfoResponse.md)
 - [AuthorizedAppsGetInfodefaultResponse](docs/AuthorizedAppsGetInfodefaultResponse.md)
 - [AuthorizedAppsListConnectedApplications200Response](docs/AuthorizedAppsListConnectedApplications200Response.md)
 - [AuthorizedAppsListConnectedApplicationsResponse](docs/AuthorizedAppsListConnectedApplicationsResponse.md)
 - [AuthorizedAppsListConnectedApplicationsdefaultResponse](docs/AuthorizedAppsListConnectedApplicationsdefaultResponse.md)
 - [AutomationCampaignSettingsProperty](docs/AutomationCampaignSettingsProperty.md)
 - [AutomationCampaignSettingsProperty1](docs/AutomationCampaignSettingsProperty1.md)
 - [AutomationDelayProperty](docs/AutomationDelayProperty.md)
 - [AutomationDelayProperty1](docs/AutomationDelayProperty1.md)
 - [AutomationDelayProperty2](docs/AutomationDelayProperty2.md)
 - [AutomationDelayProperty3](docs/AutomationDelayProperty3.md)
 - [AutomationDelayProperty4](docs/AutomationDelayProperty4.md)
 - [AutomationDelayProperty5](docs/AutomationDelayProperty5.md)
 - [AutomationDelayProperty6](docs/AutomationDelayProperty6.md)
 - [AutomationTrackingOptionsProperty](docs/AutomationTrackingOptionsProperty.md)
 - [AutomationTriggerProperty](docs/AutomationTriggerProperty.md)
 - [AutomationTriggerProperty1](docs/AutomationTriggerProperty1.md)
 - [AutomationWorkflow](docs/AutomationWorkflow.md)
 - [AutomationWorkflow1](docs/AutomationWorkflow1.md)
 - [AutomationWorkflowEmail](docs/AutomationWorkflowEmail.md)
 - [AutomationWorkflowEmail1](docs/AutomationWorkflowEmail1.md)
 - [AutomationWorkflowRuntimeSettingsProperty](docs/AutomationWorkflowRuntimeSettingsProperty.md)
 - [AutomationsAddSubscriberToWorkflowEmail200Response](docs/AutomationsAddSubscriberToWorkflowEmail200Response.md)
 - [AutomationsAddSubscriberToWorkflowEmailRequest](docs/AutomationsAddSubscriberToWorkflowEmailRequest.md)
 - [AutomationsAddSubscriberToWorkflowEmailResponse](docs/AutomationsAddSubscriberToWorkflowEmailResponse.md)
 - [AutomationsAddSubscriberToWorkflowEmaildefaultResponse](docs/AutomationsAddSubscriberToWorkflowEmaildefaultResponse.md)
 - [AutomationsArchiveActionResponse](docs/AutomationsArchiveActionResponse.md)
 - [AutomationsArchiveActiondefaultResponse](docs/AutomationsArchiveActiondefaultResponse.md)
 - [AutomationsClassicAutomationSubscriberInfo200Response](docs/AutomationsClassicAutomationSubscriberInfo200Response.md)
 - [AutomationsClassicAutomationSubscriberInfoResponse](docs/AutomationsClassicAutomationSubscriberInfoResponse.md)
 - [AutomationsClassicAutomationSubscriberInfodefaultResponse](docs/AutomationsClassicAutomationSubscriberInfodefaultResponse.md)
 - [AutomationsCreateClassic200Response](docs/AutomationsCreateClassic200Response.md)
 - [AutomationsCreateClassicRequest](docs/AutomationsCreateClassicRequest.md)
 - [AutomationsCreateClassicResponse](docs/AutomationsCreateClassicResponse.md)
 - [AutomationsCreateClassicdefaultResponse](docs/AutomationsCreateClassicdefaultResponse.md)
 - [AutomationsDeleteWorkflowEmailResponse](docs/AutomationsDeleteWorkflowEmailResponse.md)
 - [AutomationsDeleteWorkflowEmaildefaultResponse](docs/AutomationsDeleteWorkflowEmaildefaultResponse.md)
 - [AutomationsGetClassicWorkflowEmails200Response](docs/AutomationsGetClassicWorkflowEmails200Response.md)
 - [AutomationsGetClassicWorkflowEmailsResponse](docs/AutomationsGetClassicWorkflowEmailsResponse.md)
 - [AutomationsGetClassicWorkflowEmailsdefaultResponse](docs/AutomationsGetClassicWorkflowEmailsdefaultResponse.md)
 - [AutomationsGetClassicWorkflowInfo200Response](docs/AutomationsGetClassicWorkflowInfo200Response.md)
 - [AutomationsGetClassicWorkflowInfoResponse](docs/AutomationsGetClassicWorkflowInfoResponse.md)
 - [AutomationsGetClassicWorkflowInfodefaultResponse](docs/AutomationsGetClassicWorkflowInfodefaultResponse.md)
 - [AutomationsGetEmailInfo200Response](docs/AutomationsGetEmailInfo200Response.md)
 - [AutomationsGetEmailInfoResponse](docs/AutomationsGetEmailInfoResponse.md)
 - [AutomationsGetEmailInfodefaultResponse](docs/AutomationsGetEmailInfodefaultResponse.md)
 - [AutomationsGetRemovedSubscriberInfo200Response](docs/AutomationsGetRemovedSubscriberInfo200Response.md)
 - [AutomationsGetRemovedSubscriberInfoResponse](docs/AutomationsGetRemovedSubscriberInfoResponse.md)
 - [AutomationsGetRemovedSubscriberInfodefaultResponse](docs/AutomationsGetRemovedSubscriberInfodefaultResponse.md)
 - [AutomationsGetRemovedSubscribers200Response](docs/AutomationsGetRemovedSubscribers200Response.md)
 - [AutomationsGetRemovedSubscribersResponse](docs/AutomationsGetRemovedSubscribersResponse.md)
 - [AutomationsGetRemovedSubscribersdefaultResponse](docs/AutomationsGetRemovedSubscribersdefaultResponse.md)
 - [AutomationsListQueueEmails200Response](docs/AutomationsListQueueEmails200Response.md)
 - [AutomationsListQueueEmailsResponse](docs/AutomationsListQueueEmailsResponse.md)
 - [AutomationsListQueueEmailsdefaultResponse](docs/AutomationsListQueueEmailsdefaultResponse.md)
 - [AutomationsListSummary200Response](docs/AutomationsListSummary200Response.md)
 - [AutomationsListSummaryResponse](docs/AutomationsListSummaryResponse.md)
 - [AutomationsListSummarydefaultResponse](docs/AutomationsListSummarydefaultResponse.md)
 - [AutomationsPauseAutomatedEmailResponse](docs/AutomationsPauseAutomatedEmailResponse.md)
 - [AutomationsPauseAutomatedEmaildefaultResponse](docs/AutomationsPauseAutomatedEmaildefaultResponse.md)
 - [AutomationsPauseWorkflowEmailsResponse](docs/AutomationsPauseWorkflowEmailsResponse.md)
 - [AutomationsPauseWorkflowEmailsdefaultResponse](docs/AutomationsPauseWorkflowEmailsdefaultResponse.md)
 - [AutomationsProperty](docs/AutomationsProperty.md)
 - [AutomationsProperty1](docs/AutomationsProperty1.md)
 - [AutomationsProperty2](docs/AutomationsProperty2.md)
 - [AutomationsProperty3](docs/AutomationsProperty3.md)
 - [AutomationsProperty4](docs/AutomationsProperty4.md)
 - [AutomationsProperty5](docs/AutomationsProperty5.md)
 - [AutomationsProperty6](docs/AutomationsProperty6.md)
 - [AutomationsProperty7](docs/AutomationsProperty7.md)
 - [AutomationsRemoveSubscriberFromWorkflow200Response](docs/AutomationsRemoveSubscriberFromWorkflow200Response.md)
 - [AutomationsRemoveSubscriberFromWorkflowResponse](docs/AutomationsRemoveSubscriberFromWorkflowResponse.md)
 - [AutomationsRemoveSubscriberFromWorkflowdefaultResponse](docs/AutomationsRemoveSubscriberFromWorkflowdefaultResponse.md)
 - [AutomationsStartAllEmailsResponse](docs/AutomationsStartAllEmailsResponse.md)
 - [AutomationsStartAllEmailsdefaultResponse](docs/AutomationsStartAllEmailsdefaultResponse.md)
 - [AutomationsStartAutomatedEmailResponse](docs/AutomationsStartAutomatedEmailResponse.md)
 - [AutomationsStartAutomatedEmaildefaultResponse](docs/AutomationsStartAutomatedEmaildefaultResponse.md)
 - [AutomationsUpdateWorkflowEmail200Response](docs/AutomationsUpdateWorkflowEmail200Response.md)
 - [AutomationsUpdateWorkflowEmailRequest](docs/AutomationsUpdateWorkflowEmailRequest.md)
 - [AutomationsUpdateWorkflowEmailResponse](docs/AutomationsUpdateWorkflowEmailResponse.md)
 - [AutomationsUpdateWorkflowEmaildefaultResponse](docs/AutomationsUpdateWorkflowEmaildefaultResponse.md)
 - [Batch](docs/Batch.md)
 - [BatchDeliveryProperty](docs/BatchDeliveryProperty.md)
 - [BatchWebhook](docs/BatchWebhook.md)
 - [BatchWebhook1](docs/BatchWebhook1.md)
 - [BatchWebhooksAddWebhook200Response](docs/BatchWebhooksAddWebhook200Response.md)
 - [BatchWebhooksAddWebhookRequest](docs/BatchWebhooksAddWebhookRequest.md)
 - [BatchWebhooksAddWebhookResponse](docs/BatchWebhooksAddWebhookResponse.md)
 - [BatchWebhooksAddWebhookdefaultResponse](docs/BatchWebhooksAddWebhookdefaultResponse.md)
 - [BatchWebhooksGetInfo200Response](docs/BatchWebhooksGetInfo200Response.md)
 - [BatchWebhooksGetInfoResponse](docs/BatchWebhooksGetInfoResponse.md)
 - [BatchWebhooksGetInfodefaultResponse](docs/BatchWebhooksGetInfodefaultResponse.md)
 - [BatchWebhooksListWebhooks200Response](docs/BatchWebhooksListWebhooks200Response.md)
 - [BatchWebhooksListWebhooksResponse](docs/BatchWebhooksListWebhooksResponse.md)
 - [BatchWebhooksListWebhooksdefaultResponse](docs/BatchWebhooksListWebhooksdefaultResponse.md)
 - [BatchWebhooksRemoveWebhookResponse](docs/BatchWebhooksRemoveWebhookResponse.md)
 - [BatchWebhooksRemoveWebhookdefaultResponse](docs/BatchWebhooksRemoveWebhookdefaultResponse.md)
 - [BatchWebhooksUpdateWebhook200Response](docs/BatchWebhooksUpdateWebhook200Response.md)
 - [BatchWebhooksUpdateWebhookRequest](docs/BatchWebhooksUpdateWebhookRequest.md)
 - [BatchWebhooksUpdateWebhookResponse](docs/BatchWebhooksUpdateWebhookResponse.md)
 - [BatchWebhooksUpdateWebhookdefaultResponse](docs/BatchWebhooksUpdateWebhookdefaultResponse.md)
 - [BatchesGetOperationStatus200Response](docs/BatchesGetOperationStatus200Response.md)
 - [BatchesGetOperationStatusResponse](docs/BatchesGetOperationStatusResponse.md)
 - [BatchesGetOperationStatusdefaultResponse](docs/BatchesGetOperationStatusdefaultResponse.md)
 - [BatchesListRequestsSummary200Response](docs/BatchesListRequestsSummary200Response.md)
 - [BatchesListRequestsSummaryResponse](docs/BatchesListRequestsSummaryResponse.md)
 - [BatchesListRequestsSummarydefaultResponse](docs/BatchesListRequestsSummarydefaultResponse.md)
 - [BatchesStartOperationProcess200Response](docs/BatchesStartOperationProcess200Response.md)
 - [BatchesStartOperationProcessRequest](docs/BatchesStartOperationProcessRequest.md)
 - [BatchesStartOperationProcessResponse](docs/BatchesStartOperationProcessResponse.md)
 - [BatchesStartOperationProcessdefaultResponse](docs/BatchesStartOperationProcessdefaultResponse.md)
 - [BatchesStopRequestResponse](docs/BatchesStopRequestResponse.md)
 - [BatchesStopRequestdefaultResponse](docs/BatchesStopRequestdefaultResponse.md)
 - [BillingAddressProperty](docs/BillingAddressProperty.md)
 - [BillingAddressProperty1](docs/BillingAddressProperty1.md)
 - [BillingAddressProperty10](docs/BillingAddressProperty10.md)
 - [BillingAddressProperty11](docs/BillingAddressProperty11.md)
 - [BillingAddressProperty2](docs/BillingAddressProperty2.md)
 - [BillingAddressProperty3](docs/BillingAddressProperty3.md)
 - [BillingAddressProperty4](docs/BillingAddressProperty4.md)
 - [BillingAddressProperty5](docs/BillingAddressProperty5.md)
 - [BillingAddressProperty6](docs/BillingAddressProperty6.md)
 - [BillingAddressProperty7](docs/BillingAddressProperty7.md)
 - [BillingAddressProperty8](docs/BillingAddressProperty8.md)
 - [BillingAddressProperty9](docs/BillingAddressProperty9.md)
 - [BouncesProperty](docs/BouncesProperty.md)
 - [Campaign](docs/Campaign.md)
 - [Campaign1](docs/Campaign1.md)
 - [CampaignAProperty](docs/CampaignAProperty.md)
 - [CampaignAdvice](docs/CampaignAdvice.md)
 - [CampaignBProperty](docs/CampaignBProperty.md)
 - [CampaignDefaultsProperty](docs/CampaignDefaultsProperty.md)
 - [CampaignDefaultsProperty1](docs/CampaignDefaultsProperty1.md)
 - [CampaignDeliveryStatusProperty](docs/CampaignDeliveryStatusProperty.md)
 - [CampaignFeedback](docs/CampaignFeedback.md)
 - [CampaignFolder](docs/CampaignFolder.md)
 - [CampaignFoldersAddNewFolder200Response](docs/CampaignFoldersAddNewFolder200Response.md)
 - [CampaignFoldersAddNewFolderRequest](docs/CampaignFoldersAddNewFolderRequest.md)
 - [CampaignFoldersAddNewFolderResponse](docs/CampaignFoldersAddNewFolderResponse.md)
 - [CampaignFoldersAddNewFolderdefaultResponse](docs/CampaignFoldersAddNewFolderdefaultResponse.md)
 - [CampaignFoldersDeleteFolderResponse](docs/CampaignFoldersDeleteFolderResponse.md)
 - [CampaignFoldersDeleteFolderdefaultResponse](docs/CampaignFoldersDeleteFolderdefaultResponse.md)
 - [CampaignFoldersGetFolderInfo200Response](docs/CampaignFoldersGetFolderInfo200Response.md)
 - [CampaignFoldersGetFolderInfoResponse](docs/CampaignFoldersGetFolderInfoResponse.md)
 - [CampaignFoldersGetFolderInfodefaultResponse](docs/CampaignFoldersGetFolderInfodefaultResponse.md)
 - [CampaignFoldersListCampaignFolders200Response](docs/CampaignFoldersListCampaignFolders200Response.md)
 - [CampaignFoldersListCampaignFoldersResponse](docs/CampaignFoldersListCampaignFoldersResponse.md)
 - [CampaignFoldersListCampaignFoldersdefaultResponse](docs/CampaignFoldersListCampaignFoldersdefaultResponse.md)
 - [CampaignFoldersUpdateSpecificFolder200Response](docs/CampaignFoldersUpdateSpecificFolder200Response.md)
 - [CampaignFoldersUpdateSpecificFolderResponse](docs/CampaignFoldersUpdateSpecificFolderResponse.md)
 - [CampaignFoldersUpdateSpecificFolderdefaultResponse](docs/CampaignFoldersUpdateSpecificFolderdefaultResponse.md)
 - [CampaignProperty](docs/CampaignProperty.md)
 - [CampaignProperty1](docs/CampaignProperty1.md)
 - [CampaignReport](docs/CampaignReport.md)
 - [CampaignReport1](docs/CampaignReport1.md)
 - [CampaignReport2](docs/CampaignReport2.md)
 - [CampaignReport3](docs/CampaignReport3.md)
 - [CampaignReportSummaryProperty](docs/CampaignReportSummaryProperty.md)
 - [CampaignReportSummaryProperty1](docs/CampaignReportSummaryProperty1.md)
 - [CampaignReportSummaryProperty2](docs/CampaignReportSummaryProperty2.md)
 - [CampaignReportSummaryProperty3](docs/CampaignReportSummaryProperty3.md)
 - [CampaignSettingsProperty](docs/CampaignSettingsProperty.md)
 - [CampaignSettingsProperty1](docs/CampaignSettingsProperty1.md)
 - [CampaignSettingsProperty2](docs/CampaignSettingsProperty2.md)
 - [CampaignSettingsProperty3](docs/CampaignSettingsProperty3.md)
 - [CampaignSettingsProperty4](docs/CampaignSettingsProperty4.md)
 - [CampaignSettingsProperty5](docs/CampaignSettingsProperty5.md)
 - [CampaignSocialCardProperty](docs/CampaignSocialCardProperty.md)
 - [CampaignTrackingOptionsProperty](docs/CampaignTrackingOptionsProperty.md)
 - [CampaignTrackingOptionsProperty1](docs/CampaignTrackingOptionsProperty1.md)
 - [CampaignsAddFeedback200Response](docs/CampaignsAddFeedback200Response.md)
 - [CampaignsAddFeedbackRequest](docs/CampaignsAddFeedbackRequest.md)
 - [CampaignsAddFeedbackResponse](docs/CampaignsAddFeedbackResponse.md)
 - [CampaignsAddFeedbackdefaultResponse](docs/CampaignsAddFeedbackdefaultResponse.md)
 - [CampaignsCancelSendActionResponse](docs/CampaignsCancelSendActionResponse.md)
 - [CampaignsCancelSendActiondefaultResponse](docs/CampaignsCancelSendActiondefaultResponse.md)
 - [CampaignsCreateNewMailchimpCampaign200Response](docs/CampaignsCreateNewMailchimpCampaign200Response.md)
 - [CampaignsCreateNewMailchimpCampaignRequest](docs/CampaignsCreateNewMailchimpCampaignRequest.md)
 - [CampaignsCreateNewMailchimpCampaignResponse](docs/CampaignsCreateNewMailchimpCampaignResponse.md)
 - [CampaignsCreateNewMailchimpCampaigndefaultResponse](docs/CampaignsCreateNewMailchimpCampaigndefaultResponse.md)
 - [CampaignsGetAll200Response](docs/CampaignsGetAll200Response.md)
 - [CampaignsGetAllResponse](docs/CampaignsGetAllResponse.md)
 - [CampaignsGetAlldefaultResponse](docs/CampaignsGetAlldefaultResponse.md)
 - [CampaignsGetContent200Response](docs/CampaignsGetContent200Response.md)
 - [CampaignsGetContentResponse](docs/CampaignsGetContentResponse.md)
 - [CampaignsGetContentdefaultResponse](docs/CampaignsGetContentdefaultResponse.md)
 - [CampaignsGetFeedbackMessage200Response](docs/CampaignsGetFeedbackMessage200Response.md)
 - [CampaignsGetFeedbackMessageResponse](docs/CampaignsGetFeedbackMessageResponse.md)
 - [CampaignsGetFeedbackMessagedefaultResponse](docs/CampaignsGetFeedbackMessagedefaultResponse.md)
 - [CampaignsGetInfo200Response](docs/CampaignsGetInfo200Response.md)
 - [CampaignsGetInfoResponse](docs/CampaignsGetInfoResponse.md)
 - [CampaignsGetInfodefaultResponse](docs/CampaignsGetInfodefaultResponse.md)
 - [CampaignsGetSendChecklist200Response](docs/CampaignsGetSendChecklist200Response.md)
 - [CampaignsGetSendChecklistResponse](docs/CampaignsGetSendChecklistResponse.md)
 - [CampaignsGetSendChecklistdefaultResponse](docs/CampaignsGetSendChecklistdefaultResponse.md)
 - [CampaignsListFeedback200Response](docs/CampaignsListFeedback200Response.md)
 - [CampaignsListFeedbackResponse](docs/CampaignsListFeedbackResponse.md)
 - [CampaignsListFeedbackdefaultResponse](docs/CampaignsListFeedbackdefaultResponse.md)
 - [CampaignsPauseRssCampaignResponse](docs/CampaignsPauseRssCampaignResponse.md)
 - [CampaignsPauseRssCampaigndefaultResponse](docs/CampaignsPauseRssCampaigndefaultResponse.md)
 - [CampaignsRemoveCampaignResponse](docs/CampaignsRemoveCampaignResponse.md)
 - [CampaignsRemoveCampaigndefaultResponse](docs/CampaignsRemoveCampaigndefaultResponse.md)
 - [CampaignsRemoveFeedbackMessageResponse](docs/CampaignsRemoveFeedbackMessageResponse.md)
 - [CampaignsRemoveFeedbackMessagedefaultResponse](docs/CampaignsRemoveFeedbackMessagedefaultResponse.md)
 - [CampaignsReplicateAction200Response](docs/CampaignsReplicateAction200Response.md)
 - [CampaignsReplicateActionResponse](docs/CampaignsReplicateActionResponse.md)
 - [CampaignsReplicateActiondefaultResponse](docs/CampaignsReplicateActiondefaultResponse.md)
 - [CampaignsResendAction200Response](docs/CampaignsResendAction200Response.md)
 - [CampaignsResendActionRequest](docs/CampaignsResendActionRequest.md)
 - [CampaignsResendActionResponse](docs/CampaignsResendActionResponse.md)
 - [CampaignsResendActiondefaultResponse](docs/CampaignsResendActiondefaultResponse.md)
 - [CampaignsResumeRssCampaignResponse](docs/CampaignsResumeRssCampaignResponse.md)
 - [CampaignsResumeRssCampaigndefaultResponse](docs/CampaignsResumeRssCampaigndefaultResponse.md)
 - [CampaignsScheduleDeliveryRequest](docs/CampaignsScheduleDeliveryRequest.md)
 - [CampaignsScheduleDeliveryResponse](docs/CampaignsScheduleDeliveryResponse.md)
 - [CampaignsScheduleDeliverydefaultResponse](docs/CampaignsScheduleDeliverydefaultResponse.md)
 - [CampaignsSendActionResponse](docs/CampaignsSendActionResponse.md)
 - [CampaignsSendActiondefaultResponse](docs/CampaignsSendActiondefaultResponse.md)
 - [CampaignsSendTestEmailRequest](docs/CampaignsSendTestEmailRequest.md)
 - [CampaignsSendTestEmailResponse](docs/CampaignsSendTestEmailResponse.md)
 - [CampaignsSendTestEmaildefaultResponse](docs/CampaignsSendTestEmaildefaultResponse.md)
 - [CampaignsSetContent200Response](docs/CampaignsSetContent200Response.md)
 - [CampaignsSetContentRequest](docs/CampaignsSetContentRequest.md)
 - [CampaignsSetContentResponse](docs/CampaignsSetContentResponse.md)
 - [CampaignsSetContentdefaultResponse](docs/CampaignsSetContentdefaultResponse.md)
 - [CampaignsUnscheduleActionResponse](docs/CampaignsUnscheduleActionResponse.md)
 - [CampaignsUnscheduleActiondefaultResponse](docs/CampaignsUnscheduleActiondefaultResponse.md)
 - [CampaignsUpdateFeedbackMessage200Response](docs/CampaignsUpdateFeedbackMessage200Response.md)
 - [CampaignsUpdateFeedbackMessageRequest](docs/CampaignsUpdateFeedbackMessageRequest.md)
 - [CampaignsUpdateFeedbackMessageResponse](docs/CampaignsUpdateFeedbackMessageResponse.md)
 - [CampaignsUpdateFeedbackMessagedefaultResponse](docs/CampaignsUpdateFeedbackMessagedefaultResponse.md)
 - [CampaignsUpdateSettings200Response](docs/CampaignsUpdateSettings200Response.md)
 - [CampaignsUpdateSettingsRequest](docs/CampaignsUpdateSettingsRequest.md)
 - [CampaignsUpdateSettingsResponse](docs/CampaignsUpdateSettingsResponse.md)
 - [CampaignsUpdateSettingsdefaultResponse](docs/CampaignsUpdateSettingsdefaultResponse.md)
 - [CapsuleCRMTrackingProperty](docs/CapsuleCRMTrackingProperty.md)
 - [CapsuleCRMTrackingProperty1](docs/CapsuleCRMTrackingProperty1.md)
 - [CapsuleCRMTrackingProperty2](docs/CapsuleCRMTrackingProperty2.md)
 - [ChimpChatter](docs/ChimpChatter.md)
 - [ChimpChatter1](docs/ChimpChatter1.md)
 - [ClickDetailMember](docs/ClickDetailMember.md)
 - [ClickDetailReport](docs/ClickDetailReport.md)
 - [ClickSummaryProperty](docs/ClickSummaryProperty.md)
 - [ClickSummaryProperty1](docs/ClickSummaryProperty1.md)
 - [ClicksProperty](docs/ClicksProperty.md)
 - [ClicksProperty1Inner](docs/ClicksProperty1Inner.md)
 - [ClicksProperty1Inner1](docs/ClicksProperty1Inner1.md)
 - [ClicksProperty1Inner2](docs/ClicksProperty1Inner2.md)
 - [ClicksProperty1Inner3](docs/ClicksProperty1Inner3.md)
 - [ClicksProperty1Inner4](docs/ClicksProperty1Inner4.md)
 - [ClicksProperty1Inner5](docs/ClicksProperty1Inner5.md)
 - [ClicksProperty1Inner6](docs/ClicksProperty1Inner6.md)
 - [ClicksProperty1Inner7](docs/ClicksProperty1Inner7.md)
 - [CollectionAuthorizationProperty](docs/CollectionAuthorizationProperty.md)
 - [CollectionOfContentForListSignupForms](docs/CollectionOfContentForListSignupForms.md)
 - [CollectionOfContentForListSignupForms1](docs/CollectionOfContentForListSignupForms1.md)
 - [CollectionOfContentForListSignupForms2](docs/CollectionOfContentForListSignupForms2.md)
 - [CollectionOfContentForListSignupForms3](docs/CollectionOfContentForListSignupForms3.md)
 - [CollectionOfContentForListSignupForms4](docs/CollectionOfContentForListSignupForms4.md)
 - [CollectionOfElementStyleForListSignupForms](docs/CollectionOfElementStyleForListSignupForms.md)
 - [CollectionOfElementStyleForListSignupForms1](docs/CollectionOfElementStyleForListSignupForms1.md)
 - [CollectionOfElementStyleForListSignupForms2](docs/CollectionOfElementStyleForListSignupForms2.md)
 - [CollectionOfElementStyleForListSignupForms3](docs/CollectionOfElementStyleForListSignupForms3.md)
 - [CollectionOfElementStyleForListSignupForms4](docs/CollectionOfElementStyleForListSignupForms4.md)
 - [CombinationsPropertyInner](docs/CombinationsPropertyInner.md)
 - [ConditionsProperty](docs/ConditionsProperty.md)
 - [ConditionsProperty1](docs/ConditionsProperty1.md)
 - [ConditionsProperty2](docs/ConditionsProperty2.md)
 - [ConnectedSite](docs/ConnectedSite.md)
 - [ConnectedSite1](docs/ConnectedSite1.md)
 - [ConnectedSiteProperty](docs/ConnectedSiteProperty.md)
 - [ConnectedSiteProperty1](docs/ConnectedSiteProperty1.md)
 - [ConnectedSiteProperty2](docs/ConnectedSiteProperty2.md)
 - [ConnectedSiteProperty3](docs/ConnectedSiteProperty3.md)
 - [ConnectedSiteProperty4](docs/ConnectedSiteProperty4.md)
 - [ConnectedSiteProperty5](docs/ConnectedSiteProperty5.md)
 - [ConnectedSiteProperty6](docs/ConnectedSiteProperty6.md)
 - [ConnectedSiteProperty7](docs/ConnectedSiteProperty7.md)
 - [ConnectedSitesCreateNewMailchimpSite200Response](docs/ConnectedSitesCreateNewMailchimpSite200Response.md)
 - [ConnectedSitesCreateNewMailchimpSiteRequest](docs/ConnectedSitesCreateNewMailchimpSiteRequest.md)
 - [ConnectedSitesCreateNewMailchimpSiteResponse](docs/ConnectedSitesCreateNewMailchimpSiteResponse.md)
 - [ConnectedSitesCreateNewMailchimpSitedefaultResponse](docs/ConnectedSitesCreateNewMailchimpSitedefaultResponse.md)
 - [ConnectedSitesGetInfo200Response](docs/ConnectedSitesGetInfo200Response.md)
 - [ConnectedSitesGetInfoResponse](docs/ConnectedSitesGetInfoResponse.md)
 - [ConnectedSitesGetInfodefaultResponse](docs/ConnectedSitesGetInfodefaultResponse.md)
 - [ConnectedSitesListAll200Response](docs/ConnectedSitesListAll200Response.md)
 - [ConnectedSitesListAllResponse](docs/ConnectedSitesListAllResponse.md)
 - [ConnectedSitesListAlldefaultResponse](docs/ConnectedSitesListAlldefaultResponse.md)
 - [ConnectedSitesRemoveSiteResponse](docs/ConnectedSitesRemoveSiteResponse.md)
 - [ConnectedSitesRemoveSitedefaultResponse](docs/ConnectedSitesRemoveSitedefaultResponse.md)
 - [ConnectedSitesVerifyScriptInstallationResponse](docs/ConnectedSitesVerifyScriptInstallationResponse.md)
 - [ConnectedSitesVerifyScriptInstallationdefaultResponse](docs/ConnectedSitesVerifyScriptInstallationdefaultResponse.md)
 - [ContactCountsProperty](docs/ContactCountsProperty.md)
 - [ContactProperty](docs/ContactProperty.md)
 - [Conversation](docs/Conversation.md)
 - [ConversationMessage](docs/ConversationMessage.md)
 - [ConversationsGetAllConversations200Response](docs/ConversationsGetAllConversations200Response.md)
 - [ConversationsGetAllConversationsResponse](docs/ConversationsGetAllConversationsResponse.md)
 - [ConversationsGetAllConversationsdefaultResponse](docs/ConversationsGetAllConversationsdefaultResponse.md)
 - [ConversationsGetById200Response](docs/ConversationsGetById200Response.md)
 - [ConversationsGetByIdResponse](docs/ConversationsGetByIdResponse.md)
 - [ConversationsGetByIddefaultResponse](docs/ConversationsGetByIddefaultResponse.md)
 - [ConversationsGetMessageById200Response](docs/ConversationsGetMessageById200Response.md)
 - [ConversationsGetMessageByIdResponse](docs/ConversationsGetMessageByIdResponse.md)
 - [ConversationsGetMessageByIddefaultResponse](docs/ConversationsGetMessageByIddefaultResponse.md)
 - [ConversationsListMessagesFromConversation200Response](docs/ConversationsListMessagesFromConversation200Response.md)
 - [ConversationsListMessagesFromConversationResponse](docs/ConversationsListMessagesFromConversationResponse.md)
 - [ConversationsListMessagesFromConversationdefaultResponse](docs/ConversationsListMessagesFromConversationdefaultResponse.md)
 - [CustomerJourneysTriggerStepActionRequest](docs/CustomerJourneysTriggerStepActionRequest.md)
 - [CustomerJourneysTriggerStepActiondefaultResponse](docs/CustomerJourneysTriggerStepActiondefaultResponse.md)
 - [DailyClicksAndVisitsDataProperty](docs/DailyClicksAndVisitsDataProperty.md)
 - [DailyClicksAndVisitsDataProperty1](docs/DailyClicksAndVisitsDataProperty1.md)
 - [DailyClicksAndVisitsDataProperty2](docs/DailyClicksAndVisitsDataProperty2.md)
 - [DailyClicksAndVisitsDataProperty3](docs/DailyClicksAndVisitsDataProperty3.md)
 - [DailyListActivity](docs/DailyListActivity.md)
 - [DailySendingDaysProperty](docs/DailySendingDaysProperty.md)
 - [ECommerceCart](docs/ECommerceCart.md)
 - [ECommerceCart1](docs/ECommerceCart1.md)
 - [ECommerceCartLineItem](docs/ECommerceCartLineItem.md)
 - [ECommerceCartLineItem1](docs/ECommerceCartLineItem1.md)
 - [ECommerceCartLineItem2](docs/ECommerceCartLineItem2.md)
 - [ECommerceCustomer](docs/ECommerceCustomer.md)
 - [ECommerceCustomer1](docs/ECommerceCustomer1.md)
 - [ECommerceCustomerProperty](docs/ECommerceCustomerProperty.md)
 - [ECommerceCustomerProperty1](docs/ECommerceCustomerProperty1.md)
 - [ECommerceCustomerProperty10](docs/ECommerceCustomerProperty10.md)
 - [ECommerceCustomerProperty11](docs/ECommerceCustomerProperty11.md)
 - [ECommerceCustomerProperty12](docs/ECommerceCustomerProperty12.md)
 - [ECommerceCustomerProperty13](docs/ECommerceCustomerProperty13.md)
 - [ECommerceCustomerProperty14](docs/ECommerceCustomerProperty14.md)
 - [ECommerceCustomerProperty15](docs/ECommerceCustomerProperty15.md)
 - [ECommerceCustomerProperty16](docs/ECommerceCustomerProperty16.md)
 - [ECommerceCustomerProperty17](docs/ECommerceCustomerProperty17.md)
 - [ECommerceCustomerProperty18](docs/ECommerceCustomerProperty18.md)
 - [ECommerceCustomerProperty19](docs/ECommerceCustomerProperty19.md)
 - [ECommerceCustomerProperty2](docs/ECommerceCustomerProperty2.md)
 - [ECommerceCustomerProperty20](docs/ECommerceCustomerProperty20.md)
 - [ECommerceCustomerProperty21](docs/ECommerceCustomerProperty21.md)
 - [ECommerceCustomerProperty3](docs/ECommerceCustomerProperty3.md)
 - [ECommerceCustomerProperty4](docs/ECommerceCustomerProperty4.md)
 - [ECommerceCustomerProperty5](docs/ECommerceCustomerProperty5.md)
 - [ECommerceCustomerProperty6](docs/ECommerceCustomerProperty6.md)
 - [ECommerceCustomerProperty7](docs/ECommerceCustomerProperty7.md)
 - [ECommerceCustomerProperty8](docs/ECommerceCustomerProperty8.md)
 - [ECommerceCustomerProperty9](docs/ECommerceCustomerProperty9.md)
 - [ECommerceOrder](docs/ECommerceOrder.md)
 - [ECommerceOrder1](docs/ECommerceOrder1.md)
 - [ECommerceOrder2](docs/ECommerceOrder2.md)
 - [ECommerceOrder3](docs/ECommerceOrder3.md)
 - [ECommerceOrderLineItem](docs/ECommerceOrderLineItem.md)
 - [ECommerceOrderLineItem1](docs/ECommerceOrderLineItem1.md)
 - [ECommerceOrderLineItem2](docs/ECommerceOrderLineItem2.md)
 - [ECommerceProduct](docs/ECommerceProduct.md)
 - [ECommerceProduct1](docs/ECommerceProduct1.md)
 - [ECommerceProductImage](docs/ECommerceProductImage.md)
 - [ECommerceProductImage1](docs/ECommerceProductImage1.md)
 - [ECommerceProductImage2](docs/ECommerceProductImage2.md)
 - [ECommerceProductVariant](docs/ECommerceProductVariant.md)
 - [ECommerceProductVariant1](docs/ECommerceProductVariant1.md)
 - [ECommerceProductVariant10](docs/ECommerceProductVariant10.md)
 - [ECommerceProductVariant11](docs/ECommerceProductVariant11.md)
 - [ECommerceProductVariant2](docs/ECommerceProductVariant2.md)
 - [ECommerceProductVariant3](docs/ECommerceProductVariant3.md)
 - [ECommerceProductVariant4](docs/ECommerceProductVariant4.md)
 - [ECommerceProductVariant5](docs/ECommerceProductVariant5.md)
 - [ECommerceProductVariant6](docs/ECommerceProductVariant6.md)
 - [ECommerceProductVariant7](docs/ECommerceProductVariant7.md)
 - [ECommerceProductVariant8](docs/ECommerceProductVariant8.md)
 - [ECommerceProductVariant9](docs/ECommerceProductVariant9.md)
 - [ECommercePromoCode](docs/ECommercePromoCode.md)
 - [ECommercePromoCode1](docs/ECommercePromoCode1.md)
 - [ECommercePromoRule](docs/ECommercePromoRule.md)
 - [ECommercePromoRule1](docs/ECommercePromoRule1.md)
 - [ECommerceReportProperty](docs/ECommerceReportProperty.md)
 - [ECommerceReportProperty1](docs/ECommerceReportProperty1.md)
 - [ECommerceReportProperty2](docs/ECommerceReportProperty2.md)
 - [ECommerceReportProperty3](docs/ECommerceReportProperty3.md)
 - [ECommerceReportProperty4](docs/ECommerceReportProperty4.md)
 - [ECommerceReportProperty5](docs/ECommerceReportProperty5.md)
 - [ECommerceReportProperty6](docs/ECommerceReportProperty6.md)
 - [ECommerceStore](docs/ECommerceStore.md)
 - [ECommerceStore1](docs/ECommerceStore1.md)
 - [EcommerceAddCartLineItem200Response](docs/EcommerceAddCartLineItem200Response.md)
 - [EcommerceAddCartLineItemRequest](docs/EcommerceAddCartLineItemRequest.md)
 - [EcommerceAddCartLineItemResponse](docs/EcommerceAddCartLineItemResponse.md)
 - [EcommerceAddCartLineItemdefaultResponse](docs/EcommerceAddCartLineItemdefaultResponse.md)
 - [EcommerceAddCartToStore200Response](docs/EcommerceAddCartToStore200Response.md)
 - [EcommerceAddCartToStoreRequest](docs/EcommerceAddCartToStoreRequest.md)
 - [EcommerceAddCartToStoreResponse](docs/EcommerceAddCartToStoreResponse.md)
 - [EcommerceAddCartToStoredefaultResponse](docs/EcommerceAddCartToStoredefaultResponse.md)
 - [EcommerceAddCustomerToStore200Response](docs/EcommerceAddCustomerToStore200Response.md)
 - [EcommerceAddCustomerToStoreRequest](docs/EcommerceAddCustomerToStoreRequest.md)
 - [EcommerceAddCustomerToStoreResponse](docs/EcommerceAddCustomerToStoreResponse.md)
 - [EcommerceAddCustomerToStoredefaultResponse](docs/EcommerceAddCustomerToStoredefaultResponse.md)
 - [EcommerceAddOrUpdateCustomer200Response](docs/EcommerceAddOrUpdateCustomer200Response.md)
 - [EcommerceAddOrUpdateCustomerRequest](docs/EcommerceAddOrUpdateCustomerRequest.md)
 - [EcommerceAddOrUpdateCustomerResponse](docs/EcommerceAddOrUpdateCustomerResponse.md)
 - [EcommerceAddOrUpdateCustomerdefaultResponse](docs/EcommerceAddOrUpdateCustomerdefaultResponse.md)
 - [EcommerceAddOrUpdateProductVariant200Response](docs/EcommerceAddOrUpdateProductVariant200Response.md)
 - [EcommerceAddOrUpdateProductVariantResponse](docs/EcommerceAddOrUpdateProductVariantResponse.md)
 - [EcommerceAddOrUpdateProductVariantdefaultResponse](docs/EcommerceAddOrUpdateProductVariantdefaultResponse.md)
 - [EcommerceAddOrderLineItem200Response](docs/EcommerceAddOrderLineItem200Response.md)
 - [EcommerceAddOrderLineItemRequest](docs/EcommerceAddOrderLineItemRequest.md)
 - [EcommerceAddOrderLineItemResponse](docs/EcommerceAddOrderLineItemResponse.md)
 - [EcommerceAddOrderLineItemdefaultResponse](docs/EcommerceAddOrderLineItemdefaultResponse.md)
 - [EcommerceAddOrderToStore200Response](docs/EcommerceAddOrderToStore200Response.md)
 - [EcommerceAddOrderToStoreRequest](docs/EcommerceAddOrderToStoreRequest.md)
 - [EcommerceAddOrderToStoreResponse](docs/EcommerceAddOrderToStoreResponse.md)
 - [EcommerceAddOrderToStoredefaultResponse](docs/EcommerceAddOrderToStoredefaultResponse.md)
 - [EcommerceAddProductImage200Response](docs/EcommerceAddProductImage200Response.md)
 - [EcommerceAddProductImageRequest](docs/EcommerceAddProductImageRequest.md)
 - [EcommerceAddProductImageResponse](docs/EcommerceAddProductImageResponse.md)
 - [EcommerceAddProductImagedefaultResponse](docs/EcommerceAddProductImagedefaultResponse.md)
 - [EcommerceAddProductToStore200Response](docs/EcommerceAddProductToStore200Response.md)
 - [EcommerceAddProductToStoreRequest](docs/EcommerceAddProductToStoreRequest.md)
 - [EcommerceAddProductToStoreResponse](docs/EcommerceAddProductToStoreResponse.md)
 - [EcommerceAddProductToStoredefaultResponse](docs/EcommerceAddProductToStoredefaultResponse.md)
 - [EcommerceAddProductVariant200Response](docs/EcommerceAddProductVariant200Response.md)
 - [EcommerceAddProductVariantRequest](docs/EcommerceAddProductVariantRequest.md)
 - [EcommerceAddProductVariantResponse](docs/EcommerceAddProductVariantResponse.md)
 - [EcommerceAddProductVariantdefaultResponse](docs/EcommerceAddProductVariantdefaultResponse.md)
 - [EcommerceAddPromoCode200Response](docs/EcommerceAddPromoCode200Response.md)
 - [EcommerceAddPromoCodeRequest](docs/EcommerceAddPromoCodeRequest.md)
 - [EcommerceAddPromoCodeResponse](docs/EcommerceAddPromoCodeResponse.md)
 - [EcommerceAddPromoCodedefaultResponse](docs/EcommerceAddPromoCodedefaultResponse.md)
 - [EcommerceAddPromoRule200Response](docs/EcommerceAddPromoRule200Response.md)
 - [EcommerceAddPromoRuleRequest](docs/EcommerceAddPromoRuleRequest.md)
 - [EcommerceAddPromoRuleResponse](docs/EcommerceAddPromoRuleResponse.md)
 - [EcommerceAddPromoRuledefaultResponse](docs/EcommerceAddPromoRuledefaultResponse.md)
 - [EcommerceAddStoreToMailchimpAccount200Response](docs/EcommerceAddStoreToMailchimpAccount200Response.md)
 - [EcommerceAddStoreToMailchimpAccountRequest](docs/EcommerceAddStoreToMailchimpAccountRequest.md)
 - [EcommerceAddStoreToMailchimpAccountResponse](docs/EcommerceAddStoreToMailchimpAccountResponse.md)
 - [EcommerceAddStoreToMailchimpAccountdefaultResponse](docs/EcommerceAddStoreToMailchimpAccountdefaultResponse.md)
 - [EcommerceDeleteCartLineItemResponse](docs/EcommerceDeleteCartLineItemResponse.md)
 - [EcommerceDeleteCartLineItemdefaultResponse](docs/EcommerceDeleteCartLineItemdefaultResponse.md)
 - [EcommerceDeleteOrderLineResponse](docs/EcommerceDeleteOrderLineResponse.md)
 - [EcommerceDeleteOrderLinedefaultResponse](docs/EcommerceDeleteOrderLinedefaultResponse.md)
 - [EcommerceDeleteOrderResponse](docs/EcommerceDeleteOrderResponse.md)
 - [EcommerceDeleteOrderdefaultResponse](docs/EcommerceDeleteOrderdefaultResponse.md)
 - [EcommerceDeleteProductImageResponse](docs/EcommerceDeleteProductImageResponse.md)
 - [EcommerceDeleteProductImagedefaultResponse](docs/EcommerceDeleteProductImagedefaultResponse.md)
 - [EcommerceDeleteProductResponse](docs/EcommerceDeleteProductResponse.md)
 - [EcommerceDeleteProductVariantResponse](docs/EcommerceDeleteProductVariantResponse.md)
 - [EcommerceDeleteProductVariantdefaultResponse](docs/EcommerceDeleteProductVariantdefaultResponse.md)
 - [EcommerceDeleteProductdefaultResponse](docs/EcommerceDeleteProductdefaultResponse.md)
 - [EcommerceDeletePromoCodeResponse](docs/EcommerceDeletePromoCodeResponse.md)
 - [EcommerceDeletePromoCodedefaultResponse](docs/EcommerceDeletePromoCodedefaultResponse.md)
 - [EcommerceDeletePromoRuleResponse](docs/EcommerceDeletePromoRuleResponse.md)
 - [EcommerceDeletePromoRuledefaultResponse](docs/EcommerceDeletePromoRuledefaultResponse.md)
 - [EcommerceDeleteStoredefaultResponse](docs/EcommerceDeleteStoredefaultResponse.md)
 - [EcommerceGetCartInfo200Response](docs/EcommerceGetCartInfo200Response.md)
 - [EcommerceGetCartInfoResponse](docs/EcommerceGetCartInfoResponse.md)
 - [EcommerceGetCartInfodefaultResponse](docs/EcommerceGetCartInfodefaultResponse.md)
 - [EcommerceGetCartLineItem200Response](docs/EcommerceGetCartLineItem200Response.md)
 - [EcommerceGetCartLineItemResponse](docs/EcommerceGetCartLineItemResponse.md)
 - [EcommerceGetCartLineItemdefaultResponse](docs/EcommerceGetCartLineItemdefaultResponse.md)
 - [EcommerceGetCustomerInfo200Response](docs/EcommerceGetCustomerInfo200Response.md)
 - [EcommerceGetCustomerInfoResponse](docs/EcommerceGetCustomerInfoResponse.md)
 - [EcommerceGetCustomerInfodefaultResponse](docs/EcommerceGetCustomerInfodefaultResponse.md)
 - [EcommerceGetOrderLineItem200Response](docs/EcommerceGetOrderLineItem200Response.md)
 - [EcommerceGetOrderLineItemResponse](docs/EcommerceGetOrderLineItemResponse.md)
 - [EcommerceGetOrderLineItemdefaultResponse](docs/EcommerceGetOrderLineItemdefaultResponse.md)
 - [EcommerceGetProductImageInfo200Response](docs/EcommerceGetProductImageInfo200Response.md)
 - [EcommerceGetProductImageInfoResponse](docs/EcommerceGetProductImageInfoResponse.md)
 - [EcommerceGetProductImageInfodefaultResponse](docs/EcommerceGetProductImageInfodefaultResponse.md)
 - [EcommerceGetProductImages200Response](docs/EcommerceGetProductImages200Response.md)
 - [EcommerceGetProductImagesResponse](docs/EcommerceGetProductImagesResponse.md)
 - [EcommerceGetProductImagesdefaultResponse](docs/EcommerceGetProductImagesdefaultResponse.md)
 - [EcommerceGetProductVariantInfo200Response](docs/EcommerceGetProductVariantInfo200Response.md)
 - [EcommerceGetProductVariantInfoResponse](docs/EcommerceGetProductVariantInfoResponse.md)
 - [EcommerceGetProductVariantInfodefaultResponse](docs/EcommerceGetProductVariantInfodefaultResponse.md)
 - [EcommerceGetPromoCode200Response](docs/EcommerceGetPromoCode200Response.md)
 - [EcommerceGetPromoCodeResponse](docs/EcommerceGetPromoCodeResponse.md)
 - [EcommerceGetPromoCodedefaultResponse](docs/EcommerceGetPromoCodedefaultResponse.md)
 - [EcommerceGetStoreCarts200Response](docs/EcommerceGetStoreCarts200Response.md)
 - [EcommerceGetStoreCartsResponse](docs/EcommerceGetStoreCartsResponse.md)
 - [EcommerceGetStoreCartsdefaultResponse](docs/EcommerceGetStoreCartsdefaultResponse.md)
 - [EcommerceGetStoreCustomers200Response](docs/EcommerceGetStoreCustomers200Response.md)
 - [EcommerceGetStoreCustomersResponse](docs/EcommerceGetStoreCustomersResponse.md)
 - [EcommerceGetStoreCustomersdefaultResponse](docs/EcommerceGetStoreCustomersdefaultResponse.md)
 - [EcommerceGetStoreInfo200Response](docs/EcommerceGetStoreInfo200Response.md)
 - [EcommerceGetStoreInfoResponse](docs/EcommerceGetStoreInfoResponse.md)
 - [EcommerceGetStoreInfodefaultResponse](docs/EcommerceGetStoreInfodefaultResponse.md)
 - [EcommerceGetStoreOrderInfo200Response](docs/EcommerceGetStoreOrderInfo200Response.md)
 - [EcommerceGetStoreOrderInfoResponse](docs/EcommerceGetStoreOrderInfoResponse.md)
 - [EcommerceGetStoreOrderInfodefaultResponse](docs/EcommerceGetStoreOrderInfodefaultResponse.md)
 - [EcommerceGetStoreOrderLines200Response](docs/EcommerceGetStoreOrderLines200Response.md)
 - [EcommerceGetStoreOrderLinesResponse](docs/EcommerceGetStoreOrderLinesResponse.md)
 - [EcommerceGetStoreOrderLinesdefaultResponse](docs/EcommerceGetStoreOrderLinesdefaultResponse.md)
 - [EcommerceGetStoreProductInfo200Response](docs/EcommerceGetStoreProductInfo200Response.md)
 - [EcommerceGetStoreProductInfoResponse](docs/EcommerceGetStoreProductInfoResponse.md)
 - [EcommerceGetStoreProductInfodefaultResponse](docs/EcommerceGetStoreProductInfodefaultResponse.md)
 - [EcommerceGetStoreProducts200Response](docs/EcommerceGetStoreProducts200Response.md)
 - [EcommerceGetStoreProductsResponse](docs/EcommerceGetStoreProductsResponse.md)
 - [EcommerceGetStoreProductsdefaultResponse](docs/EcommerceGetStoreProductsdefaultResponse.md)
 - [EcommerceGetStorePromoCodes200Response](docs/EcommerceGetStorePromoCodes200Response.md)
 - [EcommerceGetStorePromoCodesResponse](docs/EcommerceGetStorePromoCodesResponse.md)
 - [EcommerceGetStorePromoCodesdefaultResponse](docs/EcommerceGetStorePromoCodesdefaultResponse.md)
 - [EcommerceGetStorePromoRule200Response](docs/EcommerceGetStorePromoRule200Response.md)
 - [EcommerceGetStorePromoRuleResponse](docs/EcommerceGetStorePromoRuleResponse.md)
 - [EcommerceGetStorePromoRuledefaultResponse](docs/EcommerceGetStorePromoRuledefaultResponse.md)
 - [EcommerceGetStorePromoRules200Response](docs/EcommerceGetStorePromoRules200Response.md)
 - [EcommerceGetStorePromoRulesResponse](docs/EcommerceGetStorePromoRulesResponse.md)
 - [EcommerceGetStorePromoRulesdefaultResponse](docs/EcommerceGetStorePromoRulesdefaultResponse.md)
 - [EcommerceListAccountOrders200Response](docs/EcommerceListAccountOrders200Response.md)
 - [EcommerceListAccountOrdersResponse](docs/EcommerceListAccountOrdersResponse.md)
 - [EcommerceListAccountOrdersdefaultResponse](docs/EcommerceListAccountOrdersdefaultResponse.md)
 - [EcommerceListCartLines200Response](docs/EcommerceListCartLines200Response.md)
 - [EcommerceListCartLinesResponse](docs/EcommerceListCartLinesResponse.md)
 - [EcommerceListCartLinesdefaultResponse](docs/EcommerceListCartLinesdefaultResponse.md)
 - [EcommerceListProductVariants200Response](docs/EcommerceListProductVariants200Response.md)
 - [EcommerceListProductVariantsResponse](docs/EcommerceListProductVariantsResponse.md)
 - [EcommerceListProductVariantsdefaultResponse](docs/EcommerceListProductVariantsdefaultResponse.md)
 - [EcommerceListStoreOrders200Response](docs/EcommerceListStoreOrders200Response.md)
 - [EcommerceListStoreOrdersResponse](docs/EcommerceListStoreOrdersResponse.md)
 - [EcommerceListStoreOrdersdefaultResponse](docs/EcommerceListStoreOrdersdefaultResponse.md)
 - [EcommerceListStores200Response](docs/EcommerceListStores200Response.md)
 - [EcommerceListStoresResponse](docs/EcommerceListStoresResponse.md)
 - [EcommerceListStoresdefaultResponse](docs/EcommerceListStoresdefaultResponse.md)
 - [EcommerceRemoveCartResponse](docs/EcommerceRemoveCartResponse.md)
 - [EcommerceRemoveCartdefaultResponse](docs/EcommerceRemoveCartdefaultResponse.md)
 - [EcommerceRemoveCustomerResponse](docs/EcommerceRemoveCustomerResponse.md)
 - [EcommerceRemoveCustomerdefaultResponse](docs/EcommerceRemoveCustomerdefaultResponse.md)
 - [EcommerceStatsProperty](docs/EcommerceStatsProperty.md)
 - [EcommerceStatsProperty1](docs/EcommerceStatsProperty1.md)
 - [EcommerceStatsProperty10](docs/EcommerceStatsProperty10.md)
 - [EcommerceStatsProperty11](docs/EcommerceStatsProperty11.md)
 - [EcommerceStatsProperty12](docs/EcommerceStatsProperty12.md)
 - [EcommerceStatsProperty13](docs/EcommerceStatsProperty13.md)
 - [EcommerceStatsProperty2](docs/EcommerceStatsProperty2.md)
 - [EcommerceStatsProperty3](docs/EcommerceStatsProperty3.md)
 - [EcommerceStatsProperty4](docs/EcommerceStatsProperty4.md)
 - [EcommerceStatsProperty5](docs/EcommerceStatsProperty5.md)
 - [EcommerceStatsProperty6](docs/EcommerceStatsProperty6.md)
 - [EcommerceStatsProperty7](docs/EcommerceStatsProperty7.md)
 - [EcommerceStatsProperty8](docs/EcommerceStatsProperty8.md)
 - [EcommerceStatsProperty9](docs/EcommerceStatsProperty9.md)
 - [EcommerceUpdateCartById200Response](docs/EcommerceUpdateCartById200Response.md)
 - [EcommerceUpdateCartByIdRequest](docs/EcommerceUpdateCartByIdRequest.md)
 - [EcommerceUpdateCartByIdResponse](docs/EcommerceUpdateCartByIdResponse.md)
 - [EcommerceUpdateCartByIddefaultResponse](docs/EcommerceUpdateCartByIddefaultResponse.md)
 - [EcommerceUpdateCartLineItem200Response](docs/EcommerceUpdateCartLineItem200Response.md)
 - [EcommerceUpdateCartLineItemRequest](docs/EcommerceUpdateCartLineItemRequest.md)
 - [EcommerceUpdateCartLineItemResponse](docs/EcommerceUpdateCartLineItemResponse.md)
 - [EcommerceUpdateCartLineItemdefaultResponse](docs/EcommerceUpdateCartLineItemdefaultResponse.md)
 - [EcommerceUpdateCustomer200Response](docs/EcommerceUpdateCustomer200Response.md)
 - [EcommerceUpdateCustomerRequest](docs/EcommerceUpdateCustomerRequest.md)
 - [EcommerceUpdateCustomerResponse](docs/EcommerceUpdateCustomerResponse.md)
 - [EcommerceUpdateCustomerdefaultResponse](docs/EcommerceUpdateCustomerdefaultResponse.md)
 - [EcommerceUpdateOrderLine200Response](docs/EcommerceUpdateOrderLine200Response.md)
 - [EcommerceUpdateOrderLineRequest](docs/EcommerceUpdateOrderLineRequest.md)
 - [EcommerceUpdateOrderLineResponse](docs/EcommerceUpdateOrderLineResponse.md)
 - [EcommerceUpdateOrderLinedefaultResponse](docs/EcommerceUpdateOrderLinedefaultResponse.md)
 - [EcommerceUpdateProduct200Response](docs/EcommerceUpdateProduct200Response.md)
 - [EcommerceUpdateProductImage200Response](docs/EcommerceUpdateProductImage200Response.md)
 - [EcommerceUpdateProductImageRequest](docs/EcommerceUpdateProductImageRequest.md)
 - [EcommerceUpdateProductImageResponse](docs/EcommerceUpdateProductImageResponse.md)
 - [EcommerceUpdateProductImagedefaultResponse](docs/EcommerceUpdateProductImagedefaultResponse.md)
 - [EcommerceUpdateProductRequest](docs/EcommerceUpdateProductRequest.md)
 - [EcommerceUpdateProductResponse](docs/EcommerceUpdateProductResponse.md)
 - [EcommerceUpdateProductVariant200Response](docs/EcommerceUpdateProductVariant200Response.md)
 - [EcommerceUpdateProductVariantRequest](docs/EcommerceUpdateProductVariantRequest.md)
 - [EcommerceUpdateProductVariantResponse](docs/EcommerceUpdateProductVariantResponse.md)
 - [EcommerceUpdateProductVariantdefaultResponse](docs/EcommerceUpdateProductVariantdefaultResponse.md)
 - [EcommerceUpdateProductdefaultResponse](docs/EcommerceUpdateProductdefaultResponse.md)
 - [EcommerceUpdatePromoCode200Response](docs/EcommerceUpdatePromoCode200Response.md)
 - [EcommerceUpdatePromoCodeRequest](docs/EcommerceUpdatePromoCodeRequest.md)
 - [EcommerceUpdatePromoCodeResponse](docs/EcommerceUpdatePromoCodeResponse.md)
 - [EcommerceUpdatePromoCodedefaultResponse](docs/EcommerceUpdatePromoCodedefaultResponse.md)
 - [EcommerceUpdatePromoRule200Response](docs/EcommerceUpdatePromoRule200Response.md)
 - [EcommerceUpdatePromoRuleRequest](docs/EcommerceUpdatePromoRuleRequest.md)
 - [EcommerceUpdatePromoRuleResponse](docs/EcommerceUpdatePromoRuleResponse.md)
 - [EcommerceUpdatePromoRuledefaultResponse](docs/EcommerceUpdatePromoRuledefaultResponse.md)
 - [EcommerceUpdateSpecificOrder200Response](docs/EcommerceUpdateSpecificOrder200Response.md)
 - [EcommerceUpdateSpecificOrderRequest](docs/EcommerceUpdateSpecificOrderRequest.md)
 - [EcommerceUpdateSpecificOrderResponse](docs/EcommerceUpdateSpecificOrderResponse.md)
 - [EcommerceUpdateSpecificOrderdefaultResponse](docs/EcommerceUpdateSpecificOrderdefaultResponse.md)
 - [EcommerceUpdateStore200Response](docs/EcommerceUpdateStore200Response.md)
 - [EcommerceUpdateStoreRequest](docs/EcommerceUpdateStoreRequest.md)
 - [EcommerceUpdateStoreResponse](docs/EcommerceUpdateStoreResponse.md)
 - [EcommerceUpdateStoredefaultResponse](docs/EcommerceUpdateStoredefaultResponse.md)
 - [EmailActivity](docs/EmailActivity.md)
 - [EmailClient](docs/EmailClient.md)
 - [EmailDomain](docs/EmailDomain.md)
 - [ErrorsPropertyInner](docs/ErrorsPropertyInner.md)
 - [ErrorsPropertyInner1](docs/ErrorsPropertyInner1.md)
 - [Event](docs/Event.md)
 - [EventsProperty](docs/EventsProperty.md)
 - [EventsProperty1](docs/EventsProperty1.md)
 - [EventsProperty2](docs/EventsProperty2.md)
 - [EventsProperty3](docs/EventsProperty3.md)
 - [EventsProperty4](docs/EventsProperty4.md)
 - [EventsProperty5](docs/EventsProperty5.md)
 - [EventsProperty6](docs/EventsProperty6.md)
 - [EventsProperty7](docs/EventsProperty7.md)
 - [EventsProperty8](docs/EventsProperty8.md)
 - [ExactMatchesProperty](docs/ExactMatchesProperty.md)
 - [ExactMatchesProperty1](docs/ExactMatchesProperty1.md)
 - [FacebookAdsGetInfo200Response](docs/FacebookAdsGetInfo200Response.md)
 - [FacebookAdsGetInfo200ResponseAllOf](docs/FacebookAdsGetInfo200ResponseAllOf.md)
 - [FacebookAdsGetInfo200ResponseAllOf1](docs/FacebookAdsGetInfo200ResponseAllOf1.md)
 - [FacebookAdsGetInfo200ResponseAllOf1Budget](docs/FacebookAdsGetInfo200ResponseAllOf1Budget.md)
 - [FacebookAdsGetInfo200ResponseAllOf1Channel](docs/FacebookAdsGetInfo200ResponseAllOf1Channel.md)
 - [FacebookAdsGetInfo200ResponseAllOf1Site](docs/FacebookAdsGetInfo200ResponseAllOf1Site.md)
 - [FacebookAdsGetInfoResponse](docs/FacebookAdsGetInfoResponse.md)
 - [FacebookAdsGetInfoResponseAllOf](docs/FacebookAdsGetInfoResponseAllOf.md)
 - [FacebookAdsGetInfoResponseAllOf1](docs/FacebookAdsGetInfoResponseAllOf1.md)
 - [FacebookAdsGetInfoResponseAllOf2](docs/FacebookAdsGetInfoResponseAllOf2.md)
 - [FacebookAdsGetInfoResponseAllOf2Audience](docs/FacebookAdsGetInfoResponseAllOf2Audience.md)
 - [FacebookAdsGetInfoResponseAllOf2AudienceEmailSource](docs/FacebookAdsGetInfoResponseAllOf2AudienceEmailSource.md)
 - [FacebookAdsGetInfoResponseAllOf2AudienceTargetingSpecs](docs/FacebookAdsGetInfoResponseAllOf2AudienceTargetingSpecs.md)
 - [FacebookAdsGetInfoResponseAllOf2AudienceTargetingSpecsInterests](docs/FacebookAdsGetInfoResponseAllOf2AudienceTargetingSpecsInterests.md)
 - [FacebookAdsGetInfoResponseAllOf2AudienceTargetingSpecsLocations](docs/FacebookAdsGetInfoResponseAllOf2AudienceTargetingSpecsLocations.md)
 - [FacebookAdsGetInfoResponseAllOf2Budget](docs/FacebookAdsGetInfoResponseAllOf2Budget.md)
 - [FacebookAdsGetInfoResponseAllOf2Channel](docs/FacebookAdsGetInfoResponseAllOf2Channel.md)
 - [FacebookAdsGetInfoResponseAllOf2Content](docs/FacebookAdsGetInfoResponseAllOf2Content.md)
 - [FacebookAdsGetInfoResponseAllOf2ContentAttachments](docs/FacebookAdsGetInfoResponseAllOf2ContentAttachments.md)
 - [FacebookAdsGetInfoResponseAllOf2Feedback](docs/FacebookAdsGetInfoResponseAllOf2Feedback.md)
 - [FacebookAdsGetInfoResponseAllOf2Site](docs/FacebookAdsGetInfoResponseAllOf2Site.md)
 - [FacebookAdsGetInfoResponseAllOf3](docs/FacebookAdsGetInfoResponseAllOf3.md)
 - [FacebookAdsGetInfodefaultResponse](docs/FacebookAdsGetInfodefaultResponse.md)
 - [FacebookAdsListAds200Response](docs/FacebookAdsListAds200Response.md)
 - [FacebookAdsListAds200ResponseFacebookAdsInner](docs/FacebookAdsListAds200ResponseFacebookAdsInner.md)
 - [FacebookAdsListAds200ResponseFacebookAdsInnerAllOf](docs/FacebookAdsListAds200ResponseFacebookAdsInnerAllOf.md)
 - [FacebookAdsListAds200ResponseFacebookAdsInnerAllOf1](docs/FacebookAdsListAds200ResponseFacebookAdsInnerAllOf1.md)
 - [FacebookAdsListAds200ResponseFacebookAdsInnerAllOf1Budget](docs/FacebookAdsListAds200ResponseFacebookAdsInnerAllOf1Budget.md)
 - [FacebookAdsListAds200ResponseFacebookAdsInnerAllOf1Channel](docs/FacebookAdsListAds200ResponseFacebookAdsInnerAllOf1Channel.md)
 - [FacebookAdsListAds200ResponseFacebookAdsInnerAllOf1Site](docs/FacebookAdsListAds200ResponseFacebookAdsInnerAllOf1Site.md)
 - [FacebookAdsListAdsResponse](docs/FacebookAdsListAdsResponse.md)
 - [FacebookAdsListAdsResponseFacebookAdsInner](docs/FacebookAdsListAdsResponseFacebookAdsInner.md)
 - [FacebookAdsListAdsResponseFacebookAdsInnerAllOf](docs/FacebookAdsListAdsResponseFacebookAdsInnerAllOf.md)
 - [FacebookAdsListAdsResponseFacebookAdsInnerAllOf1](docs/FacebookAdsListAdsResponseFacebookAdsInnerAllOf1.md)
 - [FacebookAdsListAdsResponseFacebookAdsInnerAllOf2](docs/FacebookAdsListAdsResponseFacebookAdsInnerAllOf2.md)
 - [FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience](docs/FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience.md)
 - [FacebookAdsListAdsResponseFacebookAdsInnerAllOf2AudienceEmailSource](docs/FacebookAdsListAdsResponseFacebookAdsInnerAllOf2AudienceEmailSource.md)
 - [FacebookAdsListAdsResponseFacebookAdsInnerAllOf2AudienceTargetingSpecs](docs/FacebookAdsListAdsResponseFacebookAdsInnerAllOf2AudienceTargetingSpecs.md)
 - [FacebookAdsListAdsResponseFacebookAdsInnerAllOf2AudienceTargetingSpecsInterestsInner](docs/FacebookAdsListAdsResponseFacebookAdsInnerAllOf2AudienceTargetingSpecsInterestsInner.md)
 - [FacebookAdsListAdsResponseFacebookAdsInnerAllOf2AudienceTargetingSpecsLocations](docs/FacebookAdsListAdsResponseFacebookAdsInnerAllOf2AudienceTargetingSpecsLocations.md)
 - [FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Budget](docs/FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Budget.md)
 - [FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Channel](docs/FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Channel.md)
 - [FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Content](docs/FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Content.md)
 - [FacebookAdsListAdsResponseFacebookAdsInnerAllOf2ContentAttachmentsInner](docs/FacebookAdsListAdsResponseFacebookAdsInnerAllOf2ContentAttachmentsInner.md)
 - [FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Feedback](docs/FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Feedback.md)
 - [FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Site](docs/FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Site.md)
 - [FacebookAdsListAdsResponseFacebookAdsInnerAllOf3](docs/FacebookAdsListAdsResponseFacebookAdsInnerAllOf3.md)
 - [FacebookAdsListAdsdefaultResponse](docs/FacebookAdsListAdsdefaultResponse.md)
 - [FacebookLikesProperty](docs/FacebookLikesProperty.md)
 - [FileManagerAddNewFolder200Response](docs/FileManagerAddNewFolder200Response.md)
 - [FileManagerAddNewFolderRequest](docs/FileManagerAddNewFolderRequest.md)
 - [FileManagerAddNewFolderResponse](docs/FileManagerAddNewFolderResponse.md)
 - [FileManagerAddNewFolderdefaultResponse](docs/FileManagerAddNewFolderdefaultResponse.md)
 - [FileManagerDeleteFolderByIdResponse](docs/FileManagerDeleteFolderByIdResponse.md)
 - [FileManagerDeleteFolderByIddefaultResponse](docs/FileManagerDeleteFolderByIddefaultResponse.md)
 - [FileManagerGetFile200Response](docs/FileManagerGetFile200Response.md)
 - [FileManagerGetFileResponse](docs/FileManagerGetFileResponse.md)
 - [FileManagerGetFiledefaultResponse](docs/FileManagerGetFiledefaultResponse.md)
 - [FileManagerGetFolderInfo200Response](docs/FileManagerGetFolderInfo200Response.md)
 - [FileManagerGetFolderInfoResponse](docs/FileManagerGetFolderInfoResponse.md)
 - [FileManagerGetFolderInfodefaultResponse](docs/FileManagerGetFolderInfodefaultResponse.md)
 - [FileManagerGetFolderList200Response](docs/FileManagerGetFolderList200Response.md)
 - [FileManagerGetFolderListResponse](docs/FileManagerGetFolderListResponse.md)
 - [FileManagerGetFolderListdefaultResponse](docs/FileManagerGetFolderListdefaultResponse.md)
 - [FileManagerListStoredFiles200Response](docs/FileManagerListStoredFiles200Response.md)
 - [FileManagerListStoredFilesResponse](docs/FileManagerListStoredFilesResponse.md)
 - [FileManagerListStoredFilesdefaultResponse](docs/FileManagerListStoredFilesdefaultResponse.md)
 - [FileManagerRemoveFileByIdResponse](docs/FileManagerRemoveFileByIdResponse.md)
 - [FileManagerRemoveFileByIddefaultResponse](docs/FileManagerRemoveFileByIddefaultResponse.md)
 - [FileManagerUpdateFile200Response](docs/FileManagerUpdateFile200Response.md)
 - [FileManagerUpdateFileRequest](docs/FileManagerUpdateFileRequest.md)
 - [FileManagerUpdateFileResponse](docs/FileManagerUpdateFileResponse.md)
 - [FileManagerUpdateFiledefaultResponse](docs/FileManagerUpdateFiledefaultResponse.md)
 - [FileManagerUpdateSpecificFolder200Response](docs/FileManagerUpdateSpecificFolder200Response.md)
 - [FileManagerUpdateSpecificFolderResponse](docs/FileManagerUpdateSpecificFolderResponse.md)
 - [FileManagerUpdateSpecificFolderdefaultResponse](docs/FileManagerUpdateSpecificFolderdefaultResponse.md)
 - [FileManagerUploadFile200Response](docs/FileManagerUploadFile200Response.md)
 - [FileManagerUploadFileRequest](docs/FileManagerUploadFileRequest.md)
 - [FileManagerUploadFileResponse](docs/FileManagerUploadFileResponse.md)
 - [FileManagerUploadFiledefaultResponse](docs/FileManagerUploadFiledefaultResponse.md)
 - [ForwardsProperty](docs/ForwardsProperty.md)
 - [GalleryFile](docs/GalleryFile.md)
 - [GalleryFolder](docs/GalleryFolder.md)
 - [Goal](docs/Goal.md)
 - [GroupAProperty](docs/GroupAProperty.md)
 - [GroupBProperty](docs/GroupBProperty.md)
 - [GrowthHistory](docs/GrowthHistory.md)
 - [HoursProperty](docs/HoursProperty.md)
 - [IndustryStatsProperty](docs/IndustryStatsProperty.md)
 - [IndustryStatsProperty1](docs/IndustryStatsProperty1.md)
 - [Interest](docs/Interest.md)
 - [InterestCategory](docs/InterestCategory.md)
 - [ItemsPropertyInner](docs/ItemsPropertyInner.md)
 - [LandingPage](docs/LandingPage.md)
 - [LandingPage1](docs/LandingPage1.md)
 - [LandingPageReport](docs/LandingPageReport.md)
 - [LandingPageReport1](docs/LandingPageReport1.md)
 - [LandingPageReport1Timeseries](docs/LandingPageReport1Timeseries.md)
 - [LandingPageReportTimeseries](docs/LandingPageReportTimeseries.md)
 - [LandingPagesCreateNewMailchimpLandingPage200Response](docs/LandingPagesCreateNewMailchimpLandingPage200Response.md)
 - [LandingPagesCreateNewMailchimpLandingPageRequest](docs/LandingPagesCreateNewMailchimpLandingPageRequest.md)
 - [LandingPagesCreateNewMailchimpLandingPageResponse](docs/LandingPagesCreateNewMailchimpLandingPageResponse.md)
 - [LandingPagesCreateNewMailchimpLandingPagedefaultResponse](docs/LandingPagesCreateNewMailchimpLandingPagedefaultResponse.md)
 - [LandingPagesDeletePageResponse](docs/LandingPagesDeletePageResponse.md)
 - [LandingPagesDeletePagedefaultResponse](docs/LandingPagesDeletePagedefaultResponse.md)
 - [LandingPagesGetContent200Response](docs/LandingPagesGetContent200Response.md)
 - [LandingPagesGetContentResponse](docs/LandingPagesGetContentResponse.md)
 - [LandingPagesGetContentdefaultResponse](docs/LandingPagesGetContentdefaultResponse.md)
 - [LandingPagesGetPageInfo200Response](docs/LandingPagesGetPageInfo200Response.md)
 - [LandingPagesGetPageInfoResponse](docs/LandingPagesGetPageInfoResponse.md)
 - [LandingPagesGetPageInfodefaultResponse](docs/LandingPagesGetPageInfodefaultResponse.md)
 - [LandingPagesList200Response](docs/LandingPagesList200Response.md)
 - [LandingPagesListResponse](docs/LandingPagesListResponse.md)
 - [LandingPagesListdefaultResponse](docs/LandingPagesListdefaultResponse.md)
 - [LandingPagesPublishActionResponse](docs/LandingPagesPublishActionResponse.md)
 - [LandingPagesPublishActiondefaultResponse](docs/LandingPagesPublishActiondefaultResponse.md)
 - [LandingPagesUnpublishActionResponse](docs/LandingPagesUnpublishActionResponse.md)
 - [LandingPagesUnpublishActiondefaultResponse](docs/LandingPagesUnpublishActiondefaultResponse.md)
 - [LandingPagesUpdatePageById200Response](docs/LandingPagesUpdatePageById200Response.md)
 - [LandingPagesUpdatePageByIdRequest](docs/LandingPagesUpdatePageByIdRequest.md)
 - [LandingPagesUpdatePageByIdResponse](docs/LandingPagesUpdatePageByIdResponse.md)
 - [LandingPagesUpdatePageByIddefaultResponse](docs/LandingPagesUpdatePageByIddefaultResponse.md)
 - [LastMessageProperty](docs/LastMessageProperty.md)
 - [List](docs/List.md)
 - [ListContactProperty](docs/ListContactProperty.md)
 - [ListContactProperty1](docs/ListContactProperty1.md)
 - [ListContactProperty2](docs/ListContactProperty2.md)
 - [ListLocation](docs/ListLocation.md)
 - [ListMembers](docs/ListMembers.md)
 - [ListMembers1](docs/ListMembers1.md)
 - [ListMembers2](docs/ListMembers2.md)
 - [ListMembers3](docs/ListMembers3.md)
 - [ListMembers4](docs/ListMembers4.md)
 - [ListMembers5](docs/ListMembers5.md)
 - [ListMembers6](docs/ListMembers6.md)
 - [ListMembers7](docs/ListMembers7.md)
 - [ListProperty](docs/ListProperty.md)
 - [ListProperty1](docs/ListProperty1.md)
 - [ListProperty10](docs/ListProperty10.md)
 - [ListProperty11](docs/ListProperty11.md)
 - [ListProperty12](docs/ListProperty12.md)
 - [ListProperty13](docs/ListProperty13.md)
 - [ListProperty14](docs/ListProperty14.md)
 - [ListProperty15](docs/ListProperty15.md)
 - [ListProperty16](docs/ListProperty16.md)
 - [ListProperty17](docs/ListProperty17.md)
 - [ListProperty18](docs/ListProperty18.md)
 - [ListProperty19](docs/ListProperty19.md)
 - [ListProperty2](docs/ListProperty2.md)
 - [ListProperty20](docs/ListProperty20.md)
 - [ListProperty21](docs/ListProperty21.md)
 - [ListProperty22](docs/ListProperty22.md)
 - [ListProperty23](docs/ListProperty23.md)
 - [ListProperty24](docs/ListProperty24.md)
 - [ListProperty25](docs/ListProperty25.md)
 - [ListProperty26](docs/ListProperty26.md)
 - [ListProperty27](docs/ListProperty27.md)
 - [ListProperty28](docs/ListProperty28.md)
 - [ListProperty29](docs/ListProperty29.md)
 - [ListProperty3](docs/ListProperty3.md)
 - [ListProperty30](docs/ListProperty30.md)
 - [ListProperty4](docs/ListProperty4.md)
 - [ListProperty5](docs/ListProperty5.md)
 - [ListProperty6](docs/ListProperty6.md)
 - [ListProperty7](docs/ListProperty7.md)
 - [ListProperty8](docs/ListProperty8.md)
 - [ListProperty9](docs/ListProperty9.md)
 - [ListStatsProperty](docs/ListStatsProperty.md)
 - [ListWebhooks](docs/ListWebhooks.md)
 - [ListWebhooks1](docs/ListWebhooks1.md)
 - [ListsAddInterestCategory200Response](docs/ListsAddInterestCategory200Response.md)
 - [ListsAddInterestCategoryRequest](docs/ListsAddInterestCategoryRequest.md)
 - [ListsAddInterestCategoryResponse](docs/ListsAddInterestCategoryResponse.md)
 - [ListsAddInterestCategorydefaultResponse](docs/ListsAddInterestCategorydefaultResponse.md)
 - [ListsAddInterestInCategory200Response](docs/ListsAddInterestInCategory200Response.md)
 - [ListsAddInterestInCategoryRequest](docs/ListsAddInterestInCategoryRequest.md)
 - [ListsAddInterestInCategoryResponse](docs/ListsAddInterestInCategoryResponse.md)
 - [ListsAddInterestInCategorydefaultResponse](docs/ListsAddInterestInCategorydefaultResponse.md)
 - [ListsAddMemberEventRequest](docs/ListsAddMemberEventRequest.md)
 - [ListsAddMemberEventResponse](docs/ListsAddMemberEventResponse.md)
 - [ListsAddMemberEventdefaultResponse](docs/ListsAddMemberEventdefaultResponse.md)
 - [ListsAddMemberNote200Response](docs/ListsAddMemberNote200Response.md)
 - [ListsAddMemberNoteRequest](docs/ListsAddMemberNoteRequest.md)
 - [ListsAddMemberNoteResponse](docs/ListsAddMemberNoteResponse.md)
 - [ListsAddMemberNotedefaultResponse](docs/ListsAddMemberNotedefaultResponse.md)
 - [ListsAddMemberTagsRequest](docs/ListsAddMemberTagsRequest.md)
 - [ListsAddMemberTagsResponse](docs/ListsAddMemberTagsResponse.md)
 - [ListsAddMemberTagsdefaultResponse](docs/ListsAddMemberTagsdefaultResponse.md)
 - [ListsAddMemberToList200Response](docs/ListsAddMemberToList200Response.md)
 - [ListsAddMemberToListRequest](docs/ListsAddMemberToListRequest.md)
 - [ListsAddMemberToListResponse](docs/ListsAddMemberToListResponse.md)
 - [ListsAddMemberToListdefaultResponse](docs/ListsAddMemberToListdefaultResponse.md)
 - [ListsAddMemberToSegment200Response](docs/ListsAddMemberToSegment200Response.md)
 - [ListsAddMemberToSegmentRequest](docs/ListsAddMemberToSegmentRequest.md)
 - [ListsAddMemberToSegmentResponse](docs/ListsAddMemberToSegmentResponse.md)
 - [ListsAddMemberToSegmentdefaultResponse](docs/ListsAddMemberToSegmentdefaultResponse.md)
 - [ListsAddMergeField200Response](docs/ListsAddMergeField200Response.md)
 - [ListsAddMergeFieldRequest](docs/ListsAddMergeFieldRequest.md)
 - [ListsAddMergeFieldResponse](docs/ListsAddMergeFieldResponse.md)
 - [ListsAddMergeFielddefaultResponse](docs/ListsAddMergeFielddefaultResponse.md)
 - [ListsAddNewSegment200Response](docs/ListsAddNewSegment200Response.md)
 - [ListsAddNewSegmentRequest](docs/ListsAddNewSegmentRequest.md)
 - [ListsAddNewSegmentResponse](docs/ListsAddNewSegmentResponse.md)
 - [ListsAddNewSegmentdefaultResponse](docs/ListsAddNewSegmentdefaultResponse.md)
 - [ListsAddOrUpdateMember200Response](docs/ListsAddOrUpdateMember200Response.md)
 - [ListsAddOrUpdateMemberRequest](docs/ListsAddOrUpdateMemberRequest.md)
 - [ListsAddOrUpdateMemberResponse](docs/ListsAddOrUpdateMemberResponse.md)
 - [ListsAddOrUpdateMemberdefaultResponse](docs/ListsAddOrUpdateMemberdefaultResponse.md)
 - [ListsArchiveMemberResponse](docs/ListsArchiveMemberResponse.md)
 - [ListsArchiveMemberdefaultResponse](docs/ListsArchiveMemberdefaultResponse.md)
 - [ListsBatchAddRemoveMembers200Response](docs/ListsBatchAddRemoveMembers200Response.md)
 - [ListsBatchAddRemoveMembersRequest](docs/ListsBatchAddRemoveMembersRequest.md)
 - [ListsBatchAddRemoveMembersResponse](docs/ListsBatchAddRemoveMembersResponse.md)
 - [ListsBatchAddRemoveMembersdefaultResponse](docs/ListsBatchAddRemoveMembersdefaultResponse.md)
 - [ListsBatchSubscribeOrUnsubscribe200Response](docs/ListsBatchSubscribeOrUnsubscribe200Response.md)
 - [ListsBatchSubscribeOrUnsubscribeRequest](docs/ListsBatchSubscribeOrUnsubscribeRequest.md)
 - [ListsBatchSubscribeOrUnsubscribeResponse](docs/ListsBatchSubscribeOrUnsubscribeResponse.md)
 - [ListsBatchSubscribeOrUnsubscribedefaultResponse](docs/ListsBatchSubscribeOrUnsubscribedefaultResponse.md)
 - [ListsCreateNewList200Response](docs/ListsCreateNewList200Response.md)
 - [ListsCreateNewListRequest](docs/ListsCreateNewListRequest.md)
 - [ListsCreateNewListResponse](docs/ListsCreateNewListResponse.md)
 - [ListsCreateNewListdefaultResponse](docs/ListsCreateNewListdefaultResponse.md)
 - [ListsCreateWebhook200Response](docs/ListsCreateWebhook200Response.md)
 - [ListsCreateWebhookRequest](docs/ListsCreateWebhookRequest.md)
 - [ListsCreateWebhookResponse](docs/ListsCreateWebhookResponse.md)
 - [ListsCreateWebhookdefaultResponse](docs/ListsCreateWebhookdefaultResponse.md)
 - [ListsCustomizeSignupForm200Response](docs/ListsCustomizeSignupForm200Response.md)
 - [ListsCustomizeSignupFormRequest](docs/ListsCustomizeSignupFormRequest.md)
 - [ListsCustomizeSignupFormResponse](docs/ListsCustomizeSignupFormResponse.md)
 - [ListsCustomizeSignupFormdefaultResponse](docs/ListsCustomizeSignupFormdefaultResponse.md)
 - [ListsDeleteInterestCategoryResponse](docs/ListsDeleteInterestCategoryResponse.md)
 - [ListsDeleteInterestCategorydefaultResponse](docs/ListsDeleteInterestCategorydefaultResponse.md)
 - [ListsDeleteInterestInCategoryResponse](docs/ListsDeleteInterestInCategoryResponse.md)
 - [ListsDeleteInterestInCategorydefaultResponse](docs/ListsDeleteInterestInCategorydefaultResponse.md)
 - [ListsDeleteListResponse](docs/ListsDeleteListResponse.md)
 - [ListsDeleteListdefaultResponse](docs/ListsDeleteListdefaultResponse.md)
 - [ListsDeleteMergeFieldResponse](docs/ListsDeleteMergeFieldResponse.md)
 - [ListsDeleteMergeFielddefaultResponse](docs/ListsDeleteMergeFielddefaultResponse.md)
 - [ListsDeleteNoteResponse](docs/ListsDeleteNoteResponse.md)
 - [ListsDeleteNotedefaultResponse](docs/ListsDeleteNotedefaultResponse.md)
 - [ListsDeleteSegmentResponse](docs/ListsDeleteSegmentResponse.md)
 - [ListsDeleteSegmentdefaultResponse](docs/ListsDeleteSegmentdefaultResponse.md)
 - [ListsDeleteWebhookResponse](docs/ListsDeleteWebhookResponse.md)
 - [ListsDeleteWebhookdefaultResponse](docs/ListsDeleteWebhookdefaultResponse.md)
 - [ListsGetAbuseReport200Response](docs/ListsGetAbuseReport200Response.md)
 - [ListsGetAbuseReportResponse](docs/ListsGetAbuseReportResponse.md)
 - [ListsGetAbuseReportdefaultResponse](docs/ListsGetAbuseReportdefaultResponse.md)
 - [ListsGetAllAbuseReports200Response](docs/ListsGetAllAbuseReports200Response.md)
 - [ListsGetAllAbuseReportsResponse](docs/ListsGetAllAbuseReportsResponse.md)
 - [ListsGetAllAbuseReportsdefaultResponse](docs/ListsGetAllAbuseReportsdefaultResponse.md)
 - [ListsGetAllInfo200Response](docs/ListsGetAllInfo200Response.md)
 - [ListsGetAllInfoResponse](docs/ListsGetAllInfoResponse.md)
 - [ListsGetAllInfodefaultResponse](docs/ListsGetAllInfodefaultResponse.md)
 - [ListsGetGrowthHistoryByMonth200Response](docs/ListsGetGrowthHistoryByMonth200Response.md)
 - [ListsGetGrowthHistoryByMonthResponse](docs/ListsGetGrowthHistoryByMonthResponse.md)
 - [ListsGetGrowthHistoryByMonthdefaultResponse](docs/ListsGetGrowthHistoryByMonthdefaultResponse.md)
 - [ListsGetGrowthHistoryData200Response](docs/ListsGetGrowthHistoryData200Response.md)
 - [ListsGetGrowthHistoryDataResponse](docs/ListsGetGrowthHistoryDataResponse.md)
 - [ListsGetGrowthHistoryDatadefaultResponse](docs/ListsGetGrowthHistoryDatadefaultResponse.md)
 - [ListsGetInterestCategoryInfo200Response](docs/ListsGetInterestCategoryInfo200Response.md)
 - [ListsGetInterestCategoryInfoResponse](docs/ListsGetInterestCategoryInfoResponse.md)
 - [ListsGetInterestCategoryInfodefaultResponse](docs/ListsGetInterestCategoryInfodefaultResponse.md)
 - [ListsGetInterestInCategory200Response](docs/ListsGetInterestInCategory200Response.md)
 - [ListsGetInterestInCategoryResponse](docs/ListsGetInterestInCategoryResponse.md)
 - [ListsGetInterestInCategorydefaultResponse](docs/ListsGetInterestInCategorydefaultResponse.md)
 - [ListsGetListInfo200Response](docs/ListsGetListInfo200Response.md)
 - [ListsGetListInfoResponse](docs/ListsGetListInfoResponse.md)
 - [ListsGetListInfodefaultResponse](docs/ListsGetListInfodefaultResponse.md)
 - [ListsGetLocations200Response](docs/ListsGetLocations200Response.md)
 - [ListsGetLocationsResponse](docs/ListsGetLocationsResponse.md)
 - [ListsGetLocationsdefaultResponse](docs/ListsGetLocationsdefaultResponse.md)
 - [ListsGetMemberEvents200Response](docs/ListsGetMemberEvents200Response.md)
 - [ListsGetMemberEventsResponse](docs/ListsGetMemberEventsResponse.md)
 - [ListsGetMemberEventsdefaultResponse](docs/ListsGetMemberEventsdefaultResponse.md)
 - [ListsGetMemberGoals200Response](docs/ListsGetMemberGoals200Response.md)
 - [ListsGetMemberGoalsResponse](docs/ListsGetMemberGoalsResponse.md)
 - [ListsGetMemberGoalsdefaultResponse](docs/ListsGetMemberGoalsdefaultResponse.md)
 - [ListsGetMemberInfo200Response](docs/ListsGetMemberInfo200Response.md)
 - [ListsGetMemberInfoResponse](docs/ListsGetMemberInfoResponse.md)
 - [ListsGetMemberInfodefaultResponse](docs/ListsGetMemberInfodefaultResponse.md)
 - [ListsGetMemberNote200Response](docs/ListsGetMemberNote200Response.md)
 - [ListsGetMemberNoteResponse](docs/ListsGetMemberNoteResponse.md)
 - [ListsGetMemberNotedefaultResponse](docs/ListsGetMemberNotedefaultResponse.md)
 - [ListsGetMemberNotes200Response](docs/ListsGetMemberNotes200Response.md)
 - [ListsGetMemberNotesResponse](docs/ListsGetMemberNotesResponse.md)
 - [ListsGetMemberNotesdefaultResponse](docs/ListsGetMemberNotesdefaultResponse.md)
 - [ListsGetMemberTags200Response](docs/ListsGetMemberTags200Response.md)
 - [ListsGetMemberTagsResponse](docs/ListsGetMemberTagsResponse.md)
 - [ListsGetMemberTagsdefaultResponse](docs/ListsGetMemberTagsdefaultResponse.md)
 - [ListsGetMembersInfo200Response](docs/ListsGetMembersInfo200Response.md)
 - [ListsGetMembersInfoResponse](docs/ListsGetMembersInfoResponse.md)
 - [ListsGetMembersInfodefaultResponse](docs/ListsGetMembersInfodefaultResponse.md)
 - [ListsGetMergeFieldInfo200Response](docs/ListsGetMergeFieldInfo200Response.md)
 - [ListsGetMergeFieldInfoResponse](docs/ListsGetMergeFieldInfoResponse.md)
 - [ListsGetMergeFieldInfodefaultResponse](docs/ListsGetMergeFieldInfodefaultResponse.md)
 - [ListsGetRecentActivityStats200Response](docs/ListsGetRecentActivityStats200Response.md)
 - [ListsGetRecentActivityStatsResponse](docs/ListsGetRecentActivityStatsResponse.md)
 - [ListsGetRecentActivityStatsdefaultResponse](docs/ListsGetRecentActivityStatsdefaultResponse.md)
 - [ListsGetSegmentInfo200Response](docs/ListsGetSegmentInfo200Response.md)
 - [ListsGetSegmentInfoResponse](docs/ListsGetSegmentInfoResponse.md)
 - [ListsGetSegmentInfodefaultResponse](docs/ListsGetSegmentInfodefaultResponse.md)
 - [ListsGetSegmentMembers200Response](docs/ListsGetSegmentMembers200Response.md)
 - [ListsGetSegmentMembersResponse](docs/ListsGetSegmentMembersResponse.md)
 - [ListsGetSegmentMembersdefaultResponse](docs/ListsGetSegmentMembersdefaultResponse.md)
 - [ListsGetSegmentsInfo200Response](docs/ListsGetSegmentsInfo200Response.md)
 - [ListsGetSegmentsInfoResponse](docs/ListsGetSegmentsInfoResponse.md)
 - [ListsGetSegmentsInfodefaultResponse](docs/ListsGetSegmentsInfodefaultResponse.md)
 - [ListsGetSignupForms200Response](docs/ListsGetSignupForms200Response.md)
 - [ListsGetSignupFormsResponse](docs/ListsGetSignupFormsResponse.md)
 - [ListsGetSignupFormsdefaultResponse](docs/ListsGetSignupFormsdefaultResponse.md)
 - [ListsGetSurveyDetailsResponse](docs/ListsGetSurveyDetailsResponse.md)
 - [ListsGetSurveyDetailsdefaultResponse](docs/ListsGetSurveyDetailsdefaultResponse.md)
 - [ListsGetSurveysInfoResponse](docs/ListsGetSurveysInfoResponse.md)
 - [ListsGetSurveysInfodefaultResponse](docs/ListsGetSurveysInfodefaultResponse.md)
 - [ListsGetWebhookInfo200Response](docs/ListsGetWebhookInfo200Response.md)
 - [ListsGetWebhookInfoResponse](docs/ListsGetWebhookInfoResponse.md)
 - [ListsGetWebhookInfodefaultResponse](docs/ListsGetWebhookInfodefaultResponse.md)
 - [ListsGetWebhooksInfo200Response](docs/ListsGetWebhooksInfo200Response.md)
 - [ListsGetWebhooksInfoResponse](docs/ListsGetWebhooksInfoResponse.md)
 - [ListsGetWebhooksInfodefaultResponse](docs/ListsGetWebhooksInfodefaultResponse.md)
 - [ListsListCategoryInterests200Response](docs/ListsListCategoryInterests200Response.md)
 - [ListsListCategoryInterestsResponse](docs/ListsListCategoryInterestsResponse.md)
 - [ListsListCategoryInterestsdefaultResponse](docs/ListsListCategoryInterestsdefaultResponse.md)
 - [ListsListInterestCategories200Response](docs/ListsListInterestCategories200Response.md)
 - [ListsListInterestCategoriesResponse](docs/ListsListInterestCategoriesResponse.md)
 - [ListsListInterestCategoriesdefaultResponse](docs/ListsListInterestCategoriesdefaultResponse.md)
 - [ListsListMergeFields200Response](docs/ListsListMergeFields200Response.md)
 - [ListsListMergeFieldsResponse](docs/ListsListMergeFieldsResponse.md)
 - [ListsListMergeFieldsdefaultResponse](docs/ListsListMergeFieldsdefaultResponse.md)
 - [ListsListTopEmailClients200Response](docs/ListsListTopEmailClients200Response.md)
 - [ListsListTopEmailClientsResponse](docs/ListsListTopEmailClientsResponse.md)
 - [ListsListTopEmailClientsdefaultResponse](docs/ListsListTopEmailClientsdefaultResponse.md)
 - [ListsPropertyInner](docs/ListsPropertyInner.md)
 - [ListsRemoveMemberFromSegmentResponse](docs/ListsRemoveMemberFromSegmentResponse.md)
 - [ListsRemoveMemberFromSegmentdefaultResponse](docs/ListsRemoveMemberFromSegmentdefaultResponse.md)
 - [ListsRemoveMemberPermanentResponse](docs/ListsRemoveMemberPermanentResponse.md)
 - [ListsRemoveMemberPermanentdefaultResponse](docs/ListsRemoveMemberPermanentdefaultResponse.md)
 - [ListsSearchTagsByName200Response](docs/ListsSearchTagsByName200Response.md)
 - [ListsSearchTagsByNameResponse](docs/ListsSearchTagsByNameResponse.md)
 - [ListsSearchTagsByNamedefaultResponse](docs/ListsSearchTagsByNamedefaultResponse.md)
 - [ListsUpdateInterestCategory200Response](docs/ListsUpdateInterestCategory200Response.md)
 - [ListsUpdateInterestCategoryInterest200Response](docs/ListsUpdateInterestCategoryInterest200Response.md)
 - [ListsUpdateInterestCategoryInterestResponse](docs/ListsUpdateInterestCategoryInterestResponse.md)
 - [ListsUpdateInterestCategoryInterestdefaultResponse](docs/ListsUpdateInterestCategoryInterestdefaultResponse.md)
 - [ListsUpdateInterestCategoryResponse](docs/ListsUpdateInterestCategoryResponse.md)
 - [ListsUpdateInterestCategorydefaultResponse](docs/ListsUpdateInterestCategorydefaultResponse.md)
 - [ListsUpdateMember200Response](docs/ListsUpdateMember200Response.md)
 - [ListsUpdateMemberRequest](docs/ListsUpdateMemberRequest.md)
 - [ListsUpdateMemberResponse](docs/ListsUpdateMemberResponse.md)
 - [ListsUpdateMemberdefaultResponse](docs/ListsUpdateMemberdefaultResponse.md)
 - [ListsUpdateMergeField200Response](docs/ListsUpdateMergeField200Response.md)
 - [ListsUpdateMergeFieldRequest](docs/ListsUpdateMergeFieldRequest.md)
 - [ListsUpdateMergeFieldResponse](docs/ListsUpdateMergeFieldResponse.md)
 - [ListsUpdateMergeFielddefaultResponse](docs/ListsUpdateMergeFielddefaultResponse.md)
 - [ListsUpdateNoteSpecificListMember200Response](docs/ListsUpdateNoteSpecificListMember200Response.md)
 - [ListsUpdateNoteSpecificListMemberResponse](docs/ListsUpdateNoteSpecificListMemberResponse.md)
 - [ListsUpdateNoteSpecificListMemberdefaultResponse](docs/ListsUpdateNoteSpecificListMemberdefaultResponse.md)
 - [ListsUpdateSegmentById200Response](docs/ListsUpdateSegmentById200Response.md)
 - [ListsUpdateSegmentByIdRequest](docs/ListsUpdateSegmentByIdRequest.md)
 - [ListsUpdateSegmentByIdResponse](docs/ListsUpdateSegmentByIdResponse.md)
 - [ListsUpdateSegmentByIddefaultResponse](docs/ListsUpdateSegmentByIddefaultResponse.md)
 - [ListsUpdateSettings200Response](docs/ListsUpdateSettings200Response.md)
 - [ListsUpdateSettingsRequest](docs/ListsUpdateSettingsRequest.md)
 - [ListsUpdateSettingsResponse](docs/ListsUpdateSettingsResponse.md)
 - [ListsUpdateSettingsdefaultResponse](docs/ListsUpdateSettingsdefaultResponse.md)
 - [ListsUpdateWebhookSettings200Response](docs/ListsUpdateWebhookSettings200Response.md)
 - [ListsUpdateWebhookSettingsResponse](docs/ListsUpdateWebhookSettingsResponse.md)
 - [ListsUpdateWebhookSettingsdefaultResponse](docs/ListsUpdateWebhookSettingsdefaultResponse.md)
 - [ListsViewRecentActivity200Response](docs/ListsViewRecentActivity200Response.md)
 - [ListsViewRecentActivityEvents200Response](docs/ListsViewRecentActivityEvents200Response.md)
 - [ListsViewRecentActivityEventsResponse](docs/ListsViewRecentActivityEventsResponse.md)
 - [ListsViewRecentActivityEventsdefaultResponse](docs/ListsViewRecentActivityEventsdefaultResponse.md)
 - [ListsViewRecentActivityResponse](docs/ListsViewRecentActivityResponse.md)
 - [ListsViewRecentActivitydefaultResponse](docs/ListsViewRecentActivitydefaultResponse.md)
 - [Location](docs/Location.md)
 - [Location1](docs/Location1.md)
 - [LocationProperty](docs/LocationProperty.md)
 - [LocationProperty1](docs/LocationProperty1.md)
 - [LocationProperty2](docs/LocationProperty2.md)
 - [MarketingPermission](docs/MarketingPermission.md)
 - [MarketingPermission1](docs/MarketingPermission1.md)
 - [MemberActivity](docs/MemberActivity.md)
 - [MemberActivity1](docs/MemberActivity1.md)
 - [MemberActivity2](docs/MemberActivity2.md)
 - [MemberNotes](docs/MemberNotes.md)
 - [MemberTag](docs/MemberTag.md)
 - [MergeField](docs/MergeField.md)
 - [MergeField1](docs/MergeField1.md)
 - [MergeFieldOptionsProperty](docs/MergeFieldOptionsProperty.md)
 - [MergeFieldOptionsProperty1](docs/MergeFieldOptionsProperty1.md)
 - [MergeFieldOptionsProperty2](docs/MergeFieldOptionsProperty2.md)
 - [MergeFieldOptionsProperty3](docs/MergeFieldOptionsProperty3.md)
 - [MergeFieldOptionsProperty4](docs/MergeFieldOptionsProperty4.md)
 - [MergeFieldOptionsProperty5](docs/MergeFieldOptionsProperty5.md)
 - [MergeFieldOptionsProperty6](docs/MergeFieldOptionsProperty6.md)
 - [MergeFieldOptionsProperty7](docs/MergeFieldOptionsProperty7.md)
 - [MergeFieldOptionsProperty8](docs/MergeFieldOptionsProperty8.md)
 - [MergeFieldOptionsProperty9](docs/MergeFieldOptionsProperty9.md)
 - [MergeFieldProperty](docs/MergeFieldProperty.md)
 - [NotesProperty](docs/NotesProperty.md)
 - [OpenActivity](docs/OpenActivity.md)
 - [OpensProperty](docs/OpensProperty.md)
 - [Operations](docs/Operations.md)
 - [OptionsPropertyInner](docs/OptionsPropertyInner.md)
 - [OutreachProperty](docs/OutreachProperty.md)
 - [OutreachProperty1](docs/OutreachProperty1.md)
 - [OutreachProperty10](docs/OutreachProperty10.md)
 - [OutreachProperty11](docs/OutreachProperty11.md)
 - [OutreachProperty2](docs/OutreachProperty2.md)
 - [OutreachProperty3](docs/OutreachProperty3.md)
 - [OutreachProperty4](docs/OutreachProperty4.md)
 - [OutreachProperty5](docs/OutreachProperty5.md)
 - [OutreachProperty6](docs/OutreachProperty6.md)
 - [OutreachProperty7](docs/OutreachProperty7.md)
 - [OutreachProperty8](docs/OutreachProperty8.md)
 - [OutreachProperty9](docs/OutreachProperty9.md)
 - [PartialMatchesProperty](docs/PartialMatchesProperty.md)
 - [PartialMatchesProperty1](docs/PartialMatchesProperty1.md)
 - [PingHealthCheck200Response](docs/PingHealthCheck200Response.md)
 - [PingHealthCheckResponse](docs/PingHealthCheckResponse.md)
 - [PingHealthCheckdefaultResponse](docs/PingHealthCheckdefaultResponse.md)
 - [PromosPropertyInner](docs/PromosPropertyInner.md)
 - [PromosPropertyInner1](docs/PromosPropertyInner1.md)
 - [RSSOptionsProperty](docs/RSSOptionsProperty.md)
 - [RSSOptionsProperty1](docs/RSSOptionsProperty1.md)
 - [RSSOptionsProperty2](docs/RSSOptionsProperty2.md)
 - [RSSOptionsProperty3](docs/RSSOptionsProperty3.md)
 - [Recipients](docs/Recipients.md)
 - [Recipients1](docs/Recipients1.md)
 - [Recipients2](docs/Recipients2.md)
 - [Recipients3](docs/Recipients3.md)
 - [RecipientsProperty](docs/RecipientsProperty.md)
 - [RecipientsProperty1](docs/RecipientsProperty1.md)
 - [RecipientsProperty2](docs/RecipientsProperty2.md)
 - [RecipientsProperty3](docs/RecipientsProperty3.md)
 - [Referrer](docs/Referrer.md)
 - [ReportSummary](docs/ReportSummary.md)
 - [ReportSummaryEcommerce](docs/ReportSummaryEcommerce.md)
 - [ReportSummaryProperty](docs/ReportSummaryProperty.md)
 - [ReportSummaryPropertyEcommerce](docs/ReportSummaryPropertyEcommerce.md)
 - [ReportingFacebookAdReport200Response](docs/ReportingFacebookAdReport200Response.md)
 - [ReportingFacebookAdReport200ResponseAllOf](docs/ReportingFacebookAdReport200ResponseAllOf.md)
 - [ReportingFacebookAdReport200ResponseAllOf1](docs/ReportingFacebookAdReport200ResponseAllOf1.md)
 - [ReportingFacebookAdReport200ResponseAllOf1Budget](docs/ReportingFacebookAdReport200ResponseAllOf1Budget.md)
 - [ReportingFacebookAdReport200ResponseAllOf1Channel](docs/ReportingFacebookAdReport200ResponseAllOf1Channel.md)
 - [ReportingFacebookAdReportResponse](docs/ReportingFacebookAdReportResponse.md)
 - [ReportingFacebookAdReportResponseAllOf](docs/ReportingFacebookAdReportResponseAllOf.md)
 - [ReportingFacebookAdReportResponseAllOf1](docs/ReportingFacebookAdReportResponseAllOf1.md)
 - [ReportingFacebookAdReportResponseAllOf1AudienceActivity](docs/ReportingFacebookAdReportResponseAllOf1AudienceActivity.md)
 - [ReportingFacebookAdReportResponseAllOf1AudienceActivityClicks](docs/ReportingFacebookAdReportResponseAllOf1AudienceActivityClicks.md)
 - [ReportingFacebookAdReportResponseAllOf1AudienceActivityImpressions](docs/ReportingFacebookAdReportResponseAllOf1AudienceActivityImpressions.md)
 - [ReportingFacebookAdReportResponseAllOf1AudienceActivityRevenue](docs/ReportingFacebookAdReportResponseAllOf1AudienceActivityRevenue.md)
 - [ReportingFacebookAdReportResponseAllOf1Budget](docs/ReportingFacebookAdReportResponseAllOf1Budget.md)
 - [ReportingFacebookAdReportResponseAllOf1Channel](docs/ReportingFacebookAdReportResponseAllOf1Channel.md)
 - [ReportingFacebookAdReportResponseAllOf1ReportSummary](docs/ReportingFacebookAdReportResponseAllOf1ReportSummary.md)
 - [ReportingFacebookAdReportResponseAllOf1ReportSummaryAverageOrderAmount](docs/ReportingFacebookAdReportResponseAllOf1ReportSummaryAverageOrderAmount.md)
 - [ReportingFacebookAdReportResponseAllOf1ReportSummaryEcommerce](docs/ReportingFacebookAdReportResponseAllOf1ReportSummaryEcommerce.md)
 - [ReportingFacebookAdReportResponseAllOf1ReportSummaryExtendedAt](docs/ReportingFacebookAdReportResponseAllOf1ReportSummaryExtendedAt.md)
 - [ReportingFacebookAdReportdefaultResponse](docs/ReportingFacebookAdReportdefaultResponse.md)
 - [ReportingGetLandingPageReport200Response](docs/ReportingGetLandingPageReport200Response.md)
 - [ReportingGetLandingPageReport200ResponseTimeseries](docs/ReportingGetLandingPageReport200ResponseTimeseries.md)
 - [ReportingGetLandingPageReportResponse](docs/ReportingGetLandingPageReportResponse.md)
 - [ReportingGetLandingPageReportResponseEcommerce](docs/ReportingGetLandingPageReportResponseEcommerce.md)
 - [ReportingGetLandingPageReportResponseTimeseries](docs/ReportingGetLandingPageReportResponseTimeseries.md)
 - [ReportingGetLandingPageReportdefaultResponse](docs/ReportingGetLandingPageReportdefaultResponse.md)
 - [ReportingGetSurveyReport200Response](docs/ReportingGetSurveyReport200Response.md)
 - [ReportingGetSurveyReportResponse](docs/ReportingGetSurveyReportResponse.md)
 - [ReportingGetSurveyReportdefaultResponse](docs/ReportingGetSurveyReportdefaultResponse.md)
 - [ReportingListFacebookAdsReports200Response](docs/ReportingListFacebookAdsReports200Response.md)
 - [ReportingListFacebookAdsReports200ResponseFacebookAdsInner](docs/ReportingListFacebookAdsReports200ResponseFacebookAdsInner.md)
 - [ReportingListFacebookAdsReports200ResponseFacebookAdsInnerAllOf](docs/ReportingListFacebookAdsReports200ResponseFacebookAdsInnerAllOf.md)
 - [ReportingListFacebookAdsReports200ResponseFacebookAdsInnerAllOf1](docs/ReportingListFacebookAdsReports200ResponseFacebookAdsInnerAllOf1.md)
 - [ReportingListFacebookAdsReports200ResponseFacebookAdsInnerAllOf1Budget](docs/ReportingListFacebookAdsReports200ResponseFacebookAdsInnerAllOf1Budget.md)
 - [ReportingListFacebookAdsReports200ResponseFacebookAdsInnerAllOf1Channel](docs/ReportingListFacebookAdsReports200ResponseFacebookAdsInnerAllOf1Channel.md)
 - [ReportingListFacebookAdsReportsResponse](docs/ReportingListFacebookAdsReportsResponse.md)
 - [ReportingListFacebookAdsReportsResponseFacebookAdsInner](docs/ReportingListFacebookAdsReportsResponseFacebookAdsInner.md)
 - [ReportingListFacebookAdsReportsResponseFacebookAdsInnerAllOf](docs/ReportingListFacebookAdsReportsResponseFacebookAdsInnerAllOf.md)
 - [ReportingListFacebookAdsReportsResponseFacebookAdsInnerAllOf1](docs/ReportingListFacebookAdsReportsResponseFacebookAdsInnerAllOf1.md)
 - [ReportingListFacebookAdsReportsResponseFacebookAdsInnerAllOf1AudienceActivity](docs/ReportingListFacebookAdsReportsResponseFacebookAdsInnerAllOf1AudienceActivity.md)
 - [ReportingListFacebookAdsReportsResponseFacebookAdsInnerAllOf1AudienceActivityClicksInner](docs/ReportingListFacebookAdsReportsResponseFacebookAdsInnerAllOf1AudienceActivityClicksInner.md)
 - [ReportingListFacebookAdsReportsResponseFacebookAdsInnerAllOf1AudienceActivityImpressionsInner](docs/ReportingListFacebookAdsReportsResponseFacebookAdsInnerAllOf1AudienceActivityImpressionsInner.md)
 - [ReportingListFacebookAdsReportsResponseFacebookAdsInnerAllOf1AudienceActivityRevenueInner](docs/ReportingListFacebookAdsReportsResponseFacebookAdsInnerAllOf1AudienceActivityRevenueInner.md)
 - [ReportingListFacebookAdsReportsResponseFacebookAdsInnerAllOf1Budget](docs/ReportingListFacebookAdsReportsResponseFacebookAdsInnerAllOf1Budget.md)
 - [ReportingListFacebookAdsReportsResponseFacebookAdsInnerAllOf1Channel](docs/ReportingListFacebookAdsReportsResponseFacebookAdsInnerAllOf1Channel.md)
 - [ReportingListFacebookAdsReportsResponseFacebookAdsInnerAllOf1ReportSummary](docs/ReportingListFacebookAdsReportsResponseFacebookAdsInnerAllOf1ReportSummary.md)
 - [ReportingListFacebookAdsReportsResponseFacebookAdsInnerAllOf1ReportSummaryAverageOrderAmount](docs/ReportingListFacebookAdsReportsResponseFacebookAdsInnerAllOf1ReportSummaryAverageOrderAmount.md)
 - [ReportingListFacebookAdsReportsResponseFacebookAdsInnerAllOf1ReportSummaryEcommerce](docs/ReportingListFacebookAdsReportsResponseFacebookAdsInnerAllOf1ReportSummaryEcommerce.md)
 - [ReportingListFacebookAdsReportsResponseFacebookAdsInnerAllOf1ReportSummaryExtendedAt](docs/ReportingListFacebookAdsReportsResponseFacebookAdsInnerAllOf1ReportSummaryExtendedAt.md)
 - [ReportingListFacebookAdsReportsdefaultResponse](docs/ReportingListFacebookAdsReportsdefaultResponse.md)
 - [ReportingListFacebookEcommerceReport200Response](docs/ReportingListFacebookEcommerceReport200Response.md)
 - [ReportingListFacebookEcommerceReportResponse](docs/ReportingListFacebookEcommerceReportResponse.md)
 - [ReportingListFacebookEcommerceReportdefaultResponse](docs/ReportingListFacebookEcommerceReportdefaultResponse.md)
 - [ReportingListLandingPagesReports200Response](docs/ReportingListLandingPagesReports200Response.md)
 - [ReportingListLandingPagesReportsResponse](docs/ReportingListLandingPagesReportsResponse.md)
 - [ReportingListLandingPagesReportsdefaultResponse](docs/ReportingListLandingPagesReportsdefaultResponse.md)
 - [ReportingListSurveyQuestionsReports200Response](docs/ReportingListSurveyQuestionsReports200Response.md)
 - [ReportingListSurveyQuestionsReportsResponse](docs/ReportingListSurveyQuestionsReportsResponse.md)
 - [ReportingListSurveyQuestionsReportsdefaultResponse](docs/ReportingListSurveyQuestionsReportsdefaultResponse.md)
 - [ReportingListSurveyReports200Response](docs/ReportingListSurveyReports200Response.md)
 - [ReportingListSurveyReportsResponse](docs/ReportingListSurveyReportsResponse.md)
 - [ReportingListSurveyReportsdefaultResponse](docs/ReportingListSurveyReportsdefaultResponse.md)
 - [ReportingSingleSurveyResponse200Response](docs/ReportingSingleSurveyResponse200Response.md)
 - [ReportingSingleSurveyResponseResponse](docs/ReportingSingleSurveyResponseResponse.md)
 - [ReportingSingleSurveyResponsedefaultResponse](docs/ReportingSingleSurveyResponsedefaultResponse.md)
 - [ReportingSurveyQuestionAnswersList200Response](docs/ReportingSurveyQuestionAnswersList200Response.md)
 - [ReportingSurveyQuestionAnswersListResponse](docs/ReportingSurveyQuestionAnswersListResponse.md)
 - [ReportingSurveyQuestionAnswersListdefaultResponse](docs/ReportingSurveyQuestionAnswersListdefaultResponse.md)
 - [ReportingSurveyQuestionReport200Response](docs/ReportingSurveyQuestionReport200Response.md)
 - [ReportingSurveyQuestionReportResponse](docs/ReportingSurveyQuestionReportResponse.md)
 - [ReportingSurveyQuestionReportdefaultResponse](docs/ReportingSurveyQuestionReportdefaultResponse.md)
 - [ReportingSurveyResponsesList200Response](docs/ReportingSurveyResponsesList200Response.md)
 - [ReportingSurveyResponsesListResponse](docs/ReportingSurveyResponsesListResponse.md)
 - [ReportingSurveyResponsesListdefaultResponse](docs/ReportingSurveyResponsesListdefaultResponse.md)
 - [ReportsCampaignRecipientInfo200Response](docs/ReportsCampaignRecipientInfo200Response.md)
 - [ReportsCampaignRecipientInfoResponse](docs/ReportsCampaignRecipientInfoResponse.md)
 - [ReportsCampaignRecipientInfodefaultResponse](docs/ReportsCampaignRecipientInfodefaultResponse.md)
 - [ReportsGetAbuseReport200Response](docs/ReportsGetAbuseReport200Response.md)
 - [ReportsGetAbuseReportResponse](docs/ReportsGetAbuseReportResponse.md)
 - [ReportsGetAbuseReportdefaultResponse](docs/ReportsGetAbuseReportdefaultResponse.md)
 - [ReportsGetCampaignClickDetails200Response](docs/ReportsGetCampaignClickDetails200Response.md)
 - [ReportsGetCampaignClickDetailsResponse](docs/ReportsGetCampaignClickDetailsResponse.md)
 - [ReportsGetCampaignClickDetailsdefaultResponse](docs/ReportsGetCampaignClickDetailsdefaultResponse.md)
 - [ReportsGetCampaignProductActivity200Response](docs/ReportsGetCampaignProductActivity200Response.md)
 - [ReportsGetCampaignProductActivityResponse](docs/ReportsGetCampaignProductActivityResponse.md)
 - [ReportsGetCampaignProductActivityResponseProductsInner](docs/ReportsGetCampaignProductActivityResponseProductsInner.md)
 - [ReportsGetCampaignProductActivitydefaultResponse](docs/ReportsGetCampaignProductActivitydefaultResponse.md)
 - [ReportsGetSubscriberActivity200Response](docs/ReportsGetSubscriberActivity200Response.md)
 - [ReportsGetSubscriberActivityResponse](docs/ReportsGetSubscriberActivityResponse.md)
 - [ReportsGetSubscriberActivitydefaultResponse](docs/ReportsGetSubscriberActivitydefaultResponse.md)
 - [ReportsGetUnsubscribedMemberInfo200Response](docs/ReportsGetUnsubscribedMemberInfo200Response.md)
 - [ReportsGetUnsubscribedMemberInfoResponse](docs/ReportsGetUnsubscribedMemberInfoResponse.md)
 - [ReportsGetUnsubscribedMemberInfodefaultResponse](docs/ReportsGetUnsubscribedMemberInfodefaultResponse.md)
 - [ReportsListAbuseReports200Response](docs/ReportsListAbuseReports200Response.md)
 - [ReportsListAbuseReportsResponse](docs/ReportsListAbuseReportsResponse.md)
 - [ReportsListAbuseReportsdefaultResponse](docs/ReportsListAbuseReportsdefaultResponse.md)
 - [ReportsListCampaignFeedback200Response](docs/ReportsListCampaignFeedback200Response.md)
 - [ReportsListCampaignFeedbackResponse](docs/ReportsListCampaignFeedbackResponse.md)
 - [ReportsListCampaignFeedbackdefaultResponse](docs/ReportsListCampaignFeedbackdefaultResponse.md)
 - [ReportsListCampaignOpenDetails200Response](docs/ReportsListCampaignOpenDetails200Response.md)
 - [ReportsListCampaignOpenDetailsResponse](docs/ReportsListCampaignOpenDetailsResponse.md)
 - [ReportsListCampaignOpenDetailsdefaultResponse](docs/ReportsListCampaignOpenDetailsdefaultResponse.md)
 - [ReportsListCampaignRecipients200Response](docs/ReportsListCampaignRecipients200Response.md)
 - [ReportsListCampaignRecipientsResponse](docs/ReportsListCampaignRecipientsResponse.md)
 - [ReportsListCampaignRecipientsdefaultResponse](docs/ReportsListCampaignRecipientsdefaultResponse.md)
 - [ReportsListCampaignReports200Response](docs/ReportsListCampaignReports200Response.md)
 - [ReportsListCampaignReportsResponse](docs/ReportsListCampaignReportsResponse.md)
 - [ReportsListCampaignReportsdefaultResponse](docs/ReportsListCampaignReportsdefaultResponse.md)
 - [ReportsListChildCampaignReports200Response](docs/ReportsListChildCampaignReports200Response.md)
 - [ReportsListChildCampaignReportsResponse](docs/ReportsListChildCampaignReportsResponse.md)
 - [ReportsListChildCampaignReportsdefaultResponse](docs/ReportsListChildCampaignReportsdefaultResponse.md)
 - [ReportsListClickedLinkSubscribers200Response](docs/ReportsListClickedLinkSubscribers200Response.md)
 - [ReportsListClickedLinkSubscribersResponse](docs/ReportsListClickedLinkSubscribersResponse.md)
 - [ReportsListClickedLinkSubscribersdefaultResponse](docs/ReportsListClickedLinkSubscribersdefaultResponse.md)
 - [ReportsListDomainPerformanceStats200Response](docs/ReportsListDomainPerformanceStats200Response.md)
 - [ReportsListDomainPerformanceStatsResponse](docs/ReportsListDomainPerformanceStatsResponse.md)
 - [ReportsListDomainPerformanceStatsdefaultResponse](docs/ReportsListDomainPerformanceStatsdefaultResponse.md)
 - [ReportsListEepurlActivity200Response](docs/ReportsListEepurlActivity200Response.md)
 - [ReportsListEepurlActivityResponse](docs/ReportsListEepurlActivityResponse.md)
 - [ReportsListEepurlActivitydefaultResponse](docs/ReportsListEepurlActivitydefaultResponse.md)
 - [ReportsListEmailActivity200Response](docs/ReportsListEmailActivity200Response.md)
 - [ReportsListEmailActivityResponse](docs/ReportsListEmailActivityResponse.md)
 - [ReportsListEmailActivitydefaultResponse](docs/ReportsListEmailActivitydefaultResponse.md)
 - [ReportsListTopOpenLocations200Response](docs/ReportsListTopOpenLocations200Response.md)
 - [ReportsListTopOpenLocationsResponse](docs/ReportsListTopOpenLocationsResponse.md)
 - [ReportsListTopOpenLocationsdefaultResponse](docs/ReportsListTopOpenLocationsdefaultResponse.md)
 - [ReportsListUnsubscribedMembers200Response](docs/ReportsListUnsubscribedMembers200Response.md)
 - [ReportsListUnsubscribedMembersResponse](docs/ReportsListUnsubscribedMembersResponse.md)
 - [ReportsListUnsubscribedMembersdefaultResponse](docs/ReportsListUnsubscribedMembersdefaultResponse.md)
 - [ReportsOpenSubscriberDetails200Response](docs/ReportsOpenSubscriberDetails200Response.md)
 - [ReportsOpenSubscriberDetailsResponse](docs/ReportsOpenSubscriberDetailsResponse.md)
 - [ReportsOpenSubscriberDetailsdefaultResponse](docs/ReportsOpenSubscriberDetailsdefaultResponse.md)
 - [ReportsSpecificCampaignReport200Response](docs/ReportsSpecificCampaignReport200Response.md)
 - [ReportsSpecificCampaignReportResponse](docs/ReportsSpecificCampaignReportResponse.md)
 - [ReportsSpecificCampaignReportdefaultResponse](docs/ReportsSpecificCampaignReportdefaultResponse.md)
 - [ReportsSpecificLinkDetails200Response](docs/ReportsSpecificLinkDetails200Response.md)
 - [ReportsSpecificLinkDetailsResponse](docs/ReportsSpecificLinkDetailsResponse.md)
 - [ReportsSpecificLinkDetailsdefaultResponse](docs/ReportsSpecificLinkDetailsdefaultResponse.md)
 - [ReportsSpecificLinkSubscriber200Response](docs/ReportsSpecificLinkSubscriber200Response.md)
 - [ReportsSpecificLinkSubscriberResponse](docs/ReportsSpecificLinkSubscriberResponse.md)
 - [ReportsSpecificLinkSubscriberdefaultResponse](docs/ReportsSpecificLinkSubscriberdefaultResponse.md)
 - [ResendShortcutEligibilityProperty](docs/ResendShortcutEligibilityProperty.md)
 - [ResourceLink](docs/ResourceLink.md)
 - [ResourceLink1](docs/ResourceLink1.md)
 - [Response](docs/Response.md)
 - [ResultsPropertyInner](docs/ResultsPropertyInner.md)
 - [ResultsPropertyInner1](docs/ResultsPropertyInner1.md)
 - [RootListResources200Response](docs/RootListResources200Response.md)
 - [RootListResourcesResponse](docs/RootListResourcesResponse.md)
 - [RootListResourcesdefaultResponse](docs/RootListResourcesdefaultResponse.md)
 - [SalesforceCRMTrackingProperty](docs/SalesforceCRMTrackingProperty.md)
 - [SalesforceCRMTrackingProperty1](docs/SalesforceCRMTrackingProperty1.md)
 - [ScriptProperty](docs/ScriptProperty.md)
 - [ScriptProperty1](docs/ScriptProperty1.md)
 - [ScriptProperty10](docs/ScriptProperty10.md)
 - [ScriptProperty11](docs/ScriptProperty11.md)
 - [ScriptProperty12](docs/ScriptProperty12.md)
 - [ScriptProperty13](docs/ScriptProperty13.md)
 - [ScriptProperty2](docs/ScriptProperty2.md)
 - [ScriptProperty3](docs/ScriptProperty3.md)
 - [ScriptProperty4](docs/ScriptProperty4.md)
 - [ScriptProperty5](docs/ScriptProperty5.md)
 - [ScriptProperty6](docs/ScriptProperty6.md)
 - [ScriptProperty7](docs/ScriptProperty7.md)
 - [ScriptProperty8](docs/ScriptProperty8.md)
 - [ScriptProperty9](docs/ScriptProperty9.md)
 - [SearchCampaignsByQueryTerms200Response](docs/SearchCampaignsByQueryTerms200Response.md)
 - [SearchCampaignsByQueryTermsResponse](docs/SearchCampaignsByQueryTermsResponse.md)
 - [SearchCampaignsByQueryTermsdefaultResponse](docs/SearchCampaignsByQueryTermsdefaultResponse.md)
 - [SearchMembersListMembers200Response](docs/SearchMembersListMembers200Response.md)
 - [SearchMembersListMembersResponse](docs/SearchMembersListMembersResponse.md)
 - [SearchMembersListMembersdefaultResponse](docs/SearchMembersListMembersdefaultResponse.md)
 - [SegmentOptions](docs/SegmentOptions.md)
 - [SegmentOptions1](docs/SegmentOptions1.md)
 - [SegmentOptions2](docs/SegmentOptions2.md)
 - [SegmentOptions3](docs/SegmentOptions3.md)
 - [SegmentOptionsProperty](docs/SegmentOptionsProperty.md)
 - [SegmentOptionsProperty1](docs/SegmentOptionsProperty1.md)
 - [SegmentOptionsProperty10](docs/SegmentOptionsProperty10.md)
 - [SegmentOptionsProperty11](docs/SegmentOptionsProperty11.md)
 - [SegmentOptionsProperty12](docs/SegmentOptionsProperty12.md)
 - [SegmentOptionsProperty13](docs/SegmentOptionsProperty13.md)
 - [SegmentOptionsProperty14](docs/SegmentOptionsProperty14.md)
 - [SegmentOptionsProperty15](docs/SegmentOptionsProperty15.md)
 - [SegmentOptionsProperty16](docs/SegmentOptionsProperty16.md)
 - [SegmentOptionsProperty17](docs/SegmentOptionsProperty17.md)
 - [SegmentOptionsProperty18](docs/SegmentOptionsProperty18.md)
 - [SegmentOptionsProperty19](docs/SegmentOptionsProperty19.md)
 - [SegmentOptionsProperty2](docs/SegmentOptionsProperty2.md)
 - [SegmentOptionsProperty20](docs/SegmentOptionsProperty20.md)
 - [SegmentOptionsProperty21](docs/SegmentOptionsProperty21.md)
 - [SegmentOptionsProperty22](docs/SegmentOptionsProperty22.md)
 - [SegmentOptionsProperty23](docs/SegmentOptionsProperty23.md)
 - [SegmentOptionsProperty24](docs/SegmentOptionsProperty24.md)
 - [SegmentOptionsProperty25](docs/SegmentOptionsProperty25.md)
 - [SegmentOptionsProperty26](docs/SegmentOptionsProperty26.md)
 - [SegmentOptionsProperty27](docs/SegmentOptionsProperty27.md)
 - [SegmentOptionsProperty28](docs/SegmentOptionsProperty28.md)
 - [SegmentOptionsProperty3](docs/SegmentOptionsProperty3.md)
 - [SegmentOptionsProperty4](docs/SegmentOptionsProperty4.md)
 - [SegmentOptionsProperty5](docs/SegmentOptionsProperty5.md)
 - [SegmentOptionsProperty6](docs/SegmentOptionsProperty6.md)
 - [SegmentOptionsProperty7](docs/SegmentOptionsProperty7.md)
 - [SegmentOptionsProperty8](docs/SegmentOptionsProperty8.md)
 - [SegmentOptionsProperty9](docs/SegmentOptionsProperty9.md)
 - [SendingScheduleProperty](docs/SendingScheduleProperty.md)
 - [SendingScheduleProperty1](docs/SendingScheduleProperty1.md)
 - [SentTo](docs/SentTo.md)
 - [ShareReportProperty](docs/ShareReportProperty.md)
 - [ShippingAddressProperty](docs/ShippingAddressProperty.md)
 - [ShippingAddressProperty1](docs/ShippingAddressProperty1.md)
 - [ShippingAddressProperty10](docs/ShippingAddressProperty10.md)
 - [ShippingAddressProperty11](docs/ShippingAddressProperty11.md)
 - [ShippingAddressProperty2](docs/ShippingAddressProperty2.md)
 - [ShippingAddressProperty3](docs/ShippingAddressProperty3.md)
 - [ShippingAddressProperty4](docs/ShippingAddressProperty4.md)
 - [ShippingAddressProperty5](docs/ShippingAddressProperty5.md)
 - [ShippingAddressProperty6](docs/ShippingAddressProperty6.md)
 - [ShippingAddressProperty7](docs/ShippingAddressProperty7.md)
 - [ShippingAddressProperty8](docs/ShippingAddressProperty8.md)
 - [ShippingAddressProperty9](docs/ShippingAddressProperty9.md)
 - [SignupForm](docs/SignupForm.md)
 - [SignupForm1](docs/SignupForm1.md)
 - [SignupFormHeaderOptionsProperty](docs/SignupFormHeaderOptionsProperty.md)
 - [SignupFormHeaderOptionsProperty1](docs/SignupFormHeaderOptionsProperty1.md)
 - [SignupFormHeaderOptionsProperty2](docs/SignupFormHeaderOptionsProperty2.md)
 - [SignupFormHeaderOptionsProperty3](docs/SignupFormHeaderOptionsProperty3.md)
 - [SignupFormHeaderOptionsProperty4](docs/SignupFormHeaderOptionsProperty4.md)
 - [SourcesProperty](docs/SourcesProperty.md)
 - [SourcesProperty1](docs/SourcesProperty1.md)
 - [SourcesProperty2](docs/SourcesProperty2.md)
 - [SourcesProperty3](docs/SourcesProperty3.md)
 - [SourcesProperty4](docs/SourcesProperty4.md)
 - [SourcesProperty5](docs/SourcesProperty5.md)
 - [SourcesProperty6](docs/SourcesProperty6.md)
 - [SourcesProperty7](docs/SourcesProperty7.md)
 - [SourcesProperty8](docs/SourcesProperty8.md)
 - [StatisticsProperty](docs/StatisticsProperty.md)
 - [SubscriberInAutomationQueue](docs/SubscriberInAutomationQueue.md)
 - [SubscriberList](docs/SubscriberList.md)
 - [SubscriberList1](docs/SubscriberList1.md)
 - [SubscriberRemovedFromAutomationWorkflow](docs/SubscriberRemovedFromAutomationWorkflow.md)
 - [SubscriberStatsProperty](docs/SubscriberStatsProperty.md)
 - [SubscriberStatsProperty1](docs/SubscriberStatsProperty1.md)
 - [SubscriberStatsProperty10](docs/SubscriberStatsProperty10.md)
 - [SubscriberStatsProperty11](docs/SubscriberStatsProperty11.md)
 - [SubscriberStatsProperty12](docs/SubscriberStatsProperty12.md)
 - [SubscriberStatsProperty13](docs/SubscriberStatsProperty13.md)
 - [SubscriberStatsProperty14](docs/SubscriberStatsProperty14.md)
 - [SubscriberStatsProperty2](docs/SubscriberStatsProperty2.md)
 - [SubscriberStatsProperty3](docs/SubscriberStatsProperty3.md)
 - [SubscriberStatsProperty4](docs/SubscriberStatsProperty4.md)
 - [SubscriberStatsProperty5](docs/SubscriberStatsProperty5.md)
 - [SubscriberStatsProperty6](docs/SubscriberStatsProperty6.md)
 - [SubscriberStatsProperty7](docs/SubscriberStatsProperty7.md)
 - [SubscriberStatsProperty8](docs/SubscriberStatsProperty8.md)
 - [SubscriberStatsProperty9](docs/SubscriberStatsProperty9.md)
 - [SurveyQuestionAnswer](docs/SurveyQuestionAnswer.md)
 - [SurveyQuestionReport](docs/SurveyQuestionReport.md)
 - [SurveyQuestionReport1](docs/SurveyQuestionReport1.md)
 - [SurveyReport](docs/SurveyReport.md)
 - [SurveyReport1](docs/SurveyReport1.md)
 - [SurveyRespondents](docs/SurveyRespondents.md)
 - [SurveysGenerateCampaign200Response](docs/SurveysGenerateCampaign200Response.md)
 - [SurveysGenerateCampaignResponse](docs/SurveysGenerateCampaignResponse.md)
 - [SurveysGenerateCampaigndefaultResponse](docs/SurveysGenerateCampaigndefaultResponse.md)
 - [SurveysPublishSurveyActionResponse](docs/SurveysPublishSurveyActionResponse.md)
 - [SurveysPublishSurveyActiondefaultResponse](docs/SurveysPublishSurveyActiondefaultResponse.md)
 - [SurveysUnpublishSurveyActionResponse](docs/SurveysUnpublishSurveyActionResponse.md)
 - [SurveysUnpublishSurveyActiondefaultResponse](docs/SurveysUnpublishSurveyActiondefaultResponse.md)
 - [Tag](docs/Tag.md)
 - [TagsPropertyInner](docs/TagsPropertyInner.md)
 - [TagsPropertyInner1](docs/TagsPropertyInner1.md)
 - [TagsPropertyInner2](docs/TagsPropertyInner2.md)
 - [TemplateContentProperty](docs/TemplateContentProperty.md)
 - [TemplateContentProperty1](docs/TemplateContentProperty1.md)
 - [TemplateFolder](docs/TemplateFolder.md)
 - [TemplateFoldersAddNewFolder200Response](docs/TemplateFoldersAddNewFolder200Response.md)
 - [TemplateFoldersAddNewFolderRequest](docs/TemplateFoldersAddNewFolderRequest.md)
 - [TemplateFoldersAddNewFolderResponse](docs/TemplateFoldersAddNewFolderResponse.md)
 - [TemplateFoldersAddNewFolderdefaultResponse](docs/TemplateFoldersAddNewFolderdefaultResponse.md)
 - [TemplateFoldersDeleteSpecificFolderResponse](docs/TemplateFoldersDeleteSpecificFolderResponse.md)
 - [TemplateFoldersDeleteSpecificFolderdefaultResponse](docs/TemplateFoldersDeleteSpecificFolderdefaultResponse.md)
 - [TemplateFoldersGetInfo200Response](docs/TemplateFoldersGetInfo200Response.md)
 - [TemplateFoldersGetInfoResponse](docs/TemplateFoldersGetInfoResponse.md)
 - [TemplateFoldersGetInfodefaultResponse](docs/TemplateFoldersGetInfodefaultResponse.md)
 - [TemplateFoldersListFolders200Response](docs/TemplateFoldersListFolders200Response.md)
 - [TemplateFoldersListFoldersResponse](docs/TemplateFoldersListFoldersResponse.md)
 - [TemplateFoldersListFoldersdefaultResponse](docs/TemplateFoldersListFoldersdefaultResponse.md)
 - [TemplateFoldersUpdateSpecificFolder200Response](docs/TemplateFoldersUpdateSpecificFolder200Response.md)
 - [TemplateFoldersUpdateSpecificFolderResponse](docs/TemplateFoldersUpdateSpecificFolderResponse.md)
 - [TemplateFoldersUpdateSpecificFolderdefaultResponse](docs/TemplateFoldersUpdateSpecificFolderdefaultResponse.md)
 - [TemplateInstance](docs/TemplateInstance.md)
 - [TemplatesCreateNewTemplate200Response](docs/TemplatesCreateNewTemplate200Response.md)
 - [TemplatesCreateNewTemplateRequest](docs/TemplatesCreateNewTemplateRequest.md)
 - [TemplatesCreateNewTemplateResponse](docs/TemplatesCreateNewTemplateResponse.md)
 - [TemplatesCreateNewTemplatedefaultResponse](docs/TemplatesCreateNewTemplatedefaultResponse.md)
 - [TemplatesDeleteSpecificTemplateResponse](docs/TemplatesDeleteSpecificTemplateResponse.md)
 - [TemplatesDeleteSpecificTemplatedefaultResponse](docs/TemplatesDeleteSpecificTemplatedefaultResponse.md)
 - [TemplatesGetInfo200Response](docs/TemplatesGetInfo200Response.md)
 - [TemplatesGetInfoResponse](docs/TemplatesGetInfoResponse.md)
 - [TemplatesGetInfodefaultResponse](docs/TemplatesGetInfodefaultResponse.md)
 - [TemplatesListAvailableTemplates200Response](docs/TemplatesListAvailableTemplates200Response.md)
 - [TemplatesListAvailableTemplatesResponse](docs/TemplatesListAvailableTemplatesResponse.md)
 - [TemplatesListAvailableTemplatesdefaultResponse](docs/TemplatesListAvailableTemplatesdefaultResponse.md)
 - [TemplatesUpdateTemplateById200Response](docs/TemplatesUpdateTemplateById200Response.md)
 - [TemplatesUpdateTemplateByIdResponse](docs/TemplatesUpdateTemplateByIdResponse.md)
 - [TemplatesUpdateTemplateByIddefaultResponse](docs/TemplatesUpdateTemplateByIddefaultResponse.md)
 - [TemplatesViewDefaultContent200Response](docs/TemplatesViewDefaultContent200Response.md)
 - [TemplatesViewDefaultContentResponse](docs/TemplatesViewDefaultContentResponse.md)
 - [TemplatesViewDefaultContentdefaultResponse](docs/TemplatesViewDefaultContentdefaultResponse.md)
 - [TimeseriesPropertyInner](docs/TimeseriesPropertyInner.md)
 - [TimewarpStatsPropertyInner](docs/TimewarpStatsPropertyInner.md)
 - [ToNewSubscribersProperty](docs/ToNewSubscribersProperty.md)
 - [ToNonClickersProperty](docs/ToNonClickersProperty.md)
 - [ToNonOpenersProperty](docs/ToNonOpenersProperty.md)
 - [TrackingSettingsProperty](docs/TrackingSettingsProperty.md)
 - [TwitterStatsProperty](docs/TwitterStatsProperty.md)
 - [TwitterStatus](docs/TwitterStatus.md)
 - [UniqueVisitsPropertyInner](docs/UniqueVisitsPropertyInner.md)
 - [UniqueVisitsPropertyInner1](docs/UniqueVisitsPropertyInner1.md)
 - [UniqueVisitsPropertyInner2](docs/UniqueVisitsPropertyInner2.md)
 - [UniqueVisitsPropertyInner3](docs/UniqueVisitsPropertyInner3.md)
 - [UniqueVisitsPropertyInner4](docs/UniqueVisitsPropertyInner4.md)
 - [UniqueVisitsPropertyInner5](docs/UniqueVisitsPropertyInner5.md)
 - [UniqueVisitsPropertyInner6](docs/UniqueVisitsPropertyInner6.md)
 - [UniqueVisitsPropertyInner7](docs/UniqueVisitsPropertyInner7.md)
 - [Unsubscribes](docs/Unsubscribes.md)
 - [UploadArchiveProperty](docs/UploadArchiveProperty.md)
 - [VariateContentsPropertyInner](docs/VariateContentsPropertyInner.md)
 - [VariateContentsPropertyInner1](docs/VariateContentsPropertyInner1.md)
 - [VariateContentsPropertyInner2](docs/VariateContentsPropertyInner2.md)
 - [VariateContentsPropertyInner3](docs/VariateContentsPropertyInner3.md)
 - [VariateContentsPropertyInner4](docs/VariateContentsPropertyInner4.md)
 - [VerifiedDomains](docs/VerifiedDomains.md)
 - [VerifiedDomainsAddDomainToAccount200Response](docs/VerifiedDomainsAddDomainToAccount200Response.md)
 - [VerifiedDomainsAddDomainToAccountRequest](docs/VerifiedDomainsAddDomainToAccountRequest.md)
 - [VerifiedDomainsAddDomainToAccountResponse](docs/VerifiedDomainsAddDomainToAccountResponse.md)
 - [VerifiedDomainsAddDomainToAccountdefaultResponse](docs/VerifiedDomainsAddDomainToAccountdefaultResponse.md)
 - [VerifiedDomainsDeleteDomainResponse](docs/VerifiedDomainsDeleteDomainResponse.md)
 - [VerifiedDomainsDeleteDomaindefaultResponse](docs/VerifiedDomainsDeleteDomaindefaultResponse.md)
 - [VerifiedDomainsGetInfo200Response](docs/VerifiedDomainsGetInfo200Response.md)
 - [VerifiedDomainsGetInfoResponse](docs/VerifiedDomainsGetInfoResponse.md)
 - [VerifiedDomainsGetInfodefaultResponse](docs/VerifiedDomainsGetInfodefaultResponse.md)
 - [VerifiedDomainsListSendingDomains200Response](docs/VerifiedDomainsListSendingDomains200Response.md)
 - [VerifiedDomainsListSendingDomainsResponse](docs/VerifiedDomainsListSendingDomainsResponse.md)
 - [VerifiedDomainsListSendingDomainsdefaultResponse](docs/VerifiedDomainsListSendingDomainsdefaultResponse.md)
 - [VerifiedDomainsVerifyDomainForSending200Response](docs/VerifiedDomainsVerifyDomainForSending200Response.md)
 - [VerifiedDomainsVerifyDomainForSendingRequest](docs/VerifiedDomainsVerifyDomainForSendingRequest.md)
 - [VerifiedDomainsVerifyDomainForSendingResponse](docs/VerifiedDomainsVerifyDomainForSendingResponse.md)
 - [VerifiedDomainsVerifyDomainForSendingdefaultResponse](docs/VerifiedDomainsVerifyDomainForSendingdefaultResponse.md)
 - [VisitsPropertyInner](docs/VisitsPropertyInner.md)
 - [VisitsPropertyInner1](docs/VisitsPropertyInner1.md)
 - [VisitsPropertyInner2](docs/VisitsPropertyInner2.md)
 - [VisitsPropertyInner3](docs/VisitsPropertyInner3.md)
 - [VisitsPropertyInner4](docs/VisitsPropertyInner4.md)
 - [VisitsPropertyInner5](docs/VisitsPropertyInner5.md)
 - [VisitsPropertyInner6](docs/VisitsPropertyInner6.md)
 - [VisitsPropertyInner7](docs/VisitsPropertyInner7.md)
 - [WeeklyClicksAndVisitsDataProperty](docs/WeeklyClicksAndVisitsDataProperty.md)
 - [WeeklyClicksAndVisitsDataProperty1](docs/WeeklyClicksAndVisitsDataProperty1.md)
 - [WeeklyClicksAndVisitsDataProperty2](docs/WeeklyClicksAndVisitsDataProperty2.md)
 - [WeeklyClicksAndVisitsDataProperty3](docs/WeeklyClicksAndVisitsDataProperty3.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
