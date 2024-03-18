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
import com.konfigthis.client.model.LocationProperty1;
import com.konfigthis.client.model.NotesProperty;
import com.konfigthis.client.model.ResourceLink;
import com.konfigthis.client.model.SubscriberStatsProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * Individuals who are currently or have been previously subscribed to this list, including members who have bounced or unsubscribed.
 */
@ApiModel(description = "Individuals who are currently or have been previously subscribed to this list, including members who have bounced or unsubscribed.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ListsAddMemberToSegment200Response {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_UNIQUE_EMAIL_ID = "unique_email_id";
  @SerializedName(SERIALIZED_NAME_UNIQUE_EMAIL_ID)
  private String uniqueEmailId;

  public static final String SERIALIZED_NAME_EMAIL_TYPE = "email_type";
  @SerializedName(SERIALIZED_NAME_EMAIL_TYPE)
  private String emailType;

  /**
   * Subscriber&#39;s current status.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    SUBSCRIBED("subscribed"),
    
    UNSUBSCRIBED("unsubscribed"),
    
    CLEANED("cleaned"),
    
    PENDING("pending"),
    
    TRANSACTIONAL("transactional");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_MERGE_FIELDS = "merge_fields";
  @SerializedName(SERIALIZED_NAME_MERGE_FIELDS)
  private Map<String, Object> mergeFields = null;

  public static final String SERIALIZED_NAME_INTERESTS = "interests";
  @SerializedName(SERIALIZED_NAME_INTERESTS)
  private Map<String, Boolean> interests = null;

  public static final String SERIALIZED_NAME_STATS = "stats";
  @SerializedName(SERIALIZED_NAME_STATS)
  private SubscriberStatsProperty stats;

  public static final String SERIALIZED_NAME_IP_SIGNUP = "ip_signup";
  @SerializedName(SERIALIZED_NAME_IP_SIGNUP)
  private String ipSignup;

  public static final String SERIALIZED_NAME_TIMESTAMP_SIGNUP = "timestamp_signup";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP_SIGNUP)
  private OffsetDateTime timestampSignup;

  public static final String SERIALIZED_NAME_IP_OPT = "ip_opt";
  @SerializedName(SERIALIZED_NAME_IP_OPT)
  private String ipOpt;

  public static final String SERIALIZED_NAME_TIMESTAMP_OPT = "timestamp_opt";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP_OPT)
  private OffsetDateTime timestampOpt;

  public static final String SERIALIZED_NAME_MEMBER_RATING = "member_rating";
  @SerializedName(SERIALIZED_NAME_MEMBER_RATING)
  private Integer memberRating;

  public static final String SERIALIZED_NAME_LAST_CHANGED = "last_changed";
  @SerializedName(SERIALIZED_NAME_LAST_CHANGED)
  private OffsetDateTime lastChanged;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_VIP = "vip";
  @SerializedName(SERIALIZED_NAME_VIP)
  private Boolean vip;

  public static final String SERIALIZED_NAME_EMAIL_CLIENT = "email_client";
  @SerializedName(SERIALIZED_NAME_EMAIL_CLIENT)
  private String emailClient;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private LocationProperty1 location;

  public static final String SERIALIZED_NAME_LAST_NOTE = "last_note";
  @SerializedName(SERIALIZED_NAME_LAST_NOTE)
  private NotesProperty lastNote;

  public static final String SERIALIZED_NAME_LIST_ID = "list_id";
  @SerializedName(SERIALIZED_NAME_LIST_ID)
  private String listId;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<ResourceLink> links = null;

  public ListsAddMemberToSegment200Response() {
  }

  
  public ListsAddMemberToSegment200Response(
     String id, 
     String emailAddress, 
     String uniqueEmailId, 
     String ipSignup, 
     OffsetDateTime timestampSignup, 
     String ipOpt, 
     OffsetDateTime timestampOpt, 
     Integer memberRating, 
     OffsetDateTime lastChanged, 
     String emailClient, 
     String listId, 
     List<ResourceLink> links
  ) {
    this();
    this.id = id;
    this.emailAddress = emailAddress;
    this.uniqueEmailId = uniqueEmailId;
    this.ipSignup = ipSignup;
    this.timestampSignup = timestampSignup;
    this.ipOpt = ipOpt;
    this.timestampOpt = timestampOpt;
    this.memberRating = memberRating;
    this.lastChanged = lastChanged;
    this.emailClient = emailClient;
    this.listId = listId;
    this.links = links;
  }

   /**
   * The MD5 hash of the lowercase version of the list member&#39;s email address.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The MD5 hash of the lowercase version of the list member's email address.")

  public String getId() {
    return id;
  }




   /**
   * Email address for a subscriber.
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email address for a subscriber.")

  public String getEmailAddress() {
    return emailAddress;
  }




   /**
   * An identifier for the address across all of Mailchimp.
   * @return uniqueEmailId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An identifier for the address across all of Mailchimp.")

  public String getUniqueEmailId() {
    return uniqueEmailId;
  }




  public ListsAddMemberToSegment200Response emailType(String emailType) {
    
    
    
    
    this.emailType = emailType;
    return this;
  }

   /**
   * Type of email this member asked to get (&#39;html&#39; or &#39;text&#39;).
   * @return emailType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of email this member asked to get ('html' or 'text').")

  public String getEmailType() {
    return emailType;
  }


  public void setEmailType(String emailType) {
    
    
    
    this.emailType = emailType;
  }


  public ListsAddMemberToSegment200Response status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Subscriber&#39;s current status.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subscriber's current status.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public ListsAddMemberToSegment200Response mergeFields(Map<String, Object> mergeFields) {
    
    
    
    
    this.mergeFields = mergeFields;
    return this;
  }

  public ListsAddMemberToSegment200Response putMergeFieldsItem(String key, Object mergeFieldsItem) {
    if (this.mergeFields == null) {
      this.mergeFields = new HashMap<>();
    }
    this.mergeFields.put(key, mergeFieldsItem);
    return this;
  }

   /**
   * A dictionary of merge fields where the keys are the merge tags. See the [Merge Fields documentation](https://mailchimp.com/developer/marketing/docs/merge-fields/#structure) for more about the structure.
   * @return mergeFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A dictionary of merge fields where the keys are the merge tags. See the [Merge Fields documentation](https://mailchimp.com/developer/marketing/docs/merge-fields/#structure) for more about the structure.")

  public Map<String, Object> getMergeFields() {
    return mergeFields;
  }


  public void setMergeFields(Map<String, Object> mergeFields) {
    
    
    
    this.mergeFields = mergeFields;
  }


  public ListsAddMemberToSegment200Response interests(Map<String, Boolean> interests) {
    
    
    
    
    this.interests = interests;
    return this;
  }

  public ListsAddMemberToSegment200Response putInterestsItem(String key, Boolean interestsItem) {
    if (this.interests == null) {
      this.interests = new HashMap<>();
    }
    this.interests.put(key, interestsItem);
    return this;
  }

   /**
   * The key of this object&#39;s properties is the ID of the interest in question.
   * @return interests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of this object's properties is the ID of the interest in question.")

  public Map<String, Boolean> getInterests() {
    return interests;
  }


  public void setInterests(Map<String, Boolean> interests) {
    
    
    
    this.interests = interests;
  }


  public ListsAddMemberToSegment200Response stats(SubscriberStatsProperty stats) {
    
    
    
    
    this.stats = stats;
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubscriberStatsProperty getStats() {
    return stats;
  }


  public void setStats(SubscriberStatsProperty stats) {
    
    
    
    this.stats = stats;
  }


   /**
   * IP address the subscriber signed up from.
   * @return ipSignup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IP address the subscriber signed up from.")

  public String getIpSignup() {
    return ipSignup;
  }




   /**
   * The date and time the subscriber signed up for the list in ISO 8601 format.
   * @return timestampSignup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the subscriber signed up for the list in ISO 8601 format.")

  public OffsetDateTime getTimestampSignup() {
    return timestampSignup;
  }




   /**
   * The IP address the subscriber used to confirm their opt-in status.
   * @return ipOpt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IP address the subscriber used to confirm their opt-in status.")

  public String getIpOpt() {
    return ipOpt;
  }




   /**
   * The date and time the subscriber confirmed their opt-in status in ISO 8601 format.
   * @return timestampOpt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the subscriber confirmed their opt-in status in ISO 8601 format.")

  public OffsetDateTime getTimestampOpt() {
    return timestampOpt;
  }




   /**
   * Star rating for this member, between 1 and 5.
   * @return memberRating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Star rating for this member, between 1 and 5.")

  public Integer getMemberRating() {
    return memberRating;
  }




   /**
   * The date and time the member&#39;s info was last changed in ISO 8601 format.
   * @return lastChanged
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the member's info was last changed in ISO 8601 format.")

  public OffsetDateTime getLastChanged() {
    return lastChanged;
  }




  public ListsAddMemberToSegment200Response language(String language) {
    
    
    
    
    this.language = language;
    return this;
  }

   /**
   * If set/detected, the [subscriber&#39;s language](https://mailchimp.com/help/view-and-edit-contact-languages/).
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set/detected, the [subscriber's language](https://mailchimp.com/help/view-and-edit-contact-languages/).")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    
    
    
    this.language = language;
  }


  public ListsAddMemberToSegment200Response vip(Boolean vip) {
    
    
    
    
    this.vip = vip;
    return this;
  }

   /**
   * [VIP status](https://mailchimp.com/help/designate-and-send-to-vip-contacts/) for subscriber.
   * @return vip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[VIP status](https://mailchimp.com/help/designate-and-send-to-vip-contacts/) for subscriber.")

  public Boolean getVip() {
    return vip;
  }


  public void setVip(Boolean vip) {
    
    
    
    this.vip = vip;
  }


   /**
   * The list member&#39;s email client.
   * @return emailClient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list member's email client.")

  public String getEmailClient() {
    return emailClient;
  }




  public ListsAddMemberToSegment200Response location(LocationProperty1 location) {
    
    
    
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocationProperty1 getLocation() {
    return location;
  }


  public void setLocation(LocationProperty1 location) {
    
    
    
    this.location = location;
  }


  public ListsAddMemberToSegment200Response lastNote(NotesProperty lastNote) {
    
    
    
    
    this.lastNote = lastNote;
    return this;
  }

   /**
   * Get lastNote
   * @return lastNote
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NotesProperty getLastNote() {
    return lastNote;
  }


  public void setLastNote(NotesProperty lastNote) {
    
    
    
    this.lastNote = lastNote;
  }


   /**
   * The list id.
   * @return listId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list id.")

  public String getListId() {
    return listId;
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
   * @return the ListsAddMemberToSegment200Response instance itself
   */
  public ListsAddMemberToSegment200Response putAdditionalProperty(String key, Object value) {
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
    ListsAddMemberToSegment200Response listsAddMemberToSegment200Response = (ListsAddMemberToSegment200Response) o;
    return Objects.equals(this.id, listsAddMemberToSegment200Response.id) &&
        Objects.equals(this.emailAddress, listsAddMemberToSegment200Response.emailAddress) &&
        Objects.equals(this.uniqueEmailId, listsAddMemberToSegment200Response.uniqueEmailId) &&
        Objects.equals(this.emailType, listsAddMemberToSegment200Response.emailType) &&
        Objects.equals(this.status, listsAddMemberToSegment200Response.status) &&
        Objects.equals(this.mergeFields, listsAddMemberToSegment200Response.mergeFields) &&
        Objects.equals(this.interests, listsAddMemberToSegment200Response.interests) &&
        Objects.equals(this.stats, listsAddMemberToSegment200Response.stats) &&
        Objects.equals(this.ipSignup, listsAddMemberToSegment200Response.ipSignup) &&
        Objects.equals(this.timestampSignup, listsAddMemberToSegment200Response.timestampSignup) &&
        Objects.equals(this.ipOpt, listsAddMemberToSegment200Response.ipOpt) &&
        Objects.equals(this.timestampOpt, listsAddMemberToSegment200Response.timestampOpt) &&
        Objects.equals(this.memberRating, listsAddMemberToSegment200Response.memberRating) &&
        Objects.equals(this.lastChanged, listsAddMemberToSegment200Response.lastChanged) &&
        Objects.equals(this.language, listsAddMemberToSegment200Response.language) &&
        Objects.equals(this.vip, listsAddMemberToSegment200Response.vip) &&
        Objects.equals(this.emailClient, listsAddMemberToSegment200Response.emailClient) &&
        Objects.equals(this.location, listsAddMemberToSegment200Response.location) &&
        Objects.equals(this.lastNote, listsAddMemberToSegment200Response.lastNote) &&
        Objects.equals(this.listId, listsAddMemberToSegment200Response.listId) &&
        Objects.equals(this.links, listsAddMemberToSegment200Response.links)&&
        Objects.equals(this.additionalProperties, listsAddMemberToSegment200Response.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, emailAddress, uniqueEmailId, emailType, status, mergeFields, interests, stats, ipSignup, timestampSignup, ipOpt, timestampOpt, memberRating, lastChanged, language, vip, emailClient, location, lastNote, listId, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListsAddMemberToSegment200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    uniqueEmailId: ").append(toIndentedString(uniqueEmailId)).append("\n");
    sb.append("    emailType: ").append(toIndentedString(emailType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    mergeFields: ").append(toIndentedString(mergeFields)).append("\n");
    sb.append("    interests: ").append(toIndentedString(interests)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    ipSignup: ").append(toIndentedString(ipSignup)).append("\n");
    sb.append("    timestampSignup: ").append(toIndentedString(timestampSignup)).append("\n");
    sb.append("    ipOpt: ").append(toIndentedString(ipOpt)).append("\n");
    sb.append("    timestampOpt: ").append(toIndentedString(timestampOpt)).append("\n");
    sb.append("    memberRating: ").append(toIndentedString(memberRating)).append("\n");
    sb.append("    lastChanged: ").append(toIndentedString(lastChanged)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    vip: ").append(toIndentedString(vip)).append("\n");
    sb.append("    emailClient: ").append(toIndentedString(emailClient)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    lastNote: ").append(toIndentedString(lastNote)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
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
    openapiFields.add("email_address");
    openapiFields.add("unique_email_id");
    openapiFields.add("email_type");
    openapiFields.add("status");
    openapiFields.add("merge_fields");
    openapiFields.add("interests");
    openapiFields.add("stats");
    openapiFields.add("ip_signup");
    openapiFields.add("timestamp_signup");
    openapiFields.add("ip_opt");
    openapiFields.add("timestamp_opt");
    openapiFields.add("member_rating");
    openapiFields.add("last_changed");
    openapiFields.add("language");
    openapiFields.add("vip");
    openapiFields.add("email_client");
    openapiFields.add("location");
    openapiFields.add("last_note");
    openapiFields.add("list_id");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListsAddMemberToSegment200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListsAddMemberToSegment200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListsAddMemberToSegment200Response is not found in the empty JSON string", ListsAddMemberToSegment200Response.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("email_address") != null && !jsonObj.get("email_address").isJsonNull()) && !jsonObj.get("email_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email_address").toString()));
      }
      if ((jsonObj.get("unique_email_id") != null && !jsonObj.get("unique_email_id").isJsonNull()) && !jsonObj.get("unique_email_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unique_email_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unique_email_id").toString()));
      }
      if ((jsonObj.get("email_type") != null && !jsonObj.get("email_type").isJsonNull()) && !jsonObj.get("email_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email_type").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `stats`
      if (jsonObj.get("stats") != null && !jsonObj.get("stats").isJsonNull()) {
        SubscriberStatsProperty.validateJsonObject(jsonObj.getAsJsonObject("stats"));
      }
      if ((jsonObj.get("ip_signup") != null && !jsonObj.get("ip_signup").isJsonNull()) && !jsonObj.get("ip_signup").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip_signup` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip_signup").toString()));
      }
      if ((jsonObj.get("ip_opt") != null && !jsonObj.get("ip_opt").isJsonNull()) && !jsonObj.get("ip_opt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip_opt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip_opt").toString()));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if ((jsonObj.get("email_client") != null && !jsonObj.get("email_client").isJsonNull()) && !jsonObj.get("email_client").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_client` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email_client").toString()));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        LocationProperty1.validateJsonObject(jsonObj.getAsJsonObject("location"));
      }
      // validate the optional field `last_note`
      if (jsonObj.get("last_note") != null && !jsonObj.get("last_note").isJsonNull()) {
        NotesProperty.validateJsonObject(jsonObj.getAsJsonObject("last_note"));
      }
      if ((jsonObj.get("list_id") != null && !jsonObj.get("list_id").isJsonNull()) && !jsonObj.get("list_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `list_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("list_id").toString()));
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
       if (!ListsAddMemberToSegment200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListsAddMemberToSegment200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListsAddMemberToSegment200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListsAddMemberToSegment200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ListsAddMemberToSegment200Response>() {
           @Override
           public void write(JsonWriter out, ListsAddMemberToSegment200Response value) throws IOException {
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
           public ListsAddMemberToSegment200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ListsAddMemberToSegment200Response instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ListsAddMemberToSegment200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListsAddMemberToSegment200Response
  * @throws IOException if the JSON string is invalid with respect to ListsAddMemberToSegment200Response
  */
  public static ListsAddMemberToSegment200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListsAddMemberToSegment200Response.class);
  }

 /**
  * Convert an instance of ListsAddMemberToSegment200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

