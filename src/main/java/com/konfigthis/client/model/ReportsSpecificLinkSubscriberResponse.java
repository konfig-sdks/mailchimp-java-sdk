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
import com.konfigthis.client.model.ResourceLink;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * A subscriber who clicked a specific URL in a specific campaign.
 */
@ApiModel(description = "A subscriber who clicked a specific URL in a specific campaign.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ReportsSpecificLinkSubscriberResponse {
  public static final String SERIALIZED_NAME_EMAIL_ID = "email_id";
  @SerializedName(SERIALIZED_NAME_EMAIL_ID)
  private String emailId;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_MERGE_FIELDS = "merge_fields";
  @SerializedName(SERIALIZED_NAME_MERGE_FIELDS)
  private Map<String, Object> mergeFields = null;

  public static final String SERIALIZED_NAME_VIP = "vip";
  @SerializedName(SERIALIZED_NAME_VIP)
  private Boolean vip;

  public static final String SERIALIZED_NAME_CLICKS = "clicks";
  @SerializedName(SERIALIZED_NAME_CLICKS)
  private Integer clicks;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  public static final String SERIALIZED_NAME_URL_ID = "url_id";
  @SerializedName(SERIALIZED_NAME_URL_ID)
  private String urlId;

  public static final String SERIALIZED_NAME_LIST_ID = "list_id";
  @SerializedName(SERIALIZED_NAME_LIST_ID)
  private String listId;

  public static final String SERIALIZED_NAME_LIST_IS_ACTIVE = "list_is_active";
  @SerializedName(SERIALIZED_NAME_LIST_IS_ACTIVE)
  private Boolean listIsActive;

  public static final String SERIALIZED_NAME_CONTACT_STATUS = "contact_status";
  @SerializedName(SERIALIZED_NAME_CONTACT_STATUS)
  private String contactStatus;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<ResourceLink> links = null;

  public ReportsSpecificLinkSubscriberResponse() {
  }

  
  public ReportsSpecificLinkSubscriberResponse(
     String emailId, 
     String emailAddress, 
     Boolean vip, 
     Integer clicks, 
     String campaignId, 
     String urlId, 
     String listId, 
     Boolean listIsActive, 
     String contactStatus, 
     List<ResourceLink> links
  ) {
    this();
    this.emailId = emailId;
    this.emailAddress = emailAddress;
    this.vip = vip;
    this.clicks = clicks;
    this.campaignId = campaignId;
    this.urlId = urlId;
    this.listId = listId;
    this.listIsActive = listIsActive;
    this.contactStatus = contactStatus;
    this.links = links;
  }

   /**
   * The MD5 hash of the lowercase version of the list member&#39;s email address.
   * @return emailId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The MD5 hash of the lowercase version of the list member's email address.")

  public String getEmailId() {
    return emailId;
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




  public ReportsSpecificLinkSubscriberResponse mergeFields(Map<String, Object> mergeFields) {
    
    
    
    
    this.mergeFields = mergeFields;
    return this;
  }

  public ReportsSpecificLinkSubscriberResponse putMergeFieldsItem(String key, Object mergeFieldsItem) {
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


   /**
   * [VIP status](https://mailchimp.com/help/designate-and-send-to-vip-contacts/) for subscriber.
   * @return vip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[VIP status](https://mailchimp.com/help/designate-and-send-to-vip-contacts/) for subscriber.")

  public Boolean getVip() {
    return vip;
  }




   /**
   * The total number of times the subscriber clicked on the link.
   * @return clicks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of times the subscriber clicked on the link.")

  public Integer getClicks() {
    return clicks;
  }




   /**
   * The campaign id.
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The campaign id.")

  public String getCampaignId() {
    return campaignId;
  }




   /**
   * The id for the tracked URL in the campaign.
   * @return urlId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id for the tracked URL in the campaign.")

  public String getUrlId() {
    return urlId;
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
   * The status of the list used, namely if it&#39;s deleted or disabled.
   * @return listIsActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the list used, namely if it's deleted or disabled.")

  public Boolean getListIsActive() {
    return listIsActive;
  }




   /**
   * The status of the member, namely if they are subscribed, unsubscribed, deleted, non-subscribed, transactional, pending, or need reconfirmation.
   * @return contactStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the member, namely if they are subscribed, unsubscribed, deleted, non-subscribed, transactional, pending, or need reconfirmation.")

  public String getContactStatus() {
    return contactStatus;
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
   * @return the ReportsSpecificLinkSubscriberResponse instance itself
   */
  public ReportsSpecificLinkSubscriberResponse putAdditionalProperty(String key, Object value) {
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
    ReportsSpecificLinkSubscriberResponse reportsSpecificLinkSubscriberResponse = (ReportsSpecificLinkSubscriberResponse) o;
    return Objects.equals(this.emailId, reportsSpecificLinkSubscriberResponse.emailId) &&
        Objects.equals(this.emailAddress, reportsSpecificLinkSubscriberResponse.emailAddress) &&
        Objects.equals(this.mergeFields, reportsSpecificLinkSubscriberResponse.mergeFields) &&
        Objects.equals(this.vip, reportsSpecificLinkSubscriberResponse.vip) &&
        Objects.equals(this.clicks, reportsSpecificLinkSubscriberResponse.clicks) &&
        Objects.equals(this.campaignId, reportsSpecificLinkSubscriberResponse.campaignId) &&
        Objects.equals(this.urlId, reportsSpecificLinkSubscriberResponse.urlId) &&
        Objects.equals(this.listId, reportsSpecificLinkSubscriberResponse.listId) &&
        Objects.equals(this.listIsActive, reportsSpecificLinkSubscriberResponse.listIsActive) &&
        Objects.equals(this.contactStatus, reportsSpecificLinkSubscriberResponse.contactStatus) &&
        Objects.equals(this.links, reportsSpecificLinkSubscriberResponse.links)&&
        Objects.equals(this.additionalProperties, reportsSpecificLinkSubscriberResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailId, emailAddress, mergeFields, vip, clicks, campaignId, urlId, listId, listIsActive, contactStatus, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportsSpecificLinkSubscriberResponse {\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    mergeFields: ").append(toIndentedString(mergeFields)).append("\n");
    sb.append("    vip: ").append(toIndentedString(vip)).append("\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    urlId: ").append(toIndentedString(urlId)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    listIsActive: ").append(toIndentedString(listIsActive)).append("\n");
    sb.append("    contactStatus: ").append(toIndentedString(contactStatus)).append("\n");
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
    openapiFields.add("email_id");
    openapiFields.add("email_address");
    openapiFields.add("merge_fields");
    openapiFields.add("vip");
    openapiFields.add("clicks");
    openapiFields.add("campaign_id");
    openapiFields.add("url_id");
    openapiFields.add("list_id");
    openapiFields.add("list_is_active");
    openapiFields.add("contact_status");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReportsSpecificLinkSubscriberResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReportsSpecificLinkSubscriberResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportsSpecificLinkSubscriberResponse is not found in the empty JSON string", ReportsSpecificLinkSubscriberResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("email_id") != null && !jsonObj.get("email_id").isJsonNull()) && !jsonObj.get("email_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email_id").toString()));
      }
      if ((jsonObj.get("email_address") != null && !jsonObj.get("email_address").isJsonNull()) && !jsonObj.get("email_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email_address").toString()));
      }
      if ((jsonObj.get("campaign_id") != null && !jsonObj.get("campaign_id").isJsonNull()) && !jsonObj.get("campaign_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaign_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaign_id").toString()));
      }
      if ((jsonObj.get("url_id") != null && !jsonObj.get("url_id").isJsonNull()) && !jsonObj.get("url_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url_id").toString()));
      }
      if ((jsonObj.get("list_id") != null && !jsonObj.get("list_id").isJsonNull()) && !jsonObj.get("list_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `list_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("list_id").toString()));
      }
      if ((jsonObj.get("contact_status") != null && !jsonObj.get("contact_status").isJsonNull()) && !jsonObj.get("contact_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contact_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contact_status").toString()));
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
       if (!ReportsSpecificLinkSubscriberResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportsSpecificLinkSubscriberResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportsSpecificLinkSubscriberResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportsSpecificLinkSubscriberResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportsSpecificLinkSubscriberResponse>() {
           @Override
           public void write(JsonWriter out, ReportsSpecificLinkSubscriberResponse value) throws IOException {
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
           public ReportsSpecificLinkSubscriberResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReportsSpecificLinkSubscriberResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ReportsSpecificLinkSubscriberResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportsSpecificLinkSubscriberResponse
  * @throws IOException if the JSON string is invalid with respect to ReportsSpecificLinkSubscriberResponse
  */
  public static ReportsSpecificLinkSubscriberResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportsSpecificLinkSubscriberResponse.class);
  }

 /**
  * Convert an instance of ReportsSpecificLinkSubscriberResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

