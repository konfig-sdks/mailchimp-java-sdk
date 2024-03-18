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
import com.konfigthis.client.model.CapsuleCRMTrackingProperty1;
import com.konfigthis.client.model.SalesforceCRMTrackingProperty1;
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
 * The tracking options for the Automation.
 */
@ApiModel(description = "The tracking options for the Automation.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AutomationTrackingOptionsProperty {
  public static final String SERIALIZED_NAME_OPENS = "opens";
  @SerializedName(SERIALIZED_NAME_OPENS)
  private Boolean opens;

  public static final String SERIALIZED_NAME_HTML_CLICKS = "html_clicks";
  @SerializedName(SERIALIZED_NAME_HTML_CLICKS)
  private Boolean htmlClicks;

  public static final String SERIALIZED_NAME_TEXT_CLICKS = "text_clicks";
  @SerializedName(SERIALIZED_NAME_TEXT_CLICKS)
  private Boolean textClicks;

  public static final String SERIALIZED_NAME_GOAL_TRACKING = "goal_tracking";
  @SerializedName(SERIALIZED_NAME_GOAL_TRACKING)
  private Boolean goalTracking;

  public static final String SERIALIZED_NAME_ECOMM360 = "ecomm360";
  @SerializedName(SERIALIZED_NAME_ECOMM360)
  private Boolean ecomm360;

  public static final String SERIALIZED_NAME_GOOGLE_ANALYTICS = "google_analytics";
  @SerializedName(SERIALIZED_NAME_GOOGLE_ANALYTICS)
  private String googleAnalytics;

  public static final String SERIALIZED_NAME_CLICKTALE = "clicktale";
  @SerializedName(SERIALIZED_NAME_CLICKTALE)
  private String clicktale;

  public static final String SERIALIZED_NAME_SALESFORCE = "salesforce";
  @SerializedName(SERIALIZED_NAME_SALESFORCE)
  private SalesforceCRMTrackingProperty1 salesforce;

  public static final String SERIALIZED_NAME_CAPSULE = "capsule";
  @SerializedName(SERIALIZED_NAME_CAPSULE)
  private CapsuleCRMTrackingProperty1 capsule;

  public AutomationTrackingOptionsProperty() {
  }

  public AutomationTrackingOptionsProperty opens(Boolean opens) {
    
    
    
    
    this.opens = opens;
    return this;
  }

   /**
   * Whether to [track opens](https://mailchimp.com/help/about-open-tracking/). Defaults to &#x60;true&#x60;.
   * @return opens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to [track opens](https://mailchimp.com/help/about-open-tracking/). Defaults to `true`.")

  public Boolean getOpens() {
    return opens;
  }


  public void setOpens(Boolean opens) {
    
    
    
    this.opens = opens;
  }


  public AutomationTrackingOptionsProperty htmlClicks(Boolean htmlClicks) {
    
    
    
    
    this.htmlClicks = htmlClicks;
    return this;
  }

   /**
   * Whether to [track clicks](https://mailchimp.com/help/enable-and-view-click-tracking/) in the HTML version of the Automation. Defaults to &#x60;true&#x60;.
   * @return htmlClicks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to [track clicks](https://mailchimp.com/help/enable-and-view-click-tracking/) in the HTML version of the Automation. Defaults to `true`.")

  public Boolean getHtmlClicks() {
    return htmlClicks;
  }


  public void setHtmlClicks(Boolean htmlClicks) {
    
    
    
    this.htmlClicks = htmlClicks;
  }


  public AutomationTrackingOptionsProperty textClicks(Boolean textClicks) {
    
    
    
    
    this.textClicks = textClicks;
    return this;
  }

   /**
   * Whether to [track clicks](https://mailchimp.com/help/enable-and-view-click-tracking/) in the plain-text version of the Automation. Defaults to &#x60;true&#x60;.
   * @return textClicks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to [track clicks](https://mailchimp.com/help/enable-and-view-click-tracking/) in the plain-text version of the Automation. Defaults to `true`.")

  public Boolean getTextClicks() {
    return textClicks;
  }


  public void setTextClicks(Boolean textClicks) {
    
    
    
    this.textClicks = textClicks;
  }


  public AutomationTrackingOptionsProperty goalTracking(Boolean goalTracking) {
    
    
    
    
    this.goalTracking = goalTracking;
    return this;
  }

   /**
   * Deprecated
   * @return goalTracking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated")

  public Boolean getGoalTracking() {
    return goalTracking;
  }


  public void setGoalTracking(Boolean goalTracking) {
    
    
    
    this.goalTracking = goalTracking;
  }


  public AutomationTrackingOptionsProperty ecomm360(Boolean ecomm360) {
    
    
    
    
    this.ecomm360 = ecomm360;
    return this;
  }

   /**
   * Whether to enable e-commerce tracking.
   * @return ecomm360
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to enable e-commerce tracking.")

  public Boolean getEcomm360() {
    return ecomm360;
  }


  public void setEcomm360(Boolean ecomm360) {
    
    
    
    this.ecomm360 = ecomm360;
  }


  public AutomationTrackingOptionsProperty googleAnalytics(String googleAnalytics) {
    
    
    
    
    this.googleAnalytics = googleAnalytics;
    return this;
  }

   /**
   * The custom slug for [Google Analytics](https://mailchimp.com/help/integrate-google-analytics-with-mailchimp/) tracking (max of 50 bytes).
   * @return googleAnalytics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The custom slug for [Google Analytics](https://mailchimp.com/help/integrate-google-analytics-with-mailchimp/) tracking (max of 50 bytes).")

  public String getGoogleAnalytics() {
    return googleAnalytics;
  }


  public void setGoogleAnalytics(String googleAnalytics) {
    
    
    
    this.googleAnalytics = googleAnalytics;
  }


  public AutomationTrackingOptionsProperty clicktale(String clicktale) {
    
    
    
    
    this.clicktale = clicktale;
    return this;
  }

   /**
   * The custom slug for [ClickTale](https://mailchimp.com/help/additional-tracking-options-for-campaigns/) tracking (max of 50 bytes).
   * @return clicktale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The custom slug for [ClickTale](https://mailchimp.com/help/additional-tracking-options-for-campaigns/) tracking (max of 50 bytes).")

  public String getClicktale() {
    return clicktale;
  }


  public void setClicktale(String clicktale) {
    
    
    
    this.clicktale = clicktale;
  }


  public AutomationTrackingOptionsProperty salesforce(SalesforceCRMTrackingProperty1 salesforce) {
    
    
    
    
    this.salesforce = salesforce;
    return this;
  }

   /**
   * Get salesforce
   * @return salesforce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SalesforceCRMTrackingProperty1 getSalesforce() {
    return salesforce;
  }


  public void setSalesforce(SalesforceCRMTrackingProperty1 salesforce) {
    
    
    
    this.salesforce = salesforce;
  }


  public AutomationTrackingOptionsProperty capsule(CapsuleCRMTrackingProperty1 capsule) {
    
    
    
    
    this.capsule = capsule;
    return this;
  }

   /**
   * Get capsule
   * @return capsule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CapsuleCRMTrackingProperty1 getCapsule() {
    return capsule;
  }


  public void setCapsule(CapsuleCRMTrackingProperty1 capsule) {
    
    
    
    this.capsule = capsule;
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
   * @return the AutomationTrackingOptionsProperty instance itself
   */
  public AutomationTrackingOptionsProperty putAdditionalProperty(String key, Object value) {
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
    AutomationTrackingOptionsProperty automationTrackingOptionsProperty = (AutomationTrackingOptionsProperty) o;
    return Objects.equals(this.opens, automationTrackingOptionsProperty.opens) &&
        Objects.equals(this.htmlClicks, automationTrackingOptionsProperty.htmlClicks) &&
        Objects.equals(this.textClicks, automationTrackingOptionsProperty.textClicks) &&
        Objects.equals(this.goalTracking, automationTrackingOptionsProperty.goalTracking) &&
        Objects.equals(this.ecomm360, automationTrackingOptionsProperty.ecomm360) &&
        Objects.equals(this.googleAnalytics, automationTrackingOptionsProperty.googleAnalytics) &&
        Objects.equals(this.clicktale, automationTrackingOptionsProperty.clicktale) &&
        Objects.equals(this.salesforce, automationTrackingOptionsProperty.salesforce) &&
        Objects.equals(this.capsule, automationTrackingOptionsProperty.capsule)&&
        Objects.equals(this.additionalProperties, automationTrackingOptionsProperty.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opens, htmlClicks, textClicks, goalTracking, ecomm360, googleAnalytics, clicktale, salesforce, capsule, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomationTrackingOptionsProperty {\n");
    sb.append("    opens: ").append(toIndentedString(opens)).append("\n");
    sb.append("    htmlClicks: ").append(toIndentedString(htmlClicks)).append("\n");
    sb.append("    textClicks: ").append(toIndentedString(textClicks)).append("\n");
    sb.append("    goalTracking: ").append(toIndentedString(goalTracking)).append("\n");
    sb.append("    ecomm360: ").append(toIndentedString(ecomm360)).append("\n");
    sb.append("    googleAnalytics: ").append(toIndentedString(googleAnalytics)).append("\n");
    sb.append("    clicktale: ").append(toIndentedString(clicktale)).append("\n");
    sb.append("    salesforce: ").append(toIndentedString(salesforce)).append("\n");
    sb.append("    capsule: ").append(toIndentedString(capsule)).append("\n");
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
    openapiFields.add("opens");
    openapiFields.add("html_clicks");
    openapiFields.add("text_clicks");
    openapiFields.add("goal_tracking");
    openapiFields.add("ecomm360");
    openapiFields.add("google_analytics");
    openapiFields.add("clicktale");
    openapiFields.add("salesforce");
    openapiFields.add("capsule");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AutomationTrackingOptionsProperty
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AutomationTrackingOptionsProperty.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutomationTrackingOptionsProperty is not found in the empty JSON string", AutomationTrackingOptionsProperty.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("google_analytics") != null && !jsonObj.get("google_analytics").isJsonNull()) && !jsonObj.get("google_analytics").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `google_analytics` to be a primitive type in the JSON string but got `%s`", jsonObj.get("google_analytics").toString()));
      }
      if ((jsonObj.get("clicktale") != null && !jsonObj.get("clicktale").isJsonNull()) && !jsonObj.get("clicktale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clicktale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clicktale").toString()));
      }
      // validate the optional field `salesforce`
      if (jsonObj.get("salesforce") != null && !jsonObj.get("salesforce").isJsonNull()) {
        SalesforceCRMTrackingProperty1.validateJsonObject(jsonObj.getAsJsonObject("salesforce"));
      }
      // validate the optional field `capsule`
      if (jsonObj.get("capsule") != null && !jsonObj.get("capsule").isJsonNull()) {
        CapsuleCRMTrackingProperty1.validateJsonObject(jsonObj.getAsJsonObject("capsule"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AutomationTrackingOptionsProperty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutomationTrackingOptionsProperty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutomationTrackingOptionsProperty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutomationTrackingOptionsProperty.class));

       return (TypeAdapter<T>) new TypeAdapter<AutomationTrackingOptionsProperty>() {
           @Override
           public void write(JsonWriter out, AutomationTrackingOptionsProperty value) throws IOException {
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
           public AutomationTrackingOptionsProperty read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AutomationTrackingOptionsProperty instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AutomationTrackingOptionsProperty given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AutomationTrackingOptionsProperty
  * @throws IOException if the JSON string is invalid with respect to AutomationTrackingOptionsProperty
  */
  public static AutomationTrackingOptionsProperty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutomationTrackingOptionsProperty.class);
  }

 /**
  * Convert an instance of AutomationTrackingOptionsProperty to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

