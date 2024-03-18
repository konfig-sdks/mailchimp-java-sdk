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
 * The billing address for the order.
 */
@ApiModel(description = "The billing address for the order.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BillingAddressProperty7 {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

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

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private Double longitude;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private Double latitude;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private String company;

  public BillingAddressProperty7() {
  }

  public BillingAddressProperty7 name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name associated with an order&#39;s billing address.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Freddie Chimpenheimer", value = "The name associated with an order's billing address.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public BillingAddressProperty7 address1(String address1) {
    
    
    
    
    this.address1 = address1;
    return this;
  }

   /**
   * The billing address for the order.
   * @return address1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "675 Ponce de Leon Ave NE", value = "The billing address for the order.")

  public String getAddress1() {
    return address1;
  }


  public void setAddress1(String address1) {
    
    
    
    this.address1 = address1;
  }


  public BillingAddressProperty7 address2(String address2) {
    
    
    
    
    this.address2 = address2;
    return this;
  }

   /**
   * An additional field for the billing address.
   * @return address2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Suite 5000", value = "An additional field for the billing address.")

  public String getAddress2() {
    return address2;
  }


  public void setAddress2(String address2) {
    
    
    
    this.address2 = address2;
  }


  public BillingAddressProperty7 city(String city) {
    
    
    
    
    this.city = city;
    return this;
  }

   /**
   * The city in the billing address.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Atlanta", value = "The city in the billing address.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    
    
    
    this.city = city;
  }


  public BillingAddressProperty7 province(String province) {
    
    
    
    
    this.province = province;
    return this;
  }

   /**
   * The state or normalized province in the billing address.
   * @return province
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Georgia", value = "The state or normalized province in the billing address.")

  public String getProvince() {
    return province;
  }


  public void setProvince(String province) {
    
    
    
    this.province = province;
  }


  public BillingAddressProperty7 provinceCode(String provinceCode) {
    
    
    
    
    this.provinceCode = provinceCode;
    return this;
  }

   /**
   * The two-letter code for the province or state in the billing address.
   * @return provinceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GA", value = "The two-letter code for the province or state in the billing address.")

  public String getProvinceCode() {
    return provinceCode;
  }


  public void setProvinceCode(String provinceCode) {
    
    
    
    this.provinceCode = provinceCode;
  }


  public BillingAddressProperty7 postalCode(String postalCode) {
    
    
    
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal or zip code in the billing address.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30308", value = "The postal or zip code in the billing address.")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    
    
    
    this.postalCode = postalCode;
  }


  public BillingAddressProperty7 country(String country) {
    
    
    
    
    this.country = country;
    return this;
  }

   /**
   * The country in the billing address.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "United States", value = "The country in the billing address.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    
    
    
    this.country = country;
  }


  public BillingAddressProperty7 countryCode(String countryCode) {
    
    
    
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The two-letter code for the country in the billing address.
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "The two-letter code for the country in the billing address.")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    
    
    
    this.countryCode = countryCode;
  }


  public BillingAddressProperty7 longitude(Double longitude) {
    
    
    
    
    this.longitude = longitude;
    return this;
  }

  public BillingAddressProperty7 longitude(Integer longitude) {
    
    
    
    
    this.longitude = longitude.doubleValue();
    return this;
  }

   /**
   * The longitude for the billing address location.
   * @return longitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-75.68903", value = "The longitude for the billing address location.")

  public Double getLongitude() {
    return longitude;
  }


  public void setLongitude(Double longitude) {
    
    
    
    this.longitude = longitude;
  }


  public BillingAddressProperty7 latitude(Double latitude) {
    
    
    
    
    this.latitude = latitude;
    return this;
  }

  public BillingAddressProperty7 latitude(Integer latitude) {
    
    
    
    
    this.latitude = latitude.doubleValue();
    return this;
  }

   /**
   * The latitude for the billing address location.
   * @return latitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "45.427408", value = "The latitude for the billing address location.")

  public Double getLatitude() {
    return latitude;
  }


  public void setLatitude(Double latitude) {
    
    
    
    this.latitude = latitude;
  }


  public BillingAddressProperty7 phone(String phone) {
    
    
    
    
    this.phone = phone;
    return this;
  }

   /**
   * The phone number for the billing address.
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8675309", value = "The phone number for the billing address.")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    
    
    
    this.phone = phone;
  }


  public BillingAddressProperty7 company(String company) {
    
    
    
    
    this.company = company;
    return this;
  }

   /**
   * The company associated with the billing address.
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The company associated with the billing address.")

  public String getCompany() {
    return company;
  }


  public void setCompany(String company) {
    
    
    
    this.company = company;
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
   * @return the BillingAddressProperty7 instance itself
   */
  public BillingAddressProperty7 putAdditionalProperty(String key, Object value) {
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
    BillingAddressProperty7 billingAddressProperty7 = (BillingAddressProperty7) o;
    return Objects.equals(this.name, billingAddressProperty7.name) &&
        Objects.equals(this.address1, billingAddressProperty7.address1) &&
        Objects.equals(this.address2, billingAddressProperty7.address2) &&
        Objects.equals(this.city, billingAddressProperty7.city) &&
        Objects.equals(this.province, billingAddressProperty7.province) &&
        Objects.equals(this.provinceCode, billingAddressProperty7.provinceCode) &&
        Objects.equals(this.postalCode, billingAddressProperty7.postalCode) &&
        Objects.equals(this.country, billingAddressProperty7.country) &&
        Objects.equals(this.countryCode, billingAddressProperty7.countryCode) &&
        Objects.equals(this.longitude, billingAddressProperty7.longitude) &&
        Objects.equals(this.latitude, billingAddressProperty7.latitude) &&
        Objects.equals(this.phone, billingAddressProperty7.phone) &&
        Objects.equals(this.company, billingAddressProperty7.company)&&
        Objects.equals(this.additionalProperties, billingAddressProperty7.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address1, address2, city, province, provinceCode, postalCode, country, countryCode, longitude, latitude, phone, company, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingAddressProperty7 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    provinceCode: ").append(toIndentedString(provinceCode)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("address1");
    openapiFields.add("address2");
    openapiFields.add("city");
    openapiFields.add("province");
    openapiFields.add("province_code");
    openapiFields.add("postal_code");
    openapiFields.add("country");
    openapiFields.add("country_code");
    openapiFields.add("longitude");
    openapiFields.add("latitude");
    openapiFields.add("phone");
    openapiFields.add("company");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BillingAddressProperty7
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BillingAddressProperty7.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BillingAddressProperty7 is not found in the empty JSON string", BillingAddressProperty7.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
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
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("company") != null && !jsonObj.get("company").isJsonNull()) && !jsonObj.get("company").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BillingAddressProperty7.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BillingAddressProperty7' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BillingAddressProperty7> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BillingAddressProperty7.class));

       return (TypeAdapter<T>) new TypeAdapter<BillingAddressProperty7>() {
           @Override
           public void write(JsonWriter out, BillingAddressProperty7 value) throws IOException {
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
           public BillingAddressProperty7 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BillingAddressProperty7 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BillingAddressProperty7 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BillingAddressProperty7
  * @throws IOException if the JSON string is invalid with respect to BillingAddressProperty7
  */
  public static BillingAddressProperty7 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BillingAddressProperty7.class);
  }

 /**
  * Convert an instance of BillingAddressProperty7 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

