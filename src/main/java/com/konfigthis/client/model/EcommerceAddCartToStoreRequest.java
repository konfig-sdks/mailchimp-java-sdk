/*
 * Mailchimp Marketing API
 * Mailchimp is a marketing platform for small businesses. It offers an all-in-one marketing solution that includes email marketing, ads, landing pages, and automation. With Mailchimp, businesses can design and send targeted campaigns, analyze their performance, and grow their audience.
 *
 * The version of the OpenAPI document: 3.0.55
 * Contact: apihelp@mailchimp.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.ECommerceCartLineItem;
import com.konfigthis.client.model.ECommerceCustomerProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * Information about a specific cart.
 */
@ApiModel(description = "Information about a specific cart.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EcommerceAddCartToStoreRequest {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private ECommerceCustomerProperty customer;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  public static final String SERIALIZED_NAME_CHECKOUT_URL = "checkout_url";
  @SerializedName(SERIALIZED_NAME_CHECKOUT_URL)
  private String checkoutUrl;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_ORDER_TOTAL = "order_total";
  @SerializedName(SERIALIZED_NAME_ORDER_TOTAL)
  private Double orderTotal;

  public static final String SERIALIZED_NAME_TAX_TOTAL = "tax_total";
  @SerializedName(SERIALIZED_NAME_TAX_TOTAL)
  private Double taxTotal;

  public static final String SERIALIZED_NAME_LINES = "lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  private List<ECommerceCartLineItem> lines = new ArrayList<>();

  public EcommerceAddCartToStoreRequest() {
  }

  public EcommerceAddCartToStoreRequest id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * A unique identifier for the cart.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A unique identifier for the cart.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public EcommerceAddCartToStoreRequest customer(ECommerceCustomerProperty customer) {
    
    
    
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ECommerceCustomerProperty getCustomer() {
    return customer;
  }


  public void setCustomer(ECommerceCustomerProperty customer) {
    
    
    
    this.customer = customer;
  }


  public EcommerceAddCartToStoreRequest campaignId(String campaignId) {
    
    
    
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * A string that uniquely identifies the campaign for a cart.
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "839488a60b", value = "A string that uniquely identifies the campaign for a cart.")

  public String getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(String campaignId) {
    
    
    
    this.campaignId = campaignId;
  }


  public EcommerceAddCartToStoreRequest checkoutUrl(String checkoutUrl) {
    
    
    
    
    this.checkoutUrl = checkoutUrl;
    return this;
  }

   /**
   * The URL for the cart. This parameter is required for [Abandoned Cart](https://mailchimp.com/help/create-an-abandoned-cart-email/) automations.
   * @return checkoutUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL for the cart. This parameter is required for [Abandoned Cart](https://mailchimp.com/help/create-an-abandoned-cart-email/) automations.")

  public String getCheckoutUrl() {
    return checkoutUrl;
  }


  public void setCheckoutUrl(String checkoutUrl) {
    
    
    
    this.checkoutUrl = checkoutUrl;
  }


  public EcommerceAddCartToStoreRequest currencyCode(String currencyCode) {
    
    
    
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The three-letter ISO 4217 code for the currency that the cart uses.
   * @return currencyCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The three-letter ISO 4217 code for the currency that the cart uses.")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    
    
    
    this.currencyCode = currencyCode;
  }


  public EcommerceAddCartToStoreRequest orderTotal(Double orderTotal) {
    
    
    
    
    this.orderTotal = orderTotal;
    return this;
  }

  public EcommerceAddCartToStoreRequest orderTotal(Integer orderTotal) {
    
    
    
    
    this.orderTotal = orderTotal.doubleValue();
    return this;
  }

   /**
   * The order total for the cart.
   * @return orderTotal
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The order total for the cart.")

  public Double getOrderTotal() {
    return orderTotal;
  }


  public void setOrderTotal(Double orderTotal) {
    
    
    
    this.orderTotal = orderTotal;
  }


  public EcommerceAddCartToStoreRequest taxTotal(Double taxTotal) {
    
    
    
    
    this.taxTotal = taxTotal;
    return this;
  }

  public EcommerceAddCartToStoreRequest taxTotal(Integer taxTotal) {
    
    
    
    
    this.taxTotal = taxTotal.doubleValue();
    return this;
  }

   /**
   * The total tax for the cart.
   * @return taxTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total tax for the cart.")

  public Double getTaxTotal() {
    return taxTotal;
  }


  public void setTaxTotal(Double taxTotal) {
    
    
    
    this.taxTotal = taxTotal;
  }


  public EcommerceAddCartToStoreRequest lines(List<ECommerceCartLineItem> lines) {
    
    
    
    
    this.lines = lines;
    return this;
  }

  public EcommerceAddCartToStoreRequest addLinesItem(ECommerceCartLineItem linesItem) {
    this.lines.add(linesItem);
    return this;
  }

   /**
   * An array of the cart&#39;s line items.
   * @return lines
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An array of the cart's line items.")

  public List<ECommerceCartLineItem> getLines() {
    return lines;
  }


  public void setLines(List<ECommerceCartLineItem> lines) {
    
    
    
    this.lines = lines;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the EcommerceAddCartToStoreRequest instance itself
   */
  public EcommerceAddCartToStoreRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EcommerceAddCartToStoreRequest ecommerceAddCartToStoreRequest = (EcommerceAddCartToStoreRequest) o;
    return Objects.equals(this.id, ecommerceAddCartToStoreRequest.id) &&
        Objects.equals(this.customer, ecommerceAddCartToStoreRequest.customer) &&
        Objects.equals(this.campaignId, ecommerceAddCartToStoreRequest.campaignId) &&
        Objects.equals(this.checkoutUrl, ecommerceAddCartToStoreRequest.checkoutUrl) &&
        Objects.equals(this.currencyCode, ecommerceAddCartToStoreRequest.currencyCode) &&
        Objects.equals(this.orderTotal, ecommerceAddCartToStoreRequest.orderTotal) &&
        Objects.equals(this.taxTotal, ecommerceAddCartToStoreRequest.taxTotal) &&
        Objects.equals(this.lines, ecommerceAddCartToStoreRequest.lines)&&
        Objects.equals(this.additionalProperties, ecommerceAddCartToStoreRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customer, campaignId, checkoutUrl, currencyCode, orderTotal, taxTotal, lines, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EcommerceAddCartToStoreRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    checkoutUrl: ").append(toIndentedString(checkoutUrl)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    orderTotal: ").append(toIndentedString(orderTotal)).append("\n");
    sb.append("    taxTotal: ").append(toIndentedString(taxTotal)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("customer");
    openapiFields.add("campaign_id");
    openapiFields.add("checkout_url");
    openapiFields.add("currency_code");
    openapiFields.add("order_total");
    openapiFields.add("tax_total");
    openapiFields.add("lines");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("customer");
    openapiRequiredFields.add("currency_code");
    openapiRequiredFields.add("order_total");
    openapiRequiredFields.add("lines");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EcommerceAddCartToStoreRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EcommerceAddCartToStoreRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EcommerceAddCartToStoreRequest is not found in the empty JSON string", EcommerceAddCartToStoreRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EcommerceAddCartToStoreRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the required field `customer`
      ECommerceCustomerProperty.validateJsonObject(jsonObj.getAsJsonObject("customer"));
      if ((jsonObj.get("campaign_id") != null && !jsonObj.get("campaign_id").isJsonNull()) && !jsonObj.get("campaign_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaign_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaign_id").toString()));
      }
      if ((jsonObj.get("checkout_url") != null && !jsonObj.get("checkout_url").isJsonNull()) && !jsonObj.get("checkout_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checkout_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkout_url").toString()));
      }
      if (!jsonObj.get("currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_code").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("lines").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `lines` to be an array in the JSON string but got `%s`", jsonObj.get("lines").toString()));
      }

      JsonArray jsonArraylines = jsonObj.getAsJsonArray("lines");
      // validate the required field `lines` (array)
      for (int i = 0; i < jsonArraylines.size(); i++) {
        ECommerceCartLineItem.validateJsonObject(jsonArraylines.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EcommerceAddCartToStoreRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EcommerceAddCartToStoreRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EcommerceAddCartToStoreRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EcommerceAddCartToStoreRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EcommerceAddCartToStoreRequest>() {
           @Override
           public void write(JsonWriter out, EcommerceAddCartToStoreRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public EcommerceAddCartToStoreRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EcommerceAddCartToStoreRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EcommerceAddCartToStoreRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EcommerceAddCartToStoreRequest
  * @throws IOException if the JSON string is invalid with respect to EcommerceAddCartToStoreRequest
  */
  public static EcommerceAddCartToStoreRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EcommerceAddCartToStoreRequest.class);
  }

 /**
  * Convert an instance of EcommerceAddCartToStoreRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

