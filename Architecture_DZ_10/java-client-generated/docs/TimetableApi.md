# TimetableApi

All URIs are relative to *https://petstore3.swagger.io/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clearTimetable**](TimetableApi.md#clearTimetable) | **DELETE** /timetable/all | Delete all records from timetable
[**deleteRecord**](TimetableApi.md#deleteRecord) | **DELETE** /timetable/{recordId} | Delete record from timetable by ID
[**editRecord**](TimetableApi.md#editRecord) | **PUT** /timetable/{recordId} | Update record in timetable by ID
[**getRecord**](TimetableApi.md#getRecord) | **GET** /timetable/{recordId} | Get record in timetable by ID
[**getTimetable**](TimetableApi.md#getTimetable) | **GET** /timetable/all | Returns timetable with all known cleanings
[**newRecord**](TimetableApi.md#newRecord) | **POST** /timetable/newclean | Create a new record in timetable

<a name="clearTimetable"></a>
# **clearTimetable**
> Timetable clearTimetable()

Delete all records from timetable

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TimetableApi;


TimetableApi apiInstance = new TimetableApi();
try {
    Timetable result = apiInstance.clearTimetable();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimetableApi#clearTimetable");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Timetable**](Timetable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteRecord"></a>
# **deleteRecord**
> deleteRecord(recordId)

Delete record from timetable by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TimetableApi;


TimetableApi apiInstance = new TimetableApi();
Long recordId = 789L; // Long | 
try {
    apiInstance.deleteRecord(recordId);
} catch (ApiException e) {
    System.err.println("Exception when calling TimetableApi#deleteRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordId** | **Long**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="editRecord"></a>
# **editRecord**
> Timetable editRecord(recordId)

Update record in timetable by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TimetableApi;


TimetableApi apiInstance = new TimetableApi();
Long recordId = 789L; // Long | 
try {
    Timetable result = apiInstance.editRecord(recordId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimetableApi#editRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordId** | **Long**|  |

### Return type

[**Timetable**](Timetable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getRecord"></a>
# **getRecord**
> Timetable getRecord(recordId)

Get record in timetable by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TimetableApi;


TimetableApi apiInstance = new TimetableApi();
Long recordId = 789L; // Long | 
try {
    Timetable result = apiInstance.getRecord(recordId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimetableApi#getRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordId** | **Long**|  |

### Return type

[**Timetable**](Timetable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getTimetable"></a>
# **getTimetable**
> Timetable getTimetable()

Returns timetable with all known cleanings

Returns timetable with all known cleanings

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TimetableApi;


TimetableApi apiInstance = new TimetableApi();
try {
    Timetable result = apiInstance.getTimetable();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimetableApi#getTimetable");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Timetable**](Timetable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="newRecord"></a>
# **newRecord**
> Timetable newRecord(body)

Create a new record in timetable

Create a new record in timetable

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TimetableApi;


TimetableApi apiInstance = new TimetableApi();
Timetable body = new Timetable(); // Timetable | 
try {
    Timetable result = apiInstance.newRecord(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimetableApi#newRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Timetable**](Timetable.md)|  | [optional]

### Return type

[**Timetable**](Timetable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="newRecord"></a>
# **newRecord**
> Timetable newRecord(id, datetime, roomID, resultID)

Create a new record in timetable

Create a new record in timetable

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TimetableApi;


TimetableApi apiInstance = new TimetableApi();
Long id = 789L; // Long | 
OffsetDateTime datetime = new OffsetDateTime(); // OffsetDateTime | 
Room roomID = new Room(); // Room | 
Result resultID = new Result(); // Result | 
try {
    Timetable result = apiInstance.newRecord(id, datetime, roomID, resultID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimetableApi#newRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  | [optional]
 **datetime** | **OffsetDateTime**|  | [optional]
 **roomID** | [**Room**](.md)|  | [optional]
 **resultID** | [**Result**](.md)|  | [optional]

### Return type

[**Timetable**](Timetable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json

