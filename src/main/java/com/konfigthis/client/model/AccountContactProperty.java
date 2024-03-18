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
 * Information about the account contact.
 */
@ApiModel(description = "Information about the account contact.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AccountContactProperty {
  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private String company;

  public static final String SERIALIZED_NAME_ADDR1 = "addr1";
  @SerializedName(SERIALIZED_NAME_ADDR1)
  private String addr1;

  public static final String SERIALIZED_NAME_ADDR2 = "addr2";
  @SerializedName(SERIALIZED_NAME_ADDR2)
  private String addr2;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_ZIP = "zip";
  @SerializedName(SERIALIZED_NAME_ZIP)
  private String zip;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public AccountContactProperty() {
  }

  
  public AccountContactProperty(
     String company, 
     String addr1, 
     String addr2, 
     String city, 
     String state, 
     String zip, 
     String country
  ) {
    this();
    this.company = company;
    this.addr1 = addr1;
    this.addr2 = addr2;
    this.city = city;
    this.state = state;
    this.zip = zip;
    this.country = country;
  }

   /**
   * The company name for the account.
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The company name for the account.")

  public String getCompany() {
    return company;
  }




   /**
   * The street address for the account contact.
   * @return addr1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The street address for the account contact.")

  public String getAddr1() {
    return addr1;
  }




   /**
   * The street address for the account contact.
   * @return addr2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The street address for the account contact.")

  public String getAddr2() {
    return addr2;
  }




   /**
   * The city for the account contact.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The city for the account contact.")

  public String getCity() {
    return city;
  }




   /**
   * The state for the account contact.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The state for the account contact.")

  public String getState() {
    return state;
  }




   /**
   * The zip code for the account contact.
   * @return zip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The zip code for the account contact.")

  public String getZip() {
    return zip;
  }




   /**
   * The country for the account contact.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The country for the account contact.")

  public String getCountry() {
    return country;
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
   * @return the AccountContactProperty instance itself
   */
  public AccountContactProperty putAdditionalProperty(String key, Object value) {
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
    AccountContactProperty accountContactProperty = (AccountContactProperty) o;
    return Objects.equals(this.company, accountContactProperty.company) &&
        Objects.equals(this.addr1, accountContactProperty.addr1) &&
        Objects.equals(this.addr2, accountContactProperty.addr2) &&
        Objects.equals(this.city, accountContactProperty.city) &&
        Objects.equals(this.state, accountContactProperty.state) &&
        Objects.equals(this.zip, accountContactProperty.zip) &&
        Objects.equals(this.country, accountContactProperty.country)&&
        Objects.equals(this.additionalProperties, accountContactProperty.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, addr1, addr2, city, state, zip, country, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountContactProperty {\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    addr1: ").append(toIndentedString(addr1)).append("\n");
    sb.append("    addr2: ").append(toIndentedString(addr2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
    openapiFields.add("company");
    openapiFields.add("addr1");
    openapiFields.add("addr2");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("zip");
    openapiFields.add("country");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccountContactProperty
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AccountContactProperty.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountContactProperty is not found in the empty JSON string", AccountContactProperty.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("company") != null && !jsonObj.get("company").isJsonNull()) && !jsonObj.get("company").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company").toString()));
      }
      if ((jsonObj.get("addr1") != null && !jsonObj.get("addr1").isJsonNull()) && !jsonObj.get("addr1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addr1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addr1").toString()));
      }
      if ((jsonObj.get("addr2") != null && !jsonObj.get("addr2").isJsonNull()) && !jsonObj.get("addr2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addr2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addr2").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("zip") != null && !jsonObj.get("zip").isJsonNull()) && !jsonObj.get("zip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zip").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountContactProperty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountContactProperty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountContactProperty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountContactProperty.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountContactProperty>() {
           @Override
           public void write(JsonWriter out, AccountContactProperty value) throws IOException {
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
           public AccountContactProperty read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AccountContactProperty instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AccountContactProperty given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountContactProperty
  * @throws IOException if the JSON string is invalid with respect to AccountContactProperty
  */
  public static AccountContactProperty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountContactProperty.class);
  }

 /**
  * Convert an instance of AccountContactProperty to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

