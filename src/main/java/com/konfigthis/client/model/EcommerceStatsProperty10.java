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
 * Ecommerce stats for the list member if the list is attached to a store.
 */
@ApiModel(description = "Ecommerce stats for the list member if the list is attached to a store.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EcommerceStatsProperty10 {
  public static final String SERIALIZED_NAME_TOTAL_REVENUE = "total_revenue";
  @SerializedName(SERIALIZED_NAME_TOTAL_REVENUE)
  private Double totalRevenue;

  public static final String SERIALIZED_NAME_NUMBER_OF_ORDERS = "number_of_orders";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_ORDERS)
  private Double numberOfOrders;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public EcommerceStatsProperty10() {
  }

  
  public EcommerceStatsProperty10(
     Double totalRevenue, 
     Double numberOfOrders, 
     String currencyCode
  ) {
    this();
    this.totalRevenue = totalRevenue;
    this.numberOfOrders = numberOfOrders;
    this.currencyCode = currencyCode;
  }

   /**
   * The total revenue the list member has brought in.
   * @return totalRevenue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total revenue the list member has brought in.")

  public Double getTotalRevenue() {
    return totalRevenue;
  }




   /**
   * The total number of orders placed by the list member.
   * @return numberOfOrders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of orders placed by the list member.")

  public Double getNumberOfOrders() {
    return numberOfOrders;
  }




   /**
   * The three-letter ISO 4217 code for the currency that the store accepts.
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "The three-letter ISO 4217 code for the currency that the store accepts.")

  public String getCurrencyCode() {
    return currencyCode;
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
   * @return the EcommerceStatsProperty10 instance itself
   */
  public EcommerceStatsProperty10 putAdditionalProperty(String key, Object value) {
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
    EcommerceStatsProperty10 ecommerceStatsProperty10 = (EcommerceStatsProperty10) o;
    return Objects.equals(this.totalRevenue, ecommerceStatsProperty10.totalRevenue) &&
        Objects.equals(this.numberOfOrders, ecommerceStatsProperty10.numberOfOrders) &&
        Objects.equals(this.currencyCode, ecommerceStatsProperty10.currencyCode)&&
        Objects.equals(this.additionalProperties, ecommerceStatsProperty10.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRevenue, numberOfOrders, currencyCode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EcommerceStatsProperty10 {\n");
    sb.append("    totalRevenue: ").append(toIndentedString(totalRevenue)).append("\n");
    sb.append("    numberOfOrders: ").append(toIndentedString(numberOfOrders)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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
    openapiFields.add("total_revenue");
    openapiFields.add("number_of_orders");
    openapiFields.add("currency_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EcommerceStatsProperty10
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EcommerceStatsProperty10.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EcommerceStatsProperty10 is not found in the empty JSON string", EcommerceStatsProperty10.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("currency_code") != null && !jsonObj.get("currency_code").isJsonNull()) && !jsonObj.get("currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EcommerceStatsProperty10.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EcommerceStatsProperty10' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EcommerceStatsProperty10> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EcommerceStatsProperty10.class));

       return (TypeAdapter<T>) new TypeAdapter<EcommerceStatsProperty10>() {
           @Override
           public void write(JsonWriter out, EcommerceStatsProperty10 value) throws IOException {
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
           public EcommerceStatsProperty10 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EcommerceStatsProperty10 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EcommerceStatsProperty10 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EcommerceStatsProperty10
  * @throws IOException if the JSON string is invalid with respect to EcommerceStatsProperty10
  */
  public static EcommerceStatsProperty10 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EcommerceStatsProperty10.class);
  }

 /**
  * Convert an instance of EcommerceStatsProperty10 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

