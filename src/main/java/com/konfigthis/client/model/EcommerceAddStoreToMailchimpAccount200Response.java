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
import com.konfigthis.client.model.AddressProperty14;
import com.konfigthis.client.model.AutomationsProperty3;
import com.konfigthis.client.model.ConnectedSiteProperty3;
import com.konfigthis.client.model.ResourceLink;
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
 * An individual store in an account.
 */
@ApiModel(description = "An individual store in an account.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EcommerceAddStoreToMailchimpAccount200Response {
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
  private AddressProperty14 address;

  public static final String SERIALIZED_NAME_CONNECTED_SITE = "connected_site";
  @SerializedName(SERIALIZED_NAME_CONNECTED_SITE)
  private ConnectedSiteProperty3 connectedSite;

  public static final String SERIALIZED_NAME_AUTOMATIONS = "automations";
  @SerializedName(SERIALIZED_NAME_AUTOMATIONS)
  private AutomationsProperty3 automations;

  public static final String SERIALIZED_NAME_LIST_IS_ACTIVE = "list_is_active";
  @SerializedName(SERIALIZED_NAME_LIST_IS_ACTIVE)
  private Boolean listIsActive;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<ResourceLink> links = null;

  public EcommerceAddStoreToMailchimpAccount200Response() {
  }

  
  public EcommerceAddStoreToMailchimpAccount200Response(
     String id, 
     String listId, 
     Boolean listIsActive, 
     OffsetDateTime createdAt, 
     OffsetDateTime updatedAt, 
     List<ResourceLink> links
  ) {
    this();
    this.id = id;
    this.listId = listId;
    this.listIsActive = listIsActive;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.links = links;
  }

   /**
   * The unique identifier for the store.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "example_store", value = "The unique identifier for the store.")

  public String getId() {
    return id;
  }




   /**
   * The unique identifier for the list that&#39;s associated with the store. The &#x60;list_id&#x60; for a specific store can&#39;t change.
   * @return listId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1a2df69511", value = "The unique identifier for the list that's associated with the store. The `list_id` for a specific store can't change.")

  public String getListId() {
    return listId;
  }




  public EcommerceAddStoreToMailchimpAccount200Response name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the store.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Freddie's Cat Hat Emporium", value = "The name of the store.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public EcommerceAddStoreToMailchimpAccount200Response platform(String platform) {
    
    
    
    
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


  public EcommerceAddStoreToMailchimpAccount200Response domain(String domain) {
    
    
    
    
    this.domain = domain;
    return this;
  }

   /**
   * The store domain.  The store domain must be unique within a user account.
   * @return domain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "example.com", value = "The store domain.  The store domain must be unique within a user account.")

  public String getDomain() {
    return domain;
  }


  public void setDomain(String domain) {
    
    
    
    this.domain = domain;
  }


  public EcommerceAddStoreToMailchimpAccount200Response isSyncing(Boolean isSyncing) {
    
    
    
    
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


  public EcommerceAddStoreToMailchimpAccount200Response emailAddress(String emailAddress) {
    
    
    
    
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


  public EcommerceAddStoreToMailchimpAccount200Response currencyCode(String currencyCode) {
    
    
    
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The three-letter ISO 4217 code for the currency that the store accepts.
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "The three-letter ISO 4217 code for the currency that the store accepts.")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    
    
    
    this.currencyCode = currencyCode;
  }


  public EcommerceAddStoreToMailchimpAccount200Response moneyFormat(String moneyFormat) {
    
    
    
    
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


  public EcommerceAddStoreToMailchimpAccount200Response primaryLocale(String primaryLocale) {
    
    
    
    
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


  public EcommerceAddStoreToMailchimpAccount200Response timezone(String timezone) {
    
    
    
    
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


  public EcommerceAddStoreToMailchimpAccount200Response phone(String phone) {
    
    
    
    
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


  public EcommerceAddStoreToMailchimpAccount200Response address(AddressProperty14 address) {
    
    
    
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AddressProperty14 getAddress() {
    return address;
  }


  public void setAddress(AddressProperty14 address) {
    
    
    
    this.address = address;
  }


  public EcommerceAddStoreToMailchimpAccount200Response connectedSite(ConnectedSiteProperty3 connectedSite) {
    
    
    
    
    this.connectedSite = connectedSite;
    return this;
  }

   /**
   * Get connectedSite
   * @return connectedSite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectedSiteProperty3 getConnectedSite() {
    return connectedSite;
  }


  public void setConnectedSite(ConnectedSiteProperty3 connectedSite) {
    
    
    
    this.connectedSite = connectedSite;
  }


  public EcommerceAddStoreToMailchimpAccount200Response automations(AutomationsProperty3 automations) {
    
    
    
    
    this.automations = automations;
    return this;
  }

   /**
   * Get automations
   * @return automations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AutomationsProperty3 getAutomations() {
    return automations;
  }


  public void setAutomations(AutomationsProperty3 automations) {
    
    
    
    this.automations = automations;
  }


   /**
   * The status of the list connected to the store, namely if it&#39;s deleted or disabled.
   * @return listIsActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the list connected to the store, namely if it's deleted or disabled.")

  public Boolean getListIsActive() {
    return listIsActive;
  }




   /**
   * The date and time the store was created in ISO 8601 format.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-07-15T19:28Z", value = "The date and time the store was created in ISO 8601 format.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * The date and time the store was last updated in ISO 8601 format.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-07-15T19:28Z", value = "The date and time the store was last updated in ISO 8601 format.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




   /**
   * A list of link types and descriptions for the API schema documents.
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of link types and descriptions for the API schema documents.")

  public List<ResourceLink> getLinks() {
    return links;
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
   * @return the EcommerceAddStoreToMailchimpAccount200Response instance itself
   */
  public EcommerceAddStoreToMailchimpAccount200Response putAdditionalProperty(String key, Object value) {
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
    EcommerceAddStoreToMailchimpAccount200Response ecommerceAddStoreToMailchimpAccount200Response = (EcommerceAddStoreToMailchimpAccount200Response) o;
    return Objects.equals(this.id, ecommerceAddStoreToMailchimpAccount200Response.id) &&
        Objects.equals(this.listId, ecommerceAddStoreToMailchimpAccount200Response.listId) &&
        Objects.equals(this.name, ecommerceAddStoreToMailchimpAccount200Response.name) &&
        Objects.equals(this.platform, ecommerceAddStoreToMailchimpAccount200Response.platform) &&
        Objects.equals(this.domain, ecommerceAddStoreToMailchimpAccount200Response.domain) &&
        Objects.equals(this.isSyncing, ecommerceAddStoreToMailchimpAccount200Response.isSyncing) &&
        Objects.equals(this.emailAddress, ecommerceAddStoreToMailchimpAccount200Response.emailAddress) &&
        Objects.equals(this.currencyCode, ecommerceAddStoreToMailchimpAccount200Response.currencyCode) &&
        Objects.equals(this.moneyFormat, ecommerceAddStoreToMailchimpAccount200Response.moneyFormat) &&
        Objects.equals(this.primaryLocale, ecommerceAddStoreToMailchimpAccount200Response.primaryLocale) &&
        Objects.equals(this.timezone, ecommerceAddStoreToMailchimpAccount200Response.timezone) &&
        Objects.equals(this.phone, ecommerceAddStoreToMailchimpAccount200Response.phone) &&
        Objects.equals(this.address, ecommerceAddStoreToMailchimpAccount200Response.address) &&
        Objects.equals(this.connectedSite, ecommerceAddStoreToMailchimpAccount200Response.connectedSite) &&
        Objects.equals(this.automations, ecommerceAddStoreToMailchimpAccount200Response.automations) &&
        Objects.equals(this.listIsActive, ecommerceAddStoreToMailchimpAccount200Response.listIsActive) &&
        Objects.equals(this.createdAt, ecommerceAddStoreToMailchimpAccount200Response.createdAt) &&
        Objects.equals(this.updatedAt, ecommerceAddStoreToMailchimpAccount200Response.updatedAt) &&
        Objects.equals(this.links, ecommerceAddStoreToMailchimpAccount200Response.links)&&
        Objects.equals(this.additionalProperties, ecommerceAddStoreToMailchimpAccount200Response.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, listId, name, platform, domain, isSyncing, emailAddress, currencyCode, moneyFormat, primaryLocale, timezone, phone, address, connectedSite, automations, listIsActive, createdAt, updatedAt, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EcommerceAddStoreToMailchimpAccount200Response {\n");
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
    sb.append("    connectedSite: ").append(toIndentedString(connectedSite)).append("\n");
    sb.append("    automations: ").append(toIndentedString(automations)).append("\n");
    sb.append("    listIsActive: ").append(toIndentedString(listIsActive)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("connected_site");
    openapiFields.add("automations");
    openapiFields.add("list_is_active");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EcommerceAddStoreToMailchimpAccount200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EcommerceAddStoreToMailchimpAccount200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EcommerceAddStoreToMailchimpAccount200Response is not found in the empty JSON string", EcommerceAddStoreToMailchimpAccount200Response.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("list_id") != null && !jsonObj.get("list_id").isJsonNull()) && !jsonObj.get("list_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `list_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("list_id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
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
      if ((jsonObj.get("currency_code") != null && !jsonObj.get("currency_code").isJsonNull()) && !jsonObj.get("currency_code").isJsonPrimitive()) {
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
        AddressProperty14.validateJsonObject(jsonObj.getAsJsonObject("address"));
      }
      // validate the optional field `connected_site`
      if (jsonObj.get("connected_site") != null && !jsonObj.get("connected_site").isJsonNull()) {
        ConnectedSiteProperty3.validateJsonObject(jsonObj.getAsJsonObject("connected_site"));
      }
      // validate the optional field `automations`
      if (jsonObj.get("automations") != null && !jsonObj.get("automations").isJsonNull()) {
        AutomationsProperty3.validateJsonObject(jsonObj.getAsJsonObject("automations"));
      }
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("_links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("_links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `_links` to be an array in the JSON string but got `%s`", jsonObj.get("_links").toString()));
          }

          // validate the optional field `_links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            ResourceLink.validateJsonObject(jsonArraylinks.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EcommerceAddStoreToMailchimpAccount200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EcommerceAddStoreToMailchimpAccount200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EcommerceAddStoreToMailchimpAccount200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EcommerceAddStoreToMailchimpAccount200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<EcommerceAddStoreToMailchimpAccount200Response>() {
           @Override
           public void write(JsonWriter out, EcommerceAddStoreToMailchimpAccount200Response value) throws IOException {
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
           public EcommerceAddStoreToMailchimpAccount200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EcommerceAddStoreToMailchimpAccount200Response instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EcommerceAddStoreToMailchimpAccount200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EcommerceAddStoreToMailchimpAccount200Response
  * @throws IOException if the JSON string is invalid with respect to EcommerceAddStoreToMailchimpAccount200Response
  */
  public static EcommerceAddStoreToMailchimpAccount200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EcommerceAddStoreToMailchimpAccount200Response.class);
  }

 /**
  * Convert an instance of EcommerceAddStoreToMailchimpAccount200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

