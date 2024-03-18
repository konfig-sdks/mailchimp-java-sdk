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
 * A single question and the response to that question.
 */
@ApiModel(description = "A single question and the response to that question.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Response {
  public static final String SERIALIZED_NAME_QUESTION_ID = "question_id";
  @SerializedName(SERIALIZED_NAME_QUESTION_ID)
  private String questionId;

  /**
   * The type of question this is.
   */
  @JsonAdapter(QuestionTypeEnum.Adapter.class)
 public enum QuestionTypeEnum {
    PICKONE("pickOne"),
    
    PICKMANY("pickMany"),
    
    RANGE("range"),
    
    TEXT("text"),
    
    EMAIL("email");

    private String value;

    QuestionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static QuestionTypeEnum fromValue(String value) {
      for (QuestionTypeEnum b : QuestionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<QuestionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final QuestionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public QuestionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return QuestionTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_QUESTION_TYPE = "question_type";
  @SerializedName(SERIALIZED_NAME_QUESTION_TYPE)
  private QuestionTypeEnum questionType;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public static final String SERIALIZED_NAME_ANSWER = "answer";
  @SerializedName(SERIALIZED_NAME_ANSWER)
  private String answer;

  public Response() {
  }

  public Response questionId(String questionId) {
    
    
    
    
    this.questionId = questionId;
    return this;
  }

   /**
   * The unique ID for this question.
   * @return questionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID for this question.")

  public String getQuestionId() {
    return questionId;
  }


  public void setQuestionId(String questionId) {
    
    
    
    this.questionId = questionId;
  }


  public Response questionType(QuestionTypeEnum questionType) {
    
    
    
    
    this.questionType = questionType;
    return this;
  }

   /**
   * The type of question this is.
   * @return questionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of question this is.")

  public QuestionTypeEnum getQuestionType() {
    return questionType;
  }


  public void setQuestionType(QuestionTypeEnum questionType) {
    
    
    
    this.questionType = questionType;
  }


  public Response query(String query) {
    
    
    
    
    this.query = query;
    return this;
  }

   /**
   * The survey question.
   * @return query
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The survey question.")

  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    
    
    
    this.query = query;
  }


  public Response answer(String answer) {
    
    
    
    
    this.answer = answer;
    return this;
  }

   /**
   * The answer to this survey question.
   * @return answer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The answer to this survey question.")

  public String getAnswer() {
    return answer;
  }


  public void setAnswer(String answer) {
    
    
    
    this.answer = answer;
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
   * @return the Response instance itself
   */
  public Response putAdditionalProperty(String key, Object value) {
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
    Response response = (Response) o;
    return Objects.equals(this.questionId, response.questionId) &&
        Objects.equals(this.questionType, response.questionType) &&
        Objects.equals(this.query, response.query) &&
        Objects.equals(this.answer, response.answer)&&
        Objects.equals(this.additionalProperties, response.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionId, questionType, query, answer, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response {\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    questionType: ").append(toIndentedString(questionType)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
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
    openapiFields.add("question_id");
    openapiFields.add("question_type");
    openapiFields.add("query");
    openapiFields.add("answer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Response is not found in the empty JSON string", Response.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("question_id") != null && !jsonObj.get("question_id").isJsonNull()) && !jsonObj.get("question_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `question_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("question_id").toString()));
      }
      if ((jsonObj.get("question_type") != null && !jsonObj.get("question_type").isJsonNull()) && !jsonObj.get("question_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `question_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("question_type").toString()));
      }
      if ((jsonObj.get("query") != null && !jsonObj.get("query").isJsonNull()) && !jsonObj.get("query").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query").toString()));
      }
      if ((jsonObj.get("answer") != null && !jsonObj.get("answer").isJsonNull()) && !jsonObj.get("answer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `answer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("answer").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Response.class));

       return (TypeAdapter<T>) new TypeAdapter<Response>() {
           @Override
           public void write(JsonWriter out, Response value) throws IOException {
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
           public Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Response instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Response
  * @throws IOException if the JSON string is invalid with respect to Response
  */
  public static Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Response.class);
  }

 /**
  * Convert an instance of Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

