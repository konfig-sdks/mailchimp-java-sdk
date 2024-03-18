

# VerifiedDomainsAddDomainToAccountResponse

The verified domains currently on the account.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**domain** | **String** | The name of this domain. |  [optional] [readonly] |
|**verified** | **Boolean** | Whether the domain has been verified for sending. |  [optional] [readonly] |
|**authenticated** | **Boolean** | Whether domain authentication is enabled for this domain. |  [optional] [readonly] |
|**verificationEmail** | **String** | The e-mail address receiving the two-factor challenge for this domain. |  [optional] [readonly] |
|**verificationSent** | **OffsetDateTime** | The date/time that the two-factor challenge was sent to the verification email. |  [optional] [readonly] |



