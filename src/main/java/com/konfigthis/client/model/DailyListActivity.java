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
 * One day&#39;s worth of list activity. Doesn&#39;t include Automation activity.
 */
@ApiModel(description = "One day's worth of list activity. Doesn't include Automation activity.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DailyListActivity {
  public static final String SERIALIZED_NAME_DAY = "day";
  @SerializedName(SERIALIZED_NAME_DAY)
  private String day;

  public static final String SERIALIZED_NAME_EMAILS_SENT = "emails_sent";
  @SerializedName(SERIALIZED_NAME_EMAILS_SENT)
  private Integer emailsSent;

  public static final String SERIALIZED_NAME_UNIQUE_OPENS = "unique_opens";
  @SerializedName(SERIALIZED_NAME_UNIQUE_OPENS)
  private Integer uniqueOpens;

  public static final String SERIALIZED_NAME_RECIPIENT_CLICKS = "recipient_clicks";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_CLICKS)
  private Integer recipientClicks;

  public static final String SERIALIZED_NAME_HARD_BOUNCE = "hard_bounce";
  @SerializedName(SERIALIZED_NAME_HARD_BOUNCE)
  private Integer hardBounce;

  public static final String SERIALIZED_NAME_SOFT_BOUNCE = "soft_bounce";
  @SerializedName(SERIALIZED_NAME_SOFT_BOUNCE)
  private Integer softBounce;

  public static final String SERIALIZED_NAME_SUBS = "subs";
  @SerializedName(SERIALIZED_NAME_SUBS)
  private Integer subs;

  public static final String SERIALIZED_NAME_UNSUBS = "unsubs";
  @SerializedName(SERIALIZED_NAME_UNSUBS)
  private Integer unsubs;

  public static final String SERIALIZED_NAME_OTHER_ADDS = "other_adds";
  @SerializedName(SERIALIZED_NAME_OTHER_ADDS)
  private Integer otherAdds;

  public static final String SERIALIZED_NAME_OTHER_REMOVES = "other_removes";
  @SerializedName(SERIALIZED_NAME_OTHER_REMOVES)
  private Integer otherRemoves;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<ResourceLink> links = null;

  public DailyListActivity() {
  }

  
  public DailyListActivity(
     String day, 
     Integer emailsSent, 
     Integer uniqueOpens, 
     Integer recipientClicks, 
     Integer hardBounce, 
     Integer softBounce, 
     Integer subs, 
     Integer unsubs, 
     Integer otherAdds, 
     Integer otherRemoves, 
     List<ResourceLink> links
  ) {
    this();
    this.day = day;
    this.emailsSent = emailsSent;
    this.uniqueOpens = uniqueOpens;
    this.recipientClicks = recipientClicks;
    this.hardBounce = hardBounce;
    this.softBounce = softBounce;
    this.subs = subs;
    this.unsubs = unsubs;
    this.otherAdds = otherAdds;
    this.otherRemoves = otherRemoves;
    this.links = links;
  }

   /**
   * The date for the activity summary.
   * @return day
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date for the activity summary.")

  public String getDay() {
    return day;
  }




   /**
   * The total number of emails sent on the date for the activity summary.
   * @return emailsSent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of emails sent on the date for the activity summary.")

  public Integer getEmailsSent() {
    return emailsSent;
  }




   /**
   * The number of unique opens.
   * @return uniqueOpens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of unique opens.")

  public Integer getUniqueOpens() {
    return uniqueOpens;
  }




   /**
   * The number of clicks.
   * @return recipientClicks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of clicks.")

  public Integer getRecipientClicks() {
    return recipientClicks;
  }




   /**
   * The number of hard bounces.
   * @return hardBounce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of hard bounces.")

  public Integer getHardBounce() {
    return hardBounce;
  }




   /**
   * The number of soft bounces
   * @return softBounce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of soft bounces")

  public Integer getSoftBounce() {
    return softBounce;
  }




   /**
   * The number of subscribes.
   * @return subs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of subscribes.")

  public Integer getSubs() {
    return subs;
  }




   /**
   * The number of unsubscribes.
   * @return unsubs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of unsubscribes.")

  public Integer getUnsubs() {
    return unsubs;
  }




   /**
   * The number of subscribers who may have been added outside of the [double opt-in process](https://mailchimp.com/help/about-double-opt-in/), such as imports or API activity.
   * @return otherAdds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of subscribers who may have been added outside of the [double opt-in process](https://mailchimp.com/help/about-double-opt-in/), such as imports or API activity.")

  public Integer getOtherAdds() {
    return otherAdds;
  }




   /**
   * The number of subscribers who may have been removed outside of unsubscribing or reporting an email as spam (for example, deleted subscribers).
   * @return otherRemoves
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of subscribers who may have been removed outside of unsubscribing or reporting an email as spam (for example, deleted subscribers).")

  public Integer getOtherRemoves() {
    return otherRemoves;
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
   * @return the DailyListActivity instance itself
   */
  public DailyListActivity putAdditionalProperty(String key, Object value) {
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
    DailyListActivity dailyListActivity = (DailyListActivity) o;
    return Objects.equals(this.day, dailyListActivity.day) &&
        Objects.equals(this.emailsSent, dailyListActivity.emailsSent) &&
        Objects.equals(this.uniqueOpens, dailyListActivity.uniqueOpens) &&
        Objects.equals(this.recipientClicks, dailyListActivity.recipientClicks) &&
        Objects.equals(this.hardBounce, dailyListActivity.hardBounce) &&
        Objects.equals(this.softBounce, dailyListActivity.softBounce) &&
        Objects.equals(this.subs, dailyListActivity.subs) &&
        Objects.equals(this.unsubs, dailyListActivity.unsubs) &&
        Objects.equals(this.otherAdds, dailyListActivity.otherAdds) &&
        Objects.equals(this.otherRemoves, dailyListActivity.otherRemoves) &&
        Objects.equals(this.links, dailyListActivity.links)&&
        Objects.equals(this.additionalProperties, dailyListActivity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, emailsSent, uniqueOpens, recipientClicks, hardBounce, softBounce, subs, unsubs, otherAdds, otherRemoves, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DailyListActivity {\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    emailsSent: ").append(toIndentedString(emailsSent)).append("\n");
    sb.append("    uniqueOpens: ").append(toIndentedString(uniqueOpens)).append("\n");
    sb.append("    recipientClicks: ").append(toIndentedString(recipientClicks)).append("\n");
    sb.append("    hardBounce: ").append(toIndentedString(hardBounce)).append("\n");
    sb.append("    softBounce: ").append(toIndentedString(softBounce)).append("\n");
    sb.append("    subs: ").append(toIndentedString(subs)).append("\n");
    sb.append("    unsubs: ").append(toIndentedString(unsubs)).append("\n");
    sb.append("    otherAdds: ").append(toIndentedString(otherAdds)).append("\n");
    sb.append("    otherRemoves: ").append(toIndentedString(otherRemoves)).append("\n");
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
    openapiFields.add("day");
    openapiFields.add("emails_sent");
    openapiFields.add("unique_opens");
    openapiFields.add("recipient_clicks");
    openapiFields.add("hard_bounce");
    openapiFields.add("soft_bounce");
    openapiFields.add("subs");
    openapiFields.add("unsubs");
    openapiFields.add("other_adds");
    openapiFields.add("other_removes");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DailyListActivity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DailyListActivity.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DailyListActivity is not found in the empty JSON string", DailyListActivity.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("day") != null && !jsonObj.get("day").isJsonNull()) && !jsonObj.get("day").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `day` to be a primitive type in the JSON string but got `%s`", jsonObj.get("day").toString()));
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
       if (!DailyListActivity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DailyListActivity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DailyListActivity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DailyListActivity.class));

       return (TypeAdapter<T>) new TypeAdapter<DailyListActivity>() {
           @Override
           public void write(JsonWriter out, DailyListActivity value) throws IOException {
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
           public DailyListActivity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DailyListActivity instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DailyListActivity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DailyListActivity
  * @throws IOException if the JSON string is invalid with respect to DailyListActivity
  */
  public static DailyListActivity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DailyListActivity.class);
  }

 /**
  * Convert an instance of DailyListActivity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
