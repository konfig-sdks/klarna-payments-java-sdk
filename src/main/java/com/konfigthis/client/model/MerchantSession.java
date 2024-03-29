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
import com.konfigthis.client.model.PaymentMethodCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

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
 * MerchantSession
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MerchantSession {
  public static final String SERIALIZED_NAME_CLIENT_TOKEN = "client_token";
  @SerializedName(SERIALIZED_NAME_CLIENT_TOKEN)
  private String clientToken;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD_CATEGORIES = "payment_method_categories";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD_CATEGORIES)
  private Set<PaymentMethodCategory> paymentMethodCategories = null;

  public static final String SERIALIZED_NAME_SESSION_ID = "session_id";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private String sessionId;

  public MerchantSession() {
  }

  public MerchantSession clientToken(String clientToken) {
    
    
    if (clientToken != null && clientToken.length() < 0) {
      throw new IllegalArgumentException("Invalid value for clientToken. Length must be greater than or equal to 0.");
    }
    
    this.clientToken = clientToken;
    return this;
  }

   /**
   * Client token to be passed to the JS client while initializing the JS SDK in the next step.
   * @return clientToken
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.ewogICJzZXNzaW9uX2lkIiA6ICIw", required = true, value = "Client token to be passed to the JS client while initializing the JS SDK in the next step.")

  public String getClientToken() {
    return clientToken;
  }


  public void setClientToken(String clientToken) {
    
    
    if (clientToken != null && clientToken.length() < 0) {
      throw new IllegalArgumentException("Invalid value for clientToken. Length must be greater than or equal to 0.");
    }
    this.clientToken = clientToken;
  }


  public MerchantSession paymentMethodCategories(Set<PaymentMethodCategory> paymentMethodCategories) {
    
    
    
    
    this.paymentMethodCategories = paymentMethodCategories;
    return this;
  }

  public MerchantSession addPaymentMethodCategoriesItem(PaymentMethodCategory paymentMethodCategoriesItem) {
    if (this.paymentMethodCategories == null) {
      this.paymentMethodCategories = new LinkedHashSet<>();
    }
    this.paymentMethodCategories.add(paymentMethodCategoriesItem);
    return this;
  }

   /**
   * Available payment method categories for this particular session
   * @return paymentMethodCategories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Available payment method categories for this particular session")

  public Set<PaymentMethodCategory> getPaymentMethodCategories() {
    return paymentMethodCategories;
  }


  public void setPaymentMethodCategories(Set<PaymentMethodCategory> paymentMethodCategories) {
    
    
    
    this.paymentMethodCategories = paymentMethodCategories;
  }


  public MerchantSession sessionId(String sessionId) {
    
    
    if (sessionId != null && sessionId.length() < 0) {
      throw new IllegalArgumentException("Invalid value for sessionId. Length must be greater than or equal to 0.");
    }
    
    this.sessionId = sessionId;
    return this;
  }

   /**
   * ID of the created session. Please use this ID to share with Klarna for identifying any issues during integration.
   * @return sessionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0b1d9815-165e-42e2-8867-35bc03789e00", required = true, value = "ID of the created session. Please use this ID to share with Klarna for identifying any issues during integration.")

  public String getSessionId() {
    return sessionId;
  }


  public void setSessionId(String sessionId) {
    
    
    if (sessionId != null && sessionId.length() < 0) {
      throw new IllegalArgumentException("Invalid value for sessionId. Length must be greater than or equal to 0.");
    }
    this.sessionId = sessionId;
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
   * @return the MerchantSession instance itself
   */
  public MerchantSession putAdditionalProperty(String key, Object value) {
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
    MerchantSession merchantSession = (MerchantSession) o;
    return Objects.equals(this.clientToken, merchantSession.clientToken) &&
        Objects.equals(this.paymentMethodCategories, merchantSession.paymentMethodCategories) &&
        Objects.equals(this.sessionId, merchantSession.sessionId)&&
        Objects.equals(this.additionalProperties, merchantSession.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientToken, paymentMethodCategories, sessionId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantSession {\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    paymentMethodCategories: ").append(toIndentedString(paymentMethodCategories)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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
    openapiFields.add("client_token");
    openapiFields.add("payment_method_categories");
    openapiFields.add("session_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("client_token");
    openapiRequiredFields.add("session_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MerchantSession
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MerchantSession.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantSession is not found in the empty JSON string", MerchantSession.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MerchantSession.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("client_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_token").toString()));
      }
      if (jsonObj.get("payment_method_categories") != null && !jsonObj.get("payment_method_categories").isJsonNull()) {
        JsonArray jsonArraypaymentMethodCategories = jsonObj.getAsJsonArray("payment_method_categories");
        if (jsonArraypaymentMethodCategories != null) {
          // ensure the json data is an array
          if (!jsonObj.get("payment_method_categories").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `payment_method_categories` to be an array in the JSON string but got `%s`", jsonObj.get("payment_method_categories").toString()));
          }

          // validate the optional field `payment_method_categories` (array)
          for (int i = 0; i < jsonArraypaymentMethodCategories.size(); i++) {
            PaymentMethodCategory.validateJsonObject(jsonArraypaymentMethodCategories.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("session_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `session_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("session_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantSession.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantSession' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantSession> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantSession.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantSession>() {
           @Override
           public void write(JsonWriter out, MerchantSession value) throws IOException {
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
           public MerchantSession read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MerchantSession instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MerchantSession given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerchantSession
  * @throws IOException if the JSON string is invalid with respect to MerchantSession
  */
  public static MerchantSession fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantSession.class);
  }

 /**
  * Convert an instance of MerchantSession to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

