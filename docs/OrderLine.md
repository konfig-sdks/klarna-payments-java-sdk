

# OrderLine


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**imageUrl** | **String** | URL to an image that can be later embedded in communications between Klarna and the customer. (max 1024 characters).  A minimum of 250x250 px resolution is recommended for the image to look good in the Klarna app, and below 50x50 px won&#39;t even show. We recommend using a good sized image (650x650 px or more), however the file size must not exceed 12MB. |  [optional] |
|**merchantData** | **String** | Used for storing merchant&#39;s internal order number or other reference. Pass through field. (max 1024 characters) |  [optional] |
|**name** | **String** | Descriptive name of the order line item. |  |
|**productIdentifiers** | [**ProductIdentifiers**](ProductIdentifiers.md) |  |  [optional] |
|**productUrl** | **String** | URL to the product in the merchant’s webshop that can be later used in communications between Klarna and the customer. (max 1024 characters) |  [optional] |
|**quantity** | **Long** | Quantity of the order line item. Must be a non-negative number. |  |
|**quantityUnit** | **String** | Unit used to describe the quantity, e.g. kg, pcs, etc. If defined the value has to be 1-8 characters. |  [optional] |
|**reference** | **String** | Client facing article number, SKU or similar. Max length is 256 characters. |  [optional] |
|**taxRate** | **Long** | Tax rate of the order line. Non-negative value. The percentage value is represented with two implicit decimals. I.e 2000 &#x3D; 20%. |  [optional] |
|**totalAmount** | **Long** | Total amount of the order line. Must be defined as minor units. Includes tax and discount. Eg: 2000&#x3D;20 euros Value &#x3D; (quantity x unit_price) - total_discount_amount.  (max value: 200000000) |  |
|**totalDiscountAmount** | **Long** | Non-negative minor units. Includes tax. Eg: 500&#x3D;5 euros |  [optional] |
|**totalTaxAmount** | **Long** | Total tax amount of the order line. Must be within ±1 of total_amount - total_amount 10000 / (10000 + tax_rate). Negative when type is discount. |  [optional] |
|**type** | **String** | Type of the order line item. The possible values are:  physical discount shipping_fee sales_tax digital gift_card store_credit surcharge |  [optional] |
|**unitPrice** | **Long** | Price for a single unit of the order line. Must be defined as minor units. Includes tax, excludes discount. (max value: 200000000) |  |
|**subscription** | [**Subscription**](Subscription.md) |  |  [optional] |



