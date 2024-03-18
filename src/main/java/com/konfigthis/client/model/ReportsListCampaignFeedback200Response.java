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
import com.konfigthis.client.model.CampaignAdvice;
import com.konfigthis.client.model.ResourceLink;
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
 * A list of feedback based on a campaign&#39;s statistics.
 */
@ApiModel(description = "A list of feedback based on a campaign's statistics.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ReportsListCampaignFeedback200Response {
  public static final String SERIALIZED_NAME_ADVICE = "advice";
  @SerializedName(SERIALIZED_NAME_ADVICE)
  private List<CampaignAdvice> advice = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  public static final String SERIALIZED_NAME_TOTAL_ITEMS = "total_items";
  @SerializedName(SERIALIZED_NAME_TOTAL_ITEMS)
  private Integer totalItems;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<ResourceLink> links = null;

  public ReportsListCampaignFeedback200Response() {
  }

  
  public ReportsListCampaignFeedback200Response(
     String campaignId, 
     Integer totalItems, 
     List<ResourceLink> links
  ) {
    this();
    this.campaignId = campaignId;
    this.totalItems = totalItems;
    this.links = links;
  }

  public ReportsListCampaignFeedback200Response advice(List<CampaignAdvice> advice) {
    
    
    
    
    this.advice = advice;
    return this;
  }

  public ReportsListCampaignFeedback200Response addAdviceItem(CampaignAdvice adviceItem) {
    if (this.advice == null) {
      this.advice = new ArrayList<>();
    }
    this.advice.add(adviceItem);
    return this;
  }

   /**
   * An array of objects, each representing a point of campaign feedback.
   * @return advice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of objects, each representing a point of campaign feedback.")

  public List<CampaignAdvice> getAdvice() {
    return advice;
  }


  public void setAdvice(List<CampaignAdvice> advice) {
    
    
    
    this.advice = advice;
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
   * The total number of items matching the query regardless of pagination.
   * @return totalItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of items matching the query regardless of pagination.")

  public Integer getTotalItems() {
    return totalItems;
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
   * @return the ReportsListCampaignFeedback200Response instance itself
   */
  public ReportsListCampaignFeedback200Response putAdditionalProperty(String key, Object value) {
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
    ReportsListCampaignFeedback200Response reportsListCampaignFeedback200Response = (ReportsListCampaignFeedback200Response) o;
    return Objects.equals(this.advice, reportsListCampaignFeedback200Response.advice) &&
        Objects.equals(this.campaignId, reportsListCampaignFeedback200Response.campaignId) &&
        Objects.equals(this.totalItems, reportsListCampaignFeedback200Response.totalItems) &&
        Objects.equals(this.links, reportsListCampaignFeedback200Response.links)&&
        Objects.equals(this.additionalProperties, reportsListCampaignFeedback200Response.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advice, campaignId, totalItems, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportsListCampaignFeedback200Response {\n");
    sb.append("    advice: ").append(toIndentedString(advice)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
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
    openapiFields.add("advice");
    openapiFields.add("campaign_id");
    openapiFields.add("total_items");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReportsListCampaignFeedback200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReportsListCampaignFeedback200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportsListCampaignFeedback200Response is not found in the empty JSON string", ReportsListCampaignFeedback200Response.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("advice") != null && !jsonObj.get("advice").isJsonNull()) {
        JsonArray jsonArrayadvice = jsonObj.getAsJsonArray("advice");
        if (jsonArrayadvice != null) {
          // ensure the json data is an array
          if (!jsonObj.get("advice").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `advice` to be an array in the JSON string but got `%s`", jsonObj.get("advice").toString()));
          }

          // validate the optional field `advice` (array)
          for (int i = 0; i < jsonArrayadvice.size(); i++) {
            CampaignAdvice.validateJsonObject(jsonArrayadvice.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("campaign_id") != null && !jsonObj.get("campaign_id").isJsonNull()) && !jsonObj.get("campaign_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaign_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaign_id").toString()));
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
       if (!ReportsListCampaignFeedback200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportsListCampaignFeedback200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportsListCampaignFeedback200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportsListCampaignFeedback200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportsListCampaignFeedback200Response>() {
           @Override
           public void write(JsonWriter out, ReportsListCampaignFeedback200Response value) throws IOException {
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
           public ReportsListCampaignFeedback200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReportsListCampaignFeedback200Response instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ReportsListCampaignFeedback200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportsListCampaignFeedback200Response
  * @throws IOException if the JSON string is invalid with respect to ReportsListCampaignFeedback200Response
  */
  public static ReportsListCampaignFeedback200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportsListCampaignFeedback200Response.class);
  }

 /**
  * Convert an instance of ReportsListCampaignFeedback200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

