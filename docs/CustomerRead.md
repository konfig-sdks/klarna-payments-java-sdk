

# CustomerRead


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | Customer’s Title. Allowed values per country: UK - \&quot;Mr\&quot;, \&quot;Ms\&quot; DE - \&quot;Herr\&quot;, \&quot;Frau\&quot; AT: \&quot;Herr, \&quot;Frau\&quot; CH: de-CH: \&quot;Herr, \&quot;Frau\&quot; it-CH: \&quot;Sig.\&quot;, \&quot;Sig.ra\&quot; fr-CH: \&quot;M\&quot;, \&quot;Mme\&quot;  BE: \&quot;Dhr.\&quot;, \&quot;Mevr.\&quot; NL: \&quot;Dhr.\&quot;, \&quot;Mevr.\&quot; |  [optional] |
|**dateOfBirth** | **String** | Customer’s date of birth. The format is ‘yyyy-mm-dd’ |  [optional] |
|**gender** | **String** | Customer’s gender - ‘male’ or ‘female’ |  [optional] |
|**organizationEntityType** | [**OrganizationEntityTypeEnum**](#OrganizationEntityTypeEnum) | Organization entity type. Only applicable for B2B customers. |  [optional] |
|**organizationRegistrationId** | **String** | Organization registration id. Only applicable for B2B customers. |  [optional] |
|**type** | **String** | Type of customer in the session. If nothing is added, a B2C session will be the default. If it is a b2b-session, you should enter organization to trigger a B2B session. |  [optional] |
|**vatId** | **String** | VAT ID. Only applicable for B2B customers. |  [optional] |



## Enum: OrganizationEntityTypeEnum

| Name | Value |
|---- | -----|
| LIMITED_COMPANY | &quot;LIMITED_COMPANY&quot; |
| PUBLIC_LIMITED_COMPANY | &quot;PUBLIC_LIMITED_COMPANY&quot; |
| ENTREPRENEURIAL_COMPANY | &quot;ENTREPRENEURIAL_COMPANY&quot; |
| LIMITED_PARTNERSHIP_LIMITED_COMPANY | &quot;LIMITED_PARTNERSHIP_LIMITED_COMPANY&quot; |
| LIMITED_PARTNERSHIP | &quot;LIMITED_PARTNERSHIP&quot; |
| GENERAL_PARTNERSHIP | &quot;GENERAL_PARTNERSHIP&quot; |
| REGISTERED_SOLE_TRADER | &quot;REGISTERED_SOLE_TRADER&quot; |
| SOLE_TRADER | &quot;SOLE_TRADER&quot; |
| CIVIL_LAW_PARTNERSHIP | &quot;CIVIL_LAW_PARTNERSHIP&quot; |
| PUBLIC_INSTITUTION | &quot;PUBLIC_INSTITUTION&quot; |
| OTHER | &quot;OTHER&quot; |



