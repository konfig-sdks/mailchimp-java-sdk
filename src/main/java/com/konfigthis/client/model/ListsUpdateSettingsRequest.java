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
import com.konfigthis.client.model.CampaignDefaultsProperty;
import com.konfigthis.client.model.ListContactProperty1;
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
 * Information about a specific list.
 */
@ApiModel(description = "Information about a specific list.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ListsUpdateSettingsRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CONTACT = "contact";
  @SerializedName(SERIALIZED_NAME_CONTACT)
  private ListContactProperty1 contact;

  public static final String SERIALIZED_NAME_PERMISSION_REMINDER = "permission_reminder";
  @SerializedName(SERIALIZED_NAME_PERMISSION_REMINDER)
  private String permissionReminder;

  public static final String SERIALIZED_NAME_USE_ARCHIVE_BAR = "use_archive_bar";
  @SerializedName(SERIALIZED_NAME_USE_ARCHIVE_BAR)
  private Boolean useArchiveBar = false;

  public static final String SERIALIZED_NAME_CAMPAIGN_DEFAULTS = "campaign_defaults";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_DEFAULTS)
  private CampaignDefaultsProperty campaignDefaults;

  public static final String SERIALIZED_NAME_NOTIFY_ON_SUBSCRIBE = "notify_on_subscribe";
  @SerializedName(SERIALIZED_NAME_NOTIFY_ON_SUBSCRIBE)
  private String notifyOnSubscribe = "false";

  public static final String SERIALIZED_NAME_NOTIFY_ON_UNSUBSCRIBE = "notify_on_unsubscribe";
  @SerializedName(SERIALIZED_NAME_NOTIFY_ON_UNSUBSCRIBE)
  private String notifyOnUnsubscribe = "false";

  public static final String SERIALIZED_NAME_EMAIL_TYPE_OPTION = "email_type_option";
  @SerializedName(SERIALIZED_NAME_EMAIL_TYPE_OPTION)
  private Boolean emailTypeOption;

  public static final String SERIALIZED_NAME_DOUBLE_OPTIN = "double_optin";
  @SerializedName(SERIALIZED_NAME_DOUBLE_OPTIN)
  private Boolean doubleOptin = false;

  public static final String SERIALIZED_NAME_MARKETING_PERMISSIONS = "marketing_permissions";
  @SerializedName(SERIALIZED_NAME_MARKETING_PERMISSIONS)
  private Boolean marketingPermissions = false;

  public ListsUpdateSettingsRequest() {
  }

  public ListsUpdateSettingsRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the list.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the list.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public ListsUpdateSettingsRequest contact(ListContactProperty1 contact) {
    
    
    
    
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ListContactProperty1 getContact() {
    return contact;
  }


  public void setContact(ListContactProperty1 contact) {
    
    
    
    this.contact = contact;
  }


  public ListsUpdateSettingsRequest permissionReminder(String permissionReminder) {
    
    
    
    
    this.permissionReminder = permissionReminder;
    return this;
  }

   /**
   * The [permission reminder](https://mailchimp.com/help/edit-the-permission-reminder/) for the list.
   * @return permissionReminder
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The [permission reminder](https://mailchimp.com/help/edit-the-permission-reminder/) for the list.")

  public String getPermissionReminder() {
    return permissionReminder;
  }


  public void setPermissionReminder(String permissionReminder) {
    
    
    
    this.permissionReminder = permissionReminder;
  }


  public ListsUpdateSettingsRequest useArchiveBar(Boolean useArchiveBar) {
    
    
    
    
    this.useArchiveBar = useArchiveBar;
    return this;
  }

   /**
   * Whether campaigns for this list use the [Archive Bar](https://mailchimp.com/help/about-email-campaign-archives-and-pages/) in archives by default.
   * @return useArchiveBar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether campaigns for this list use the [Archive Bar](https://mailchimp.com/help/about-email-campaign-archives-and-pages/) in archives by default.")

  public Boolean getUseArchiveBar() {
    return useArchiveBar;
  }


  public void setUseArchiveBar(Boolean useArchiveBar) {
    
    
    
    this.useArchiveBar = useArchiveBar;
  }


  public ListsUpdateSettingsRequest campaignDefaults(CampaignDefaultsProperty campaignDefaults) {
    
    
    
    
    this.campaignDefaults = campaignDefaults;
    return this;
  }

   /**
   * Get campaignDefaults
   * @return campaignDefaults
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CampaignDefaultsProperty getCampaignDefaults() {
    return campaignDefaults;
  }


  public void setCampaignDefaults(CampaignDefaultsProperty campaignDefaults) {
    
    
    
    this.campaignDefaults = campaignDefaults;
  }


  public ListsUpdateSettingsRequest notifyOnSubscribe(String notifyOnSubscribe) {
    
    
    
    
    this.notifyOnSubscribe = notifyOnSubscribe;
    return this;
  }

   /**
   * The email address to send [subscribe notifications](https://mailchimp.com/help/change-subscribe-and-unsubscribe-notifications/) to.
   * @return notifyOnSubscribe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "The email address to send [subscribe notifications](https://mailchimp.com/help/change-subscribe-and-unsubscribe-notifications/) to.")

  public String getNotifyOnSubscribe() {
    return notifyOnSubscribe;
  }


  public void setNotifyOnSubscribe(String notifyOnSubscribe) {
    
    
    
    this.notifyOnSubscribe = notifyOnSubscribe;
  }


  public ListsUpdateSettingsRequest notifyOnUnsubscribe(String notifyOnUnsubscribe) {
    
    
    
    
    this.notifyOnUnsubscribe = notifyOnUnsubscribe;
    return this;
  }

   /**
   * The email address to send [unsubscribe notifications](https://mailchimp.com/help/change-subscribe-and-unsubscribe-notifications/) to.
   * @return notifyOnUnsubscribe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "The email address to send [unsubscribe notifications](https://mailchimp.com/help/change-subscribe-and-unsubscribe-notifications/) to.")

  public String getNotifyOnUnsubscribe() {
    return notifyOnUnsubscribe;
  }


  public void setNotifyOnUnsubscribe(String notifyOnUnsubscribe) {
    
    
    
    this.notifyOnUnsubscribe = notifyOnUnsubscribe;
  }


  public ListsUpdateSettingsRequest emailTypeOption(Boolean emailTypeOption) {
    
    
    
    
    this.emailTypeOption = emailTypeOption;
    return this;
  }

   /**
   * Whether the list supports [multiple formats for emails](https://mailchimp.com/help/change-audience-name-defaults/). When set to &#x60;true&#x60;, subscribers can choose whether they want to receive HTML or plain-text emails. When set to &#x60;false&#x60;, subscribers will receive HTML emails, with a plain-text alternative backup.
   * @return emailTypeOption
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether the list supports [multiple formats for emails](https://mailchimp.com/help/change-audience-name-defaults/). When set to `true`, subscribers can choose whether they want to receive HTML or plain-text emails. When set to `false`, subscribers will receive HTML emails, with a plain-text alternative backup.")

  public Boolean getEmailTypeOption() {
    return emailTypeOption;
  }


  public void setEmailTypeOption(Boolean emailTypeOption) {
    
    
    
    this.emailTypeOption = emailTypeOption;
  }


  public ListsUpdateSettingsRequest doubleOptin(Boolean doubleOptin) {
    
    
    
    
    this.doubleOptin = doubleOptin;
    return this;
  }

   /**
   * Whether or not to require the subscriber to confirm subscription via email.
   * @return doubleOptin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether or not to require the subscriber to confirm subscription via email.")

  public Boolean getDoubleOptin() {
    return doubleOptin;
  }


  public void setDoubleOptin(Boolean doubleOptin) {
    
    
    
    this.doubleOptin = doubleOptin;
  }


  public ListsUpdateSettingsRequest marketingPermissions(Boolean marketingPermissions) {
    
    
    
    
    this.marketingPermissions = marketingPermissions;
    return this;
  }

   /**
   * Whether or not the list has marketing permissions (eg. GDPR) enabled.
   * @return marketingPermissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether or not the list has marketing permissions (eg. GDPR) enabled.")

  public Boolean getMarketingPermissions() {
    return marketingPermissions;
  }


  public void setMarketingPermissions(Boolean marketingPermissions) {
    
    
    
    this.marketingPermissions = marketingPermissions;
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
   * @return the ListsUpdateSettingsRequest instance itself
   */
  public ListsUpdateSettingsRequest putAdditionalProperty(String key, Object value) {
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
    ListsUpdateSettingsRequest listsUpdateSettingsRequest = (ListsUpdateSettingsRequest) o;
    return Objects.equals(this.name, listsUpdateSettingsRequest.name) &&
        Objects.equals(this.contact, listsUpdateSettingsRequest.contact) &&
        Objects.equals(this.permissionReminder, listsUpdateSettingsRequest.permissionReminder) &&
        Objects.equals(this.useArchiveBar, listsUpdateSettingsRequest.useArchiveBar) &&
        Objects.equals(this.campaignDefaults, listsUpdateSettingsRequest.campaignDefaults) &&
        Objects.equals(this.notifyOnSubscribe, listsUpdateSettingsRequest.notifyOnSubscribe) &&
        Objects.equals(this.notifyOnUnsubscribe, listsUpdateSettingsRequest.notifyOnUnsubscribe) &&
        Objects.equals(this.emailTypeOption, listsUpdateSettingsRequest.emailTypeOption) &&
        Objects.equals(this.doubleOptin, listsUpdateSettingsRequest.doubleOptin) &&
        Objects.equals(this.marketingPermissions, listsUpdateSettingsRequest.marketingPermissions)&&
        Objects.equals(this.additionalProperties, listsUpdateSettingsRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, contact, permissionReminder, useArchiveBar, campaignDefaults, notifyOnSubscribe, notifyOnUnsubscribe, emailTypeOption, doubleOptin, marketingPermissions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListsUpdateSettingsRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    permissionReminder: ").append(toIndentedString(permissionReminder)).append("\n");
    sb.append("    useArchiveBar: ").append(toIndentedString(useArchiveBar)).append("\n");
    sb.append("    campaignDefaults: ").append(toIndentedString(campaignDefaults)).append("\n");
    sb.append("    notifyOnSubscribe: ").append(toIndentedString(notifyOnSubscribe)).append("\n");
    sb.append("    notifyOnUnsubscribe: ").append(toIndentedString(notifyOnUnsubscribe)).append("\n");
    sb.append("    emailTypeOption: ").append(toIndentedString(emailTypeOption)).append("\n");
    sb.append("    doubleOptin: ").append(toIndentedString(doubleOptin)).append("\n");
    sb.append("    marketingPermissions: ").append(toIndentedString(marketingPermissions)).append("\n");
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
    openapiFields.add("contact");
    openapiFields.add("permission_reminder");
    openapiFields.add("use_archive_bar");
    openapiFields.add("campaign_defaults");
    openapiFields.add("notify_on_subscribe");
    openapiFields.add("notify_on_unsubscribe");
    openapiFields.add("email_type_option");
    openapiFields.add("double_optin");
    openapiFields.add("marketing_permissions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("contact");
    openapiRequiredFields.add("permission_reminder");
    openapiRequiredFields.add("campaign_defaults");
    openapiRequiredFields.add("email_type_option");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListsUpdateSettingsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListsUpdateSettingsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListsUpdateSettingsRequest is not found in the empty JSON string", ListsUpdateSettingsRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListsUpdateSettingsRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `contact`
      ListContactProperty1.validateJsonObject(jsonObj.getAsJsonObject("contact"));
      if (!jsonObj.get("permission_reminder").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `permission_reminder` to be a primitive type in the JSON string but got `%s`", jsonObj.get("permission_reminder").toString()));
      }
      // validate the required field `campaign_defaults`
      CampaignDefaultsProperty.validateJsonObject(jsonObj.getAsJsonObject("campaign_defaults"));
      if ((jsonObj.get("notify_on_subscribe") != null && !jsonObj.get("notify_on_subscribe").isJsonNull()) && !jsonObj.get("notify_on_subscribe").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notify_on_subscribe` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notify_on_subscribe").toString()));
      }
      if ((jsonObj.get("notify_on_unsubscribe") != null && !jsonObj.get("notify_on_unsubscribe").isJsonNull()) && !jsonObj.get("notify_on_unsubscribe").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notify_on_unsubscribe` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notify_on_unsubscribe").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListsUpdateSettingsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListsUpdateSettingsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListsUpdateSettingsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListsUpdateSettingsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ListsUpdateSettingsRequest>() {
           @Override
           public void write(JsonWriter out, ListsUpdateSettingsRequest value) throws IOException {
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
           public ListsUpdateSettingsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ListsUpdateSettingsRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ListsUpdateSettingsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListsUpdateSettingsRequest
  * @throws IOException if the JSON string is invalid with respect to ListsUpdateSettingsRequest
  */
  public static ListsUpdateSettingsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListsUpdateSettingsRequest.class);
  }

 /**
  * Convert an instance of ListsUpdateSettingsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
