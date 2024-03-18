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
import com.konfigthis.client.model.ReportSummaryEcommerce;
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
 * High level reporting stats for an outreach.
 */
@ApiModel(description = "High level reporting stats for an outreach.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ReportSummary {
  public static final String SERIALIZED_NAME_OPENS = "opens";
  @SerializedName(SERIALIZED_NAME_OPENS)
  private Integer opens;

  public static final String SERIALIZED_NAME_UNIQUE_OPENS = "unique_opens";
  @SerializedName(SERIALIZED_NAME_UNIQUE_OPENS)
  private Integer uniqueOpens;

  public static final String SERIALIZED_NAME_OPEN_RATE = "open_rate";
  @SerializedName(SERIALIZED_NAME_OPEN_RATE)
  private Double openRate;

  public static final String SERIALIZED_NAME_CLICKS = "clicks";
  @SerializedName(SERIALIZED_NAME_CLICKS)
  private Integer clicks;

  public static final String SERIALIZED_NAME_SUBSCRIBER_CLICKS = "subscriber_clicks";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBER_CLICKS)
  private Integer subscriberClicks;

  public static final String SERIALIZED_NAME_CLICK_RATE = "click_rate";
  @SerializedName(SERIALIZED_NAME_CLICK_RATE)
  private Double clickRate;

  public static final String SERIALIZED_NAME_VISITS = "visits";
  @SerializedName(SERIALIZED_NAME_VISITS)
  private Integer visits;

  public static final String SERIALIZED_NAME_UNIQUE_VISITS = "unique_visits";
  @SerializedName(SERIALIZED_NAME_UNIQUE_VISITS)
  private Integer uniqueVisits;

  public static final String SERIALIZED_NAME_CONVERSION_RATE = "conversion_rate";
  @SerializedName(SERIALIZED_NAME_CONVERSION_RATE)
  private Double conversionRate;

  public static final String SERIALIZED_NAME_SUBSCRIBES = "subscribes";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBES)
  private Integer subscribes;

  public static final String SERIALIZED_NAME_ECOMMERCE = "ecommerce";
  @SerializedName(SERIALIZED_NAME_ECOMMERCE)
  private ReportSummaryEcommerce ecommerce;

  public static final String SERIALIZED_NAME_IMPRESSIONS = "impressions";
  @SerializedName(SERIALIZED_NAME_IMPRESSIONS)
  private Double impressions;

  public static final String SERIALIZED_NAME_REACH = "reach";
  @SerializedName(SERIALIZED_NAME_REACH)
  private Integer reach;

  public static final String SERIALIZED_NAME_ENGAGEMENTS = "engagements";
  @SerializedName(SERIALIZED_NAME_ENGAGEMENTS)
  private Integer engagements;

  public static final String SERIALIZED_NAME_TOTAL_SENT = "total_sent";
  @SerializedName(SERIALIZED_NAME_TOTAL_SENT)
  private Integer totalSent;

  public ReportSummary() {
  }

  public ReportSummary opens(Integer opens) {
    
    
    
    
    this.opens = opens;
    return this;
  }

   /**
   * Get opens
   * @return opens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOpens() {
    return opens;
  }


  public void setOpens(Integer opens) {
    
    
    
    this.opens = opens;
  }


  public ReportSummary uniqueOpens(Integer uniqueOpens) {
    
    
    
    
    this.uniqueOpens = uniqueOpens;
    return this;
  }

   /**
   * Get uniqueOpens
   * @return uniqueOpens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUniqueOpens() {
    return uniqueOpens;
  }


  public void setUniqueOpens(Integer uniqueOpens) {
    
    
    
    this.uniqueOpens = uniqueOpens;
  }


  public ReportSummary openRate(Double openRate) {
    
    
    
    
    this.openRate = openRate;
    return this;
  }

  public ReportSummary openRate(Integer openRate) {
    
    
    
    
    this.openRate = openRate.doubleValue();
    return this;
  }

   /**
   * Get openRate
   * @return openRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getOpenRate() {
    return openRate;
  }


  public void setOpenRate(Double openRate) {
    
    
    
    this.openRate = openRate;
  }


  public ReportSummary clicks(Integer clicks) {
    
    
    
    
    this.clicks = clicks;
    return this;
  }

   /**
   * Get clicks
   * @return clicks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getClicks() {
    return clicks;
  }


  public void setClicks(Integer clicks) {
    
    
    
    this.clicks = clicks;
  }


  public ReportSummary subscriberClicks(Integer subscriberClicks) {
    
    
    
    
    this.subscriberClicks = subscriberClicks;
    return this;
  }

   /**
   * Get subscriberClicks
   * @return subscriberClicks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSubscriberClicks() {
    return subscriberClicks;
  }


  public void setSubscriberClicks(Integer subscriberClicks) {
    
    
    
    this.subscriberClicks = subscriberClicks;
  }


  public ReportSummary clickRate(Double clickRate) {
    
    
    
    
    this.clickRate = clickRate;
    return this;
  }

  public ReportSummary clickRate(Integer clickRate) {
    
    
    
    
    this.clickRate = clickRate.doubleValue();
    return this;
  }

   /**
   * Get clickRate
   * @return clickRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getClickRate() {
    return clickRate;
  }


  public void setClickRate(Double clickRate) {
    
    
    
    this.clickRate = clickRate;
  }


  public ReportSummary visits(Integer visits) {
    
    
    
    
    this.visits = visits;
    return this;
  }

   /**
   * Get visits
   * @return visits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVisits() {
    return visits;
  }


  public void setVisits(Integer visits) {
    
    
    
    this.visits = visits;
  }


  public ReportSummary uniqueVisits(Integer uniqueVisits) {
    
    
    
    
    this.uniqueVisits = uniqueVisits;
    return this;
  }

   /**
   * Get uniqueVisits
   * @return uniqueVisits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUniqueVisits() {
    return uniqueVisits;
  }


  public void setUniqueVisits(Integer uniqueVisits) {
    
    
    
    this.uniqueVisits = uniqueVisits;
  }


  public ReportSummary conversionRate(Double conversionRate) {
    
    
    
    
    this.conversionRate = conversionRate;
    return this;
  }

  public ReportSummary conversionRate(Integer conversionRate) {
    
    
    
    
    this.conversionRate = conversionRate.doubleValue();
    return this;
  }

   /**
   * Get conversionRate
   * @return conversionRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getConversionRate() {
    return conversionRate;
  }


  public void setConversionRate(Double conversionRate) {
    
    
    
    this.conversionRate = conversionRate;
  }


  public ReportSummary subscribes(Integer subscribes) {
    
    
    
    
    this.subscribes = subscribes;
    return this;
  }

   /**
   * Get subscribes
   * @return subscribes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSubscribes() {
    return subscribes;
  }


  public void setSubscribes(Integer subscribes) {
    
    
    
    this.subscribes = subscribes;
  }


  public ReportSummary ecommerce(ReportSummaryEcommerce ecommerce) {
    
    
    
    
    this.ecommerce = ecommerce;
    return this;
  }

   /**
   * Get ecommerce
   * @return ecommerce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReportSummaryEcommerce getEcommerce() {
    return ecommerce;
  }


  public void setEcommerce(ReportSummaryEcommerce ecommerce) {
    
    
    
    this.ecommerce = ecommerce;
  }


  public ReportSummary impressions(Double impressions) {
    
    
    
    
    this.impressions = impressions;
    return this;
  }

  public ReportSummary impressions(Integer impressions) {
    
    
    
    
    this.impressions = impressions.doubleValue();
    return this;
  }

   /**
   * Get impressions
   * @return impressions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getImpressions() {
    return impressions;
  }


  public void setImpressions(Double impressions) {
    
    
    
    this.impressions = impressions;
  }


  public ReportSummary reach(Integer reach) {
    
    
    
    
    this.reach = reach;
    return this;
  }

   /**
   * Get reach
   * @return reach
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReach() {
    return reach;
  }


  public void setReach(Integer reach) {
    
    
    
    this.reach = reach;
  }


  public ReportSummary engagements(Integer engagements) {
    
    
    
    
    this.engagements = engagements;
    return this;
  }

   /**
   * Get engagements
   * @return engagements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getEngagements() {
    return engagements;
  }


  public void setEngagements(Integer engagements) {
    
    
    
    this.engagements = engagements;
  }


  public ReportSummary totalSent(Integer totalSent) {
    
    
    
    
    this.totalSent = totalSent;
    return this;
  }

   /**
   * Get totalSent
   * @return totalSent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalSent() {
    return totalSent;
  }


  public void setTotalSent(Integer totalSent) {
    
    
    
    this.totalSent = totalSent;
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
   * @return the ReportSummary instance itself
   */
  public ReportSummary putAdditionalProperty(String key, Object value) {
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
    ReportSummary reportSummary = (ReportSummary) o;
    return Objects.equals(this.opens, reportSummary.opens) &&
        Objects.equals(this.uniqueOpens, reportSummary.uniqueOpens) &&
        Objects.equals(this.openRate, reportSummary.openRate) &&
        Objects.equals(this.clicks, reportSummary.clicks) &&
        Objects.equals(this.subscriberClicks, reportSummary.subscriberClicks) &&
        Objects.equals(this.clickRate, reportSummary.clickRate) &&
        Objects.equals(this.visits, reportSummary.visits) &&
        Objects.equals(this.uniqueVisits, reportSummary.uniqueVisits) &&
        Objects.equals(this.conversionRate, reportSummary.conversionRate) &&
        Objects.equals(this.subscribes, reportSummary.subscribes) &&
        Objects.equals(this.ecommerce, reportSummary.ecommerce) &&
        Objects.equals(this.impressions, reportSummary.impressions) &&
        Objects.equals(this.reach, reportSummary.reach) &&
        Objects.equals(this.engagements, reportSummary.engagements) &&
        Objects.equals(this.totalSent, reportSummary.totalSent)&&
        Objects.equals(this.additionalProperties, reportSummary.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opens, uniqueOpens, openRate, clicks, subscriberClicks, clickRate, visits, uniqueVisits, conversionRate, subscribes, ecommerce, impressions, reach, engagements, totalSent, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportSummary {\n");
    sb.append("    opens: ").append(toIndentedString(opens)).append("\n");
    sb.append("    uniqueOpens: ").append(toIndentedString(uniqueOpens)).append("\n");
    sb.append("    openRate: ").append(toIndentedString(openRate)).append("\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
    sb.append("    subscriberClicks: ").append(toIndentedString(subscriberClicks)).append("\n");
    sb.append("    clickRate: ").append(toIndentedString(clickRate)).append("\n");
    sb.append("    visits: ").append(toIndentedString(visits)).append("\n");
    sb.append("    uniqueVisits: ").append(toIndentedString(uniqueVisits)).append("\n");
    sb.append("    conversionRate: ").append(toIndentedString(conversionRate)).append("\n");
    sb.append("    subscribes: ").append(toIndentedString(subscribes)).append("\n");
    sb.append("    ecommerce: ").append(toIndentedString(ecommerce)).append("\n");
    sb.append("    impressions: ").append(toIndentedString(impressions)).append("\n");
    sb.append("    reach: ").append(toIndentedString(reach)).append("\n");
    sb.append("    engagements: ").append(toIndentedString(engagements)).append("\n");
    sb.append("    totalSent: ").append(toIndentedString(totalSent)).append("\n");
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
    openapiFields.add("opens");
    openapiFields.add("unique_opens");
    openapiFields.add("open_rate");
    openapiFields.add("clicks");
    openapiFields.add("subscriber_clicks");
    openapiFields.add("click_rate");
    openapiFields.add("visits");
    openapiFields.add("unique_visits");
    openapiFields.add("conversion_rate");
    openapiFields.add("subscribes");
    openapiFields.add("ecommerce");
    openapiFields.add("impressions");
    openapiFields.add("reach");
    openapiFields.add("engagements");
    openapiFields.add("total_sent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReportSummary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReportSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportSummary is not found in the empty JSON string", ReportSummary.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `ecommerce`
      if (jsonObj.get("ecommerce") != null && !jsonObj.get("ecommerce").isJsonNull()) {
        ReportSummaryEcommerce.validateJsonObject(jsonObj.getAsJsonObject("ecommerce"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportSummary>() {
           @Override
           public void write(JsonWriter out, ReportSummary value) throws IOException {
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
           public ReportSummary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReportSummary instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ReportSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportSummary
  * @throws IOException if the JSON string is invalid with respect to ReportSummary
  */
  public static ReportSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportSummary.class);
  }

 /**
  * Convert an instance of ReportSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
