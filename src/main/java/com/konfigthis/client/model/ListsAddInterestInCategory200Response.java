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
 * Assign subscribers to interests to group them together. Interests are referred to as &#39;group names&#39; in the Mailchimp application.
 */
@ApiModel(description = "Assign subscribers to interests to group them together. Interests are referred to as 'group names' in the Mailchimp application.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ListsAddInterestInCategory200Response {
  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_LIST_ID = "list_id";
  @SerializedName(SERIALIZED_NAME_LIST_ID)
  private String listId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SUBSCRIBER_COUNT = "subscriber_count";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBER_COUNT)
  private String subscriberCount;

  public static final String SERIALIZED_NAME_DISPLAY_ORDER = "display_order";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ORDER)
  private Integer displayOrder;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<ResourceLink> links = null;

  public ListsAddInterestInCategory200Response() {
  }

  
  public ListsAddInterestInCategory200Response(
     String categoryId, 
     String listId, 
     String id, 
     String subscriberCount, 
     List<ResourceLink> links
  ) {
    this();
    this.categoryId = categoryId;
    this.listId = listId;
    this.id = id;
    this.subscriberCount = subscriberCount;
    this.links = links;
  }

   /**
   * The id for the interest category.
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id for the interest category.")

  public String getCategoryId() {
    return categoryId;
  }




   /**
   * The ID for the list that this interest belongs to.
   * @return listId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID for the list that this interest belongs to.")

  public String getListId() {
    return listId;
  }




   /**
   * The ID for the interest.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID for the interest.")

  public String getId() {
    return id;
  }




  public ListsAddInterestInCategory200Response name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the interest. This can be shown publicly on a subscription form.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the interest. This can be shown publicly on a subscription form.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


   /**
   * The number of subscribers associated with this interest.
   * @return subscriberCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of subscribers associated with this interest.")

  public String getSubscriberCount() {
    return subscriberCount;
  }




  public ListsAddInterestInCategory200Response displayOrder(Integer displayOrder) {
    
    
    
    
    this.displayOrder = displayOrder;
    return this;
  }

   /**
   * The display order for interests.
   * @return displayOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display order for interests.")

  public Integer getDisplayOrder() {
    return displayOrder;
  }


  public void setDisplayOrder(Integer displayOrder) {
    
    
    
    this.displayOrder = displayOrder;
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
   * @return the ListsAddInterestInCategory200Response instance itself
   */
  public ListsAddInterestInCategory200Response putAdditionalProperty(String key, Object value) {
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
    ListsAddInterestInCategory200Response listsAddInterestInCategory200Response = (ListsAddInterestInCategory200Response) o;
    return Objects.equals(this.categoryId, listsAddInterestInCategory200Response.categoryId) &&
        Objects.equals(this.listId, listsAddInterestInCategory200Response.listId) &&
        Objects.equals(this.id, listsAddInterestInCategory200Response.id) &&
        Objects.equals(this.name, listsAddInterestInCategory200Response.name) &&
        Objects.equals(this.subscriberCount, listsAddInterestInCategory200Response.subscriberCount) &&
        Objects.equals(this.displayOrder, listsAddInterestInCategory200Response.displayOrder) &&
        Objects.equals(this.links, listsAddInterestInCategory200Response.links)&&
        Objects.equals(this.additionalProperties, listsAddInterestInCategory200Response.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, listId, id, name, subscriberCount, displayOrder, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListsAddInterestInCategory200Response {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subscriberCount: ").append(toIndentedString(subscriberCount)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
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
    openapiFields.add("category_id");
    openapiFields.add("list_id");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("subscriber_count");
    openapiFields.add("display_order");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListsAddInterestInCategory200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListsAddInterestInCategory200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListsAddInterestInCategory200Response is not found in the empty JSON string", ListsAddInterestInCategory200Response.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("category_id") != null && !jsonObj.get("category_id").isJsonNull()) && !jsonObj.get("category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_id").toString()));
      }
      if ((jsonObj.get("list_id") != null && !jsonObj.get("list_id").isJsonNull()) && !jsonObj.get("list_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `list_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("list_id").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("subscriber_count") != null && !jsonObj.get("subscriber_count").isJsonNull()) && !jsonObj.get("subscriber_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriber_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriber_count").toString()));
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
       if (!ListsAddInterestInCategory200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListsAddInterestInCategory200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListsAddInterestInCategory200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListsAddInterestInCategory200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ListsAddInterestInCategory200Response>() {
           @Override
           public void write(JsonWriter out, ListsAddInterestInCategory200Response value) throws IOException {
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
           public ListsAddInterestInCategory200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ListsAddInterestInCategory200Response instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ListsAddInterestInCategory200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListsAddInterestInCategory200Response
  * @throws IOException if the JSON string is invalid with respect to ListsAddInterestInCategory200Response
  */
  public static ListsAddInterestInCategory200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListsAddInterestInCategory200Response.class);
  }

 /**
  * Convert an instance of ListsAddInterestInCategory200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

