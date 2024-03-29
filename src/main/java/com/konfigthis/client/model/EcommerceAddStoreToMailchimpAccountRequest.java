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
import com.konfigthis.client.model.AddressProperty;
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
 * An individual store in an account.
 */
@ApiModel(description = "An individual store in an account.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EcommerceAddStoreToMailchimpAccountRequest {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LIST_ID = "list_id";
  @SerializedName(SERIALIZED_NAME_LIST_ID)
  private String listId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_IS_SYNCING = "is_syncing";
  @SerializedName(SERIALIZED_NAME_IS_SYNCING)
  private Boolean isSyncing;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_MONEY_FORMAT = "money_format";
  @SerializedName(SERIALIZED_NAME_MONEY_FORMAT)
  private String moneyFormat;

  public static final String SERIALIZED_NAME_PRIMARY_LOCALE = "primary_locale";
  @SerializedName(SERIALIZED_NAME_PRIMARY_LOCALE)
  private String primaryLocale;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private AddressProperty address;

  public EcommerceAddStoreToMailchimpAccountRequest() {
  }

  public EcommerceAddStoreToMailchimpAccountRequest id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for the store.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "example_store", required = true, value = "The unique identifier for the store.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public EcommerceAddStoreToMailchimpAccountRequest listId(String listId) {
    
    
    
    
    this.listId = listId;
    return this;
  }

   /**
   * The unique identifier for the list associated with the store. The &#x60;list_id&#x60; for a specific store cannot change.
   * @return listId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1a2df69511", required = true, value = "The unique identifier for the list associated with the store. The `list_id` for a specific store cannot change.")

  public String getListId() {
    return listId;
  }


  public void setListId(String listId) {
    
    
    
    this.listId = listId;
  }


  public EcommerceAddStoreToMailchimpAccountRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the store.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Freddie's Cat Hat Emporium", required = true, value = "The name of the store.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public EcommerceAddStoreToMailchimpAccountRequest platform(String platform) {
    
    
    
    
    this.platform = platform;
    return this;
  }

   /**
   * The e-commerce platform of the store.
   * @return platform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The e-commerce platform of the store.")

  public String getPlatform() {
    return platform;
  }


  public void setPlatform(String platform) {
    
    
    
    this.platform = platform;
  }


  public EcommerceAddStoreToMailchimpAccountRequest domain(String domain) {
    
    
    
    
    this.domain = domain;
    return this;
  }

   /**
   * The store domain. This parameter is required for Connected Sites and Google Ads.
   * @return domain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "example.com", value = "The store domain. This parameter is required for Connected Sites and Google Ads.")

  public String getDomain() {
    return domain;
  }


  public void setDomain(String domain) {
    
    
    
    this.domain = domain;
  }


  public EcommerceAddStoreToMailchimpAccountRequest isSyncing(Boolean isSyncing) {
    
    
    
    
    this.isSyncing = isSyncing;
    return this;
  }

   /**
   * Whether to disable automations because the store is currently [syncing](https://mailchimp.com/developer/marketing/docs/e-commerce/#pausing-store-automations).
   * @return isSyncing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to disable automations because the store is currently [syncing](https://mailchimp.com/developer/marketing/docs/e-commerce/#pausing-store-automations).")

  public Boolean getIsSyncing() {
    return isSyncing;
  }


  public void setIsSyncing(Boolean isSyncing) {
    
    
    
    this.isSyncing = isSyncing;
  }


  public EcommerceAddStoreToMailchimpAccountRequest emailAddress(String emailAddress) {
    
    
    
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The email address for the store.
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "freddie@mailchimp.com", value = "The email address for the store.")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    
    
    
    this.emailAddress = emailAddress;
  }


  public EcommerceAddStoreToMailchimpAccountRequest currencyCode(String currencyCode) {
    
    
    
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The three-letter ISO 4217 code for the currency that the store accepts.
   * @return currencyCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "USD", required = true, value = "The three-letter ISO 4217 code for the currency that the store accepts.")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    
    
    
    this.currencyCode = currencyCode;
  }


  public EcommerceAddStoreToMailchimpAccountRequest moneyFormat(String moneyFormat) {
    
    
    
    
    this.moneyFormat = moneyFormat;
    return this;
  }

   /**
   * The currency format for the store. For example: &#x60;$&#x60;, &#x60;£&#x60;, etc.
   * @return moneyFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "$", value = "The currency format for the store. For example: `$`, `£`, etc.")

  public String getMoneyFormat() {
    return moneyFormat;
  }


  public void setMoneyFormat(String moneyFormat) {
    
    
    
    this.moneyFormat = moneyFormat;
  }


  public EcommerceAddStoreToMailchimpAccountRequest primaryLocale(String primaryLocale) {
    
    
    
    
    this.primaryLocale = primaryLocale;
    return this;
  }

   /**
   * The primary locale for the store. For example: &#x60;en&#x60;, &#x60;de&#x60;, etc.
   * @return primaryLocale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fr", value = "The primary locale for the store. For example: `en`, `de`, etc.")

  public String getPrimaryLocale() {
    return primaryLocale;
  }


  public void setPrimaryLocale(String primaryLocale) {
    
    
    
    this.primaryLocale = primaryLocale;
  }


  public EcommerceAddStoreToMailchimpAccountRequest timezone(String timezone) {
    
    
    
    
    this.timezone = timezone;
    return this;
  }

   /**
   * The timezone for the store.
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Eastern", value = "The timezone for the store.")

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    
    
    
    this.timezone = timezone;
  }


  public EcommerceAddStoreToMailchimpAccountRequest phone(String phone) {
    
    
    
    
    this.phone = phone;
    return this;
  }

   /**
   * The store phone number.
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "404-444-4444", value = "The store phone number.")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    
    
    
    this.phone = phone;
  }


  public EcommerceAddStoreToMailchimpAccountRequest address(AddressProperty address) {
    
    
    
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AddressProperty getAddress() {
    return address;
  }


  public void setAddress(AddressProperty address) {
    
    
    
    this.address = address;
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
   * @return the EcommerceAddStoreToMailchimpAccountRequest instance itself
   */
  public EcommerceAddStoreToMailchimpAccountRequest putAdditionalProperty(String key, Object value) {
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
    EcommerceAddStoreToMailchimpAccountRequest ecommerceAddStoreToMailchimpAccountRequest = (EcommerceAddStoreToMailchimpAccountRequest) o;
    return Objects.equals(this.id, ecommerceAddStoreToMailchimpAccountRequest.id) &&
        Objects.equals(this.listId, ecommerceAddStoreToMailchimpAccountRequest.listId) &&
        Objects.equals(this.name, ecommerceAddStoreToMailchimpAccountRequest.name) &&
        Objects.equals(this.platform, ecommerceAddStoreToMailchimpAccountRequest.platform) &&
        Objects.equals(this.domain, ecommerceAddStoreToMailchimpAccountRequest.domain) &&
        Objects.equals(this.isSyncing, ecommerceAddStoreToMailchimpAccountRequest.isSyncing) &&
        Objects.equals(this.emailAddress, ecommerceAddStoreToMailchimpAccountRequest.emailAddress) &&
        Objects.equals(this.currencyCode, ecommerceAddStoreToMailchimpAccountRequest.currencyCode) &&
        Objects.equals(this.moneyFormat, ecommerceAddStoreToMailchimpAccountRequest.moneyFormat) &&
        Objects.equals(this.primaryLocale, ecommerceAddStoreToMailchimpAccountRequest.primaryLocale) &&
        Objects.equals(this.timezone, ecommerceAddStoreToMailchimpAccountRequest.timezone) &&
        Objects.equals(this.phone, ecommerceAddStoreToMailchimpAccountRequest.phone) &&
        Objects.equals(this.address, ecommerceAddStoreToMailchimpAccountRequest.address)&&
        Objects.equals(this.additionalProperties, ecommerceAddStoreToMailchimpAccountRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, listId, name, platform, domain, isSyncing, emailAddress, currencyCode, moneyFormat, primaryLocale, timezone, phone, address, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EcommerceAddStoreToMailchimpAccountRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    isSyncing: ").append(toIndentedString(isSyncing)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    moneyFormat: ").append(toIndentedString(moneyFormat)).append("\n");
    sb.append("    primaryLocale: ").append(toIndentedString(primaryLocale)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("list_id");
    openapiFields.add("name");
    openapiFields.add("platform");
    openapiFields.add("domain");
    openapiFields.add("is_syncing");
    openapiFields.add("email_address");
    openapiFields.add("currency_code");
    openapiFields.add("money_format");
    openapiFields.add("primary_locale");
    openapiFields.add("timezone");
    openapiFields.add("phone");
    openapiFields.add("address");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("list_id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("currency_code");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EcommerceAddStoreToMailchimpAccountRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EcommerceAddStoreToMailchimpAccountRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EcommerceAddStoreToMailchimpAccountRequest is not found in the empty JSON string", EcommerceAddStoreToMailchimpAccountRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EcommerceAddStoreToMailchimpAccountRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("list_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `list_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("list_id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("platform") != null && !jsonObj.get("platform").isJsonNull()) && !jsonObj.get("platform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platform").toString()));
      }
      if ((jsonObj.get("domain") != null && !jsonObj.get("domain").isJsonNull()) && !jsonObj.get("domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain").toString()));
      }
      if ((jsonObj.get("email_address") != null && !jsonObj.get("email_address").isJsonNull()) && !jsonObj.get("email_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email_address").toString()));
      }
      if (!jsonObj.get("currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_code").toString()));
      }
      if ((jsonObj.get("money_format") != null && !jsonObj.get("money_format").isJsonNull()) && !jsonObj.get("money_format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `money_format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("money_format").toString()));
      }
      if ((jsonObj.get("primary_locale") != null && !jsonObj.get("primary_locale").isJsonNull()) && !jsonObj.get("primary_locale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primary_locale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primary_locale").toString()));
      }
      if ((jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) && !jsonObj.get("timezone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timezone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timezone").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        AddressProperty.validateJsonObject(jsonObj.getAsJsonObject("address"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EcommerceAddStoreToMailchimpAccountRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EcommerceAddStoreToMailchimpAccountRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EcommerceAddStoreToMailchimpAccountRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EcommerceAddStoreToMailchimpAccountRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EcommerceAddStoreToMailchimpAccountRequest>() {
           @Override
           public void write(JsonWriter out, EcommerceAddStoreToMailchimpAccountRequest value) throws IOException {
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
           public EcommerceAddStoreToMailchimpAccountRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EcommerceAddStoreToMailchimpAccountRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EcommerceAddStoreToMailchimpAccountRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EcommerceAddStoreToMailchimpAccountRequest
  * @throws IOException if the JSON string is invalid with respect to EcommerceAddStoreToMailchimpAccountRequest
  */
  public static EcommerceAddStoreToMailchimpAccountRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EcommerceAddStoreToMailchimpAccountRequest.class);
  }

 /**
  * Convert an instance of EcommerceAddStoreToMailchimpAccountRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

