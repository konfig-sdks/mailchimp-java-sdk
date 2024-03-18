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
import com.konfigthis.client.model.SegmentOptionsProperty3;
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
 * List settings for the campaign.
 */
@ApiModel(description = "List settings for the campaign.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ListProperty9 {
  public static final String SERIALIZED_NAME_LIST_ID = "list_id";
  @SerializedName(SERIALIZED_NAME_LIST_ID)
  private String listId;

  public static final String SERIALIZED_NAME_LIST_IS_ACTIVE = "list_is_active";
  @SerializedName(SERIALIZED_NAME_LIST_IS_ACTIVE)
  private Boolean listIsActive;

  public static final String SERIALIZED_NAME_LIST_NAME = "list_name";
  @SerializedName(SERIALIZED_NAME_LIST_NAME)
  private String listName;

  public static final String SERIALIZED_NAME_SEGMENT_TEXT = "segment_text";
  @SerializedName(SERIALIZED_NAME_SEGMENT_TEXT)
  private String segmentText;

  public static final String SERIALIZED_NAME_RECIPIENT_COUNT = "recipient_count";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_COUNT)
  private Integer recipientCount;

  public static final String SERIALIZED_NAME_SEGMENT_OPTS = "segment_opts";
  @SerializedName(SERIALIZED_NAME_SEGMENT_OPTS)
  private SegmentOptionsProperty3 segmentOpts;

  public ListProperty9() {
  }

  
  public ListProperty9(
     Boolean listIsActive, 
     String listName, 
     String segmentText, 
     Integer recipientCount
  ) {
    this();
    this.listIsActive = listIsActive;
    this.listName = listName;
    this.segmentText = segmentText;
    this.recipientCount = recipientCount;
  }

  public ListProperty9 listId(String listId) {
    
    
    
    
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




   /**
   * The name of the list.
   * @return listName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the list.")

  public String getListName() {
    return listName;
  }




   /**
   * A description of the [segment](https://mailchimp.com/help/getting-started-with-groups/) used for the campaign. Formatted as a string marked up with HTML.
   * @return segmentText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description of the [segment](https://mailchimp.com/help/getting-started-with-groups/) used for the campaign. Formatted as a string marked up with HTML.")

  public String getSegmentText() {
    return segmentText;
  }




   /**
   * Count of the recipients on the associated list. Formatted as an integer.
   * @return recipientCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Count of the recipients on the associated list. Formatted as an integer.")

  public Integer getRecipientCount() {
    return recipientCount;
  }




  public ListProperty9 segmentOpts(SegmentOptionsProperty3 segmentOpts) {
    
    
    
    
    this.segmentOpts = segmentOpts;
    return this;
  }

   /**
   * Get segmentOpts
   * @return segmentOpts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SegmentOptionsProperty3 getSegmentOpts() {
    return segmentOpts;
  }


  public void setSegmentOpts(SegmentOptionsProperty3 segmentOpts) {
    
    
    
    this.segmentOpts = segmentOpts;
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
   * @return the ListProperty9 instance itself
   */
  public ListProperty9 putAdditionalProperty(String key, Object value) {
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
    ListProperty9 listProperty9 = (ListProperty9) o;
    return Objects.equals(this.listId, listProperty9.listId) &&
        Objects.equals(this.listIsActive, listProperty9.listIsActive) &&
        Objects.equals(this.listName, listProperty9.listName) &&
        Objects.equals(this.segmentText, listProperty9.segmentText) &&
        Objects.equals(this.recipientCount, listProperty9.recipientCount) &&
        Objects.equals(this.segmentOpts, listProperty9.segmentOpts)&&
        Objects.equals(this.additionalProperties, listProperty9.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listId, listIsActive, listName, segmentText, recipientCount, segmentOpts, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListProperty9 {\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    listIsActive: ").append(toIndentedString(listIsActive)).append("\n");
    sb.append("    listName: ").append(toIndentedString(listName)).append("\n");
    sb.append("    segmentText: ").append(toIndentedString(segmentText)).append("\n");
    sb.append("    recipientCount: ").append(toIndentedString(recipientCount)).append("\n");
    sb.append("    segmentOpts: ").append(toIndentedString(segmentOpts)).append("\n");
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
    openapiFields.add("segment_text");
    openapiFields.add("recipient_count");
    openapiFields.add("segment_opts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListProperty9
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListProperty9.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListProperty9 is not found in the empty JSON string", ListProperty9.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("list_id") != null && !jsonObj.get("list_id").isJsonNull()) && !jsonObj.get("list_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `list_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("list_id").toString()));
      }
      if ((jsonObj.get("list_name") != null && !jsonObj.get("list_name").isJsonNull()) && !jsonObj.get("list_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `list_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("list_name").toString()));
      }
      if ((jsonObj.get("segment_text") != null && !jsonObj.get("segment_text").isJsonNull()) && !jsonObj.get("segment_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `segment_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("segment_text").toString()));
      }
      // validate the optional field `segment_opts`
      if (jsonObj.get("segment_opts") != null && !jsonObj.get("segment_opts").isJsonNull()) {
        SegmentOptionsProperty3.validateJsonObject(jsonObj.getAsJsonObject("segment_opts"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListProperty9.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListProperty9' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListProperty9> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListProperty9.class));

       return (TypeAdapter<T>) new TypeAdapter<ListProperty9>() {
           @Override
           public void write(JsonWriter out, ListProperty9 value) throws IOException {
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
           public ListProperty9 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ListProperty9 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ListProperty9 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListProperty9
  * @throws IOException if the JSON string is invalid with respect to ListProperty9
  */
  public static ListProperty9 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListProperty9.class);
  }

 /**
  * Convert an instance of ListProperty9 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

