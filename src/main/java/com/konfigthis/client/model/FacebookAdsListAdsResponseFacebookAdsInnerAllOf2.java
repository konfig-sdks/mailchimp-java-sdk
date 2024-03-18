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
import com.konfigthis.client.model.FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience;
import com.konfigthis.client.model.FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Budget;
import com.konfigthis.client.model.FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Channel;
import com.konfigthis.client.model.FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Content;
import com.konfigthis.client.model.FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Feedback;
import com.konfigthis.client.model.FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Site;
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
 * A facebook ad.
 */
@ApiModel(description = "A facebook ad.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class FacebookAdsListAdsResponseFacebookAdsInnerAllOf2 {
  public static final String SERIALIZED_NAME_IS_CONNECTED = "is_connected";
  @SerializedName(SERIALIZED_NAME_IS_CONNECTED)
  private Boolean isConnected;

  public static final String SERIALIZED_NAME_HAS_AUDIENCE = "has_audience";
  @SerializedName(SERIALIZED_NAME_HAS_AUDIENCE)
  private Boolean hasAudience;

  public static final String SERIALIZED_NAME_HAS_CONTENT = "has_content";
  @SerializedName(SERIALIZED_NAME_HAS_CONTENT)
  private Boolean hasContent;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Channel channel;

  public static final String SERIALIZED_NAME_FEEDBACK = "feedback";
  @SerializedName(SERIALIZED_NAME_FEEDBACK)
  private FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Feedback feedback;

  public static final String SERIALIZED_NAME_SITE = "site";
  @SerializedName(SERIALIZED_NAME_SITE)
  private FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Site site;

  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience audience;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Budget budget;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Content content;

  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2() {
  }

  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2 isConnected(Boolean isConnected) {
    
    
    
    
    this.isConnected = isConnected;
    return this;
  }

   /**
   * Check if this ad is connected to a facebook page
   * @return isConnected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Check if this ad is connected to a facebook page")

  public Boolean getIsConnected() {
    return isConnected;
  }


  public void setIsConnected(Boolean isConnected) {
    
    
    
    this.isConnected = isConnected;
  }


  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2 hasAudience(Boolean hasAudience) {
    
    
    
    
    this.hasAudience = hasAudience;
    return this;
  }

   /**
   * Check if this ad has audience setup
   * @return hasAudience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Check if this ad has audience setup")

  public Boolean getHasAudience() {
    return hasAudience;
  }


  public void setHasAudience(Boolean hasAudience) {
    
    
    
    this.hasAudience = hasAudience;
  }


  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2 hasContent(Boolean hasContent) {
    
    
    
    
    this.hasContent = hasContent;
    return this;
  }

   /**
   * Check if this ad has content
   * @return hasContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Check if this ad has content")

  public Boolean getHasContent() {
    return hasContent;
  }


  public void setHasContent(Boolean hasContent) {
    
    
    
    this.hasContent = hasContent;
  }


  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2 channel(FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Channel channel) {
    
    
    
    
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Channel getChannel() {
    return channel;
  }


  public void setChannel(FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Channel channel) {
    
    
    
    this.channel = channel;
  }


  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2 feedback(FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Feedback feedback) {
    
    
    
    
    this.feedback = feedback;
    return this;
  }

   /**
   * Get feedback
   * @return feedback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Feedback getFeedback() {
    return feedback;
  }


  public void setFeedback(FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Feedback feedback) {
    
    
    
    this.feedback = feedback;
  }


  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2 site(FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Site site) {
    
    
    
    
    this.site = site;
    return this;
  }

   /**
   * Get site
   * @return site
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Site getSite() {
    return site;
  }


  public void setSite(FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Site site) {
    
    
    
    this.site = site;
  }


  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2 audience(FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience audience) {
    
    
    
    
    this.audience = audience;
    return this;
  }

   /**
   * Get audience
   * @return audience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience getAudience() {
    return audience;
  }


  public void setAudience(FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience audience) {
    
    
    
    this.audience = audience;
  }


  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2 budget(FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Budget budget) {
    
    
    
    
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Budget getBudget() {
    return budget;
  }


  public void setBudget(FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Budget budget) {
    
    
    
    this.budget = budget;
  }


  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2 content(FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Content content) {
    
    
    
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Content getContent() {
    return content;
  }


  public void setContent(FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Content content) {
    
    
    
    this.content = content;
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
   * @return the FacebookAdsListAdsResponseFacebookAdsInnerAllOf2 instance itself
   */
  public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2 putAdditionalProperty(String key, Object value) {
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
    FacebookAdsListAdsResponseFacebookAdsInnerAllOf2 facebookAdsListAdsResponseFacebookAdsInnerAllOf2 = (FacebookAdsListAdsResponseFacebookAdsInnerAllOf2) o;
    return Objects.equals(this.isConnected, facebookAdsListAdsResponseFacebookAdsInnerAllOf2.isConnected) &&
        Objects.equals(this.hasAudience, facebookAdsListAdsResponseFacebookAdsInnerAllOf2.hasAudience) &&
        Objects.equals(this.hasContent, facebookAdsListAdsResponseFacebookAdsInnerAllOf2.hasContent) &&
        Objects.equals(this.channel, facebookAdsListAdsResponseFacebookAdsInnerAllOf2.channel) &&
        Objects.equals(this.feedback, facebookAdsListAdsResponseFacebookAdsInnerAllOf2.feedback) &&
        Objects.equals(this.site, facebookAdsListAdsResponseFacebookAdsInnerAllOf2.site) &&
        Objects.equals(this.audience, facebookAdsListAdsResponseFacebookAdsInnerAllOf2.audience) &&
        Objects.equals(this.budget, facebookAdsListAdsResponseFacebookAdsInnerAllOf2.budget) &&
        Objects.equals(this.content, facebookAdsListAdsResponseFacebookAdsInnerAllOf2.content)&&
        Objects.equals(this.additionalProperties, facebookAdsListAdsResponseFacebookAdsInnerAllOf2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isConnected, hasAudience, hasContent, channel, feedback, site, audience, budget, content, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacebookAdsListAdsResponseFacebookAdsInnerAllOf2 {\n");
    sb.append("    isConnected: ").append(toIndentedString(isConnected)).append("\n");
    sb.append("    hasAudience: ").append(toIndentedString(hasAudience)).append("\n");
    sb.append("    hasContent: ").append(toIndentedString(hasContent)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    feedback: ").append(toIndentedString(feedback)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
    openapiFields.add("is_connected");
    openapiFields.add("has_audience");
    openapiFields.add("has_content");
    openapiFields.add("channel");
    openapiFields.add("feedback");
    openapiFields.add("site");
    openapiFields.add("audience");
    openapiFields.add("budget");
    openapiFields.add("content");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FacebookAdsListAdsResponseFacebookAdsInnerAllOf2
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FacebookAdsListAdsResponseFacebookAdsInnerAllOf2.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FacebookAdsListAdsResponseFacebookAdsInnerAllOf2 is not found in the empty JSON string", FacebookAdsListAdsResponseFacebookAdsInnerAllOf2.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `channel`
      if (jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonNull()) {
        FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Channel.validateJsonObject(jsonObj.getAsJsonObject("channel"));
      }
      // validate the optional field `feedback`
      if (jsonObj.get("feedback") != null && !jsonObj.get("feedback").isJsonNull()) {
        FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Feedback.validateJsonObject(jsonObj.getAsJsonObject("feedback"));
      }
      // validate the optional field `site`
      if (jsonObj.get("site") != null && !jsonObj.get("site").isJsonNull()) {
        FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Site.validateJsonObject(jsonObj.getAsJsonObject("site"));
      }
      // validate the optional field `audience`
      if (jsonObj.get("audience") != null && !jsonObj.get("audience").isJsonNull()) {
        FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Audience.validateJsonObject(jsonObj.getAsJsonObject("audience"));
      }
      // validate the optional field `budget`
      if (jsonObj.get("budget") != null && !jsonObj.get("budget").isJsonNull()) {
        FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Budget.validateJsonObject(jsonObj.getAsJsonObject("budget"));
      }
      // validate the optional field `content`
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) {
        FacebookAdsListAdsResponseFacebookAdsInnerAllOf2Content.validateJsonObject(jsonObj.getAsJsonObject("content"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FacebookAdsListAdsResponseFacebookAdsInnerAllOf2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FacebookAdsListAdsResponseFacebookAdsInnerAllOf2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FacebookAdsListAdsResponseFacebookAdsInnerAllOf2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FacebookAdsListAdsResponseFacebookAdsInnerAllOf2.class));

       return (TypeAdapter<T>) new TypeAdapter<FacebookAdsListAdsResponseFacebookAdsInnerAllOf2>() {
           @Override
           public void write(JsonWriter out, FacebookAdsListAdsResponseFacebookAdsInnerAllOf2 value) throws IOException {
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
           public FacebookAdsListAdsResponseFacebookAdsInnerAllOf2 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FacebookAdsListAdsResponseFacebookAdsInnerAllOf2 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FacebookAdsListAdsResponseFacebookAdsInnerAllOf2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FacebookAdsListAdsResponseFacebookAdsInnerAllOf2
  * @throws IOException if the JSON string is invalid with respect to FacebookAdsListAdsResponseFacebookAdsInnerAllOf2
  */
  public static FacebookAdsListAdsResponseFacebookAdsInnerAllOf2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FacebookAdsListAdsResponseFacebookAdsInnerAllOf2.class);
  }

 /**
  * Convert an instance of FacebookAdsListAdsResponseFacebookAdsInnerAllOf2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
