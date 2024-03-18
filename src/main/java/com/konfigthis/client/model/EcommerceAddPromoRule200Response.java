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
 * Information about an Ecommerce Store&#39;s specific Promo Rule
 */
@ApiModel(description = "Information about an Ecommerce Store's specific Promo Rule")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EcommerceAddPromoRule200Response {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_STARTS_AT = "starts_at";
  @SerializedName(SERIALIZED_NAME_STARTS_AT)
  private OffsetDateTime startsAt;

  public static final String SERIALIZED_NAME_ENDS_AT = "ends_at";
  @SerializedName(SERIALIZED_NAME_ENDS_AT)
  private String endsAt;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Float amount;

  /**
   * Type of discount. For free shipping set type to fixed.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    FIXED("fixed"),
    
    PERCENTAGE("percentage");

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

  /**
   * The target that the discount applies to.
   */
  @JsonAdapter(TargetEnum.Adapter.class)
 public enum TargetEnum {
    PER_ITEM("per_item"),
    
    TOTAL("total"),
    
    SHIPPING("shipping");

    private String value;

    TargetEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TargetEnum fromValue(String value) {
      for (TargetEnum b : TargetEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TargetEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TargetEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TargetEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TargetEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private TargetEnum target;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_CREATED_AT_FOREIGN = "created_at_foreign";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_FOREIGN)
  private OffsetDateTime createdAtForeign;

  public static final String SERIALIZED_NAME_UPDATED_AT_FOREIGN = "updated_at_foreign";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT_FOREIGN)
  private OffsetDateTime updatedAtForeign;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<ResourceLink> links = null;

  public EcommerceAddPromoRule200Response() {
  }

  
  public EcommerceAddPromoRule200Response(
     String id, 
     List<ResourceLink> links
  ) {
    this();
    this.id = id;
    this.links = links;
  }

  public EcommerceAddPromoRule200Response title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * The title that will show up in promotion campaign. Restricted to UTF-8 characters with max length of 100 bytes.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50% off Total Order", value = "The title that will show up in promotion campaign. Restricted to UTF-8 characters with max length of 100 bytes.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public EcommerceAddPromoRule200Response description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * The description of a promotion restricted to UTF-8 characters with max length 255.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Save BIG during our summer sale!", value = "The description of a promotion restricted to UTF-8 characters with max length 255.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


   /**
   * A unique identifier for the promo rule. If Ecommerce platform does not support promo rule, use promo code id as promo rule id. Restricted to UTF-8 characters with max length 50.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier for the promo rule. If Ecommerce platform does not support promo rule, use promo code id as promo rule id. Restricted to UTF-8 characters with max length 50.")

  public String getId() {
    return id;
  }




  public EcommerceAddPromoRule200Response startsAt(OffsetDateTime startsAt) {
    
    
    
    
    this.startsAt = startsAt;
    return this;
  }

   /**
   * The date and time when the promotion is in effect in ISO 8601 format.
   * @return startsAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time when the promotion is in effect in ISO 8601 format.")

  public OffsetDateTime getStartsAt() {
    return startsAt;
  }


  public void setStartsAt(OffsetDateTime startsAt) {
    
    
    
    this.startsAt = startsAt;
  }


  public EcommerceAddPromoRule200Response endsAt(String endsAt) {
    
    
    
    
    this.endsAt = endsAt;
    return this;
  }

   /**
   * The date and time when the promotion ends. Must be after starts_at and in ISO 8601 format.
   * @return endsAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time when the promotion ends. Must be after starts_at and in ISO 8601 format.")

  public String getEndsAt() {
    return endsAt;
  }


  public void setEndsAt(String endsAt) {
    
    
    
    this.endsAt = endsAt;
  }


  public EcommerceAddPromoRule200Response amount(Float amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the promo code discount. If &#39;type&#39; is &#39;fixed&#39;, the amount is treated as a monetary value. If &#39;type&#39; is &#39;percentage&#39;, amount must be a decimal value between 0.0 and 1.0, inclusive.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.5", value = "The amount of the promo code discount. If 'type' is 'fixed', the amount is treated as a monetary value. If 'type' is 'percentage', amount must be a decimal value between 0.0 and 1.0, inclusive.")

  public Float getAmount() {
    return amount;
  }


  public void setAmount(Float amount) {
    
    
    
    this.amount = amount;
  }


  public EcommerceAddPromoRule200Response type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Type of discount. For free shipping set type to fixed.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of discount. For free shipping set type to fixed.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public EcommerceAddPromoRule200Response target(TargetEnum target) {
    
    
    
    
    this.target = target;
    return this;
  }

   /**
   * The target that the discount applies to.
   * @return target
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The target that the discount applies to.")

  public TargetEnum getTarget() {
    return target;
  }


  public void setTarget(TargetEnum target) {
    
    
    
    this.target = target;
  }


  public EcommerceAddPromoRule200Response enabled(Boolean enabled) {
    
    
    
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether the promo rule is currently enabled.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the promo rule is currently enabled.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    
    
    
    this.enabled = enabled;
  }


  public EcommerceAddPromoRule200Response createdAtForeign(OffsetDateTime createdAtForeign) {
    
    
    
    
    this.createdAtForeign = createdAtForeign;
    return this;
  }

   /**
   * The date and time the promotion was created in ISO 8601 format.
   * @return createdAtForeign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the promotion was created in ISO 8601 format.")

  public OffsetDateTime getCreatedAtForeign() {
    return createdAtForeign;
  }


  public void setCreatedAtForeign(OffsetDateTime createdAtForeign) {
    
    
    
    this.createdAtForeign = createdAtForeign;
  }


  public EcommerceAddPromoRule200Response updatedAtForeign(OffsetDateTime updatedAtForeign) {
    
    
    
    
    this.updatedAtForeign = updatedAtForeign;
    return this;
  }

   /**
   * The date and time the promotion was updated in ISO 8601 format.
   * @return updatedAtForeign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the promotion was updated in ISO 8601 format.")

  public OffsetDateTime getUpdatedAtForeign() {
    return updatedAtForeign;
  }


  public void setUpdatedAtForeign(OffsetDateTime updatedAtForeign) {
    
    
    
    this.updatedAtForeign = updatedAtForeign;
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
   * @return the EcommerceAddPromoRule200Response instance itself
   */
  public EcommerceAddPromoRule200Response putAdditionalProperty(String key, Object value) {
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
    EcommerceAddPromoRule200Response ecommerceAddPromoRule200Response = (EcommerceAddPromoRule200Response) o;
    return Objects.equals(this.title, ecommerceAddPromoRule200Response.title) &&
        Objects.equals(this.description, ecommerceAddPromoRule200Response.description) &&
        Objects.equals(this.id, ecommerceAddPromoRule200Response.id) &&
        Objects.equals(this.startsAt, ecommerceAddPromoRule200Response.startsAt) &&
        Objects.equals(this.endsAt, ecommerceAddPromoRule200Response.endsAt) &&
        Objects.equals(this.amount, ecommerceAddPromoRule200Response.amount) &&
        Objects.equals(this.type, ecommerceAddPromoRule200Response.type) &&
        Objects.equals(this.target, ecommerceAddPromoRule200Response.target) &&
        Objects.equals(this.enabled, ecommerceAddPromoRule200Response.enabled) &&
        Objects.equals(this.createdAtForeign, ecommerceAddPromoRule200Response.createdAtForeign) &&
        Objects.equals(this.updatedAtForeign, ecommerceAddPromoRule200Response.updatedAtForeign) &&
        Objects.equals(this.links, ecommerceAddPromoRule200Response.links)&&
        Objects.equals(this.additionalProperties, ecommerceAddPromoRule200Response.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, id, startsAt, endsAt, amount, type, target, enabled, createdAtForeign, updatedAtForeign, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EcommerceAddPromoRule200Response {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startsAt: ").append(toIndentedString(startsAt)).append("\n");
    sb.append("    endsAt: ").append(toIndentedString(endsAt)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    createdAtForeign: ").append(toIndentedString(createdAtForeign)).append("\n");
    sb.append("    updatedAtForeign: ").append(toIndentedString(updatedAtForeign)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("starts_at");
    openapiFields.add("ends_at");
    openapiFields.add("amount");
    openapiFields.add("type");
    openapiFields.add("target");
    openapiFields.add("enabled");
    openapiFields.add("created_at_foreign");
    openapiFields.add("updated_at_foreign");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EcommerceAddPromoRule200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EcommerceAddPromoRule200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EcommerceAddPromoRule200Response is not found in the empty JSON string", EcommerceAddPromoRule200Response.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("ends_at") != null && !jsonObj.get("ends_at").isJsonNull()) && !jsonObj.get("ends_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ends_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ends_at").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("target") != null && !jsonObj.get("target").isJsonNull()) && !jsonObj.get("target").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target").toString()));
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
       if (!EcommerceAddPromoRule200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EcommerceAddPromoRule200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EcommerceAddPromoRule200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EcommerceAddPromoRule200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<EcommerceAddPromoRule200Response>() {
           @Override
           public void write(JsonWriter out, EcommerceAddPromoRule200Response value) throws IOException {
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
           public EcommerceAddPromoRule200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EcommerceAddPromoRule200Response instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EcommerceAddPromoRule200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EcommerceAddPromoRule200Response
  * @throws IOException if the JSON string is invalid with respect to EcommerceAddPromoRule200Response
  */
  public static EcommerceAddPromoRule200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EcommerceAddPromoRule200Response.class);
  }

 /**
  * Convert an instance of EcommerceAddPromoRule200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

