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
 * Subscriber location information.
 */
@ApiModel(description = "Subscriber location information.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LocationProperty2 {
  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private Double latitude;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private Double longitude;

  public static final String SERIALIZED_NAME_GMTOFF = "gmtoff";
  @SerializedName(SERIALIZED_NAME_GMTOFF)
  private Integer gmtoff;

  public static final String SERIALIZED_NAME_DSTOFF = "dstoff";
  @SerializedName(SERIALIZED_NAME_DSTOFF)
  private Integer dstoff;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public LocationProperty2() {
  }

  
  public LocationProperty2(
     Integer gmtoff, 
     Integer dstoff, 
     String countryCode, 
     String timezone, 
     String region
  ) {
    this();
    this.gmtoff = gmtoff;
    this.dstoff = dstoff;
    this.countryCode = countryCode;
    this.timezone = timezone;
    this.region = region;
  }

  public LocationProperty2 latitude(Double latitude) {
    
    
    
    
    this.latitude = latitude;
    return this;
  }

  public LocationProperty2 latitude(Integer latitude) {
    
    
    
    
    this.latitude = latitude.doubleValue();
    return this;
  }

   /**
   * The location latitude.
   * @return latitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The location latitude.")

  public Double getLatitude() {
    return latitude;
  }


  public void setLatitude(Double latitude) {
    
    
    
    this.latitude = latitude;
  }


  public LocationProperty2 longitude(Double longitude) {
    
    
    
    
    this.longitude = longitude;
    return this;
  }

  public LocationProperty2 longitude(Integer longitude) {
    
    
    
    
    this.longitude = longitude.doubleValue();
    return this;
  }

   /**
   * The location longitude.
   * @return longitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The location longitude.")

  public Double getLongitude() {
    return longitude;
  }


  public void setLongitude(Double longitude) {
    
    
    
    this.longitude = longitude;
  }


   /**
   * The time difference in hours from GMT.
   * @return gmtoff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time difference in hours from GMT.")

  public Integer getGmtoff() {
    return gmtoff;
  }




   /**
   * The offset for timezones where daylight saving time is observed.
   * @return dstoff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The offset for timezones where daylight saving time is observed.")

  public Integer getDstoff() {
    return dstoff;
  }




   /**
   * The unique code for the location country.
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique code for the location country.")

  public String getCountryCode() {
    return countryCode;
  }




   /**
   * The timezone for the location.
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timezone for the location.")

  public String getTimezone() {
    return timezone;
  }




   /**
   * The region for the location.
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The region for the location.")

  public String getRegion() {
    return region;
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
   * @return the LocationProperty2 instance itself
   */
  public LocationProperty2 putAdditionalProperty(String key, Object value) {
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
    LocationProperty2 locationProperty2 = (LocationProperty2) o;
    return Objects.equals(this.latitude, locationProperty2.latitude) &&
        Objects.equals(this.longitude, locationProperty2.longitude) &&
        Objects.equals(this.gmtoff, locationProperty2.gmtoff) &&
        Objects.equals(this.dstoff, locationProperty2.dstoff) &&
        Objects.equals(this.countryCode, locationProperty2.countryCode) &&
        Objects.equals(this.timezone, locationProperty2.timezone) &&
        Objects.equals(this.region, locationProperty2.region)&&
        Objects.equals(this.additionalProperties, locationProperty2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, gmtoff, dstoff, countryCode, timezone, region, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationProperty2 {\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    gmtoff: ").append(toIndentedString(gmtoff)).append("\n");
    sb.append("    dstoff: ").append(toIndentedString(dstoff)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
    openapiFields.add("latitude");
    openapiFields.add("longitude");
    openapiFields.add("gmtoff");
    openapiFields.add("dstoff");
    openapiFields.add("country_code");
    openapiFields.add("timezone");
    openapiFields.add("region");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LocationProperty2
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LocationProperty2.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LocationProperty2 is not found in the empty JSON string", LocationProperty2.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("country_code") != null && !jsonObj.get("country_code").isJsonNull()) && !jsonObj.get("country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_code").toString()));
      }
      if ((jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      if ((jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull()) && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocationProperty2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocationProperty2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocationProperty2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocationProperty2.class));

       return (TypeAdapter<T>) new TypeAdapter<LocationProperty2>() {
           @Override
           public void write(JsonWriter out, LocationProperty2 value) throws IOException {
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
           public LocationProperty2 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LocationProperty2 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LocationProperty2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocationProperty2
  * @throws IOException if the JSON string is invalid with respect to LocationProperty2
  */
  public static LocationProperty2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocationProperty2.class);
  }

 /**
  * Convert an instance of LocationProperty2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

