/*
 * Klarna Payments API V1
 * The payments API is used to create a session to offer Klarna's payment methods as part of your checkout. As soon as the purchase is completed the order should be read and handled using the [`Order Management API`](https://docs.klarna.com/api/ordermanagement).  **Note:** Examples provided in this section includes full payloads, including all supported fields , required and optionals. In order to implement a best in class request we recommend you don't include customer details when initiating a payment session. Refer to [Initiate a payment](https://docs.klarna.com/klarna-payments/integrate-with-klarna-payments/step-1-initiate-a-payment/) section for further details.  Read more on [Klarna payments](https://docs.klarna.com/klarna-payments/).
 *
 * The version of the OpenAPI document: 1.0.0
 * 
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
 * MerchantUrls
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MerchantUrls {
  public static final String SERIALIZED_NAME_CONFIRMATION = "confirmation";
  @SerializedName(SERIALIZED_NAME_CONFIRMATION)
  private String confirmation;

  public static final String SERIALIZED_NAME_NOTIFICATION = "notification";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION)
  private String notification;

  public static final String SERIALIZED_NAME_PUSH = "push";
  @SerializedName(SERIALIZED_NAME_PUSH)
  private String push;

  public static final String SERIALIZED_NAME_AUTHORIZATION = "authorization";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION)
  private String authorization;

  public MerchantUrls() {
  }

  public MerchantUrls confirmation(String confirmation) {
    
    
    if (confirmation != null && confirmation.length() < 0) {
      throw new IllegalArgumentException("Invalid value for confirmation. Length must be greater than or equal to 0.");
    }
    
    this.confirmation = confirmation;
    return this;
  }

   /**
   * URL of the merchant confirmation page. The consumer will be redirected back to the confirmation page if the consumer is sent to the redirect URL after placing the order. Insert {session.id} and/or {order.id} as placeholder to connect either of those IDs to the URL(max 2000 characters).
   * @return confirmation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.example-url.com/confirmation", value = "URL of the merchant confirmation page. The consumer will be redirected back to the confirmation page if the consumer is sent to the redirect URL after placing the order. Insert {session.id} and/or {order.id} as placeholder to connect either of those IDs to the URL(max 2000 characters).")

  public String getConfirmation() {
    return confirmation;
  }


  public void setConfirmation(String confirmation) {
    
    
    if (confirmation != null && confirmation.length() < 0) {
      throw new IllegalArgumentException("Invalid value for confirmation. Length must be greater than or equal to 0.");
    }
    this.confirmation = confirmation;
  }


  public MerchantUrls notification(String notification) {
    
    
    if (notification != null && notification.length() < 0) {
      throw new IllegalArgumentException("Invalid value for notification. Length must be greater than or equal to 0.");
    }
    
    this.notification = notification;
    return this;
  }

   /**
   * URL for notifications on pending orders. Insert {session.id} and/or {order.id} as placeholder to connect either of those IDs to the URL (max 2000 characters).
   * @return notification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.example-url.com/notification", value = "URL for notifications on pending orders. Insert {session.id} and/or {order.id} as placeholder to connect either of those IDs to the URL (max 2000 characters).")

  public String getNotification() {
    return notification;
  }


  public void setNotification(String notification) {
    
    
    if (notification != null && notification.length() < 0) {
      throw new IllegalArgumentException("Invalid value for notification. Length must be greater than or equal to 0.");
    }
    this.notification = notification;
  }


  public MerchantUrls push(String push) {
    
    
    if (push != null && push.length() < 0) {
      throw new IllegalArgumentException("Invalid value for push. Length must be greater than or equal to 0.");
    }
    
    this.push = push;
    return this;
  }

   /**
   * URL that will be requested when an order is completed. Should be different than checkout and confirmation URLs. Insert {session.id} and/or {order.id} as placeholder to connect either of those IDs to the URL (max 2000 characters).
   * @return push
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.example-url.com/push", value = "URL that will be requested when an order is completed. Should be different than checkout and confirmation URLs. Insert {session.id} and/or {order.id} as placeholder to connect either of those IDs to the URL (max 2000 characters).")

  public String getPush() {
    return push;
  }


  public void setPush(String push) {
    
    
    if (push != null && push.length() < 0) {
      throw new IllegalArgumentException("Invalid value for push. Length must be greater than or equal to 0.");
    }
    this.push = push;
  }


  public MerchantUrls authorization(String authorization) {
    
    
    if (authorization != null && authorization.length() < 0) {
      throw new IllegalArgumentException("Invalid value for authorization. Length must be greater than or equal to 0.");
    }
    
    this.authorization = authorization;
    return this;
  }

   /**
   * URL for receiving the authorization token when payment is completed. Used for Authorization Callback.
   * @return authorization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.example-url.com/authorization", value = "URL for receiving the authorization token when payment is completed. Used for Authorization Callback.")

  public String getAuthorization() {
    return authorization;
  }


  public void setAuthorization(String authorization) {
    
    
    if (authorization != null && authorization.length() < 0) {
      throw new IllegalArgumentException("Invalid value for authorization. Length must be greater than or equal to 0.");
    }
    this.authorization = authorization;
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
   * @return the MerchantUrls instance itself
   */
  public MerchantUrls putAdditionalProperty(String key, Object value) {
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
    MerchantUrls merchantUrls = (MerchantUrls) o;
    return Objects.equals(this.confirmation, merchantUrls.confirmation) &&
        Objects.equals(this.notification, merchantUrls.notification) &&
        Objects.equals(this.push, merchantUrls.push) &&
        Objects.equals(this.authorization, merchantUrls.authorization)&&
        Objects.equals(this.additionalProperties, merchantUrls.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confirmation, notification, push, authorization, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantUrls {\n");
    sb.append("    confirmation: ").append(toIndentedString(confirmation)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    push: ").append(toIndentedString(push)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
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
    openapiFields.add("confirmation");
    openapiFields.add("notification");
    openapiFields.add("push");
    openapiFields.add("authorization");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MerchantUrls
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MerchantUrls.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantUrls is not found in the empty JSON string", MerchantUrls.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("confirmation") != null && !jsonObj.get("confirmation").isJsonNull()) && !jsonObj.get("confirmation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `confirmation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("confirmation").toString()));
      }
      if ((jsonObj.get("notification") != null && !jsonObj.get("notification").isJsonNull()) && !jsonObj.get("notification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notification").toString()));
      }
      if ((jsonObj.get("push") != null && !jsonObj.get("push").isJsonNull()) && !jsonObj.get("push").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `push` to be a primitive type in the JSON string but got `%s`", jsonObj.get("push").toString()));
      }
      if ((jsonObj.get("authorization") != null && !jsonObj.get("authorization").isJsonNull()) && !jsonObj.get("authorization").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorization` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorization").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantUrls.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantUrls' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantUrls> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantUrls.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantUrls>() {
           @Override
           public void write(JsonWriter out, MerchantUrls value) throws IOException {
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
           public MerchantUrls read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MerchantUrls instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MerchantUrls given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerchantUrls
  * @throws IOException if the JSON string is invalid with respect to MerchantUrls
  */
  public static MerchantUrls fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantUrls.class);
  }

 /**
  * Convert an instance of MerchantUrls to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
