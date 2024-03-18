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
 * A specific feedback message from a specific campaign.
 */
@ApiModel(description = "A specific feedback message from a specific campaign.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CampaignFeedback {
  public static final String SERIALIZED_NAME_FEEDBACK_ID = "feedback_id";
  @SerializedName(SERIALIZED_NAME_FEEDBACK_ID)
  private Integer feedbackId;

  public static final String SERIALIZED_NAME_PARENT_ID = "parent_id";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private Integer parentId;

  public static final String SERIALIZED_NAME_BLOCK_ID = "block_id";
  @SerializedName(SERIALIZED_NAME_BLOCK_ID)
  private Integer blockId;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_IS_COMPLETE = "is_complete";
  @SerializedName(SERIALIZED_NAME_IS_COMPLETE)
  private Boolean isComplete;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  /**
   * The source of the feedback.
   */
  @JsonAdapter(SourceEnum.Adapter.class)
 public enum SourceEnum {
    API("api"),
    
    EMAIL("email"),
    
    SMS("sms"),
    
    WEB("web"),
    
    IOS("ios"),
    
    ANDROID("android");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SourceEnum fromValue(String value) {
      for (SourceEnum b : SourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SourceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SourceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private SourceEnum source;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<ResourceLink> links = null;

  public CampaignFeedback() {
  }

  
  public CampaignFeedback(
     Integer feedbackId, 
     Integer parentId, 
     String createdBy, 
     OffsetDateTime createdAt, 
     OffsetDateTime updatedAt, 
     SourceEnum source, 
     String campaignId, 
     List<ResourceLink> links
  ) {
    this();
    this.feedbackId = feedbackId;
    this.parentId = parentId;
    this.createdBy = createdBy;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.source = source;
    this.campaignId = campaignId;
    this.links = links;
  }

   /**
   * The individual id for the feedback item.
   * @return feedbackId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The individual id for the feedback item.")

  public Integer getFeedbackId() {
    return feedbackId;
  }




   /**
   * If a reply, the id of the parent feedback item.
   * @return parentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If a reply, the id of the parent feedback item.")

  public Integer getParentId() {
    return parentId;
  }




  public CampaignFeedback blockId(Integer blockId) {
    
    
    
    
    this.blockId = blockId;
    return this;
  }

   /**
   * The block id for the editable block that the feedback addresses.
   * @return blockId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The block id for the editable block that the feedback addresses.")

  public Integer getBlockId() {
    return blockId;
  }


  public void setBlockId(Integer blockId) {
    
    
    
    this.blockId = blockId;
  }


  public CampaignFeedback message(String message) {
    
    
    
    
    this.message = message;
    return this;
  }

   /**
   * The content of the feedback.
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The content of the feedback.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    
    
    
    this.message = message;
  }


  public CampaignFeedback isComplete(Boolean isComplete) {
    
    
    
    
    this.isComplete = isComplete;
    return this;
  }

   /**
   * The status of feedback.
   * @return isComplete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of feedback.")

  public Boolean getIsComplete() {
    return isComplete;
  }


  public void setIsComplete(Boolean isComplete) {
    
    
    
    this.isComplete = isComplete;
  }


   /**
   * The login name of the user who created the feedback.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The login name of the user who created the feedback.")

  public String getCreatedBy() {
    return createdBy;
  }




   /**
   * The date and time the feedback item was created in ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the feedback item was created in ISO 8601 format.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * The date and time the feedback was last updated in ISO 8601 format.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the feedback was last updated in ISO 8601 format.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




   /**
   * The source of the feedback.
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The source of the feedback.")

  public SourceEnum getSource() {
    return source;
  }




   /**
   * The unique id for the campaign.
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique id for the campaign.")

  public String getCampaignId() {
    return campaignId;
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
   * @return the CampaignFeedback instance itself
   */
  public CampaignFeedback putAdditionalProperty(String key, Object value) {
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
    CampaignFeedback campaignFeedback = (CampaignFeedback) o;
    return Objects.equals(this.feedbackId, campaignFeedback.feedbackId) &&
        Objects.equals(this.parentId, campaignFeedback.parentId) &&
        Objects.equals(this.blockId, campaignFeedback.blockId) &&
        Objects.equals(this.message, campaignFeedback.message) &&
        Objects.equals(this.isComplete, campaignFeedback.isComplete) &&
        Objects.equals(this.createdBy, campaignFeedback.createdBy) &&
        Objects.equals(this.createdAt, campaignFeedback.createdAt) &&
        Objects.equals(this.updatedAt, campaignFeedback.updatedAt) &&
        Objects.equals(this.source, campaignFeedback.source) &&
        Objects.equals(this.campaignId, campaignFeedback.campaignId) &&
        Objects.equals(this.links, campaignFeedback.links)&&
        Objects.equals(this.additionalProperties, campaignFeedback.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbackId, parentId, blockId, message, isComplete, createdBy, createdAt, updatedAt, source, campaignId, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignFeedback {\n");
    sb.append("    feedbackId: ").append(toIndentedString(feedbackId)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    blockId: ").append(toIndentedString(blockId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    isComplete: ").append(toIndentedString(isComplete)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
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
    openapiFields.add("feedback_id");
    openapiFields.add("parent_id");
    openapiFields.add("block_id");
    openapiFields.add("message");
    openapiFields.add("is_complete");
    openapiFields.add("created_by");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("source");
    openapiFields.add("campaign_id");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("message");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CampaignFeedback
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CampaignFeedback.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CampaignFeedback is not found in the empty JSON string", CampaignFeedback.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CampaignFeedback.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonNull()) && !jsonObj.get("created_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_by").toString()));
      }
      if ((jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if ((jsonObj.get("campaign_id") != null && !jsonObj.get("campaign_id").isJsonNull()) && !jsonObj.get("campaign_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaign_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaign_id").toString()));
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
       if (!CampaignFeedback.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CampaignFeedback' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CampaignFeedback> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CampaignFeedback.class));

       return (TypeAdapter<T>) new TypeAdapter<CampaignFeedback>() {
           @Override
           public void write(JsonWriter out, CampaignFeedback value) throws IOException {
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
           public CampaignFeedback read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CampaignFeedback instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CampaignFeedback given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignFeedback
  * @throws IOException if the JSON string is invalid with respect to CampaignFeedback
  */
  public static CampaignFeedback fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignFeedback.class);
  }

 /**
  * Convert an instance of CampaignFeedback to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

