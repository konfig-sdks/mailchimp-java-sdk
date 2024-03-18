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
import com.konfigthis.client.model.CampaignDefaultsProperty1;
import com.konfigthis.client.model.ListContactProperty2;
import com.konfigthis.client.model.ResourceLink;
import com.konfigthis.client.model.StatisticsProperty;
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
 * Information about a specific list.
 */
@ApiModel(description = "Information about a specific list.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ListsCreateNewListResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_WEB_ID = "web_id";
  @SerializedName(SERIALIZED_NAME_WEB_ID)
  private Integer webId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CONTACT = "contact";
  @SerializedName(SERIALIZED_NAME_CONTACT)
  private ListContactProperty2 contact;

  public static final String SERIALIZED_NAME_PERMISSION_REMINDER = "permission_reminder";
  @SerializedName(SERIALIZED_NAME_PERMISSION_REMINDER)
  private String permissionReminder;

  public static final String SERIALIZED_NAME_USE_ARCHIVE_BAR = "use_archive_bar";
  @SerializedName(SERIALIZED_NAME_USE_ARCHIVE_BAR)
  private Boolean useArchiveBar = false;

  public static final String SERIALIZED_NAME_CAMPAIGN_DEFAULTS = "campaign_defaults";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_DEFAULTS)
  private CampaignDefaultsProperty1 campaignDefaults;

  public static final String SERIALIZED_NAME_NOTIFY_ON_SUBSCRIBE = "notify_on_subscribe";
  @SerializedName(SERIALIZED_NAME_NOTIFY_ON_SUBSCRIBE)
  private String notifyOnSubscribe = "false";

  public static final String SERIALIZED_NAME_NOTIFY_ON_UNSUBSCRIBE = "notify_on_unsubscribe";
  @SerializedName(SERIALIZED_NAME_NOTIFY_ON_UNSUBSCRIBE)
  private String notifyOnUnsubscribe = "false";

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_LIST_RATING = "list_rating";
  @SerializedName(SERIALIZED_NAME_LIST_RATING)
  private Integer listRating;

  public static final String SERIALIZED_NAME_EMAIL_TYPE_OPTION = "email_type_option";
  @SerializedName(SERIALIZED_NAME_EMAIL_TYPE_OPTION)
  private Boolean emailTypeOption;

  public static final String SERIALIZED_NAME_SUBSCRIBE_URL_SHORT = "subscribe_url_short";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBE_URL_SHORT)
  private String subscribeUrlShort;

  public static final String SERIALIZED_NAME_SUBSCRIBE_URL_LONG = "subscribe_url_long";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBE_URL_LONG)
  private String subscribeUrlLong;

  public static final String SERIALIZED_NAME_BEAMER_ADDRESS = "beamer_address";
  @SerializedName(SERIALIZED_NAME_BEAMER_ADDRESS)
  private String beamerAddress;

  /**
   * Legacy - visibility settings are no longer used
   */
  @JsonAdapter(VisibilityEnum.Adapter.class)
 public enum VisibilityEnum {
    PUB("pub"),
    
    PRV("prv");

    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VisibilityEnum fromValue(String value) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VisibilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VisibilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VisibilityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VisibilityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private VisibilityEnum visibility;

  public static final String SERIALIZED_NAME_DOUBLE_OPTIN = "double_optin";
  @SerializedName(SERIALIZED_NAME_DOUBLE_OPTIN)
  private Boolean doubleOptin = false;

  public static final String SERIALIZED_NAME_HAS_WELCOME = "has_welcome";
  @SerializedName(SERIALIZED_NAME_HAS_WELCOME)
  private Boolean hasWelcome = false;

  public static final String SERIALIZED_NAME_MARKETING_PERMISSIONS = "marketing_permissions";
  @SerializedName(SERIALIZED_NAME_MARKETING_PERMISSIONS)
  private Boolean marketingPermissions = false;

  public static final String SERIALIZED_NAME_MODULES = "modules";
  @SerializedName(SERIALIZED_NAME_MODULES)
  private List<String> modules = null;

  public static final String SERIALIZED_NAME_STATS = "stats";
  @SerializedName(SERIALIZED_NAME_STATS)
  private StatisticsProperty stats;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<ResourceLink> links = null;

  public ListsCreateNewListResponse() {
  }

  
  public ListsCreateNewListResponse(
     String id, 
     Integer webId, 
     OffsetDateTime dateCreated, 
     Integer listRating, 
     String subscribeUrlShort, 
     String subscribeUrlLong, 
     String beamerAddress, 
     List<String> modules, 
     List<ResourceLink> links
  ) {
    this();
    this.id = id;
    this.webId = webId;
    this.dateCreated = dateCreated;
    this.listRating = listRating;
    this.subscribeUrlShort = subscribeUrlShort;
    this.subscribeUrlLong = subscribeUrlLong;
    this.beamerAddress = beamerAddress;
    this.modules = modules;
    this.links = links;
  }

   /**
   * A string that uniquely identifies this list.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A string that uniquely identifies this list.")

  public String getId() {
    return id;
  }




   /**
   * The ID used in the Mailchimp web application. View this list in your Mailchimp account at &#x60;https://{dc}.admin.mailchimp.com/lists/members/?id&#x3D;{web_id}&#x60;.
   * @return webId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID used in the Mailchimp web application. View this list in your Mailchimp account at `https://{dc}.admin.mailchimp.com/lists/members/?id={web_id}`.")

  public Integer getWebId() {
    return webId;
  }




  public ListsCreateNewListResponse name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the list.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the list.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public ListsCreateNewListResponse contact(ListContactProperty2 contact) {
    
    
    
    
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ListContactProperty2 getContact() {
    return contact;
  }


  public void setContact(ListContactProperty2 contact) {
    
    
    
    this.contact = contact;
  }


  public ListsCreateNewListResponse permissionReminder(String permissionReminder) {
    
    
    
    
    this.permissionReminder = permissionReminder;
    return this;
  }

   /**
   * The [permission reminder](https://mailchimp.com/help/edit-the-permission-reminder/) for the list.
   * @return permissionReminder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The [permission reminder](https://mailchimp.com/help/edit-the-permission-reminder/) for the list.")

  public String getPermissionReminder() {
    return permissionReminder;
  }


  public void setPermissionReminder(String permissionReminder) {
    
    
    
    this.permissionReminder = permissionReminder;
  }


  public ListsCreateNewListResponse useArchiveBar(Boolean useArchiveBar) {
    
    
    
    
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


  public ListsCreateNewListResponse campaignDefaults(CampaignDefaultsProperty1 campaignDefaults) {
    
    
    
    
    this.campaignDefaults = campaignDefaults;
    return this;
  }

   /**
   * Get campaignDefaults
   * @return campaignDefaults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CampaignDefaultsProperty1 getCampaignDefaults() {
    return campaignDefaults;
  }


  public void setCampaignDefaults(CampaignDefaultsProperty1 campaignDefaults) {
    
    
    
    this.campaignDefaults = campaignDefaults;
  }


  public ListsCreateNewListResponse notifyOnSubscribe(String notifyOnSubscribe) {
    
    
    
    
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


  public ListsCreateNewListResponse notifyOnUnsubscribe(String notifyOnUnsubscribe) {
    
    
    
    
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


   /**
   * The date and time that this list was created in ISO 8601 format.
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time that this list was created in ISO 8601 format.")

  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }




   /**
   * An auto-generated activity score for the list (0-5).
   * @return listRating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An auto-generated activity score for the list (0-5).")

  public Integer getListRating() {
    return listRating;
  }




  public ListsCreateNewListResponse emailTypeOption(Boolean emailTypeOption) {
    
    
    
    
    this.emailTypeOption = emailTypeOption;
    return this;
  }

   /**
   * Whether the list supports [multiple formats for emails](https://mailchimp.com/help/change-audience-name-defaults/). When set to &#x60;true&#x60;, subscribers can choose whether they want to receive HTML or plain-text emails. When set to &#x60;false&#x60;, subscribers will receive HTML emails, with a plain-text alternative backup.
   * @return emailTypeOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the list supports [multiple formats for emails](https://mailchimp.com/help/change-audience-name-defaults/). When set to `true`, subscribers can choose whether they want to receive HTML or plain-text emails. When set to `false`, subscribers will receive HTML emails, with a plain-text alternative backup.")

  public Boolean getEmailTypeOption() {
    return emailTypeOption;
  }


  public void setEmailTypeOption(Boolean emailTypeOption) {
    
    
    
    this.emailTypeOption = emailTypeOption;
  }


   /**
   * Our [url shortened](https://mailchimp.com/help/share-your-signup-form/) version of this list&#39;s subscribe form.
   * @return subscribeUrlShort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Our [url shortened](https://mailchimp.com/help/share-your-signup-form/) version of this list's subscribe form.")

  public String getSubscribeUrlShort() {
    return subscribeUrlShort;
  }




   /**
   * The full version of this list&#39;s subscribe form (host will vary).
   * @return subscribeUrlLong
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The full version of this list's subscribe form (host will vary).")

  public String getSubscribeUrlLong() {
    return subscribeUrlLong;
  }




   /**
   * The list&#39;s [Email Beamer](https://mailchimp.com/help/use-email-beamer-to-create-a-campaign/) address.
   * @return beamerAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list's [Email Beamer](https://mailchimp.com/help/use-email-beamer-to-create-a-campaign/) address.")

  public String getBeamerAddress() {
    return beamerAddress;
  }




  public ListsCreateNewListResponse visibility(VisibilityEnum visibility) {
    
    
    
    
    this.visibility = visibility;
    return this;
  }

   /**
   * Legacy - visibility settings are no longer used
   * @return visibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Legacy - visibility settings are no longer used")

  public VisibilityEnum getVisibility() {
    return visibility;
  }


  public void setVisibility(VisibilityEnum visibility) {
    
    
    
    this.visibility = visibility;
  }


  public ListsCreateNewListResponse doubleOptin(Boolean doubleOptin) {
    
    
    
    
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


  public ListsCreateNewListResponse hasWelcome(Boolean hasWelcome) {
    
    
    
    
    this.hasWelcome = hasWelcome;
    return this;
  }

   /**
   * Whether or not this list has a welcome automation connected. Welcome Automations: welcomeSeries, singleWelcome, emailFollowup.
   * @return hasWelcome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether or not this list has a welcome automation connected. Welcome Automations: welcomeSeries, singleWelcome, emailFollowup.")

  public Boolean getHasWelcome() {
    return hasWelcome;
  }


  public void setHasWelcome(Boolean hasWelcome) {
    
    
    
    this.hasWelcome = hasWelcome;
  }


  public ListsCreateNewListResponse marketingPermissions(Boolean marketingPermissions) {
    
    
    
    
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
   * Any list-specific modules installed for this list.
   * @return modules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Any list-specific modules installed for this list.")

  public List<String> getModules() {
    return modules;
  }




  public ListsCreateNewListResponse stats(StatisticsProperty stats) {
    
    
    
    
    this.stats = stats;
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatisticsProperty getStats() {
    return stats;
  }


  public void setStats(StatisticsProperty stats) {
    
    
    
    this.stats = stats;
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
   * @return the ListsCreateNewListResponse instance itself
   */
  public ListsCreateNewListResponse putAdditionalProperty(String key, Object value) {
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
    ListsCreateNewListResponse listsCreateNewListResponse = (ListsCreateNewListResponse) o;
    return Objects.equals(this.id, listsCreateNewListResponse.id) &&
        Objects.equals(this.webId, listsCreateNewListResponse.webId) &&
        Objects.equals(this.name, listsCreateNewListResponse.name) &&
        Objects.equals(this.contact, listsCreateNewListResponse.contact) &&
        Objects.equals(this.permissionReminder, listsCreateNewListResponse.permissionReminder) &&
        Objects.equals(this.useArchiveBar, listsCreateNewListResponse.useArchiveBar) &&
        Objects.equals(this.campaignDefaults, listsCreateNewListResponse.campaignDefaults) &&
        Objects.equals(this.notifyOnSubscribe, listsCreateNewListResponse.notifyOnSubscribe) &&
        Objects.equals(this.notifyOnUnsubscribe, listsCreateNewListResponse.notifyOnUnsubscribe) &&
        Objects.equals(this.dateCreated, listsCreateNewListResponse.dateCreated) &&
        Objects.equals(this.listRating, listsCreateNewListResponse.listRating) &&
        Objects.equals(this.emailTypeOption, listsCreateNewListResponse.emailTypeOption) &&
        Objects.equals(this.subscribeUrlShort, listsCreateNewListResponse.subscribeUrlShort) &&
        Objects.equals(this.subscribeUrlLong, listsCreateNewListResponse.subscribeUrlLong) &&
        Objects.equals(this.beamerAddress, listsCreateNewListResponse.beamerAddress) &&
        Objects.equals(this.visibility, listsCreateNewListResponse.visibility) &&
        Objects.equals(this.doubleOptin, listsCreateNewListResponse.doubleOptin) &&
        Objects.equals(this.hasWelcome, listsCreateNewListResponse.hasWelcome) &&
        Objects.equals(this.marketingPermissions, listsCreateNewListResponse.marketingPermissions) &&
        Objects.equals(this.modules, listsCreateNewListResponse.modules) &&
        Objects.equals(this.stats, listsCreateNewListResponse.stats) &&
        Objects.equals(this.links, listsCreateNewListResponse.links)&&
        Objects.equals(this.additionalProperties, listsCreateNewListResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, webId, name, contact, permissionReminder, useArchiveBar, campaignDefaults, notifyOnSubscribe, notifyOnUnsubscribe, dateCreated, listRating, emailTypeOption, subscribeUrlShort, subscribeUrlLong, beamerAddress, visibility, doubleOptin, hasWelcome, marketingPermissions, modules, stats, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListsCreateNewListResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    webId: ").append(toIndentedString(webId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    permissionReminder: ").append(toIndentedString(permissionReminder)).append("\n");
    sb.append("    useArchiveBar: ").append(toIndentedString(useArchiveBar)).append("\n");
    sb.append("    campaignDefaults: ").append(toIndentedString(campaignDefaults)).append("\n");
    sb.append("    notifyOnSubscribe: ").append(toIndentedString(notifyOnSubscribe)).append("\n");
    sb.append("    notifyOnUnsubscribe: ").append(toIndentedString(notifyOnUnsubscribe)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    listRating: ").append(toIndentedString(listRating)).append("\n");
    sb.append("    emailTypeOption: ").append(toIndentedString(emailTypeOption)).append("\n");
    sb.append("    subscribeUrlShort: ").append(toIndentedString(subscribeUrlShort)).append("\n");
    sb.append("    subscribeUrlLong: ").append(toIndentedString(subscribeUrlLong)).append("\n");
    sb.append("    beamerAddress: ").append(toIndentedString(beamerAddress)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    doubleOptin: ").append(toIndentedString(doubleOptin)).append("\n");
    sb.append("    hasWelcome: ").append(toIndentedString(hasWelcome)).append("\n");
    sb.append("    marketingPermissions: ").append(toIndentedString(marketingPermissions)).append("\n");
    sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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
    openapiFields.add("web_id");
    openapiFields.add("name");
    openapiFields.add("contact");
    openapiFields.add("permission_reminder");
    openapiFields.add("use_archive_bar");
    openapiFields.add("campaign_defaults");
    openapiFields.add("notify_on_subscribe");
    openapiFields.add("notify_on_unsubscribe");
    openapiFields.add("date_created");
    openapiFields.add("list_rating");
    openapiFields.add("email_type_option");
    openapiFields.add("subscribe_url_short");
    openapiFields.add("subscribe_url_long");
    openapiFields.add("beamer_address");
    openapiFields.add("visibility");
    openapiFields.add("double_optin");
    openapiFields.add("has_welcome");
    openapiFields.add("marketing_permissions");
    openapiFields.add("modules");
    openapiFields.add("stats");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListsCreateNewListResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListsCreateNewListResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListsCreateNewListResponse is not found in the empty JSON string", ListsCreateNewListResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `contact`
      if (jsonObj.get("contact") != null && !jsonObj.get("contact").isJsonNull()) {
        ListContactProperty2.validateJsonObject(jsonObj.getAsJsonObject("contact"));
      }
      if ((jsonObj.get("permission_reminder") != null && !jsonObj.get("permission_reminder").isJsonNull()) && !jsonObj.get("permission_reminder").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `permission_reminder` to be a primitive type in the JSON string but got `%s`", jsonObj.get("permission_reminder").toString()));
      }
      // validate the optional field `campaign_defaults`
      if (jsonObj.get("campaign_defaults") != null && !jsonObj.get("campaign_defaults").isJsonNull()) {
        CampaignDefaultsProperty1.validateJsonObject(jsonObj.getAsJsonObject("campaign_defaults"));
      }
      if ((jsonObj.get("notify_on_subscribe") != null && !jsonObj.get("notify_on_subscribe").isJsonNull()) && !jsonObj.get("notify_on_subscribe").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notify_on_subscribe` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notify_on_subscribe").toString()));
      }
      if ((jsonObj.get("notify_on_unsubscribe") != null && !jsonObj.get("notify_on_unsubscribe").isJsonNull()) && !jsonObj.get("notify_on_unsubscribe").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notify_on_unsubscribe` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notify_on_unsubscribe").toString()));
      }
      if ((jsonObj.get("subscribe_url_short") != null && !jsonObj.get("subscribe_url_short").isJsonNull()) && !jsonObj.get("subscribe_url_short").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscribe_url_short` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscribe_url_short").toString()));
      }
      if ((jsonObj.get("subscribe_url_long") != null && !jsonObj.get("subscribe_url_long").isJsonNull()) && !jsonObj.get("subscribe_url_long").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscribe_url_long` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscribe_url_long").toString()));
      }
      if ((jsonObj.get("beamer_address") != null && !jsonObj.get("beamer_address").isJsonNull()) && !jsonObj.get("beamer_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beamer_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beamer_address").toString()));
      }
      if ((jsonObj.get("visibility") != null && !jsonObj.get("visibility").isJsonNull()) && !jsonObj.get("visibility").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visibility").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("modules") != null && !jsonObj.get("modules").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `modules` to be an array in the JSON string but got `%s`", jsonObj.get("modules").toString()));
      }
      // validate the optional field `stats`
      if (jsonObj.get("stats") != null && !jsonObj.get("stats").isJsonNull()) {
        StatisticsProperty.validateJsonObject(jsonObj.getAsJsonObject("stats"));
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
       if (!ListsCreateNewListResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListsCreateNewListResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListsCreateNewListResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListsCreateNewListResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListsCreateNewListResponse>() {
           @Override
           public void write(JsonWriter out, ListsCreateNewListResponse value) throws IOException {
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
           public ListsCreateNewListResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ListsCreateNewListResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ListsCreateNewListResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListsCreateNewListResponse
  * @throws IOException if the JSON string is invalid with respect to ListsCreateNewListResponse
  */
  public static ListsCreateNewListResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListsCreateNewListResponse.class);
  }

 /**
  * Convert an instance of ListsCreateNewListResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

