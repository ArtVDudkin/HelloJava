# ItemApi

All URIs are relative to *https://localhost:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDisk**](ItemApi.md#getDisk) | **GET** /item/disk/all | Get all disk options info
[**getIP**](ItemApi.md#getIP) | **GET** /item/ip/all | Get all IP options info
[**getOS**](ItemApi.md#getOS) | **GET** /item/OS/all | Get all OS options info
[**getProc**](ItemApi.md#getProc) | **GET** /item/processor/all | Get all processor options info
[**getRAM**](ItemApi.md#getRAM) | **GET** /item/RAM/all | Get all RAM options info

<a name="getDisk"></a>
# **getDisk**
> List&lt;Disk&gt; getDisk()

Get all disk options info

Get all disk options info

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ItemApi;


ItemApi apiInstance = new ItemApi();
try {
    List<Disk> result = apiInstance.getDisk();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#getDisk");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Disk&gt;**](Disk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getIP"></a>
# **getIP**
> List&lt;IP&gt; getIP()

Get all IP options info

Get all IP options info

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ItemApi;


ItemApi apiInstance = new ItemApi();
try {
    List<IP> result = apiInstance.getIP();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#getIP");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;IP&gt;**](IP.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getOS"></a>
# **getOS**
> List&lt;OS&gt; getOS()

Get all OS options info

Get all OS options info

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ItemApi;


ItemApi apiInstance = new ItemApi();
try {
    List<OS> result = apiInstance.getOS();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#getOS");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;OS&gt;**](OS.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getProc"></a>
# **getProc**
> List&lt;Processor&gt; getProc()

Get all processor options info

Get all processor options info

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ItemApi;


ItemApi apiInstance = new ItemApi();
try {
    List<Processor> result = apiInstance.getProc();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#getProc");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Processor&gt;**](Processor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getRAM"></a>
# **getRAM**
> List&lt;RAM&gt; getRAM()

Get all RAM options info

Get all RAM options info

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ItemApi;


ItemApi apiInstance = new ItemApi();
try {
    List<RAM> result = apiInstance.getRAM();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#getRAM");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;RAM&gt;**](RAM.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

