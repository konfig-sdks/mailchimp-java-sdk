

# ListsAddMemberEventRequest

A new event for a specific list member

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name for this type of event (&#39;purchased&#39;, &#39;visited&#39;, etc). Must be 2-30 characters in length |  |
|**properties** | **Map&lt;String, String&gt;** | An optional list of properties |  [optional] |
|**isSyncing** | **Boolean** | Events created with the is_syncing value set to &#x60;true&#x60; will not trigger automations. |  [optional] |
|**occurredAt** | **OffsetDateTime** | The date and time the event occurred in ISO 8601 format. |  [optional] |



