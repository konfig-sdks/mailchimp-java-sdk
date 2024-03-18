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
import java.time.OffsetDateTime;

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
 * An individual tweet.
 */
@ApiModel(description = "An individual tweet.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TwitterStatus {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SCREEN_NAME = "screen_name";
  @SerializedName(SERIALIZED_NAME_SCREEN_NAME)
  private String screenName;

  public static final String SERIALIZED_NAME_STATUS_ID = "status_id";
  @SerializedName(SERIALIZED_NAME_STATUS_ID)
  private String statusId;

  public static final String SERIALIZED_NAME_DATETIME = "datetime";
  @SerializedName(SERIALIZED_NAME_DATETIME)
  private OffsetDateTime datetime;

  public static final String SERIALIZED_NAME_IS_RETWEET = "is_retweet";
  @SerializedName(SERIALIZED_NAME_IS_RETWEET)
  private Boolean isRetweet;

  public TwitterStatus() {
  }

  
  public TwitterStatus(
     String status, 
     String screenName, 
     String statusId, 
     OffsetDateTime datetime, 
     Boolean isRetweet
  ) {
    this();
    this.status = status;
    this.screenName = screenName;
    this.statusId = statusId;
    this.datetime = datetime;
    this.isRetweet = isRetweet;
  }

   /**
   * The body of the tweet.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The body of the tweet.")

  public String getStatus() {
    return status;
  }




   /**
   * The Twitter handle for the author of the tweet.
   * @return screenName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Twitter handle for the author of the tweet.")

  public String getScreenName() {
    return screenName;
  }




   /**
   * The individual id for the tweet.
   * @return statusId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The individual id for the tweet.")

  public String getStatusId() {
    return statusId;
  }




   /**
   * A timestamp for the tweet.
   * @return datetime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A timestamp for the tweet.")

  public OffsetDateTime getDatetime() {
    return datetime;
  }




   /**
   * A &#39;true&#39; or &#39;false&#39; status of whether the tweet is a retweet.
   * @return isRetweet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A 'true' or 'false' status of whether the tweet is a retweet.")

  public Boolean getIsRetweet() {
    return isRetweet;
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
   * @return the TwitterStatus instance itself
   */
  public TwitterStatus putAdditionalProperty(String key, Object value) {
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
    TwitterStatus twitterStatus = (TwitterStatus) o;
    return Objects.equals(this.status, twitterStatus.status) &&
        Objects.equals(this.screenName, twitterStatus.screenName) &&
        Objects.equals(this.statusId, twitterStatus.statusId) &&
        Objects.equals(this.datetime, twitterStatus.datetime) &&
        Objects.equals(this.isRetweet, twitterStatus.isRetweet)&&
        Objects.equals(this.additionalProperties, twitterStatus.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, screenName, statusId, datetime, isRetweet, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwitterStatus {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    screenName: ").append(toIndentedString(screenName)).append("\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    isRetweet: ").append(toIndentedString(isRetweet)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("screen_name");
    openapiFields.add("status_id");
    openapiFields.add("datetime");
    openapiFields.add("is_retweet");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TwitterStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TwitterStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TwitterStatus is not found in the empty JSON string", TwitterStatus.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("screen_name") != null && !jsonObj.get("screen_name").isJsonNull()) && !jsonObj.get("screen_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `screen_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("screen_name").toString()));
      }
      if ((jsonObj.get("status_id") != null && !jsonObj.get("status_id").isJsonNull()) && !jsonObj.get("status_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TwitterStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TwitterStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TwitterStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TwitterStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<TwitterStatus>() {
           @Override
           public void write(JsonWriter out, TwitterStatus value) throws IOException {
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
           public TwitterStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TwitterStatus instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TwitterStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TwitterStatus
  * @throws IOException if the JSON string is invalid with respect to TwitterStatus
  */
  public static TwitterStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TwitterStatus.class);
  }

 /**
  * Convert an instance of TwitterStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

