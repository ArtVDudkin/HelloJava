# RoomsApi

All URIs are relative to *https://petstore3.swagger.io/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRoom**](RoomsApi.md#addRoom) | **POST** /room | Add a new room
[**deleteRoom**](RoomsApi.md#deleteRoom) | **DELETE** /room/{roomID} | Delete room by ID
[**getRoom**](RoomsApi.md#getRoom) | **GET** /room/{roomID} | Get room by ID
[**updateRoom**](RoomsApi.md#updateRoom) | **PUT** /room/{roomID} | Update room by ID

<a name="addRoom"></a>
# **addRoom**
> Room addRoom(body)

Add a new room

Add a new room

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoomsApi;


RoomsApi apiInstance = new RoomsApi();
Room body = new Room(); // Room | Create a new room
try {
    Room result = apiInstance.addRoom(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoomsApi#addRoom");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Room**](Room.md)| Create a new room |

### Return type

[**Room**](Room.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="addRoom"></a>
# **addRoom**
> Room addRoom(id, roomname, roomsquare)

Add a new room

Add a new room

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoomsApi;


RoomsApi apiInstance = new RoomsApi();
Long id = 789L; // Long | 
String roomname = "roomname_example"; // String | 
String roomsquare = "roomsquare_example"; // String | 
try {
    Room result = apiInstance.addRoom(id, roomname, roomsquare);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoomsApi#addRoom");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **roomname** | **String**|  |
 **roomsquare** | **String**|  |

### Return type

[**Room**](Room.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="deleteRoom"></a>
# **deleteRoom**
> Room deleteRoom(roomID)

Delete room by ID

This delete room by ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoomsApi;


RoomsApi apiInstance = new RoomsApi();
Long roomID = 789L; // Long | The room id that needs to be deleted
try {
    Room result = apiInstance.deleteRoom(roomID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoomsApi#deleteRoom");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roomID** | **Long**| The room id that needs to be deleted |

### Return type

[**Room**](Room.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getRoom"></a>
# **getRoom**
> Room getRoom(roomID)

Get room by ID

Get room by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoomsApi;


RoomsApi apiInstance = new RoomsApi();
Long roomID = 789L; // Long | The name that needs to be fetched. Use user1 for testing. 
try {
    Room result = apiInstance.getRoom(roomID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoomsApi#getRoom");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roomID** | **Long**| The name that needs to be fetched. Use user1 for testing.  |

### Return type

[**Room**](Room.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="updateRoom"></a>
# **updateRoom**
> Room updateRoom(roomID)

Update room by ID

Update room by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoomsApi;


RoomsApi apiInstance = new RoomsApi();
Long roomID = 789L; // Long | room ID that need to be updated
try {
    Room result = apiInstance.updateRoom(roomID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoomsApi#updateRoom");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roomID** | **Long**| room ID that need to be updated |

### Return type

[**Room**](Room.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

