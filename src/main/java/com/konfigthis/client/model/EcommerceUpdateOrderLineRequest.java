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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * Information about a specific order line.
 */
@ApiModel(description = "Information about a specific order line.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EcommerceUpdateOrderLineRequest {
  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  public static final String SERIALIZED_NAME_PRODUCT_VARIANT_ID = "product_variant_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_VARIANT_ID)
  private String productVariantId;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public static final String SERIALIZED_NAME_DISCOUNT = "discount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT)
  private Double discount;

  public EcommerceUpdateOrderLineRequest() {
  }

  public EcommerceUpdateOrderLineRequest productId(String productId) {
    
    
    
    
    this.productId = productId;
    return this;
  }

   /**
   * A unique identifier for the product associated with the order line item.
   * @return productId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier for the product associated with the order line item.")

  public String getProductId() {
    return productId;
  }


  public void setProductId(String productId) {
    
    
    
    this.productId = productId;
  }


  public EcommerceUpdateOrderLineRequest productVariantId(String productVariantId) {
    
    
    
    
    this.productVariantId = productVariantId;
    return this;
  }

   /**
   * A unique identifier for the product variant associated with the order line item.
   * @return productVariantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier for the product variant associated with the order line item.")

  public String getProductVariantId() {
    return productVariantId;
  }


  public void setProductVariantId(String productVariantId) {
    
    
    
    this.productVariantId = productVariantId;
  }


  public EcommerceUpdateOrderLineRequest quantity(Integer quantity) {
    
    
    
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of an order line item.
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The quantity of an order line item.")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    
    
    
    this.quantity = quantity;
  }


  public EcommerceUpdateOrderLineRequest price(Double price) {
    
    
    
    
    this.price = price;
    return this;
  }

  public EcommerceUpdateOrderLineRequest price(Integer price) {
    
    
    
    
    this.price = price.doubleValue();
    return this;
  }

   /**
   * The price of an order line item.
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The price of an order line item.")

  public Double getPrice() {
    return price;
  }


  public void setPrice(Double price) {
    
    
    
    this.price = price;
  }


  public EcommerceUpdateOrderLineRequest discount(Double discount) {
    
    
    
    
    this.discount = discount;
    return this;
  }

  public EcommerceUpdateOrderLineRequest discount(Integer discount) {
    
    
    
    
    this.discount = discount.doubleValue();
    return this;
  }

   /**
   * The total discount amount applied to this line item.
   * @return discount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total discount amount applied to this line item.")

  public Double getDiscount() {
    return discount;
  }


  public void setDiscount(Double discount) {
    
    
    
    this.discount = discount;
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
   * @return the EcommerceUpdateOrderLineRequest instance itself
   */
  public EcommerceUpdateOrderLineRequest putAdditionalProperty(String key, Object value) {
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
    EcommerceUpdateOrderLineRequest ecommerceUpdateOrderLineRequest = (EcommerceUpdateOrderLineRequest) o;
    return Objects.equals(this.productId, ecommerceUpdateOrderLineRequest.productId) &&
        Objects.equals(this.productVariantId, ecommerceUpdateOrderLineRequest.productVariantId) &&
        Objects.equals(this.quantity, ecommerceUpdateOrderLineRequest.quantity) &&
        Objects.equals(this.price, ecommerceUpdateOrderLineRequest.price) &&
        Objects.equals(this.discount, ecommerceUpdateOrderLineRequest.discount)&&
        Objects.equals(this.additionalProperties, ecommerceUpdateOrderLineRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, productVariantId, quantity, price, discount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EcommerceUpdateOrderLineRequest {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productVariantId: ").append(toIndentedString(productVariantId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
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
    openapiFields.add("product_id");
    openapiFields.add("product_variant_id");
    openapiFields.add("quantity");
    openapiFields.add("price");
    openapiFields.add("discount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EcommerceUpdateOrderLineRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EcommerceUpdateOrderLineRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EcommerceUpdateOrderLineRequest is not found in the empty JSON string", EcommerceUpdateOrderLineRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("product_id") != null && !jsonObj.get("product_id").isJsonNull()) && !jsonObj.get("product_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_id").toString()));
      }
      if ((jsonObj.get("product_variant_id") != null && !jsonObj.get("product_variant_id").isJsonNull()) && !jsonObj.get("product_variant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_variant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_variant_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EcommerceUpdateOrderLineRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EcommerceUpdateOrderLineRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EcommerceUpdateOrderLineRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EcommerceUpdateOrderLineRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EcommerceUpdateOrderLineRequest>() {
           @Override
           public void write(JsonWriter out, EcommerceUpdateOrderLineRequest value) throws IOException {
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
           public EcommerceUpdateOrderLineRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EcommerceUpdateOrderLineRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EcommerceUpdateOrderLineRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EcommerceUpdateOrderLineRequest
  * @throws IOException if the JSON string is invalid with respect to EcommerceUpdateOrderLineRequest
  */
  public static EcommerceUpdateOrderLineRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EcommerceUpdateOrderLineRequest.class);
  }

 /**
  * Convert an instance of EcommerceUpdateOrderLineRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

