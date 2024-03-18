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
 * The delay settings for an Automation email.
 */
@ApiModel(description = "The delay settings for an Automation email.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AutomationDelayProperty4 {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  /**
   * The type of delay for an Automation email.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    NOW("now"),
    
    DAY("day"),
    
    HOUR("hour"),
    
    WEEK("week");

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
   * Whether the delay settings describe before or after the delay action of an Automation email.
   */
  @JsonAdapter(DirectionEnum.Adapter.class)
 public enum DirectionEnum {
    BEFORE("before"),
    
    AFTER("after");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DirectionEnum fromValue(String value) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DirectionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private DirectionEnum direction;

  /**
   * The action that triggers the delay of an Automation email.
   */
  @JsonAdapter(ActionEnum.Adapter.class)
 public enum ActionEnum {
    PREVIOUS_CAMPAIGN_SENT("previous_campaign_sent"),
    
    PREVIOUS_CAMPAIGN_OPENED("previous_campaign_opened"),
    
    PREVIOUS_CAMPAIGN_NOT_OPENED("previous_campaign_not_opened"),
    
    PREVIOUS_CAMPAIGN_CLICKED_ANY("previous_campaign_clicked_any"),
    
    PREVIOUS_CAMPAIGN_NOT_CLICKED_ANY("previous_campaign_not_clicked_any"),
    
    PREVIOUS_CAMPAIGN_SPECIFIC_CLICKED("previous_campaign_specific_clicked"),
    
    ECOMM_BOUGHT_ANY("ecomm_bought_any"),
    
    ECOMM_BOUGHT_PRODUCT("ecomm_bought_product"),
    
    ECOMM_BOUGHT_CATEGORY("ecomm_bought_category"),
    
    ECOMM_NOT_BOUGHT_ANY("ecomm_not_bought_any"),
    
    ECOMM_ABANDONED_CART("ecomm_abandoned_cart"),
    
    CAMPAIGN_SENT("campaign_sent"),
    
    OPENED_EMAIL("opened_email"),
    
    NOT_OPENED_EMAIL("not_opened_email"),
    
    CLICKED_EMAIL("clicked_email"),
    
    NOT_CLICKED_EMAIL("not_clicked_email"),
    
    CAMPAIGN_SPECIFIC_CLICKED("campaign_specific_clicked"),
    
    MANUAL("manual"),
    
    SIGNUP("signup"),
    
    MERGE_CHANGED("merge_changed"),
    
    GROUP_ADD("group_add"),
    
    GROUP_REMOVE("group_remove"),
    
    MANDRILL_SENT("mandrill_sent"),
    
    MANDRILL_OPENED("mandrill_opened"),
    
    MANDRILL_CLICKED("mandrill_clicked"),
    
    MANDRILL_ANY("mandrill_any"),
    
    API("api"),
    
    GOAL("goal"),
    
    ANNUAL("annual"),
    
    BIRTHDAY("birthday"),
    
    DATE("date"),
    
    DATE_ADDED("date_added"),
    
    TAG_ADD("tag_add");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private ActionEnum action;

  public static final String SERIALIZED_NAME_ACTION_DESCRIPTION = "action_description";
  @SerializedName(SERIALIZED_NAME_ACTION_DESCRIPTION)
  private String actionDescription;

  public static final String SERIALIZED_NAME_FULL_DESCRIPTION = "full_description";
  @SerializedName(SERIALIZED_NAME_FULL_DESCRIPTION)
  private String fullDescription;

  public AutomationDelayProperty4() {
  }

  
  public AutomationDelayProperty4(
     Integer amount, 
     String actionDescription, 
     String fullDescription
  ) {
    this();
    this.amount = amount;
    this.actionDescription = actionDescription;
    this.fullDescription = fullDescription;
  }

   /**
   * The delay amount for an Automation email.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The delay amount for an Automation email.")

  public Integer getAmount() {
    return amount;
  }




  public AutomationDelayProperty4 type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * The type of delay for an Automation email.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of delay for an Automation email.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public AutomationDelayProperty4 direction(DirectionEnum direction) {
    
    
    
    
    this.direction = direction;
    return this;
  }

   /**
   * Whether the delay settings describe before or after the delay action of an Automation email.
   * @return direction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the delay settings describe before or after the delay action of an Automation email.")

  public DirectionEnum getDirection() {
    return direction;
  }


  public void setDirection(DirectionEnum direction) {
    
    
    
    this.direction = direction;
  }


  public AutomationDelayProperty4 action(ActionEnum action) {
    
    
    
    
    this.action = action;
    return this;
  }

   /**
   * The action that triggers the delay of an Automation email.
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The action that triggers the delay of an Automation email.")

  public ActionEnum getAction() {
    return action;
  }


  public void setAction(ActionEnum action) {
    
    
    
    this.action = action;
  }


   /**
   * The user-friendly description of the action that triggers an Automation email.
   * @return actionDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "subscribers purchase anything from your store", value = "The user-friendly description of the action that triggers an Automation email.")

  public String getActionDescription() {
    return actionDescription;
  }




   /**
   * The user-friendly description of the delay and trigger action settings for an Automation email.
   * @return fullDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1 day after subscribers purchase anything from your store", value = "The user-friendly description of the delay and trigger action settings for an Automation email.")

  public String getFullDescription() {
    return fullDescription;
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
   * @return the AutomationDelayProperty4 instance itself
   */
  public AutomationDelayProperty4 putAdditionalProperty(String key, Object value) {
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
    AutomationDelayProperty4 automationDelayProperty4 = (AutomationDelayProperty4) o;
    return Objects.equals(this.amount, automationDelayProperty4.amount) &&
        Objects.equals(this.type, automationDelayProperty4.type) &&
        Objects.equals(this.direction, automationDelayProperty4.direction) &&
        Objects.equals(this.action, automationDelayProperty4.action) &&
        Objects.equals(this.actionDescription, automationDelayProperty4.actionDescription) &&
        Objects.equals(this.fullDescription, automationDelayProperty4.fullDescription)&&
        Objects.equals(this.additionalProperties, automationDelayProperty4.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, type, direction, action, actionDescription, fullDescription, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomationDelayProperty4 {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    actionDescription: ").append(toIndentedString(actionDescription)).append("\n");
    sb.append("    fullDescription: ").append(toIndentedString(fullDescription)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("type");
    openapiFields.add("direction");
    openapiFields.add("action");
    openapiFields.add("action_description");
    openapiFields.add("full_description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AutomationDelayProperty4
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AutomationDelayProperty4.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutomationDelayProperty4 is not found in the empty JSON string", AutomationDelayProperty4.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("direction") != null && !jsonObj.get("direction").isJsonNull()) && !jsonObj.get("direction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `direction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("direction").toString()));
      }
      if ((jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if ((jsonObj.get("action_description") != null && !jsonObj.get("action_description").isJsonNull()) && !jsonObj.get("action_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action_description").toString()));
      }
      if ((jsonObj.get("full_description") != null && !jsonObj.get("full_description").isJsonNull()) && !jsonObj.get("full_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `full_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("full_description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AutomationDelayProperty4.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutomationDelayProperty4' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutomationDelayProperty4> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutomationDelayProperty4.class));

       return (TypeAdapter<T>) new TypeAdapter<AutomationDelayProperty4>() {
           @Override
           public void write(JsonWriter out, AutomationDelayProperty4 value) throws IOException {
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
           public AutomationDelayProperty4 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AutomationDelayProperty4 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AutomationDelayProperty4 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AutomationDelayProperty4
  * @throws IOException if the JSON string is invalid with respect to AutomationDelayProperty4
  */
  public static AutomationDelayProperty4 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutomationDelayProperty4.class);
  }

 /**
  * Convert an instance of AutomationDelayProperty4 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

