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
 * Address
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Address {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_ATTENTION = "attention";
  @SerializedName(SERIALIZED_NAME_ATTENTION)
  private String attention;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FAMILY_NAME = "family_name";
  @SerializedName(SERIALIZED_NAME_FAMILY_NAME)
  private String familyName;

  public static final String SERIALIZED_NAME_GIVEN_NAME = "given_name";
  @SerializedName(SERIALIZED_NAME_GIVEN_NAME)
  private String givenName;

  public static final String SERIALIZED_NAME_ORGANIZATION_NAME = "organization_name";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_NAME)
  private String organizationName;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_STREET_ADDRESS = "street_address";
  @SerializedName(SERIALIZED_NAME_STREET_ADDRESS)
  private String streetAddress;

  public static final String SERIALIZED_NAME_STREET_ADDRESS2 = "street_address2";
  @SerializedName(SERIALIZED_NAME_STREET_ADDRESS2)
  private String streetAddress2;

  public Address() {
  }

  public Address title(String title) {
    
    
    if (title != null && title.length() < 0) {
      throw new IllegalArgumentException("Invalid value for title. Length must be greater than or equal to 0.");
    }
    
    this.title = title;
    return this;
  }

   /**
   * Customer’s Title. Allowed values per country: UK - \&quot;Mr\&quot;, \&quot;Ms\&quot; DE - \&quot;Herr\&quot;, \&quot;Frau\&quot; AT: \&quot;Herr, \&quot;Frau\&quot; CH: de-CH: \&quot;Herr, \&quot;Frau\&quot; it-CH: \&quot;Sig.\&quot;, \&quot;Sig.ra\&quot; fr-CH: \&quot;M\&quot;, \&quot;Mme\&quot;  BE: \&quot;Dhr.\&quot;, \&quot;Mevr.\&quot; NL: \&quot;Dhr.\&quot;, \&quot;Mevr.\&quot;
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Mr.", value = "Customer’s Title. Allowed values per country: UK - \"Mr\", \"Ms\" DE - \"Herr\", \"Frau\" AT: \"Herr, \"Frau\" CH: de-CH: \"Herr, \"Frau\" it-CH: \"Sig.\", \"Sig.ra\" fr-CH: \"M\", \"Mme\"  BE: \"Dhr.\", \"Mevr.\" NL: \"Dhr.\", \"Mevr.\"")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    if (title != null && title.length() < 0) {
      throw new IllegalArgumentException("Invalid value for title. Length must be greater than or equal to 0.");
    }
    this.title = title;
  }


  public Address attention(String attention) {
    
    
    if (attention != null && attention.length() < 0) {
      throw new IllegalArgumentException("Invalid value for attention. Length must be greater than or equal to 0.");
    }
    
    this.attention = attention;
    return this;
  }

   /**
   * ‘Attn.’ (if applicable). Only applicable for B2B customers.
   * @return attention
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Attn", value = "‘Attn.’ (if applicable). Only applicable for B2B customers.")

  public String getAttention() {
    return attention;
  }


  public void setAttention(String attention) {
    
    
    if (attention != null && attention.length() < 0) {
      throw new IllegalArgumentException("Invalid value for attention. Length must be greater than or equal to 0.");
    }
    this.attention = attention;
  }


  public Address city(String city) {
    
    
    if (city != null && city.length() < 0) {
      throw new IllegalArgumentException("Invalid value for city. Length must be greater than or equal to 0.");
    }
    
    this.city = city;
    return this;
  }

   /**
   * Customer’s city.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "London", value = "Customer’s city.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    
    
    if (city != null && city.length() < 0) {
      throw new IllegalArgumentException("Invalid value for city. Length must be greater than or equal to 0.");
    }
    this.city = city;
  }


  public Address country(String country) {
    
    
    
    
    this.country = country;
    return this;
  }

   /**
   * Customer’s country. This value overrides the purchase country if they are different. Should follow the standard of ISO 3166 alpha-2. E.g. GB, US, DE, SE.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GB", value = "Customer’s country. This value overrides the purchase country if they are different. Should follow the standard of ISO 3166 alpha-2. E.g. GB, US, DE, SE.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    
    
    
    this.country = country;
  }


  public Address email(String email) {
    
    
    if (email != null && email.length() < 0) {
      throw new IllegalArgumentException("Invalid value for email. Length must be greater than or equal to 0.");
    }
    
    this.email = email;
    return this;
  }

   /**
   * Customer’s email address.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test.sam@test.com", value = "Customer’s email address.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    if (email != null && email.length() < 0) {
      throw new IllegalArgumentException("Invalid value for email. Length must be greater than or equal to 0.");
    }
    this.email = email;
  }


  public Address familyName(String familyName) {
    
    
    if (familyName != null && familyName.length() < 0) {
      throw new IllegalArgumentException("Invalid value for familyName. Length must be greater than or equal to 0.");
    }
    
    this.familyName = familyName;
    return this;
  }

   /**
   * Customers family name in UTF-8 encoding. Cannot be only numbers, must be more than 1 character. Allowed special characters: -&#39;’. More information can be found [in this link](https://docs.klarna.com/klarna-payments/in-depth-knowledge/customer-data-requirements/#details-needed-per-market)
   * @return familyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Andersson", value = "Customers family name in UTF-8 encoding. Cannot be only numbers, must be more than 1 character. Allowed special characters: -'’. More information can be found [in this link](https://docs.klarna.com/klarna-payments/in-depth-knowledge/customer-data-requirements/#details-needed-per-market)")

  public String getFamilyName() {
    return familyName;
  }


  public void setFamilyName(String familyName) {
    
    
    if (familyName != null && familyName.length() < 0) {
      throw new IllegalArgumentException("Invalid value for familyName. Length must be greater than or equal to 0.");
    }
    this.familyName = familyName;
  }


  public Address givenName(String givenName) {
    
    
    if (givenName != null && givenName.length() < 0) {
      throw new IllegalArgumentException("Invalid value for givenName. Length must be greater than or equal to 0.");
    }
    
    this.givenName = givenName;
    return this;
  }

   /**
   * Customers given name in UTF-8 encoding. Cannot be only numbers, must be more than 1 character. Allowed special characters: -&#39;’. More information can be found [in this link](https://docs.klarna.com/klarna-payments/in-depth-knowledge/customer-data-requirements/#details-needed-per-market)
   * @return givenName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Adam", value = "Customers given name in UTF-8 encoding. Cannot be only numbers, must be more than 1 character. Allowed special characters: -'’. More information can be found [in this link](https://docs.klarna.com/klarna-payments/in-depth-knowledge/customer-data-requirements/#details-needed-per-market)")

  public String getGivenName() {
    return givenName;
  }


  public void setGivenName(String givenName) {
    
    
    if (givenName != null && givenName.length() < 0) {
      throw new IllegalArgumentException("Invalid value for givenName. Length must be greater than or equal to 0.");
    }
    this.givenName = givenName;
  }


  public Address organizationName(String organizationName) {
    
    
    if (organizationName != null && organizationName.length() < 0) {
      throw new IllegalArgumentException("Invalid value for organizationName. Length must be greater than or equal to 0.");
    }
    
    this.organizationName = organizationName;
    return this;
  }

   /**
   * Organization name (if applicable). Only applicable for B2B customers.
   * @return organizationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Organization name (if applicable). Only applicable for B2B customers.")

  public String getOrganizationName() {
    return organizationName;
  }


  public void setOrganizationName(String organizationName) {
    
    
    if (organizationName != null && organizationName.length() < 0) {
      throw new IllegalArgumentException("Invalid value for organizationName. Length must be greater than or equal to 0.");
    }
    this.organizationName = organizationName;
  }


  public Address phone(String phone) {
    
    
    if (phone != null && phone.length() < 0) {
      throw new IllegalArgumentException("Invalid value for phone. Length must be greater than or equal to 0.");
    }
    
    this.phone = phone;
    return this;
  }

   /**
   * Phone number. Preferably a mobile phone number.
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+44795465131", value = "Phone number. Preferably a mobile phone number.")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    
    
    if (phone != null && phone.length() < 0) {
      throw new IllegalArgumentException("Invalid value for phone. Length must be greater than or equal to 0.");
    }
    this.phone = phone;
  }


  public Address postalCode(String postalCode) {
    
    
    if (postalCode != null && postalCode.length() < 0) {
      throw new IllegalArgumentException("Invalid value for postalCode. Length must be greater than or equal to 0.");
    }
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Customer’s postal code. Validation according to Universal Postal Union addressing systems. E.g. 12345, W1G OPW.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "W1G 0PW", value = "Customer’s postal code. Validation according to Universal Postal Union addressing systems. E.g. 12345, W1G OPW.")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    
    
    if (postalCode != null && postalCode.length() < 0) {
      throw new IllegalArgumentException("Invalid value for postalCode. Length must be greater than or equal to 0.");
    }
    this.postalCode = postalCode;
  }


  public Address region(String region) {
    
    
    if (region != null && region.length() < 0) {
      throw new IllegalArgumentException("Invalid value for region. Length must be greater than or equal to 0.");
    }
    
    this.region = region;
    return this;
  }

   /**
   * Customer’s region or state - Mandatory for US and AU market. Validations according to ISO 3166-2 format, e.g. OH, NJ, etc.
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OH", value = "Customer’s region or state - Mandatory for US and AU market. Validations according to ISO 3166-2 format, e.g. OH, NJ, etc.")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    
    
    if (region != null && region.length() < 0) {
      throw new IllegalArgumentException("Invalid value for region. Length must be greater than or equal to 0.");
    }
    this.region = region;
  }


  public Address streetAddress(String streetAddress) {
    
    
    if (streetAddress != null && streetAddress.length() < 0) {
      throw new IllegalArgumentException("Invalid value for streetAddress. Length must be greater than or equal to 0.");
    }
    
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * Customer’s street address. Regional formatting is required, as follows: UK/US/FR: 33 Cavendish Square Rest of EU: De Ruijterkade 7
   * @return streetAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "33 Cavendish Square", value = "Customer’s street address. Regional formatting is required, as follows: UK/US/FR: 33 Cavendish Square Rest of EU: De Ruijterkade 7")

  public String getStreetAddress() {
    return streetAddress;
  }


  public void setStreetAddress(String streetAddress) {
    
    
    if (streetAddress != null && streetAddress.length() < 0) {
      throw new IllegalArgumentException("Invalid value for streetAddress. Length must be greater than or equal to 0.");
    }
    this.streetAddress = streetAddress;
  }


  public Address streetAddress2(String streetAddress2) {
    
    
    if (streetAddress2 != null && streetAddress2.length() < 0) {
      throw new IllegalArgumentException("Invalid value for streetAddress2. Length must be greater than or equal to 0.");
    }
    
    this.streetAddress2 = streetAddress2;
    return this;
  }

   /**
   * Customer’s street address. Second Line. 
   * @return streetAddress2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Floor 22 / Flat 2", value = "Customer’s street address. Second Line. ")

  public String getStreetAddress2() {
    return streetAddress2;
  }


  public void setStreetAddress2(String streetAddress2) {
    
    
    if (streetAddress2 != null && streetAddress2.length() < 0) {
      throw new IllegalArgumentException("Invalid value for streetAddress2. Length must be greater than or equal to 0.");
    }
    this.streetAddress2 = streetAddress2;
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
   * @return the Address instance itself
   */
  public Address putAdditionalProperty(String key, Object value) {
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
    Address address = (Address) o;
    return Objects.equals(this.title, address.title) &&
        Objects.equals(this.attention, address.attention) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.email, address.email) &&
        Objects.equals(this.familyName, address.familyName) &&
        Objects.equals(this.givenName, address.givenName) &&
        Objects.equals(this.organizationName, address.organizationName) &&
        Objects.equals(this.phone, address.phone) &&
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.region, address.region) &&
        Objects.equals(this.streetAddress, address.streetAddress) &&
        Objects.equals(this.streetAddress2, address.streetAddress2)&&
        Objects.equals(this.additionalProperties, address.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, attention, city, country, email, familyName, givenName, organizationName, phone, postalCode, region, streetAddress, streetAddress2, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    attention: ").append(toIndentedString(attention)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    streetAddress2: ").append(toIndentedString(streetAddress2)).append("\n");
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
    openapiFields.add("attention");
    openapiFields.add("city");
    openapiFields.add("country");
    openapiFields.add("email");
    openapiFields.add("family_name");
    openapiFields.add("given_name");
    openapiFields.add("organization_name");
    openapiFields.add("phone");
    openapiFields.add("postal_code");
    openapiFields.add("region");
    openapiFields.add("street_address");
    openapiFields.add("street_address2");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Address
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Address.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Address is not found in the empty JSON string", Address.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("attention") != null && !jsonObj.get("attention").isJsonNull()) && !jsonObj.get("attention").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attention` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attention").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("family_name") != null && !jsonObj.get("family_name").isJsonNull()) && !jsonObj.get("family_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `family_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("family_name").toString()));
      }
      if ((jsonObj.get("given_name") != null && !jsonObj.get("given_name").isJsonNull()) && !jsonObj.get("given_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `given_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("given_name").toString()));
      }
      if ((jsonObj.get("organization_name") != null && !jsonObj.get("organization_name").isJsonNull()) && !jsonObj.get("organization_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organization_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organization_name").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("postal_code") != null && !jsonObj.get("postal_code").isJsonNull()) && !jsonObj.get("postal_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postal_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postal_code").toString()));
      }
      if ((jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull()) && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      if ((jsonObj.get("street_address") != null && !jsonObj.get("street_address").isJsonNull()) && !jsonObj.get("street_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street_address").toString()));
      }
      if ((jsonObj.get("street_address2") != null && !jsonObj.get("street_address2").isJsonNull()) && !jsonObj.get("street_address2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `street_address2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("street_address2").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Address.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Address' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Address> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Address.class));

       return (TypeAdapter<T>) new TypeAdapter<Address>() {
           @Override
           public void write(JsonWriter out, Address value) throws IOException {
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
           public Address read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Address instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Address given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Address
  * @throws IOException if the JSON string is invalid with respect to Address
  */
  public static Address fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Address.class);
  }

 /**
  * Convert an instance of Address to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

