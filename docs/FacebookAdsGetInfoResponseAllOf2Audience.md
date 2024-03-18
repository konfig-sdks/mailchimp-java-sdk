

# FacebookAdsGetInfoResponseAllOf2Audience

Audience settings

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Type of the audience |  [optional] |
|**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) | List or Facebook based audience |  [optional] |
|**emailSource** | [**FacebookAdsGetInfoResponseAllOf2AudienceEmailSource**](FacebookAdsGetInfoResponseAllOf2AudienceEmailSource.md) |  |  [optional] |
|**includeSourceInTarget** | **Boolean** | To include list contacts as part of audience |  [optional] |
|**lookalikeCountryCode** | **String** | To find similar audience in given country |  [optional] |
|**targetingSpecs** | [**FacebookAdsGetInfoResponseAllOf2AudienceTargetingSpecs**](FacebookAdsGetInfoResponseAllOf2AudienceTargetingSpecs.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CUSTOM_AUDIENCE | &quot;Custom Audience&quot; |
| LOOKALIKE_AUDIENCE | &quot;Lookalike Audience&quot; |
| INTEREST_BASED_AUDIENCE | &quot;Interest-based Audience&quot; |



## Enum: SourceTypeEnum

| Name | Value |
|---- | -----|
| FACEBOOK | &quot;facebook&quot; |
| LIST | &quot;list&quot; |



