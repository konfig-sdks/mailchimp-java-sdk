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
import com.konfigthis.client.model.ErrorsPropertyInner;
import com.konfigthis.client.model.ListMembers;
import com.konfigthis.client.model.ResourceLink;
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
 * Batch update list members.
 */
@ApiModel(description = "Batch update list members.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ListsBatchSubscribeOrUnsubscribeResponse {
  public static final String SERIALIZED_NAME_NEW_MEMBERS = "new_members";
  @SerializedName(SERIALIZED_NAME_NEW_MEMBERS)
  private List<ListMembers> newMembers = null;

  public static final String SERIALIZED_NAME_UPDATED_MEMBERS = "updated_members";
  @SerializedName(SERIALIZED_NAME_UPDATED_MEMBERS)
  private List<ListMembers> updatedMembers = null;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<ErrorsPropertyInner> errors = null;

  public static final String SERIALIZED_NAME_TOTAL_CREATED = "total_created";
  @SerializedName(SERIALIZED_NAME_TOTAL_CREATED)
  private Integer totalCreated;

  public static final String SERIALIZED_NAME_TOTAL_UPDATED = "total_updated";
  @SerializedName(SERIALIZED_NAME_TOTAL_UPDATED)
  private Integer totalUpdated;

  public static final String SERIALIZED_NAME_ERROR_COUNT = "error_count";
  @SerializedName(SERIALIZED_NAME_ERROR_COUNT)
  private Integer errorCount;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<ResourceLink> links = null;

  public ListsBatchSubscribeOrUnsubscribeResponse() {
  }

  
  public ListsBatchSubscribeOrUnsubscribeResponse(
     List<ResourceLink> links
  ) {
    this();
    this.links = links;
  }

  public ListsBatchSubscribeOrUnsubscribeResponse newMembers(List<ListMembers> newMembers) {
    
    
    
    
    this.newMembers = newMembers;
    return this;
  }

  public ListsBatchSubscribeOrUnsubscribeResponse addNewMembersItem(ListMembers newMembersItem) {
    if (this.newMembers == null) {
      this.newMembers = new ArrayList<>();
    }
    this.newMembers.add(newMembersItem);
    return this;
  }

   /**
   * An array of objects, each representing a new member that was added to the list.
   * @return newMembers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of objects, each representing a new member that was added to the list.")

  public List<ListMembers> getNewMembers() {
    return newMembers;
  }


  public void setNewMembers(List<ListMembers> newMembers) {
    
    
    
    this.newMembers = newMembers;
  }


  public ListsBatchSubscribeOrUnsubscribeResponse updatedMembers(List<ListMembers> updatedMembers) {
    
    
    
    
    this.updatedMembers = updatedMembers;
    return this;
  }

  public ListsBatchSubscribeOrUnsubscribeResponse addUpdatedMembersItem(ListMembers updatedMembersItem) {
    if (this.updatedMembers == null) {
      this.updatedMembers = new ArrayList<>();
    }
    this.updatedMembers.add(updatedMembersItem);
    return this;
  }

   /**
   * An array of objects, each representing an existing list member whose subscription status was updated.
   * @return updatedMembers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of objects, each representing an existing list member whose subscription status was updated.")

  public List<ListMembers> getUpdatedMembers() {
    return updatedMembers;
  }


  public void setUpdatedMembers(List<ListMembers> updatedMembers) {
    
    
    
    this.updatedMembers = updatedMembers;
  }


  public ListsBatchSubscribeOrUnsubscribeResponse errors(List<ErrorsPropertyInner> errors) {
    
    
    
    
    this.errors = errors;
    return this;
  }

  public ListsBatchSubscribeOrUnsubscribeResponse addErrorsItem(ErrorsPropertyInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * An array of objects, each representing an email address that could not be added to the list or updated and an error message providing more details.
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of objects, each representing an email address that could not be added to the list or updated and an error message providing more details.")

  public List<ErrorsPropertyInner> getErrors() {
    return errors;
  }


  public void setErrors(List<ErrorsPropertyInner> errors) {
    
    
    
    this.errors = errors;
  }


  public ListsBatchSubscribeOrUnsubscribeResponse totalCreated(Integer totalCreated) {
    
    
    
    
    this.totalCreated = totalCreated;
    return this;
  }

   /**
   * The total number of items matching the query, irrespective of pagination.
   * @return totalCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "42", value = "The total number of items matching the query, irrespective of pagination.")

  public Integer getTotalCreated() {
    return totalCreated;
  }


  public void setTotalCreated(Integer totalCreated) {
    
    
    
    this.totalCreated = totalCreated;
  }


  public ListsBatchSubscribeOrUnsubscribeResponse totalUpdated(Integer totalUpdated) {
    
    
    
    
    this.totalUpdated = totalUpdated;
    return this;
  }

   /**
   * The total number of items matching the query, irrespective of pagination.
   * @return totalUpdated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "42", value = "The total number of items matching the query, irrespective of pagination.")

  public Integer getTotalUpdated() {
    return totalUpdated;
  }


  public void setTotalUpdated(Integer totalUpdated) {
    
    
    
    this.totalUpdated = totalUpdated;
  }


  public ListsBatchSubscribeOrUnsubscribeResponse errorCount(Integer errorCount) {
    
    
    
    
    this.errorCount = errorCount;
    return this;
  }

   /**
   * The total number of items matching the query, irrespective of pagination.
   * @return errorCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "42", value = "The total number of items matching the query, irrespective of pagination.")

  public Integer getErrorCount() {
    return errorCount;
  }


  public void setErrorCount(Integer errorCount) {
    
    
    
    this.errorCount = errorCount;
  }


   /**
   * A list of link types and descriptions for the API schema documents.
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of link types and descriptions for the API schema documents.")

  public List<ResourceLink> getLinks() {
    return links;
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
   * @return the ListsBatchSubscribeOrUnsubscribeResponse instance itself
   */
  public ListsBatchSubscribeOrUnsubscribeResponse putAdditionalProperty(String key, Object value) {
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
    ListsBatchSubscribeOrUnsubscribeResponse listsBatchSubscribeOrUnsubscribeResponse = (ListsBatchSubscribeOrUnsubscribeResponse) o;
    return Objects.equals(this.newMembers, listsBatchSubscribeOrUnsubscribeResponse.newMembers) &&
        Objects.equals(this.updatedMembers, listsBatchSubscribeOrUnsubscribeResponse.updatedMembers) &&
        Objects.equals(this.errors, listsBatchSubscribeOrUnsubscribeResponse.errors) &&
        Objects.equals(this.totalCreated, listsBatchSubscribeOrUnsubscribeResponse.totalCreated) &&
        Objects.equals(this.totalUpdated, listsBatchSubscribeOrUnsubscribeResponse.totalUpdated) &&
        Objects.equals(this.errorCount, listsBatchSubscribeOrUnsubscribeResponse.errorCount) &&
        Objects.equals(this.links, listsBatchSubscribeOrUnsubscribeResponse.links)&&
        Objects.equals(this.additionalProperties, listsBatchSubscribeOrUnsubscribeResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newMembers, updatedMembers, errors, totalCreated, totalUpdated, errorCount, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListsBatchSubscribeOrUnsubscribeResponse {\n");
    sb.append("    newMembers: ").append(toIndentedString(newMembers)).append("\n");
    sb.append("    updatedMembers: ").append(toIndentedString(updatedMembers)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    totalCreated: ").append(toIndentedString(totalCreated)).append("\n");
    sb.append("    totalUpdated: ").append(toIndentedString(totalUpdated)).append("\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("new_members");
    openapiFields.add("updated_members");
    openapiFields.add("errors");
    openapiFields.add("total_created");
    openapiFields.add("total_updated");
    openapiFields.add("error_count");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListsBatchSubscribeOrUnsubscribeResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListsBatchSubscribeOrUnsubscribeResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListsBatchSubscribeOrUnsubscribeResponse is not found in the empty JSON string", ListsBatchSubscribeOrUnsubscribeResponse.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("new_members") != null && !jsonObj.get("new_members").isJsonNull()) {
        JsonArray jsonArraynewMembers = jsonObj.getAsJsonArray("new_members");
        if (jsonArraynewMembers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("new_members").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `new_members` to be an array in the JSON string but got `%s`", jsonObj.get("new_members").toString()));
          }

          // validate the optional field `new_members` (array)
          for (int i = 0; i < jsonArraynewMembers.size(); i++) {
            ListMembers.validateJsonObject(jsonArraynewMembers.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("updated_members") != null && !jsonObj.get("updated_members").isJsonNull()) {
        JsonArray jsonArrayupdatedMembers = jsonObj.getAsJsonArray("updated_members");
        if (jsonArrayupdatedMembers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("updated_members").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `updated_members` to be an array in the JSON string but got `%s`", jsonObj.get("updated_members").toString()));
          }

          // validate the optional field `updated_members` (array)
          for (int i = 0; i < jsonArrayupdatedMembers.size(); i++) {
            ListMembers.validateJsonObject(jsonArrayupdatedMembers.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull()) {
        JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
        if (jsonArrayerrors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("errors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
          }

          // validate the optional field `errors` (array)
          for (int i = 0; i < jsonArrayerrors.size(); i++) {
            ErrorsPropertyInner.validateJsonObject(jsonArrayerrors.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("_links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("_links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `_links` to be an array in the JSON string but got `%s`", jsonObj.get("_links").toString()));
          }

          // validate the optional field `_links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            ResourceLink.validateJsonObject(jsonArraylinks.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListsBatchSubscribeOrUnsubscribeResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListsBatchSubscribeOrUnsubscribeResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListsBatchSubscribeOrUnsubscribeResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListsBatchSubscribeOrUnsubscribeResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListsBatchSubscribeOrUnsubscribeResponse>() {
           @Override
           public void write(JsonWriter out, ListsBatchSubscribeOrUnsubscribeResponse value) throws IOException {
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
           public ListsBatchSubscribeOrUnsubscribeResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ListsBatchSubscribeOrUnsubscribeResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ListsBatchSubscribeOrUnsubscribeResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListsBatchSubscribeOrUnsubscribeResponse
  * @throws IOException if the JSON string is invalid with respect to ListsBatchSubscribeOrUnsubscribeResponse
  */
  public static ListsBatchSubscribeOrUnsubscribeResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListsBatchSubscribeOrUnsubscribeResponse.class);
  }

 /**
  * Convert an instance of ListsBatchSubscribeOrUnsubscribeResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
