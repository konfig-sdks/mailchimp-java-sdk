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
 * An object describing the forwards and forward activity for the campaign.
 */
@ApiModel(description = "An object describing the forwards and forward activity for the campaign.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ForwardsProperty {
  public static final String SERIALIZED_NAME_FORWARDS_COUNT = "forwards_count";
  @SerializedName(SERIALIZED_NAME_FORWARDS_COUNT)
  private Integer forwardsCount;

  public static final String SERIALIZED_NAME_FORWARDS_OPENS = "forwards_opens";
  @SerializedName(SERIALIZED_NAME_FORWARDS_OPENS)
  private Integer forwardsOpens;

  public ForwardsProperty() {
  }

  public ForwardsProperty forwardsCount(Integer forwardsCount) {
    
    
    
    
    this.forwardsCount = forwardsCount;
    return this;
  }

   /**
   * How many times the campaign has been forwarded.
   * @return forwardsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How many times the campaign has been forwarded.")

  public Integer getForwardsCount() {
    return forwardsCount;
  }


  public void setForwardsCount(Integer forwardsCount) {
    
    
    
    this.forwardsCount = forwardsCount;
  }


  public ForwardsProperty forwardsOpens(Integer forwardsOpens) {
    
    
    
    
    this.forwardsOpens = forwardsOpens;
    return this;
  }

   /**
   * How many times the forwarded campaign has been opened.
   * @return forwardsOpens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How many times the forwarded campaign has been opened.")

  public Integer getForwardsOpens() {
    return forwardsOpens;
  }


  public void setForwardsOpens(Integer forwardsOpens) {
    
    
    
    this.forwardsOpens = forwardsOpens;
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
   * @return the ForwardsProperty instance itself
   */
  public ForwardsProperty putAdditionalProperty(String key, Object value) {
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
    ForwardsProperty forwardsProperty = (ForwardsProperty) o;
    return Objects.equals(this.forwardsCount, forwardsProperty.forwardsCount) &&
        Objects.equals(this.forwardsOpens, forwardsProperty.forwardsOpens)&&
        Objects.equals(this.additionalProperties, forwardsProperty.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forwardsCount, forwardsOpens, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForwardsProperty {\n");
    sb.append("    forwardsCount: ").append(toIndentedString(forwardsCount)).append("\n");
    sb.append("    forwardsOpens: ").append(toIndentedString(forwardsOpens)).append("\n");
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
    openapiFields.add("forwards_count");
    openapiFields.add("forwards_opens");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ForwardsProperty
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ForwardsProperty.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ForwardsProperty is not found in the empty JSON string", ForwardsProperty.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ForwardsProperty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ForwardsProperty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ForwardsProperty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ForwardsProperty.class));

       return (TypeAdapter<T>) new TypeAdapter<ForwardsProperty>() {
           @Override
           public void write(JsonWriter out, ForwardsProperty value) throws IOException {
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
           public ForwardsProperty read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ForwardsProperty instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ForwardsProperty given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ForwardsProperty
  * @throws IOException if the JSON string is invalid with respect to ForwardsProperty
  */
  public static ForwardsProperty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ForwardsProperty.class);
  }

 /**
  * Convert an instance of ForwardsProperty to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

