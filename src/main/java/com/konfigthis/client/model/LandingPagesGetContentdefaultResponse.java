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
 * An error generated by the Mailchimp API. Conforms to IETF draft &#39;draft-nottingham-http-problem-06&#39;.
 */
@ApiModel(description = "An error generated by the Mailchimp API. Conforms to IETF draft 'draft-nottingham-http-problem-06'.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LandingPagesGetContentdefaultResponse {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private String detail;

  public static final String SERIALIZED_NAME_INSTANCE = "instance";
  @SerializedName(SERIALIZED_NAME_INSTANCE)
  private String instance;

  public LandingPagesGetContentdefaultResponse() {
  }

  public LandingPagesGetContentdefaultResponse title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * A short, human-readable summary of the problem type. It shouldn&#39;t change based on the occurrence of the problem, except for purposes of localization.
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Resource Not Found", required = true, value = "A short, human-readable summary of the problem type. It shouldn't change based on the occurrence of the problem, except for purposes of localization.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public LandingPagesGetContentdefaultResponse type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * An absolute URI that identifies the problem type. When dereferenced, it should provide human-readable documentation for the problem type.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://mailchimp.com/developer/marketing/docs/errors/", required = true, value = "An absolute URI that identifies the problem type. When dereferenced, it should provide human-readable documentation for the problem type.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public LandingPagesGetContentdefaultResponse status(Integer status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The HTTP status code (RFC2616, Section 6) generated by the origin server for this occurrence of the problem.
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "404", required = true, value = "The HTTP status code (RFC2616, Section 6) generated by the origin server for this occurrence of the problem.")

  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    
    
    
    this.status = status;
  }


  public LandingPagesGetContentdefaultResponse detail(String detail) {
    
    
    
    
    this.detail = detail;
    return this;
  }

   /**
   * A human-readable explanation specific to this occurrence of the problem. [Learn more about errors](https://mailchimp.com/developer/).
   * @return detail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "The requested resource could not be found.", required = true, value = "A human-readable explanation specific to this occurrence of the problem. [Learn more about errors](https://mailchimp.com/developer/).")

  public String getDetail() {
    return detail;
  }


  public void setDetail(String detail) {
    
    
    
    this.detail = detail;
  }


  public LandingPagesGetContentdefaultResponse instance(String instance) {
    
    
    
    
    this.instance = instance;
    return this;
  }

   /**
   * A string that identifies this specific occurrence of the problem. Please provide this ID when contacting support.
   * @return instance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "995c5cb0-3280-4a6e-808b-3b096d0bb219", required = true, value = "A string that identifies this specific occurrence of the problem. Please provide this ID when contacting support.")

  public String getInstance() {
    return instance;
  }


  public void setInstance(String instance) {
    
    
    
    this.instance = instance;
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
   * @return the LandingPagesGetContentdefaultResponse instance itself
   */
  public LandingPagesGetContentdefaultResponse putAdditionalProperty(String key, Object value) {
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
    LandingPagesGetContentdefaultResponse landingPagesGetContentdefaultResponse = (LandingPagesGetContentdefaultResponse) o;
    return Objects.equals(this.title, landingPagesGetContentdefaultResponse.title) &&
        Objects.equals(this.type, landingPagesGetContentdefaultResponse.type) &&
        Objects.equals(this.status, landingPagesGetContentdefaultResponse.status) &&
        Objects.equals(this.detail, landingPagesGetContentdefaultResponse.detail) &&
        Objects.equals(this.instance, landingPagesGetContentdefaultResponse.instance)&&
        Objects.equals(this.additionalProperties, landingPagesGetContentdefaultResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, type, status, detail, instance, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LandingPagesGetContentdefaultResponse {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("type");
    openapiFields.add("status");
    openapiFields.add("detail");
    openapiFields.add("instance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("detail");
    openapiRequiredFields.add("instance");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LandingPagesGetContentdefaultResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LandingPagesGetContentdefaultResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LandingPagesGetContentdefaultResponse is not found in the empty JSON string", LandingPagesGetContentdefaultResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LandingPagesGetContentdefaultResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("detail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `detail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("detail").toString()));
      }
      if (!jsonObj.get("instance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instance").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LandingPagesGetContentdefaultResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LandingPagesGetContentdefaultResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LandingPagesGetContentdefaultResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LandingPagesGetContentdefaultResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<LandingPagesGetContentdefaultResponse>() {
           @Override
           public void write(JsonWriter out, LandingPagesGetContentdefaultResponse value) throws IOException {
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
           public LandingPagesGetContentdefaultResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LandingPagesGetContentdefaultResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LandingPagesGetContentdefaultResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LandingPagesGetContentdefaultResponse
  * @throws IOException if the JSON string is invalid with respect to LandingPagesGetContentdefaultResponse
  */
  public static LandingPagesGetContentdefaultResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LandingPagesGetContentdefaultResponse.class);
  }

 /**
  * Convert an instance of LandingPagesGetContentdefaultResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

