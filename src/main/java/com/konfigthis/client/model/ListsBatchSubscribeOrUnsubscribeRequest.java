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
import com.konfigthis.client.model.AddListMembers;
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
 * Members to subscribe to or unsubscribe from a list.
 */
@ApiModel(description = "Members to subscribe to or unsubscribe from a list.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ListsBatchSubscribeOrUnsubscribeRequest {
  public static final String SERIALIZED_NAME_MEMBERS = "members";
  @SerializedName(SERIALIZED_NAME_MEMBERS)
  private List<AddListMembers> members = new ArrayList<>();

  public static final String SERIALIZED_NAME_SYNC_TAGS = "sync_tags";
  @SerializedName(SERIALIZED_NAME_SYNC_TAGS)
  private Boolean syncTags;

  public static final String SERIALIZED_NAME_UPDATE_EXISTING = "update_existing";
  @SerializedName(SERIALIZED_NAME_UPDATE_EXISTING)
  private Boolean updateExisting;

  public ListsBatchSubscribeOrUnsubscribeRequest() {
  }

  public ListsBatchSubscribeOrUnsubscribeRequest members(List<AddListMembers> members) {
    
    
    
    
    this.members = members;
    return this;
  }

  public ListsBatchSubscribeOrUnsubscribeRequest addMembersItem(AddListMembers membersItem) {
    this.members.add(membersItem);
    return this;
  }

   /**
   * An array of objects, each representing an email address and the subscription status for a specific list. Up to 500 members may be added or updated with each API call.
   * @return members
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An array of objects, each representing an email address and the subscription status for a specific list. Up to 500 members may be added or updated with each API call.")

  public List<AddListMembers> getMembers() {
    return members;
  }


  public void setMembers(List<AddListMembers> members) {
    
    
    
    this.members = members;
  }


  public ListsBatchSubscribeOrUnsubscribeRequest syncTags(Boolean syncTags) {
    
    
    
    
    this.syncTags = syncTags;
    return this;
  }

   /**
   * Whether this batch operation will replace all existing tags with tags in request.
   * @return syncTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this batch operation will replace all existing tags with tags in request.")

  public Boolean getSyncTags() {
    return syncTags;
  }


  public void setSyncTags(Boolean syncTags) {
    
    
    
    this.syncTags = syncTags;
  }


  public ListsBatchSubscribeOrUnsubscribeRequest updateExisting(Boolean updateExisting) {
    
    
    
    
    this.updateExisting = updateExisting;
    return this;
  }

   /**
   * Whether this batch operation will change existing members&#39; subscription status.
   * @return updateExisting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this batch operation will change existing members' subscription status.")

  public Boolean getUpdateExisting() {
    return updateExisting;
  }


  public void setUpdateExisting(Boolean updateExisting) {
    
    
    
    this.updateExisting = updateExisting;
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
   * @return the ListsBatchSubscribeOrUnsubscribeRequest instance itself
   */
  public ListsBatchSubscribeOrUnsubscribeRequest putAdditionalProperty(String key, Object value) {
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
    ListsBatchSubscribeOrUnsubscribeRequest listsBatchSubscribeOrUnsubscribeRequest = (ListsBatchSubscribeOrUnsubscribeRequest) o;
    return Objects.equals(this.members, listsBatchSubscribeOrUnsubscribeRequest.members) &&
        Objects.equals(this.syncTags, listsBatchSubscribeOrUnsubscribeRequest.syncTags) &&
        Objects.equals(this.updateExisting, listsBatchSubscribeOrUnsubscribeRequest.updateExisting)&&
        Objects.equals(this.additionalProperties, listsBatchSubscribeOrUnsubscribeRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(members, syncTags, updateExisting, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListsBatchSubscribeOrUnsubscribeRequest {\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    syncTags: ").append(toIndentedString(syncTags)).append("\n");
    sb.append("    updateExisting: ").append(toIndentedString(updateExisting)).append("\n");
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
    openapiFields.add("members");
    openapiFields.add("sync_tags");
    openapiFields.add("update_existing");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("members");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListsBatchSubscribeOrUnsubscribeRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListsBatchSubscribeOrUnsubscribeRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListsBatchSubscribeOrUnsubscribeRequest is not found in the empty JSON string", ListsBatchSubscribeOrUnsubscribeRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListsBatchSubscribeOrUnsubscribeRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("members").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `members` to be an array in the JSON string but got `%s`", jsonObj.get("members").toString()));
      }

      JsonArray jsonArraymembers = jsonObj.getAsJsonArray("members");
      // validate the required field `members` (array)
      for (int i = 0; i < jsonArraymembers.size(); i++) {
        AddListMembers.validateJsonObject(jsonArraymembers.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListsBatchSubscribeOrUnsubscribeRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListsBatchSubscribeOrUnsubscribeRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListsBatchSubscribeOrUnsubscribeRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListsBatchSubscribeOrUnsubscribeRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ListsBatchSubscribeOrUnsubscribeRequest>() {
           @Override
           public void write(JsonWriter out, ListsBatchSubscribeOrUnsubscribeRequest value) throws IOException {
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
           public ListsBatchSubscribeOrUnsubscribeRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ListsBatchSubscribeOrUnsubscribeRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ListsBatchSubscribeOrUnsubscribeRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListsBatchSubscribeOrUnsubscribeRequest
  * @throws IOException if the JSON string is invalid with respect to ListsBatchSubscribeOrUnsubscribeRequest
  */
  public static ListsBatchSubscribeOrUnsubscribeRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListsBatchSubscribeOrUnsubscribeRequest.class);
  }

 /**
  * Convert an instance of ListsBatchSubscribeOrUnsubscribeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
