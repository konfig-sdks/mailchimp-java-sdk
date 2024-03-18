# EcommerceApi

All URIs are relative to *https://server.api.mailchimp.com/3.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCartLineItem**](EcommerceApi.md#addCartLineItem) | **POST** /ecommerce/stores/{store_id}/carts/{cart_id}/lines | Add cart line item |
| [**addCartToStore**](EcommerceApi.md#addCartToStore) | **POST** /ecommerce/stores/{store_id}/carts | Add cart |
| [**addCustomerToStore**](EcommerceApi.md#addCustomerToStore) | **POST** /ecommerce/stores/{store_id}/customers | Add customer |
| [**addOrUpdateCustomer**](EcommerceApi.md#addOrUpdateCustomer) | **PUT** /ecommerce/stores/{store_id}/customers/{customer_id} | Add or update customer |
| [**addOrUpdateProductVariant**](EcommerceApi.md#addOrUpdateProductVariant) | **PUT** /ecommerce/stores/{store_id}/products/{product_id}/variants/{variant_id} | Add or update product variant |
| [**addOrderLineItem**](EcommerceApi.md#addOrderLineItem) | **POST** /ecommerce/stores/{store_id}/orders/{order_id}/lines | Add order line item |
| [**addOrderToStore**](EcommerceApi.md#addOrderToStore) | **POST** /ecommerce/stores/{store_id}/orders | Add order |
| [**addProductImage**](EcommerceApi.md#addProductImage) | **POST** /ecommerce/stores/{store_id}/products/{product_id}/images | Add product image |
| [**addProductToStore**](EcommerceApi.md#addProductToStore) | **POST** /ecommerce/stores/{store_id}/products | Add product |
| [**addProductVariant**](EcommerceApi.md#addProductVariant) | **POST** /ecommerce/stores/{store_id}/products/{product_id}/variants | Add product variant |
| [**addPromoCode**](EcommerceApi.md#addPromoCode) | **POST** /ecommerce/stores/{store_id}/promo-rules/{promo_rule_id}/promo-codes | Add promo code |
| [**addPromoRule**](EcommerceApi.md#addPromoRule) | **POST** /ecommerce/stores/{store_id}/promo-rules | Add promo rule |
| [**addStoreToMailchimpAccount**](EcommerceApi.md#addStoreToMailchimpAccount) | **POST** /ecommerce/stores | Add store |
| [**deleteCartLineItem**](EcommerceApi.md#deleteCartLineItem) | **DELETE** /ecommerce/stores/{store_id}/carts/{cart_id}/lines/{line_id} | Delete cart line item |
| [**deleteOrder**](EcommerceApi.md#deleteOrder) | **DELETE** /ecommerce/stores/{store_id}/orders/{order_id} | Delete order |
| [**deleteOrderLine**](EcommerceApi.md#deleteOrderLine) | **DELETE** /ecommerce/stores/{store_id}/orders/{order_id}/lines/{line_id} | Delete order line item |
| [**deleteProduct**](EcommerceApi.md#deleteProduct) | **DELETE** /ecommerce/stores/{store_id}/products/{product_id} | Delete product |
| [**deleteProductImage**](EcommerceApi.md#deleteProductImage) | **DELETE** /ecommerce/stores/{store_id}/products/{product_id}/images/{image_id} | Delete product image |
| [**deleteProductVariant**](EcommerceApi.md#deleteProductVariant) | **DELETE** /ecommerce/stores/{store_id}/products/{product_id}/variants/{variant_id} | Delete product variant |
| [**deletePromoCode**](EcommerceApi.md#deletePromoCode) | **DELETE** /ecommerce/stores/{store_id}/promo-rules/{promo_rule_id}/promo-codes/{promo_code_id} | Delete promo code |
| [**deletePromoRule**](EcommerceApi.md#deletePromoRule) | **DELETE** /ecommerce/stores/{store_id}/promo-rules/{promo_rule_id} | Delete promo rule |
| [**deleteStore**](EcommerceApi.md#deleteStore) | **DELETE** /ecommerce/stores/{store_id} | Delete store |
| [**getCartInfo**](EcommerceApi.md#getCartInfo) | **GET** /ecommerce/stores/{store_id}/carts/{cart_id} | Get cart info |
| [**getCartLineItem**](EcommerceApi.md#getCartLineItem) | **GET** /ecommerce/stores/{store_id}/carts/{cart_id}/lines/{line_id} | Get cart line item |
| [**getCustomerInfo**](EcommerceApi.md#getCustomerInfo) | **GET** /ecommerce/stores/{store_id}/customers/{customer_id} | Get customer info |
| [**getOrderLineItem**](EcommerceApi.md#getOrderLineItem) | **GET** /ecommerce/stores/{store_id}/orders/{order_id}/lines/{line_id} | Get order line item |
| [**getProductImageInfo**](EcommerceApi.md#getProductImageInfo) | **GET** /ecommerce/stores/{store_id}/products/{product_id}/images/{image_id} | Get product image info |
| [**getProductImages**](EcommerceApi.md#getProductImages) | **GET** /ecommerce/stores/{store_id}/products/{product_id}/images | List product images |
| [**getProductVariantInfo**](EcommerceApi.md#getProductVariantInfo) | **GET** /ecommerce/stores/{store_id}/products/{product_id}/variants/{variant_id} | Get product variant info |
| [**getPromoCode**](EcommerceApi.md#getPromoCode) | **GET** /ecommerce/stores/{store_id}/promo-rules/{promo_rule_id}/promo-codes/{promo_code_id} | Get promo code |
| [**getStoreCarts**](EcommerceApi.md#getStoreCarts) | **GET** /ecommerce/stores/{store_id}/carts | List carts |
| [**getStoreCustomers**](EcommerceApi.md#getStoreCustomers) | **GET** /ecommerce/stores/{store_id}/customers | List customers |
| [**getStoreInfo**](EcommerceApi.md#getStoreInfo) | **GET** /ecommerce/stores/{store_id} | Get store info |
| [**getStoreOrderInfo**](EcommerceApi.md#getStoreOrderInfo) | **GET** /ecommerce/stores/{store_id}/orders/{order_id} | Get order info |
| [**getStoreOrderLines**](EcommerceApi.md#getStoreOrderLines) | **GET** /ecommerce/stores/{store_id}/orders/{order_id}/lines | List order line items |
| [**getStoreProductInfo**](EcommerceApi.md#getStoreProductInfo) | **GET** /ecommerce/stores/{store_id}/products/{product_id} | Get product info |
| [**getStoreProducts**](EcommerceApi.md#getStoreProducts) | **GET** /ecommerce/stores/{store_id}/products | List product |
| [**getStorePromoCodes**](EcommerceApi.md#getStorePromoCodes) | **GET** /ecommerce/stores/{store_id}/promo-rules/{promo_rule_id}/promo-codes | List promo codes |
| [**getStorePromoRule**](EcommerceApi.md#getStorePromoRule) | **GET** /ecommerce/stores/{store_id}/promo-rules/{promo_rule_id} | Get promo rule |
| [**getStorePromoRules**](EcommerceApi.md#getStorePromoRules) | **GET** /ecommerce/stores/{store_id}/promo-rules | List promo rules |
| [**listAccountOrders**](EcommerceApi.md#listAccountOrders) | **GET** /ecommerce/orders | List account orders |
| [**listCartLines**](EcommerceApi.md#listCartLines) | **GET** /ecommerce/stores/{store_id}/carts/{cart_id}/lines | List cart line items |
| [**listProductVariants**](EcommerceApi.md#listProductVariants) | **GET** /ecommerce/stores/{store_id}/products/{product_id}/variants | List product variants |
| [**listStoreOrders**](EcommerceApi.md#listStoreOrders) | **GET** /ecommerce/stores/{store_id}/orders | List orders |
| [**listStores**](EcommerceApi.md#listStores) | **GET** /ecommerce/stores | List stores |
| [**removeCart**](EcommerceApi.md#removeCart) | **DELETE** /ecommerce/stores/{store_id}/carts/{cart_id} | Delete cart |
| [**removeCustomer**](EcommerceApi.md#removeCustomer) | **DELETE** /ecommerce/stores/{store_id}/customers/{customer_id} | Delete customer |
| [**updateCartById**](EcommerceApi.md#updateCartById) | **PATCH** /ecommerce/stores/{store_id}/carts/{cart_id} | Update cart |
| [**updateCartLineItem**](EcommerceApi.md#updateCartLineItem) | **PATCH** /ecommerce/stores/{store_id}/carts/{cart_id}/lines/{line_id} | Update cart line item |
| [**updateCustomer**](EcommerceApi.md#updateCustomer) | **PATCH** /ecommerce/stores/{store_id}/customers/{customer_id} | Update customer |
| [**updateOrderLine**](EcommerceApi.md#updateOrderLine) | **PATCH** /ecommerce/stores/{store_id}/orders/{order_id}/lines/{line_id} | Update order line item |
| [**updateProduct**](EcommerceApi.md#updateProduct) | **PATCH** /ecommerce/stores/{store_id}/products/{product_id} | Update product |
| [**updateProductImage**](EcommerceApi.md#updateProductImage) | **PATCH** /ecommerce/stores/{store_id}/products/{product_id}/images/{image_id} | Update product image |
| [**updateProductVariant**](EcommerceApi.md#updateProductVariant) | **PATCH** /ecommerce/stores/{store_id}/products/{product_id}/variants/{variant_id} | Update product variant |
| [**updatePromoCode**](EcommerceApi.md#updatePromoCode) | **PATCH** /ecommerce/stores/{store_id}/promo-rules/{promo_rule_id}/promo-codes/{promo_code_id} | Update promo code |
| [**updatePromoRule**](EcommerceApi.md#updatePromoRule) | **PATCH** /ecommerce/stores/{store_id}/promo-rules/{promo_rule_id} | Update promo rule |
| [**updateSpecificOrder**](EcommerceApi.md#updateSpecificOrder) | **PATCH** /ecommerce/stores/{store_id}/orders/{order_id} | Update order |
| [**updateStore**](EcommerceApi.md#updateStore) | **PATCH** /ecommerce/stores/{store_id} | Update store |


<a name="addCartLineItem"></a>
# **addCartLineItem**
> EcommerceAddCartLineItemResponse addCartLineItem(storeId, cartId, ecommerceAddCartLineItemRequest).execute();

Add cart line item

Add a new line item to an existing cart.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String id = "id_example"; // A unique identifier for the cart line item.
    String productId = "productId_example"; // A unique identifier for the product associated with the cart line item.
    String productVariantId = "productVariantId_example"; // A unique identifier for the product variant associated with the cart line item.
    Integer quantity = 56; // The quantity of a cart line item.
    Double price = 3.4D; // The price of a cart line item.
    String storeId = "storeId_example"; // The store id.
    String cartId = "cartId_example"; // The id for the cart.
    try {
      EcommerceAddCartLineItemResponse result = client
              .ecommerce
              .addCartLineItem(id, productId, productVariantId, quantity, price, storeId, cartId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getProductId());
      System.out.println(result.getProductTitle());
      System.out.println(result.getProductVariantId());
      System.out.println(result.getProductVariantTitle());
      System.out.println(result.getQuantity());
      System.out.println(result.getPrice());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#addCartLineItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceAddCartLineItemResponse> response = client
              .ecommerce
              .addCartLineItem(id, productId, productVariantId, quantity, price, storeId, cartId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#addCartLineItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **cartId** | **String**| The id for the cart. | |
| **ecommerceAddCartLineItemRequest** | [**EcommerceAddCartLineItemRequest**](EcommerceAddCartLineItemRequest.md)|  | |

### Return type

[**EcommerceAddCartLineItemResponse**](EcommerceAddCartLineItemResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="addCartToStore"></a>
# **addCartToStore**
> EcommerceAddCartToStoreResponse addCartToStore(storeId, ecommerceAddCartToStoreRequest).execute();

Add cart

Add a new cart to a store.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String id = "id_example"; // A unique identifier for the cart.
    ECommerceCustomerProperty customer = new ECommerceCustomerProperty();
    String currencyCode = "currencyCode_example"; // The three-letter ISO 4217 code for the currency that the cart uses.
    Double orderTotal = 3.4D; // The order total for the cart.
    List<ECommerceCartLineItem> lines = Arrays.asList(); // An array of the cart's line items.
    String storeId = "storeId_example"; // The store id.
    String campaignId = "campaignId_example"; // A string that uniquely identifies the campaign for a cart.
    String checkoutUrl = "checkoutUrl_example"; // The URL for the cart. This parameter is required for [Abandoned Cart](https://mailchimp.com/help/create-an-abandoned-cart-email/) automations.
    Double taxTotal = 3.4D; // The total tax for the cart.
    try {
      EcommerceAddCartToStoreResponse result = client
              .ecommerce
              .addCartToStore(id, customer, currencyCode, orderTotal, lines, storeId)
              .campaignId(campaignId)
              .checkoutUrl(checkoutUrl)
              .taxTotal(taxTotal)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCustomer());
      System.out.println(result.getCampaignId());
      System.out.println(result.getCheckoutUrl());
      System.out.println(result.getCurrencyCode());
      System.out.println(result.getOrderTotal());
      System.out.println(result.getTaxTotal());
      System.out.println(result.getLines());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#addCartToStore");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceAddCartToStoreResponse> response = client
              .ecommerce
              .addCartToStore(id, customer, currencyCode, orderTotal, lines, storeId)
              .campaignId(campaignId)
              .checkoutUrl(checkoutUrl)
              .taxTotal(taxTotal)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#addCartToStore");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **ecommerceAddCartToStoreRequest** | [**EcommerceAddCartToStoreRequest**](EcommerceAddCartToStoreRequest.md)|  | |

### Return type

[**EcommerceAddCartToStoreResponse**](EcommerceAddCartToStoreResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="addCustomerToStore"></a>
# **addCustomerToStore**
> EcommerceAddCustomerToStoreResponse addCustomerToStore(storeId, ecommerceAddCustomerToStoreRequest).execute();

Add customer

Add a new customer to a store.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String id = "id_example"; // A unique identifier for the customer. Limited to 50 characters.
    String emailAddress = "emailAddress_example"; // The customer's email address.
    Boolean optInStatus = true; // The customer's opt-in status. This value will never overwrite the opt-in status of a pre-existing Mailchimp list member, but will apply to list members that are added through the e-commerce API endpoints. Customers who don't opt in to your Mailchimp list [will be added as `Transactional` members](https://mailchimp.com/developer/marketing/docs/e-commerce/#customers).
    String storeId = "storeId_example"; // The store id.
    String company = "company_example"; // The customer's company.
    String firstName = "firstName_example"; // The customer's first name.
    String lastName = "lastName_example"; // The customer's last name.
    AddressProperty4 address = new AddressProperty4();
    try {
      EcommerceAddCustomerToStoreResponse result = client
              .ecommerce
              .addCustomerToStore(id, emailAddress, optInStatus, storeId)
              .company(company)
              .firstName(firstName)
              .lastName(lastName)
              .address(address)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEmailAddress());
      System.out.println(result.getOptInStatus());
      System.out.println(result.getCompany());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getOrdersCount());
      System.out.println(result.getTotalSpent());
      System.out.println(result.getAddress());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#addCustomerToStore");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceAddCustomerToStoreResponse> response = client
              .ecommerce
              .addCustomerToStore(id, emailAddress, optInStatus, storeId)
              .company(company)
              .firstName(firstName)
              .lastName(lastName)
              .address(address)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#addCustomerToStore");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **ecommerceAddCustomerToStoreRequest** | [**EcommerceAddCustomerToStoreRequest**](EcommerceAddCustomerToStoreRequest.md)|  | |

### Return type

[**EcommerceAddCustomerToStoreResponse**](EcommerceAddCustomerToStoreResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="addOrUpdateCustomer"></a>
# **addOrUpdateCustomer**
> EcommerceAddOrUpdateCustomerResponse addOrUpdateCustomer(storeId, customerId, ecommerceAddOrUpdateCustomerRequest).execute();

Add or update customer

Add or update a customer.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String id = "id_example"; // A unique identifier for the customer. Limited to 50 characters.
    String emailAddress = "emailAddress_example"; // The customer's email address.
    Boolean optInStatus = true; // The customer's opt-in status. This value will never overwrite the opt-in status of a pre-existing Mailchimp list member, but will apply to list members that are added through the e-commerce API endpoints. Customers who don't opt in to your Mailchimp list [will be added as `Transactional` members](https://mailchimp.com/developer/marketing/docs/e-commerce/#customers).
    String storeId = "storeId_example"; // The store id.
    String customerId = "customerId_example"; // The id for the customer of a store.
    String company = "company_example"; // The customer's company.
    String firstName = "firstName_example"; // The customer's first name.
    String lastName = "lastName_example"; // The customer's last name.
    AddressProperty6 address = new AddressProperty6();
    try {
      EcommerceAddOrUpdateCustomerResponse result = client
              .ecommerce
              .addOrUpdateCustomer(id, emailAddress, optInStatus, storeId, customerId)
              .company(company)
              .firstName(firstName)
              .lastName(lastName)
              .address(address)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEmailAddress());
      System.out.println(result.getOptInStatus());
      System.out.println(result.getCompany());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getOrdersCount());
      System.out.println(result.getTotalSpent());
      System.out.println(result.getAddress());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#addOrUpdateCustomer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceAddOrUpdateCustomerResponse> response = client
              .ecommerce
              .addOrUpdateCustomer(id, emailAddress, optInStatus, storeId, customerId)
              .company(company)
              .firstName(firstName)
              .lastName(lastName)
              .address(address)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#addOrUpdateCustomer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **customerId** | **String**| The id for the customer of a store. | |
| **ecommerceAddOrUpdateCustomerRequest** | [**EcommerceAddOrUpdateCustomerRequest**](EcommerceAddOrUpdateCustomerRequest.md)|  | |

### Return type

[**EcommerceAddOrUpdateCustomerResponse**](EcommerceAddOrUpdateCustomerResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="addOrUpdateProductVariant"></a>
# **addOrUpdateProductVariant**
> EcommerceAddOrUpdateProductVariantResponse addOrUpdateProductVariant(storeId, productId, variantId, ecommerceAddProductVariantRequest).execute();

Add or update product variant

Add or update a product variant.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String title = "title_example"; // The title of a product variant.
    String id = "id_example"; // A unique identifier for the product variant.
    String storeId = "storeId_example"; // The store id.
    String productId = "productId_example"; // The id for the product of a store.
    String variantId = "variantId_example"; // The id for the product variant.
    String url = "url_example"; // The URL for a product variant.
    String sku = "sku_example"; // The stock keeping unit (SKU) of a product variant.
    Double price = 3.4D; // The price of a product variant.
    Integer inventoryQuantity = 56; // The inventory quantity of a product variant.
    String imageUrl = "imageUrl_example"; // The image URL for a product variant.
    String backorders = "backorders_example"; // The backorders of a product variant.
    String visibility = "visibility_example"; // The visibility of a product variant.
    try {
      EcommerceAddOrUpdateProductVariantResponse result = client
              .ecommerce
              .addOrUpdateProductVariant(title, id, storeId, productId, variantId)
              .url(url)
              .sku(sku)
              .price(price)
              .inventoryQuantity(inventoryQuantity)
              .imageUrl(imageUrl)
              .backorders(backorders)
              .visibility(visibility)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getId());
      System.out.println(result.getUrl());
      System.out.println(result.getSku());
      System.out.println(result.getPrice());
      System.out.println(result.getInventoryQuantity());
      System.out.println(result.getImageUrl());
      System.out.println(result.getBackorders());
      System.out.println(result.getVisibility());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#addOrUpdateProductVariant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceAddOrUpdateProductVariantResponse> response = client
              .ecommerce
              .addOrUpdateProductVariant(title, id, storeId, productId, variantId)
              .url(url)
              .sku(sku)
              .price(price)
              .inventoryQuantity(inventoryQuantity)
              .imageUrl(imageUrl)
              .backorders(backorders)
              .visibility(visibility)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#addOrUpdateProductVariant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **productId** | **String**| The id for the product of a store. | |
| **variantId** | **String**| The id for the product variant. | |
| **ecommerceAddProductVariantRequest** | [**EcommerceAddProductVariantRequest**](EcommerceAddProductVariantRequest.md)|  | |

### Return type

[**EcommerceAddOrUpdateProductVariantResponse**](EcommerceAddOrUpdateProductVariantResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="addOrderLineItem"></a>
# **addOrderLineItem**
> EcommerceAddOrderLineItemResponse addOrderLineItem(storeId, orderId, ecommerceAddOrderLineItemRequest).execute();

Add order line item

Add a new line item to an existing order.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String id = "id_example"; // A unique identifier for the order line item.
    String productId = "productId_example"; // A unique identifier for the product associated with the order line item.
    String productVariantId = "productVariantId_example"; // A unique identifier for the product variant associated with the order line item.
    Integer quantity = 56; // The quantity of an order line item.
    Double price = 3.4D; // The price of an order line item.
    String storeId = "storeId_example"; // The store id.
    String orderId = "orderId_example"; // The id for the order in a store.
    Double discount = 3.4D; // The total discount amount applied to this line item.
    try {
      EcommerceAddOrderLineItemResponse result = client
              .ecommerce
              .addOrderLineItem(id, productId, productVariantId, quantity, price, storeId, orderId)
              .discount(discount)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getProductId());
      System.out.println(result.getProductTitle());
      System.out.println(result.getProductVariantId());
      System.out.println(result.getProductVariantTitle());
      System.out.println(result.getImageUrl());
      System.out.println(result.getQuantity());
      System.out.println(result.getPrice());
      System.out.println(result.getDiscount());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#addOrderLineItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceAddOrderLineItemResponse> response = client
              .ecommerce
              .addOrderLineItem(id, productId, productVariantId, quantity, price, storeId, orderId)
              .discount(discount)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#addOrderLineItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **orderId** | **String**| The id for the order in a store. | |
| **ecommerceAddOrderLineItemRequest** | [**EcommerceAddOrderLineItemRequest**](EcommerceAddOrderLineItemRequest.md)|  | |

### Return type

[**EcommerceAddOrderLineItemResponse**](EcommerceAddOrderLineItemResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="addOrderToStore"></a>
# **addOrderToStore**
> EcommerceAddOrderToStoreResponse addOrderToStore(storeId, ecommerceAddOrderToStoreRequest).execute();

Add order

Add a new order to a store.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String id = "id_example"; // A unique identifier for the order.
    ECommerceCustomerProperty2 customer = new ECommerceCustomerProperty2();
    String currencyCode = "currencyCode_example"; // The three-letter ISO 4217 code for the currency that the store accepts.
    Double orderTotal = 3.4D; // The total for the order.
    List<ECommerceOrderLineItem> lines = Arrays.asList(); // An array of the order's line items.
    String storeId = "storeId_example"; // The store id.
    String campaignId = "campaignId_example"; // A string that uniquely identifies the campaign for an order.
    String landingSite = "landingSite_example"; // The URL for the page where the buyer landed when entering the shop.
    String financialStatus = "financialStatus_example"; // The order status. Use this parameter to trigger [Order Notifications](https://mailchimp.com/developer/marketing/docs/e-commerce/#order-notifications).
    String fulfillmentStatus = "fulfillmentStatus_example"; // The fulfillment status for the order. Use this parameter to trigger [Order Notifications](https://mailchimp.com/developer/marketing/docs/e-commerce/#order-notifications).
    String orderUrl = "orderUrl_example"; // The URL for the order.
    Double discountTotal = 3.4D; // The total amount of the discounts to be applied to the price of the order.
    Double taxTotal = 3.4D; // The tax total for the order.
    Double shippingTotal = 3.4D; // The shipping total for the order.
    String trackingCode = "prec"; // The Mailchimp tracking code for the order. Uses the 'mc_tc' parameter in E-Commerce tracking URLs.
    OffsetDateTime processedAtForeign = OffsetDateTime.now(); // The date and time the order was processed in ISO 8601 format.
    OffsetDateTime cancelledAtForeign = OffsetDateTime.now(); // The date and time the order was cancelled in ISO 8601 format. Note: passing a value for this parameter will cancel the order being created.
    OffsetDateTime updatedAtForeign = OffsetDateTime.now(); // The date and time the order was updated in ISO 8601 format.
    ShippingAddressProperty shippingAddress = new ShippingAddressProperty();
    BillingAddressProperty billingAddress = new BillingAddressProperty();
    List<PromosPropertyInner> promos = Arrays.asList(); // The promo codes applied on the order
    OutreachProperty outreach = new OutreachProperty();
    String trackingNumber = "trackingNumber_example"; // The tracking number associated with the order.
    String trackingCarrier = "trackingCarrier_example"; // The tracking carrier associated with the order.
    String trackingUrl = "trackingUrl_example"; // The tracking URL associated with the order.
    try {
      EcommerceAddOrderToStoreResponse result = client
              .ecommerce
              .addOrderToStore(id, customer, currencyCode, orderTotal, lines, storeId)
              .campaignId(campaignId)
              .landingSite(landingSite)
              .financialStatus(financialStatus)
              .fulfillmentStatus(fulfillmentStatus)
              .orderUrl(orderUrl)
              .discountTotal(discountTotal)
              .taxTotal(taxTotal)
              .shippingTotal(shippingTotal)
              .trackingCode(trackingCode)
              .processedAtForeign(processedAtForeign)
              .cancelledAtForeign(cancelledAtForeign)
              .updatedAtForeign(updatedAtForeign)
              .shippingAddress(shippingAddress)
              .billingAddress(billingAddress)
              .promos(promos)
              .outreach(outreach)
              .trackingNumber(trackingNumber)
              .trackingCarrier(trackingCarrier)
              .trackingUrl(trackingUrl)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCustomer());
      System.out.println(result.getStoreId());
      System.out.println(result.getCampaignId());
      System.out.println(result.getLandingSite());
      System.out.println(result.getFinancialStatus());
      System.out.println(result.getFulfillmentStatus());
      System.out.println(result.getCurrencyCode());
      System.out.println(result.getOrderTotal());
      System.out.println(result.getOrderUrl());
      System.out.println(result.getDiscountTotal());
      System.out.println(result.getTaxTotal());
      System.out.println(result.getShippingTotal());
      System.out.println(result.getTrackingCode());
      System.out.println(result.getProcessedAtForeign());
      System.out.println(result.getCancelledAtForeign());
      System.out.println(result.getUpdatedAtForeign());
      System.out.println(result.getShippingAddress());
      System.out.println(result.getBillingAddress());
      System.out.println(result.getPromos());
      System.out.println(result.getLines());
      System.out.println(result.getOutreach());
      System.out.println(result.getTrackingNumber());
      System.out.println(result.getTrackingCarrier());
      System.out.println(result.getTrackingUrl());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#addOrderToStore");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceAddOrderToStoreResponse> response = client
              .ecommerce
              .addOrderToStore(id, customer, currencyCode, orderTotal, lines, storeId)
              .campaignId(campaignId)
              .landingSite(landingSite)
              .financialStatus(financialStatus)
              .fulfillmentStatus(fulfillmentStatus)
              .orderUrl(orderUrl)
              .discountTotal(discountTotal)
              .taxTotal(taxTotal)
              .shippingTotal(shippingTotal)
              .trackingCode(trackingCode)
              .processedAtForeign(processedAtForeign)
              .cancelledAtForeign(cancelledAtForeign)
              .updatedAtForeign(updatedAtForeign)
              .shippingAddress(shippingAddress)
              .billingAddress(billingAddress)
              .promos(promos)
              .outreach(outreach)
              .trackingNumber(trackingNumber)
              .trackingCarrier(trackingCarrier)
              .trackingUrl(trackingUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#addOrderToStore");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **ecommerceAddOrderToStoreRequest** | [**EcommerceAddOrderToStoreRequest**](EcommerceAddOrderToStoreRequest.md)|  | |

### Return type

[**EcommerceAddOrderToStoreResponse**](EcommerceAddOrderToStoreResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="addProductImage"></a>
# **addProductImage**
> EcommerceAddProductImageResponse addProductImage(storeId, productId, ecommerceAddProductImageRequest).execute();

Add product image

Add a new image to the product.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String id = "id_example"; // A unique identifier for the product image.
    String url = "url_example"; // The URL for a product image.
    String storeId = "storeId_example"; // The store id.
    String productId = "productId_example"; // The id for the product of a store.
    List<String> variantIds = Arrays.asList(); // The list of product variants using the image.
    try {
      EcommerceAddProductImageResponse result = client
              .ecommerce
              .addProductImage(id, url, storeId, productId)
              .variantIds(variantIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUrl());
      System.out.println(result.getVariantIds());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#addProductImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceAddProductImageResponse> response = client
              .ecommerce
              .addProductImage(id, url, storeId, productId)
              .variantIds(variantIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#addProductImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **productId** | **String**| The id for the product of a store. | |
| **ecommerceAddProductImageRequest** | [**EcommerceAddProductImageRequest**](EcommerceAddProductImageRequest.md)|  | |

### Return type

[**EcommerceAddProductImageResponse**](EcommerceAddProductImageResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="addProductToStore"></a>
# **addProductToStore**
> EcommerceAddProductToStoreResponse addProductToStore(storeId, ecommerceAddProductToStoreRequest).execute();

Add product

Add a new product to a store.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String title = "title_example"; // The title of a product.
    String id = "id_example"; // A unique identifier for the product.
    List<ECommerceProductVariant> variants = Arrays.asList(); // An array of the product's variants. At least one variant is required for each product. A variant can use the same `id` and `title` as the parent product.
    String storeId = "storeId_example"; // The store id.
    String description = "description_example"; // The description of a product.
    String handle = "handle_example"; // The handle of a product.
    String url = "url_example"; // The URL for a product.
    String type = "type_example"; // The type of product.
    String vendor = "vendor_example"; // The vendor for a product.
    String imageUrl = "imageUrl_example"; // The image URL for a product.
    List<ECommerceProductImage> images = Arrays.asList(); // An array of the product's images.
    OffsetDateTime publishedAtForeign = OffsetDateTime.now(); // The date and time the product was published.
    try {
      EcommerceAddProductToStoreResponse result = client
              .ecommerce
              .addProductToStore(title, id, variants, storeId)
              .description(description)
              .handle(handle)
              .url(url)
              .type(type)
              .vendor(vendor)
              .imageUrl(imageUrl)
              .images(images)
              .publishedAtForeign(publishedAtForeign)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getCurrencyCode());
      System.out.println(result.getHandle());
      System.out.println(result.getUrl());
      System.out.println(result.getType());
      System.out.println(result.getVendor());
      System.out.println(result.getImageUrl());
      System.out.println(result.getVariants());
      System.out.println(result.getImages());
      System.out.println(result.getPublishedAtForeign());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#addProductToStore");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceAddProductToStoreResponse> response = client
              .ecommerce
              .addProductToStore(title, id, variants, storeId)
              .description(description)
              .handle(handle)
              .url(url)
              .type(type)
              .vendor(vendor)
              .imageUrl(imageUrl)
              .images(images)
              .publishedAtForeign(publishedAtForeign)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#addProductToStore");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **ecommerceAddProductToStoreRequest** | [**EcommerceAddProductToStoreRequest**](EcommerceAddProductToStoreRequest.md)|  | |

### Return type

[**EcommerceAddProductToStoreResponse**](EcommerceAddProductToStoreResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="addProductVariant"></a>
# **addProductVariant**
> EcommerceAddProductVariantResponse addProductVariant(storeId, productId, ecommerceAddProductVariantRequest).execute();

Add product variant

Add a new variant to the product.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String title = "title_example"; // The title of a product variant.
    String id = "id_example"; // A unique identifier for the product variant.
    String storeId = "storeId_example"; // The store id.
    String productId = "productId_example"; // The id for the product of a store.
    String url = "url_example"; // The URL for a product variant.
    String sku = "sku_example"; // The stock keeping unit (SKU) of a product variant.
    Double price = 3.4D; // The price of a product variant.
    Integer inventoryQuantity = 56; // The inventory quantity of a product variant.
    String imageUrl = "imageUrl_example"; // The image URL for a product variant.
    String backorders = "backorders_example"; // The backorders of a product variant.
    String visibility = "visibility_example"; // The visibility of a product variant.
    try {
      EcommerceAddProductVariantResponse result = client
              .ecommerce
              .addProductVariant(title, id, storeId, productId)
              .url(url)
              .sku(sku)
              .price(price)
              .inventoryQuantity(inventoryQuantity)
              .imageUrl(imageUrl)
              .backorders(backorders)
              .visibility(visibility)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getId());
      System.out.println(result.getUrl());
      System.out.println(result.getSku());
      System.out.println(result.getPrice());
      System.out.println(result.getInventoryQuantity());
      System.out.println(result.getImageUrl());
      System.out.println(result.getBackorders());
      System.out.println(result.getVisibility());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#addProductVariant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceAddProductVariantResponse> response = client
              .ecommerce
              .addProductVariant(title, id, storeId, productId)
              .url(url)
              .sku(sku)
              .price(price)
              .inventoryQuantity(inventoryQuantity)
              .imageUrl(imageUrl)
              .backorders(backorders)
              .visibility(visibility)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#addProductVariant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **productId** | **String**| The id for the product of a store. | |
| **ecommerceAddProductVariantRequest** | [**EcommerceAddProductVariantRequest**](EcommerceAddProductVariantRequest.md)|  | |

### Return type

[**EcommerceAddProductVariantResponse**](EcommerceAddProductVariantResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="addPromoCode"></a>
# **addPromoCode**
> EcommerceAddPromoCodeResponse addPromoCode(storeId, promoRuleId, ecommerceAddPromoCodeRequest).execute();

Add promo code

Add a new promo code to a store.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String id = "id_example"; // A unique identifier for the promo code. Restricted to UTF-8 characters with max length 50.
    String code = "code_example"; // The discount code. Restricted to UTF-8 characters with max length 50.
    String redemptionUrl = "redemptionUrl_example"; // The url that should be used in the promotion campaign restricted to UTF-8 characters with max length 2000.
    String storeId = "storeId_example"; // The store id.
    String promoRuleId = "promoRuleId_example"; // The id for the promo rule of a store.
    Integer usageCount = 56; // Number of times promo code has been used.
    Boolean enabled = true; // Whether the promo code is currently enabled.
    OffsetDateTime createdAtForeign = OffsetDateTime.now(); // The date and time the promotion was created in ISO 8601 format.
    OffsetDateTime updatedAtForeign = OffsetDateTime.now(); // The date and time the promotion was updated in ISO 8601 format.
    try {
      EcommerceAddPromoCodeResponse result = client
              .ecommerce
              .addPromoCode(id, code, redemptionUrl, storeId, promoRuleId)
              .usageCount(usageCount)
              .enabled(enabled)
              .createdAtForeign(createdAtForeign)
              .updatedAtForeign(updatedAtForeign)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCode());
      System.out.println(result.getRedemptionUrl());
      System.out.println(result.getUsageCount());
      System.out.println(result.getEnabled());
      System.out.println(result.getCreatedAtForeign());
      System.out.println(result.getUpdatedAtForeign());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#addPromoCode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceAddPromoCodeResponse> response = client
              .ecommerce
              .addPromoCode(id, code, redemptionUrl, storeId, promoRuleId)
              .usageCount(usageCount)
              .enabled(enabled)
              .createdAtForeign(createdAtForeign)
              .updatedAtForeign(updatedAtForeign)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#addPromoCode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **promoRuleId** | **String**| The id for the promo rule of a store. | |
| **ecommerceAddPromoCodeRequest** | [**EcommerceAddPromoCodeRequest**](EcommerceAddPromoCodeRequest.md)|  | |

### Return type

[**EcommerceAddPromoCodeResponse**](EcommerceAddPromoCodeResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="addPromoRule"></a>
# **addPromoRule**
> EcommerceAddPromoRuleResponse addPromoRule(storeId, ecommerceAddPromoRuleRequest).execute();

Add promo rule

Add a new promo rule to a store.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String description = "description_example"; // The description of a promotion restricted to UTF-8 characters with max length 255.
    String id = "id_example"; // A unique identifier for the promo rule. If Ecommerce platform does not support promo rule, use promo code id as promo rule id. Restricted to UTF-8 characters with max length 50.
    Float amount = 3.4F; // The amount of the promo code discount. If 'type' is 'fixed', the amount is treated as a monetary value. If 'type' is 'percentage', amount must be a decimal value between 0.0 and 1.0, inclusive.
    String type = "fixed"; // Type of discount. For free shipping set type to fixed.
    String target = "per_item"; // The target that the discount applies to.
    String storeId = "storeId_example"; // The store id.
    String title = "title_example"; // The title that will show up in promotion campaign. Restricted to UTF-8 characters with max length of 100 bytes.
    OffsetDateTime startsAt = OffsetDateTime.now(); // The date and time when the promotion is in effect in ISO 8601 format.
    String endsAt = "endsAt_example"; // The date and time when the promotion ends. Must be after starts_at and in ISO 8601 format.
    Boolean enabled = true; // Whether the promo rule is currently enabled.
    OffsetDateTime createdAtForeign = OffsetDateTime.now(); // The date and time the promotion was created in ISO 8601 format.
    OffsetDateTime updatedAtForeign = OffsetDateTime.now(); // The date and time the promotion was updated in ISO 8601 format.
    try {
      EcommerceAddPromoRuleResponse result = client
              .ecommerce
              .addPromoRule(description, id, amount, type, target, storeId)
              .title(title)
              .startsAt(startsAt)
              .endsAt(endsAt)
              .enabled(enabled)
              .createdAtForeign(createdAtForeign)
              .updatedAtForeign(updatedAtForeign)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getStartsAt());
      System.out.println(result.getEndsAt());
      System.out.println(result.getAmount());
      System.out.println(result.getType());
      System.out.println(result.getTarget());
      System.out.println(result.getEnabled());
      System.out.println(result.getCreatedAtForeign());
      System.out.println(result.getUpdatedAtForeign());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#addPromoRule");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceAddPromoRuleResponse> response = client
              .ecommerce
              .addPromoRule(description, id, amount, type, target, storeId)
              .title(title)
              .startsAt(startsAt)
              .endsAt(endsAt)
              .enabled(enabled)
              .createdAtForeign(createdAtForeign)
              .updatedAtForeign(updatedAtForeign)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#addPromoRule");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **ecommerceAddPromoRuleRequest** | [**EcommerceAddPromoRuleRequest**](EcommerceAddPromoRuleRequest.md)|  | |

### Return type

[**EcommerceAddPromoRuleResponse**](EcommerceAddPromoRuleResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="addStoreToMailchimpAccount"></a>
# **addStoreToMailchimpAccount**
> EcommerceAddStoreToMailchimpAccountResponse addStoreToMailchimpAccount(ecommerceAddStoreToMailchimpAccountRequest).execute();

Add store

Add a new store to your Mailchimp account.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String id = "id_example"; // The unique identifier for the store.
    String listId = "listId_example"; // The unique identifier for the list associated with the store. The `list_id` for a specific store cannot change.
    String name = "name_example"; // The name of the store.
    String currencyCode = "currencyCode_example"; // The three-letter ISO 4217 code for the currency that the store accepts.
    String platform = "platform_example"; // The e-commerce platform of the store.
    String domain = "domain_example"; // The store domain. This parameter is required for Connected Sites and Google Ads.
    Boolean isSyncing = true; // Whether to disable automations because the store is currently [syncing](https://mailchimp.com/developer/marketing/docs/e-commerce/#pausing-store-automations).
    String emailAddress = "emailAddress_example"; // The email address for the store.
    String moneyFormat = "moneyFormat_example"; // The currency format for the store. For example: `$`, `£`, etc.
    String primaryLocale = "primaryLocale_example"; // The primary locale for the store. For example: `en`, `de`, etc.
    String timezone = "timezone_example"; // The timezone for the store.
    String phone = "phone_example"; // The store phone number.
    AddressProperty address = new AddressProperty();
    try {
      EcommerceAddStoreToMailchimpAccountResponse result = client
              .ecommerce
              .addStoreToMailchimpAccount(id, listId, name, currencyCode)
              .platform(platform)
              .domain(domain)
              .isSyncing(isSyncing)
              .emailAddress(emailAddress)
              .moneyFormat(moneyFormat)
              .primaryLocale(primaryLocale)
              .timezone(timezone)
              .phone(phone)
              .address(address)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getListId());
      System.out.println(result.getName());
      System.out.println(result.getPlatform());
      System.out.println(result.getDomain());
      System.out.println(result.getIsSyncing());
      System.out.println(result.getEmailAddress());
      System.out.println(result.getCurrencyCode());
      System.out.println(result.getMoneyFormat());
      System.out.println(result.getPrimaryLocale());
      System.out.println(result.getTimezone());
      System.out.println(result.getPhone());
      System.out.println(result.getAddress());
      System.out.println(result.getConnectedSite());
      System.out.println(result.getAutomations());
      System.out.println(result.getListIsActive());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#addStoreToMailchimpAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceAddStoreToMailchimpAccountResponse> response = client
              .ecommerce
              .addStoreToMailchimpAccount(id, listId, name, currencyCode)
              .platform(platform)
              .domain(domain)
              .isSyncing(isSyncing)
              .emailAddress(emailAddress)
              .moneyFormat(moneyFormat)
              .primaryLocale(primaryLocale)
              .timezone(timezone)
              .phone(phone)
              .address(address)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#addStoreToMailchimpAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ecommerceAddStoreToMailchimpAccountRequest** | [**EcommerceAddStoreToMailchimpAccountRequest**](EcommerceAddStoreToMailchimpAccountRequest.md)|  | |

### Return type

[**EcommerceAddStoreToMailchimpAccountResponse**](EcommerceAddStoreToMailchimpAccountResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="deleteCartLineItem"></a>
# **deleteCartLineItem**
> deleteCartLineItem(storeId, cartId, lineId).execute();

Delete cart line item

Delete a specific cart line item.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String cartId = "cartId_example"; // The id for the cart.
    String lineId = "lineId_example"; // The id for the line item of a cart.
    try {
      client
              .ecommerce
              .deleteCartLineItem(storeId, cartId, lineId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#deleteCartLineItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .ecommerce
              .deleteCartLineItem(storeId, cartId, lineId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#deleteCartLineItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **cartId** | **String**| The id for the cart. | |
| **lineId** | **String**| The id for the line item of a cart. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="deleteOrder"></a>
# **deleteOrder**
> deleteOrder(storeId, orderId).execute();

Delete order

Delete an order.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String orderId = "orderId_example"; // The id for the order in a store.
    try {
      client
              .ecommerce
              .deleteOrder(storeId, orderId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#deleteOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .ecommerce
              .deleteOrder(storeId, orderId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#deleteOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **orderId** | **String**| The id for the order in a store. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="deleteOrderLine"></a>
# **deleteOrderLine**
> deleteOrderLine(storeId, orderId, lineId).execute();

Delete order line item

Delete a specific order line item.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String orderId = "orderId_example"; // The id for the order in a store.
    String lineId = "lineId_example"; // The id for the line item of an order.
    try {
      client
              .ecommerce
              .deleteOrderLine(storeId, orderId, lineId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#deleteOrderLine");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .ecommerce
              .deleteOrderLine(storeId, orderId, lineId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#deleteOrderLine");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **orderId** | **String**| The id for the order in a store. | |
| **lineId** | **String**| The id for the line item of an order. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="deleteProduct"></a>
# **deleteProduct**
> deleteProduct(storeId, productId).execute();

Delete product

Delete a product.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String productId = "productId_example"; // The id for the product of a store.
    try {
      client
              .ecommerce
              .deleteProduct(storeId, productId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#deleteProduct");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .ecommerce
              .deleteProduct(storeId, productId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#deleteProduct");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **productId** | **String**| The id for the product of a store. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="deleteProductImage"></a>
# **deleteProductImage**
> deleteProductImage(storeId, productId, imageId).execute();

Delete product image

Delete a product image.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String productId = "productId_example"; // The id for the product of a store.
    String imageId = "imageId_example"; // The id for the product image.
    try {
      client
              .ecommerce
              .deleteProductImage(storeId, productId, imageId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#deleteProductImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .ecommerce
              .deleteProductImage(storeId, productId, imageId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#deleteProductImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **productId** | **String**| The id for the product of a store. | |
| **imageId** | **String**| The id for the product image. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="deleteProductVariant"></a>
# **deleteProductVariant**
> deleteProductVariant(storeId, productId, variantId).execute();

Delete product variant

Delete a product variant.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String productId = "productId_example"; // The id for the product of a store.
    String variantId = "variantId_example"; // The id for the product variant.
    try {
      client
              .ecommerce
              .deleteProductVariant(storeId, productId, variantId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#deleteProductVariant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .ecommerce
              .deleteProductVariant(storeId, productId, variantId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#deleteProductVariant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **productId** | **String**| The id for the product of a store. | |
| **variantId** | **String**| The id for the product variant. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="deletePromoCode"></a>
# **deletePromoCode**
> deletePromoCode(storeId, promoRuleId, promoCodeId).execute();

Delete promo code

Delete a promo code from a store.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String promoRuleId = "promoRuleId_example"; // The id for the promo rule of a store.
    String promoCodeId = "promoCodeId_example"; // The id for the promo code of a store.
    try {
      client
              .ecommerce
              .deletePromoCode(storeId, promoRuleId, promoCodeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#deletePromoCode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .ecommerce
              .deletePromoCode(storeId, promoRuleId, promoCodeId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#deletePromoCode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **promoRuleId** | **String**| The id for the promo rule of a store. | |
| **promoCodeId** | **String**| The id for the promo code of a store. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="deletePromoRule"></a>
# **deletePromoRule**
> deletePromoRule(storeId, promoRuleId).execute();

Delete promo rule

Delete a promo rule from a store.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String promoRuleId = "promoRuleId_example"; // The id for the promo rule of a store.
    try {
      client
              .ecommerce
              .deletePromoRule(storeId, promoRuleId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#deletePromoRule");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .ecommerce
              .deletePromoRule(storeId, promoRuleId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#deletePromoRule");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **promoRuleId** | **String**| The id for the promo rule of a store. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="deleteStore"></a>
# **deleteStore**
> Object deleteStore(storeId).execute();

Delete store

Delete a store. Deleting a store will also delete any associated subresources, including Customers, Orders, Products, and Carts.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    try {
      Object result = client
              .ecommerce
              .deleteStore(storeId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#deleteStore");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .ecommerce
              .deleteStore(storeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#deleteStore");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |

### Return type

**Object**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="getCartInfo"></a>
# **getCartInfo**
> EcommerceGetCartInfoResponse getCartInfo(storeId, cartId).fields(fields).excludeFields(excludeFields).execute();

Get cart info

Get information about a specific cart.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String cartId = "cartId_example"; // The id for the cart.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      EcommerceGetCartInfoResponse result = client
              .ecommerce
              .getCartInfo(storeId, cartId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCustomer());
      System.out.println(result.getCampaignId());
      System.out.println(result.getCheckoutUrl());
      System.out.println(result.getCurrencyCode());
      System.out.println(result.getOrderTotal());
      System.out.println(result.getTaxTotal());
      System.out.println(result.getLines());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getCartInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceGetCartInfoResponse> response = client
              .ecommerce
              .getCartInfo(storeId, cartId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getCartInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **cartId** | **String**| The id for the cart. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**EcommerceGetCartInfoResponse**](EcommerceGetCartInfoResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="getCartLineItem"></a>
# **getCartLineItem**
> EcommerceGetCartLineItemResponse getCartLineItem(storeId, cartId, lineId).fields(fields).excludeFields(excludeFields).execute();

Get cart line item

Get information about a specific cart line item.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String cartId = "cartId_example"; // The id for the cart.
    String lineId = "lineId_example"; // The id for the line item of a cart.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      EcommerceGetCartLineItemResponse result = client
              .ecommerce
              .getCartLineItem(storeId, cartId, lineId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getProductId());
      System.out.println(result.getProductTitle());
      System.out.println(result.getProductVariantId());
      System.out.println(result.getProductVariantTitle());
      System.out.println(result.getQuantity());
      System.out.println(result.getPrice());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getCartLineItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceGetCartLineItemResponse> response = client
              .ecommerce
              .getCartLineItem(storeId, cartId, lineId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getCartLineItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **cartId** | **String**| The id for the cart. | |
| **lineId** | **String**| The id for the line item of a cart. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**EcommerceGetCartLineItemResponse**](EcommerceGetCartLineItemResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="getCustomerInfo"></a>
# **getCustomerInfo**
> EcommerceGetCustomerInfoResponse getCustomerInfo(storeId, customerId).fields(fields).excludeFields(excludeFields).execute();

Get customer info

Get information about a specific customer.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String customerId = "customerId_example"; // The id for the customer of a store.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      EcommerceGetCustomerInfoResponse result = client
              .ecommerce
              .getCustomerInfo(storeId, customerId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEmailAddress());
      System.out.println(result.getOptInStatus());
      System.out.println(result.getCompany());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getOrdersCount());
      System.out.println(result.getTotalSpent());
      System.out.println(result.getAddress());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getCustomerInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceGetCustomerInfoResponse> response = client
              .ecommerce
              .getCustomerInfo(storeId, customerId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getCustomerInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **customerId** | **String**| The id for the customer of a store. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**EcommerceGetCustomerInfoResponse**](EcommerceGetCustomerInfoResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="getOrderLineItem"></a>
# **getOrderLineItem**
> EcommerceGetOrderLineItemResponse getOrderLineItem(storeId, orderId, lineId).fields(fields).excludeFields(excludeFields).execute();

Get order line item

Get information about a specific order line item.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String orderId = "orderId_example"; // The id for the order in a store.
    String lineId = "lineId_example"; // The id for the line item of an order.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      EcommerceGetOrderLineItemResponse result = client
              .ecommerce
              .getOrderLineItem(storeId, orderId, lineId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getProductId());
      System.out.println(result.getProductTitle());
      System.out.println(result.getProductVariantId());
      System.out.println(result.getProductVariantTitle());
      System.out.println(result.getImageUrl());
      System.out.println(result.getQuantity());
      System.out.println(result.getPrice());
      System.out.println(result.getDiscount());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getOrderLineItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceGetOrderLineItemResponse> response = client
              .ecommerce
              .getOrderLineItem(storeId, orderId, lineId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getOrderLineItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **orderId** | **String**| The id for the order in a store. | |
| **lineId** | **String**| The id for the line item of an order. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**EcommerceGetOrderLineItemResponse**](EcommerceGetOrderLineItemResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="getProductImageInfo"></a>
# **getProductImageInfo**
> EcommerceGetProductImageInfoResponse getProductImageInfo(storeId, productId, imageId).fields(fields).excludeFields(excludeFields).execute();

Get product image info

Get information about a specific product image.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String productId = "productId_example"; // The id for the product of a store.
    String imageId = "imageId_example"; // The id for the product image.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      EcommerceGetProductImageInfoResponse result = client
              .ecommerce
              .getProductImageInfo(storeId, productId, imageId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUrl());
      System.out.println(result.getVariantIds());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getProductImageInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceGetProductImageInfoResponse> response = client
              .ecommerce
              .getProductImageInfo(storeId, productId, imageId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getProductImageInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **productId** | **String**| The id for the product of a store. | |
| **imageId** | **String**| The id for the product image. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**EcommerceGetProductImageInfoResponse**](EcommerceGetProductImageInfoResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="getProductImages"></a>
# **getProductImages**
> EcommerceGetProductImagesResponse getProductImages(storeId, productId).fields(fields).excludeFields(excludeFields).count(count).offset(offset).execute();

List product images

Get information about a product&#39;s images.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String productId = "productId_example"; // The id for the product of a store.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    try {
      EcommerceGetProductImagesResponse result = client
              .ecommerce
              .getProductImages(storeId, productId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getStoreId());
      System.out.println(result.getProductId());
      System.out.println(result.getImages());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getProductImages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceGetProductImagesResponse> response = client
              .ecommerce
              .getProductImages(storeId, productId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getProductImages");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **productId** | **String**| The id for the product of a store. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |

### Return type

[**EcommerceGetProductImagesResponse**](EcommerceGetProductImagesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="getProductVariantInfo"></a>
# **getProductVariantInfo**
> EcommerceGetProductVariantInfoResponse getProductVariantInfo(storeId, productId, variantId).fields(fields).excludeFields(excludeFields).execute();

Get product variant info

Get information about a specific product variant.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String productId = "productId_example"; // The id for the product of a store.
    String variantId = "variantId_example"; // The id for the product variant.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      EcommerceGetProductVariantInfoResponse result = client
              .ecommerce
              .getProductVariantInfo(storeId, productId, variantId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getId());
      System.out.println(result.getUrl());
      System.out.println(result.getSku());
      System.out.println(result.getPrice());
      System.out.println(result.getInventoryQuantity());
      System.out.println(result.getImageUrl());
      System.out.println(result.getBackorders());
      System.out.println(result.getVisibility());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getProductVariantInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceGetProductVariantInfoResponse> response = client
              .ecommerce
              .getProductVariantInfo(storeId, productId, variantId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getProductVariantInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **productId** | **String**| The id for the product of a store. | |
| **variantId** | **String**| The id for the product variant. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**EcommerceGetProductVariantInfoResponse**](EcommerceGetProductVariantInfoResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="getPromoCode"></a>
# **getPromoCode**
> EcommerceGetPromoCodeResponse getPromoCode(storeId, promoRuleId, promoCodeId).fields(fields).excludeFields(excludeFields).execute();

Get promo code

Get information about a specific promo code.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String promoRuleId = "promoRuleId_example"; // The id for the promo rule of a store.
    String promoCodeId = "promoCodeId_example"; // The id for the promo code of a store.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      EcommerceGetPromoCodeResponse result = client
              .ecommerce
              .getPromoCode(storeId, promoRuleId, promoCodeId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCode());
      System.out.println(result.getRedemptionUrl());
      System.out.println(result.getUsageCount());
      System.out.println(result.getEnabled());
      System.out.println(result.getCreatedAtForeign());
      System.out.println(result.getUpdatedAtForeign());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getPromoCode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceGetPromoCodeResponse> response = client
              .ecommerce
              .getPromoCode(storeId, promoRuleId, promoCodeId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getPromoCode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **promoRuleId** | **String**| The id for the promo rule of a store. | |
| **promoCodeId** | **String**| The id for the promo code of a store. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**EcommerceGetPromoCodeResponse**](EcommerceGetPromoCodeResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="getStoreCarts"></a>
# **getStoreCarts**
> EcommerceGetStoreCartsResponse getStoreCarts(storeId).fields(fields).excludeFields(excludeFields).count(count).offset(offset).execute();

List carts

Get information about a store&#39;s carts.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    try {
      EcommerceGetStoreCartsResponse result = client
              .ecommerce
              .getStoreCarts(storeId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getStoreId());
      System.out.println(result.getCarts());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getStoreCarts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceGetStoreCartsResponse> response = client
              .ecommerce
              .getStoreCarts(storeId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getStoreCarts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |

### Return type

[**EcommerceGetStoreCartsResponse**](EcommerceGetStoreCartsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="getStoreCustomers"></a>
# **getStoreCustomers**
> EcommerceGetStoreCustomersResponse getStoreCustomers(storeId).fields(fields).excludeFields(excludeFields).count(count).offset(offset).emailAddress(emailAddress).execute();

List customers

Get information about a store&#39;s customers.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    String emailAddress = "emailAddress_example"; // Restrict the response to customers with the email address.
    try {
      EcommerceGetStoreCustomersResponse result = client
              .ecommerce
              .getStoreCustomers(storeId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .emailAddress(emailAddress)
              .execute();
      System.out.println(result);
      System.out.println(result.getStoreId());
      System.out.println(result.getCustomers());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getStoreCustomers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceGetStoreCustomersResponse> response = client
              .ecommerce
              .getStoreCustomers(storeId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .emailAddress(emailAddress)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getStoreCustomers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **emailAddress** | **String**| Restrict the response to customers with the email address. | [optional] |

### Return type

[**EcommerceGetStoreCustomersResponse**](EcommerceGetStoreCustomersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="getStoreInfo"></a>
# **getStoreInfo**
> EcommerceGetStoreInfoResponse getStoreInfo(storeId).fields(fields).excludeFields(excludeFields).execute();

Get store info

Get information about a specific store.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      EcommerceGetStoreInfoResponse result = client
              .ecommerce
              .getStoreInfo(storeId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getListId());
      System.out.println(result.getName());
      System.out.println(result.getPlatform());
      System.out.println(result.getDomain());
      System.out.println(result.getIsSyncing());
      System.out.println(result.getEmailAddress());
      System.out.println(result.getCurrencyCode());
      System.out.println(result.getMoneyFormat());
      System.out.println(result.getPrimaryLocale());
      System.out.println(result.getTimezone());
      System.out.println(result.getPhone());
      System.out.println(result.getAddress());
      System.out.println(result.getConnectedSite());
      System.out.println(result.getAutomations());
      System.out.println(result.getListIsActive());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getStoreInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceGetStoreInfoResponse> response = client
              .ecommerce
              .getStoreInfo(storeId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getStoreInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**EcommerceGetStoreInfoResponse**](EcommerceGetStoreInfoResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="getStoreOrderInfo"></a>
# **getStoreOrderInfo**
> EcommerceGetStoreOrderInfoResponse getStoreOrderInfo(storeId, orderId).fields(fields).excludeFields(excludeFields).execute();

Get order info

Get information about a specific order.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String orderId = "orderId_example"; // The id for the order in a store.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      EcommerceGetStoreOrderInfoResponse result = client
              .ecommerce
              .getStoreOrderInfo(storeId, orderId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCustomer());
      System.out.println(result.getStoreId());
      System.out.println(result.getCampaignId());
      System.out.println(result.getLandingSite());
      System.out.println(result.getFinancialStatus());
      System.out.println(result.getFulfillmentStatus());
      System.out.println(result.getCurrencyCode());
      System.out.println(result.getOrderTotal());
      System.out.println(result.getOrderUrl());
      System.out.println(result.getDiscountTotal());
      System.out.println(result.getTaxTotal());
      System.out.println(result.getShippingTotal());
      System.out.println(result.getTrackingCode());
      System.out.println(result.getProcessedAtForeign());
      System.out.println(result.getCancelledAtForeign());
      System.out.println(result.getUpdatedAtForeign());
      System.out.println(result.getShippingAddress());
      System.out.println(result.getBillingAddress());
      System.out.println(result.getPromos());
      System.out.println(result.getLines());
      System.out.println(result.getOutreach());
      System.out.println(result.getTrackingNumber());
      System.out.println(result.getTrackingCarrier());
      System.out.println(result.getTrackingUrl());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getStoreOrderInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceGetStoreOrderInfoResponse> response = client
              .ecommerce
              .getStoreOrderInfo(storeId, orderId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getStoreOrderInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **orderId** | **String**| The id for the order in a store. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**EcommerceGetStoreOrderInfoResponse**](EcommerceGetStoreOrderInfoResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="getStoreOrderLines"></a>
# **getStoreOrderLines**
> EcommerceGetStoreOrderLinesResponse getStoreOrderLines(storeId, orderId).fields(fields).excludeFields(excludeFields).count(count).offset(offset).execute();

List order line items

Get information about an order&#39;s line items.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String orderId = "orderId_example"; // The id for the order in a store.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    try {
      EcommerceGetStoreOrderLinesResponse result = client
              .ecommerce
              .getStoreOrderLines(storeId, orderId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getStoreId());
      System.out.println(result.getOrderId());
      System.out.println(result.getLines());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getStoreOrderLines");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceGetStoreOrderLinesResponse> response = client
              .ecommerce
              .getStoreOrderLines(storeId, orderId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getStoreOrderLines");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **orderId** | **String**| The id for the order in a store. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |

### Return type

[**EcommerceGetStoreOrderLinesResponse**](EcommerceGetStoreOrderLinesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="getStoreProductInfo"></a>
# **getStoreProductInfo**
> EcommerceGetStoreProductInfoResponse getStoreProductInfo(storeId, productId).fields(fields).excludeFields(excludeFields).execute();

Get product info

Get information about a specific product.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String productId = "productId_example"; // The id for the product of a store.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      EcommerceGetStoreProductInfoResponse result = client
              .ecommerce
              .getStoreProductInfo(storeId, productId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getCurrencyCode());
      System.out.println(result.getHandle());
      System.out.println(result.getUrl());
      System.out.println(result.getType());
      System.out.println(result.getVendor());
      System.out.println(result.getImageUrl());
      System.out.println(result.getVariants());
      System.out.println(result.getImages());
      System.out.println(result.getPublishedAtForeign());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getStoreProductInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceGetStoreProductInfoResponse> response = client
              .ecommerce
              .getStoreProductInfo(storeId, productId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getStoreProductInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **productId** | **String**| The id for the product of a store. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**EcommerceGetStoreProductInfoResponse**](EcommerceGetStoreProductInfoResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="getStoreProducts"></a>
# **getStoreProducts**
> EcommerceGetStoreProductsResponse getStoreProducts(storeId).fields(fields).excludeFields(excludeFields).count(count).offset(offset).execute();

List product

Get information about a store&#39;s products.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    try {
      EcommerceGetStoreProductsResponse result = client
              .ecommerce
              .getStoreProducts(storeId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getStoreId());
      System.out.println(result.getProducts());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getStoreProducts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceGetStoreProductsResponse> response = client
              .ecommerce
              .getStoreProducts(storeId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getStoreProducts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |

### Return type

[**EcommerceGetStoreProductsResponse**](EcommerceGetStoreProductsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="getStorePromoCodes"></a>
# **getStorePromoCodes**
> EcommerceGetStorePromoCodesResponse getStorePromoCodes(promoRuleId, storeId).fields(fields).excludeFields(excludeFields).count(count).offset(offset).execute();

List promo codes

Get information about a store&#39;s promo codes.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String promoRuleId = "promoRuleId_example"; // The id for the promo rule of a store.
    String storeId = "storeId_example"; // The store id.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    try {
      EcommerceGetStorePromoCodesResponse result = client
              .ecommerce
              .getStorePromoCodes(promoRuleId, storeId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getStoreId());
      System.out.println(result.getPromoCodes());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getStorePromoCodes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceGetStorePromoCodesResponse> response = client
              .ecommerce
              .getStorePromoCodes(promoRuleId, storeId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getStorePromoCodes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **promoRuleId** | **String**| The id for the promo rule of a store. | |
| **storeId** | **String**| The store id. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |

### Return type

[**EcommerceGetStorePromoCodesResponse**](EcommerceGetStorePromoCodesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="getStorePromoRule"></a>
# **getStorePromoRule**
> EcommerceGetStorePromoRuleResponse getStorePromoRule(storeId, promoRuleId).fields(fields).excludeFields(excludeFields).execute();

Get promo rule

Get information about a specific promo rule.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String promoRuleId = "promoRuleId_example"; // The id for the promo rule of a store.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    try {
      EcommerceGetStorePromoRuleResponse result = client
              .ecommerce
              .getStorePromoRule(storeId, promoRuleId)
              .fields(fields)
              .excludeFields(excludeFields)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getStartsAt());
      System.out.println(result.getEndsAt());
      System.out.println(result.getAmount());
      System.out.println(result.getType());
      System.out.println(result.getTarget());
      System.out.println(result.getEnabled());
      System.out.println(result.getCreatedAtForeign());
      System.out.println(result.getUpdatedAtForeign());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getStorePromoRule");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceGetStorePromoRuleResponse> response = client
              .ecommerce
              .getStorePromoRule(storeId, promoRuleId)
              .fields(fields)
              .excludeFields(excludeFields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getStorePromoRule");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **promoRuleId** | **String**| The id for the promo rule of a store. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |

### Return type

[**EcommerceGetStorePromoRuleResponse**](EcommerceGetStorePromoRuleResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="getStorePromoRules"></a>
# **getStorePromoRules**
> EcommerceGetStorePromoRulesResponse getStorePromoRules(storeId).fields(fields).excludeFields(excludeFields).count(count).offset(offset).execute();

List promo rules

Get information about a store&#39;s promo rules.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    try {
      EcommerceGetStorePromoRulesResponse result = client
              .ecommerce
              .getStorePromoRules(storeId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getStoreId());
      System.out.println(result.getPromoRules());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getStorePromoRules");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceGetStorePromoRulesResponse> response = client
              .ecommerce
              .getStorePromoRules(storeId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getStorePromoRules");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |

### Return type

[**EcommerceGetStorePromoRulesResponse**](EcommerceGetStorePromoRulesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="listAccountOrders"></a>
# **listAccountOrders**
> EcommerceListAccountOrdersResponse listAccountOrders().fields(fields).excludeFields(excludeFields).count(count).offset(offset).campaignId(campaignId).outreachId(outreachId).customerId(customerId).hasOutreach(hasOutreach).execute();

List account orders

Get information about an account&#39;s orders.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    String campaignId = "campaignId_example"; // Restrict results to orders with a specific `campaign_id` value.
    String outreachId = "outreachId_example"; // Restrict results to orders with a specific `outreach_id` value.
    String customerId = "customerId_example"; // Restrict results to orders made by a specific customer.
    Boolean hasOutreach = true; // Restrict results to orders that have an outreach attached. For example, an email campaign or Facebook ad.
    try {
      EcommerceListAccountOrdersResponse result = client
              .ecommerce
              .listAccountOrders()
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .campaignId(campaignId)
              .outreachId(outreachId)
              .customerId(customerId)
              .hasOutreach(hasOutreach)
              .execute();
      System.out.println(result);
      System.out.println(result.getOrders());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#listAccountOrders");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceListAccountOrdersResponse> response = client
              .ecommerce
              .listAccountOrders()
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .campaignId(campaignId)
              .outreachId(outreachId)
              .customerId(customerId)
              .hasOutreach(hasOutreach)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#listAccountOrders");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **campaignId** | **String**| Restrict results to orders with a specific &#x60;campaign_id&#x60; value. | [optional] |
| **outreachId** | **String**| Restrict results to orders with a specific &#x60;outreach_id&#x60; value. | [optional] |
| **customerId** | **String**| Restrict results to orders made by a specific customer. | [optional] |
| **hasOutreach** | **Boolean**| Restrict results to orders that have an outreach attached. For example, an email campaign or Facebook ad. | [optional] |

### Return type

[**EcommerceListAccountOrdersResponse**](EcommerceListAccountOrdersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="listCartLines"></a>
# **listCartLines**
> EcommerceListCartLinesResponse listCartLines(storeId, cartId).fields(fields).excludeFields(excludeFields).count(count).offset(offset).execute();

List cart line items

Get information about a cart&#39;s line items.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String cartId = "cartId_example"; // The id for the cart.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    try {
      EcommerceListCartLinesResponse result = client
              .ecommerce
              .listCartLines(storeId, cartId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getStoreId());
      System.out.println(result.getCartId());
      System.out.println(result.getLines());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#listCartLines");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceListCartLinesResponse> response = client
              .ecommerce
              .listCartLines(storeId, cartId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#listCartLines");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **cartId** | **String**| The id for the cart. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |

### Return type

[**EcommerceListCartLinesResponse**](EcommerceListCartLinesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="listProductVariants"></a>
# **listProductVariants**
> EcommerceListProductVariantsResponse listProductVariants(storeId, productId).fields(fields).excludeFields(excludeFields).count(count).offset(offset).execute();

List product variants

Get information about a product&#39;s variants.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String productId = "productId_example"; // The id for the product of a store.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    try {
      EcommerceListProductVariantsResponse result = client
              .ecommerce
              .listProductVariants(storeId, productId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getStoreId());
      System.out.println(result.getProductId());
      System.out.println(result.getVariants());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#listProductVariants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceListProductVariantsResponse> response = client
              .ecommerce
              .listProductVariants(storeId, productId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#listProductVariants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **productId** | **String**| The id for the product of a store. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |

### Return type

[**EcommerceListProductVariantsResponse**](EcommerceListProductVariantsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="listStoreOrders"></a>
# **listStoreOrders**
> EcommerceListStoreOrdersResponse listStoreOrders(storeId).fields(fields).excludeFields(excludeFields).count(count).offset(offset).customerId(customerId).hasOutreach(hasOutreach).campaignId(campaignId).outreachId(outreachId).execute();

List orders

Get information about a store&#39;s orders.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    String customerId = "customerId_example"; // Restrict results to orders made by a specific customer.
    Boolean hasOutreach = true; // Restrict results to orders that have an outreach attached. For example, an email campaign or Facebook ad.
    String campaignId = "campaignId_example"; // Restrict results to orders with a specific `campaign_id` value.
    String outreachId = "outreachId_example"; // Restrict results to orders with a specific `outreach_id` value.
    try {
      EcommerceListStoreOrdersResponse result = client
              .ecommerce
              .listStoreOrders(storeId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .customerId(customerId)
              .hasOutreach(hasOutreach)
              .campaignId(campaignId)
              .outreachId(outreachId)
              .execute();
      System.out.println(result);
      System.out.println(result.getStoreId());
      System.out.println(result.getOrders());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#listStoreOrders");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceListStoreOrdersResponse> response = client
              .ecommerce
              .listStoreOrders(storeId)
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .customerId(customerId)
              .hasOutreach(hasOutreach)
              .campaignId(campaignId)
              .outreachId(outreachId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#listStoreOrders");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |
| **customerId** | **String**| Restrict results to orders made by a specific customer. | [optional] |
| **hasOutreach** | **Boolean**| Restrict results to orders that have an outreach attached. For example, an email campaign or Facebook ad. | [optional] |
| **campaignId** | **String**| Restrict results to orders with a specific &#x60;campaign_id&#x60; value. | [optional] |
| **outreachId** | **String**| Restrict results to orders with a specific &#x60;outreach_id&#x60; value. | [optional] |

### Return type

[**EcommerceListStoreOrdersResponse**](EcommerceListStoreOrdersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="listStores"></a>
# **listStores**
> EcommerceListStoresResponse listStores().fields(fields).excludeFields(excludeFields).count(count).offset(offset).execute();

List stores

Get information about all stores in the account.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    List<String> fields = Arrays.asList(); // A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    List<String> excludeFields = Arrays.asList(); // A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    Integer count = 10; // The number of records to return. Default value is 10. Maximum value is 1000
    Integer offset = 0; // Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0.
    try {
      EcommerceListStoresResponse result = client
              .ecommerce
              .listStores()
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .execute();
      System.out.println(result);
      System.out.println(result.getStores());
      System.out.println(result.getTotalItems());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#listStores");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceListStoresResponse> response = client
              .ecommerce
              .listStores()
              .fields(fields)
              .excludeFields(excludeFields)
              .count(count)
              .offset(offset)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#listStores");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation. | [optional] |
| **excludeFields** | [**List&lt;String&gt;**](String.md)| A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation. | [optional] |
| **count** | **Integer**| The number of records to return. Default value is 10. Maximum value is 1000 | [optional] [default to 10] |
| **offset** | **Integer**| Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip. Default value is 0. | [optional] [default to 0] |

### Return type

[**EcommerceListStoresResponse**](EcommerceListStoresResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="removeCart"></a>
# **removeCart**
> removeCart(storeId, cartId).execute();

Delete cart

Delete a cart.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String cartId = "cartId_example"; // The id for the cart.
    try {
      client
              .ecommerce
              .removeCart(storeId, cartId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#removeCart");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .ecommerce
              .removeCart(storeId, cartId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#removeCart");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **cartId** | **String**| The id for the cart. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="removeCustomer"></a>
# **removeCustomer**
> removeCustomer(storeId, customerId).execute();

Delete customer

Delete a customer from a store.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String customerId = "customerId_example"; // The id for the customer of a store.
    try {
      client
              .ecommerce
              .removeCustomer(storeId, customerId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#removeCustomer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .ecommerce
              .removeCustomer(storeId, customerId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#removeCustomer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **customerId** | **String**| The id for the customer of a store. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Empty Response |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="updateCartById"></a>
# **updateCartById**
> EcommerceUpdateCartByIdResponse updateCartById(storeId, cartId, ecommerceUpdateCartByIdRequest).execute();

Update cart

Update a specific cart.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String cartId = "cartId_example"; // The id for the cart.
    ECommerceCustomerProperty1 customer = new ECommerceCustomerProperty1();
    String campaignId = "campaignId_example"; // A string that uniquely identifies the campaign associated with a cart.
    String checkoutUrl = "checkoutUrl_example"; // The URL for the cart. This parameter is required for [Abandoned Cart](https://mailchimp.com/help/create-an-abandoned-cart-email/) automations.
    String currencyCode = "currencyCode_example"; // The three-letter ISO 4217 code for the currency that the cart uses.
    Double orderTotal = 3.4D; // The order total for the cart.
    Double taxTotal = 3.4D; // The total tax for the cart.
    List<ECommerceCartLineItem1> lines = Arrays.asList(); // An array of the cart's line items.
    try {
      EcommerceUpdateCartByIdResponse result = client
              .ecommerce
              .updateCartById(storeId, cartId)
              .customer(customer)
              .campaignId(campaignId)
              .checkoutUrl(checkoutUrl)
              .currencyCode(currencyCode)
              .orderTotal(orderTotal)
              .taxTotal(taxTotal)
              .lines(lines)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCustomer());
      System.out.println(result.getCampaignId());
      System.out.println(result.getCheckoutUrl());
      System.out.println(result.getCurrencyCode());
      System.out.println(result.getOrderTotal());
      System.out.println(result.getTaxTotal());
      System.out.println(result.getLines());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#updateCartById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceUpdateCartByIdResponse> response = client
              .ecommerce
              .updateCartById(storeId, cartId)
              .customer(customer)
              .campaignId(campaignId)
              .checkoutUrl(checkoutUrl)
              .currencyCode(currencyCode)
              .orderTotal(orderTotal)
              .taxTotal(taxTotal)
              .lines(lines)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#updateCartById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **cartId** | **String**| The id for the cart. | |
| **ecommerceUpdateCartByIdRequest** | [**EcommerceUpdateCartByIdRequest**](EcommerceUpdateCartByIdRequest.md)|  | |

### Return type

[**EcommerceUpdateCartByIdResponse**](EcommerceUpdateCartByIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="updateCartLineItem"></a>
# **updateCartLineItem**
> EcommerceUpdateCartLineItemResponse updateCartLineItem(storeId, cartId, lineId, ecommerceUpdateCartLineItemRequest).execute();

Update cart line item

Update a specific cart line item.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String cartId = "cartId_example"; // The id for the cart.
    String lineId = "lineId_example"; // The id for the line item of a cart.
    String productId = "productId_example"; // A unique identifier for the product associated with the cart line item.
    String productVariantId = "productVariantId_example"; // A unique identifier for the product variant associated with the cart line item.
    Integer quantity = 56; // The quantity of a cart line item.
    Double price = 3.4D; // The price of a cart line item.
    try {
      EcommerceUpdateCartLineItemResponse result = client
              .ecommerce
              .updateCartLineItem(storeId, cartId, lineId)
              .productId(productId)
              .productVariantId(productVariantId)
              .quantity(quantity)
              .price(price)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getProductId());
      System.out.println(result.getProductTitle());
      System.out.println(result.getProductVariantId());
      System.out.println(result.getProductVariantTitle());
      System.out.println(result.getQuantity());
      System.out.println(result.getPrice());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#updateCartLineItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceUpdateCartLineItemResponse> response = client
              .ecommerce
              .updateCartLineItem(storeId, cartId, lineId)
              .productId(productId)
              .productVariantId(productVariantId)
              .quantity(quantity)
              .price(price)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#updateCartLineItem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **cartId** | **String**| The id for the cart. | |
| **lineId** | **String**| The id for the line item of a cart. | |
| **ecommerceUpdateCartLineItemRequest** | [**EcommerceUpdateCartLineItemRequest**](EcommerceUpdateCartLineItemRequest.md)|  | |

### Return type

[**EcommerceUpdateCartLineItemResponse**](EcommerceUpdateCartLineItemResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="updateCustomer"></a>
# **updateCustomer**
> EcommerceUpdateCustomerResponse updateCustomer(storeId, customerId, ecommerceUpdateCustomerRequest).execute();

Update customer

Update a customer.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String customerId = "customerId_example"; // The id for the customer of a store.
    Boolean optInStatus = true; // The customer's opt-in status. This value will never overwrite the opt-in status of a pre-existing Mailchimp list member, but will apply to list members that are added through the e-commerce API endpoints. Customers who don't opt in to your Mailchimp list [will be added as `Transactional` members](https://mailchimp.com/developer/marketing/docs/e-commerce/#customers).
    String company = "company_example"; // The customer's company.
    String firstName = "firstName_example"; // The customer's first name.
    String lastName = "lastName_example"; // The customer's last name.
    AddressProperty5 address = new AddressProperty5();
    try {
      EcommerceUpdateCustomerResponse result = client
              .ecommerce
              .updateCustomer(storeId, customerId)
              .optInStatus(optInStatus)
              .company(company)
              .firstName(firstName)
              .lastName(lastName)
              .address(address)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEmailAddress());
      System.out.println(result.getOptInStatus());
      System.out.println(result.getCompany());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getOrdersCount());
      System.out.println(result.getTotalSpent());
      System.out.println(result.getAddress());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#updateCustomer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceUpdateCustomerResponse> response = client
              .ecommerce
              .updateCustomer(storeId, customerId)
              .optInStatus(optInStatus)
              .company(company)
              .firstName(firstName)
              .lastName(lastName)
              .address(address)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#updateCustomer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **customerId** | **String**| The id for the customer of a store. | |
| **ecommerceUpdateCustomerRequest** | [**EcommerceUpdateCustomerRequest**](EcommerceUpdateCustomerRequest.md)|  | |

### Return type

[**EcommerceUpdateCustomerResponse**](EcommerceUpdateCustomerResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="updateOrderLine"></a>
# **updateOrderLine**
> EcommerceUpdateOrderLineResponse updateOrderLine(storeId, orderId, lineId, ecommerceUpdateOrderLineRequest).execute();

Update order line item

Update a specific order line item.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String orderId = "orderId_example"; // The id for the order in a store.
    String lineId = "lineId_example"; // The id for the line item of an order.
    String productId = "productId_example"; // A unique identifier for the product associated with the order line item.
    String productVariantId = "productVariantId_example"; // A unique identifier for the product variant associated with the order line item.
    Integer quantity = 56; // The quantity of an order line item.
    Double price = 3.4D; // The price of an order line item.
    Double discount = 3.4D; // The total discount amount applied to this line item.
    try {
      EcommerceUpdateOrderLineResponse result = client
              .ecommerce
              .updateOrderLine(storeId, orderId, lineId)
              .productId(productId)
              .productVariantId(productVariantId)
              .quantity(quantity)
              .price(price)
              .discount(discount)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getProductId());
      System.out.println(result.getProductTitle());
      System.out.println(result.getProductVariantId());
      System.out.println(result.getProductVariantTitle());
      System.out.println(result.getImageUrl());
      System.out.println(result.getQuantity());
      System.out.println(result.getPrice());
      System.out.println(result.getDiscount());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#updateOrderLine");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceUpdateOrderLineResponse> response = client
              .ecommerce
              .updateOrderLine(storeId, orderId, lineId)
              .productId(productId)
              .productVariantId(productVariantId)
              .quantity(quantity)
              .price(price)
              .discount(discount)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#updateOrderLine");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **orderId** | **String**| The id for the order in a store. | |
| **lineId** | **String**| The id for the line item of an order. | |
| **ecommerceUpdateOrderLineRequest** | [**EcommerceUpdateOrderLineRequest**](EcommerceUpdateOrderLineRequest.md)|  | |

### Return type

[**EcommerceUpdateOrderLineResponse**](EcommerceUpdateOrderLineResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="updateProduct"></a>
# **updateProduct**
> EcommerceUpdateProductResponse updateProduct(storeId, productId, ecommerceUpdateProductRequest).execute();

Update product

Update a specific product.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String productId = "productId_example"; // The id for the product of a store.
    String title = "title_example"; // The title of a product.
    String description = "description_example"; // The description of a product.
    String handle = "handle_example"; // The handle of a product.
    String url = "url_example"; // The URL for a product.
    String type = "type_example"; // The type of product.
    String vendor = "vendor_example"; // The vendor for a product.
    String imageUrl = "imageUrl_example"; // The image URL for a product.
    List<ECommerceProductVariant1> variants = Arrays.asList(); // An array of the product's variants. At least one variant is required for each product. A variant can use the same `id` and `title` as the parent product.
    List<ECommerceProductImage1> images = Arrays.asList(); // An array of the product's images.
    OffsetDateTime publishedAtForeign = OffsetDateTime.now(); // The date and time the product was published in ISO 8601 format.
    try {
      EcommerceUpdateProductResponse result = client
              .ecommerce
              .updateProduct(storeId, productId)
              .title(title)
              .description(description)
              .handle(handle)
              .url(url)
              .type(type)
              .vendor(vendor)
              .imageUrl(imageUrl)
              .variants(variants)
              .images(images)
              .publishedAtForeign(publishedAtForeign)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getCurrencyCode());
      System.out.println(result.getHandle());
      System.out.println(result.getUrl());
      System.out.println(result.getType());
      System.out.println(result.getVendor());
      System.out.println(result.getImageUrl());
      System.out.println(result.getVariants());
      System.out.println(result.getImages());
      System.out.println(result.getPublishedAtForeign());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#updateProduct");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceUpdateProductResponse> response = client
              .ecommerce
              .updateProduct(storeId, productId)
              .title(title)
              .description(description)
              .handle(handle)
              .url(url)
              .type(type)
              .vendor(vendor)
              .imageUrl(imageUrl)
              .variants(variants)
              .images(images)
              .publishedAtForeign(publishedAtForeign)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#updateProduct");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **productId** | **String**| The id for the product of a store. | |
| **ecommerceUpdateProductRequest** | [**EcommerceUpdateProductRequest**](EcommerceUpdateProductRequest.md)|  | |

### Return type

[**EcommerceUpdateProductResponse**](EcommerceUpdateProductResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="updateProductImage"></a>
# **updateProductImage**
> EcommerceUpdateProductImageResponse updateProductImage(storeId, productId, imageId, ecommerceUpdateProductImageRequest).execute();

Update product image

Update a product image.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String productId = "productId_example"; // The id for the product of a store.
    String imageId = "imageId_example"; // The id for the product image.
    String id = "id_example"; // A unique identifier for the product image.
    String url = "url_example"; // The URL for a product image.
    List<String> variantIds = Arrays.asList(); // The list of product variants using the image.
    try {
      EcommerceUpdateProductImageResponse result = client
              .ecommerce
              .updateProductImage(storeId, productId, imageId)
              .id(id)
              .url(url)
              .variantIds(variantIds)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUrl());
      System.out.println(result.getVariantIds());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#updateProductImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceUpdateProductImageResponse> response = client
              .ecommerce
              .updateProductImage(storeId, productId, imageId)
              .id(id)
              .url(url)
              .variantIds(variantIds)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#updateProductImage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **productId** | **String**| The id for the product of a store. | |
| **imageId** | **String**| The id for the product image. | |
| **ecommerceUpdateProductImageRequest** | [**EcommerceUpdateProductImageRequest**](EcommerceUpdateProductImageRequest.md)|  | |

### Return type

[**EcommerceUpdateProductImageResponse**](EcommerceUpdateProductImageResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="updateProductVariant"></a>
# **updateProductVariant**
> EcommerceUpdateProductVariantResponse updateProductVariant(storeId, productId, variantId, ecommerceUpdateProductVariantRequest).execute();

Update product variant

Update a product variant.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String productId = "productId_example"; // The id for the product of a store.
    String variantId = "variantId_example"; // The id for the product variant.
    String title = "title_example"; // The title of a product variant.
    String url = "url_example"; // The URL for a product variant.
    String sku = "sku_example"; // The stock keeping unit (SKU) of a product variant.
    Double price = 3.4D; // The price of a product variant.
    Integer inventoryQuantity = 56; // The inventory quantity of a product variant.
    String imageUrl = "imageUrl_example"; // The image URL for a product variant.
    String backorders = "backorders_example"; // The backorders of a product variant.
    String visibility = "visibility_example"; // The visibility of a product variant.
    try {
      EcommerceUpdateProductVariantResponse result = client
              .ecommerce
              .updateProductVariant(storeId, productId, variantId)
              .title(title)
              .url(url)
              .sku(sku)
              .price(price)
              .inventoryQuantity(inventoryQuantity)
              .imageUrl(imageUrl)
              .backorders(backorders)
              .visibility(visibility)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getId());
      System.out.println(result.getUrl());
      System.out.println(result.getSku());
      System.out.println(result.getPrice());
      System.out.println(result.getInventoryQuantity());
      System.out.println(result.getImageUrl());
      System.out.println(result.getBackorders());
      System.out.println(result.getVisibility());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#updateProductVariant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceUpdateProductVariantResponse> response = client
              .ecommerce
              .updateProductVariant(storeId, productId, variantId)
              .title(title)
              .url(url)
              .sku(sku)
              .price(price)
              .inventoryQuantity(inventoryQuantity)
              .imageUrl(imageUrl)
              .backorders(backorders)
              .visibility(visibility)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#updateProductVariant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **productId** | **String**| The id for the product of a store. | |
| **variantId** | **String**| The id for the product variant. | |
| **ecommerceUpdateProductVariantRequest** | [**EcommerceUpdateProductVariantRequest**](EcommerceUpdateProductVariantRequest.md)|  | |

### Return type

[**EcommerceUpdateProductVariantResponse**](EcommerceUpdateProductVariantResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="updatePromoCode"></a>
# **updatePromoCode**
> EcommerceUpdatePromoCodeResponse updatePromoCode(storeId, promoRuleId, promoCodeId, ecommerceUpdatePromoCodeRequest).execute();

Update promo code

Update a promo code.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String promoRuleId = "promoRuleId_example"; // The id for the promo rule of a store.
    String promoCodeId = "promoCodeId_example"; // The id for the promo code of a store.
    String code = "code_example"; // The discount code. Restricted to UTF-8 characters with max length 50.
    String redemptionUrl = "redemptionUrl_example"; // The url that should be used in the promotion campaign restricted to UTF-8 characters with max length 2000.
    Integer usageCount = 56; // Number of times promo code has been used.
    Boolean enabled = true; // Whether the promo code is currently enabled.
    OffsetDateTime createdAtForeign = OffsetDateTime.now(); // The date and time the promotion was created in ISO 8601 format.
    OffsetDateTime updatedAtForeign = OffsetDateTime.now(); // The date and time the promotion was updated in ISO 8601 format.
    try {
      EcommerceUpdatePromoCodeResponse result = client
              .ecommerce
              .updatePromoCode(storeId, promoRuleId, promoCodeId)
              .code(code)
              .redemptionUrl(redemptionUrl)
              .usageCount(usageCount)
              .enabled(enabled)
              .createdAtForeign(createdAtForeign)
              .updatedAtForeign(updatedAtForeign)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCode());
      System.out.println(result.getRedemptionUrl());
      System.out.println(result.getUsageCount());
      System.out.println(result.getEnabled());
      System.out.println(result.getCreatedAtForeign());
      System.out.println(result.getUpdatedAtForeign());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#updatePromoCode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceUpdatePromoCodeResponse> response = client
              .ecommerce
              .updatePromoCode(storeId, promoRuleId, promoCodeId)
              .code(code)
              .redemptionUrl(redemptionUrl)
              .usageCount(usageCount)
              .enabled(enabled)
              .createdAtForeign(createdAtForeign)
              .updatedAtForeign(updatedAtForeign)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#updatePromoCode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **promoRuleId** | **String**| The id for the promo rule of a store. | |
| **promoCodeId** | **String**| The id for the promo code of a store. | |
| **ecommerceUpdatePromoCodeRequest** | [**EcommerceUpdatePromoCodeRequest**](EcommerceUpdatePromoCodeRequest.md)|  | |

### Return type

[**EcommerceUpdatePromoCodeResponse**](EcommerceUpdatePromoCodeResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="updatePromoRule"></a>
# **updatePromoRule**
> EcommerceUpdatePromoRuleResponse updatePromoRule(storeId, promoRuleId, ecommerceUpdatePromoRuleRequest).execute();

Update promo rule

Update a promo rule.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String promoRuleId = "promoRuleId_example"; // The id for the promo rule of a store.
    String title = "title_example"; // The title that will show up in promotion campaign. Restricted to UTF-8 characters with max length of 100 bytes.
    String description = "description_example"; // The description of a promotion restricted to UTF-8 characters with max length 255.
    OffsetDateTime startsAt = OffsetDateTime.now(); // The date and time when the promotion is in effect in ISO 8601 format.
    String endsAt = "endsAt_example"; // The date and time when the promotion ends. Must be after starts_at and in ISO 8601 format.
    Float amount = 3.4F; // The amount of the promo code discount. If 'type' is 'fixed', the amount is treated as a monetary value. If 'type' is 'percentage', amount must be a decimal value between 0.0 and 1.0, inclusive.
    String type = "fixed"; // Type of discount. For free shipping set type to fixed.
    String target = "per_item"; // The target that the discount applies to.
    Boolean enabled = true; // Whether the promo rule is currently enabled.
    OffsetDateTime createdAtForeign = OffsetDateTime.now(); // The date and time the promotion was created in ISO 8601 format.
    OffsetDateTime updatedAtForeign = OffsetDateTime.now(); // The date and time the promotion was updated in ISO 8601 format.
    try {
      EcommerceUpdatePromoRuleResponse result = client
              .ecommerce
              .updatePromoRule(storeId, promoRuleId)
              .title(title)
              .description(description)
              .startsAt(startsAt)
              .endsAt(endsAt)
              .amount(amount)
              .type(type)
              .target(target)
              .enabled(enabled)
              .createdAtForeign(createdAtForeign)
              .updatedAtForeign(updatedAtForeign)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getStartsAt());
      System.out.println(result.getEndsAt());
      System.out.println(result.getAmount());
      System.out.println(result.getType());
      System.out.println(result.getTarget());
      System.out.println(result.getEnabled());
      System.out.println(result.getCreatedAtForeign());
      System.out.println(result.getUpdatedAtForeign());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#updatePromoRule");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceUpdatePromoRuleResponse> response = client
              .ecommerce
              .updatePromoRule(storeId, promoRuleId)
              .title(title)
              .description(description)
              .startsAt(startsAt)
              .endsAt(endsAt)
              .amount(amount)
              .type(type)
              .target(target)
              .enabled(enabled)
              .createdAtForeign(createdAtForeign)
              .updatedAtForeign(updatedAtForeign)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#updatePromoRule");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **promoRuleId** | **String**| The id for the promo rule of a store. | |
| **ecommerceUpdatePromoRuleRequest** | [**EcommerceUpdatePromoRuleRequest**](EcommerceUpdatePromoRuleRequest.md)|  | |

### Return type

[**EcommerceUpdatePromoRuleResponse**](EcommerceUpdatePromoRuleResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="updateSpecificOrder"></a>
# **updateSpecificOrder**
> EcommerceUpdateSpecificOrderResponse updateSpecificOrder(storeId, orderId, ecommerceUpdateSpecificOrderRequest).execute();

Update order

Update a specific order.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String orderId = "orderId_example"; // The id for the order in a store.
    ECommerceCustomerProperty3 customer = new ECommerceCustomerProperty3();
    String campaignId = "campaignId_example"; // A string that uniquely identifies the campaign associated with an order.
    String landingSite = "landingSite_example"; // The URL for the page where the buyer landed when entering the shop.
    String financialStatus = "financialStatus_example"; // The order status. Use this parameter to trigger [Order Notifications](https://mailchimp.com/developer/marketing/docs/e-commerce/#order-notifications).
    String fulfillmentStatus = "fulfillmentStatus_example"; // The fulfillment status for the order. Use this parameter to trigger [Order Notifications](https://mailchimp.com/developer/marketing/docs/e-commerce/#order-notifications).
    String currencyCode = "currencyCode_example"; // The three-letter ISO 4217 code for the currency that the store accepts.
    Double orderTotal = 3.4D; // The order total associated with an order.
    String orderUrl = "orderUrl_example"; // The URL for the order.
    Double discountTotal = 3.4D; // The total amount of the discounts to be applied to the price of the order.
    Double taxTotal = 3.4D; // The tax total associated with an order.
    Double shippingTotal = 3.4D; // The shipping total for the order.
    String trackingCode = "prec"; // The Mailchimp tracking code for the order. Uses the 'mc_tc' parameter in E-Commerce tracking URLs.
    OffsetDateTime processedAtForeign = OffsetDateTime.now(); // The date and time the order was processed in ISO 8601 format.
    OffsetDateTime cancelledAtForeign = OffsetDateTime.now(); // The date and time the order was cancelled in ISO 8601 format. Note: passing a value for this parameter will cancel the order being edited.
    OffsetDateTime updatedAtForeign = OffsetDateTime.now(); // The date and time the order was updated in ISO 8601 format.
    ShippingAddressProperty1 shippingAddress = new ShippingAddressProperty1();
    BillingAddressProperty1 billingAddress = new BillingAddressProperty1();
    List<PromosPropertyInner> promos = Arrays.asList(); // The promo codes applied on the order. Note: Patch will completely replace the value of promos with the new one provided.
    List<ECommerceOrderLineItem1> lines = Arrays.asList(); // An array of the order's line items.
    OutreachProperty1 outreach = new OutreachProperty1();
    String trackingNumber = "trackingNumber_example"; // The tracking number associated with the order.
    String trackingCarrier = "trackingCarrier_example"; // The tracking carrier associated with the order.
    String trackingUrl = "trackingUrl_example"; // The tracking URL associated with the order.
    try {
      EcommerceUpdateSpecificOrderResponse result = client
              .ecommerce
              .updateSpecificOrder(storeId, orderId)
              .customer(customer)
              .campaignId(campaignId)
              .landingSite(landingSite)
              .financialStatus(financialStatus)
              .fulfillmentStatus(fulfillmentStatus)
              .currencyCode(currencyCode)
              .orderTotal(orderTotal)
              .orderUrl(orderUrl)
              .discountTotal(discountTotal)
              .taxTotal(taxTotal)
              .shippingTotal(shippingTotal)
              .trackingCode(trackingCode)
              .processedAtForeign(processedAtForeign)
              .cancelledAtForeign(cancelledAtForeign)
              .updatedAtForeign(updatedAtForeign)
              .shippingAddress(shippingAddress)
              .billingAddress(billingAddress)
              .promos(promos)
              .lines(lines)
              .outreach(outreach)
              .trackingNumber(trackingNumber)
              .trackingCarrier(trackingCarrier)
              .trackingUrl(trackingUrl)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCustomer());
      System.out.println(result.getStoreId());
      System.out.println(result.getCampaignId());
      System.out.println(result.getLandingSite());
      System.out.println(result.getFinancialStatus());
      System.out.println(result.getFulfillmentStatus());
      System.out.println(result.getCurrencyCode());
      System.out.println(result.getOrderTotal());
      System.out.println(result.getOrderUrl());
      System.out.println(result.getDiscountTotal());
      System.out.println(result.getTaxTotal());
      System.out.println(result.getShippingTotal());
      System.out.println(result.getTrackingCode());
      System.out.println(result.getProcessedAtForeign());
      System.out.println(result.getCancelledAtForeign());
      System.out.println(result.getUpdatedAtForeign());
      System.out.println(result.getShippingAddress());
      System.out.println(result.getBillingAddress());
      System.out.println(result.getPromos());
      System.out.println(result.getLines());
      System.out.println(result.getOutreach());
      System.out.println(result.getTrackingNumber());
      System.out.println(result.getTrackingCarrier());
      System.out.println(result.getTrackingUrl());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#updateSpecificOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceUpdateSpecificOrderResponse> response = client
              .ecommerce
              .updateSpecificOrder(storeId, orderId)
              .customer(customer)
              .campaignId(campaignId)
              .landingSite(landingSite)
              .financialStatus(financialStatus)
              .fulfillmentStatus(fulfillmentStatus)
              .currencyCode(currencyCode)
              .orderTotal(orderTotal)
              .orderUrl(orderUrl)
              .discountTotal(discountTotal)
              .taxTotal(taxTotal)
              .shippingTotal(shippingTotal)
              .trackingCode(trackingCode)
              .processedAtForeign(processedAtForeign)
              .cancelledAtForeign(cancelledAtForeign)
              .updatedAtForeign(updatedAtForeign)
              .shippingAddress(shippingAddress)
              .billingAddress(billingAddress)
              .promos(promos)
              .lines(lines)
              .outreach(outreach)
              .trackingNumber(trackingNumber)
              .trackingCarrier(trackingCarrier)
              .trackingUrl(trackingUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#updateSpecificOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **orderId** | **String**| The id for the order in a store. | |
| **ecommerceUpdateSpecificOrderRequest** | [**EcommerceUpdateSpecificOrderRequest**](EcommerceUpdateSpecificOrderRequest.md)|  | |

### Return type

[**EcommerceUpdateSpecificOrderResponse**](EcommerceUpdateSpecificOrderResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

<a name="updateStore"></a>
# **updateStore**
> EcommerceUpdateStoreResponse updateStore(storeId, ecommerceUpdateStoreRequest).execute();

Update store

Update a store.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Mailchimp;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EcommerceApi;
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
    String storeId = "storeId_example"; // The store id.
    String name = "name_example"; // The name of the store.
    String platform = "platform_example"; // The e-commerce platform of the store.
    String domain = "domain_example"; // The store domain.
    Boolean isSyncing = true; // Whether to disable automations because the store is currently [syncing](https://mailchimp.com/developer/marketing/docs/e-commerce/#pausing-store-automations).
    String emailAddress = "emailAddress_example"; // The email address for the store.
    String currencyCode = "currencyCode_example"; // The three-letter ISO 4217 code for the currency that the store accepts.
    String moneyFormat = "moneyFormat_example"; // The currency format for the store. For example: `$`, `£`, etc.
    String primaryLocale = "primaryLocale_example"; // The primary locale for the store. For example: `en`, `de`, etc.
    String timezone = "timezone_example"; // The timezone for the store.
    String phone = "phone_example"; // The store phone number.
    AddressProperty1 address = new AddressProperty1();
    try {
      EcommerceUpdateStoreResponse result = client
              .ecommerce
              .updateStore(storeId)
              .name(name)
              .platform(platform)
              .domain(domain)
              .isSyncing(isSyncing)
              .emailAddress(emailAddress)
              .currencyCode(currencyCode)
              .moneyFormat(moneyFormat)
              .primaryLocale(primaryLocale)
              .timezone(timezone)
              .phone(phone)
              .address(address)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getListId());
      System.out.println(result.getName());
      System.out.println(result.getPlatform());
      System.out.println(result.getDomain());
      System.out.println(result.getIsSyncing());
      System.out.println(result.getEmailAddress());
      System.out.println(result.getCurrencyCode());
      System.out.println(result.getMoneyFormat());
      System.out.println(result.getPrimaryLocale());
      System.out.println(result.getTimezone());
      System.out.println(result.getPhone());
      System.out.println(result.getAddress());
      System.out.println(result.getConnectedSite());
      System.out.println(result.getAutomations());
      System.out.println(result.getListIsActive());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#updateStore");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EcommerceUpdateStoreResponse> response = client
              .ecommerce
              .updateStore(storeId)
              .name(name)
              .platform(platform)
              .domain(domain)
              .isSyncing(isSyncing)
              .emailAddress(emailAddress)
              .currencyCode(currencyCode)
              .moneyFormat(moneyFormat)
              .primaryLocale(primaryLocale)
              .timezone(timezone)
              .phone(phone)
              .address(address)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#updateStore");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storeId** | **String**| The store id. | |
| **ecommerceUpdateStoreRequest** | [**EcommerceUpdateStoreRequest**](EcommerceUpdateStoreRequest.md)|  | |

### Return type

[**EcommerceUpdateStoreResponse**](EcommerceUpdateStoreResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** | An error generated by the Mailchimp API. |  -  |

