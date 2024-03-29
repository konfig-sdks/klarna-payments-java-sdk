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


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.Address;
import com.konfigthis.client.model.Attachment;
import com.konfigthis.client.model.CreateOrderRequest;
import com.konfigthis.client.model.Customer;
import com.konfigthis.client.model.CustomerTokenCreationRequest;
import com.konfigthis.client.model.CustomerTokenCreationResponse;
import com.konfigthis.client.model.MerchantSession;
import com.konfigthis.client.model.MerchantUrls;
import java.time.OffsetDateTime;
import com.konfigthis.client.model.Options;
import com.konfigthis.client.model.Order;
import com.konfigthis.client.model.OrderLine;
import com.konfigthis.client.model.PaymentMethodCategory;
import com.konfigthis.client.model.Session;
import com.konfigthis.client.model.SessionCreate;
import com.konfigthis.client.model.SessionRead;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentApi
 */
@Disabled
public class PaymentApiTest {

    private static PaymentApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PaymentApi(apiClient);
    }

    /**
     * Cancel an authorization
     *
     * Use this API call to cancel/release an authorization. If the &#x60;authorization_token&#x60; received during a Klarna Payments won’t be used to place an order immediately you could release the authorization. Read more on **[Cancel an existing authorization](https://docs.klarna.com/klarna-payments/other-actions/cancel-an-authorization/)**.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelAuthorizationTest() throws ApiException {
        String authorizationToken = null;
        api.cancelAuthorization(authorizationToken)
                .execute();
        // TODO: test validations
    }

    /**
     * Create an order
     *
     * Use this API call to create a new order. Placing an order towards Klarna means that the Klarna Payments session will be closed and that an order will be created in Klarna&#39;s system.&lt;br/&gt;When you have received the &#x60;authorization_token&#x60; for a successful authorization you can place the order. Among the other order details in this request, you include a URL to the confirmation page for the customer.&lt;br/&gt;When the Order has been successfully placed at Klarna, you need to handle it either through the Merchant Portal or using [Klarna’s Order Management API](https://docs.klarna.com/api/payments/). Read more on **[Create a new order](https://docs.klarna.com/klarna-payments/integrate-with-klarna-payments/step-3-create-an-order/)**.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createOrderTest() throws ApiException {
        Long orderAmount = null;
        List<OrderLine> orderLines = null;
        String purchaseCountry = null;
        String purchaseCurrency = null;
        String authorizationToken = null;
        String authorizationToken = null;
        Boolean autoCapture = null;
        Address billingAddress = null;
        List<String> customPaymentMethodIds = null;
        Customer customer = null;
        String locale = null;
        String merchantData = null;
        String merchantReference1 = null;
        String merchantReference2 = null;
        MerchantUrls merchantUrls = null;
        Long orderTaxAmount = null;
        Set<PaymentMethodCategory> paymentMethodCategories = null;
        Address shippingAddress = null;
        String status = null;
        Order response = api.createOrder(orderAmount, orderLines, purchaseCountry, purchaseCurrency, authorizationToken)
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
        // TODO: test validations
    }

    /**
     * Create a session
     *
     * Use this API call to create a Klarna Payments session.&lt;br/&gt;When a session is created you will receive the available &#x60;payment_method_categories&#x60; for the session, a &#x60;session_id&#x60; and a &#x60;client_token&#x60;. The &#x60;session_id&#x60; can be used to read or update the session using the REST API. The &#x60;client_token&#x60; should be passed to the browser. Read more on **[Create a new payment session](https://docs.klarna.com/klarna-payments/integrate-with-klarna-payments/step-1-initiate-a-payment/)**.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSessionTest() throws ApiException {
        Long orderAmount = null;
        List<OrderLine> orderLines = null;
        String purchaseCountry = null;
        String purchaseCurrency = null;
        String acquiringChannel = null;
        Attachment attachment = null;
        String authorizationToken = null;
        Address billingAddress = null;
        String clientToken = null;
        List<String> customPaymentMethodIds = null;
        Customer customer = null;
        String design = null;
        OffsetDateTime expiresAt = null;
        String locale = null;
        String merchantData = null;
        String merchantReference1 = null;
        String merchantReference2 = null;
        MerchantUrls merchantUrls = null;
        Options options = null;
        Long orderTaxAmount = null;
        Set<PaymentMethodCategory> paymentMethodCategories = null;
        Address shippingAddress = null;
        String status = null;
        String intent = null;
        MerchantSession response = api.createSession(orderAmount, orderLines, purchaseCountry, purchaseCurrency)
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
        // TODO: test validations
    }

    /**
     * Generate a consumer token
     *
     * Use this API call to create a Klarna Customer Token.&lt;br/&gt;After having obtained an &#x60;authorization_token&#x60; for a successful authorization, this can be used to create a purchase token instead of placing the order. Creating a Klarna Customer Token results in Klarna storing customer and payment method details. Read more on **[Generate a consumer token](https://docs.klarna.com/klarna-payments/in-depth-knowledge/customer-token/)**.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void generateCustomerTokenTest() throws ApiException {
        String description = null;
        String intendedUse = null;
        String locale = null;
        String purchaseCountry = null;
        String purchaseCurrency = null;
        String authorizationToken = null;
        Address billingAddress = null;
        Customer customer = null;
        CustomerTokenCreationResponse response = api.generateCustomerToken(description, intendedUse, locale, purchaseCountry, purchaseCurrency, authorizationToken)
                .billingAddress(billingAddress)
                .customer(customer)
                .execute();
        // TODO: test validations
    }

    /**
     * Get details about a session
     *
     * Use this API call to get a Klarna Payments session. You can read the Klarna Payments session at any time after it has been created, to get information about it. This will return all data that has been collected during the session. Read more on **[Read an existing payment session](https://docs.klarna.com/klarna-payments/other-actions/check-the-details-of-a-payment-session/)**.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSessionDetailsTest() throws ApiException {
        String sessionId = null;
        SessionRead response = api.getSessionDetails(sessionId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a session
     *
     * Use this API call to update a Klarna Payments session with new details, in case something in the order has changed and the checkout has been reloaded. Including if the consumer adds a new item to the cart or if consumer details are updated. Read more on **[Update an existing payment session](https://docs.klarna.com/klarna-payments/other-actions/update-the-cart/)**.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSessionDetailsTest() throws ApiException {
        String sessionId = null;
        String acquiringChannel = null;
        Attachment attachment = null;
        String authorizationToken = null;
        Address billingAddress = null;
        String clientToken = null;
        List<String> customPaymentMethodIds = null;
        Customer customer = null;
        String design = null;
        OffsetDateTime expiresAt = null;
        String locale = null;
        String merchantData = null;
        String merchantReference1 = null;
        String merchantReference2 = null;
        MerchantUrls merchantUrls = null;
        Options options = null;
        Long orderAmount = null;
        List<OrderLine> orderLines = null;
        Long orderTaxAmount = null;
        Set<PaymentMethodCategory> paymentMethodCategories = null;
        String purchaseCountry = null;
        String purchaseCurrency = null;
        Address shippingAddress = null;
        String status = null;
        String intent = null;
        api.updateSessionDetails(sessionId)
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
        // TODO: test validations
    }

}
