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
import com.konfigthis.client.model.EcommerceStatsProperty12;
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
 * Open and click rates for this subscriber.
 */
@ApiModel(description = "Open and click rates for this subscriber.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SubscriberStatsProperty13 {
  public static final String SERIALIZED_NAME_AVG_OPEN_RATE = "avg_open_rate";
  @SerializedName(SERIALIZED_NAME_AVG_OPEN_RATE)
  private Double avgOpenRate;

  public static final String SERIALIZED_NAME_AVG_CLICK_RATE = "avg_click_rate";
  @SerializedName(SERIALIZED_NAME_AVG_CLICK_RATE)
  private Double avgClickRate;

  public static final String SERIALIZED_NAME_ECOMMERCE_DATA = "ecommerce_data";
  @SerializedName(SERIALIZED_NAME_ECOMMERCE_DATA)
  private EcommerceStatsProperty12 ecommerceData;

  public SubscriberStatsProperty13() {
  }

  
  public SubscriberStatsProperty13(
     Double avgOpenRate, 
     Double avgClickRate
  ) {
    this();
    this.avgOpenRate = avgOpenRate;
    this.avgClickRate = avgClickRate;
  }

   /**
   * A subscriber&#39;s average open rate.
   * @return avgOpenRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A subscriber's average open rate.")

  public Double getAvgOpenRate() {
    return avgOpenRate;
  }




   /**
   * A subscriber&#39;s average clickthrough rate.
   * @return avgClickRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A subscriber's average clickthrough rate.")

  public Double getAvgClickRate() {
    return avgClickRate;
  }




  public SubscriberStatsProperty13 ecommerceData(EcommerceStatsProperty12 ecommerceData) {
    
    
    
    
    this.ecommerceData = ecommerceData;
    return this;
  }

   /**
   * Get ecommerceData
   * @return ecommerceData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EcommerceStatsProperty12 getEcommerceData() {
    return ecommerceData;
  }


  public void setEcommerceData(EcommerceStatsProperty12 ecommerceData) {
    
    
    
    this.ecommerceData = ecommerceData;
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
   * @return the SubscriberStatsProperty13 instance itself
   */
  public SubscriberStatsProperty13 putAdditionalProperty(String key, Object value) {
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
    SubscriberStatsProperty13 subscriberStatsProperty13 = (SubscriberStatsProperty13) o;
    return Objects.equals(this.avgOpenRate, subscriberStatsProperty13.avgOpenRate) &&
        Objects.equals(this.avgClickRate, subscriberStatsProperty13.avgClickRate) &&
        Objects.equals(this.ecommerceData, subscriberStatsProperty13.ecommerceData)&&
        Objects.equals(this.additionalProperties, subscriberStatsProperty13.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avgOpenRate, avgClickRate, ecommerceData, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriberStatsProperty13 {\n");
    sb.append("    avgOpenRate: ").append(toIndentedString(avgOpenRate)).append("\n");
    sb.append("    avgClickRate: ").append(toIndentedString(avgClickRate)).append("\n");
    sb.append("    ecommerceData: ").append(toIndentedString(ecommerceData)).append("\n");
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
    openapiFields.add("avg_open_rate");
    openapiFields.add("avg_click_rate");
    openapiFields.add("ecommerce_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubscriberStatsProperty13
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SubscriberStatsProperty13.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubscriberStatsProperty13 is not found in the empty JSON string", SubscriberStatsProperty13.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `ecommerce_data`
      if (jsonObj.get("ecommerce_data") != null && !jsonObj.get("ecommerce_data").isJsonNull()) {
        EcommerceStatsProperty12.validateJsonObject(jsonObj.getAsJsonObject("ecommerce_data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriberStatsProperty13.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriberStatsProperty13' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriberStatsProperty13> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriberStatsProperty13.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriberStatsProperty13>() {
           @Override
           public void write(JsonWriter out, SubscriberStatsProperty13 value) throws IOException {
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
           public SubscriberStatsProperty13 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SubscriberStatsProperty13 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SubscriberStatsProperty13 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriberStatsProperty13
  * @throws IOException if the JSON string is invalid with respect to SubscriberStatsProperty13
  */
  public static SubscriberStatsProperty13 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriberStatsProperty13.class);
  }

 /**
  * Convert an instance of SubscriberStatsProperty13 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

