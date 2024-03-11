

# Session


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acquiringChannel** | [**AcquiringChannelEnum**](#AcquiringChannelEnum) | The acquiring channel in which the session takes place. Ecommerce is default unless specified. Any other values should be defined in the agreement. |  [optional] |
|**attachment** | [**Attachment**](Attachment.md) |  |  [optional] |
|**authorizationToken** | **String** | Authorization token. |  [optional] [readonly] |
|**billingAddress** | [**Address**](Address.md) |  |  [optional] |
|**clientToken** | **String** | Token to be passed to the JS client |  [optional] [readonly] |
|**customPaymentMethodIds** | **List&lt;String&gt;** | Promo codes - The array could be used to define which of the configured payment options within a payment category (pay_later, pay_over_time, etc.) should be shown for this purchase. Discuss with the delivery manager to know about the promo codes that will be configured for your account. The feature could also be used to provide promotional offers to specific customers (eg: 0% financing). Please be informed that the usage of this feature can have commercial implications.  |  [optional] |
|**customer** | [**Customer**](Customer.md) |  |  [optional] |
|**design** | **String** | Design package to use in the session. This can only by used if a custom design has been implemented for Klarna Payments and agreed upon in the agreement. It might have a financial impact. Delivery manager will provide the value for the parameter. |  [optional] |
|**expiresAt** | **OffsetDateTime** | Session expiration date |  [optional] [readonly] |
|**locale** | **String** | Used to define the language and region of the customer. The locale follows the format of [RFC 1766](https://datatracker.ietf.org/doc/rfc1766/), meaning its value consists of language-country. Read more on **[Supported Locals and Currencies](https://docs.klarna.com/klarna-payments/in-depth-knowledge/puchase-countries-currencies-locales/)**. |  [optional] |
|**merchantData** | **String** | Pass through field to send any information about the order to be used later for reference while retrieving the order details (max 6000 characters) |  [optional] |
|**merchantReference1** | **String** | Used for storing merchant&#39;s internal order number or other reference. |  [optional] |
|**merchantReference2** | **String** | Used for storing merchant&#39;s internal order number or other reference. The value is available in the settlement files. (max 255 characters). |  [optional] |
|**merchantUrls** | [**MerchantUrls**](MerchantUrls.md) |  |  [optional] |
|**options** | [**Options**](Options.md) |  |  [optional] |
|**orderAmount** | **Long** | Total amount of the order including tax and any available discounts. The value should be in non-negative minor units. Eg: 25 Euros should be 2500. |  [optional] |
|**orderLines** | [**List&lt;OrderLine&gt;**](OrderLine.md) | The array containing list of line items that are part of this order. Maximum of 1000 line items could be processed in a single order. |  [optional] |
|**orderTaxAmount** | **Long** | Total tax amount of the order. The value should be in non-negative minor units. Eg: 25 Euros should be 2500. |  [optional] |
|**paymentMethodCategories** | [**Set&lt;PaymentMethodCategory&gt;**](PaymentMethodCategory.md) | Available payment method categories |  [optional] [readonly] |
|**purchaseCountry** | **String** | The purchase country of the customer. The billing country always overrides purchase country if the values are different. Formatted according to ISO 3166 alpha-2 standard, e.g. GB, SE, DE, US, etc. |  [optional] |
|**purchaseCurrency** | **String** | The purchase currency of the order. Formatted according to ISO 4217 standard, e.g. USD, EUR, SEK, GBP, etc. |  [optional] |
|**shippingAddress** | [**Address**](Address.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the session. Possible values: &#39;complete&#39;, &#39;incomplete&#39; where &#39;complete&#39; is set when the order has been placed. |  [optional] [readonly] |
|**intent** | [**IntentEnum**](#IntentEnum) | Intent for the session. The field is designed to let partners inform Klarna of the purpose of the customer’s session. |  [optional] |



## Enum: AcquiringChannelEnum

| Name | Value |
|---- | -----|
| ECOMMERCE | &quot;ECOMMERCE&quot; |
| IN_STORE | &quot;IN_STORE&quot; |
| TELESALES | &quot;TELESALES&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETE | &quot;complete&quot; |
| INCOMPLETE | &quot;incomplete&quot; |



## Enum: IntentEnum

| Name | Value |
|---- | -----|
| BUY | &quot;buy&quot; |
| TOKENIZE | &quot;tokenize&quot; |
| BUY_AND_TOKENIZE | &quot;buy_and_tokenize&quot; |



