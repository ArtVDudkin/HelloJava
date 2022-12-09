# RobotApi

All URIs are relative to *https://petstore3.swagger.io/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRobot**](RobotApi.md#addRobot) | **POST** /robot/add | Add a new robot to user account
[**checkStatus**](RobotApi.md#checkStatus) | **GET** /robot/{robotId}/checkStatus | Check a current Robot status
[**checkUpdate**](RobotApi.md#checkUpdate) | **GET** /robot/{robotId}/checkUpdate | Check a new firmware update for Robot
[**deleteRobot**](RobotApi.md#deleteRobot) | **DELETE** /robot/{robotId} | Delete a robot by ID
[**downloadFile**](RobotApi.md#downloadFile) | **GET** /robot/{robotId}/downloadUpdate | Downloads a new firmware update
[**getRobot**](RobotApi.md#getRobot) | **GET** /robot/{robotId} | Get robot by ID
[**updateRobot**](RobotApi.md#updateRobot) | **PUT** /robot/{robotId} | Update info about an existing robot

<a name="addRobot"></a>
# **addRobot**
> Robot addRobot(body)

Add a new robot to user account

Add a new robot to user account

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RobotApi;


RobotApi apiInstance = new RobotApi();
Robot body = new Robot(); // Robot | Add a new robot to user account
try {
    Robot result = apiInstance.addRobot(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RobotApi#addRobot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Robot**](Robot.md)| Add a new robot to user account |

### Return type

[**Robot**](Robot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="addRobot"></a>
# **addRobot**
> Robot addRobot(id, serialNo, model, firmware, config, diadnostic, historyClean, status)

Add a new robot to user account

Add a new robot to user account

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RobotApi;


RobotApi apiInstance = new RobotApi();
Long id = 789L; // Long | 
String serialNo = "serialNo_example"; // String | 
Model model = new Model(); // Model | 
String firmware = "firmware_example"; // String | 
List<String> config = Arrays.asList("config_example"); // List<String> | 
List<Integer> diadnostic = Arrays.asList(56); // List<Integer> | 
Statistic historyClean = new Statistic(); // Statistic | 
String status = "status_example"; // String | 
try {
    Robot result = apiInstance.addRobot(id, serialNo, model, firmware, config, diadnostic, historyClean, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RobotApi#addRobot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **serialNo** | **String**|  |
 **model** | [**Model**](.md)|  |
 **firmware** | **String**|  |
 **config** | [**List&lt;String&gt;**](String.md)|  |
 **diadnostic** | [**List&lt;Integer&gt;**](Integer.md)|  |
 **historyClean** | [**Statistic**](.md)|  |
 **status** | **String**|  | [enum: ready, charging, working]

### Return type

[**Robot**](Robot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="checkStatus"></a>
# **checkStatus**
> Robot checkStatus(robotId)

Check a current Robot status

Check a current Robot status

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RobotApi;


RobotApi apiInstance = new RobotApi();
Long robotId = 789L; // Long | Robot id to delete
try {
    Robot result = apiInstance.checkStatus(robotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RobotApi#checkStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **robotId** | **Long**| Robot id to delete |

### Return type

[**Robot**](Robot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="checkUpdate"></a>
# **checkUpdate**
> Firmware checkUpdate(robotId)

Check a new firmware update for Robot

Check a new firmware update for Robot

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RobotApi;


RobotApi apiInstance = new RobotApi();
Long robotId = 789L; // Long | Robot id to delete
try {
    Firmware result = apiInstance.checkUpdate(robotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RobotApi#checkUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **robotId** | **Long**| Robot id to delete |

### Return type

[**Firmware**](Firmware.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="deleteRobot"></a>
# **deleteRobot**
> Robot deleteRobot(robotId)

Delete a robot by ID

delete a robot by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RobotApi;


RobotApi apiInstance = new RobotApi();
Long robotId = 789L; // Long | Robot id to delete
try {
    Robot result = apiInstance.deleteRobot(robotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RobotApi#deleteRobot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **robotId** | **Long**| Robot id to delete |

### Return type

[**Robot**](Robot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="downloadFile"></a>
# **downloadFile**
> ModelApiResponse downloadFile(robotId)

Downloads a new firmware update

Downloads a new firmware update

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RobotApi;


RobotApi apiInstance = new RobotApi();
Long robotId = 789L; // Long | ID of pet to update
try {
    ModelApiResponse result = apiInstance.downloadFile(robotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RobotApi#downloadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **robotId** | **Long**| ID of pet to update |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRobot"></a>
# **getRobot**
> Robot getRobot(robotId)

Get robot by ID

Get robot by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RobotApi;


RobotApi apiInstance = new RobotApi();
Long robotId = 789L; // Long | ID of robot to return
try {
    Robot result = apiInstance.getRobot(robotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RobotApi#getRobot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **robotId** | **Long**| ID of robot to return |

### Return type

[**Robot**](Robot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="updateRobot"></a>
# **updateRobot**
> Robot updateRobot(body, robotId)

Update info about an existing robot

Update info about an existing robot by Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RobotApi;


RobotApi apiInstance = new RobotApi();
Robot body = new Robot(); // Robot | Update an existent robot in the store
Long robotId = 789L; // Long | ID of robot to return
try {
    Robot result = apiInstance.updateRobot(body, robotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RobotApi#updateRobot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Robot**](Robot.md)| Update an existent robot in the store |
 **robotId** | **Long**| ID of robot to return |

### Return type

[**Robot**](Robot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

<a name="updateRobot"></a>
# **updateRobot**
> Robot updateRobot(id, serialNo, model, firmware, config, diadnostic, historyClean, status, robotId)

Update info about an existing robot

Update info about an existing robot by Id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RobotApi;


RobotApi apiInstance = new RobotApi();
Long id = 789L; // Long | 
String serialNo = "serialNo_example"; // String | 
Model model = new Model(); // Model | 
String firmware = "firmware_example"; // String | 
List<String> config = Arrays.asList("config_example"); // List<String> | 
List<Integer> diadnostic = Arrays.asList(56); // List<Integer> | 
Statistic historyClean = new Statistic(); // Statistic | 
String status = "status_example"; // String | 
Long robotId = 789L; // Long | ID of robot to return
try {
    Robot result = apiInstance.updateRobot(id, serialNo, model, firmware, config, diadnostic, historyClean, status, robotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RobotApi#updateRobot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **serialNo** | **String**|  |
 **model** | [**Model**](.md)|  |
 **firmware** | **String**|  |
 **config** | [**List&lt;String&gt;**](String.md)|  |
 **diadnostic** | [**List&lt;Integer&gt;**](Integer.md)|  |
 **historyClean** | [**Statistic**](.md)|  |
 **status** | **String**|  | [enum: ready, charging, working]
 **robotId** | **Long**| ID of robot to return |

### Return type

[**Robot**](Robot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, application/xml

