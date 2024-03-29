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
import com.konfigthis.client.model.RecipientsProperty;
import com.konfigthis.client.model.ReportSummaryProperty;
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
 * FacebookAdsListAdsResponseFacebookAdsInnerAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class FacebookAdsListAdsResponseFacebookAdsInnerAllOf {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_WEB_ID = "web_id";
  @SerializedName(SERIALIZED_NAME_WEB_ID)
  private Integer webId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * The type of outreach this object is.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    REGULAR("regular"),
    
    EMAIL_TOUCHPOINT("email-touchpoint"),
    
    PLAINTEXT("plaintext"),
    
    RSS("rss"),
    
    RECONFIRM("reconfirm"),
    
    VARIATE("variate"),
    
    ABSPLIT("absplit"),
    
    AUTOMATION("automation"),
    
    FACEBOOK("facebook"),
    
    GOOGLE("google"),
    
    AUTORESPONDER("autoresponder"),
    
    TRANSACTIONAL("transactional"),
    
    PAGE("page"),
    
    WEBSITE("website"),
    
    SOCIAL_POST("social_post"),
    
    SURVEY("survey"),
    
    CUSTOMER_JOURNEY("customer_journey"),
    
    SMS("sms");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  /**
   * The status of this outreach.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    SAVE("save"),
    
    PAUSED("paused"),
    
    SCHEDULE("schedule"),
    
    SCHEDULED("scheduled"),
    
    SENDING("sending"),
    
    SENT("sent"),
    
    CANCELED("canceled"),
    
    CANCELING("canceling"),
    
    ACTIVE("active"),
    
    DISCONNECTED("disconnected"),
    
    SOMEPAUSED("somepaused"),
    
    DRAFT("draft"),
    
    COMPLETED("completed"),
    
    PARTIALREJECTED("partialRejected"),
    
    PENDING("pending"),
    
    REJECTED("rejected"),
    
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

  public static final String SERIALIZED_NAME_SHOW_REPORT = "show_report";
  @SerializedName(SERIALIZED_NAME_SHOW_REPORT)
  private Boolean showReport;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private OffsetDateTime createTime;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_CANCELED_AT = "canceled_at";
  @SerializedName(SERIALIZED_NAME_CANCELED_AT)
  private OffsetDateTime canceledAt;

  public static final String SERIALIZED_NAME_PUBLISHED_TIME = "published_time";
  @SerializedName(SERIALIZED_NAME_PUBLISHED_TIME)
  private OffsetDateTime publishedTime;

  public static final String SERIALIZED_NAME_HAS_SEGMENT = "has_segment";
  @SerializedName(SERIALIZED_NAME_HAS_SEGMENT)
  private Boolean hasSegment;

  public static final String SERIALIZED_NAME_REPORT_SUMMARY = "report_summary";
  @SerializedName(SERIALIZED_NAME_REPORT_SUMMARY)
  private ReportSummaryProperty reportSummary;

  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private RecipientsProperty recipients;

  public static final String SERIALIZED_NAME_THUMBNAIL = "thumbnail";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL)
  private String thumbnail;

  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf() {
  }

  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID of an Outreach.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID of an Outreach.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf webId(Integer webId) {
    
    
    
    
    this.webId = webId;
    return this;
  }

   /**
   * The ID used in the Mailchimp web application. For example, for a &#x60;regular&#x60; outreach, you can view this campaign in your Mailchimp account at &#x60;https://{dc}.admin.mailchimp.com/campaigns/show/?id&#x3D;{web_id}&#x60;.
   * @return webId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID used in the Mailchimp web application. For example, for a `regular` outreach, you can view this campaign in your Mailchimp account at `https://{dc}.admin.mailchimp.com/campaigns/show/?id={web_id}`.")

  public Integer getWebId() {
    return webId;
  }


  public void setWebId(Integer webId) {
    
    
    
    this.webId = webId;
  }


  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Title or name of an Outreach.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title or name of an Outreach.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * The type of outreach this object is.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of outreach this object is.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The status of this outreach.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of this outreach.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf showReport(Boolean showReport) {
    
    
    
    
    this.showReport = showReport;
    return this;
  }

   /**
   * Outreach report availability. Note: This property is hotly debated in what it _should_ convey. See [MCP-1371](https://jira.mailchimp.com/browse/MCP-1371) for more context.
   * @return showReport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Outreach report availability. Note: This property is hotly debated in what it _should_ convey. See [MCP-1371](https://jira.mailchimp.com/browse/MCP-1371) for more context.")

  public Boolean getShowReport() {
    return showReport;
  }


  public void setShowReport(Boolean showReport) {
    
    
    
    this.showReport = showReport;
  }


  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf createTime(OffsetDateTime createTime) {
    
    
    
    
    this.createTime = createTime;
    return this;
  }

   /**
   * The date and time the outreach was created in ISO 8601 format.
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the outreach was created in ISO 8601 format.")

  public OffsetDateTime getCreateTime() {
    return createTime;
  }


  public void setCreateTime(OffsetDateTime createTime) {
    
    
    
    this.createTime = createTime;
  }


  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf startTime(OffsetDateTime startTime) {
    
    
    
    
    this.startTime = startTime;
    return this;
  }

   /**
   * The date and time the outreach was started in ISO 8601 format.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the outreach was started in ISO 8601 format.")

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    
    
    
    this.startTime = startTime;
  }


  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf updatedAt(OffsetDateTime updatedAt) {
    
    
    
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time the outreach was last updated in ISO 8601 format.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the outreach was last updated in ISO 8601 format.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    
    
    
    this.updatedAt = updatedAt;
  }


  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf canceledAt(OffsetDateTime canceledAt) {
    
    
    
    
    this.canceledAt = canceledAt;
    return this;
  }

   /**
   * The date and time the outreach was canceled in ISO 8601 format.
   * @return canceledAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the outreach was canceled in ISO 8601 format.")

  public OffsetDateTime getCanceledAt() {
    return canceledAt;
  }


  public void setCanceledAt(OffsetDateTime canceledAt) {
    
    
    
    this.canceledAt = canceledAt;
  }


  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf publishedTime(OffsetDateTime publishedTime) {
    
    
    
    
    this.publishedTime = publishedTime;
    return this;
  }

   /**
   * The date and time the outreach was (or will be) published in ISO 8601 format.
   * @return publishedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the outreach was (or will be) published in ISO 8601 format.")

  public OffsetDateTime getPublishedTime() {
    return publishedTime;
  }


  public void setPublishedTime(OffsetDateTime publishedTime) {
    
    
    
    this.publishedTime = publishedTime;
  }


  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf hasSegment(Boolean hasSegment) {
    
    
    
    
    this.hasSegment = hasSegment;
    return this;
  }

   /**
   * If this outreach targets a segment of your audience.
   * @return hasSegment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If this outreach targets a segment of your audience.")

  public Boolean getHasSegment() {
    return hasSegment;
  }


  public void setHasSegment(Boolean hasSegment) {
    
    
    
    this.hasSegment = hasSegment;
  }


  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf reportSummary(ReportSummaryProperty reportSummary) {
    
    
    
    
    this.reportSummary = reportSummary;
    return this;
  }

   /**
   * Get reportSummary
   * @return reportSummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReportSummaryProperty getReportSummary() {
    return reportSummary;
  }


  public void setReportSummary(ReportSummaryProperty reportSummary) {
    
    
    
    this.reportSummary = reportSummary;
  }


  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf recipients(RecipientsProperty recipients) {
    
    
    
    
    this.recipients = recipients;
    return this;
  }

   /**
   * Get recipients
   * @return recipients
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RecipientsProperty getRecipients() {
    return recipients;
  }


  public void setRecipients(RecipientsProperty recipients) {
    
    
    
    this.recipients = recipients;
  }


  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf thumbnail(String thumbnail) {
    
    
    
    
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * The URL of the thumbnail for this outreach.
   * @return thumbnail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the thumbnail for this outreach.")

  public String getThumbnail() {
    return thumbnail;
  }


  public void setThumbnail(String thumbnail) {
    
    
    
    this.thumbnail = thumbnail;
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
   * @return the FacebookAdsListAdsResponseFacebookAdsInnerAllOf instance itself
   */
  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf putAdditionalProperty(String key, Object value) {
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
    FacebookAdsListAdsResponseFacebookAdsInnerAllOf facebookAdsListAdsResponseFacebookAdsInnerAllOf = (FacebookAdsListAdsResponseFacebookAdsInnerAllOf) o;
    return Objects.equals(this.id, facebookAdsListAdsResponseFacebookAdsInnerAllOf.id) &&
        Objects.equals(this.webId, facebookAdsListAdsResponseFacebookAdsInnerAllOf.webId) &&
        Objects.equals(this.name, facebookAdsListAdsResponseFacebookAdsInnerAllOf.name) &&
        Objects.equals(this.type, facebookAdsListAdsResponseFacebookAdsInnerAllOf.type) &&
        Objects.equals(this.status, facebookAdsListAdsResponseFacebookAdsInnerAllOf.status) &&
        Objects.equals(this.showReport, facebookAdsListAdsResponseFacebookAdsInnerAllOf.showReport) &&
        Objects.equals(this.createTime, facebookAdsListAdsResponseFacebookAdsInnerAllOf.createTime) &&
        Objects.equals(this.startTime, facebookAdsListAdsResponseFacebookAdsInnerAllOf.startTime) &&
        Objects.equals(this.updatedAt, facebookAdsListAdsResponseFacebookAdsInnerAllOf.updatedAt) &&
        Objects.equals(this.canceledAt, facebookAdsListAdsResponseFacebookAdsInnerAllOf.canceledAt) &&
        Objects.equals(this.publishedTime, facebookAdsListAdsResponseFacebookAdsInnerAllOf.publishedTime) &&
        Objects.equals(this.hasSegment, facebookAdsListAdsResponseFacebookAdsInnerAllOf.hasSegment) &&
        Objects.equals(this.reportSummary, facebookAdsListAdsResponseFacebookAdsInnerAllOf.reportSummary) &&
        Objects.equals(this.recipients, facebookAdsListAdsResponseFacebookAdsInnerAllOf.recipients) &&
        Objects.equals(this.thumbnail, facebookAdsListAdsResponseFacebookAdsInnerAllOf.thumbnail)&&
        Objects.equals(this.additionalProperties, facebookAdsListAdsResponseFacebookAdsInnerAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, webId, name, type, status, showReport, createTime, startTime, updatedAt, canceledAt, publishedTime, hasSegment, reportSummary, recipients, thumbnail, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacebookAdsListAdsResponseFacebookAdsInnerAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    webId: ").append(toIndentedString(webId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    showReport: ").append(toIndentedString(showReport)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    canceledAt: ").append(toIndentedString(canceledAt)).append("\n");
    sb.append("    publishedTime: ").append(toIndentedString(publishedTime)).append("\n");
    sb.append("    hasSegment: ").append(toIndentedString(hasSegment)).append("\n");
    sb.append("    reportSummary: ").append(toIndentedString(reportSummary)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
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
    openapiFields.add("web_id");
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("status");
    openapiFields.add("show_report");
    openapiFields.add("create_time");
    openapiFields.add("start_time");
    openapiFields.add("updated_at");
    openapiFields.add("canceled_at");
    openapiFields.add("published_time");
    openapiFields.add("has_segment");
    openapiFields.add("report_summary");
    openapiFields.add("recipients");
    openapiFields.add("thumbnail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FacebookAdsListAdsResponseFacebookAdsInnerAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FacebookAdsListAdsResponseFacebookAdsInnerAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FacebookAdsListAdsResponseFacebookAdsInnerAllOf is not found in the empty JSON string", FacebookAdsListAdsResponseFacebookAdsInnerAllOf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `report_summary`
      if (jsonObj.get("report_summary") != null && !jsonObj.get("report_summary").isJsonNull()) {
        ReportSummaryProperty.validateJsonObject(jsonObj.getAsJsonObject("report_summary"));
      }
      // validate the optional field `recipients`
      if (jsonObj.get("recipients") != null && !jsonObj.get("recipients").isJsonNull()) {
        RecipientsProperty.validateJsonObject(jsonObj.getAsJsonObject("recipients"));
      }
      if ((jsonObj.get("thumbnail") != null && !jsonObj.get("thumbnail").isJsonNull()) && !jsonObj.get("thumbnail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thumbnail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thumbnail").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FacebookAdsListAdsResponseFacebookAdsInnerAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FacebookAdsListAdsResponseFacebookAdsInnerAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FacebookAdsListAdsResponseFacebookAdsInnerAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FacebookAdsListAdsResponseFacebookAdsInnerAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<FacebookAdsListAdsResponseFacebookAdsInnerAllOf>() {
           @Override
           public void write(JsonWriter out, FacebookAdsListAdsResponseFacebookAdsInnerAllOf value) throws IOException {
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
           public FacebookAdsListAdsResponseFacebookAdsInnerAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FacebookAdsListAdsResponseFacebookAdsInnerAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FacebookAdsListAdsResponseFacebookAdsInnerAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FacebookAdsListAdsResponseFacebookAdsInnerAllOf
  * @throws IOException if the JSON string is invalid with respect to FacebookAdsListAdsResponseFacebookAdsInnerAllOf
  */
  public static FacebookAdsListAdsResponseFacebookAdsInnerAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FacebookAdsListAdsResponseFacebookAdsInnerAllOf.class);
  }

 /**
  * Convert an instance of FacebookAdsListAdsResponseFacebookAdsInnerAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

