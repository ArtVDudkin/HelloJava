# Robot

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**serialNo** | **String** |  |  [optional]
**model** | [**Model**](Model.md) |  |  [optional]
**firmware** | **String** |  |  [optional]
**config** | **List&lt;String&gt;** |  |  [optional]
**diadnostic** | **List&lt;Integer&gt;** |  |  [optional]
**historyClean** | [**Statistic**](Statistic.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | robot status in the store |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
READY | &quot;ready&quot;
CHARGING | &quot;charging&quot;
WORKING | &quot;working&quot;
