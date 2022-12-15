# VdsSpecificationApi

All URIs are relative to *https://localhost:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteSpec**](VdsSpecificationApi.md#deleteSpec) | **DELETE** /specification/{specID} | Delete specification by ID
[**getAllVDS**](VdsSpecificationApi.md#getAllVDS) | **GET** /specification/all | Get all VDS specifications info
[**getSpec**](VdsSpecificationApi.md#getSpec) | **GET** /specification/{specID} | Get VDS specification info by ID
[**updateSpec**](VdsSpecificationApi.md#updateSpec) | **PUT** /specification/{specID} | Update VDS specification info by ID

<a name="deleteSpec"></a>
# **deleteSpec**
> Specification deleteSpec(specID)

Delete specification by ID

This delete specification by ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VdsSpecificationApi;


VdsSpecificationApi apiInstance = new VdsSpecificationApi();
Long specID = 789L; // Long | The specification ID that needs to be deleted
try {
    Specification result = apiInstance.deleteSpec(specID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VdsSpecificationApi#deleteSpec");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **Long**| The specification ID that needs to be deleted |

### Return type

[**Specification**](Specification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getAllVDS"></a>
# **getAllVDS**
> List&lt;Specification&gt; getAllVDS()

Get all VDS specifications info

Get all VDS specifications info

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VdsSpecificationApi;


VdsSpecificationApi apiInstance = new VdsSpecificationApi();
try {
    List<Specification> result = apiInstance.getAllVDS();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VdsSpecificationApi#getAllVDS");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Specification&gt;**](Specification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getSpec"></a>
# **getSpec**
> Specification getSpec(specID)

Get VDS specification info by ID

Get VDS specification info by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VdsSpecificationApi;


VdsSpecificationApi apiInstance = new VdsSpecificationApi();
Long specID = 789L; // Long | 
try {
    Specification result = apiInstance.getSpec(specID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VdsSpecificationApi#getSpec");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **Long**|  |

### Return type

[**Specification**](Specification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="updateSpec"></a>
# **updateSpec**
> Specification updateSpec(specID)

Update VDS specification info by ID

Update VDS specification info by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VdsSpecificationApi;


VdsSpecificationApi apiInstance = new VdsSpecificationApi();
Long specID = 789L; // Long | specification ID that need to be updated
try {
    Specification result = apiInstance.updateSpec(specID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VdsSpecificationApi#updateSpec");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **specID** | **Long**| specification ID that need to be updated |

### Return type

[**Specification**](Specification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

