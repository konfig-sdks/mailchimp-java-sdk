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
import com.konfigthis.client.model.ResourceLink;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * A specific note for a specific member.
 */
@ApiModel(description = "A specific note for a specific member.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ListsUpdateNoteSpecificListMember200Response {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_LIST_ID = "list_id";
  @SerializedName(SERIALIZED_NAME_LIST_ID)
  private String listId;

  public static final String SERIALIZED_NAME_EMAIL_ID = "email_id";
  @SerializedName(SERIALIZED_NAME_EMAIL_ID)
  private String emailId;

  public static final String SERIALIZED_NAME_CONTACT_ID = "contact_id";
  @SerializedName(SERIALIZED_NAME_CONTACT_ID)
  private String contactId;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<ResourceLink> links = null;

  public ListsUpdateNoteSpecificListMember200Response() {
  }

  
  public ListsUpdateNoteSpecificListMember200Response(
     Integer id, 
     OffsetDateTime createdAt, 
     String createdBy, 
     OffsetDateTime updatedAt, 
     String listId, 
     String emailId, 
     String contactId, 
     List<ResourceLink> links
  ) {
    this();
    this.id = id;
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.updatedAt = updatedAt;
    this.listId = listId;
    this.emailId = emailId;
    this.contactId = contactId;
    this.links = links;
  }

   /**
   * The note id.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The note id.")

  public Integer getId() {
    return id;
  }




   /**
   * The date and time the note was created in ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the note was created in ISO 8601 format.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * The author of the note.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The author of the note.")

  public String getCreatedBy() {
    return createdBy;
  }




   /**
   * The date and time the note was last updated in ISO 8601 format.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the note was last updated in ISO 8601 format.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




  public ListsUpdateNoteSpecificListMember200Response note(String note) {
    
    
    
    
    this.note = note;
    return this;
  }

   /**
   * The content of the note.
   * @return note
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The content of the note.")

  public String getNote() {
    return note;
  }


  public void setNote(String note) {
    
    
    
    this.note = note;
  }


   /**
   * The unique id for the list.
   * @return listId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique id for the list.")

  public String getListId() {
    return listId;
  }




   /**
   * The MD5 hash of the lowercase version of the list member&#39;s email address.
   * @return emailId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The MD5 hash of the lowercase version of the list member's email address.")

  public String getEmailId() {
    return emailId;
  }




   /**
   * As Mailchimp evolves beyond email, you may eventually have contacts without email addresses. While the &#x60;email_id&#x60; is the MD5 hash of their email address, this &#x60;contact_id&#x60; is agnostic of contact’s inclusion of an email address.
   * @return contactId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "As Mailchimp evolves beyond email, you may eventually have contacts without email addresses. While the `email_id` is the MD5 hash of their email address, this `contact_id` is agnostic of contact’s inclusion of an email address.")

  public String getContactId() {
    return contactId;
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
   * @return the ListsUpdateNoteSpecificListMember200Response instance itself
   */
  public ListsUpdateNoteSpecificListMember200Response putAdditionalProperty(String key, Object value) {
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
    ListsUpdateNoteSpecificListMember200Response listsUpdateNoteSpecificListMember200Response = (ListsUpdateNoteSpecificListMember200Response) o;
    return Objects.equals(this.id, listsUpdateNoteSpecificListMember200Response.id) &&
        Objects.equals(this.createdAt, listsUpdateNoteSpecificListMember200Response.createdAt) &&
        Objects.equals(this.createdBy, listsUpdateNoteSpecificListMember200Response.createdBy) &&
        Objects.equals(this.updatedAt, listsUpdateNoteSpecificListMember200Response.updatedAt) &&
        Objects.equals(this.note, listsUpdateNoteSpecificListMember200Response.note) &&
        Objects.equals(this.listId, listsUpdateNoteSpecificListMember200Response.listId) &&
        Objects.equals(this.emailId, listsUpdateNoteSpecificListMember200Response.emailId) &&
        Objects.equals(this.contactId, listsUpdateNoteSpecificListMember200Response.contactId) &&
        Objects.equals(this.links, listsUpdateNoteSpecificListMember200Response.links)&&
        Objects.equals(this.additionalProperties, listsUpdateNoteSpecificListMember200Response.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, createdBy, updatedAt, note, listId, emailId, contactId, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListsUpdateNoteSpecificListMember200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("created_at");
    openapiFields.add("created_by");
    openapiFields.add("updated_at");
    openapiFields.add("note");
    openapiFields.add("list_id");
    openapiFields.add("email_id");
    openapiFields.add("contact_id");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListsUpdateNoteSpecificListMember200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListsUpdateNoteSpecificListMember200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListsUpdateNoteSpecificListMember200Response is not found in the empty JSON string", ListsUpdateNoteSpecificListMember200Response.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonNull()) && !jsonObj.get("created_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_by").toString()));
      }
      if ((jsonObj.get("note") != null && !jsonObj.get("note").isJsonNull()) && !jsonObj.get("note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("note").toString()));
      }
      if ((jsonObj.get("list_id") != null && !jsonObj.get("list_id").isJsonNull()) && !jsonObj.get("list_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `list_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("list_id").toString()));
      }
      if ((jsonObj.get("email_id") != null && !jsonObj.get("email_id").isJsonNull()) && !jsonObj.get("email_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email_id").toString()));
      }
      if ((jsonObj.get("contact_id") != null && !jsonObj.get("contact_id").isJsonNull()) && !jsonObj.get("contact_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contact_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contact_id").toString()));
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
       if (!ListsUpdateNoteSpecificListMember200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListsUpdateNoteSpecificListMember200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListsUpdateNoteSpecificListMember200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListsUpdateNoteSpecificListMember200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ListsUpdateNoteSpecificListMember200Response>() {
           @Override
           public void write(JsonWriter out, ListsUpdateNoteSpecificListMember200Response value) throws IOException {
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
           public ListsUpdateNoteSpecificListMember200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ListsUpdateNoteSpecificListMember200Response instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ListsUpdateNoteSpecificListMember200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListsUpdateNoteSpecificListMember200Response
  * @throws IOException if the JSON string is invalid with respect to ListsUpdateNoteSpecificListMember200Response
  */
  public static ListsUpdateNoteSpecificListMember200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListsUpdateNoteSpecificListMember200Response.class);
  }

 /**
  * Convert an instance of ListsUpdateNoteSpecificListMember200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

