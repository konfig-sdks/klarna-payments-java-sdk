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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.Address;
import com.konfigthis.client.model.Attachment;
import com.konfigthis.client.model.CustomerRead;
import com.konfigthis.client.model.MerchantUrls;
import com.konfigthis.client.model.Options;
import com.konfigthis.client.model.OrderLine;
import com.konfigthis.client.model.PaymentMethodCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for SessionRead
 */
public class SessionReadTest {
    private final SessionRead model = new SessionRead();

    /**
     * Model tests for SessionRead
     */
    @Test
    public void testSessionRead() {
        // TODO: test SessionRead
    }

    /**
     * Test the property 'acquiringChannel'
     */
    @Test
    public void acquiringChannelTest() {
        // TODO: test acquiringChannel
    }

    /**
     * Test the property 'attachment'
     */
    @Test
    public void attachmentTest() {
        // TODO: test attachment
    }

    /**
     * Test the property 'authorizationToken'
     */
    @Test
    public void authorizationTokenTest() {
        // TODO: test authorizationToken
    }

    /**
     * Test the property 'billingAddress'
     */
    @Test
    public void billingAddressTest() {
        // TODO: test billingAddress
    }

    /**
     * Test the property 'clientToken'
     */
    @Test
    public void clientTokenTest() {
        // TODO: test clientToken
    }

    /**
     * Test the property 'customPaymentMethodIds'
     */
    @Test
    public void customPaymentMethodIdsTest() {
        // TODO: test customPaymentMethodIds
    }

    /**
     * Test the property 'customer'
     */
    @Test
    public void customerTest() {
        // TODO: test customer
    }

    /**
     * Test the property 'design'
     */
    @Test
    public void designTest() {
        // TODO: test design
    }

    /**
     * Test the property 'expiresAt'
     */
    @Test
    public void expiresAtTest() {
        // TODO: test expiresAt
    }

    /**
     * Test the property 'locale'
     */
    @Test
    public void localeTest() {
        // TODO: test locale
    }

    /**
     * Test the property 'merchantData'
     */
    @Test
    public void merchantDataTest() {
        // TODO: test merchantData
    }

    /**
     * Test the property 'merchantReference1'
     */
    @Test
    public void merchantReference1Test() {
        // TODO: test merchantReference1
    }

    /**
     * Test the property 'merchantReference2'
     */
    @Test
    public void merchantReference2Test() {
        // TODO: test merchantReference2
    }

    /**
     * Test the property 'merchantUrls'
     */
    @Test
    public void merchantUrlsTest() {
        // TODO: test merchantUrls
    }

    /**
     * Test the property 'options'
     */
    @Test
    public void optionsTest() {
        // TODO: test options
    }

    /**
     * Test the property 'orderAmount'
     */
    @Test
    public void orderAmountTest() {
        // TODO: test orderAmount
    }

    /**
     * Test the property 'orderLines'
     */
    @Test
    public void orderLinesTest() {
        // TODO: test orderLines
    }

    /**
     * Test the property 'orderTaxAmount'
     */
    @Test
    public void orderTaxAmountTest() {
        // TODO: test orderTaxAmount
    }

    /**
     * Test the property 'paymentMethodCategories'
     */
    @Test
    public void paymentMethodCategoriesTest() {
        // TODO: test paymentMethodCategories
    }

    /**
     * Test the property 'purchaseCountry'
     */
    @Test
    public void purchaseCountryTest() {
        // TODO: test purchaseCountry
    }

    /**
     * Test the property 'purchaseCurrency'
     */
    @Test
    public void purchaseCurrencyTest() {
        // TODO: test purchaseCurrency
    }

    /**
     * Test the property 'shippingAddress'
     */
    @Test
    public void shippingAddressTest() {
        // TODO: test shippingAddress
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'intent'
     */
    @Test
    public void intentTest() {
        // TODO: test intent
    }

}
