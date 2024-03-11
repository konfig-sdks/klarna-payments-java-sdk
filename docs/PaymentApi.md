# PaymentApi

All URIs are relative to *https://api.klarna.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelAuthorization**](PaymentApi.md#cancelAuthorization) | **DELETE** /payments/v1/authorizations/{authorizationToken} | Cancel an authorization |
| [**createOrder**](PaymentApi.md#createOrder) | **POST** /payments/v1/authorizations/{authorizationToken}/order | Create an order |
| [**createSession**](PaymentApi.md#createSession) | **POST** /payments/v1/sessions | Create a session |
| [**generateCustomerToken**](PaymentApi.md#generateCustomerToken) | **POST** /payments/v1/authorizations/{authorizationToken}/customer-token | Generate a consumer token |
| [**getSessionDetails**](PaymentApi.md#getSessionDetails) | **GET** /payments/v1/sessions/{session_id} | Get details about a session |
| [**updateSessionDetails**](PaymentApi.md#updateSessionDetails) | **POST** /payments/v1/sessions/{session_id} | Update a session |


<a name="cancelAuthorization"></a>
# **cancelAuthorization**
> cancelAuthorization(authorizationToken).execute();

Cancel an authorization

Use this API call to cancel/release an authorization. If the &#x60;authorization_token&#x60; received during a Klarna Payments won’t be used to place an order immediately you could release the authorization. Read more on **[Cancel an existing authorization](https://docs.klarna.com/klarna-payments/other-actions/cancel-an-authorization/)**.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KlarnaPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.klarna.com";
    KlarnaPayments client = new KlarnaPayments(configuration);
    String authorizationToken = "authorizationToken_example";
    try {
      client
              .payment
              .cancelAuthorization(authorizationToken)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#cancelAuthorization");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payment
              .cancelAuthorization(authorizationToken)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#cancelAuthorization");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorizationToken** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The authorization was cancelled successfully. |  -  |
| **403** | You were not authorized to execute this operation. |  -  |
| **404** | The authorization does not exist. |  -  |

<a name="createOrder"></a>
# **createOrder**
> Order createOrder(authorizationToken).createOrderRequest(createOrderRequest).execute();

Create an order

Use this API call to create a new order. Placing an order towards Klarna means that the Klarna Payments session will be closed and that an order will be created in Klarna&#39;s system.&lt;br/&gt;When you have received the &#x60;authorization_token&#x60; for a successful authorization you can place the order. Among the other order details in this request, you include a URL to the confirmation page for the customer.&lt;br/&gt;When the Order has been successfully placed at Klarna, you need to handle it either through the Merchant Portal or using [Klarna’s Order Management API](https://docs.klarna.com/api/payments/). Read more on **[Create a new order](https://docs.klarna.com/klarna-payments/integrate-with-klarna-payments/step-3-create-an-order/)**.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KlarnaPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.klarna.com";
    KlarnaPayments client = new KlarnaPayments(configuration);
    Long orderAmount = 56L; // Total amount of the order including tax and any available discounts. The value should be in non-negative minor units. Eg: 25 Euros should be 2500.
    List<OrderLine> orderLines = Arrays.asList(); // The array containing list of line items that are part of this order. Maximum of 1000 line items could be processed in a single order.
    String purchaseCountry = "purchaseCountry_example"; // The purchase country of the customer. The billing country always overrides purchase country if the values are different. Formatted according to ISO 3166 alpha-2 standard, e.g. GB, SE, DE, US, etc.
    String purchaseCurrency = "purchaseCurrency_example"; // The purchase currency of the order. Formatted according to ISO 4217 standard, e.g. USD, EUR, SEK, GBP, etc.
    String authorizationToken = "authorizationToken_example";
    String authorizationToken = "authorizationToken_example"; // Authorization token.
    Boolean autoCapture = false; // Allow merchant to trigger auto capturing.
    Address billingAddress = new Address();
    List<String> customPaymentMethodIds = Arrays.asList(); // Promo codes - The array could be used to define which of the configured payment options within a payment category (pay_later, pay_over_time, etc.) should be shown for this purchase. Discuss with the delivery manager to know about the promo codes that will be configured for your account. The feature could also be used to provide promotional offers to specific customers (eg: 0% financing). Please be informed that the usage of this feature can have commercial implications. 
    Customer customer = new Customer();
    String locale = "locale_example"; // Used to define the language and region of the customer. The locale follows the format of [RFC 1766](https://datatracker.ietf.org/doc/rfc1766/), meaning its value consists of language-country. Read more on **[Supported Locals and Currencies](https://docs.klarna.com/klarna-payments/in-depth-knowledge/puchase-countries-currencies-locales/)**.
    String merchantData = "merchantData_example"; // Pass through field to send any information about the order to be used later for reference while retrieving the order details (max 6000 characters)
    String merchantReference1 = "merchantReference1_example"; // Used for storing merchant's internal order number or other reference.
    String merchantReference2 = "merchantReference2_example"; // Used for storing merchant's internal order number or other reference. The value is available in the settlement files. (max 255 characters).
    MerchantUrls merchantUrls = new MerchantUrls();
    Long orderTaxAmount = 56L; // Total tax amount of the order. The value should be in non-negative minor units. Eg: 25 Euros should be 2500.
    Set<PaymentMethodCategory> paymentMethodCategories = Arrays.asList(); // Available payment method categories
    Address shippingAddress = new Address();
    String status = "complete"; // The current status of the session. Possible values: 'complete', 'incomplete' where 'complete' is set when the order has been placed.
    try {
      Order result = client
              .payment
              .createOrder(orderAmount, orderLines, purchaseCountry, purchaseCurrency, authorizationToken)
              .authorizationToken(authorizationToken)
              .autoCapture(autoCapture)
              .billingAddress(billingAddress)
              .customPaymentMethodIds(customPaymentMethodIds)
              .customer(customer)
              .locale(locale)
              .merchantData(merchantData)
              .merchantReference1(merchantReference1)
              .merchantReference2(merchantReference2)
              .merchantUrls(merchantUrls)
              .orderTaxAmount(orderTaxAmount)
              .paymentMethodCategories(paymentMethodCategories)
              .shippingAddress(shippingAddress)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getAuthorizedPaymentMethod());
      System.out.println(result.getFraudStatus());
      System.out.println(result.getOrderId());
      System.out.println(result.getRedirectUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Order> response = client
              .payment
              .createOrder(orderAmount, orderLines, purchaseCountry, purchaseCurrency, authorizationToken)
              .authorizationToken(authorizationToken)
              .autoCapture(autoCapture)
              .billingAddress(billingAddress)
              .customPaymentMethodIds(customPaymentMethodIds)
              .customer(customer)
              .locale(locale)
              .merchantData(merchantData)
              .merchantReference1(merchantReference1)
              .merchantReference2(merchantReference2)
              .merchantUrls(merchantUrls)
              .orderTaxAmount(orderTaxAmount)
              .paymentMethodCategories(paymentMethodCategories)
              .shippingAddress(shippingAddress)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorizationToken** | **String**|  | |
| **createOrderRequest** | [**CreateOrderRequest**](CreateOrderRequest.md)|  | [optional] |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order was successfully created. |  -  |
| **400** | We were unable to create an order with the provided data. Some field constraint was violated. |  -  |
| **403** | You were not authorized to execute this operation. |  -  |
| **404** | The authorization does not exist. |  -  |
| **409** | The data in the request does not match the session for the authorization. |  -  |

<a name="createSession"></a>
# **createSession**
> MerchantSession createSession(sessionCreate).execute();

Create a session

Use this API call to create a Klarna Payments session.&lt;br/&gt;When a session is created you will receive the available &#x60;payment_method_categories&#x60; for the session, a &#x60;session_id&#x60; and a &#x60;client_token&#x60;. The &#x60;session_id&#x60; can be used to read or update the session using the REST API. The &#x60;client_token&#x60; should be passed to the browser. Read more on **[Create a new payment session](https://docs.klarna.com/klarna-payments/integrate-with-klarna-payments/step-1-initiate-a-payment/)**.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KlarnaPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.klarna.com";
    KlarnaPayments client = new KlarnaPayments(configuration);
    Long orderAmount = 56L; // Total amount of the order including tax and any available discounts. The value should be in non-negative minor units. Eg: 25 Euros should be 2500.
    List<OrderLine> orderLines = Arrays.asList(); // The array containing list of line items that are part of this order. Maximum of 1000 line items could be processed in a single order.
    String purchaseCountry = "purchaseCountry_example"; // The purchase country of the customer. The billing country always overrides purchase country if the values are different. Formatted according to ISO 3166 alpha-2 standard, e.g. GB, SE, DE, US, etc.
    String purchaseCurrency = "purchaseCurrency_example"; // The purchase currency of the order. Formatted according to ISO 4217 standard, e.g. USD, EUR, SEK, GBP, etc.
    String acquiringChannel = "ECOMMERCE"; // The acquiring channel in which the session takes place. Ecommerce is default unless specified. Any other values should be defined in the agreement.
    Attachment attachment = new Attachment();
    String authorizationToken = "authorizationToken_example"; // Authorization token.
    Address billingAddress = new Address();
    String clientToken = "clientToken_example"; // Token to be passed to the JS client
    List<String> customPaymentMethodIds = Arrays.asList(); // Promo codes - The array could be used to define which of the configured payment options within a payment category (pay_later, pay_over_time, etc.) should be shown for this purchase. Discuss with the delivery manager to know about the promo codes that will be configured for your account. The feature could also be used to provide promotional offers to specific customers (eg: 0% financing). Please be informed that the usage of this feature can have commercial implications. 
    Customer customer = new Customer();
    String design = "design_example"; // Design package to use in the session. This can only by used if a custom design has been implemented for Klarna Payments and agreed upon in the agreement. It might have a financial impact. Delivery manager will provide the value for the parameter.
    OffsetDateTime expiresAt = OffsetDateTime.now(); // Session expiration date
    String locale = "locale_example"; // Used to define the language and region of the customer. The locale follows the format of [RFC 1766](https://datatracker.ietf.org/doc/rfc1766/), meaning its value consists of language-country. Default value is \\\"en-US\\\". Read more on **[Supported Locals and Currencies](https://docs.klarna.com/klarna-payments/in-depth-knowledge/puchase-countries-currencies-locales/)**.
    String merchantData = "merchantData_example"; // Pass through field to send any information about the order to be used later for reference while retrieving the order details (max 6000 characters)
    String merchantReference1 = "merchantReference1_example"; // Used for storing merchant's internal order number or other reference.
    String merchantReference2 = "merchantReference2_example"; // Used for storing merchant's internal order number or other reference. The value is available in the settlement files. (max 255 characters).
    MerchantUrls merchantUrls = new MerchantUrls();
    Options options = new Options();
    Long orderTaxAmount = 56L; // Total tax amount of the order. The value should be in non-negative minor units. Eg: 25 Euros should be 2500.
    Set<PaymentMethodCategory> paymentMethodCategories = Arrays.asList(); // Available payment method categories
    Address shippingAddress = new Address();
    String status = "complete"; // The current status of the session. Possible values: 'complete', 'incomplete' where 'complete' is set when the order has been placed.
    String intent = "buy"; // Intent for the session. The field is designed to let partners inform Klarna of the purpose of the customer’s session.
    try {
      MerchantSession result = client
              .payment
              .createSession(orderAmount, orderLines, purchaseCountry, purchaseCurrency)
              .acquiringChannel(acquiringChannel)
              .attachment(attachment)
              .authorizationToken(authorizationToken)
              .billingAddress(billingAddress)
              .clientToken(clientToken)
              .customPaymentMethodIds(customPaymentMethodIds)
              .customer(customer)
              .design(design)
              .expiresAt(expiresAt)
              .locale(locale)
              .merchantData(merchantData)
              .merchantReference1(merchantReference1)
              .merchantReference2(merchantReference2)
              .merchantUrls(merchantUrls)
              .options(options)
              .orderTaxAmount(orderTaxAmount)
              .paymentMethodCategories(paymentMethodCategories)
              .shippingAddress(shippingAddress)
              .status(status)
              .intent(intent)
              .execute();
      System.out.println(result);
      System.out.println(result.getClientToken());
      System.out.println(result.getPaymentMethodCategories());
      System.out.println(result.getSessionId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createSession");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MerchantSession> response = client
              .payment
              .createSession(orderAmount, orderLines, purchaseCountry, purchaseCurrency)
              .acquiringChannel(acquiringChannel)
              .attachment(attachment)
              .authorizationToken(authorizationToken)
              .billingAddress(billingAddress)
              .clientToken(clientToken)
              .customPaymentMethodIds(customPaymentMethodIds)
              .customer(customer)
              .design(design)
              .expiresAt(expiresAt)
              .locale(locale)
              .merchantData(merchantData)
              .merchantReference1(merchantReference1)
              .merchantReference2(merchantReference2)
              .merchantUrls(merchantUrls)
              .options(options)
              .orderTaxAmount(orderTaxAmount)
              .paymentMethodCategories(paymentMethodCategories)
              .shippingAddress(shippingAddress)
              .status(status)
              .intent(intent)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#createSession");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionCreate** | [**SessionCreate**](SessionCreate.md)| session_request | |

### Return type

[**MerchantSession**](MerchantSession.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | We were unable to create a session with the provided data. Some field constraint was violated. |  -  |
| **403** | You were not authorized to execute this operation. |  -  |

<a name="generateCustomerToken"></a>
# **generateCustomerToken**
> CustomerTokenCreationResponse generateCustomerToken(authorizationToken).customerTokenCreationRequest(customerTokenCreationRequest).execute();

Generate a consumer token

Use this API call to create a Klarna Customer Token.&lt;br/&gt;After having obtained an &#x60;authorization_token&#x60; for a successful authorization, this can be used to create a purchase token instead of placing the order. Creating a Klarna Customer Token results in Klarna storing customer and payment method details. Read more on **[Generate a consumer token](https://docs.klarna.com/klarna-payments/in-depth-knowledge/customer-token/)**.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KlarnaPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.klarna.com";
    KlarnaPayments client = new KlarnaPayments(configuration);
    String description = "description_example"; // Description of the purpose of the token.
    String intendedUse = "SUBSCRIPTION"; // Intended use for the token.
    String locale = "locale_example"; // RFC 1766 customer's locale.
    String purchaseCountry = "purchaseCountry_example"; // ISO 3166 alpha-2 purchase country.
    String purchaseCurrency = "purchaseCurrency_example"; // ISO 4217 purchase currency.
    String authorizationToken = "authorizationToken_example";
    Address billingAddress = new Address();
    Customer customer = new Customer();
    try {
      CustomerTokenCreationResponse result = client
              .payment
              .generateCustomerToken(description, intendedUse, locale, purchaseCountry, purchaseCurrency, authorizationToken)
              .billingAddress(billingAddress)
              .customer(customer)
              .execute();
      System.out.println(result);
      System.out.println(result.getBillingAddress());
      System.out.println(result.getCustomer());
      System.out.println(result.getPaymentMethodReference());
      System.out.println(result.getRedirectUrl());
      System.out.println(result.getTokenId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#generateCustomerToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CustomerTokenCreationResponse> response = client
              .payment
              .generateCustomerToken(description, intendedUse, locale, purchaseCountry, purchaseCurrency, authorizationToken)
              .billingAddress(billingAddress)
              .customer(customer)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#generateCustomerToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorizationToken** | **String**|  | |
| **customerTokenCreationRequest** | [**CustomerTokenCreationRequest**](CustomerTokenCreationRequest.md)|  | [optional] |

### Return type

[**CustomerTokenCreationResponse**](CustomerTokenCreationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token was successfully created. |  -  |
| **403** | You were not authorized to execute this operation. |  -  |
| **404** | The authorization does not exist. |  -  |
| **409** | The data in the request does not match the session for the authorization. |  -  |

<a name="getSessionDetails"></a>
# **getSessionDetails**
> SessionRead getSessionDetails(sessionId).execute();

Get details about a session

Use this API call to get a Klarna Payments session. You can read the Klarna Payments session at any time after it has been created, to get information about it. This will return all data that has been collected during the session. Read more on **[Read an existing payment session](https://docs.klarna.com/klarna-payments/other-actions/check-the-details-of-a-payment-session/)**.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KlarnaPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.klarna.com";
    KlarnaPayments client = new KlarnaPayments(configuration);
    String sessionId = "sessionId_example"; // session_id
    try {
      SessionRead result = client
              .payment
              .getSessionDetails(sessionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAcquiringChannel());
      System.out.println(result.getAttachment());
      System.out.println(result.getAuthorizationToken());
      System.out.println(result.getBillingAddress());
      System.out.println(result.getClientToken());
      System.out.println(result.getCustomPaymentMethodIds());
      System.out.println(result.getCustomer());
      System.out.println(result.getDesign());
      System.out.println(result.getExpiresAt());
      System.out.println(result.getLocale());
      System.out.println(result.getMerchantData());
      System.out.println(result.getMerchantReference1());
      System.out.println(result.getMerchantReference2());
      System.out.println(result.getMerchantUrls());
      System.out.println(result.getOptions());
      System.out.println(result.getOrderAmount());
      System.out.println(result.getOrderLines());
      System.out.println(result.getOrderTaxAmount());
      System.out.println(result.getPaymentMethodCategories());
      System.out.println(result.getPurchaseCountry());
      System.out.println(result.getPurchaseCurrency());
      System.out.println(result.getShippingAddress());
      System.out.println(result.getStatus());
      System.out.println(result.getIntent());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getSessionDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SessionRead> response = client
              .payment
              .getSessionDetails(sessionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#getSessionDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| session_id | |

### Return type

[**SessionRead**](SessionRead.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **403** | You were not authorized to execute this operation. |  -  |
| **404** | The session does not exist. |  -  |

<a name="updateSessionDetails"></a>
# **updateSessionDetails**
> updateSessionDetails(sessionId, session).execute();

Update a session

Use this API call to update a Klarna Payments session with new details, in case something in the order has changed and the checkout has been reloaded. Including if the consumer adds a new item to the cart or if consumer details are updated. Read more on **[Update an existing payment session](https://docs.klarna.com/klarna-payments/other-actions/update-the-cart/)**.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.KlarnaPayments;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PaymentApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.klarna.com";
    KlarnaPayments client = new KlarnaPayments(configuration);
    String sessionId = "sessionId_example"; // session_id
    String acquiringChannel = "ECOMMERCE"; // The acquiring channel in which the session takes place. Ecommerce is default unless specified. Any other values should be defined in the agreement.
    Attachment attachment = new Attachment();
    String authorizationToken = "authorizationToken_example"; // Authorization token.
    Address billingAddress = new Address();
    String clientToken = "clientToken_example"; // Token to be passed to the JS client
    List<String> customPaymentMethodIds = Arrays.asList(); // Promo codes - The array could be used to define which of the configured payment options within a payment category (pay_later, pay_over_time, etc.) should be shown for this purchase. Discuss with the delivery manager to know about the promo codes that will be configured for your account. The feature could also be used to provide promotional offers to specific customers (eg: 0% financing). Please be informed that the usage of this feature can have commercial implications. 
    Customer customer = new Customer();
    String design = "design_example"; // Design package to use in the session. This can only by used if a custom design has been implemented for Klarna Payments and agreed upon in the agreement. It might have a financial impact. Delivery manager will provide the value for the parameter.
    OffsetDateTime expiresAt = OffsetDateTime.now(); // Session expiration date
    String locale = "locale_example"; // Used to define the language and region of the customer. The locale follows the format of [RFC 1766](https://datatracker.ietf.org/doc/rfc1766/), meaning its value consists of language-country. Read more on **[Supported Locals and Currencies](https://docs.klarna.com/klarna-payments/in-depth-knowledge/puchase-countries-currencies-locales/)**.
    String merchantData = "merchantData_example"; // Pass through field to send any information about the order to be used later for reference while retrieving the order details (max 6000 characters)
    String merchantReference1 = "merchantReference1_example"; // Used for storing merchant's internal order number or other reference.
    String merchantReference2 = "merchantReference2_example"; // Used for storing merchant's internal order number or other reference. The value is available in the settlement files. (max 255 characters).
    MerchantUrls merchantUrls = new MerchantUrls();
    Options options = new Options();
    Long orderAmount = 56L; // Total amount of the order including tax and any available discounts. The value should be in non-negative minor units. Eg: 25 Euros should be 2500.
    List<OrderLine> orderLines = Arrays.asList(); // The array containing list of line items that are part of this order. Maximum of 1000 line items could be processed in a single order.
    Long orderTaxAmount = 56L; // Total tax amount of the order. The value should be in non-negative minor units. Eg: 25 Euros should be 2500.
    Set<PaymentMethodCategory> paymentMethodCategories = Arrays.asList(); // Available payment method categories
    String purchaseCountry = "purchaseCountry_example"; // The purchase country of the customer. The billing country always overrides purchase country if the values are different. Formatted according to ISO 3166 alpha-2 standard, e.g. GB, SE, DE, US, etc.
    String purchaseCurrency = "purchaseCurrency_example"; // The purchase currency of the order. Formatted according to ISO 4217 standard, e.g. USD, EUR, SEK, GBP, etc.
    Address shippingAddress = new Address();
    String status = "complete"; // The current status of the session. Possible values: 'complete', 'incomplete' where 'complete' is set when the order has been placed.
    String intent = "buy"; // Intent for the session. The field is designed to let partners inform Klarna of the purpose of the customer’s session.
    try {
      client
              .payment
              .updateSessionDetails(sessionId)
              .acquiringChannel(acquiringChannel)
              .attachment(attachment)
              .authorizationToken(authorizationToken)
              .billingAddress(billingAddress)
              .clientToken(clientToken)
              .customPaymentMethodIds(customPaymentMethodIds)
              .customer(customer)
              .design(design)
              .expiresAt(expiresAt)
              .locale(locale)
              .merchantData(merchantData)
              .merchantReference1(merchantReference1)
              .merchantReference2(merchantReference2)
              .merchantUrls(merchantUrls)
              .options(options)
              .orderAmount(orderAmount)
              .orderLines(orderLines)
              .orderTaxAmount(orderTaxAmount)
              .paymentMethodCategories(paymentMethodCategories)
              .purchaseCountry(purchaseCountry)
              .purchaseCurrency(purchaseCurrency)
              .shippingAddress(shippingAddress)
              .status(status)
              .intent(intent)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#updateSessionDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .payment
              .updateSessionDetails(sessionId)
              .acquiringChannel(acquiringChannel)
              .attachment(attachment)
              .authorizationToken(authorizationToken)
              .billingAddress(billingAddress)
              .clientToken(clientToken)
              .customPaymentMethodIds(customPaymentMethodIds)
              .customer(customer)
              .design(design)
              .expiresAt(expiresAt)
              .locale(locale)
              .merchantData(merchantData)
              .merchantReference1(merchantReference1)
              .merchantReference2(merchantReference2)
              .merchantUrls(merchantUrls)
              .options(options)
              .orderAmount(orderAmount)
              .orderLines(orderLines)
              .orderTaxAmount(orderTaxAmount)
              .paymentMethodCategories(paymentMethodCategories)
              .purchaseCountry(purchaseCountry)
              .purchaseCurrency(purchaseCurrency)
              .shippingAddress(shippingAddress)
              .status(status)
              .intent(intent)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#updateSessionDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sessionId** | **String**| session_id | |
| **session** | [**Session**](Session.md)| session_request | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The session was updated successfully. |  -  |
| **400** | We were unable to update the session with the provided data. Some field constraint was violated. |  -  |
| **403** | You were not authorized to execute this operation. |  -  |
| **404** | The session does not exist. |  -  |

