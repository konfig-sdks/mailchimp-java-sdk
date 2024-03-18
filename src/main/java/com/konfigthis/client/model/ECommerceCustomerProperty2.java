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
import com.konfigthis.client.model.AddressProperty7;
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
 * Information about a specific customer. For existing customers include only the &#x60;id&#x60; parameter in the &#x60;customer&#x60; object body.
 */
@ApiModel(description = "Information about a specific customer. For existing customers include only the `id` parameter in the `customer` object body.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ECommerceCustomerProperty2 {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_OPT_IN_STATUS = "opt_in_status";
  @SerializedName(SERIALIZED_NAME_OPT_IN_STATUS)
  private Boolean optInStatus;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private String company;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private AddressProperty7 address;

  public ECommerceCustomerProperty2() {
  }

  public ECommerceCustomerProperty2 id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * A unique identifier for the customer. Limited to 50 characters.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A unique identifier for the customer. Limited to 50 characters.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public ECommerceCustomerProperty2 emailAddress(String emailAddress) {
    
    
    
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The customer&#39;s email address.
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The customer's email address.")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    
    
    
    this.emailAddress = emailAddress;
  }


  public ECommerceCustomerProperty2 optInStatus(Boolean optInStatus) {
    
    
    
    
    this.optInStatus = optInStatus;
    return this;
  }

   /**
   * The customer&#39;s opt-in status. This value will never overwrite the opt-in status of a pre-existing Mailchimp list member, but will apply to list members that are added through the e-commerce API endpoints. Customers who don&#39;t opt in to your Mailchimp list [will be added as &#x60;Transactional&#x60; members](https://mailchimp.com/developer/marketing/docs/e-commerce/#customers).
   * @return optInStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The customer's opt-in status. This value will never overwrite the opt-in status of a pre-existing Mailchimp list member, but will apply to list members that are added through the e-commerce API endpoints. Customers who don't opt in to your Mailchimp list [will be added as `Transactional` members](https://mailchimp.com/developer/marketing/docs/e-commerce/#customers).")

  public Boolean getOptInStatus() {
    return optInStatus;
  }


  public void setOptInStatus(Boolean optInStatus) {
    
    
    
    this.optInStatus = optInStatus;
  }


  public ECommerceCustomerProperty2 company(String company) {
    
    
    
    
    this.company = company;
    return this;
  }

   /**
   * The customer&#39;s company.
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The customer's company.")

  public String getCompany() {
    return company;
  }


  public void setCompany(String company) {
    
    
    
    this.company = company;
  }


  public ECommerceCustomerProperty2 firstName(String firstName) {
    
    
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The customer&#39;s first name.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The customer's first name.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    
    
    this.firstName = firstName;
  }


  public ECommerceCustomerProperty2 lastName(String lastName) {
    
    
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The customer&#39;s last name.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The customer's last name.")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    
    
    
    this.lastName = lastName;
  }


  public ECommerceCustomerProperty2 address(AddressProperty7 address) {
    
    
    
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AddressProperty7 getAddress() {
    return address;
  }


  public void setAddress(AddressProperty7 address) {
    
    
    
    this.address = address;
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
   * @return the ECommerceCustomerProperty2 instance itself
   */
  public ECommerceCustomerProperty2 putAdditionalProperty(String key, Object value) {
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
    ECommerceCustomerProperty2 eCommerceCustomerProperty2 = (ECommerceCustomerProperty2) o;
    return Objects.equals(this.id, eCommerceCustomerProperty2.id) &&
        Objects.equals(this.emailAddress, eCommerceCustomerProperty2.emailAddress) &&
        Objects.equals(this.optInStatus, eCommerceCustomerProperty2.optInStatus) &&
        Objects.equals(this.company, eCommerceCustomerProperty2.company) &&
        Objects.equals(this.firstName, eCommerceCustomerProperty2.firstName) &&
        Objects.equals(this.lastName, eCommerceCustomerProperty2.lastName) &&
        Objects.equals(this.address, eCommerceCustomerProperty2.address)&&
        Objects.equals(this.additionalProperties, eCommerceCustomerProperty2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, emailAddress, optInStatus, company, firstName, lastName, address, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ECommerceCustomerProperty2 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    optInStatus: ").append(toIndentedString(optInStatus)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
    openapiFields.add("email_address");
    openapiFields.add("opt_in_status");
    openapiFields.add("company");
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("address");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ECommerceCustomerProperty2
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ECommerceCustomerProperty2.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ECommerceCustomerProperty2 is not found in the empty JSON string", ECommerceCustomerProperty2.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ECommerceCustomerProperty2.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("email_address") != null && !jsonObj.get("email_address").isJsonNull()) && !jsonObj.get("email_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email_address").toString()));
      }
      if ((jsonObj.get("company") != null && !jsonObj.get("company").isJsonNull()) && !jsonObj.get("company").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company").toString()));
      }
      if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        AddressProperty7.validateJsonObject(jsonObj.getAsJsonObject("address"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ECommerceCustomerProperty2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ECommerceCustomerProperty2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ECommerceCustomerProperty2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ECommerceCustomerProperty2.class));

       return (TypeAdapter<T>) new TypeAdapter<ECommerceCustomerProperty2>() {
           @Override
           public void write(JsonWriter out, ECommerceCustomerProperty2 value) throws IOException {
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
           public ECommerceCustomerProperty2 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ECommerceCustomerProperty2 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ECommerceCustomerProperty2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ECommerceCustomerProperty2
  * @throws IOException if the JSON string is invalid with respect to ECommerceCustomerProperty2
  */
  public static ECommerceCustomerProperty2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ECommerceCustomerProperty2.class);
  }

 /**
  * Convert an instance of ECommerceCustomerProperty2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

