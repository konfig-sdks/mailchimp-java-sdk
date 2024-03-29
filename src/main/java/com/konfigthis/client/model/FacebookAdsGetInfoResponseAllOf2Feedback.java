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
 * Check if this ad is connected to a facebook page
 */
@ApiModel(description = "Check if this ad is connected to a facebook page")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class FacebookAdsGetInfoResponseAllOf2Feedback {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private String audience;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private String budget;

  public static final String SERIALIZED_NAME_COMPLIANCE = "compliance";
  @SerializedName(SERIALIZED_NAME_COMPLIANCE)
  private String compliance;

  public FacebookAdsGetInfoResponseAllOf2Feedback() {
  }

  public FacebookAdsGetInfoResponseAllOf2Feedback content(String content) {
    
    
    
    
    this.content = content;
    return this;
  }

   /**
   * Feedback regarding the content of this Ad.
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Feedback regarding the content of this Ad.")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    
    
    
    this.content = content;
  }


  public FacebookAdsGetInfoResponseAllOf2Feedback audience(String audience) {
    
    
    
    
    this.audience = audience;
    return this;
  }

   /**
   * Feedback regarding the audience of this Ad.
   * @return audience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Feedback regarding the audience of this Ad.")

  public String getAudience() {
    return audience;
  }


  public void setAudience(String audience) {
    
    
    
    this.audience = audience;
  }


  public FacebookAdsGetInfoResponseAllOf2Feedback budget(String budget) {
    
    
    
    
    this.budget = budget;
    return this;
  }

   /**
   * Feedback regarding the budget of this Ad.
   * @return budget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Feedback regarding the budget of this Ad.")

  public String getBudget() {
    return budget;
  }


  public void setBudget(String budget) {
    
    
    
    this.budget = budget;
  }


  public FacebookAdsGetInfoResponseAllOf2Feedback compliance(String compliance) {
    
    
    
    
    this.compliance = compliance;
    return this;
  }

   /**
   * Feedback regarding the compliance of this Ad.
   * @return compliance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Feedback regarding the compliance of this Ad.")

  public String getCompliance() {
    return compliance;
  }


  public void setCompliance(String compliance) {
    
    
    
    this.compliance = compliance;
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
   * @return the FacebookAdsGetInfoResponseAllOf2Feedback instance itself
   */
  public FacebookAdsGetInfoResponseAllOf2Feedback putAdditionalProperty(String key, Object value) {
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
    FacebookAdsGetInfoResponseAllOf2Feedback facebookAdsGetInfoResponseAllOf2Feedback = (FacebookAdsGetInfoResponseAllOf2Feedback) o;
    return Objects.equals(this.content, facebookAdsGetInfoResponseAllOf2Feedback.content) &&
        Objects.equals(this.audience, facebookAdsGetInfoResponseAllOf2Feedback.audience) &&
        Objects.equals(this.budget, facebookAdsGetInfoResponseAllOf2Feedback.budget) &&
        Objects.equals(this.compliance, facebookAdsGetInfoResponseAllOf2Feedback.compliance)&&
        Objects.equals(this.additionalProperties, facebookAdsGetInfoResponseAllOf2Feedback.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, audience, budget, compliance, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacebookAdsGetInfoResponseAllOf2Feedback {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    compliance: ").append(toIndentedString(compliance)).append("\n");
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
    openapiFields.add("content");
    openapiFields.add("audience");
    openapiFields.add("budget");
    openapiFields.add("compliance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FacebookAdsGetInfoResponseAllOf2Feedback
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FacebookAdsGetInfoResponseAllOf2Feedback.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FacebookAdsGetInfoResponseAllOf2Feedback is not found in the empty JSON string", FacebookAdsGetInfoResponseAllOf2Feedback.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if ((jsonObj.get("audience") != null && !jsonObj.get("audience").isJsonNull()) && !jsonObj.get("audience").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audience` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audience").toString()));
      }
      if ((jsonObj.get("budget") != null && !jsonObj.get("budget").isJsonNull()) && !jsonObj.get("budget").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `budget` to be a primitive type in the JSON string but got `%s`", jsonObj.get("budget").toString()));
      }
      if ((jsonObj.get("compliance") != null && !jsonObj.get("compliance").isJsonNull()) && !jsonObj.get("compliance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `compliance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("compliance").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FacebookAdsGetInfoResponseAllOf2Feedback.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FacebookAdsGetInfoResponseAllOf2Feedback' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FacebookAdsGetInfoResponseAllOf2Feedback> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FacebookAdsGetInfoResponseAllOf2Feedback.class));

       return (TypeAdapter<T>) new TypeAdapter<FacebookAdsGetInfoResponseAllOf2Feedback>() {
           @Override
           public void write(JsonWriter out, FacebookAdsGetInfoResponseAllOf2Feedback value) throws IOException {
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
           public FacebookAdsGetInfoResponseAllOf2Feedback read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FacebookAdsGetInfoResponseAllOf2Feedback instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FacebookAdsGetInfoResponseAllOf2Feedback given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FacebookAdsGetInfoResponseAllOf2Feedback
  * @throws IOException if the JSON string is invalid with respect to FacebookAdsGetInfoResponseAllOf2Feedback
  */
  public static FacebookAdsGetInfoResponseAllOf2Feedback fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FacebookAdsGetInfoResponseAllOf2Feedback.class);
  }

 /**
  * Convert an instance of FacebookAdsGetInfoResponseAllOf2Feedback to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

