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
 * Information about a specific product variant.
 */
@ApiModel(description = "Information about a specific product variant.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ECommerceProductVariant1 {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public static final String SERIALIZED_NAME_INVENTORY_QUANTITY = "inventory_quantity";
  @SerializedName(SERIALIZED_NAME_INVENTORY_QUANTITY)
  private Integer inventoryQuantity;

  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_BACKORDERS = "backorders";
  @SerializedName(SERIALIZED_NAME_BACKORDERS)
  private String backorders;

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private String visibility;

  public ECommerceProductVariant1() {
  }

  public ECommerceProductVariant1 title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * The title of a product variant.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Cat Hat", value = "The title of a product variant.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public ECommerceProductVariant1 url(String url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * The URL for a product variant.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL for a product variant.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    
    
    
    this.url = url;
  }


  public ECommerceProductVariant1 sku(String sku) {
    
    
    
    
    this.sku = sku;
    return this;
  }

   /**
   * The stock keeping unit (SKU) of a product variant.
   * @return sku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The stock keeping unit (SKU) of a product variant.")

  public String getSku() {
    return sku;
  }


  public void setSku(String sku) {
    
    
    
    this.sku = sku;
  }


  public ECommerceProductVariant1 price(Double price) {
    
    
    
    
    this.price = price;
    return this;
  }

  public ECommerceProductVariant1 price(Integer price) {
    
    
    
    
    this.price = price.doubleValue();
    return this;
  }

   /**
   * The price of a product variant.
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The price of a product variant.")

  public Double getPrice() {
    return price;
  }


  public void setPrice(Double price) {
    
    
    
    this.price = price;
  }


  public ECommerceProductVariant1 inventoryQuantity(Integer inventoryQuantity) {
    
    
    
    
    this.inventoryQuantity = inventoryQuantity;
    return this;
  }

   /**
   * The inventory quantity of a product variant.
   * @return inventoryQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The inventory quantity of a product variant.")

  public Integer getInventoryQuantity() {
    return inventoryQuantity;
  }


  public void setInventoryQuantity(Integer inventoryQuantity) {
    
    
    
    this.inventoryQuantity = inventoryQuantity;
  }


  public ECommerceProductVariant1 imageUrl(String imageUrl) {
    
    
    
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * The image URL for a product variant.
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The image URL for a product variant.")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    
    
    
    this.imageUrl = imageUrl;
  }


  public ECommerceProductVariant1 backorders(String backorders) {
    
    
    
    
    this.backorders = backorders;
    return this;
  }

   /**
   * The backorders of a product variant.
   * @return backorders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The backorders of a product variant.")

  public String getBackorders() {
    return backorders;
  }


  public void setBackorders(String backorders) {
    
    
    
    this.backorders = backorders;
  }


  public ECommerceProductVariant1 visibility(String visibility) {
    
    
    
    
    this.visibility = visibility;
    return this;
  }

   /**
   * The visibility of a product variant.
   * @return visibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The visibility of a product variant.")

  public String getVisibility() {
    return visibility;
  }


  public void setVisibility(String visibility) {
    
    
    
    this.visibility = visibility;
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
   * @return the ECommerceProductVariant1 instance itself
   */
  public ECommerceProductVariant1 putAdditionalProperty(String key, Object value) {
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
    ECommerceProductVariant1 eCommerceProductVariant1 = (ECommerceProductVariant1) o;
    return Objects.equals(this.title, eCommerceProductVariant1.title) &&
        Objects.equals(this.url, eCommerceProductVariant1.url) &&
        Objects.equals(this.sku, eCommerceProductVariant1.sku) &&
        Objects.equals(this.price, eCommerceProductVariant1.price) &&
        Objects.equals(this.inventoryQuantity, eCommerceProductVariant1.inventoryQuantity) &&
        Objects.equals(this.imageUrl, eCommerceProductVariant1.imageUrl) &&
        Objects.equals(this.backorders, eCommerceProductVariant1.backorders) &&
        Objects.equals(this.visibility, eCommerceProductVariant1.visibility)&&
        Objects.equals(this.additionalProperties, eCommerceProductVariant1.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, url, sku, price, inventoryQuantity, imageUrl, backorders, visibility, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ECommerceProductVariant1 {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    inventoryQuantity: ").append(toIndentedString(inventoryQuantity)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    backorders: ").append(toIndentedString(backorders)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
    openapiFields.add("url");
    openapiFields.add("sku");
    openapiFields.add("price");
    openapiFields.add("inventory_quantity");
    openapiFields.add("image_url");
    openapiFields.add("backorders");
    openapiFields.add("visibility");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ECommerceProductVariant1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ECommerceProductVariant1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ECommerceProductVariant1 is not found in the empty JSON string", ECommerceProductVariant1.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("sku") != null && !jsonObj.get("sku").isJsonNull()) && !jsonObj.get("sku").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sku` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sku").toString()));
      }
      if ((jsonObj.get("image_url") != null && !jsonObj.get("image_url").isJsonNull()) && !jsonObj.get("image_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image_url").toString()));
      }
      if ((jsonObj.get("backorders") != null && !jsonObj.get("backorders").isJsonNull()) && !jsonObj.get("backorders").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backorders` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backorders").toString()));
      }
      if ((jsonObj.get("visibility") != null && !jsonObj.get("visibility").isJsonNull()) && !jsonObj.get("visibility").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visibility").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ECommerceProductVariant1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ECommerceProductVariant1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ECommerceProductVariant1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ECommerceProductVariant1.class));

       return (TypeAdapter<T>) new TypeAdapter<ECommerceProductVariant1>() {
           @Override
           public void write(JsonWriter out, ECommerceProductVariant1 value) throws IOException {
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
           public ECommerceProductVariant1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ECommerceProductVariant1 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ECommerceProductVariant1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ECommerceProductVariant1
  * @throws IOException if the JSON string is invalid with respect to ECommerceProductVariant1
  */
  public static ECommerceProductVariant1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ECommerceProductVariant1.class);
  }

 /**
  * Convert an instance of ECommerceProductVariant1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
