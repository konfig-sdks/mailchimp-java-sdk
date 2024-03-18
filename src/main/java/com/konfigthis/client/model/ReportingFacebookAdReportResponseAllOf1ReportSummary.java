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
import com.konfigthis.client.model.ReportingFacebookAdReportResponseAllOf1ReportSummaryAverageOrderAmount;
import com.konfigthis.client.model.ReportingFacebookAdReportResponseAllOf1ReportSummaryEcommerce;
import com.konfigthis.client.model.ReportingFacebookAdReportResponseAllOf1ReportSummaryExtendedAt;
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
 * Report summary of facebook ad
 */
@ApiModel(description = "Report summary of facebook ad")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ReportingFacebookAdReportResponseAllOf1ReportSummary {
  public static final String SERIALIZED_NAME_REACH = "reach";
  @SerializedName(SERIALIZED_NAME_REACH)
  private Integer reach;

  public static final String SERIALIZED_NAME_IMPRESSIONS = "impressions";
  @SerializedName(SERIALIZED_NAME_IMPRESSIONS)
  private Integer impressions;

  public static final String SERIALIZED_NAME_CLICKS = "clicks";
  @SerializedName(SERIALIZED_NAME_CLICKS)
  private Integer clicks;

  public static final String SERIALIZED_NAME_CLICK_RATE = "click_rate";
  @SerializedName(SERIALIZED_NAME_CLICK_RATE)
  private Double clickRate;

  public static final String SERIALIZED_NAME_UNIQUE_CLICKS = "unique_clicks";
  @SerializedName(SERIALIZED_NAME_UNIQUE_CLICKS)
  private Integer uniqueClicks;

  public static final String SERIALIZED_NAME_FIRST_TIME_BUYERS = "first_time_buyers";
  @SerializedName(SERIALIZED_NAME_FIRST_TIME_BUYERS)
  private Integer firstTimeBuyers;

  public static final String SERIALIZED_NAME_ECOMMERCE = "ecommerce";
  @SerializedName(SERIALIZED_NAME_ECOMMERCE)
  private ReportingFacebookAdReportResponseAllOf1ReportSummaryEcommerce ecommerce;

  public static final String SERIALIZED_NAME_TOTAL_PRODUCTS_SOLD = "total_products_sold";
  @SerializedName(SERIALIZED_NAME_TOTAL_PRODUCTS_SOLD)
  private Integer totalProductsSold;

  public static final String SERIALIZED_NAME_TOTAL_ORDERS = "total_orders";
  @SerializedName(SERIALIZED_NAME_TOTAL_ORDERS)
  private Integer totalOrders;

  public static final String SERIALIZED_NAME_AVERAGE_ORDER_AMOUNT = "average_order_amount";
  @SerializedName(SERIALIZED_NAME_AVERAGE_ORDER_AMOUNT)
  private ReportingFacebookAdReportResponseAllOf1ReportSummaryAverageOrderAmount averageOrderAmount;

  public static final String SERIALIZED_NAME_COST_PER_CLICK = "cost_per_click";
  @SerializedName(SERIALIZED_NAME_COST_PER_CLICK)
  private ReportingFacebookAdReportResponseAllOf1ReportSummaryAverageOrderAmount costPerClick;

  public static final String SERIALIZED_NAME_AVERAGE_DAILY_BUDGET = "average_daily_budget";
  @SerializedName(SERIALIZED_NAME_AVERAGE_DAILY_BUDGET)
  private ReportingFacebookAdReportResponseAllOf1ReportSummaryAverageOrderAmount averageDailyBudget;

  public static final String SERIALIZED_NAME_LIKES = "likes";
  @SerializedName(SERIALIZED_NAME_LIKES)
  private Integer likes;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private Integer comments;

  public static final String SERIALIZED_NAME_SHARES = "shares";
  @SerializedName(SERIALIZED_NAME_SHARES)
  private Integer shares;

  public static final String SERIALIZED_NAME_HAS_EXTENDED_AD_DURATION = "has_extended_ad_duration";
  @SerializedName(SERIALIZED_NAME_HAS_EXTENDED_AD_DURATION)
  private Boolean hasExtendedAdDuration;

  public static final String SERIALIZED_NAME_EXTENDED_AT = "extended_at";
  @SerializedName(SERIALIZED_NAME_EXTENDED_AT)
  private ReportingFacebookAdReportResponseAllOf1ReportSummaryExtendedAt extendedAt;

  public static final String SERIALIZED_NAME_RETURN_ON_INVESTMENT = "return_on_investment";
  @SerializedName(SERIALIZED_NAME_RETURN_ON_INVESTMENT)
  private Double returnOnInvestment;

  public ReportingFacebookAdReportResponseAllOf1ReportSummary() {
  }

  public ReportingFacebookAdReportResponseAllOf1ReportSummary reach(Integer reach) {
    
    
    
    
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


  public ReportingFacebookAdReportResponseAllOf1ReportSummary impressions(Integer impressions) {
    
    
    
    
    this.impressions = impressions;
    return this;
  }

   /**
   * Get impressions
   * @return impressions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getImpressions() {
    return impressions;
  }


  public void setImpressions(Integer impressions) {
    
    
    
    this.impressions = impressions;
  }


  public ReportingFacebookAdReportResponseAllOf1ReportSummary clicks(Integer clicks) {
    
    
    
    
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


  public ReportingFacebookAdReportResponseAllOf1ReportSummary clickRate(Double clickRate) {
    
    
    
    
    this.clickRate = clickRate;
    return this;
  }

  public ReportingFacebookAdReportResponseAllOf1ReportSummary clickRate(Integer clickRate) {
    
    
    
    
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


  public ReportingFacebookAdReportResponseAllOf1ReportSummary uniqueClicks(Integer uniqueClicks) {
    
    
    
    
    this.uniqueClicks = uniqueClicks;
    return this;
  }

   /**
   * Get uniqueClicks
   * @return uniqueClicks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUniqueClicks() {
    return uniqueClicks;
  }


  public void setUniqueClicks(Integer uniqueClicks) {
    
    
    
    this.uniqueClicks = uniqueClicks;
  }


  public ReportingFacebookAdReportResponseAllOf1ReportSummary firstTimeBuyers(Integer firstTimeBuyers) {
    
    
    
    
    this.firstTimeBuyers = firstTimeBuyers;
    return this;
  }

   /**
   * Get firstTimeBuyers
   * @return firstTimeBuyers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFirstTimeBuyers() {
    return firstTimeBuyers;
  }


  public void setFirstTimeBuyers(Integer firstTimeBuyers) {
    
    
    
    this.firstTimeBuyers = firstTimeBuyers;
  }


  public ReportingFacebookAdReportResponseAllOf1ReportSummary ecommerce(ReportingFacebookAdReportResponseAllOf1ReportSummaryEcommerce ecommerce) {
    
    
    
    
    this.ecommerce = ecommerce;
    return this;
  }

   /**
   * Get ecommerce
   * @return ecommerce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReportingFacebookAdReportResponseAllOf1ReportSummaryEcommerce getEcommerce() {
    return ecommerce;
  }


  public void setEcommerce(ReportingFacebookAdReportResponseAllOf1ReportSummaryEcommerce ecommerce) {
    
    
    
    this.ecommerce = ecommerce;
  }


  public ReportingFacebookAdReportResponseAllOf1ReportSummary totalProductsSold(Integer totalProductsSold) {
    
    
    
    
    this.totalProductsSold = totalProductsSold;
    return this;
  }

   /**
   * Get totalProductsSold
   * @return totalProductsSold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalProductsSold() {
    return totalProductsSold;
  }


  public void setTotalProductsSold(Integer totalProductsSold) {
    
    
    
    this.totalProductsSold = totalProductsSold;
  }


  public ReportingFacebookAdReportResponseAllOf1ReportSummary totalOrders(Integer totalOrders) {
    
    
    
    
    this.totalOrders = totalOrders;
    return this;
  }

   /**
   * Get totalOrders
   * @return totalOrders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalOrders() {
    return totalOrders;
  }


  public void setTotalOrders(Integer totalOrders) {
    
    
    
    this.totalOrders = totalOrders;
  }


  public ReportingFacebookAdReportResponseAllOf1ReportSummary averageOrderAmount(ReportingFacebookAdReportResponseAllOf1ReportSummaryAverageOrderAmount averageOrderAmount) {
    
    
    
    
    this.averageOrderAmount = averageOrderAmount;
    return this;
  }

   /**
   * Get averageOrderAmount
   * @return averageOrderAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReportingFacebookAdReportResponseAllOf1ReportSummaryAverageOrderAmount getAverageOrderAmount() {
    return averageOrderAmount;
  }


  public void setAverageOrderAmount(ReportingFacebookAdReportResponseAllOf1ReportSummaryAverageOrderAmount averageOrderAmount) {
    
    
    
    this.averageOrderAmount = averageOrderAmount;
  }


  public ReportingFacebookAdReportResponseAllOf1ReportSummary costPerClick(ReportingFacebookAdReportResponseAllOf1ReportSummaryAverageOrderAmount costPerClick) {
    
    
    
    
    this.costPerClick = costPerClick;
    return this;
  }

   /**
   * Get costPerClick
   * @return costPerClick
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReportingFacebookAdReportResponseAllOf1ReportSummaryAverageOrderAmount getCostPerClick() {
    return costPerClick;
  }


  public void setCostPerClick(ReportingFacebookAdReportResponseAllOf1ReportSummaryAverageOrderAmount costPerClick) {
    
    
    
    this.costPerClick = costPerClick;
  }


  public ReportingFacebookAdReportResponseAllOf1ReportSummary averageDailyBudget(ReportingFacebookAdReportResponseAllOf1ReportSummaryAverageOrderAmount averageDailyBudget) {
    
    
    
    
    this.averageDailyBudget = averageDailyBudget;
    return this;
  }

   /**
   * Get averageDailyBudget
   * @return averageDailyBudget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReportingFacebookAdReportResponseAllOf1ReportSummaryAverageOrderAmount getAverageDailyBudget() {
    return averageDailyBudget;
  }


  public void setAverageDailyBudget(ReportingFacebookAdReportResponseAllOf1ReportSummaryAverageOrderAmount averageDailyBudget) {
    
    
    
    this.averageDailyBudget = averageDailyBudget;
  }


  public ReportingFacebookAdReportResponseAllOf1ReportSummary likes(Integer likes) {
    
    
    
    
    this.likes = likes;
    return this;
  }

   /**
   * Get likes
   * @return likes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLikes() {
    return likes;
  }


  public void setLikes(Integer likes) {
    
    
    
    this.likes = likes;
  }


  public ReportingFacebookAdReportResponseAllOf1ReportSummary comments(Integer comments) {
    
    
    
    
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getComments() {
    return comments;
  }


  public void setComments(Integer comments) {
    
    
    
    this.comments = comments;
  }


  public ReportingFacebookAdReportResponseAllOf1ReportSummary shares(Integer shares) {
    
    
    
    
    this.shares = shares;
    return this;
  }

   /**
   * Get shares
   * @return shares
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getShares() {
    return shares;
  }


  public void setShares(Integer shares) {
    
    
    
    this.shares = shares;
  }


  public ReportingFacebookAdReportResponseAllOf1ReportSummary hasExtendedAdDuration(Boolean hasExtendedAdDuration) {
    
    
    
    
    this.hasExtendedAdDuration = hasExtendedAdDuration;
    return this;
  }

   /**
   * Get hasExtendedAdDuration
   * @return hasExtendedAdDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasExtendedAdDuration() {
    return hasExtendedAdDuration;
  }


  public void setHasExtendedAdDuration(Boolean hasExtendedAdDuration) {
    
    
    
    this.hasExtendedAdDuration = hasExtendedAdDuration;
  }


  public ReportingFacebookAdReportResponseAllOf1ReportSummary extendedAt(ReportingFacebookAdReportResponseAllOf1ReportSummaryExtendedAt extendedAt) {
    
    
    
    
    this.extendedAt = extendedAt;
    return this;
  }

   /**
   * Get extendedAt
   * @return extendedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReportingFacebookAdReportResponseAllOf1ReportSummaryExtendedAt getExtendedAt() {
    return extendedAt;
  }


  public void setExtendedAt(ReportingFacebookAdReportResponseAllOf1ReportSummaryExtendedAt extendedAt) {
    
    
    
    this.extendedAt = extendedAt;
  }


  public ReportingFacebookAdReportResponseAllOf1ReportSummary returnOnInvestment(Double returnOnInvestment) {
    
    
    
    
    this.returnOnInvestment = returnOnInvestment;
    return this;
  }

  public ReportingFacebookAdReportResponseAllOf1ReportSummary returnOnInvestment(Integer returnOnInvestment) {
    
    
    
    
    this.returnOnInvestment = returnOnInvestment.doubleValue();
    return this;
  }

   /**
   * Get returnOnInvestment
   * @return returnOnInvestment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getReturnOnInvestment() {
    return returnOnInvestment;
  }


  public void setReturnOnInvestment(Double returnOnInvestment) {
    
    
    
    this.returnOnInvestment = returnOnInvestment;
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
   * @return the ReportingFacebookAdReportResponseAllOf1ReportSummary instance itself
   */
  public ReportingFacebookAdReportResponseAllOf1ReportSummary putAdditionalProperty(String key, Object value) {
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
    ReportingFacebookAdReportResponseAllOf1ReportSummary reportingFacebookAdReportResponseAllOf1ReportSummary = (ReportingFacebookAdReportResponseAllOf1ReportSummary) o;
    return Objects.equals(this.reach, reportingFacebookAdReportResponseAllOf1ReportSummary.reach) &&
        Objects.equals(this.impressions, reportingFacebookAdReportResponseAllOf1ReportSummary.impressions) &&
        Objects.equals(this.clicks, reportingFacebookAdReportResponseAllOf1ReportSummary.clicks) &&
        Objects.equals(this.clickRate, reportingFacebookAdReportResponseAllOf1ReportSummary.clickRate) &&
        Objects.equals(this.uniqueClicks, reportingFacebookAdReportResponseAllOf1ReportSummary.uniqueClicks) &&
        Objects.equals(this.firstTimeBuyers, reportingFacebookAdReportResponseAllOf1ReportSummary.firstTimeBuyers) &&
        Objects.equals(this.ecommerce, reportingFacebookAdReportResponseAllOf1ReportSummary.ecommerce) &&
        Objects.equals(this.totalProductsSold, reportingFacebookAdReportResponseAllOf1ReportSummary.totalProductsSold) &&
        Objects.equals(this.totalOrders, reportingFacebookAdReportResponseAllOf1ReportSummary.totalOrders) &&
        Objects.equals(this.averageOrderAmount, reportingFacebookAdReportResponseAllOf1ReportSummary.averageOrderAmount) &&
        Objects.equals(this.costPerClick, reportingFacebookAdReportResponseAllOf1ReportSummary.costPerClick) &&
        Objects.equals(this.averageDailyBudget, reportingFacebookAdReportResponseAllOf1ReportSummary.averageDailyBudget) &&
        Objects.equals(this.likes, reportingFacebookAdReportResponseAllOf1ReportSummary.likes) &&
        Objects.equals(this.comments, reportingFacebookAdReportResponseAllOf1ReportSummary.comments) &&
        Objects.equals(this.shares, reportingFacebookAdReportResponseAllOf1ReportSummary.shares) &&
        Objects.equals(this.hasExtendedAdDuration, reportingFacebookAdReportResponseAllOf1ReportSummary.hasExtendedAdDuration) &&
        Objects.equals(this.extendedAt, reportingFacebookAdReportResponseAllOf1ReportSummary.extendedAt) &&
        Objects.equals(this.returnOnInvestment, reportingFacebookAdReportResponseAllOf1ReportSummary.returnOnInvestment)&&
        Objects.equals(this.additionalProperties, reportingFacebookAdReportResponseAllOf1ReportSummary.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reach, impressions, clicks, clickRate, uniqueClicks, firstTimeBuyers, ecommerce, totalProductsSold, totalOrders, averageOrderAmount, costPerClick, averageDailyBudget, likes, comments, shares, hasExtendedAdDuration, extendedAt, returnOnInvestment, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingFacebookAdReportResponseAllOf1ReportSummary {\n");
    sb.append("    reach: ").append(toIndentedString(reach)).append("\n");
    sb.append("    impressions: ").append(toIndentedString(impressions)).append("\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
    sb.append("    clickRate: ").append(toIndentedString(clickRate)).append("\n");
    sb.append("    uniqueClicks: ").append(toIndentedString(uniqueClicks)).append("\n");
    sb.append("    firstTimeBuyers: ").append(toIndentedString(firstTimeBuyers)).append("\n");
    sb.append("    ecommerce: ").append(toIndentedString(ecommerce)).append("\n");
    sb.append("    totalProductsSold: ").append(toIndentedString(totalProductsSold)).append("\n");
    sb.append("    totalOrders: ").append(toIndentedString(totalOrders)).append("\n");
    sb.append("    averageOrderAmount: ").append(toIndentedString(averageOrderAmount)).append("\n");
    sb.append("    costPerClick: ").append(toIndentedString(costPerClick)).append("\n");
    sb.append("    averageDailyBudget: ").append(toIndentedString(averageDailyBudget)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
    sb.append("    hasExtendedAdDuration: ").append(toIndentedString(hasExtendedAdDuration)).append("\n");
    sb.append("    extendedAt: ").append(toIndentedString(extendedAt)).append("\n");
    sb.append("    returnOnInvestment: ").append(toIndentedString(returnOnInvestment)).append("\n");
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
    openapiFields.add("reach");
    openapiFields.add("impressions");
    openapiFields.add("clicks");
    openapiFields.add("click_rate");
    openapiFields.add("unique_clicks");
    openapiFields.add("first_time_buyers");
    openapiFields.add("ecommerce");
    openapiFields.add("total_products_sold");
    openapiFields.add("total_orders");
    openapiFields.add("average_order_amount");
    openapiFields.add("cost_per_click");
    openapiFields.add("average_daily_budget");
    openapiFields.add("likes");
    openapiFields.add("comments");
    openapiFields.add("shares");
    openapiFields.add("has_extended_ad_duration");
    openapiFields.add("extended_at");
    openapiFields.add("return_on_investment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReportingFacebookAdReportResponseAllOf1ReportSummary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReportingFacebookAdReportResponseAllOf1ReportSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportingFacebookAdReportResponseAllOf1ReportSummary is not found in the empty JSON string", ReportingFacebookAdReportResponseAllOf1ReportSummary.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `ecommerce`
      if (jsonObj.get("ecommerce") != null && !jsonObj.get("ecommerce").isJsonNull()) {
        ReportingFacebookAdReportResponseAllOf1ReportSummaryEcommerce.validateJsonObject(jsonObj.getAsJsonObject("ecommerce"));
      }
      // validate the optional field `average_order_amount`
      if (jsonObj.get("average_order_amount") != null && !jsonObj.get("average_order_amount").isJsonNull()) {
        ReportingFacebookAdReportResponseAllOf1ReportSummaryAverageOrderAmount.validateJsonObject(jsonObj.getAsJsonObject("average_order_amount"));
      }
      // validate the optional field `cost_per_click`
      if (jsonObj.get("cost_per_click") != null && !jsonObj.get("cost_per_click").isJsonNull()) {
        ReportingFacebookAdReportResponseAllOf1ReportSummaryAverageOrderAmount.validateJsonObject(jsonObj.getAsJsonObject("cost_per_click"));
      }
      // validate the optional field `average_daily_budget`
      if (jsonObj.get("average_daily_budget") != null && !jsonObj.get("average_daily_budget").isJsonNull()) {
        ReportingFacebookAdReportResponseAllOf1ReportSummaryAverageOrderAmount.validateJsonObject(jsonObj.getAsJsonObject("average_daily_budget"));
      }
      // validate the optional field `extended_at`
      if (jsonObj.get("extended_at") != null && !jsonObj.get("extended_at").isJsonNull()) {
        ReportingFacebookAdReportResponseAllOf1ReportSummaryExtendedAt.validateJsonObject(jsonObj.getAsJsonObject("extended_at"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportingFacebookAdReportResponseAllOf1ReportSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportingFacebookAdReportResponseAllOf1ReportSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportingFacebookAdReportResponseAllOf1ReportSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportingFacebookAdReportResponseAllOf1ReportSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportingFacebookAdReportResponseAllOf1ReportSummary>() {
           @Override
           public void write(JsonWriter out, ReportingFacebookAdReportResponseAllOf1ReportSummary value) throws IOException {
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
           public ReportingFacebookAdReportResponseAllOf1ReportSummary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReportingFacebookAdReportResponseAllOf1ReportSummary instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ReportingFacebookAdReportResponseAllOf1ReportSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportingFacebookAdReportResponseAllOf1ReportSummary
  * @throws IOException if the JSON string is invalid with respect to ReportingFacebookAdReportResponseAllOf1ReportSummary
  */
  public static ReportingFacebookAdReportResponseAllOf1ReportSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportingFacebookAdReportResponseAllOf1ReportSummary.class);
  }

 /**
  * Convert an instance of ReportingFacebookAdReportResponseAllOf1ReportSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

