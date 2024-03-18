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
import com.konfigthis.client.model.ContactCountsProperty;
import com.konfigthis.client.model.MergeFieldProperty;
import com.konfigthis.client.model.OptionsPropertyInner;
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
 * The details of a survey question&#39;s report.
 */
@ApiModel(description = "The details of a survey question's report.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SurveyQuestionReport {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SURVEY_ID = "survey_id";
  @SerializedName(SERIALIZED_NAME_SURVEY_ID)
  private String surveyId;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  /**
   * The response type of the survey question.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    PICKONE("pickOne"),
    
    PICKMANY("pickMany"),
    
    RANGE("range"),
    
    TEXT("text"),
    
    EMAIL("email");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_TOTAL_RESPONSES = "total_responses";
  @SerializedName(SERIALIZED_NAME_TOTAL_RESPONSES)
  private Integer totalResponses;

  public static final String SERIALIZED_NAME_IS_REQUIRED = "is_required";
  @SerializedName(SERIALIZED_NAME_IS_REQUIRED)
  private Boolean isRequired;

  public static final String SERIALIZED_NAME_HAS_OTHER = "has_other";
  @SerializedName(SERIALIZED_NAME_HAS_OTHER)
  private Boolean hasOther;

  public static final String SERIALIZED_NAME_OTHER_LABEL = "other_label";
  @SerializedName(SERIALIZED_NAME_OTHER_LABEL)
  private String otherLabel;

  public static final String SERIALIZED_NAME_AVERAGE_RATING = "average_rating";
  @SerializedName(SERIALIZED_NAME_AVERAGE_RATING)
  private Float averageRating;

  public static final String SERIALIZED_NAME_RANGE_LOW_LABEL = "range_low_label";
  @SerializedName(SERIALIZED_NAME_RANGE_LOW_LABEL)
  private String rangeLowLabel;

  public static final String SERIALIZED_NAME_RANGE_HIGH_LABEL = "range_high_label";
  @SerializedName(SERIALIZED_NAME_RANGE_HIGH_LABEL)
  private String rangeHighLabel;

  public static final String SERIALIZED_NAME_PLACEHOLDER_LABEL = "placeholder_label";
  @SerializedName(SERIALIZED_NAME_PLACEHOLDER_LABEL)
  private String placeholderLabel;

  public static final String SERIALIZED_NAME_SUBSCRIBE_CHECKBOX_ENABLED = "subscribe_checkbox_enabled";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBE_CHECKBOX_ENABLED)
  private Boolean subscribeCheckboxEnabled;

  public static final String SERIALIZED_NAME_SUBSCRIBE_CHECKBOX_LABEL = "subscribe_checkbox_label";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBE_CHECKBOX_LABEL)
  private String subscribeCheckboxLabel;

  public static final String SERIALIZED_NAME_MERGE_FIELD = "merge_field";
  @SerializedName(SERIALIZED_NAME_MERGE_FIELD)
  private MergeFieldProperty mergeField;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<OptionsPropertyInner> options = null;

  public static final String SERIALIZED_NAME_CONTACT_COUNTS = "contact_counts";
  @SerializedName(SERIALIZED_NAME_CONTACT_COUNTS)
  private ContactCountsProperty contactCounts;

  public SurveyQuestionReport() {
  }

  
  public SurveyQuestionReport(
     String id, 
     String surveyId, 
     String query, 
     TypeEnum type, 
     Integer totalResponses, 
     Boolean isRequired, 
     Boolean hasOther, 
     String otherLabel, 
     Float averageRating, 
     String rangeLowLabel, 
     String rangeHighLabel, 
     String placeholderLabel, 
     Boolean subscribeCheckboxEnabled, 
     String subscribeCheckboxLabel, 
     List<OptionsPropertyInner> options
  ) {
    this();
    this.id = id;
    this.surveyId = surveyId;
    this.query = query;
    this.type = type;
    this.totalResponses = totalResponses;
    this.isRequired = isRequired;
    this.hasOther = hasOther;
    this.otherLabel = otherLabel;
    this.averageRating = averageRating;
    this.rangeLowLabel = rangeLowLabel;
    this.rangeHighLabel = rangeHighLabel;
    this.placeholderLabel = placeholderLabel;
    this.subscribeCheckboxEnabled = subscribeCheckboxEnabled;
    this.subscribeCheckboxLabel = subscribeCheckboxLabel;
    this.options = options;
  }

   /**
   * The ID of the survey question.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the survey question.")

  public String getId() {
    return id;
  }




   /**
   * The unique ID of the survey.
   * @return surveyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the survey.")

  public String getSurveyId() {
    return surveyId;
  }




   /**
   * The query of the survey question.
   * @return query
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The query of the survey question.")

  public String getQuery() {
    return query;
  }




   /**
   * The response type of the survey question.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The response type of the survey question.")

  public TypeEnum getType() {
    return type;
  }




   /**
   * The total number of responses to this question.
   * @return totalResponses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "810", value = "The total number of responses to this question.")

  public Integer getTotalResponses() {
    return totalResponses;
  }




   /**
   * Whether this survey question is required to answer.
   * @return isRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this survey question is required to answer.")

  public Boolean getIsRequired() {
    return isRequired;
  }




   /**
   * Whether this survey question has an &#39;other&#39; option.
   * @return hasOther
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this survey question has an 'other' option.")

  public Boolean getHasOther() {
    return hasOther;
  }




   /**
   * Label used for the &#39;other&#39; option of this survey question.
   * @return otherLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Label used for the 'other' option of this survey question.")

  public String getOtherLabel() {
    return otherLabel;
  }




   /**
   * The average rating for this range question.
   * @return averageRating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.5", value = "The average rating for this range question.")

  public Float getAverageRating() {
    return averageRating;
  }




   /**
   * Label for the low end of the range.
   * @return rangeLowLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Label for the low end of the range.")

  public String getRangeLowLabel() {
    return rangeLowLabel;
  }




   /**
   * Label for the high end of the range.
   * @return rangeHighLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Label for the high end of the range.")

  public String getRangeHighLabel() {
    return rangeHighLabel;
  }




   /**
   * Placeholder text for this survey question&#39;s answer box.
   * @return placeholderLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Placeholder text for this survey question's answer box.")

  public String getPlaceholderLabel() {
    return placeholderLabel;
  }




   /**
   * Whether the subscribe checkbox is shown for this email question.
   * @return subscribeCheckboxEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the subscribe checkbox is shown for this email question.")

  public Boolean getSubscribeCheckboxEnabled() {
    return subscribeCheckboxEnabled;
  }




   /**
   * Label used for the subscribe checkbox for this email question.
   * @return subscribeCheckboxLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Label used for the subscribe checkbox for this email question.")

  public String getSubscribeCheckboxLabel() {
    return subscribeCheckboxLabel;
  }




  public SurveyQuestionReport mergeField(MergeFieldProperty mergeField) {
    
    
    
    
    this.mergeField = mergeField;
    return this;
  }

   /**
   * Get mergeField
   * @return mergeField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MergeFieldProperty getMergeField() {
    return mergeField;
  }


  public void setMergeField(MergeFieldProperty mergeField) {
    
    
    
    this.mergeField = mergeField;
  }


   /**
   * The answer choices for this question.
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The answer choices for this question.")

  public List<OptionsPropertyInner> getOptions() {
    return options;
  }




  public SurveyQuestionReport contactCounts(ContactCountsProperty contactCounts) {
    
    
    
    
    this.contactCounts = contactCounts;
    return this;
  }

   /**
   * Get contactCounts
   * @return contactCounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContactCountsProperty getContactCounts() {
    return contactCounts;
  }


  public void setContactCounts(ContactCountsProperty contactCounts) {
    
    
    
    this.contactCounts = contactCounts;
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
   * @return the SurveyQuestionReport instance itself
   */
  public SurveyQuestionReport putAdditionalProperty(String key, Object value) {
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
    SurveyQuestionReport surveyQuestionReport = (SurveyQuestionReport) o;
    return Objects.equals(this.id, surveyQuestionReport.id) &&
        Objects.equals(this.surveyId, surveyQuestionReport.surveyId) &&
        Objects.equals(this.query, surveyQuestionReport.query) &&
        Objects.equals(this.type, surveyQuestionReport.type) &&
        Objects.equals(this.totalResponses, surveyQuestionReport.totalResponses) &&
        Objects.equals(this.isRequired, surveyQuestionReport.isRequired) &&
        Objects.equals(this.hasOther, surveyQuestionReport.hasOther) &&
        Objects.equals(this.otherLabel, surveyQuestionReport.otherLabel) &&
        Objects.equals(this.averageRating, surveyQuestionReport.averageRating) &&
        Objects.equals(this.rangeLowLabel, surveyQuestionReport.rangeLowLabel) &&
        Objects.equals(this.rangeHighLabel, surveyQuestionReport.rangeHighLabel) &&
        Objects.equals(this.placeholderLabel, surveyQuestionReport.placeholderLabel) &&
        Objects.equals(this.subscribeCheckboxEnabled, surveyQuestionReport.subscribeCheckboxEnabled) &&
        Objects.equals(this.subscribeCheckboxLabel, surveyQuestionReport.subscribeCheckboxLabel) &&
        Objects.equals(this.mergeField, surveyQuestionReport.mergeField) &&
        Objects.equals(this.options, surveyQuestionReport.options) &&
        Objects.equals(this.contactCounts, surveyQuestionReport.contactCounts)&&
        Objects.equals(this.additionalProperties, surveyQuestionReport.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, surveyId, query, type, totalResponses, isRequired, hasOther, otherLabel, averageRating, rangeLowLabel, rangeHighLabel, placeholderLabel, subscribeCheckboxEnabled, subscribeCheckboxLabel, mergeField, options, contactCounts, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyQuestionReport {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    surveyId: ").append(toIndentedString(surveyId)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    totalResponses: ").append(toIndentedString(totalResponses)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    hasOther: ").append(toIndentedString(hasOther)).append("\n");
    sb.append("    otherLabel: ").append(toIndentedString(otherLabel)).append("\n");
    sb.append("    averageRating: ").append(toIndentedString(averageRating)).append("\n");
    sb.append("    rangeLowLabel: ").append(toIndentedString(rangeLowLabel)).append("\n");
    sb.append("    rangeHighLabel: ").append(toIndentedString(rangeHighLabel)).append("\n");
    sb.append("    placeholderLabel: ").append(toIndentedString(placeholderLabel)).append("\n");
    sb.append("    subscribeCheckboxEnabled: ").append(toIndentedString(subscribeCheckboxEnabled)).append("\n");
    sb.append("    subscribeCheckboxLabel: ").append(toIndentedString(subscribeCheckboxLabel)).append("\n");
    sb.append("    mergeField: ").append(toIndentedString(mergeField)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    contactCounts: ").append(toIndentedString(contactCounts)).append("\n");
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
    openapiFields.add("survey_id");
    openapiFields.add("query");
    openapiFields.add("type");
    openapiFields.add("total_responses");
    openapiFields.add("is_required");
    openapiFields.add("has_other");
    openapiFields.add("other_label");
    openapiFields.add("average_rating");
    openapiFields.add("range_low_label");
    openapiFields.add("range_high_label");
    openapiFields.add("placeholder_label");
    openapiFields.add("subscribe_checkbox_enabled");
    openapiFields.add("subscribe_checkbox_label");
    openapiFields.add("merge_field");
    openapiFields.add("options");
    openapiFields.add("contact_counts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SurveyQuestionReport
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SurveyQuestionReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SurveyQuestionReport is not found in the empty JSON string", SurveyQuestionReport.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("survey_id") != null && !jsonObj.get("survey_id").isJsonNull()) && !jsonObj.get("survey_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `survey_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("survey_id").toString()));
      }
      if ((jsonObj.get("query") != null && !jsonObj.get("query").isJsonNull()) && !jsonObj.get("query").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("other_label") != null && !jsonObj.get("other_label").isJsonNull()) && !jsonObj.get("other_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other_label").toString()));
      }
      if ((jsonObj.get("range_low_label") != null && !jsonObj.get("range_low_label").isJsonNull()) && !jsonObj.get("range_low_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `range_low_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("range_low_label").toString()));
      }
      if ((jsonObj.get("range_high_label") != null && !jsonObj.get("range_high_label").isJsonNull()) && !jsonObj.get("range_high_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `range_high_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("range_high_label").toString()));
      }
      if ((jsonObj.get("placeholder_label") != null && !jsonObj.get("placeholder_label").isJsonNull()) && !jsonObj.get("placeholder_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `placeholder_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("placeholder_label").toString()));
      }
      if ((jsonObj.get("subscribe_checkbox_label") != null && !jsonObj.get("subscribe_checkbox_label").isJsonNull()) && !jsonObj.get("subscribe_checkbox_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscribe_checkbox_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscribe_checkbox_label").toString()));
      }
      // validate the optional field `merge_field`
      if (jsonObj.get("merge_field") != null && !jsonObj.get("merge_field").isJsonNull()) {
        MergeFieldProperty.validateJsonObject(jsonObj.getAsJsonObject("merge_field"));
      }
      if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull()) {
        JsonArray jsonArrayoptions = jsonObj.getAsJsonArray("options");
        if (jsonArrayoptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("options").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `options` to be an array in the JSON string but got `%s`", jsonObj.get("options").toString()));
          }

          // validate the optional field `options` (array)
          for (int i = 0; i < jsonArrayoptions.size(); i++) {
            OptionsPropertyInner.validateJsonObject(jsonArrayoptions.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `contact_counts`
      if (jsonObj.get("contact_counts") != null && !jsonObj.get("contact_counts").isJsonNull()) {
        ContactCountsProperty.validateJsonObject(jsonObj.getAsJsonObject("contact_counts"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SurveyQuestionReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SurveyQuestionReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SurveyQuestionReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SurveyQuestionReport.class));

       return (TypeAdapter<T>) new TypeAdapter<SurveyQuestionReport>() {
           @Override
           public void write(JsonWriter out, SurveyQuestionReport value) throws IOException {
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
           public SurveyQuestionReport read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SurveyQuestionReport instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SurveyQuestionReport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SurveyQuestionReport
  * @throws IOException if the JSON string is invalid with respect to SurveyQuestionReport
  */
  public static SurveyQuestionReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SurveyQuestionReport.class);
  }

 /**
  * Convert an instance of SurveyQuestionReport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

