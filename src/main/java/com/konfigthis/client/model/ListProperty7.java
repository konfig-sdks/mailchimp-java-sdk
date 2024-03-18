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
import com.konfigthis.client.model.SegmentOptionsProperty2;
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
 * List settings for the Automation.
 */
@ApiModel(description = "List settings for the Automation.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ListProperty7 {
  public static final String SERIALIZED_NAME_LIST_ID = "list_id";
  @SerializedName(SERIALIZED_NAME_LIST_ID)
  private String listId;

  public static final String SERIALIZED_NAME_LIST_IS_ACTIVE = "list_is_active";
  @SerializedName(SERIALIZED_NAME_LIST_IS_ACTIVE)
  private Boolean listIsActive;

  public static final String SERIALIZED_NAME_LIST_NAME = "list_name";
  @SerializedName(SERIALIZED_NAME_LIST_NAME)
  private String listName;

  public static final String SERIALIZED_NAME_SEGMENT_OPTS = "segment_opts";
  @SerializedName(SERIALIZED_NAME_SEGMENT_OPTS)
  private SegmentOptionsProperty2 segmentOpts;

  public static final String SERIALIZED_NAME_STORE_ID = "store_id";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public ListProperty7() {
  }

  
  public ListProperty7(
     Boolean listIsActive
  ) {
    this();
    this.listIsActive = listIsActive;
  }

  public ListProperty7 listId(String listId) {
    
    
    
    
    this.listId = listId;
    return this;
  }

   /**
   * The unique list id.
   * @return listId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique list id.")

  public String getListId() {
    return listId;
  }


  public void setListId(String listId) {
    
    
    
    this.listId = listId;
  }


   /**
   * The status of the list used, namely if it&#39;s deleted or disabled.
   * @return listIsActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the list used, namely if it's deleted or disabled.")

  public Boolean getListIsActive() {
    return listIsActive;
  }




  public ListProperty7 listName(String listName) {
    
    
    
    
    this.listName = listName;
    return this;
  }

   /**
   * List Name.
   * @return listName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List Name.")

  public String getListName() {
    return listName;
  }


  public void setListName(String listName) {
    
    
    
    this.listName = listName;
  }


  public ListProperty7 segmentOpts(SegmentOptionsProperty2 segmentOpts) {
    
    
    
    
    this.segmentOpts = segmentOpts;
    return this;
  }

   /**
   * Get segmentOpts
   * @return segmentOpts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SegmentOptionsProperty2 getSegmentOpts() {
    return segmentOpts;
  }


  public void setSegmentOpts(SegmentOptionsProperty2 segmentOpts) {
    
    
    
    this.segmentOpts = segmentOpts;
  }


  public ListProperty7 storeId(String storeId) {
    
    
    
    
    this.storeId = storeId;
    return this;
  }

   /**
   * The id of the store.
   * @return storeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1a2df69xxx", value = "The id of the store.")

  public String getStoreId() {
    return storeId;
  }


  public void setStoreId(String storeId) {
    
    
    
    this.storeId = storeId;
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
   * @return the ListProperty7 instance itself
   */
  public ListProperty7 putAdditionalProperty(String key, Object value) {
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
    ListProperty7 listProperty7 = (ListProperty7) o;
    return Objects.equals(this.listId, listProperty7.listId) &&
        Objects.equals(this.listIsActive, listProperty7.listIsActive) &&
        Objects.equals(this.listName, listProperty7.listName) &&
        Objects.equals(this.segmentOpts, listProperty7.segmentOpts) &&
        Objects.equals(this.storeId, listProperty7.storeId)&&
        Objects.equals(this.additionalProperties, listProperty7.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listId, listIsActive, listName, segmentOpts, storeId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListProperty7 {\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    listIsActive: ").append(toIndentedString(listIsActive)).append("\n");
    sb.append("    listName: ").append(toIndentedString(listName)).append("\n");
    sb.append("    segmentOpts: ").append(toIndentedString(segmentOpts)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
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
    openapiFields.add("list_id");
    openapiFields.add("list_is_active");
    openapiFields.add("list_name");
    openapiFields.add("segment_opts");
    openapiFields.add("store_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListProperty7
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListProperty7.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListProperty7 is not found in the empty JSON string", ListProperty7.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("list_id") != null && !jsonObj.get("list_id").isJsonNull()) && !jsonObj.get("list_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `list_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("list_id").toString()));
      }
      if ((jsonObj.get("list_name") != null && !jsonObj.get("list_name").isJsonNull()) && !jsonObj.get("list_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `list_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("list_name").toString()));
      }
      // validate the optional field `segment_opts`
      if (jsonObj.get("segment_opts") != null && !jsonObj.get("segment_opts").isJsonNull()) {
        SegmentOptionsProperty2.validateJsonObject(jsonObj.getAsJsonObject("segment_opts"));
      }
      if ((jsonObj.get("store_id") != null && !jsonObj.get("store_id").isJsonNull()) && !jsonObj.get("store_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `store_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("store_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListProperty7.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListProperty7' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListProperty7> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListProperty7.class));

       return (TypeAdapter<T>) new TypeAdapter<ListProperty7>() {
           @Override
           public void write(JsonWriter out, ListProperty7 value) throws IOException {
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
           public ListProperty7 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ListProperty7 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ListProperty7 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListProperty7
  * @throws IOException if the JSON string is invalid with respect to ListProperty7
  */
  public static ListProperty7 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListProperty7.class);
  }

 /**
  * Convert an instance of ListProperty7 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

