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
 * The customer&#39;s address.
 */
@ApiModel(description = "The customer's address.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AddressProperty37 {
  public static final String SERIALIZED_NAME_ADDRESS1 = "address1";
  @SerializedName(SERIALIZED_NAME_ADDRESS1)
  private String address1;

  public static final String SERIALIZED_NAME_ADDRESS2 = "address2";
  @SerializedName(SERIALIZED_NAME_ADDRESS2)
  private String address2;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_PROVINCE = "province";
  @SerializedName(SERIALIZED_NAME_PROVINCE)
  private String province;

  public static final String SERIALIZED_NAME_PROVINCE_CODE = "province_code";
  @SerializedName(SERIALIZED_NAME_PROVINCE_CODE)
  private String provinceCode;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public AddressProperty37() {
  }

  public AddressProperty37 address1(String address1) {
    
    
    
    
    this.address1 = address1;
    return this;
  }

   /**
   * The mailing address of the customer.
   * @return address1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "675 Ponce de Leon Ave NE", value = "The mailing address of the customer.")

  public String getAddress1() {
    return address1;
  }


  public void setAddress1(String address1) {
    
    
    
    this.address1 = address1;
  }


  public AddressProperty37 address2(String address2) {
    
    
    
    
    this.address2 = address2;
    return this;
  }

   /**
   * An additional field for the customer&#39;s mailing address.
   * @return address2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Suite 5000", value = "An additional field for the customer's mailing address.")

  public String getAddress2() {
    return address2;
  }


  public void setAddress2(String address2) {
    
    
    
    this.address2 = address2;
  }


  public AddressProperty37 city(String city) {
    
    
    
    
    this.city = city;
    return this;
  }

   /**
   * The city the customer is located in.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Atlanta", value = "The city the customer is located in.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    
    
    
    this.city = city;
  }


  public AddressProperty37 province(String province) {
    
    
    
    
    this.province = province;
    return this;
  }

   /**
   * The customer&#39;s state name or normalized province.
   * @return province
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Georgia", value = "The customer's state name or normalized province.")

  public String getProvince() {
    return province;
  }


  public void setProvince(String province) {
    
    
    
    this.province = province;
  }


  public AddressProperty37 provinceCode(String provinceCode) {
    
    
    
    
    this.provinceCode = provinceCode;
    return this;
  }

   /**
   * The two-letter code for the customer&#39;s province or state.
   * @return provinceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GA", value = "The two-letter code for the customer's province or state.")

  public String getProvinceCode() {
    return provinceCode;
  }


  public void setProvinceCode(String provinceCode) {
    
    
    
    this.provinceCode = provinceCode;
  }


  public AddressProperty37 postalCode(String postalCode) {
    
    
    
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The customer&#39;s postal or zip code.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30308", value = "The customer's postal or zip code.")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    
    
    
    this.postalCode = postalCode;
  }


  public AddressProperty37 country(String country) {
    
    
    
    
    this.country = country;
    return this;
  }

   /**
   * The customer&#39;s country.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "United States", value = "The customer's country.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    
    
    
    this.country = country;
  }


  public AddressProperty37 countryCode(String countryCode) {
    
    
    
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The two-letter code for the customer&#39;s country.
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "The two-letter code for the customer's country.")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    
    
    
    this.countryCode = countryCode;
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
   * @return the AddressProperty37 instance itself
   */
  public AddressProperty37 putAdditionalProperty(String key, Object value) {
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
    AddressProperty37 addressProperty37 = (AddressProperty37) o;
    return Objects.equals(this.address1, addressProperty37.address1) &&
        Objects.equals(this.address2, addressProperty37.address2) &&
        Objects.equals(this.city, addressProperty37.city) &&
        Objects.equals(this.province, addressProperty37.province) &&
        Objects.equals(this.provinceCode, addressProperty37.provinceCode) &&
        Objects.equals(this.postalCode, addressProperty37.postalCode) &&
        Objects.equals(this.country, addressProperty37.country) &&
        Objects.equals(this.countryCode, addressProperty37.countryCode)&&
        Objects.equals(this.additionalProperties, addressProperty37.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, province, provinceCode, postalCode, country, countryCode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressProperty37 {\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    provinceCode: ").append(toIndentedString(provinceCode)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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
    openapiFields.add("address1");
    openapiFields.add("address2");
    openapiFields.add("city");
    openapiFields.add("province");
    openapiFields.add("province_code");
    openapiFields.add("postal_code");
    openapiFields.add("country");
    openapiFields.add("country_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddressProperty37
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddressProperty37.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddressProperty37 is not found in the empty JSON string", AddressProperty37.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("address1") != null && !jsonObj.get("address1").isJsonNull()) && !jsonObj.get("address1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address1").toString()));
      }
      if ((jsonObj.get("address2") != null && !jsonObj.get("address2").isJsonNull()) && !jsonObj.get("address2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address2").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("province") != null && !jsonObj.get("province").isJsonNull()) && !jsonObj.get("province").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `province` to be a primitive type in the JSON string but got `%s`", jsonObj.get("province").toString()));
      }
      if ((jsonObj.get("province_code") != null && !jsonObj.get("province_code").isJsonNull()) && !jsonObj.get("province_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `province_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("province_code").toString()));
      }
      if ((jsonObj.get("postal_code") != null && !jsonObj.get("postal_code").isJsonNull()) && !jsonObj.get("postal_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postal_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postal_code").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("country_code") != null && !jsonObj.get("country_code").isJsonNull()) && !jsonObj.get("country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddressProperty37.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddressProperty37' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddressProperty37> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddressProperty37.class));

       return (TypeAdapter<T>) new TypeAdapter<AddressProperty37>() {
           @Override
           public void write(JsonWriter out, AddressProperty37 value) throws IOException {
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
           public AddressProperty37 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AddressProperty37 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AddressProperty37 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddressProperty37
  * @throws IOException if the JSON string is invalid with respect to AddressProperty37
  */
  public static AddressProperty37 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddressProperty37.class);
  }

 /**
  * Convert an instance of AddressProperty37 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

