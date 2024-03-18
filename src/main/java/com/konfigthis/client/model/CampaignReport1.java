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
import com.konfigthis.client.model.ABSplitStatsProperty;
import com.konfigthis.client.model.BouncesProperty;
import com.konfigthis.client.model.CampaignDeliveryStatusProperty;
import com.konfigthis.client.model.ClicksProperty;
import com.konfigthis.client.model.ECommerceReportProperty2;
import com.konfigthis.client.model.FacebookLikesProperty;
import com.konfigthis.client.model.ForwardsProperty;
import com.konfigthis.client.model.IndustryStatsProperty1;
import com.konfigthis.client.model.ListStatsProperty;
import com.konfigthis.client.model.OpensProperty;
import com.konfigthis.client.model.ResourceLink;
import com.konfigthis.client.model.ShareReportProperty;
import com.konfigthis.client.model.TimeseriesPropertyInner;
import com.konfigthis.client.model.TimewarpStatsPropertyInner;
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
 * Report details about a sent campaign.
 */
@ApiModel(description = "Report details about a sent campaign.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CampaignReport1 {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CAMPAIGN_TITLE = "campaign_title";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_TITLE)
  private String campaignTitle;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_LIST_ID = "list_id";
  @SerializedName(SERIALIZED_NAME_LIST_ID)
  private String listId;

  public static final String SERIALIZED_NAME_LIST_IS_ACTIVE = "list_is_active";
  @SerializedName(SERIALIZED_NAME_LIST_IS_ACTIVE)
  private Boolean listIsActive;

  public static final String SERIALIZED_NAME_LIST_NAME = "list_name";
  @SerializedName(SERIALIZED_NAME_LIST_NAME)
  private String listName;

  public static final String SERIALIZED_NAME_SUBJECT_LINE = "subject_line";
  @SerializedName(SERIALIZED_NAME_SUBJECT_LINE)
  private String subjectLine;

  public static final String SERIALIZED_NAME_PREVIEW_TEXT = "preview_text";
  @SerializedName(SERIALIZED_NAME_PREVIEW_TEXT)
  private String previewText;

  public static final String SERIALIZED_NAME_EMAILS_SENT = "emails_sent";
  @SerializedName(SERIALIZED_NAME_EMAILS_SENT)
  private Integer emailsSent;

  public static final String SERIALIZED_NAME_ABUSE_REPORTS = "abuse_reports";
  @SerializedName(SERIALIZED_NAME_ABUSE_REPORTS)
  private Integer abuseReports;

  public static final String SERIALIZED_NAME_UNSUBSCRIBED = "unsubscribed";
  @SerializedName(SERIALIZED_NAME_UNSUBSCRIBED)
  private Integer unsubscribed;

  public static final String SERIALIZED_NAME_SEND_TIME = "send_time";
  @SerializedName(SERIALIZED_NAME_SEND_TIME)
  private OffsetDateTime sendTime;

  public static final String SERIALIZED_NAME_RSS_LAST_SEND = "rss_last_send";
  @SerializedName(SERIALIZED_NAME_RSS_LAST_SEND)
  private OffsetDateTime rssLastSend;

  public static final String SERIALIZED_NAME_BOUNCES = "bounces";
  @SerializedName(SERIALIZED_NAME_BOUNCES)
  private BouncesProperty bounces;

  public static final String SERIALIZED_NAME_FORWARDS = "forwards";
  @SerializedName(SERIALIZED_NAME_FORWARDS)
  private ForwardsProperty forwards;

  public static final String SERIALIZED_NAME_OPENS = "opens";
  @SerializedName(SERIALIZED_NAME_OPENS)
  private OpensProperty opens;

  public static final String SERIALIZED_NAME_CLICKS = "clicks";
  @SerializedName(SERIALIZED_NAME_CLICKS)
  private ClicksProperty clicks;

  public static final String SERIALIZED_NAME_FACEBOOK_LIKES = "facebook_likes";
  @SerializedName(SERIALIZED_NAME_FACEBOOK_LIKES)
  private FacebookLikesProperty facebookLikes;

  public static final String SERIALIZED_NAME_INDUSTRY_STATS = "industry_stats";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_STATS)
  private IndustryStatsProperty1 industryStats;

  public static final String SERIALIZED_NAME_LIST_STATS = "list_stats";
  @SerializedName(SERIALIZED_NAME_LIST_STATS)
  private ListStatsProperty listStats;

  public static final String SERIALIZED_NAME_AB_SPLIT = "ab_split";
  @SerializedName(SERIALIZED_NAME_AB_SPLIT)
  private ABSplitStatsProperty abSplit;

  public static final String SERIALIZED_NAME_TIMEWARP = "timewarp";
  @SerializedName(SERIALIZED_NAME_TIMEWARP)
  private List<TimewarpStatsPropertyInner> timewarp = null;

  public static final String SERIALIZED_NAME_TIMESERIES = "timeseries";
  @SerializedName(SERIALIZED_NAME_TIMESERIES)
  private List<TimeseriesPropertyInner> timeseries = null;

  public static final String SERIALIZED_NAME_SHARE_REPORT = "share_report";
  @SerializedName(SERIALIZED_NAME_SHARE_REPORT)
  private ShareReportProperty shareReport;

  public static final String SERIALIZED_NAME_ECOMMERCE = "ecommerce";
  @SerializedName(SERIALIZED_NAME_ECOMMERCE)
  private ECommerceReportProperty2 ecommerce;

  public static final String SERIALIZED_NAME_DELIVERY_STATUS = "delivery_status";
  @SerializedName(SERIALIZED_NAME_DELIVERY_STATUS)
  private CampaignDeliveryStatusProperty deliveryStatus;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<ResourceLink> links = null;

  public CampaignReport1() {
  }

  
  public CampaignReport1(
     String campaignTitle, 
     String listId, 
     Boolean listIsActive, 
     String listName, 
     String subjectLine, 
     Integer unsubscribed, 
     OffsetDateTime sendTime, 
     OffsetDateTime rssLastSend, 
     List<ResourceLink> links
  ) {
    this();
    this.campaignTitle = campaignTitle;
    this.listId = listId;
    this.listIsActive = listIsActive;
    this.listName = listName;
    this.subjectLine = subjectLine;
    this.unsubscribed = unsubscribed;
    this.sendTime = sendTime;
    this.rssLastSend = rssLastSend;
    this.links = links;
  }

  public CampaignReport1 id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * A string that uniquely identifies this campaign.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A string that uniquely identifies this campaign.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


   /**
   * The title of the campaign.
   * @return campaignTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The title of the campaign.")

  public String getCampaignTitle() {
    return campaignTitle;
  }




  public CampaignReport1 type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * The type of campaign (regular, plain-text, ab_split, rss, automation, variate, or auto).
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of campaign (regular, plain-text, ab_split, rss, automation, variate, or auto).")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


   /**
   * The unique list id.
   * @return listId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique list id.")

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
   * The name of the list.
   * @return listName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the list.")

  public String getListName() {
    return listName;
  }




   /**
   * The subject line for the campaign.
   * @return subjectLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The subject line for the campaign.")

  public String getSubjectLine() {
    return subjectLine;
  }




  public CampaignReport1 previewText(String previewText) {
    
    
    
    
    this.previewText = previewText;
    return this;
  }

   /**
   * The preview text for the campaign.
   * @return previewText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The preview text for the campaign.")

  public String getPreviewText() {
    return previewText;
  }


  public void setPreviewText(String previewText) {
    
    
    
    this.previewText = previewText;
  }


  public CampaignReport1 emailsSent(Integer emailsSent) {
    
    
    
    
    this.emailsSent = emailsSent;
    return this;
  }

   /**
   * The total number of emails sent for this campaign.
   * @return emailsSent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of emails sent for this campaign.")

  public Integer getEmailsSent() {
    return emailsSent;
  }


  public void setEmailsSent(Integer emailsSent) {
    
    
    
    this.emailsSent = emailsSent;
  }


  public CampaignReport1 abuseReports(Integer abuseReports) {
    
    
    
    
    this.abuseReports = abuseReports;
    return this;
  }

   /**
   * The number of abuse reports generated for this campaign.
   * @return abuseReports
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of abuse reports generated for this campaign.")

  public Integer getAbuseReports() {
    return abuseReports;
  }


  public void setAbuseReports(Integer abuseReports) {
    
    
    
    this.abuseReports = abuseReports;
  }


   /**
   * The total number of unsubscribed members for this campaign.
   * @return unsubscribed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of unsubscribed members for this campaign.")

  public Integer getUnsubscribed() {
    return unsubscribed;
  }




   /**
   * The date and time a campaign was sent in ISO 8601 format.
   * @return sendTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time a campaign was sent in ISO 8601 format.")

  public OffsetDateTime getSendTime() {
    return sendTime;
  }




   /**
   * For RSS campaigns, the date and time of the last send in ISO 8601 format.
   * @return rssLastSend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For RSS campaigns, the date and time of the last send in ISO 8601 format.")

  public OffsetDateTime getRssLastSend() {
    return rssLastSend;
  }




  public CampaignReport1 bounces(BouncesProperty bounces) {
    
    
    
    
    this.bounces = bounces;
    return this;
  }

   /**
   * Get bounces
   * @return bounces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BouncesProperty getBounces() {
    return bounces;
  }


  public void setBounces(BouncesProperty bounces) {
    
    
    
    this.bounces = bounces;
  }


  public CampaignReport1 forwards(ForwardsProperty forwards) {
    
    
    
    
    this.forwards = forwards;
    return this;
  }

   /**
   * Get forwards
   * @return forwards
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ForwardsProperty getForwards() {
    return forwards;
  }


  public void setForwards(ForwardsProperty forwards) {
    
    
    
    this.forwards = forwards;
  }


  public CampaignReport1 opens(OpensProperty opens) {
    
    
    
    
    this.opens = opens;
    return this;
  }

   /**
   * Get opens
   * @return opens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OpensProperty getOpens() {
    return opens;
  }


  public void setOpens(OpensProperty opens) {
    
    
    
    this.opens = opens;
  }


  public CampaignReport1 clicks(ClicksProperty clicks) {
    
    
    
    
    this.clicks = clicks;
    return this;
  }

   /**
   * Get clicks
   * @return clicks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClicksProperty getClicks() {
    return clicks;
  }


  public void setClicks(ClicksProperty clicks) {
    
    
    
    this.clicks = clicks;
  }


  public CampaignReport1 facebookLikes(FacebookLikesProperty facebookLikes) {
    
    
    
    
    this.facebookLikes = facebookLikes;
    return this;
  }

   /**
   * Get facebookLikes
   * @return facebookLikes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FacebookLikesProperty getFacebookLikes() {
    return facebookLikes;
  }


  public void setFacebookLikes(FacebookLikesProperty facebookLikes) {
    
    
    
    this.facebookLikes = facebookLikes;
  }


  public CampaignReport1 industryStats(IndustryStatsProperty1 industryStats) {
    
    
    
    
    this.industryStats = industryStats;
    return this;
  }

   /**
   * Get industryStats
   * @return industryStats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IndustryStatsProperty1 getIndustryStats() {
    return industryStats;
  }


  public void setIndustryStats(IndustryStatsProperty1 industryStats) {
    
    
    
    this.industryStats = industryStats;
  }


  public CampaignReport1 listStats(ListStatsProperty listStats) {
    
    
    
    
    this.listStats = listStats;
    return this;
  }

   /**
   * Get listStats
   * @return listStats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ListStatsProperty getListStats() {
    return listStats;
  }


  public void setListStats(ListStatsProperty listStats) {
    
    
    
    this.listStats = listStats;
  }


  public CampaignReport1 abSplit(ABSplitStatsProperty abSplit) {
    
    
    
    
    this.abSplit = abSplit;
    return this;
  }

   /**
   * Get abSplit
   * @return abSplit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ABSplitStatsProperty getAbSplit() {
    return abSplit;
  }


  public void setAbSplit(ABSplitStatsProperty abSplit) {
    
    
    
    this.abSplit = abSplit;
  }


  public CampaignReport1 timewarp(List<TimewarpStatsPropertyInner> timewarp) {
    
    
    
    
    this.timewarp = timewarp;
    return this;
  }

  public CampaignReport1 addTimewarpItem(TimewarpStatsPropertyInner timewarpItem) {
    if (this.timewarp == null) {
      this.timewarp = new ArrayList<>();
    }
    this.timewarp.add(timewarpItem);
    return this;
  }

   /**
   * An hourly breakdown of sends, opens, and clicks if a campaign is sent using timewarp.
   * @return timewarp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An hourly breakdown of sends, opens, and clicks if a campaign is sent using timewarp.")

  public List<TimewarpStatsPropertyInner> getTimewarp() {
    return timewarp;
  }


  public void setTimewarp(List<TimewarpStatsPropertyInner> timewarp) {
    
    
    
    this.timewarp = timewarp;
  }


  public CampaignReport1 timeseries(List<TimeseriesPropertyInner> timeseries) {
    
    
    
    
    this.timeseries = timeseries;
    return this;
  }

  public CampaignReport1 addTimeseriesItem(TimeseriesPropertyInner timeseriesItem) {
    if (this.timeseries == null) {
      this.timeseries = new ArrayList<>();
    }
    this.timeseries.add(timeseriesItem);
    return this;
  }

   /**
   * An hourly breakdown of the performance of the campaign over the first 24 hours.
   * @return timeseries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An hourly breakdown of the performance of the campaign over the first 24 hours.")

  public List<TimeseriesPropertyInner> getTimeseries() {
    return timeseries;
  }


  public void setTimeseries(List<TimeseriesPropertyInner> timeseries) {
    
    
    
    this.timeseries = timeseries;
  }


  public CampaignReport1 shareReport(ShareReportProperty shareReport) {
    
    
    
    
    this.shareReport = shareReport;
    return this;
  }

   /**
   * Get shareReport
   * @return shareReport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShareReportProperty getShareReport() {
    return shareReport;
  }


  public void setShareReport(ShareReportProperty shareReport) {
    
    
    
    this.shareReport = shareReport;
  }


  public CampaignReport1 ecommerce(ECommerceReportProperty2 ecommerce) {
    
    
    
    
    this.ecommerce = ecommerce;
    return this;
  }

   /**
   * Get ecommerce
   * @return ecommerce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ECommerceReportProperty2 getEcommerce() {
    return ecommerce;
  }


  public void setEcommerce(ECommerceReportProperty2 ecommerce) {
    
    
    
    this.ecommerce = ecommerce;
  }


  public CampaignReport1 deliveryStatus(CampaignDeliveryStatusProperty deliveryStatus) {
    
    
    
    
    this.deliveryStatus = deliveryStatus;
    return this;
  }

   /**
   * Get deliveryStatus
   * @return deliveryStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CampaignDeliveryStatusProperty getDeliveryStatus() {
    return deliveryStatus;
  }


  public void setDeliveryStatus(CampaignDeliveryStatusProperty deliveryStatus) {
    
    
    
    this.deliveryStatus = deliveryStatus;
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
   * @return the CampaignReport1 instance itself
   */
  public CampaignReport1 putAdditionalProperty(String key, Object value) {
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
    CampaignReport1 campaignReport1 = (CampaignReport1) o;
    return Objects.equals(this.id, campaignReport1.id) &&
        Objects.equals(this.campaignTitle, campaignReport1.campaignTitle) &&
        Objects.equals(this.type, campaignReport1.type) &&
        Objects.equals(this.listId, campaignReport1.listId) &&
        Objects.equals(this.listIsActive, campaignReport1.listIsActive) &&
        Objects.equals(this.listName, campaignReport1.listName) &&
        Objects.equals(this.subjectLine, campaignReport1.subjectLine) &&
        Objects.equals(this.previewText, campaignReport1.previewText) &&
        Objects.equals(this.emailsSent, campaignReport1.emailsSent) &&
        Objects.equals(this.abuseReports, campaignReport1.abuseReports) &&
        Objects.equals(this.unsubscribed, campaignReport1.unsubscribed) &&
        Objects.equals(this.sendTime, campaignReport1.sendTime) &&
        Objects.equals(this.rssLastSend, campaignReport1.rssLastSend) &&
        Objects.equals(this.bounces, campaignReport1.bounces) &&
        Objects.equals(this.forwards, campaignReport1.forwards) &&
        Objects.equals(this.opens, campaignReport1.opens) &&
        Objects.equals(this.clicks, campaignReport1.clicks) &&
        Objects.equals(this.facebookLikes, campaignReport1.facebookLikes) &&
        Objects.equals(this.industryStats, campaignReport1.industryStats) &&
        Objects.equals(this.listStats, campaignReport1.listStats) &&
        Objects.equals(this.abSplit, campaignReport1.abSplit) &&
        Objects.equals(this.timewarp, campaignReport1.timewarp) &&
        Objects.equals(this.timeseries, campaignReport1.timeseries) &&
        Objects.equals(this.shareReport, campaignReport1.shareReport) &&
        Objects.equals(this.ecommerce, campaignReport1.ecommerce) &&
        Objects.equals(this.deliveryStatus, campaignReport1.deliveryStatus) &&
        Objects.equals(this.links, campaignReport1.links)&&
        Objects.equals(this.additionalProperties, campaignReport1.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, campaignTitle, type, listId, listIsActive, listName, subjectLine, previewText, emailsSent, abuseReports, unsubscribed, sendTime, rssLastSend, bounces, forwards, opens, clicks, facebookLikes, industryStats, listStats, abSplit, timewarp, timeseries, shareReport, ecommerce, deliveryStatus, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignReport1 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    campaignTitle: ").append(toIndentedString(campaignTitle)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    listIsActive: ").append(toIndentedString(listIsActive)).append("\n");
    sb.append("    listName: ").append(toIndentedString(listName)).append("\n");
    sb.append("    subjectLine: ").append(toIndentedString(subjectLine)).append("\n");
    sb.append("    previewText: ").append(toIndentedString(previewText)).append("\n");
    sb.append("    emailsSent: ").append(toIndentedString(emailsSent)).append("\n");
    sb.append("    abuseReports: ").append(toIndentedString(abuseReports)).append("\n");
    sb.append("    unsubscribed: ").append(toIndentedString(unsubscribed)).append("\n");
    sb.append("    sendTime: ").append(toIndentedString(sendTime)).append("\n");
    sb.append("    rssLastSend: ").append(toIndentedString(rssLastSend)).append("\n");
    sb.append("    bounces: ").append(toIndentedString(bounces)).append("\n");
    sb.append("    forwards: ").append(toIndentedString(forwards)).append("\n");
    sb.append("    opens: ").append(toIndentedString(opens)).append("\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
    sb.append("    facebookLikes: ").append(toIndentedString(facebookLikes)).append("\n");
    sb.append("    industryStats: ").append(toIndentedString(industryStats)).append("\n");
    sb.append("    listStats: ").append(toIndentedString(listStats)).append("\n");
    sb.append("    abSplit: ").append(toIndentedString(abSplit)).append("\n");
    sb.append("    timewarp: ").append(toIndentedString(timewarp)).append("\n");
    sb.append("    timeseries: ").append(toIndentedString(timeseries)).append("\n");
    sb.append("    shareReport: ").append(toIndentedString(shareReport)).append("\n");
    sb.append("    ecommerce: ").append(toIndentedString(ecommerce)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
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
    openapiFields.add("campaign_title");
    openapiFields.add("type");
    openapiFields.add("list_id");
    openapiFields.add("list_is_active");
    openapiFields.add("list_name");
    openapiFields.add("subject_line");
    openapiFields.add("preview_text");
    openapiFields.add("emails_sent");
    openapiFields.add("abuse_reports");
    openapiFields.add("unsubscribed");
    openapiFields.add("send_time");
    openapiFields.add("rss_last_send");
    openapiFields.add("bounces");
    openapiFields.add("forwards");
    openapiFields.add("opens");
    openapiFields.add("clicks");
    openapiFields.add("facebook_likes");
    openapiFields.add("industry_stats");
    openapiFields.add("list_stats");
    openapiFields.add("ab_split");
    openapiFields.add("timewarp");
    openapiFields.add("timeseries");
    openapiFields.add("share_report");
    openapiFields.add("ecommerce");
    openapiFields.add("delivery_status");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CampaignReport1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CampaignReport1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CampaignReport1 is not found in the empty JSON string", CampaignReport1.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("campaign_title") != null && !jsonObj.get("campaign_title").isJsonNull()) && !jsonObj.get("campaign_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaign_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaign_title").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("list_id") != null && !jsonObj.get("list_id").isJsonNull()) && !jsonObj.get("list_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `list_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("list_id").toString()));
      }
      if ((jsonObj.get("list_name") != null && !jsonObj.get("list_name").isJsonNull()) && !jsonObj.get("list_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `list_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("list_name").toString()));
      }
      if ((jsonObj.get("subject_line") != null && !jsonObj.get("subject_line").isJsonNull()) && !jsonObj.get("subject_line").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject_line` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject_line").toString()));
      }
      if ((jsonObj.get("preview_text") != null && !jsonObj.get("preview_text").isJsonNull()) && !jsonObj.get("preview_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preview_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preview_text").toString()));
      }
      // validate the optional field `bounces`
      if (jsonObj.get("bounces") != null && !jsonObj.get("bounces").isJsonNull()) {
        BouncesProperty.validateJsonObject(jsonObj.getAsJsonObject("bounces"));
      }
      // validate the optional field `forwards`
      if (jsonObj.get("forwards") != null && !jsonObj.get("forwards").isJsonNull()) {
        ForwardsProperty.validateJsonObject(jsonObj.getAsJsonObject("forwards"));
      }
      // validate the optional field `opens`
      if (jsonObj.get("opens") != null && !jsonObj.get("opens").isJsonNull()) {
        OpensProperty.validateJsonObject(jsonObj.getAsJsonObject("opens"));
      }
      // validate the optional field `clicks`
      if (jsonObj.get("clicks") != null && !jsonObj.get("clicks").isJsonNull()) {
        ClicksProperty.validateJsonObject(jsonObj.getAsJsonObject("clicks"));
      }
      // validate the optional field `facebook_likes`
      if (jsonObj.get("facebook_likes") != null && !jsonObj.get("facebook_likes").isJsonNull()) {
        FacebookLikesProperty.validateJsonObject(jsonObj.getAsJsonObject("facebook_likes"));
      }
      // validate the optional field `industry_stats`
      if (jsonObj.get("industry_stats") != null && !jsonObj.get("industry_stats").isJsonNull()) {
        IndustryStatsProperty1.validateJsonObject(jsonObj.getAsJsonObject("industry_stats"));
      }
      // validate the optional field `list_stats`
      if (jsonObj.get("list_stats") != null && !jsonObj.get("list_stats").isJsonNull()) {
        ListStatsProperty.validateJsonObject(jsonObj.getAsJsonObject("list_stats"));
      }
      // validate the optional field `ab_split`
      if (jsonObj.get("ab_split") != null && !jsonObj.get("ab_split").isJsonNull()) {
        ABSplitStatsProperty.validateJsonObject(jsonObj.getAsJsonObject("ab_split"));
      }
      if (jsonObj.get("timewarp") != null && !jsonObj.get("timewarp").isJsonNull()) {
        JsonArray jsonArraytimewarp = jsonObj.getAsJsonArray("timewarp");
        if (jsonArraytimewarp != null) {
          // ensure the json data is an array
          if (!jsonObj.get("timewarp").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `timewarp` to be an array in the JSON string but got `%s`", jsonObj.get("timewarp").toString()));
          }

          // validate the optional field `timewarp` (array)
          for (int i = 0; i < jsonArraytimewarp.size(); i++) {
            TimewarpStatsPropertyInner.validateJsonObject(jsonArraytimewarp.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("timeseries") != null && !jsonObj.get("timeseries").isJsonNull()) {
        JsonArray jsonArraytimeseries = jsonObj.getAsJsonArray("timeseries");
        if (jsonArraytimeseries != null) {
          // ensure the json data is an array
          if (!jsonObj.get("timeseries").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `timeseries` to be an array in the JSON string but got `%s`", jsonObj.get("timeseries").toString()));
          }

          // validate the optional field `timeseries` (array)
          for (int i = 0; i < jsonArraytimeseries.size(); i++) {
            TimeseriesPropertyInner.validateJsonObject(jsonArraytimeseries.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `share_report`
      if (jsonObj.get("share_report") != null && !jsonObj.get("share_report").isJsonNull()) {
        ShareReportProperty.validateJsonObject(jsonObj.getAsJsonObject("share_report"));
      }
      // validate the optional field `ecommerce`
      if (jsonObj.get("ecommerce") != null && !jsonObj.get("ecommerce").isJsonNull()) {
        ECommerceReportProperty2.validateJsonObject(jsonObj.getAsJsonObject("ecommerce"));
      }
      // validate the optional field `delivery_status`
      if (jsonObj.get("delivery_status") != null && !jsonObj.get("delivery_status").isJsonNull()) {
        CampaignDeliveryStatusProperty.validateJsonObject(jsonObj.getAsJsonObject("delivery_status"));
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
       if (!CampaignReport1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CampaignReport1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CampaignReport1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CampaignReport1.class));

       return (TypeAdapter<T>) new TypeAdapter<CampaignReport1>() {
           @Override
           public void write(JsonWriter out, CampaignReport1 value) throws IOException {
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
           public CampaignReport1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CampaignReport1 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CampaignReport1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignReport1
  * @throws IOException if the JSON string is invalid with respect to CampaignReport1
  */
  public static CampaignReport1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignReport1.class);
  }

 /**
  * Convert an instance of CampaignReport1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

