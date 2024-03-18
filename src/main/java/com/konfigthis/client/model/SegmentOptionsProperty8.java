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
 * An object representing all segmentation options. This object should contain a &#x60;saved_segment_id&#x60; to use an existing segment, or you can create a new segment by including both &#x60;match&#x60; and &#x60;conditions&#x60; options.
 */
@ApiModel(description = "An object representing all segmentation options. This object should contain a `saved_segment_id` to use an existing segment, or you can create a new segment by including both `match` and `conditions` options.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SegmentOptionsProperty8 {
  public static final String SERIALIZED_NAME_SAVED_SEGMENT_ID = "saved_segment_id";
  @SerializedName(SERIALIZED_NAME_SAVED_SEGMENT_ID)
  private Integer savedSegmentId;

  public static final String SERIALIZED_NAME_PREBUILT_SEGMENT_ID = "prebuilt_segment_id";
  @SerializedName(SERIALIZED_NAME_PREBUILT_SEGMENT_ID)
  private String prebuiltSegmentId;

  /**
   * Segment match type.
   */
  @JsonAdapter(MatchEnum.Adapter.class)
 public enum MatchEnum {
    ANY("any"),
    
    ALL("all");

    private String value;

    MatchEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MatchEnum fromValue(String value) {
      for (MatchEnum b : MatchEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MatchEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MatchEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MatchEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MatchEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MATCH = "match";
  @SerializedName(SERIALIZED_NAME_MATCH)
  private MatchEnum match;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<Object> conditions = null;

  public SegmentOptionsProperty8() {
  }

  public SegmentOptionsProperty8 savedSegmentId(Integer savedSegmentId) {
    
    
    
    
    this.savedSegmentId = savedSegmentId;
    return this;
  }

   /**
   * The id for an existing saved segment.
   * @return savedSegmentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id for an existing saved segment.")

  public Integer getSavedSegmentId() {
    return savedSegmentId;
  }


  public void setSavedSegmentId(Integer savedSegmentId) {
    
    
    
    this.savedSegmentId = savedSegmentId;
  }


  public SegmentOptionsProperty8 prebuiltSegmentId(String prebuiltSegmentId) {
    
    
    
    
    this.prebuiltSegmentId = prebuiltSegmentId;
    return this;
  }

   /**
   * The prebuilt segment id, if a prebuilt segment has been designated for this campaign.
   * @return prebuiltSegmentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "subscribers-female", value = "The prebuilt segment id, if a prebuilt segment has been designated for this campaign.")

  public String getPrebuiltSegmentId() {
    return prebuiltSegmentId;
  }


  public void setPrebuiltSegmentId(String prebuiltSegmentId) {
    
    
    
    this.prebuiltSegmentId = prebuiltSegmentId;
  }


  public SegmentOptionsProperty8 match(MatchEnum match) {
    
    
    
    
    this.match = match;
    return this;
  }

   /**
   * Segment match type.
   * @return match
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Segment match type.")

  public MatchEnum getMatch() {
    return match;
  }


  public void setMatch(MatchEnum match) {
    
    
    
    this.match = match;
  }


  public SegmentOptionsProperty8 conditions(List<Object> conditions) {
    
    
    
    
    this.conditions = conditions;
    return this;
  }

  public SegmentOptionsProperty8 addConditionsItem(Object conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Segment match conditions. There are multiple possible types, see the [condition types documentation](https://mailchimp.com/developer/marketing/docs/alternative-schemas/#segment-condition-schemas).
   * @return conditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Segment match conditions. There are multiple possible types, see the [condition types documentation](https://mailchimp.com/developer/marketing/docs/alternative-schemas/#segment-condition-schemas).")

  public List<Object> getConditions() {
    return conditions;
  }


  public void setConditions(List<Object> conditions) {
    
    
    
    this.conditions = conditions;
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
   * @return the SegmentOptionsProperty8 instance itself
   */
  public SegmentOptionsProperty8 putAdditionalProperty(String key, Object value) {
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
    SegmentOptionsProperty8 segmentOptionsProperty8 = (SegmentOptionsProperty8) o;
    return Objects.equals(this.savedSegmentId, segmentOptionsProperty8.savedSegmentId) &&
        Objects.equals(this.prebuiltSegmentId, segmentOptionsProperty8.prebuiltSegmentId) &&
        Objects.equals(this.match, segmentOptionsProperty8.match) &&
        Objects.equals(this.conditions, segmentOptionsProperty8.conditions)&&
        Objects.equals(this.additionalProperties, segmentOptionsProperty8.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(savedSegmentId, prebuiltSegmentId, match, conditions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentOptionsProperty8 {\n");
    sb.append("    savedSegmentId: ").append(toIndentedString(savedSegmentId)).append("\n");
    sb.append("    prebuiltSegmentId: ").append(toIndentedString(prebuiltSegmentId)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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
    openapiFields.add("saved_segment_id");
    openapiFields.add("prebuilt_segment_id");
    openapiFields.add("match");
    openapiFields.add("conditions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SegmentOptionsProperty8
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SegmentOptionsProperty8.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SegmentOptionsProperty8 is not found in the empty JSON string", SegmentOptionsProperty8.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("prebuilt_segment_id") != null && !jsonObj.get("prebuilt_segment_id").isJsonNull()) && !jsonObj.get("prebuilt_segment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prebuilt_segment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prebuilt_segment_id").toString()));
      }
      if ((jsonObj.get("match") != null && !jsonObj.get("match").isJsonNull()) && !jsonObj.get("match").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `match` to be a primitive type in the JSON string but got `%s`", jsonObj.get("match").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `conditions` to be an array in the JSON string but got `%s`", jsonObj.get("conditions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SegmentOptionsProperty8.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SegmentOptionsProperty8' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SegmentOptionsProperty8> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SegmentOptionsProperty8.class));

       return (TypeAdapter<T>) new TypeAdapter<SegmentOptionsProperty8>() {
           @Override
           public void write(JsonWriter out, SegmentOptionsProperty8 value) throws IOException {
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
           public SegmentOptionsProperty8 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SegmentOptionsProperty8 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SegmentOptionsProperty8 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SegmentOptionsProperty8
  * @throws IOException if the JSON string is invalid with respect to SegmentOptionsProperty8
  */
  public static SegmentOptionsProperty8 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SegmentOptionsProperty8.class);
  }

 /**
  * Convert an instance of SegmentOptionsProperty8 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

