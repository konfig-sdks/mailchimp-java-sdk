

# CollectionAuthorizationProperty

Do particular authorization constraints around this collection limit creation of new instances?

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mayCreate** | **Boolean** | May the user create additional instances of this resource? |  |
|**maxInstances** | **Integer** | How many total instances of this resource are allowed? This is independent of any filter conditions applied to the query. As a special case, -1 indicates unlimited. |  |
|**currentTotalInstances** | **Integer** | How many total instances of this resource are already in use? This is independent of any filter conditions applied to the query. Value may be larger than max_instances. As a special case, -1 is returned when access is unlimited. |  [optional] |



