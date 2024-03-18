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
import com.konfigthis.client.model.CampaignAProperty;
import com.konfigthis.client.model.CampaignBProperty;
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
 * General stats about different groups of an A/B Split campaign. Does not return information about Multivariate Campaigns.
 */
@ApiModel(description = "General stats about different groups of an A/B Split campaign. Does not return information about Multivariate Campaigns.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ABSplitStatsProperty {
  public static final String SERIALIZED_NAME_A = "a";
  @SerializedName(SERIALIZED_NAME_A)
  private CampaignAProperty a;

  public static final String SERIALIZED_NAME_B = "b";
  @SerializedName(SERIALIZED_NAME_B)
  private CampaignBProperty b;

  public ABSplitStatsProperty() {
  }

  public ABSplitStatsProperty a(CampaignAProperty a) {
    
    
    
    
    this.a = a;
    return this;
  }

   /**
   * Get a
   * @return a
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CampaignAProperty getA() {
    return a;
  }


  public void setA(CampaignAProperty a) {
    
    
    
    this.a = a;
  }


  public ABSplitStatsProperty b(CampaignBProperty b) {
    
    
    
    
    this.b = b;
    return this;
  }

   /**
   * Get b
   * @return b
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CampaignBProperty getB() {
    return b;
  }


  public void setB(CampaignBProperty b) {
    
    
    
    this.b = b;
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
   * @return the ABSplitStatsProperty instance itself
   */
  public ABSplitStatsProperty putAdditionalProperty(String key, Object value) {
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
    ABSplitStatsProperty aBSplitStatsProperty = (ABSplitStatsProperty) o;
    return Objects.equals(this.a, aBSplitStatsProperty.a) &&
        Objects.equals(this.b, aBSplitStatsProperty.b)&&
        Objects.equals(this.additionalProperties, aBSplitStatsProperty.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(a, b, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ABSplitStatsProperty {\n");
    sb.append("    a: ").append(toIndentedString(a)).append("\n");
    sb.append("    b: ").append(toIndentedString(b)).append("\n");
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
    openapiFields.add("a");
    openapiFields.add("b");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ABSplitStatsProperty
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ABSplitStatsProperty.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ABSplitStatsProperty is not found in the empty JSON string", ABSplitStatsProperty.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `a`
      if (jsonObj.get("a") != null && !jsonObj.get("a").isJsonNull()) {
        CampaignAProperty.validateJsonObject(jsonObj.getAsJsonObject("a"));
      }
      // validate the optional field `b`
      if (jsonObj.get("b") != null && !jsonObj.get("b").isJsonNull()) {
        CampaignBProperty.validateJsonObject(jsonObj.getAsJsonObject("b"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ABSplitStatsProperty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ABSplitStatsProperty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ABSplitStatsProperty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ABSplitStatsProperty.class));

       return (TypeAdapter<T>) new TypeAdapter<ABSplitStatsProperty>() {
           @Override
           public void write(JsonWriter out, ABSplitStatsProperty value) throws IOException {
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
           public ABSplitStatsProperty read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ABSplitStatsProperty instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ABSplitStatsProperty given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ABSplitStatsProperty
  * @throws IOException if the JSON string is invalid with respect to ABSplitStatsProperty
  */
  public static ABSplitStatsProperty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ABSplitStatsProperty.class);
  }

 /**
  * Convert an instance of ABSplitStatsProperty to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

