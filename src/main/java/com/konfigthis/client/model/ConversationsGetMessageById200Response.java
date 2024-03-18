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
 * An individual message in a conversation. Conversation tracking is a feature available to paid accounts that lets you view replies to your campaigns in your Mailchimp account.
 */
@ApiModel(description = "An individual message in a conversation. Conversation tracking is a feature available to paid accounts that lets you view replies to your campaigns in your Mailchimp account.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ConversationsGetMessageById200Response {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CONVERSATION_ID = "conversation_id";
  @SerializedName(SERIALIZED_NAME_CONVERSATION_ID)
  private String conversationId;

  public static final String SERIALIZED_NAME_LIST_ID = "list_id";
  @SerializedName(SERIALIZED_NAME_LIST_ID)
  private Integer listId;

  public static final String SERIALIZED_NAME_FROM_LABEL = "from_label";
  @SerializedName(SERIALIZED_NAME_FROM_LABEL)
  private String fromLabel;

  public static final String SERIALIZED_NAME_FROM_EMAIL = "from_email";
  @SerializedName(SERIALIZED_NAME_FROM_EMAIL)
  private String fromEmail;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_READ = "read";
  @SerializedName(SERIALIZED_NAME_READ)
  private Boolean read;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<ResourceLink> links = null;

  public ConversationsGetMessageById200Response() {
  }

  
  public ConversationsGetMessageById200Response(
     String id, 
     String conversationId, 
     Integer listId, 
     String fromLabel, 
     OffsetDateTime timestamp, 
     List<ResourceLink> links
  ) {
    this();
    this.id = id;
    this.conversationId = conversationId;
    this.listId = listId;
    this.fromLabel = fromLabel;
    this.timestamp = timestamp;
    this.links = links;
  }

   /**
   * A string that uniquely identifies this message
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A string that uniquely identifies this message")

  public String getId() {
    return id;
  }




   /**
   * A string that identifies this message&#39;s conversation
   * @return conversationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A string that identifies this message's conversation")

  public String getConversationId() {
    return conversationId;
  }




   /**
   * The list&#39;s web ID
   * @return listId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list's web ID")

  public Integer getListId() {
    return listId;
  }




   /**
   * A label representing the sender of this message
   * @return fromLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A label representing the sender of this message")

  public String getFromLabel() {
    return fromLabel;
  }




  public ConversationsGetMessageById200Response fromEmail(String fromEmail) {
    
    
    
    
    this.fromEmail = fromEmail;
    return this;
  }

   /**
   * A label representing the email of the sender of this message
   * @return fromEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A label representing the email of the sender of this message")

  public String getFromEmail() {
    return fromEmail;
  }


  public void setFromEmail(String fromEmail) {
    
    
    
    this.fromEmail = fromEmail;
  }


  public ConversationsGetMessageById200Response subject(String subject) {
    
    
    
    
    this.subject = subject;
    return this;
  }

   /**
   * The subject of this message
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The subject of this message")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    
    
    
    this.subject = subject;
  }


  public ConversationsGetMessageById200Response message(String message) {
    
    
    
    
    this.message = message;
    return this;
  }

   /**
   * The plain-text content of the message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The plain-text content of the message")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    
    
    
    this.message = message;
  }


  public ConversationsGetMessageById200Response read(Boolean read) {
    
    
    
    
    this.read = read;
    return this;
  }

   /**
   * Whether this message has been marked as read
   * @return read
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this message has been marked as read")

  public Boolean getRead() {
    return read;
  }


  public void setRead(Boolean read) {
    
    
    
    this.read = read;
  }


   /**
   * The date and time the message was either sent or received in ISO 8601 format.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the message was either sent or received in ISO 8601 format.")

  public OffsetDateTime getTimestamp() {
    return timestamp;
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
   * @return the ConversationsGetMessageById200Response instance itself
   */
  public ConversationsGetMessageById200Response putAdditionalProperty(String key, Object value) {
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
    ConversationsGetMessageById200Response conversationsGetMessageById200Response = (ConversationsGetMessageById200Response) o;
    return Objects.equals(this.id, conversationsGetMessageById200Response.id) &&
        Objects.equals(this.conversationId, conversationsGetMessageById200Response.conversationId) &&
        Objects.equals(this.listId, conversationsGetMessageById200Response.listId) &&
        Objects.equals(this.fromLabel, conversationsGetMessageById200Response.fromLabel) &&
        Objects.equals(this.fromEmail, conversationsGetMessageById200Response.fromEmail) &&
        Objects.equals(this.subject, conversationsGetMessageById200Response.subject) &&
        Objects.equals(this.message, conversationsGetMessageById200Response.message) &&
        Objects.equals(this.read, conversationsGetMessageById200Response.read) &&
        Objects.equals(this.timestamp, conversationsGetMessageById200Response.timestamp) &&
        Objects.equals(this.links, conversationsGetMessageById200Response.links)&&
        Objects.equals(this.additionalProperties, conversationsGetMessageById200Response.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, conversationId, listId, fromLabel, fromEmail, subject, message, read, timestamp, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationsGetMessageById200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    fromLabel: ").append(toIndentedString(fromLabel)).append("\n");
    sb.append("    fromEmail: ").append(toIndentedString(fromEmail)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
    openapiFields.add("conversation_id");
    openapiFields.add("list_id");
    openapiFields.add("from_label");
    openapiFields.add("from_email");
    openapiFields.add("subject");
    openapiFields.add("message");
    openapiFields.add("read");
    openapiFields.add("timestamp");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConversationsGetMessageById200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConversationsGetMessageById200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConversationsGetMessageById200Response is not found in the empty JSON string", ConversationsGetMessageById200Response.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("conversation_id") != null && !jsonObj.get("conversation_id").isJsonNull()) && !jsonObj.get("conversation_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conversation_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conversation_id").toString()));
      }
      if ((jsonObj.get("from_label") != null && !jsonObj.get("from_label").isJsonNull()) && !jsonObj.get("from_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `from_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("from_label").toString()));
      }
      if ((jsonObj.get("from_email") != null && !jsonObj.get("from_email").isJsonNull()) && !jsonObj.get("from_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `from_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("from_email").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
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
       if (!ConversationsGetMessageById200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConversationsGetMessageById200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConversationsGetMessageById200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConversationsGetMessageById200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ConversationsGetMessageById200Response>() {
           @Override
           public void write(JsonWriter out, ConversationsGetMessageById200Response value) throws IOException {
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
           public ConversationsGetMessageById200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ConversationsGetMessageById200Response instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ConversationsGetMessageById200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConversationsGetMessageById200Response
  * @throws IOException if the JSON string is invalid with respect to ConversationsGetMessageById200Response
  */
  public static ConversationsGetMessageById200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConversationsGetMessageById200Response.class);
  }

 /**
  * Convert an instance of ConversationsGetMessageById200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
