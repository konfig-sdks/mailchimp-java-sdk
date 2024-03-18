

# PromosPropertyInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | The Promo Code |  |
|**amountDiscounted** | **Double** | The amount of discount applied on the total price. For example if the total cost was $100 and the customer paid $95.5, amount_discounted will be 4.5 For free shipping set amount_discounted to 0 |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of discount. For free shipping set type to fixed |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FIXED | &quot;fixed&quot; |
| PERCENTAGE | &quot;percentage&quot; |



