# OrderApi

All URIs are relative to *https://localhost:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrder**](OrderApi.md#createOrder) | **POST** /order/add | Create a new order
[**deleteOrder**](OrderApi.md#deleteOrder) | **DELETE** /order/{orderId} | Delete an order by ID
[**getOrder**](OrderApi.md#getOrder) | **GET** /order/{orderId} | Get order by ID
[**updateOrder**](OrderApi.md#updateOrder) | **PUT** /order/{orderId} | Update info about an existing order by Id

<a name="createOrder"></a>
# **createOrder**
> Order createOrder(body, userID, osName, osVersion, procName, procCores, procFreq, ram, diskType, diskVolume, ipType, ipQuantity, months)

Create a new order

Create a new order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
Order body = new Order(); // Order | create a new order
String userID = "userID_example"; // String | user ID account
String osName = "osName_example"; // String | OS preffered
String osVersion = "osVersion_example"; // String | OS version preffered
String procName = "procName_example"; // String | processor preffered
Integer procCores = 56; // Integer | processor cores preffered
Integer procFreq = 56; // Integer | processor frequency preffered
Integer ram = 56; // Integer | RAM volume preffered
String diskType = "diskType_example"; // String | Disk type preffered
Integer diskVolume = 56; // Integer | Disk volume preffered
String ipType = "ipType_example"; // String | IP type preffered
Integer ipQuantity = 56; // Integer | IP quantity preffered
Integer months = 56; // Integer | months payed
try {
    Order result = apiInstance.createOrder(body, userID, osName, osVersion, procName, procCores, procFreq, ram, diskType, diskVolume, ipType, ipQuantity, months);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#createOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Order**](Order.md)| create a new order |
 **userID** | **String**| user ID account |
 **osName** | **String**| OS preffered |
 **osVersion** | **String**| OS version preffered |
 **procName** | **String**| processor preffered |
 **procCores** | **Integer**| processor cores preffered |
 **procFreq** | **Integer**| processor frequency preffered |
 **ram** | **Integer**| RAM volume preffered |
 **diskType** | **String**| Disk type preffered |
 **diskVolume** | **Integer**| Disk volume preffered |
 **ipType** | **String**| IP type preffered |
 **ipQuantity** | **Integer**| IP quantity preffered |
 **months** | **Integer**| months payed |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="createOrder"></a>
# **createOrder**
> Order createOrder(id, orderNo, orderDateTime, userID2, specVDS, monthsPayed, orderExpiration, userID, osName, osVersion, procName, procCores, procFreq, ram, diskType, diskVolume, ipType, ipQuantity, months)

Create a new order

Create a new order

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
Long id = 789L; // Long | 
Long orderNo = 789L; // Long | 
OffsetDateTime orderDateTime = new OffsetDateTime(); // OffsetDateTime | 
User userID2 = new User(); // User | 
Specification specVDS = new Specification(); // Specification | 
Integer monthsPayed = 56; // Integer | 
String orderExpiration = "orderExpiration_example"; // String | 
String userID = "userID_example"; // String | user ID account
String osName = "osName_example"; // String | OS preffered
String osVersion = "osVersion_example"; // String | OS version preffered
String procName = "procName_example"; // String | processor preffered
Integer procCores = 56; // Integer | processor cores preffered
Integer procFreq = 56; // Integer | processor frequency preffered
Integer ram = 56; // Integer | RAM volume preffered
String diskType = "diskType_example"; // String | Disk type preffered
Integer diskVolume = 56; // Integer | Disk volume preffered
String ipType = "ipType_example"; // String | IP type preffered
Integer ipQuantity = 56; // Integer | IP quantity preffered
Integer months = 56; // Integer | months payed
try {
    Order result = apiInstance.createOrder(id, orderNo, orderDateTime, userID2, specVDS, monthsPayed, orderExpiration, userID, osName, osVersion, procName, procCores, procFreq, ram, diskType, diskVolume, ipType, ipQuantity, months);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#createOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **orderNo** | **Long**|  |
 **orderDateTime** | **OffsetDateTime**|  |
 **userID2** | [**User**](.md)|  |
 **specVDS** | [**Specification**](.md)|  |
 **monthsPayed** | **Integer**|  |
 **orderExpiration** | **String**|  |
 **userID** | **String**| user ID account |
 **osName** | **String**| OS preffered |
 **osVersion** | **String**| OS version preffered |
 **procName** | **String**| processor preffered |
 **procCores** | **Integer**| processor cores preffered |
 **procFreq** | **Integer**| processor frequency preffered |
 **ram** | **Integer**| RAM volume preffered |
 **diskType** | **String**| Disk type preffered |
 **diskVolume** | **Integer**| Disk volume preffered |
 **ipType** | **String**| IP type preffered |
 **ipQuantity** | **Integer**| IP quantity preffered |
 **months** | **Integer**| months payed |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="deleteOrder"></a>
# **deleteOrder**
> Order deleteOrder(orderId)

Delete an order by ID

delete an order by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
Long orderId = 789L; // Long | Order ID to delete
try {
    Order result = apiInstance.deleteOrder(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#deleteOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Long**| Order ID to delete |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getOrder"></a>
# **getOrder**
> Order getOrder(orderId)

Get order by ID

Get order by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
Long orderId = 789L; // Long | ID of order to return
try {
    Order result = apiInstance.getOrder(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Long**| ID of order to return |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="updateOrder"></a>
# **updateOrder**
> Order updateOrder(body, orderId)

Update info about an existing order by Id

Update info about an existing order by Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
Order body = new Order(); // Order | Update an existing order in the store
Long orderId = 789L; // Long | ID of order to return
try {
    Order result = apiInstance.updateOrder(body, orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#updateOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Order**](Order.md)| Update an existing order in the store |
 **orderId** | **Long**| ID of order to return |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="updateOrder"></a>
# **updateOrder**
> Order updateOrder(id, orderNo, orderDateTime, userID, specVDS, monthsPayed, orderExpiration, orderId)

Update info about an existing order by Id

Update info about an existing order by Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OrderApi;


OrderApi apiInstance = new OrderApi();
Long id = 789L; // Long | 
Long orderNo = 789L; // Long | 
OffsetDateTime orderDateTime = new OffsetDateTime(); // OffsetDateTime | 
User userID = new User(); // User | 
Specification specVDS = new Specification(); // Specification | 
Integer monthsPayed = 56; // Integer | 
String orderExpiration = "orderExpiration_example"; // String | 
Long orderId = 789L; // Long | ID of order to return
try {
    Order result = apiInstance.updateOrder(id, orderNo, orderDateTime, userID, specVDS, monthsPayed, orderExpiration, orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#updateOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **orderNo** | **Long**|  |
 **orderDateTime** | **OffsetDateTime**|  |
 **userID** | [**User**](.md)|  |
 **specVDS** | [**Specification**](.md)|  |
 **monthsPayed** | **Integer**|  |
 **orderExpiration** | **String**|  |
 **orderId** | **Long**| ID of order to return |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

