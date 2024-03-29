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
 * Stats for Campaign A.
 */
@ApiModel(description = "Stats for Campaign A.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CampaignAProperty {
  public static final String SERIALIZED_NAME_BOUNCES = "bounces";
  @SerializedName(SERIALIZED_NAME_BOUNCES)
  private Integer bounces;

  public static final String SERIALIZED_NAME_ABUSE_REPORTS = "abuse_reports";
  @SerializedName(SERIALIZED_NAME_ABUSE_REPORTS)
  private Integer abuseReports;

  public static final String SERIALIZED_NAME_UNSUBS = "unsubs";
  @SerializedName(SERIALIZED_NAME_UNSUBS)
  private Integer unsubs;

  public static final String SERIALIZED_NAME_RECIPIENT_CLICKS = "recipient_clicks";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_CLICKS)
  private Integer recipientClicks;

  public static final String SERIALIZED_NAME_FORWARDS = "forwards";
  @SerializedName(SERIALIZED_NAME_FORWARDS)
  private Integer forwards;

  public static final String SERIALIZED_NAME_FORWARDS_OPENS = "forwards_opens";
  @SerializedName(SERIALIZED_NAME_FORWARDS_OPENS)
  private Integer forwardsOpens;

  public static final String SERIALIZED_NAME_OPENS = "opens";
  @SerializedName(SERIALIZED_NAME_OPENS)
  private Integer opens;

  public static final String SERIALIZED_NAME_LAST_OPEN = "last_open";
  @SerializedName(SERIALIZED_NAME_LAST_OPEN)
  private String lastOpen;

  public static final String SERIALIZED_NAME_UNIQUE_OPENS = "unique_opens";
  @SerializedName(SERIALIZED_NAME_UNIQUE_OPENS)
  private Integer uniqueOpens;

  public CampaignAProperty() {
  }

  public CampaignAProperty bounces(Integer bounces) {
    
    
    
    
    this.bounces = bounces;
    return this;
  }

   /**
   * Bounces for Campaign A.
   * @return bounces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bounces for Campaign A.")

  public Integer getBounces() {
    return bounces;
  }


  public void setBounces(Integer bounces) {
    
    
    
    this.bounces = bounces;
  }


  public CampaignAProperty abuseReports(Integer abuseReports) {
    
    
    
    
    this.abuseReports = abuseReports;
    return this;
  }

   /**
   * Abuse reports for Campaign A.
   * @return abuseReports
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Abuse reports for Campaign A.")

  public Integer getAbuseReports() {
    return abuseReports;
  }


  public void setAbuseReports(Integer abuseReports) {
    
    
    
    this.abuseReports = abuseReports;
  }


  public CampaignAProperty unsubs(Integer unsubs) {
    
    
    
    
    this.unsubs = unsubs;
    return this;
  }

   /**
   * Unsubscribes for Campaign A.
   * @return unsubs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unsubscribes for Campaign A.")

  public Integer getUnsubs() {
    return unsubs;
  }


  public void setUnsubs(Integer unsubs) {
    
    
    
    this.unsubs = unsubs;
  }


  public CampaignAProperty recipientClicks(Integer recipientClicks) {
    
    
    
    
    this.recipientClicks = recipientClicks;
    return this;
  }

   /**
   * Recipient Clicks for Campaign A.
   * @return recipientClicks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Recipient Clicks for Campaign A.")

  public Integer getRecipientClicks() {
    return recipientClicks;
  }


  public void setRecipientClicks(Integer recipientClicks) {
    
    
    
    this.recipientClicks = recipientClicks;
  }


  public CampaignAProperty forwards(Integer forwards) {
    
    
    
    
    this.forwards = forwards;
    return this;
  }

   /**
   * Forwards for Campaign A.
   * @return forwards
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Forwards for Campaign A.")

  public Integer getForwards() {
    return forwards;
  }


  public void setForwards(Integer forwards) {
    
    
    
    this.forwards = forwards;
  }


  public CampaignAProperty forwardsOpens(Integer forwardsOpens) {
    
    
    
    
    this.forwardsOpens = forwardsOpens;
    return this;
  }

   /**
   * Opens from forwards for Campaign A.
   * @return forwardsOpens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Opens from forwards for Campaign A.")

  public Integer getForwardsOpens() {
    return forwardsOpens;
  }


  public void setForwardsOpens(Integer forwardsOpens) {
    
    
    
    this.forwardsOpens = forwardsOpens;
  }


  public CampaignAProperty opens(Integer opens) {
    
    
    
    
    this.opens = opens;
    return this;
  }

   /**
   * Opens for Campaign A.
   * @return opens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Opens for Campaign A.")

  public Integer getOpens() {
    return opens;
  }


  public void setOpens(Integer opens) {
    
    
    
    this.opens = opens;
  }


  public CampaignAProperty lastOpen(String lastOpen) {
    
    
    
    
    this.lastOpen = lastOpen;
    return this;
  }

   /**
   * The last open for Campaign A.
   * @return lastOpen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last open for Campaign A.")

  public String getLastOpen() {
    return lastOpen;
  }


  public void setLastOpen(String lastOpen) {
    
    
    
    this.lastOpen = lastOpen;
  }


  public CampaignAProperty uniqueOpens(Integer uniqueOpens) {
    
    
    
    
    this.uniqueOpens = uniqueOpens;
    return this;
  }

   /**
   * Unique opens for Campaign A.
   * @return uniqueOpens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique opens for Campaign A.")

  public Integer getUniqueOpens() {
    return uniqueOpens;
  }


  public void setUniqueOpens(Integer uniqueOpens) {
    
    
    
    this.uniqueOpens = uniqueOpens;
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
   * @return the CampaignAProperty instance itself
   */
  public CampaignAProperty putAdditionalProperty(String key, Object value) {
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
    CampaignAProperty campaignAProperty = (CampaignAProperty) o;
    return Objects.equals(this.bounces, campaignAProperty.bounces) &&
        Objects.equals(this.abuseReports, campaignAProperty.abuseReports) &&
        Objects.equals(this.unsubs, campaignAProperty.unsubs) &&
        Objects.equals(this.recipientClicks, campaignAProperty.recipientClicks) &&
        Objects.equals(this.forwards, campaignAProperty.forwards) &&
        Objects.equals(this.forwardsOpens, campaignAProperty.forwardsOpens) &&
        Objects.equals(this.opens, campaignAProperty.opens) &&
        Objects.equals(this.lastOpen, campaignAProperty.lastOpen) &&
        Objects.equals(this.uniqueOpens, campaignAProperty.uniqueOpens)&&
        Objects.equals(this.additionalProperties, campaignAProperty.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bounces, abuseReports, unsubs, recipientClicks, forwards, forwardsOpens, opens, lastOpen, uniqueOpens, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignAProperty {\n");
    sb.append("    bounces: ").append(toIndentedString(bounces)).append("\n");
    sb.append("    abuseReports: ").append(toIndentedString(abuseReports)).append("\n");
    sb.append("    unsubs: ").append(toIndentedString(unsubs)).append("\n");
    sb.append("    recipientClicks: ").append(toIndentedString(recipientClicks)).append("\n");
    sb.append("    forwards: ").append(toIndentedString(forwards)).append("\n");
    sb.append("    forwardsOpens: ").append(toIndentedString(forwardsOpens)).append("\n");
    sb.append("    opens: ").append(toIndentedString(opens)).append("\n");
    sb.append("    lastOpen: ").append(toIndentedString(lastOpen)).append("\n");
    sb.append("    uniqueOpens: ").append(toIndentedString(uniqueOpens)).append("\n");
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
    openapiFields.add("bounces");
    openapiFields.add("abuse_reports");
    openapiFields.add("unsubs");
    openapiFields.add("recipient_clicks");
    openapiFields.add("forwards");
    openapiFields.add("forwards_opens");
    openapiFields.add("opens");
    openapiFields.add("last_open");
    openapiFields.add("unique_opens");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CampaignAProperty
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CampaignAProperty.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CampaignAProperty is not found in the empty JSON string", CampaignAProperty.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("last_open") != null && !jsonObj.get("last_open").isJsonNull()) && !jsonObj.get("last_open").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_open` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_open").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CampaignAProperty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CampaignAProperty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CampaignAProperty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CampaignAProperty.class));

       return (TypeAdapter<T>) new TypeAdapter<CampaignAProperty>() {
           @Override
           public void write(JsonWriter out, CampaignAProperty value) throws IOException {
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
           public CampaignAProperty read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CampaignAProperty instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CampaignAProperty given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignAProperty
  * @throws IOException if the JSON string is invalid with respect to CampaignAProperty
  */
  public static CampaignAProperty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignAProperty.class);
  }

 /**
  * Convert an instance of CampaignAProperty to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

