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
import com.konfigthis.client.model.Location;
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
 * A summary of the click-throughs on the campaign&#39;s URL.
 */
@ApiModel(description = "A summary of the click-throughs on the campaign's URL.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ClickSummaryProperty {
  public static final String SERIALIZED_NAME_CLICKS = "clicks";
  @SerializedName(SERIALIZED_NAME_CLICKS)
  private Integer clicks;

  public static final String SERIALIZED_NAME_FIRST_CLICK = "first_click";
  @SerializedName(SERIALIZED_NAME_FIRST_CLICK)
  private OffsetDateTime firstClick;

  public static final String SERIALIZED_NAME_LAST_CLICK = "last_click";
  @SerializedName(SERIALIZED_NAME_LAST_CLICK)
  private OffsetDateTime lastClick;

  public static final String SERIALIZED_NAME_LOCATIONS = "locations";
  @SerializedName(SERIALIZED_NAME_LOCATIONS)
  private List<Location> locations = null;

  public ClickSummaryProperty() {
  }

  
  public ClickSummaryProperty(
     Integer clicks, 
     OffsetDateTime firstClick, 
     OffsetDateTime lastClick, 
     List<Location> locations
  ) {
    this();
    this.clicks = clicks;
    this.firstClick = firstClick;
    this.lastClick = lastClick;
    this.locations = locations;
  }

   /**
   * The total number of clicks to the campaign&#39;s URL.
   * @return clicks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of clicks to the campaign's URL.")

  public Integer getClicks() {
    return clicks;
  }




   /**
   * The timestamp for the first click to the URL.
   * @return firstClick
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp for the first click to the URL.")

  public OffsetDateTime getFirstClick() {
    return firstClick;
  }




   /**
   * The timestamp for the last click to the URL.
   * @return lastClick
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp for the last click to the URL.")

  public OffsetDateTime getLastClick() {
    return lastClick;
  }




   /**
   * A summary of the top click locations.
   * @return locations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A summary of the top click locations.")

  public List<Location> getLocations() {
    return locations;
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
   * @return the ClickSummaryProperty instance itself
   */
  public ClickSummaryProperty putAdditionalProperty(String key, Object value) {
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
    ClickSummaryProperty clickSummaryProperty = (ClickSummaryProperty) o;
    return Objects.equals(this.clicks, clickSummaryProperty.clicks) &&
        Objects.equals(this.firstClick, clickSummaryProperty.firstClick) &&
        Objects.equals(this.lastClick, clickSummaryProperty.lastClick) &&
        Objects.equals(this.locations, clickSummaryProperty.locations)&&
        Objects.equals(this.additionalProperties, clickSummaryProperty.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clicks, firstClick, lastClick, locations, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClickSummaryProperty {\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
    sb.append("    firstClick: ").append(toIndentedString(firstClick)).append("\n");
    sb.append("    lastClick: ").append(toIndentedString(lastClick)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
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
    openapiFields.add("clicks");
    openapiFields.add("first_click");
    openapiFields.add("last_click");
    openapiFields.add("locations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ClickSummaryProperty
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ClickSummaryProperty.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClickSummaryProperty is not found in the empty JSON string", ClickSummaryProperty.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("locations") != null && !jsonObj.get("locations").isJsonNull()) {
        JsonArray jsonArraylocations = jsonObj.getAsJsonArray("locations");
        if (jsonArraylocations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("locations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `locations` to be an array in the JSON string but got `%s`", jsonObj.get("locations").toString()));
          }

          // validate the optional field `locations` (array)
          for (int i = 0; i < jsonArraylocations.size(); i++) {
            Location.validateJsonObject(jsonArraylocations.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClickSummaryProperty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClickSummaryProperty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClickSummaryProperty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClickSummaryProperty.class));

       return (TypeAdapter<T>) new TypeAdapter<ClickSummaryProperty>() {
           @Override
           public void write(JsonWriter out, ClickSummaryProperty value) throws IOException {
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
           public ClickSummaryProperty read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ClickSummaryProperty instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ClickSummaryProperty given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClickSummaryProperty
  * @throws IOException if the JSON string is invalid with respect to ClickSummaryProperty
  */
  public static ClickSummaryProperty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClickSummaryProperty.class);
  }

 /**
  * Convert an instance of ClickSummaryProperty to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

