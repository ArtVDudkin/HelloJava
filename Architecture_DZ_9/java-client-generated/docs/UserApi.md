# UserApi

All URIs are relative to *https://localhost:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UserApi.md#createUser) | **POST** /user/add | Create user account
[**deleteUser**](UserApi.md#deleteUser) | **DELETE** /user/{userID} | Delete user by ID
[**getUser**](UserApi.md#getUser) | **GET** /user/{userID} | Get user by ID
[**loginUser**](UserApi.md#loginUser) | **GET** /user/login | Logs user into the system
[**logoutUser**](UserApi.md#logoutUser) | **GET** /user/logout | Logs out current logged in user session
[**updateUser**](UserApi.md#updateUser) | **PUT** /user/{userID} | Update user by ID

<a name="createUser"></a>
# **createUser**
> User createUser(username, email, phone, body)

Create user account

This create a new user account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String username = "username_example"; // String | The username for create account
String email = "email_example"; // String | User email for news sending
String phone = "phone_example"; // String | User phone for authorization
User body = new User(); // User | Created user account
try {
    User result = apiInstance.createUser(username, email, phone, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#createUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The username for create account |
 **email** | **String**| User email for news sending |
 **phone** | **String**| User phone for authorization |
 **body** | [**User**](User.md)| Created user account | [optional]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="createUser"></a>
# **createUser**
> User createUser(username, email, phone, id, username2, phone2, email2, money)

Create user account

This create a new user account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String username = "username_example"; // String | The username for create account
String email = "email_example"; // String | User email for news sending
String phone = "phone_example"; // String | User phone for authorization
Long id = 789L; // Long | 
String username2 = "username_example"; // String | 
Integer phone2 = 56; // Integer | 
String email2 = "email_example"; // String | 
Integer money = 56; // Integer | 
try {
    User result = apiInstance.createUser(username, email, phone, id, username2, phone2, email2, money);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#createUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The username for create account |
 **email** | **String**| User email for news sending |
 **phone** | **String**| User phone for authorization |
 **id** | **Long**|  | [optional]
 **username2** | **String**|  | [optional]
 **phone2** | **Integer**|  | [optional]
 **email2** | **String**|  | [optional]
 **money** | **Integer**|  | [optional]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(userID)

Delete user by ID

This delete user account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Long userID = 789L; // Long | user ID that needs to be deleted
try {
    apiInstance.deleteUser(userID);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userID** | **Long**| user ID that needs to be deleted |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getUser"></a>
# **getUser**
> User getUser(userID)

Get user by ID

Get user by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Long userID = 789L; // Long | The user ID that needs to be returned
try {
    User result = apiInstance.getUser(userID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userID** | **Long**| The user ID that needs to be returned |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="loginUser"></a>
# **loginUser**
> String loginUser(username, password)

Logs user into the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String username = "username_example"; // String | The user name for login
String password = "password_example"; // String | The password for login in clear text
try {
    String result = apiInstance.loginUser(username, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#loginUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The user name for login | [optional]
 **password** | **String**| The password for login in clear text | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="logoutUser"></a>
# **logoutUser**
> logoutUser()

Logs out current logged in user session

Logs out current logged in user session

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
try {
    apiInstance.logoutUser();
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#logoutUser");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateUser"></a>
# **updateUser**
> updateUser(userID, body)

Update user by ID

This update info in user account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Long userID = 789L; // Long | user id that need to be updated
User body = new User(); // User | Update info in existing user account
try {
    apiInstance.updateUser(userID, body);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userID** | **Long**| user id that need to be updated |
 **body** | [**User**](User.md)| Update info in existing user account | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: Not defined

<a name="updateUser"></a>
# **updateUser**
> updateUser(userID, id, username, phone, email, money)

Update user by ID

This update info in user account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Long userID = 789L; // Long | user id that need to be updated
Long id = 789L; // Long | 
String username = "username_example"; // String | 
Integer phone = 56; // Integer | 
String email = "email_example"; // String | 
Integer money = 56; // Integer | 
try {
    apiInstance.updateUser(userID, id, username, phone, email, money);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userID** | **Long**| user id that need to be updated |
 **id** | **Long**|  | [optional]
 **username** | **String**|  | [optional]
 **phone** | **Integer**|  | [optional]
 **email** | **String**|  | [optional]
 **money** | **Integer**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: Not defined

