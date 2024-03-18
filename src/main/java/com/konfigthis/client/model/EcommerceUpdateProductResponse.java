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
import com.konfigthis.client.model.ECommerceProductImage2;
import com.konfigthis.client.model.ECommerceProductVariant8;
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
 * Information about a specific product.
 */
@ApiModel(description = "Information about a specific product.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EcommerceUpdateProductResponse {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_HANDLE = "handle";
  @SerializedName(SERIALIZED_NAME_HANDLE)
  private String handle;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VENDOR = "vendor";
  @SerializedName(SERIALIZED_NAME_VENDOR)
  private String vendor;

  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_VARIANTS = "variants";
  @SerializedName(SERIALIZED_NAME_VARIANTS)
  private List<ECommerceProductVariant8> variants = null;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<ECommerceProductImage2> images = null;

  public static final String SERIALIZED_NAME_PUBLISHED_AT_FOREIGN = "published_at_foreign";
  @SerializedName(SERIALIZED_NAME_PUBLISHED_AT_FOREIGN)
  private OffsetDateTime publishedAtForeign;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<ResourceLink> links = null;

  public EcommerceUpdateProductResponse() {
  }

  
  public EcommerceUpdateProductResponse(
     String id, 
     String currencyCode, 
     List<ResourceLink> links
  ) {
    this();
    this.id = id;
    this.currencyCode = currencyCode;
    this.links = links;
  }

  public EcommerceUpdateProductResponse title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * The title of a product.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Cat Hat", value = "The title of a product.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public EcommerceUpdateProductResponse description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * The description of a product.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This is a cat hat.", value = "The description of a product.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


   /**
   * A unique identifier for the product.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier for the product.")

  public String getId() {
    return id;
  }




   /**
   * The currency code
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The currency code")

  public String getCurrencyCode() {
    return currencyCode;
  }




  public EcommerceUpdateProductResponse handle(String handle) {
    
    
    
    
    this.handle = handle;
    return this;
  }

   /**
   * The handle of a product.
   * @return handle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "cat-hat", value = "The handle of a product.")

  public String getHandle() {
    return handle;
  }


  public void setHandle(String handle) {
    
    
    
    this.handle = handle;
  }


  public EcommerceUpdateProductResponse url(String url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * The URL for a product.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL for a product.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    
    
    
    this.url = url;
  }


  public EcommerceUpdateProductResponse type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * The type of product.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Accessories", value = "The type of product.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public EcommerceUpdateProductResponse vendor(String vendor) {
    
    
    
    
    this.vendor = vendor;
    return this;
  }

   /**
   * The vendor for a product.
   * @return vendor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The vendor for a product.")

  public String getVendor() {
    return vendor;
  }


  public void setVendor(String vendor) {
    
    
    
    this.vendor = vendor;
  }


  public EcommerceUpdateProductResponse imageUrl(String imageUrl) {
    
    
    
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * The image URL for a product.
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The image URL for a product.")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    
    
    
    this.imageUrl = imageUrl;
  }


  public EcommerceUpdateProductResponse variants(List<ECommerceProductVariant8> variants) {
    
    
    
    
    this.variants = variants;
    return this;
  }

  public EcommerceUpdateProductResponse addVariantsItem(ECommerceProductVariant8 variantsItem) {
    if (this.variants == null) {
      this.variants = new ArrayList<>();
    }
    this.variants.add(variantsItem);
    return this;
  }

   /**
   * Returns up to 50 of the product&#39;s variants. To retrieve all variants use [Product Variants](https://mailchimp.com/developer/marketing/api/ecommerce-product-variants/).
   * @return variants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns up to 50 of the product's variants. To retrieve all variants use [Product Variants](https://mailchimp.com/developer/marketing/api/ecommerce-product-variants/).")

  public List<ECommerceProductVariant8> getVariants() {
    return variants;
  }


  public void setVariants(List<ECommerceProductVariant8> variants) {
    
    
    
    this.variants = variants;
  }


  public EcommerceUpdateProductResponse images(List<ECommerceProductImage2> images) {
    
    
    
    
    this.images = images;
    return this;
  }

  public EcommerceUpdateProductResponse addImagesItem(ECommerceProductImage2 imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * An array of the product&#39;s images.
   * @return images
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of the product's images.")

  public List<ECommerceProductImage2> getImages() {
    return images;
  }


  public void setImages(List<ECommerceProductImage2> images) {
    
    
    
    this.images = images;
  }


  public EcommerceUpdateProductResponse publishedAtForeign(OffsetDateTime publishedAtForeign) {
    
    
    
    
    this.publishedAtForeign = publishedAtForeign;
    return this;
  }

   /**
   * The date and time the product was published in ISO 8601 format.
   * @return publishedAtForeign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-07-15T19:28Z", value = "The date and time the product was published in ISO 8601 format.")

  public OffsetDateTime getPublishedAtForeign() {
    return publishedAtForeign;
  }


  public void setPublishedAtForeign(OffsetDateTime publishedAtForeign) {
    
    
    
    this.publishedAtForeign = publishedAtForeign;
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
   * @return the EcommerceUpdateProductResponse instance itself
   */
  public EcommerceUpdateProductResponse putAdditionalProperty(String key, Object value) {
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
    EcommerceUpdateProductResponse ecommerceUpdateProductResponse = (EcommerceUpdateProductResponse) o;
    return Objects.equals(this.title, ecommerceUpdateProductResponse.title) &&
        Objects.equals(this.description, ecommerceUpdateProductResponse.description) &&
        Objects.equals(this.id, ecommerceUpdateProductResponse.id) &&
        Objects.equals(this.currencyCode, ecommerceUpdateProductResponse.currencyCode) &&
        Objects.equals(this.handle, ecommerceUpdateProductResponse.handle) &&
        Objects.equals(this.url, ecommerceUpdateProductResponse.url) &&
        Objects.equals(this.type, ecommerceUpdateProductResponse.type) &&
        Objects.equals(this.vendor, ecommerceUpdateProductResponse.vendor) &&
        Objects.equals(this.imageUrl, ecommerceUpdateProductResponse.imageUrl) &&
        Objects.equals(this.variants, ecommerceUpdateProductResponse.variants) &&
        Objects.equals(this.images, ecommerceUpdateProductResponse.images) &&
        Objects.equals(this.publishedAtForeign, ecommerceUpdateProductResponse.publishedAtForeign) &&
        Objects.equals(this.links, ecommerceUpdateProductResponse.links)&&
        Objects.equals(this.additionalProperties, ecommerceUpdateProductResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, id, currencyCode, handle, url, type, vendor, imageUrl, variants, images, publishedAtForeign, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EcommerceUpdateProductResponse {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    variants: ").append(toIndentedString(variants)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    publishedAtForeign: ").append(toIndentedString(publishedAtForeign)).append("\n");
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
    openapiFields.add("currency_code");
    openapiFields.add("handle");
    openapiFields.add("url");
    openapiFields.add("type");
    openapiFields.add("vendor");
    openapiFields.add("image_url");
    openapiFields.add("variants");
    openapiFields.add("images");
    openapiFields.add("published_at_foreign");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EcommerceUpdateProductResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EcommerceUpdateProductResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EcommerceUpdateProductResponse is not found in the empty JSON string", EcommerceUpdateProductResponse.openapiRequiredFields.toString()));
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
      if ((jsonObj.get("currency_code") != null && !jsonObj.get("currency_code").isJsonNull()) && !jsonObj.get("currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_code").toString()));
      }
      if ((jsonObj.get("handle") != null && !jsonObj.get("handle").isJsonNull()) && !jsonObj.get("handle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `handle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("handle").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("vendor") != null && !jsonObj.get("vendor").isJsonNull()) && !jsonObj.get("vendor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor").toString()));
      }
      if ((jsonObj.get("image_url") != null && !jsonObj.get("image_url").isJsonNull()) && !jsonObj.get("image_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image_url").toString()));
      }
      if (jsonObj.get("variants") != null && !jsonObj.get("variants").isJsonNull()) {
        JsonArray jsonArrayvariants = jsonObj.getAsJsonArray("variants");
        if (jsonArrayvariants != null) {
          // ensure the json data is an array
          if (!jsonObj.get("variants").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `variants` to be an array in the JSON string but got `%s`", jsonObj.get("variants").toString()));
          }

          // validate the optional field `variants` (array)
          for (int i = 0; i < jsonArrayvariants.size(); i++) {
            ECommerceProductVariant8.validateJsonObject(jsonArrayvariants.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("images") != null && !jsonObj.get("images").isJsonNull()) {
        JsonArray jsonArrayimages = jsonObj.getAsJsonArray("images");
        if (jsonArrayimages != null) {
          // ensure the json data is an array
          if (!jsonObj.get("images").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `images` to be an array in the JSON string but got `%s`", jsonObj.get("images").toString()));
          }

          // validate the optional field `images` (array)
          for (int i = 0; i < jsonArrayimages.size(); i++) {
            ECommerceProductImage2.validateJsonObject(jsonArrayimages.get(i).getAsJsonObject());
          };
        }
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
       if (!EcommerceUpdateProductResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EcommerceUpdateProductResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EcommerceUpdateProductResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EcommerceUpdateProductResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EcommerceUpdateProductResponse>() {
           @Override
           public void write(JsonWriter out, EcommerceUpdateProductResponse value) throws IOException {
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
           public EcommerceUpdateProductResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EcommerceUpdateProductResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EcommerceUpdateProductResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EcommerceUpdateProductResponse
  * @throws IOException if the JSON string is invalid with respect to EcommerceUpdateProductResponse
  */
  public static EcommerceUpdateProductResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EcommerceUpdateProductResponse.class);
  }

 /**
  * Convert an instance of EcommerceUpdateProductResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

