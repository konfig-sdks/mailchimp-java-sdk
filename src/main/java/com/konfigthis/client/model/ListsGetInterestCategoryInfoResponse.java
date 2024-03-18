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
 * Interest categories organize interests, which are used to group subscribers based on their preferences. These correspond to Group Titles the application.
 */
@ApiModel(description = "Interest categories organize interests, which are used to group subscribers based on their preferences. These correspond to Group Titles the application.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ListsGetInterestCategoryInfoResponse {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_LIST_ID = "list_id";
  @SerializedName(SERIALIZED_NAME_LIST_ID)
  private String listId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DISPLAY_ORDER = "display_order";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ORDER)
  private Integer displayOrder;

  /**
   * Determines how this category’s interests appear on signup forms.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    CHECKBOXES("checkboxes"),
    
    DROPDOWN("dropdown"),
    
    RADIO("radio"),
    
    HIDDEN("hidden");

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

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<ResourceLink> links = null;

  public ListsGetInterestCategoryInfoResponse() {
  }

  
  public ListsGetInterestCategoryInfoResponse(
     String listId, 
     String id, 
     List<ResourceLink> links
  ) {
    this();
    this.listId = listId;
    this.id = id;
    this.links = links;
  }

  public ListsGetInterestCategoryInfoResponse title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * The text description of this category. This field appears on signup forms and is often phrased as a question.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The text description of this category. This field appears on signup forms and is often phrased as a question.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


   /**
   * The unique list id for the category.
   * @return listId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique list id for the category.")

  public String getListId() {
    return listId;
  }




   /**
   * The id for the interest category.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id for the interest category.")

  public String getId() {
    return id;
  }




  public ListsGetInterestCategoryInfoResponse displayOrder(Integer displayOrder) {
    
    
    
    
    this.displayOrder = displayOrder;
    return this;
  }

   /**
   * The order that the categories are displayed in the list. Lower numbers display first.
   * @return displayOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The order that the categories are displayed in the list. Lower numbers display first.")

  public Integer getDisplayOrder() {
    return displayOrder;
  }


  public void setDisplayOrder(Integer displayOrder) {
    
    
    
    this.displayOrder = displayOrder;
  }


  public ListsGetInterestCategoryInfoResponse type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Determines how this category’s interests appear on signup forms.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines how this category’s interests appear on signup forms.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
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
   * @return the ListsGetInterestCategoryInfoResponse instance itself
   */
  public ListsGetInterestCategoryInfoResponse putAdditionalProperty(String key, Object value) {
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
    ListsGetInterestCategoryInfoResponse listsGetInterestCategoryInfoResponse = (ListsGetInterestCategoryInfoResponse) o;
    return Objects.equals(this.title, listsGetInterestCategoryInfoResponse.title) &&
        Objects.equals(this.listId, listsGetInterestCategoryInfoResponse.listId) &&
        Objects.equals(this.id, listsGetInterestCategoryInfoResponse.id) &&
        Objects.equals(this.displayOrder, listsGetInterestCategoryInfoResponse.displayOrder) &&
        Objects.equals(this.type, listsGetInterestCategoryInfoResponse.type) &&
        Objects.equals(this.links, listsGetInterestCategoryInfoResponse.links)&&
        Objects.equals(this.additionalProperties, listsGetInterestCategoryInfoResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, listId, id, displayOrder, type, links, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListsGetInterestCategoryInfoResponse {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("list_id");
    openapiFields.add("id");
    openapiFields.add("display_order");
    openapiFields.add("type");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListsGetInterestCategoryInfoResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListsGetInterestCategoryInfoResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListsGetInterestCategoryInfoResponse is not found in the empty JSON string", ListsGetInterestCategoryInfoResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("list_id") != null && !jsonObj.get("list_id").isJsonNull()) && !jsonObj.get("list_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `list_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("list_id").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
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
       if (!ListsGetInterestCategoryInfoResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListsGetInterestCategoryInfoResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListsGetInterestCategoryInfoResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListsGetInterestCategoryInfoResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListsGetInterestCategoryInfoResponse>() {
           @Override
           public void write(JsonWriter out, ListsGetInterestCategoryInfoResponse value) throws IOException {
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
           public ListsGetInterestCategoryInfoResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ListsGetInterestCategoryInfoResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ListsGetInterestCategoryInfoResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListsGetInterestCategoryInfoResponse
  * @throws IOException if the JSON string is invalid with respect to ListsGetInterestCategoryInfoResponse
  */
  public static ListsGetInterestCategoryInfoResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListsGetInterestCategoryInfoResponse.class);
  }

 /**
  * Convert an instance of ListsGetInterestCategoryInfoResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

