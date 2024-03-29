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
import com.konfigthis.client.model.FacebookAdsListAdsResponseFacebookAdsInnerAllOf2AudienceEmailSource;
import com.konfigthis.client.model.FacebookAdsListAdsResponseFacebookAdsInnerAllOf2AudienceTargetingSpecs;
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
 * Audience settings
 */
@ApiModel(description = "Audience settings")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience {
  /**
   * Type of the audience
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    CUSTOM_AUDIENCE("Custom Audience"),
    
    LOOKALIKE_AUDIENCE("Lookalike Audience"),
    
    INTEREST_BASED_AUDIENCE("Interest-based Audience");

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
   * List or Facebook based audience
   */
  @JsonAdapter(SourceTypeEnum.Adapter.class)
 public enum SourceTypeEnum {
    FACEBOOK("facebook"),
    
    LIST("list");

    private String value;

    SourceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SourceTypeEnum fromValue(String value) {
      for (SourceTypeEnum b : SourceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SourceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SourceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SourceTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SOURCE_TYPE = "source_type";
  @SerializedName(SERIALIZED_NAME_SOURCE_TYPE)
  private SourceTypeEnum sourceType;

  public static final String SERIALIZED_NAME_EMAIL_SOURCE = "email_source";
  @SerializedName(SERIALIZED_NAME_EMAIL_SOURCE)
  private FacebookAdsListAdsResponseFacebookAdsInnerAllOf2AudienceEmailSource emailSource;

  public static final String SERIALIZED_NAME_INCLUDE_SOURCE_IN_TARGET = "include_source_in_target";
  @SerializedName(SERIALIZED_NAME_INCLUDE_SOURCE_IN_TARGET)
  private Boolean includeSourceInTarget;

  public static final String SERIALIZED_NAME_LOOKALIKE_COUNTRY_CODE = "lookalike_country_code";
  @SerializedName(SERIALIZED_NAME_LOOKALIKE_COUNTRY_CODE)
  private String lookalikeCountryCode;

  public static final String SERIALIZED_NAME_TARGETING_SPECS = "targeting_specs";
  @SerializedName(SERIALIZED_NAME_TARGETING_SPECS)
  private FacebookAdsListAdsResponseFacebookAdsInnerAllOf2AudienceTargetingSpecs targetingSpecs;

  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience() {
  }

  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Type of the audience
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of the audience")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience sourceType(SourceTypeEnum sourceType) {
    
    
    
    
    this.sourceType = sourceType;
    return this;
  }

   /**
   * List or Facebook based audience
   * @return sourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List or Facebook based audience")

  public SourceTypeEnum getSourceType() {
    return sourceType;
  }


  public void setSourceType(SourceTypeEnum sourceType) {
    
    
    
    this.sourceType = sourceType;
  }


  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience emailSource(FacebookAdsListAdsResponseFacebookAdsInnerAllOf2AudienceEmailSource emailSource) {
    
    
    
    
    this.emailSource = emailSource;
    return this;
  }

   /**
   * Get emailSource
   * @return emailSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2AudienceEmailSource getEmailSource() {
    return emailSource;
  }


  public void setEmailSource(FacebookAdsListAdsResponseFacebookAdsInnerAllOf2AudienceEmailSource emailSource) {
    
    
    
    this.emailSource = emailSource;
  }


  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience includeSourceInTarget(Boolean includeSourceInTarget) {
    
    
    
    
    this.includeSourceInTarget = includeSourceInTarget;
    return this;
  }

   /**
   * To include list contacts as part of audience
   * @return includeSourceInTarget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To include list contacts as part of audience")

  public Boolean getIncludeSourceInTarget() {
    return includeSourceInTarget;
  }


  public void setIncludeSourceInTarget(Boolean includeSourceInTarget) {
    
    
    
    this.includeSourceInTarget = includeSourceInTarget;
  }


  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience lookalikeCountryCode(String lookalikeCountryCode) {
    
    
    
    
    this.lookalikeCountryCode = lookalikeCountryCode;
    return this;
  }

   /**
   * To find similar audience in given country
   * @return lookalikeCountryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To find similar audience in given country")

  public String getLookalikeCountryCode() {
    return lookalikeCountryCode;
  }


  public void setLookalikeCountryCode(String lookalikeCountryCode) {
    
    
    
    this.lookalikeCountryCode = lookalikeCountryCode;
  }


  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience targetingSpecs(FacebookAdsListAdsResponseFacebookAdsInnerAllOf2AudienceTargetingSpecs targetingSpecs) {
    
    
    
    
    this.targetingSpecs = targetingSpecs;
    return this;
  }

   /**
   * Get targetingSpecs
   * @return targetingSpecs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2AudienceTargetingSpecs getTargetingSpecs() {
    return targetingSpecs;
  }


  public void setTargetingSpecs(FacebookAdsListAdsResponseFacebookAdsInnerAllOf2AudienceTargetingSpecs targetingSpecs) {
    
    
    
    this.targetingSpecs = targetingSpecs;
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
   * @return the FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience instance itself
   */
  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience putAdditionalProperty(String key, Object value) {
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
    FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience facebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience = (FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience) o;
    return Objects.equals(this.type, facebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience.type) &&
        Objects.equals(this.sourceType, facebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience.sourceType) &&
        Objects.equals(this.emailSource, facebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience.emailSource) &&
        Objects.equals(this.includeSourceInTarget, facebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience.includeSourceInTarget) &&
        Objects.equals(this.lookalikeCountryCode, facebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience.lookalikeCountryCode) &&
        Objects.equals(this.targetingSpecs, facebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience.targetingSpecs)&&
        Objects.equals(this.additionalProperties, facebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, sourceType, emailSource, includeSourceInTarget, lookalikeCountryCode, targetingSpecs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    emailSource: ").append(toIndentedString(emailSource)).append("\n");
    sb.append("    includeSourceInTarget: ").append(toIndentedString(includeSourceInTarget)).append("\n");
    sb.append("    lookalikeCountryCode: ").append(toIndentedString(lookalikeCountryCode)).append("\n");
    sb.append("    targetingSpecs: ").append(toIndentedString(targetingSpecs)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("source_type");
    openapiFields.add("email_source");
    openapiFields.add("include_source_in_target");
    openapiFields.add("lookalike_country_code");
    openapiFields.add("targeting_specs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience is not found in the empty JSON string", FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("source_type") != null && !jsonObj.get("source_type").isJsonNull()) && !jsonObj.get("source_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_type").toString()));
      }
      // validate the optional field `email_source`
      if (jsonObj.get("email_source") != null && !jsonObj.get("email_source").isJsonNull()) {
        FacebookAdsListAdsResponseFacebookAdsInnerAllOf2AudienceEmailSource.validateJsonObject(jsonObj.getAsJsonObject("email_source"));
      }
      if ((jsonObj.get("lookalike_country_code") != null && !jsonObj.get("lookalike_country_code").isJsonNull()) && !jsonObj.get("lookalike_country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lookalike_country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lookalike_country_code").toString()));
      }
      // validate the optional field `targeting_specs`
      if (jsonObj.get("targeting_specs") != null && !jsonObj.get("targeting_specs").isJsonNull()) {
        FacebookAdsListAdsResponseFacebookAdsInnerAllOf2AudienceTargetingSpecs.validateJsonObject(jsonObj.getAsJsonObject("targeting_specs"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience.class));

       return (TypeAdapter<T>) new TypeAdapter<FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience>() {
           @Override
           public void write(JsonWriter out, FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience value) throws IOException {
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
           public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience
  * @throws IOException if the JSON string is invalid with respect to FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience
  */
  public static FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience.class);
  }

 /**
  * Convert an instance of FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

