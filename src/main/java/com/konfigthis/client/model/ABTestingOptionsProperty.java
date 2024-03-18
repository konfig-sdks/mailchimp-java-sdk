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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

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
 * [A/B Testing](https://mailchimp.com/help/about-ab-testing-campaigns/) options for a campaign.
 */
@ApiModel(description = "[A/B Testing](https://mailchimp.com/help/about-ab-testing-campaigns/) options for a campaign.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ABTestingOptionsProperty {
  /**
   * The type of AB split to run.
   */
  @JsonAdapter(SplitTestEnum.Adapter.class)
 public enum SplitTestEnum {
    SUBJECT("subject"),
    
    FROM_NAME("from_name"),
    
    SCHEDULE("schedule");

    private String value;

    SplitTestEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SplitTestEnum fromValue(String value) {
      for (SplitTestEnum b : SplitTestEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SplitTestEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SplitTestEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SplitTestEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SplitTestEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SPLIT_TEST = "split_test";
  @SerializedName(SERIALIZED_NAME_SPLIT_TEST)
  private SplitTestEnum splitTest;

  /**
   * How we should evaluate a winner. Based on &#39;opens&#39;, &#39;clicks&#39;, or &#39;manual&#39;.
   */
  @JsonAdapter(PickWinnerEnum.Adapter.class)
 public enum PickWinnerEnum {
    OPENS("opens"),
    
    CLICKS("clicks"),
    
    MANUAL("manual");

    private String value;

    PickWinnerEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PickWinnerEnum fromValue(String value) {
      for (PickWinnerEnum b : PickWinnerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PickWinnerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PickWinnerEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PickWinnerEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PickWinnerEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PICK_WINNER = "pick_winner";
  @SerializedName(SERIALIZED_NAME_PICK_WINNER)
  private PickWinnerEnum pickWinner;

  /**
   * How unit of time for measuring the winner (&#39;hours&#39; or &#39;days&#39;). This cannot be changed after a campaign is sent.
   */
  @JsonAdapter(WaitUnitsEnum.Adapter.class)
 public enum WaitUnitsEnum {
    HOURS("hours"),
    
    DAYS("days");

    private String value;

    WaitUnitsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WaitUnitsEnum fromValue(String value) {
      for (WaitUnitsEnum b : WaitUnitsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WaitUnitsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WaitUnitsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WaitUnitsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WaitUnitsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_WAIT_UNITS = "wait_units";
  @SerializedName(SERIALIZED_NAME_WAIT_UNITS)
  private WaitUnitsEnum waitUnits;

  public static final String SERIALIZED_NAME_WAIT_TIME = "wait_time";
  @SerializedName(SERIALIZED_NAME_WAIT_TIME)
  private Integer waitTime;

  public static final String SERIALIZED_NAME_SPLIT_SIZE = "split_size";
  @SerializedName(SERIALIZED_NAME_SPLIT_SIZE)
  private Integer splitSize;

  public static final String SERIALIZED_NAME_FROM_NAME_A = "from_name_a";
  @SerializedName(SERIALIZED_NAME_FROM_NAME_A)
  private String fromNameA;

  public static final String SERIALIZED_NAME_FROM_NAME_B = "from_name_b";
  @SerializedName(SERIALIZED_NAME_FROM_NAME_B)
  private String fromNameB;

  public static final String SERIALIZED_NAME_REPLY_EMAIL_A = "reply_email_a";
  @SerializedName(SERIALIZED_NAME_REPLY_EMAIL_A)
  private String replyEmailA;

  public static final String SERIALIZED_NAME_REPLY_EMAIL_B = "reply_email_b";
  @SerializedName(SERIALIZED_NAME_REPLY_EMAIL_B)
  private String replyEmailB;

  public static final String SERIALIZED_NAME_SUBJECT_A = "subject_a";
  @SerializedName(SERIALIZED_NAME_SUBJECT_A)
  private String subjectA;

  public static final String SERIALIZED_NAME_SUBJECT_B = "subject_b";
  @SerializedName(SERIALIZED_NAME_SUBJECT_B)
  private String subjectB;

  public static final String SERIALIZED_NAME_SEND_TIME_A = "send_time_a";
  @SerializedName(SERIALIZED_NAME_SEND_TIME_A)
  private OffsetDateTime sendTimeA;

  public static final String SERIALIZED_NAME_SEND_TIME_B = "send_time_b";
  @SerializedName(SERIALIZED_NAME_SEND_TIME_B)
  private OffsetDateTime sendTimeB;

  public static final String SERIALIZED_NAME_SEND_TIME_WINNER = "send_time_winner";
  @SerializedName(SERIALIZED_NAME_SEND_TIME_WINNER)
  private String sendTimeWinner;

  public ABTestingOptionsProperty() {
  }

  public ABTestingOptionsProperty splitTest(SplitTestEnum splitTest) {
    
    
    
    
    this.splitTest = splitTest;
    return this;
  }

   /**
   * The type of AB split to run.
   * @return splitTest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of AB split to run.")

  public SplitTestEnum getSplitTest() {
    return splitTest;
  }


  public void setSplitTest(SplitTestEnum splitTest) {
    
    
    
    this.splitTest = splitTest;
  }


  public ABTestingOptionsProperty pickWinner(PickWinnerEnum pickWinner) {
    
    
    
    
    this.pickWinner = pickWinner;
    return this;
  }

   /**
   * How we should evaluate a winner. Based on &#39;opens&#39;, &#39;clicks&#39;, or &#39;manual&#39;.
   * @return pickWinner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How we should evaluate a winner. Based on 'opens', 'clicks', or 'manual'.")

  public PickWinnerEnum getPickWinner() {
    return pickWinner;
  }


  public void setPickWinner(PickWinnerEnum pickWinner) {
    
    
    
    this.pickWinner = pickWinner;
  }


  public ABTestingOptionsProperty waitUnits(WaitUnitsEnum waitUnits) {
    
    
    
    
    this.waitUnits = waitUnits;
    return this;
  }

   /**
   * How unit of time for measuring the winner (&#39;hours&#39; or &#39;days&#39;). This cannot be changed after a campaign is sent.
   * @return waitUnits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How unit of time for measuring the winner ('hours' or 'days'). This cannot be changed after a campaign is sent.")

  public WaitUnitsEnum getWaitUnits() {
    return waitUnits;
  }


  public void setWaitUnits(WaitUnitsEnum waitUnits) {
    
    
    
    this.waitUnits = waitUnits;
  }


  public ABTestingOptionsProperty waitTime(Integer waitTime) {
    
    
    
    
    this.waitTime = waitTime;
    return this;
  }

   /**
   * The amount of time to wait before picking a winner. This cannot be changed after a campaign is sent.
   * @return waitTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of time to wait before picking a winner. This cannot be changed after a campaign is sent.")

  public Integer getWaitTime() {
    return waitTime;
  }


  public void setWaitTime(Integer waitTime) {
    
    
    
    this.waitTime = waitTime;
  }


  public ABTestingOptionsProperty splitSize(Integer splitSize) {
    if (splitSize != null && splitSize < 1) {
      throw new IllegalArgumentException("Invalid value for splitSize. Must be greater than or equal to 1.");
    }
    if (splitSize != null && splitSize > 50) {
      throw new IllegalArgumentException("Invalid value for splitSize. Must be less than or equal to 50.");
    }
    
    
    this.splitSize = splitSize;
    return this;
  }

   /**
   * The size of the split groups. Campaigns split based on &#39;schedule&#39; are forced to have a 50/50 split. Valid split integers are between 1-50.
   * minimum: 1
   * maximum: 50
   * @return splitSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The size of the split groups. Campaigns split based on 'schedule' are forced to have a 50/50 split. Valid split integers are between 1-50.")

  public Integer getSplitSize() {
    return splitSize;
  }


  public void setSplitSize(Integer splitSize) {
    if (splitSize != null && splitSize < 1) {
      throw new IllegalArgumentException("Invalid value for splitSize. Must be greater than or equal to 1.");
    }
    if (splitSize != null && splitSize > 50) {
      throw new IllegalArgumentException("Invalid value for splitSize. Must be less than or equal to 50.");
    }
    
    this.splitSize = splitSize;
  }


  public ABTestingOptionsProperty fromNameA(String fromNameA) {
    
    
    
    
    this.fromNameA = fromNameA;
    return this;
  }

   /**
   * For campaigns split on &#39;From Name&#39;, the name for Group A.
   * @return fromNameA
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For campaigns split on 'From Name', the name for Group A.")

  public String getFromNameA() {
    return fromNameA;
  }


  public void setFromNameA(String fromNameA) {
    
    
    
    this.fromNameA = fromNameA;
  }


  public ABTestingOptionsProperty fromNameB(String fromNameB) {
    
    
    
    
    this.fromNameB = fromNameB;
    return this;
  }

   /**
   * For campaigns split on &#39;From Name&#39;, the name for Group B.
   * @return fromNameB
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For campaigns split on 'From Name', the name for Group B.")

  public String getFromNameB() {
    return fromNameB;
  }


  public void setFromNameB(String fromNameB) {
    
    
    
    this.fromNameB = fromNameB;
  }


  public ABTestingOptionsProperty replyEmailA(String replyEmailA) {
    
    
    
    
    this.replyEmailA = replyEmailA;
    return this;
  }

   /**
   * For campaigns split on &#39;From Name&#39;, the reply-to address for Group A.
   * @return replyEmailA
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For campaigns split on 'From Name', the reply-to address for Group A.")

  public String getReplyEmailA() {
    return replyEmailA;
  }


  public void setReplyEmailA(String replyEmailA) {
    
    
    
    this.replyEmailA = replyEmailA;
  }


  public ABTestingOptionsProperty replyEmailB(String replyEmailB) {
    
    
    
    
    this.replyEmailB = replyEmailB;
    return this;
  }

   /**
   * For campaigns split on &#39;From Name&#39;, the reply-to address for Group B.
   * @return replyEmailB
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For campaigns split on 'From Name', the reply-to address for Group B.")

  public String getReplyEmailB() {
    return replyEmailB;
  }


  public void setReplyEmailB(String replyEmailB) {
    
    
    
    this.replyEmailB = replyEmailB;
  }


  public ABTestingOptionsProperty subjectA(String subjectA) {
    
    
    
    
    this.subjectA = subjectA;
    return this;
  }

   /**
   * For campaigns split on &#39;Subject Line&#39;, the subject line for Group A.
   * @return subjectA
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For campaigns split on 'Subject Line', the subject line for Group A.")

  public String getSubjectA() {
    return subjectA;
  }


  public void setSubjectA(String subjectA) {
    
    
    
    this.subjectA = subjectA;
  }


  public ABTestingOptionsProperty subjectB(String subjectB) {
    
    
    
    
    this.subjectB = subjectB;
    return this;
  }

   /**
   * For campaigns split on &#39;Subject Line&#39;, the subject line for Group B.
   * @return subjectB
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For campaigns split on 'Subject Line', the subject line for Group B.")

  public String getSubjectB() {
    return subjectB;
  }


  public void setSubjectB(String subjectB) {
    
    
    
    this.subjectB = subjectB;
  }


  public ABTestingOptionsProperty sendTimeA(OffsetDateTime sendTimeA) {
    
    
    
    
    this.sendTimeA = sendTimeA;
    return this;
  }

   /**
   * The send time for Group A.
   * @return sendTimeA
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The send time for Group A.")

  public OffsetDateTime getSendTimeA() {
    return sendTimeA;
  }


  public void setSendTimeA(OffsetDateTime sendTimeA) {
    
    
    
    this.sendTimeA = sendTimeA;
  }


  public ABTestingOptionsProperty sendTimeB(OffsetDateTime sendTimeB) {
    
    
    
    
    this.sendTimeB = sendTimeB;
    return this;
  }

   /**
   * The send time for Group B.
   * @return sendTimeB
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The send time for Group B.")

  public OffsetDateTime getSendTimeB() {
    return sendTimeB;
  }


  public void setSendTimeB(OffsetDateTime sendTimeB) {
    
    
    
    this.sendTimeB = sendTimeB;
  }


  public ABTestingOptionsProperty sendTimeWinner(String sendTimeWinner) {
    
    
    
    
    this.sendTimeWinner = sendTimeWinner;
    return this;
  }

   /**
   * The send time for the winning version.
   * @return sendTimeWinner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The send time for the winning version.")

  public String getSendTimeWinner() {
    return sendTimeWinner;
  }


  public void setSendTimeWinner(String sendTimeWinner) {
    
    
    
    this.sendTimeWinner = sendTimeWinner;
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
   * @return the ABTestingOptionsProperty instance itself
   */
  public ABTestingOptionsProperty putAdditionalProperty(String key, Object value) {
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
    ABTestingOptionsProperty aBTestingOptionsProperty = (ABTestingOptionsProperty) o;
    return Objects.equals(this.splitTest, aBTestingOptionsProperty.splitTest) &&
        Objects.equals(this.pickWinner, aBTestingOptionsProperty.pickWinner) &&
        Objects.equals(this.waitUnits, aBTestingOptionsProperty.waitUnits) &&
        Objects.equals(this.waitTime, aBTestingOptionsProperty.waitTime) &&
        Objects.equals(this.splitSize, aBTestingOptionsProperty.splitSize) &&
        Objects.equals(this.fromNameA, aBTestingOptionsProperty.fromNameA) &&
        Objects.equals(this.fromNameB, aBTestingOptionsProperty.fromNameB) &&
        Objects.equals(this.replyEmailA, aBTestingOptionsProperty.replyEmailA) &&
        Objects.equals(this.replyEmailB, aBTestingOptionsProperty.replyEmailB) &&
        Objects.equals(this.subjectA, aBTestingOptionsProperty.subjectA) &&
        Objects.equals(this.subjectB, aBTestingOptionsProperty.subjectB) &&
        Objects.equals(this.sendTimeA, aBTestingOptionsProperty.sendTimeA) &&
        Objects.equals(this.sendTimeB, aBTestingOptionsProperty.sendTimeB) &&
        Objects.equals(this.sendTimeWinner, aBTestingOptionsProperty.sendTimeWinner)&&
        Objects.equals(this.additionalProperties, aBTestingOptionsProperty.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(splitTest, pickWinner, waitUnits, waitTime, splitSize, fromNameA, fromNameB, replyEmailA, replyEmailB, subjectA, subjectB, sendTimeA, sendTimeB, sendTimeWinner, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ABTestingOptionsProperty {\n");
    sb.append("    splitTest: ").append(toIndentedString(splitTest)).append("\n");
    sb.append("    pickWinner: ").append(toIndentedString(pickWinner)).append("\n");
    sb.append("    waitUnits: ").append(toIndentedString(waitUnits)).append("\n");
    sb.append("    waitTime: ").append(toIndentedString(waitTime)).append("\n");
    sb.append("    splitSize: ").append(toIndentedString(splitSize)).append("\n");
    sb.append("    fromNameA: ").append(toIndentedString(fromNameA)).append("\n");
    sb.append("    fromNameB: ").append(toIndentedString(fromNameB)).append("\n");
    sb.append("    replyEmailA: ").append(toIndentedString(replyEmailA)).append("\n");
    sb.append("    replyEmailB: ").append(toIndentedString(replyEmailB)).append("\n");
    sb.append("    subjectA: ").append(toIndentedString(subjectA)).append("\n");
    sb.append("    subjectB: ").append(toIndentedString(subjectB)).append("\n");
    sb.append("    sendTimeA: ").append(toIndentedString(sendTimeA)).append("\n");
    sb.append("    sendTimeB: ").append(toIndentedString(sendTimeB)).append("\n");
    sb.append("    sendTimeWinner: ").append(toIndentedString(sendTimeWinner)).append("\n");
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
    openapiFields.add("split_test");
    openapiFields.add("pick_winner");
    openapiFields.add("wait_units");
    openapiFields.add("wait_time");
    openapiFields.add("split_size");
    openapiFields.add("from_name_a");
    openapiFields.add("from_name_b");
    openapiFields.add("reply_email_a");
    openapiFields.add("reply_email_b");
    openapiFields.add("subject_a");
    openapiFields.add("subject_b");
    openapiFields.add("send_time_a");
    openapiFields.add("send_time_b");
    openapiFields.add("send_time_winner");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ABTestingOptionsProperty
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ABTestingOptionsProperty.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ABTestingOptionsProperty is not found in the empty JSON string", ABTestingOptionsProperty.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("split_test") != null && !jsonObj.get("split_test").isJsonNull()) && !jsonObj.get("split_test").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `split_test` to be a primitive type in the JSON string but got `%s`", jsonObj.get("split_test").toString()));
      }
      if ((jsonObj.get("pick_winner") != null && !jsonObj.get("pick_winner").isJsonNull()) && !jsonObj.get("pick_winner").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pick_winner` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pick_winner").toString()));
      }
      if ((jsonObj.get("wait_units") != null && !jsonObj.get("wait_units").isJsonNull()) && !jsonObj.get("wait_units").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wait_units` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wait_units").toString()));
      }
      if ((jsonObj.get("from_name_a") != null && !jsonObj.get("from_name_a").isJsonNull()) && !jsonObj.get("from_name_a").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `from_name_a` to be a primitive type in the JSON string but got `%s`", jsonObj.get("from_name_a").toString()));
      }
      if ((jsonObj.get("from_name_b") != null && !jsonObj.get("from_name_b").isJsonNull()) && !jsonObj.get("from_name_b").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `from_name_b` to be a primitive type in the JSON string but got `%s`", jsonObj.get("from_name_b").toString()));
      }
      if ((jsonObj.get("reply_email_a") != null && !jsonObj.get("reply_email_a").isJsonNull()) && !jsonObj.get("reply_email_a").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reply_email_a` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reply_email_a").toString()));
      }
      if ((jsonObj.get("reply_email_b") != null && !jsonObj.get("reply_email_b").isJsonNull()) && !jsonObj.get("reply_email_b").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reply_email_b` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reply_email_b").toString()));
      }
      if ((jsonObj.get("subject_a") != null && !jsonObj.get("subject_a").isJsonNull()) && !jsonObj.get("subject_a").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject_a` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject_a").toString()));
      }
      if ((jsonObj.get("subject_b") != null && !jsonObj.get("subject_b").isJsonNull()) && !jsonObj.get("subject_b").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject_b` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject_b").toString()));
      }
      if ((jsonObj.get("send_time_winner") != null && !jsonObj.get("send_time_winner").isJsonNull()) && !jsonObj.get("send_time_winner").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `send_time_winner` to be a primitive type in the JSON string but got `%s`", jsonObj.get("send_time_winner").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ABTestingOptionsProperty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ABTestingOptionsProperty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ABTestingOptionsProperty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ABTestingOptionsProperty.class));

       return (TypeAdapter<T>) new TypeAdapter<ABTestingOptionsProperty>() {
           @Override
           public void write(JsonWriter out, ABTestingOptionsProperty value) throws IOException {
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
           public ABTestingOptionsProperty read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ABTestingOptionsProperty instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ABTestingOptionsProperty given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ABTestingOptionsProperty
  * @throws IOException if the JSON string is invalid with respect to ABTestingOptionsProperty
  */
  public static ABTestingOptionsProperty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ABTestingOptionsProperty.class);
  }

 /**
  * Convert an instance of ABTestingOptionsProperty to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
