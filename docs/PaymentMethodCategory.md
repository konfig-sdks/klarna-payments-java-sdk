

# PaymentMethodCategory


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assetUrls** | [**AssetUrls**](AssetUrls.md) |  |  [optional] |
|**identifier** | **String** | ID of the payment method category to be used while loading the widget later. The possible values are:&lt;ul&gt;&lt;li&gt;klarna&lt;/li&gt;&lt;li&gt;pay_later&lt;/li&gt;&lt;li&gt;pay_now&lt;/li&gt;&lt;li&gt;pay_over_time&lt;/li&gt;&lt;li&gt;direct_bank_transfer&lt;/li&gt;&lt;li&gt;direct_debit&lt;/li&gt;&lt;/ul&gt; |  [optional] |
|**name** | **String** | Name of the payment method category. These names are dynamic depending on what payment method is in the category. Using this dynamic asset will make sure that any copy update of Klarna will automatically be propagated, or any updates of included payment methods by you. |  [optional] |



