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
 * Extra options for some merge field types.
 */
@ApiModel(description = "Extra options for some merge field types.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MergeFieldOptionsProperty7 {
  public static final String SERIALIZED_NAME_DEFAULT_COUNTRY = "default_country";
  @SerializedName(SERIALIZED_NAME_DEFAULT_COUNTRY)
  private Integer defaultCountry;

  public static final String SERIALIZED_NAME_PHONE_FORMAT = "phone_format";
  @SerializedName(SERIALIZED_NAME_PHONE_FORMAT)
  private String phoneFormat;

  public static final String SERIALIZED_NAME_DATE_FORMAT = "date_format";
  @SerializedName(SERIALIZED_NAME_DATE_FORMAT)
  private String dateFormat;

  public static final String SERIALIZED_NAME_CHOICES = "choices";
  @SerializedName(SERIALIZED_NAME_CHOICES)
  private List<String> choices = null;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public MergeFieldOptionsProperty7() {
  }

  
  public MergeFieldOptionsProperty7(
     Integer size
  ) {
    this();
    this.size = size;
  }

  public MergeFieldOptionsProperty7 defaultCountry(Integer defaultCountry) {
    
    
    
    
    this.defaultCountry = defaultCountry;
    return this;
  }

   /**
   * In an address field, the default country code if none supplied.
   * @return defaultCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "In an address field, the default country code if none supplied.")

  public Integer getDefaultCountry() {
    return defaultCountry;
  }


  public void setDefaultCountry(Integer defaultCountry) {
    
    
    
    this.defaultCountry = defaultCountry;
  }


  public MergeFieldOptionsProperty7 phoneFormat(String phoneFormat) {
    
    
    
    
    this.phoneFormat = phoneFormat;
    return this;
  }

   /**
   * In a phone field, the phone number type: US or International.
   * @return phoneFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "In a phone field, the phone number type: US or International.")

  public String getPhoneFormat() {
    return phoneFormat;
  }


  public void setPhoneFormat(String phoneFormat) {
    
    
    
    this.phoneFormat = phoneFormat;
  }


  public MergeFieldOptionsProperty7 dateFormat(String dateFormat) {
    
    
    
    
    this.dateFormat = dateFormat;
    return this;
  }

   /**
   * In a date or birthday field, the format of the date.
   * @return dateFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "In a date or birthday field, the format of the date.")

  public String getDateFormat() {
    return dateFormat;
  }


  public void setDateFormat(String dateFormat) {
    
    
    
    this.dateFormat = dateFormat;
  }


  public MergeFieldOptionsProperty7 choices(List<String> choices) {
    
    
    
    
    this.choices = choices;
    return this;
  }

  public MergeFieldOptionsProperty7 addChoicesItem(String choicesItem) {
    if (this.choices == null) {
      this.choices = new ArrayList<>();
    }
    this.choices.add(choicesItem);
    return this;
  }

   /**
   * In a radio or dropdown non-group field, the available options for contacts to pick from.
   * @return choices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"First Choice\",\"Second Choice\",\"Third Choice\"]", value = "In a radio or dropdown non-group field, the available options for contacts to pick from.")

  public List<String> getChoices() {
    return choices;
  }


  public void setChoices(List<String> choices) {
    
    
    
    this.choices = choices;
  }


   /**
   * In a text field, the default length of the text field.
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "In a text field, the default length of the text field.")

  public Integer getSize() {
    return size;
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
   * @return the MergeFieldOptionsProperty7 instance itself
   */
  public MergeFieldOptionsProperty7 putAdditionalProperty(String key, Object value) {
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
    MergeFieldOptionsProperty7 mergeFieldOptionsProperty7 = (MergeFieldOptionsProperty7) o;
    return Objects.equals(this.defaultCountry, mergeFieldOptionsProperty7.defaultCountry) &&
        Objects.equals(this.phoneFormat, mergeFieldOptionsProperty7.phoneFormat) &&
        Objects.equals(this.dateFormat, mergeFieldOptionsProperty7.dateFormat) &&
        Objects.equals(this.choices, mergeFieldOptionsProperty7.choices) &&
        Objects.equals(this.size, mergeFieldOptionsProperty7.size)&&
        Objects.equals(this.additionalProperties, mergeFieldOptionsProperty7.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultCountry, phoneFormat, dateFormat, choices, size, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergeFieldOptionsProperty7 {\n");
    sb.append("    defaultCountry: ").append(toIndentedString(defaultCountry)).append("\n");
    sb.append("    phoneFormat: ").append(toIndentedString(phoneFormat)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
    openapiFields.add("default_country");
    openapiFields.add("phone_format");
    openapiFields.add("date_format");
    openapiFields.add("choices");
    openapiFields.add("size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MergeFieldOptionsProperty7
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MergeFieldOptionsProperty7.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MergeFieldOptionsProperty7 is not found in the empty JSON string", MergeFieldOptionsProperty7.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("phone_format") != null && !jsonObj.get("phone_format").isJsonNull()) && !jsonObj.get("phone_format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone_format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone_format").toString()));
      }
      if ((jsonObj.get("date_format") != null && !jsonObj.get("date_format").isJsonNull()) && !jsonObj.get("date_format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date_format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date_format").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("choices") != null && !jsonObj.get("choices").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `choices` to be an array in the JSON string but got `%s`", jsonObj.get("choices").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MergeFieldOptionsProperty7.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MergeFieldOptionsProperty7' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MergeFieldOptionsProperty7> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MergeFieldOptionsProperty7.class));

       return (TypeAdapter<T>) new TypeAdapter<MergeFieldOptionsProperty7>() {
           @Override
           public void write(JsonWriter out, MergeFieldOptionsProperty7 value) throws IOException {
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
           public MergeFieldOptionsProperty7 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MergeFieldOptionsProperty7 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MergeFieldOptionsProperty7 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MergeFieldOptionsProperty7
  * @throws IOException if the JSON string is invalid with respect to MergeFieldOptionsProperty7
  */
  public static MergeFieldOptionsProperty7 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MergeFieldOptionsProperty7.class);
  }

 /**
  * Convert an instance of MergeFieldOptionsProperty7 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

