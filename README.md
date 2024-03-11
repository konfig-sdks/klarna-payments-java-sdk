<div align="left">

[![Visit Klarna](./header.png)](https://klarna.com)

# [Klarna](https://klarna.com)

The payments API is used to create a session to offer Klarna's payment methods as part of your checkout. As soon as the purchase is completed the order should be read and handled using the [`Order Management API`](https://docs.klarna.com/api/ordermanagement).

**Note:** Examples provided in this section includes full payloads, including all supported fields , required and optionals. In order to implement a best in class request we recommend you don't include customer details when initiating a payment session. Refer to [Initiate a payment](https://docs.klarna.com/klarna-payments/integrate-with-klarna-payments/step-1-initiate-a-payment/) section for further details.

Read more on [Klarna payments](https://docs.klarna.com/klarna-payments/).

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Klarna&serviceName=Payments&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>klarna-payments-java-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:klarna-payments-java-sdk:1.0.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/klarna-payments-java-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.klarna.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PaymentApi* | [**cancelAuthorization**](docs/PaymentApi.md#cancelAuthorization) | **DELETE** /payments/v1/authorizations/{authorizationToken} | Cancel an authorization
*PaymentApi* | [**createOrder**](docs/PaymentApi.md#createOrder) | **POST** /payments/v1/authorizations/{authorizationToken}/order | Create an order
*PaymentApi* | [**createSession**](docs/PaymentApi.md#createSession) | **POST** /payments/v1/sessions | Create a session
*PaymentApi* | [**generateCustomerToken**](docs/PaymentApi.md#generateCustomerToken) | **POST** /payments/v1/authorizations/{authorizationToken}/customer-token | Generate a consumer token
*PaymentApi* | [**getSessionDetails**](docs/PaymentApi.md#getSessionDetails) | **GET** /payments/v1/sessions/{session_id} | Get details about a session
*PaymentApi* | [**updateSessionDetails**](docs/PaymentApi.md#updateSessionDetails) | **POST** /payments/v1/sessions/{session_id} | Update a session


## Documentation for Models

 - [Address](docs/Address.md)
 - [AssetUrls](docs/AssetUrls.md)
 - [Attachment](docs/Attachment.md)
 - [AuthorizedPaymentMethod](docs/AuthorizedPaymentMethod.md)
 - [CreateOrderRequest](docs/CreateOrderRequest.md)
 - [Customer](docs/Customer.md)
 - [CustomerRead](docs/CustomerRead.md)
 - [CustomerReadCreateToken](docs/CustomerReadCreateToken.md)
 - [CustomerTokenCreationRequest](docs/CustomerTokenCreationRequest.md)
 - [CustomerTokenCreationResponse](docs/CustomerTokenCreationResponse.md)
 - [MerchantSession](docs/MerchantSession.md)
 - [MerchantUrls](docs/MerchantUrls.md)
 - [Options](docs/Options.md)
 - [Order](docs/Order.md)
 - [OrderLine](docs/OrderLine.md)
 - [PaymentMethodCategory](docs/PaymentMethodCategory.md)
 - [ProductIdentifiers](docs/ProductIdentifiers.md)
 - [Session](docs/Session.md)
 - [SessionCreate](docs/SessionCreate.md)
 - [SessionRead](docs/SessionRead.md)
 - [Subscription](docs/Subscription.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
