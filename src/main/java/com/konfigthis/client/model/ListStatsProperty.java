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
 * The average campaign statistics for your list. This won&#39;t be present if we haven&#39;t calculated it yet for this list.
 */
@ApiModel(description = "The average campaign statistics for your list. This won't be present if we haven't calculated it yet for this list.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ListStatsProperty {
  public static final String SERIALIZED_NAME_SUB_RATE = "sub_rate";
  @SerializedName(SERIALIZED_NAME_SUB_RATE)
  private Double subRate;

  public static final String SERIALIZED_NAME_UNSUB_RATE = "unsub_rate";
  @SerializedName(SERIALIZED_NAME_UNSUB_RATE)
  private Double unsubRate;

  public static final String SERIALIZED_NAME_OPEN_RATE = "open_rate";
  @SerializedName(SERIALIZED_NAME_OPEN_RATE)
  private Double openRate;

  public static final String SERIALIZED_NAME_CLICK_RATE = "click_rate";
  @SerializedName(SERIALIZED_NAME_CLICK_RATE)
  private Double clickRate;

  public ListStatsProperty() {
  }

  
  public ListStatsProperty(
     Double subRate, 
     Double unsubRate, 
     Double openRate, 
     Double clickRate
  ) {
    this();
    this.subRate = subRate;
    this.unsubRate = unsubRate;
    this.openRate = openRate;
    this.clickRate = clickRate;
  }

   /**
   * The average number of subscriptions per month for the list.
   * @return subRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The average number of subscriptions per month for the list.")

  public Double getSubRate() {
    return subRate;
  }




   /**
   * The average number of unsubscriptions per month for the list.
   * @return unsubRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The average number of unsubscriptions per month for the list.")

  public Double getUnsubRate() {
    return unsubRate;
  }




   /**
   * The average open rate (a percentage represented as a number between 0 and 100) per campaign for the list.
   * @return openRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The average open rate (a percentage represented as a number between 0 and 100) per campaign for the list.")

  public Double getOpenRate() {
    return openRate;
  }




   /**
   * The average click rate (a percentage represented as a number between 0 and 100) per campaign for the list.
   * @return clickRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The average click rate (a percentage represented as a number between 0 and 100) per campaign for the list.")

  public Double getClickRate() {
    return clickRate;
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
   * @return the ListStatsProperty instance itself
   */
  public ListStatsProperty putAdditionalProperty(String key, Object value) {
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
    ListStatsProperty listStatsProperty = (ListStatsProperty) o;
    return Objects.equals(this.subRate, listStatsProperty.subRate) &&
        Objects.equals(this.unsubRate, listStatsProperty.unsubRate) &&
        Objects.equals(this.openRate, listStatsProperty.openRate) &&
        Objects.equals(this.clickRate, listStatsProperty.clickRate)&&
        Objects.equals(this.additionalProperties, listStatsProperty.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subRate, unsubRate, openRate, clickRate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListStatsProperty {\n");
    sb.append("    subRate: ").append(toIndentedString(subRate)).append("\n");
    sb.append("    unsubRate: ").append(toIndentedString(unsubRate)).append("\n");
    sb.append("    openRate: ").append(toIndentedString(openRate)).append("\n");
    sb.append("    clickRate: ").append(toIndentedString(clickRate)).append("\n");
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
    openapiFields.add("sub_rate");
    openapiFields.add("unsub_rate");
    openapiFields.add("open_rate");
    openapiFields.add("click_rate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListStatsProperty
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListStatsProperty.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListStatsProperty is not found in the empty JSON string", ListStatsProperty.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListStatsProperty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListStatsProperty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListStatsProperty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListStatsProperty.class));

       return (TypeAdapter<T>) new TypeAdapter<ListStatsProperty>() {
           @Override
           public void write(JsonWriter out, ListStatsProperty value) throws IOException {
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
           public ListStatsProperty read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ListStatsProperty instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ListStatsProperty given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListStatsProperty
  * @throws IOException if the JSON string is invalid with respect to ListStatsProperty
  */
  public static ListStatsProperty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListStatsProperty.class);
  }

 /**
  * Convert an instance of ListStatsProperty to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

