

# LandingPageReport

A summary of an individual landing page's settings and content.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | The name of the landing page the user&#39;s customers will see. |  [optional] [readonly] |
|**id** | **String** | A string that uniquely identifies this landing page. |  [optional] [readonly] |
|**name** | **String** | The name of this landing page the user will see. |  [optional] [readonly] |
|**url** | **String** | The landing page url. |  [optional] [readonly] |
|**publishedAt** | **OffsetDateTime** | The time this landing page was published. |  [optional] [readonly] |
|**unpublishedAt** | **OffsetDateTime** | The time this landing page was unpublished. |  [optional] [readonly] |
|**status** | **String** | The status of the landing page. |  [optional] [readonly] |
|**listId** | **String** | The list id connected to this landing page. |  [optional] [readonly] |
|**visits** | **Integer** | The number of visits to this landing pages. |  [optional] [readonly] |
|**uniqueVisits** | **Integer** | The number of unique visits to this landing pages. |  [optional] [readonly] |
|**subscribes** | **Integer** | The number of subscribes to this landing pages. |  [optional] [readonly] |
|**clicks** | **Integer** | The number of clicks to this landing pages. |  [optional] [readonly] |
|**conversionRate** | **Double** | The percentage of people who visited your landing page and were added to your list. |  [optional] [readonly] |
|**timeseries** | [**LandingPageReportTimeseries**](LandingPageReportTimeseries.md) |  |  [optional] |
|**ecommerce** | [**ReportingGetLandingPageReportResponseEcommerce**](ReportingGetLandingPageReportResponseEcommerce.md) |  |  [optional] |
|**webId** | **Integer** | The ID used in the Mailchimp web application. |  [optional] [readonly] |
|**listName** | **String** | List Name |  [optional] [readonly] |
|**signupTags** | [**List&lt;Tag&gt;**](Tag.md) | A list of tags associated to the landing page. |  [optional] [readonly] |
|**links** | [**List&lt;ResourceLink&gt;**](ResourceLink.md) | A list of link types and descriptions for the API schema documents. |  [optional] [readonly] |



