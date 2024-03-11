

# Address


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | Customer’s Title. Allowed values per country: UK - \&quot;Mr\&quot;, \&quot;Ms\&quot; DE - \&quot;Herr\&quot;, \&quot;Frau\&quot; AT: \&quot;Herr, \&quot;Frau\&quot; CH: de-CH: \&quot;Herr, \&quot;Frau\&quot; it-CH: \&quot;Sig.\&quot;, \&quot;Sig.ra\&quot; fr-CH: \&quot;M\&quot;, \&quot;Mme\&quot;  BE: \&quot;Dhr.\&quot;, \&quot;Mevr.\&quot; NL: \&quot;Dhr.\&quot;, \&quot;Mevr.\&quot; |  [optional] |
|**attention** | **String** | ‘Attn.’ (if applicable). Only applicable for B2B customers. |  [optional] |
|**city** | **String** | Customer’s city. |  [optional] |
|**country** | **String** | Customer’s country. This value overrides the purchase country if they are different. Should follow the standard of ISO 3166 alpha-2. E.g. GB, US, DE, SE. |  [optional] |
|**email** | **String** | Customer’s email address. |  [optional] |
|**familyName** | **String** | Customers family name in UTF-8 encoding. Cannot be only numbers, must be more than 1 character. Allowed special characters: -&#39;’. More information can be found [in this link](https://docs.klarna.com/klarna-payments/in-depth-knowledge/customer-data-requirements/#details-needed-per-market) |  [optional] |
|**givenName** | **String** | Customers given name in UTF-8 encoding. Cannot be only numbers, must be more than 1 character. Allowed special characters: -&#39;’. More information can be found [in this link](https://docs.klarna.com/klarna-payments/in-depth-knowledge/customer-data-requirements/#details-needed-per-market) |  [optional] |
|**organizationName** | **String** | Organization name (if applicable). Only applicable for B2B customers. |  [optional] |
|**phone** | **String** | Phone number. Preferably a mobile phone number. |  [optional] |
|**postalCode** | **String** | Customer’s postal code. Validation according to Universal Postal Union addressing systems. E.g. 12345, W1G OPW. |  [optional] |
|**region** | **String** | Customer’s region or state - Mandatory for US and AU market. Validations according to ISO 3166-2 format, e.g. OH, NJ, etc. |  [optional] |
|**streetAddress** | **String** | Customer’s street address. Regional formatting is required, as follows: UK/US/FR: 33 Cavendish Square Rest of EU: De Ruijterkade 7 |  [optional] |
|**streetAddress2** | **String** | Customer’s street address. Second Line.  |  [optional] |



