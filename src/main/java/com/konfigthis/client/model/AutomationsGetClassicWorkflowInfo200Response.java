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
import com.konfigthis.client.model.AutomationCampaignSettingsProperty1;
import com.konfigthis.client.model.AutomationTrackingOptionsProperty;
import com.konfigthis.client.model.AutomationTriggerProperty1;
import com.konfigthis.client.model.CampaignReportSummaryProperty;
import com.konfigthis.client.model.ListProperty8;
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
 * A summary of an individual Automation workflow&#39;s settings and content.
 */
@ApiModel(description = "A summary of an individual Automation workflow's settings and content.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AutomationsGetClassicWorkflowInfo200Response {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private OffsetDateTime createTime;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  /**
   * The current status of the Automation.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    SAVE("save"),
    
    PAUSED("paused"),
    
    SENDING("sending");

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

  public static final String SERIALIZED_NAME_EMAILS_SENT = "emails_sent";
  @SerializedName(SERIALIZED_NAME_EMAILS_SENT)
  private Integer emailsSent;

  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private ListProperty8 recipients;

  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private AutomationCampaignSettingsProperty1 settings;

  public static final String SERIALIZED_NAME_TRACKING = "tracking";
  @SerializedName(SERIALIZED_NAME_TRACKING)
  private AutomationTrackingOptionsProperty tracking;

  public static final String SERIALIZED_NAME_TRIGGER_SETTINGS = "trigger_settings";
  @SerializedName(SERIALIZED_NAME_TRIGGER_SETTINGS)
  private AutomationTriggerProperty1 triggerSettings;

  public static final String SERIALIZED_NAME_REPORT_SUMMARY = "report_summary";
  @SerializedName(SERIALIZED_NAME_REPORT_SUMMARY)
  private CampaignReportSummaryProperty reportSummary;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<ResourceLink> links = null;

  public AutomationsGetClassicWorkflowInfo200Response() {
  }

  
  public AutomationsGetClassicWorkflowInfo200Response(
     String id, 
     OffsetDateTime createTime, 
     OffsetDateTime startTime, 
     StatusEnum status, 
     Integer emailsSent, 
     List<ResourceLink> links
  ) {
    this();
    this.id = id;
    this.createTime = createTime;
    this.startTime = startTime;
    this.status = status;
    this.emailsSent = emailsSent;
    this.links = links;
  }

   /**
   * A string that identifies the Automation.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A string that identifies the Automation.")

  public String getId() {
    return id;
  }




   /**
   * The date and time the Automation was created in ISO 8601 format.
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the Automation was created in ISO 8601 format.")

  public OffsetDateTime getCreateTime() {
    return createTime;
  }




   /**
   * The date and time the Automation was started in ISO 8601 format.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the Automation was started in ISO 8601 format.")

  public OffsetDateTime getStartTime() {
    return startTime;
  }




   /**
   * The current status of the Automation.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current status of the Automation.")

  public StatusEnum getStatus() {
    return status;
  }




   /**
   * The total number of emails sent for the Automation.
   * @return emailsSent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of emails sent for the Automation.")

  public Integer getEmailsSent() {
    return emailsSent;
  }




  public AutomationsGetClassicWorkflowInfo200Response recipients(ListProperty8 recipients) {
    
    
    
    
    this.recipients = recipients;
    return this;
  }

   /**
   * Get recipients
   * @return recipients
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ListProperty8 getRecipients() {
    return recipients;
  }


  public void setRecipients(ListProperty8 recipients) {
    
    
    
    this.recipients = recipients;
  }


  public AutomationsGetClassicWorkflowInfo200Response settings(AutomationCampaignSettingsProperty1 settings) {
    
    
    
    
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AutomationCampaignSettingsProperty1 getSettings() {
    return settings;
  }


  public void setSettings(AutomationCampaignSettingsProperty1 settings) {
    
    
    
    this.settings = settings;
  }


  public AutomationsGetClassicWorkflowInfo200Response tracking(AutomationTrackingOptionsProperty tracking) {
    
    
    
    
    this.tracking = tracking;
    return this;
  }

   /**
   * Get tracking
   * @return tracking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AutomationTrackingOptionsProperty getTracking() {
    return tracking;
  }


  public void setTracking(AutomationTrackingOptionsProperty tracking) {
    
    
    
    this.tracking = tracking;
  }


  public AutomationsGetClassicWorkflowInfo200Response triggerSettings(AutomationTriggerProperty1 triggerSettings) {
    
    
    
    
    this.triggerSettings = triggerSettings;
    return this;
  }

   /**
   * Get triggerSettings
   * @return triggerSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AutomationTriggerProperty1 getTriggerSettings() {
    return triggerSettings;
  }


  public void setTriggerSettings(AutomationTriggerProperty1 triggerSettings) {
    
    
    
    this.triggerSettings = triggerSettings;
  }


  public AutomationsGetClassicWorkflowInfo200Response reportSummary(CampaignReportSummaryProperty reportSummary) {
    
    
    
    
    this.reportSummary = reportSummary;
    return this;
  }

   /**
   * Get reportSummary
   * @return reportSummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CampaignReportSummaryProperty getReportSummary() {
    return reportSummary;
  }


  public void setReportSummary(CampaignReportSummaryProperty reportSummary) {
    
    
    
    this.reportSummary = reportSummary;
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
   * @return the AutomationsGetClassicWorkflowInfo200Response instance itself
   */
  public AutomationsGetClassicWorkflowInfo200Response putAdditionalProperty(String key, Object value) {
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
    AutomationsGetClassicWorkflowInfo200Response automationsGetClassicWorkflowInfo200Response = (AutomationsGetClassicWorkflowInfo200Response) o;
    return Objects.equals(this.id, automationsGetClassicWorkflowInfo200Response.id) &&
        Objects.equals(this.createTime, automationsGetClassicWorkflowInfo200Response.createTime) &&
        Objects.equals(this.startTime, automationsGetClassicWorkflowInfo200Response.startTime) &&
        Objects.equals(this.status, automationsGetClassicWorkflowInfo200Response.status) &&
        Objects.equals(this.emailsSent, automationsGetClassicWorkflowInfo200Response.emailsSent) &&
        Objects.equals(this.recipients, automationsGetClassicWorkflowInfo200Response.recipients) &&
        Objects.equals(this.settings, automationsGetClassicWorkflowInfo200Response.settings) &&
        Objects.equals(this.tracking, automationsGetClassicWorkflowInfo200Response.tracking) &&
        Objects.equals(this.triggerSettings, automationsGetClassicWorkflowInfo200Response.triggerSettings) &&
        Objects.equals(this.reportSummary, automationsGetClassicWorkflowInfo200Response.reportSummary) &&
        Objects.equals(this.links, automationsGetClassicWorkflowInfo200Response.links)&&
        Objects.equals(this.additionalProperties, automationsGetClassicWorkflowInfo200Response.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createTime, startTime, status, emailsSent, recipients, settings, tracking, triggerSettings, reportSummary, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomationsGetClassicWorkflowInfo200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    emailsSent: ").append(toIndentedString(emailsSent)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
    sb.append("    triggerSettings: ").append(toIndentedString(triggerSettings)).append("\n");
    sb.append("    reportSummary: ").append(toIndentedString(reportSummary)).append("\n");
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
    openapiFields.add("create_time");
    openapiFields.add("start_time");
    openapiFields.add("status");
    openapiFields.add("emails_sent");
    openapiFields.add("recipients");
    openapiFields.add("settings");
    openapiFields.add("tracking");
    openapiFields.add("trigger_settings");
    openapiFields.add("report_summary");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AutomationsGetClassicWorkflowInfo200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AutomationsGetClassicWorkflowInfo200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutomationsGetClassicWorkflowInfo200Response is not found in the empty JSON string", AutomationsGetClassicWorkflowInfo200Response.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `recipients`
      if (jsonObj.get("recipients") != null && !jsonObj.get("recipients").isJsonNull()) {
        ListProperty8.validateJsonObject(jsonObj.getAsJsonObject("recipients"));
      }
      // validate the optional field `settings`
      if (jsonObj.get("settings") != null && !jsonObj.get("settings").isJsonNull()) {
        AutomationCampaignSettingsProperty1.validateJsonObject(jsonObj.getAsJsonObject("settings"));
      }
      // validate the optional field `tracking`
      if (jsonObj.get("tracking") != null && !jsonObj.get("tracking").isJsonNull()) {
        AutomationTrackingOptionsProperty.validateJsonObject(jsonObj.getAsJsonObject("tracking"));
      }
      // validate the optional field `trigger_settings`
      if (jsonObj.get("trigger_settings") != null && !jsonObj.get("trigger_settings").isJsonNull()) {
        AutomationTriggerProperty1.validateJsonObject(jsonObj.getAsJsonObject("trigger_settings"));
      }
      // validate the optional field `report_summary`
      if (jsonObj.get("report_summary") != null && !jsonObj.get("report_summary").isJsonNull()) {
        CampaignReportSummaryProperty.validateJsonObject(jsonObj.getAsJsonObject("report_summary"));
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
       if (!AutomationsGetClassicWorkflowInfo200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutomationsGetClassicWorkflowInfo200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutomationsGetClassicWorkflowInfo200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutomationsGetClassicWorkflowInfo200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<AutomationsGetClassicWorkflowInfo200Response>() {
           @Override
           public void write(JsonWriter out, AutomationsGetClassicWorkflowInfo200Response value) throws IOException {
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
           public AutomationsGetClassicWorkflowInfo200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AutomationsGetClassicWorkflowInfo200Response instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AutomationsGetClassicWorkflowInfo200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AutomationsGetClassicWorkflowInfo200Response
  * @throws IOException if the JSON string is invalid with respect to AutomationsGetClassicWorkflowInfo200Response
  */
  public static AutomationsGetClassicWorkflowInfo200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutomationsGetClassicWorkflowInfo200Response.class);
  }

 /**
  * Convert an instance of AutomationsGetClassicWorkflowInfo200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

