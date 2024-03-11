package com.konfigthis.client;

import com.konfigthis.client.api.PaymentApi;

public class KlarnaPayments {
    private ApiClient apiClient;
    public final PaymentApi payment;

    public KlarnaPayments() {
        this(null);
    }

    public KlarnaPayments(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.payment = new PaymentApi(this.apiClient);
    }

}
