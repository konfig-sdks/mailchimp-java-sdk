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
 * The report for a survey.
 */
@ApiModel(description = "The report for a survey.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SurveyReport {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_WEB_ID = "web_id";
  @SerializedName(SERIALIZED_NAME_WEB_ID)
  private Integer webId;

  public static final String SERIALIZED_NAME_LIST_ID = "list_id";
  @SerializedName(SERIALIZED_NAME_LIST_ID)
  private String listId;

  public static final String SERIALIZED_NAME_LIST_NAME = "list_name";
  @SerializedName(SERIALIZED_NAME_LIST_NAME)
  private String listName;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  /**
   * The survey&#39;s status.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    PUBLISHED("published"),
    
    UNPUBLISHED("unpublished");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_PUBLISHED_AT = "published_at";
  @SerializedName(SERIALIZED_NAME_PUBLISHED_AT)
  private OffsetDateTime publishedAt;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_TOTAL_RESPONSES = "total_responses";
  @SerializedName(SERIALIZED_NAME_TOTAL_RESPONSES)
  private Integer totalResponses;

  public SurveyReport() {
  }

  
  public SurveyReport(
     String title, 
     String id, 
     Integer webId, 
     String listId, 
     String listName, 
     String url, 
     StatusEnum status, 
     OffsetDateTime publishedAt, 
     OffsetDateTime createdAt, 
     OffsetDateTime updatedAt, 
     Integer totalResponses
  ) {
    this();
    this.title = title;
    this.id = id;
    this.webId = webId;
    this.listId = listId;
    this.listName = listName;
    this.url = url;
    this.status = status;
    this.publishedAt = publishedAt;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.totalResponses = totalResponses;
  }

   /**
   * The title of the survey.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "New product ideas", value = "The title of the survey.")

  public String getTitle() {
    return title;
  }




   /**
   * A string that uniquely identifies this survey.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "040d2c2e1f0", value = "A string that uniquely identifies this survey.")

  public String getId() {
    return id;
  }




   /**
   * The ID used in the Mailchimp web application. View this survey report in your Mailchimp account at &#x60;https://{dc}.admin.mailchimp.com/lists/surveys/results?survey_id&#x3D;{web_id}&#x60;.
   * @return webId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "165", value = "The ID used in the Mailchimp web application. View this survey report in your Mailchimp account at `https://{dc}.admin.mailchimp.com/lists/surveys/results?survey_id={web_id}`.")

  public Integer getWebId() {
    return webId;
  }




   /**
   * The ID of the list connected to this survey.
   * @return listId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the list connected to this survey.")

  public String getListId() {
    return listId;
  }




   /**
   * The name of the list connected to this survey.
   * @return listName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the list connected to this survey.")

  public String getListName() {
    return listName;
  }




   /**
   * The URL for the survey.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL for the survey.")

  public String getUrl() {
    return url;
  }




   /**
   * The survey&#39;s status.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PUBLISHED", value = "The survey's status.")

  public StatusEnum getStatus() {
    return status;
  }




   /**
   * The date and time the survey was published in ISO 8601 format.
   * @return publishedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-08-04T11:09:01Z", value = "The date and time the survey was published in ISO 8601 format.")

  public OffsetDateTime getPublishedAt() {
    return publishedAt;
  }




   /**
   * The date and time the survey was created in ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-08-04T11:09:01Z", value = "The date and time the survey was created in ISO 8601 format.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * The date and time the survey was last updated in ISO 8601 format.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-08-04T11:09:01Z", value = "The date and time the survey was last updated in ISO 8601 format.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




   /**
   * The total number of responses to this survey.
   * @return totalResponses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "810", value = "The total number of responses to this survey.")

  public Integer getTotalResponses() {
    return totalResponses;
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
   * @return the SurveyReport instance itself
   */
  public SurveyReport putAdditionalProperty(String key, Object value) {
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
    SurveyReport surveyReport = (SurveyReport) o;
    return Objects.equals(this.title, surveyReport.title) &&
        Objects.equals(this.id, surveyReport.id) &&
        Objects.equals(this.webId, surveyReport.webId) &&
        Objects.equals(this.listId, surveyReport.listId) &&
        Objects.equals(this.listName, surveyReport.listName) &&
        Objects.equals(this.url, surveyReport.url) &&
        Objects.equals(this.status, surveyReport.status) &&
        Objects.equals(this.publishedAt, surveyReport.publishedAt) &&
        Objects.equals(this.createdAt, surveyReport.createdAt) &&
        Objects.equals(this.updatedAt, surveyReport.updatedAt) &&
        Objects.equals(this.totalResponses, surveyReport.totalResponses)&&
        Objects.equals(this.additionalProperties, surveyReport.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, id, webId, listId, listName, url, status, publishedAt, createdAt, updatedAt, totalResponses, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyReport {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    webId: ").append(toIndentedString(webId)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    listName: ").append(toIndentedString(listName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    totalResponses: ").append(toIndentedString(totalResponses)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("web_id");
    openapiFields.add("list_id");
    openapiFields.add("list_name");
    openapiFields.add("url");
    openapiFields.add("status");
    openapiFields.add("published_at");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("total_responses");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SurveyReport
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SurveyReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SurveyReport is not found in the empty JSON string", SurveyReport.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("list_id") != null && !jsonObj.get("list_id").isJsonNull()) && !jsonObj.get("list_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `list_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("list_id").toString()));
      }
      if ((jsonObj.get("list_name") != null && !jsonObj.get("list_name").isJsonNull()) && !jsonObj.get("list_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `list_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("list_name").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SurveyReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SurveyReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SurveyReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SurveyReport.class));

       return (TypeAdapter<T>) new TypeAdapter<SurveyReport>() {
           @Override
           public void write(JsonWriter out, SurveyReport value) throws IOException {
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
           public SurveyReport read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SurveyReport instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SurveyReport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SurveyReport
  * @throws IOException if the JSON string is invalid with respect to SurveyReport
  */
  public static SurveyReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SurveyReport.class);
  }

 /**
  * Convert an instance of SurveyReport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

