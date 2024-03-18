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
import com.konfigthis.client.model.TrackingSettingsProperty;
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
 * A summary of an individual page&#39;s properties.
 */
@ApiModel(description = "A summary of an individual page's properties.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LandingPagesUpdatePageByIdRequest {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STORE_ID = "store_id";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public static final String SERIALIZED_NAME_LIST_ID = "list_id";
  @SerializedName(SERIALIZED_NAME_LIST_ID)
  private String listId;

  public static final String SERIALIZED_NAME_TRACKING = "tracking";
  @SerializedName(SERIALIZED_NAME_TRACKING)
  private TrackingSettingsProperty tracking;

  public LandingPagesUpdatePageByIdRequest() {
  }

  public LandingPagesUpdatePageByIdRequest title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * The title of this landing page seen in the browser&#39;s title bar.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The title of this landing page seen in the browser's title bar.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public LandingPagesUpdatePageByIdRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * The description of this landing page.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of this landing page.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public LandingPagesUpdatePageByIdRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of this landing page.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of this landing page.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public LandingPagesUpdatePageByIdRequest storeId(String storeId) {
    
    
    
    
    this.storeId = storeId;
    return this;
  }

   /**
   * The ID of the store associated with this landing page.
   * @return storeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the store associated with this landing page.")

  public String getStoreId() {
    return storeId;
  }


  public void setStoreId(String storeId) {
    
    
    
    this.storeId = storeId;
  }


  public LandingPagesUpdatePageByIdRequest listId(String listId) {
    
    
    
    
    this.listId = listId;
    return this;
  }

   /**
   * The list&#39;s ID associated with this landing page.
   * @return listId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list's ID associated with this landing page.")

  public String getListId() {
    return listId;
  }


  public void setListId(String listId) {
    
    
    
    this.listId = listId;
  }


  public LandingPagesUpdatePageByIdRequest tracking(TrackingSettingsProperty tracking) {
    
    
    
    
    this.tracking = tracking;
    return this;
  }

   /**
   * Get tracking
   * @return tracking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrackingSettingsProperty getTracking() {
    return tracking;
  }


  public void setTracking(TrackingSettingsProperty tracking) {
    
    
    
    this.tracking = tracking;
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
   * @return the LandingPagesUpdatePageByIdRequest instance itself
   */
  public LandingPagesUpdatePageByIdRequest putAdditionalProperty(String key, Object value) {
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
    LandingPagesUpdatePageByIdRequest landingPagesUpdatePageByIdRequest = (LandingPagesUpdatePageByIdRequest) o;
    return Objects.equals(this.title, landingPagesUpdatePageByIdRequest.title) &&
        Objects.equals(this.description, landingPagesUpdatePageByIdRequest.description) &&
        Objects.equals(this.name, landingPagesUpdatePageByIdRequest.name) &&
        Objects.equals(this.storeId, landingPagesUpdatePageByIdRequest.storeId) &&
        Objects.equals(this.listId, landingPagesUpdatePageByIdRequest.listId) &&
        Objects.equals(this.tracking, landingPagesUpdatePageByIdRequest.tracking)&&
        Objects.equals(this.additionalProperties, landingPagesUpdatePageByIdRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, name, storeId, listId, tracking, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LandingPagesUpdatePageByIdRequest {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("name");
    openapiFields.add("store_id");
    openapiFields.add("list_id");
    openapiFields.add("tracking");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LandingPagesUpdatePageByIdRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LandingPagesUpdatePageByIdRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LandingPagesUpdatePageByIdRequest is not found in the empty JSON string", LandingPagesUpdatePageByIdRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("store_id") != null && !jsonObj.get("store_id").isJsonNull()) && !jsonObj.get("store_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `store_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("store_id").toString()));
      }
      if ((jsonObj.get("list_id") != null && !jsonObj.get("list_id").isJsonNull()) && !jsonObj.get("list_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `list_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("list_id").toString()));
      }
      // validate the optional field `tracking`
      if (jsonObj.get("tracking") != null && !jsonObj.get("tracking").isJsonNull()) {
        TrackingSettingsProperty.validateJsonObject(jsonObj.getAsJsonObject("tracking"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LandingPagesUpdatePageByIdRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LandingPagesUpdatePageByIdRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LandingPagesUpdatePageByIdRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LandingPagesUpdatePageByIdRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<LandingPagesUpdatePageByIdRequest>() {
           @Override
           public void write(JsonWriter out, LandingPagesUpdatePageByIdRequest value) throws IOException {
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
           public LandingPagesUpdatePageByIdRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LandingPagesUpdatePageByIdRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LandingPagesUpdatePageByIdRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LandingPagesUpdatePageByIdRequest
  * @throws IOException if the JSON string is invalid with respect to LandingPagesUpdatePageByIdRequest
  */
  public static LandingPagesUpdatePageByIdRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LandingPagesUpdatePageByIdRequest.class);
  }

 /**
  * Convert an instance of LandingPagesUpdatePageByIdRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

