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
import com.konfigthis.client.model.ErrorsPropertyInner1;
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
 * Batch add/remove List members to/from static segment
 */
@ApiModel(description = "Batch add/remove List members to/from static segment")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ListsBatchAddRemoveMembersResponse {
  public static final String SERIALIZED_NAME_MEMBERS_ADDED = "members_added";
  @SerializedName(SERIALIZED_NAME_MEMBERS_ADDED)
  private List<ListMembers> membersAdded = null;

  public static final String SERIALIZED_NAME_MEMBERS_REMOVED = "members_removed";
  @SerializedName(SERIALIZED_NAME_MEMBERS_REMOVED)
  private List<ListMembers> membersRemoved = null;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<ErrorsPropertyInner1> errors = null;

  public static final String SERIALIZED_NAME_TOTAL_ADDED = "total_added";
  @SerializedName(SERIALIZED_NAME_TOTAL_ADDED)
  private Integer totalAdded;

  public static final String SERIALIZED_NAME_TOTAL_REMOVED = "total_removed";
  @SerializedName(SERIALIZED_NAME_TOTAL_REMOVED)
  private Integer totalRemoved;

  public static final String SERIALIZED_NAME_ERROR_COUNT = "error_count";
  @SerializedName(SERIALIZED_NAME_ERROR_COUNT)
  private Integer errorCount;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<ResourceLink> links = null;

  public ListsBatchAddRemoveMembersResponse() {
  }

  
  public ListsBatchAddRemoveMembersResponse(
     List<ResourceLink> links
  ) {
    this();
    this.links = links;
  }

  public ListsBatchAddRemoveMembersResponse membersAdded(List<ListMembers> membersAdded) {
    
    
    
    
    this.membersAdded = membersAdded;
    return this;
  }

  public ListsBatchAddRemoveMembersResponse addMembersAddedItem(ListMembers membersAddedItem) {
    if (this.membersAdded == null) {
      this.membersAdded = new ArrayList<>();
    }
    this.membersAdded.add(membersAddedItem);
    return this;
  }

   /**
   * An array of objects, each representing a new member that was added to the static segment.
   * @return membersAdded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of objects, each representing a new member that was added to the static segment.")

  public List<ListMembers> getMembersAdded() {
    return membersAdded;
  }


  public void setMembersAdded(List<ListMembers> membersAdded) {
    
    
    
    this.membersAdded = membersAdded;
  }


  public ListsBatchAddRemoveMembersResponse membersRemoved(List<ListMembers> membersRemoved) {
    
    
    
    
    this.membersRemoved = membersRemoved;
    return this;
  }

  public ListsBatchAddRemoveMembersResponse addMembersRemovedItem(ListMembers membersRemovedItem) {
    if (this.membersRemoved == null) {
      this.membersRemoved = new ArrayList<>();
    }
    this.membersRemoved.add(membersRemovedItem);
    return this;
  }

   /**
   * An array of objects, each representing an existing list member that got deleted from the static segment.
   * @return membersRemoved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of objects, each representing an existing list member that got deleted from the static segment.")

  public List<ListMembers> getMembersRemoved() {
    return membersRemoved;
  }


  public void setMembersRemoved(List<ListMembers> membersRemoved) {
    
    
    
    this.membersRemoved = membersRemoved;
  }


  public ListsBatchAddRemoveMembersResponse errors(List<ErrorsPropertyInner1> errors) {
    
    
    
    
    this.errors = errors;
    return this;
  }

  public ListsBatchAddRemoveMembersResponse addErrorsItem(ErrorsPropertyInner1 errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * An array of objects, each representing an array of email addresses that could not be added to the segment or removed and an error message providing more details.
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of objects, each representing an array of email addresses that could not be added to the segment or removed and an error message providing more details.")

  public List<ErrorsPropertyInner1> getErrors() {
    return errors;
  }


  public void setErrors(List<ErrorsPropertyInner1> errors) {
    
    
    
    this.errors = errors;
  }


  public ListsBatchAddRemoveMembersResponse totalAdded(Integer totalAdded) {
    
    
    
    
    this.totalAdded = totalAdded;
    return this;
  }

   /**
   * The total number of items matching the query, irrespective of pagination.
   * @return totalAdded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "42", value = "The total number of items matching the query, irrespective of pagination.")

  public Integer getTotalAdded() {
    return totalAdded;
  }


  public void setTotalAdded(Integer totalAdded) {
    
    
    
    this.totalAdded = totalAdded;
  }


  public ListsBatchAddRemoveMembersResponse totalRemoved(Integer totalRemoved) {
    
    
    
    
    this.totalRemoved = totalRemoved;
    return this;
  }

   /**
   * The total number of items matching the query, irrespective of pagination.
   * @return totalRemoved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "42", value = "The total number of items matching the query, irrespective of pagination.")

  public Integer getTotalRemoved() {
    return totalRemoved;
  }


  public void setTotalRemoved(Integer totalRemoved) {
    
    
    
    this.totalRemoved = totalRemoved;
  }


  public ListsBatchAddRemoveMembersResponse errorCount(Integer errorCount) {
    
    
    
    
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
   * @return the ListsBatchAddRemoveMembersResponse instance itself
   */
  public ListsBatchAddRemoveMembersResponse putAdditionalProperty(String key, Object value) {
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
    ListsBatchAddRemoveMembersResponse listsBatchAddRemoveMembersResponse = (ListsBatchAddRemoveMembersResponse) o;
    return Objects.equals(this.membersAdded, listsBatchAddRemoveMembersResponse.membersAdded) &&
        Objects.equals(this.membersRemoved, listsBatchAddRemoveMembersResponse.membersRemoved) &&
        Objects.equals(this.errors, listsBatchAddRemoveMembersResponse.errors) &&
        Objects.equals(this.totalAdded, listsBatchAddRemoveMembersResponse.totalAdded) &&
        Objects.equals(this.totalRemoved, listsBatchAddRemoveMembersResponse.totalRemoved) &&
        Objects.equals(this.errorCount, listsBatchAddRemoveMembersResponse.errorCount) &&
        Objects.equals(this.links, listsBatchAddRemoveMembersResponse.links)&&
        Objects.equals(this.additionalProperties, listsBatchAddRemoveMembersResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(membersAdded, membersRemoved, errors, totalAdded, totalRemoved, errorCount, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListsBatchAddRemoveMembersResponse {\n");
    sb.append("    membersAdded: ").append(toIndentedString(membersAdded)).append("\n");
    sb.append("    membersRemoved: ").append(toIndentedString(membersRemoved)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    totalAdded: ").append(toIndentedString(totalAdded)).append("\n");
    sb.append("    totalRemoved: ").append(toIndentedString(totalRemoved)).append("\n");
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
    openapiFields.add("members_added");
    openapiFields.add("members_removed");
    openapiFields.add("errors");
    openapiFields.add("total_added");
    openapiFields.add("total_removed");
    openapiFields.add("error_count");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListsBatchAddRemoveMembersResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListsBatchAddRemoveMembersResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListsBatchAddRemoveMembersResponse is not found in the empty JSON string", ListsBatchAddRemoveMembersResponse.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("members_added") != null && !jsonObj.get("members_added").isJsonNull()) {
        JsonArray jsonArraymembersAdded = jsonObj.getAsJsonArray("members_added");
        if (jsonArraymembersAdded != null) {
          // ensure the json data is an array
          if (!jsonObj.get("members_added").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `members_added` to be an array in the JSON string but got `%s`", jsonObj.get("members_added").toString()));
          }

          // validate the optional field `members_added` (array)
          for (int i = 0; i < jsonArraymembersAdded.size(); i++) {
            ListMembers.validateJsonObject(jsonArraymembersAdded.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("members_removed") != null && !jsonObj.get("members_removed").isJsonNull()) {
        JsonArray jsonArraymembersRemoved = jsonObj.getAsJsonArray("members_removed");
        if (jsonArraymembersRemoved != null) {
          // ensure the json data is an array
          if (!jsonObj.get("members_removed").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `members_removed` to be an array in the JSON string but got `%s`", jsonObj.get("members_removed").toString()));
          }

          // validate the optional field `members_removed` (array)
          for (int i = 0; i < jsonArraymembersRemoved.size(); i++) {
            ListMembers.validateJsonObject(jsonArraymembersRemoved.get(i).getAsJsonObject());
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
            ErrorsPropertyInner1.validateJsonObject(jsonArrayerrors.get(i).getAsJsonObject());
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
       if (!ListsBatchAddRemoveMembersResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListsBatchAddRemoveMembersResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListsBatchAddRemoveMembersResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListsBatchAddRemoveMembersResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListsBatchAddRemoveMembersResponse>() {
           @Override
           public void write(JsonWriter out, ListsBatchAddRemoveMembersResponse value) throws IOException {
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
           public ListsBatchAddRemoveMembersResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ListsBatchAddRemoveMembersResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ListsBatchAddRemoveMembersResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListsBatchAddRemoveMembersResponse
  * @throws IOException if the JSON string is invalid with respect to ListsBatchAddRemoveMembersResponse
  */
  public static ListsBatchAddRemoveMembersResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListsBatchAddRemoveMembersResponse.class);
  }

 /**
  * Convert an instance of ListsBatchAddRemoveMembersResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

