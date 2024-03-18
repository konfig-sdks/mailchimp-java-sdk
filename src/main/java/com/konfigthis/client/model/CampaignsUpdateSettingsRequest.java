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
import com.konfigthis.client.model.ABTestOptionsProperty;
import com.konfigthis.client.model.CampaignSettingsProperty2;
import com.konfigthis.client.model.CampaignSocialCardProperty;
import com.konfigthis.client.model.CampaignTrackingOptionsProperty;
import com.konfigthis.client.model.ListProperty2;
import com.konfigthis.client.model.RSSOptionsProperty1;
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
 * A summary of an individual campaign&#39;s settings and content.
 */
@ApiModel(description = "A summary of an individual campaign's settings and content.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CampaignsUpdateSettingsRequest {
  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private ListProperty2 recipients;

  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private CampaignSettingsProperty2 settings;

  public static final String SERIALIZED_NAME_VARIATE_SETTINGS = "variate_settings";
  @SerializedName(SERIALIZED_NAME_VARIATE_SETTINGS)
  private ABTestOptionsProperty variateSettings;

  public static final String SERIALIZED_NAME_TRACKING = "tracking";
  @SerializedName(SERIALIZED_NAME_TRACKING)
  private CampaignTrackingOptionsProperty tracking;

  public static final String SERIALIZED_NAME_RSS_OPTS = "rss_opts";
  @SerializedName(SERIALIZED_NAME_RSS_OPTS)
  private RSSOptionsProperty1 rssOpts;

  public static final String SERIALIZED_NAME_SOCIAL_CARD = "social_card";
  @SerializedName(SERIALIZED_NAME_SOCIAL_CARD)
  private CampaignSocialCardProperty socialCard;

  public CampaignsUpdateSettingsRequest() {
  }

  public CampaignsUpdateSettingsRequest recipients(ListProperty2 recipients) {
    
    
    
    
    this.recipients = recipients;
    return this;
  }

   /**
   * Get recipients
   * @return recipients
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ListProperty2 getRecipients() {
    return recipients;
  }


  public void setRecipients(ListProperty2 recipients) {
    
    
    
    this.recipients = recipients;
  }


  public CampaignsUpdateSettingsRequest settings(CampaignSettingsProperty2 settings) {
    
    
    
    
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CampaignSettingsProperty2 getSettings() {
    return settings;
  }


  public void setSettings(CampaignSettingsProperty2 settings) {
    
    
    
    this.settings = settings;
  }


  public CampaignsUpdateSettingsRequest variateSettings(ABTestOptionsProperty variateSettings) {
    
    
    
    
    this.variateSettings = variateSettings;
    return this;
  }

   /**
   * Get variateSettings
   * @return variateSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ABTestOptionsProperty getVariateSettings() {
    return variateSettings;
  }


  public void setVariateSettings(ABTestOptionsProperty variateSettings) {
    
    
    
    this.variateSettings = variateSettings;
  }


  public CampaignsUpdateSettingsRequest tracking(CampaignTrackingOptionsProperty tracking) {
    
    
    
    
    this.tracking = tracking;
    return this;
  }

   /**
   * Get tracking
   * @return tracking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CampaignTrackingOptionsProperty getTracking() {
    return tracking;
  }


  public void setTracking(CampaignTrackingOptionsProperty tracking) {
    
    
    
    this.tracking = tracking;
  }


  public CampaignsUpdateSettingsRequest rssOpts(RSSOptionsProperty1 rssOpts) {
    
    
    
    
    this.rssOpts = rssOpts;
    return this;
  }

   /**
   * Get rssOpts
   * @return rssOpts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RSSOptionsProperty1 getRssOpts() {
    return rssOpts;
  }


  public void setRssOpts(RSSOptionsProperty1 rssOpts) {
    
    
    
    this.rssOpts = rssOpts;
  }


  public CampaignsUpdateSettingsRequest socialCard(CampaignSocialCardProperty socialCard) {
    
    
    
    
    this.socialCard = socialCard;
    return this;
  }

   /**
   * Get socialCard
   * @return socialCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CampaignSocialCardProperty getSocialCard() {
    return socialCard;
  }


  public void setSocialCard(CampaignSocialCardProperty socialCard) {
    
    
    
    this.socialCard = socialCard;
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
   * @return the CampaignsUpdateSettingsRequest instance itself
   */
  public CampaignsUpdateSettingsRequest putAdditionalProperty(String key, Object value) {
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
    CampaignsUpdateSettingsRequest campaignsUpdateSettingsRequest = (CampaignsUpdateSettingsRequest) o;
    return Objects.equals(this.recipients, campaignsUpdateSettingsRequest.recipients) &&
        Objects.equals(this.settings, campaignsUpdateSettingsRequest.settings) &&
        Objects.equals(this.variateSettings, campaignsUpdateSettingsRequest.variateSettings) &&
        Objects.equals(this.tracking, campaignsUpdateSettingsRequest.tracking) &&
        Objects.equals(this.rssOpts, campaignsUpdateSettingsRequest.rssOpts) &&
        Objects.equals(this.socialCard, campaignsUpdateSettingsRequest.socialCard)&&
        Objects.equals(this.additionalProperties, campaignsUpdateSettingsRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipients, settings, variateSettings, tracking, rssOpts, socialCard, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignsUpdateSettingsRequest {\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    variateSettings: ").append(toIndentedString(variateSettings)).append("\n");
    sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
    sb.append("    rssOpts: ").append(toIndentedString(rssOpts)).append("\n");
    sb.append("    socialCard: ").append(toIndentedString(socialCard)).append("\n");
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
    openapiFields.add("recipients");
    openapiFields.add("settings");
    openapiFields.add("variate_settings");
    openapiFields.add("tracking");
    openapiFields.add("rss_opts");
    openapiFields.add("social_card");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("settings");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CampaignsUpdateSettingsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CampaignsUpdateSettingsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CampaignsUpdateSettingsRequest is not found in the empty JSON string", CampaignsUpdateSettingsRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CampaignsUpdateSettingsRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `recipients`
      if (jsonObj.get("recipients") != null && !jsonObj.get("recipients").isJsonNull()) {
        ListProperty2.validateJsonObject(jsonObj.getAsJsonObject("recipients"));
      }
      // validate the required field `settings`
      CampaignSettingsProperty2.validateJsonObject(jsonObj.getAsJsonObject("settings"));
      // validate the optional field `variate_settings`
      if (jsonObj.get("variate_settings") != null && !jsonObj.get("variate_settings").isJsonNull()) {
        ABTestOptionsProperty.validateJsonObject(jsonObj.getAsJsonObject("variate_settings"));
      }
      // validate the optional field `tracking`
      if (jsonObj.get("tracking") != null && !jsonObj.get("tracking").isJsonNull()) {
        CampaignTrackingOptionsProperty.validateJsonObject(jsonObj.getAsJsonObject("tracking"));
      }
      // validate the optional field `rss_opts`
      if (jsonObj.get("rss_opts") != null && !jsonObj.get("rss_opts").isJsonNull()) {
        RSSOptionsProperty1.validateJsonObject(jsonObj.getAsJsonObject("rss_opts"));
      }
      // validate the optional field `social_card`
      if (jsonObj.get("social_card") != null && !jsonObj.get("social_card").isJsonNull()) {
        CampaignSocialCardProperty.validateJsonObject(jsonObj.getAsJsonObject("social_card"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CampaignsUpdateSettingsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CampaignsUpdateSettingsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CampaignsUpdateSettingsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CampaignsUpdateSettingsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CampaignsUpdateSettingsRequest>() {
           @Override
           public void write(JsonWriter out, CampaignsUpdateSettingsRequest value) throws IOException {
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
           public CampaignsUpdateSettingsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CampaignsUpdateSettingsRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CampaignsUpdateSettingsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignsUpdateSettingsRequest
  * @throws IOException if the JSON string is invalid with respect to CampaignsUpdateSettingsRequest
  */
  public static CampaignsUpdateSettingsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignsUpdateSettingsRequest.class);
  }

 /**
  * Convert an instance of CampaignsUpdateSettingsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
