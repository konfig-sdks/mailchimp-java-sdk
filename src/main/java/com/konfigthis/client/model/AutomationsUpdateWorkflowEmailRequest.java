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
import com.konfigthis.client.model.AutomationDelayProperty;
import com.konfigthis.client.model.CampaignSettingsProperty;
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
 * Update information about an individual Automation workflow email.
 */
@ApiModel(description = "Update information about an individual Automation workflow email.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AutomationsUpdateWorkflowEmailRequest {
  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private CampaignSettingsProperty settings;

  public static final String SERIALIZED_NAME_DELAY = "delay";
  @SerializedName(SERIALIZED_NAME_DELAY)
  private AutomationDelayProperty delay;

  public AutomationsUpdateWorkflowEmailRequest() {
  }

  public AutomationsUpdateWorkflowEmailRequest settings(CampaignSettingsProperty settings) {
    
    
    
    
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CampaignSettingsProperty getSettings() {
    return settings;
  }


  public void setSettings(CampaignSettingsProperty settings) {
    
    
    
    this.settings = settings;
  }


  public AutomationsUpdateWorkflowEmailRequest delay(AutomationDelayProperty delay) {
    
    
    
    
    this.delay = delay;
    return this;
  }

   /**
   * Get delay
   * @return delay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AutomationDelayProperty getDelay() {
    return delay;
  }


  public void setDelay(AutomationDelayProperty delay) {
    
    
    
    this.delay = delay;
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
   * @return the AutomationsUpdateWorkflowEmailRequest instance itself
   */
  public AutomationsUpdateWorkflowEmailRequest putAdditionalProperty(String key, Object value) {
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
    AutomationsUpdateWorkflowEmailRequest automationsUpdateWorkflowEmailRequest = (AutomationsUpdateWorkflowEmailRequest) o;
    return Objects.equals(this.settings, automationsUpdateWorkflowEmailRequest.settings) &&
        Objects.equals(this.delay, automationsUpdateWorkflowEmailRequest.delay)&&
        Objects.equals(this.additionalProperties, automationsUpdateWorkflowEmailRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settings, delay, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomationsUpdateWorkflowEmailRequest {\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
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
    openapiFields.add("settings");
    openapiFields.add("delay");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AutomationsUpdateWorkflowEmailRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AutomationsUpdateWorkflowEmailRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutomationsUpdateWorkflowEmailRequest is not found in the empty JSON string", AutomationsUpdateWorkflowEmailRequest.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `settings`
      if (jsonObj.get("settings") != null && !jsonObj.get("settings").isJsonNull()) {
        CampaignSettingsProperty.validateJsonObject(jsonObj.getAsJsonObject("settings"));
      }
      // validate the optional field `delay`
      if (jsonObj.get("delay") != null && !jsonObj.get("delay").isJsonNull()) {
        AutomationDelayProperty.validateJsonObject(jsonObj.getAsJsonObject("delay"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AutomationsUpdateWorkflowEmailRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutomationsUpdateWorkflowEmailRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutomationsUpdateWorkflowEmailRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutomationsUpdateWorkflowEmailRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AutomationsUpdateWorkflowEmailRequest>() {
           @Override
           public void write(JsonWriter out, AutomationsUpdateWorkflowEmailRequest value) throws IOException {
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
           public AutomationsUpdateWorkflowEmailRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AutomationsUpdateWorkflowEmailRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AutomationsUpdateWorkflowEmailRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AutomationsUpdateWorkflowEmailRequest
  * @throws IOException if the JSON string is invalid with respect to AutomationsUpdateWorkflowEmailRequest
  */
  public static AutomationsUpdateWorkflowEmailRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutomationsUpdateWorkflowEmailRequest.class);
  }

 /**
  * Convert an instance of AutomationsUpdateWorkflowEmailRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
