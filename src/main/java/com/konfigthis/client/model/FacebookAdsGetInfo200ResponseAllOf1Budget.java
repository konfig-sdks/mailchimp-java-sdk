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
 * FacebookAdsGetInfo200ResponseAllOf1Budget
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class FacebookAdsGetInfo200ResponseAllOf1Budget {
  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private Double totalAmount;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public FacebookAdsGetInfo200ResponseAllOf1Budget() {
  }

  public FacebookAdsGetInfo200ResponseAllOf1Budget duration(Integer duration) {
    
    
    
    
    this.duration = duration;
    return this;
  }

   /**
   * Duration of the ad in seconds
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "86400", value = "Duration of the ad in seconds")

  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    
    
    
    this.duration = duration;
  }


  public FacebookAdsGetInfo200ResponseAllOf1Budget totalAmount(Double totalAmount) {
    
    
    
    
    this.totalAmount = totalAmount;
    return this;
  }

  public FacebookAdsGetInfo200ResponseAllOf1Budget totalAmount(Integer totalAmount) {
    
    
    
    
    this.totalAmount = totalAmount.doubleValue();
    return this;
  }

   /**
   * Total budget of the ad
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "500", value = "Total budget of the ad")

  public Double getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(Double totalAmount) {
    
    
    
    this.totalAmount = totalAmount;
  }


  public FacebookAdsGetInfo200ResponseAllOf1Budget currencyCode(String currencyCode) {
    
    
    
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Currency code
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "Currency code")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    
    
    
    this.currencyCode = currencyCode;
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
   * @return the FacebookAdsGetInfo200ResponseAllOf1Budget instance itself
   */
  public FacebookAdsGetInfo200ResponseAllOf1Budget putAdditionalProperty(String key, Object value) {
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
    FacebookAdsGetInfo200ResponseAllOf1Budget facebookAdsGetInfo200ResponseAllOf1Budget = (FacebookAdsGetInfo200ResponseAllOf1Budget) o;
    return Objects.equals(this.duration, facebookAdsGetInfo200ResponseAllOf1Budget.duration) &&
        Objects.equals(this.totalAmount, facebookAdsGetInfo200ResponseAllOf1Budget.totalAmount) &&
        Objects.equals(this.currencyCode, facebookAdsGetInfo200ResponseAllOf1Budget.currencyCode)&&
        Objects.equals(this.additionalProperties, facebookAdsGetInfo200ResponseAllOf1Budget.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, totalAmount, currencyCode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacebookAdsGetInfo200ResponseAllOf1Budget {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
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
    openapiFields.add("duration");
    openapiFields.add("total_amount");
    openapiFields.add("currency_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FacebookAdsGetInfo200ResponseAllOf1Budget
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FacebookAdsGetInfo200ResponseAllOf1Budget.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FacebookAdsGetInfo200ResponseAllOf1Budget is not found in the empty JSON string", FacebookAdsGetInfo200ResponseAllOf1Budget.openapiRequiredFields.toString()));
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
       if (!FacebookAdsGetInfo200ResponseAllOf1Budget.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FacebookAdsGetInfo200ResponseAllOf1Budget' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FacebookAdsGetInfo200ResponseAllOf1Budget> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FacebookAdsGetInfo200ResponseAllOf1Budget.class));

       return (TypeAdapter<T>) new TypeAdapter<FacebookAdsGetInfo200ResponseAllOf1Budget>() {
           @Override
           public void write(JsonWriter out, FacebookAdsGetInfo200ResponseAllOf1Budget value) throws IOException {
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
           public FacebookAdsGetInfo200ResponseAllOf1Budget read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FacebookAdsGetInfo200ResponseAllOf1Budget instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FacebookAdsGetInfo200ResponseAllOf1Budget given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FacebookAdsGetInfo200ResponseAllOf1Budget
  * @throws IOException if the JSON string is invalid with respect to FacebookAdsGetInfo200ResponseAllOf1Budget
  */
  public static FacebookAdsGetInfo200ResponseAllOf1Budget fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FacebookAdsGetInfo200ResponseAllOf1Budget.class);
  }

 /**
  * Convert an instance of FacebookAdsGetInfo200ResponseAllOf1Budget to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

