

# CustomerTokenCreationResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**billingAddress** | [**Address**](Address.md) |  |  [optional] |
|**customer** | [**CustomerReadCreateToken**](CustomerReadCreateToken.md) |  |  [optional] |
|**paymentMethodReference** | **String** | Used to connect customers with payment method when it is present. |  [optional] |
|**redirectUrl** | **String** | URL to redirect the customer to after placing the order. This is a Klarna URL where Klarna will place a cookie in the customer’s browser (if redirected) and redirect the customer back to the confirmation URL provided by the merchant. This is not a mandatory step but a recommended one to improve the returning customer’s experience. |  [optional] |
|**tokenId** | **String** | Generated customer token. This token will be used to create a new order for the subscription using the Create a New order using token API. |  |



