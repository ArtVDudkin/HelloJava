/*
 * Cloud service for robot-vacuum cleaner
 * This is a study project considering server based on the OpenAPI 3.0 specification.  You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3.
 *
 * OpenAPI spec version: 0.0.2
 * Contact: kardan97@yandex.ru
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.Room;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoomsApi {
    private ApiClient apiClient;

    public RoomsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RoomsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addRoom
     * @param body Create a new room (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addRoomCall(Room body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/room";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml", "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addRoomValidateBeforeCall(Room body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addRoom(Async)");
        }
        
        com.squareup.okhttp.Call call = addRoomCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Add a new room
     * Add a new room
     * @param body Create a new room (required)
     * @return Room
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Room addRoom(Room body) throws ApiException {
        ApiResponse<Room> resp = addRoomWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Add a new room
     * Add a new room
     * @param body Create a new room (required)
     * @return ApiResponse&lt;Room&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Room> addRoomWithHttpInfo(Room body) throws ApiException {
        com.squareup.okhttp.Call call = addRoomValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<Room>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add a new room (asynchronously)
     * Add a new room
     * @param body Create a new room (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addRoomAsync(Room body, final ApiCallback<Room> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addRoomValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Room>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for addRoom
     * @param id  (required)
     * @param roomname  (required)
     * @param roomsquare  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addRoomCall(Long id, String roomname, String roomsquare, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/room";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (id != null)
        localVarFormParams.put("id", id);
        if (roomname != null)
        localVarFormParams.put("roomname", roomname);
        if (roomsquare != null)
        localVarFormParams.put("roomsquare", roomsquare);

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml", "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addRoomValidateBeforeCall(Long id, String roomname, String roomsquare, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling addRoom(Async)");
        }
        // verify the required parameter 'roomname' is set
        if (roomname == null) {
            throw new ApiException("Missing the required parameter 'roomname' when calling addRoom(Async)");
        }
        // verify the required parameter 'roomsquare' is set
        if (roomsquare == null) {
            throw new ApiException("Missing the required parameter 'roomsquare' when calling addRoom(Async)");
        }
        
        com.squareup.okhttp.Call call = addRoomCall(id, roomname, roomsquare, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Add a new room
     * Add a new room
     * @param id  (required)
     * @param roomname  (required)
     * @param roomsquare  (required)
     * @return Room
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Room addRoom(Long id, String roomname, String roomsquare) throws ApiException {
        ApiResponse<Room> resp = addRoomWithHttpInfo(id, roomname, roomsquare);
        return resp.getData();
    }

    /**
     * Add a new room
     * Add a new room
     * @param id  (required)
     * @param roomname  (required)
     * @param roomsquare  (required)
     * @return ApiResponse&lt;Room&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Room> addRoomWithHttpInfo(Long id, String roomname, String roomsquare) throws ApiException {
        com.squareup.okhttp.Call call = addRoomValidateBeforeCall(id, roomname, roomsquare, null, null);
        Type localVarReturnType = new TypeToken<Room>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add a new room (asynchronously)
     * Add a new room
     * @param id  (required)
     * @param roomname  (required)
     * @param roomsquare  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addRoomAsync(Long id, String roomname, String roomsquare, final ApiCallback<Room> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addRoomValidateBeforeCall(id, roomname, roomsquare, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Room>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteRoom
     * @param roomID The room id that needs to be deleted (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteRoomCall(Long roomID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/room/{roomID}"
            .replaceAll("\\{" + "roomID" + "\\}", apiClient.escapeString(roomID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteRoomValidateBeforeCall(Long roomID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'roomID' is set
        if (roomID == null) {
            throw new ApiException("Missing the required parameter 'roomID' when calling deleteRoom(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteRoomCall(roomID, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete room by ID
     * This delete room by ID.
     * @param roomID The room id that needs to be deleted (required)
     * @return Room
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Room deleteRoom(Long roomID) throws ApiException {
        ApiResponse<Room> resp = deleteRoomWithHttpInfo(roomID);
        return resp.getData();
    }

    /**
     * Delete room by ID
     * This delete room by ID.
     * @param roomID The room id that needs to be deleted (required)
     * @return ApiResponse&lt;Room&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Room> deleteRoomWithHttpInfo(Long roomID) throws ApiException {
        com.squareup.okhttp.Call call = deleteRoomValidateBeforeCall(roomID, null, null);
        Type localVarReturnType = new TypeToken<Room>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete room by ID (asynchronously)
     * This delete room by ID.
     * @param roomID The room id that needs to be deleted (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteRoomAsync(Long roomID, final ApiCallback<Room> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteRoomValidateBeforeCall(roomID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Room>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getRoom
     * @param roomID The name that needs to be fetched. Use user1 for testing.  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getRoomCall(Long roomID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/room/{roomID}"
            .replaceAll("\\{" + "roomID" + "\\}", apiClient.escapeString(roomID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getRoomValidateBeforeCall(Long roomID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'roomID' is set
        if (roomID == null) {
            throw new ApiException("Missing the required parameter 'roomID' when calling getRoom(Async)");
        }
        
        com.squareup.okhttp.Call call = getRoomCall(roomID, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get room by ID
     * Get room by ID
     * @param roomID The name that needs to be fetched. Use user1 for testing.  (required)
     * @return Room
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Room getRoom(Long roomID) throws ApiException {
        ApiResponse<Room> resp = getRoomWithHttpInfo(roomID);
        return resp.getData();
    }

    /**
     * Get room by ID
     * Get room by ID
     * @param roomID The name that needs to be fetched. Use user1 for testing.  (required)
     * @return ApiResponse&lt;Room&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Room> getRoomWithHttpInfo(Long roomID) throws ApiException {
        com.squareup.okhttp.Call call = getRoomValidateBeforeCall(roomID, null, null);
        Type localVarReturnType = new TypeToken<Room>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get room by ID (asynchronously)
     * Get room by ID
     * @param roomID The name that needs to be fetched. Use user1 for testing.  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRoomAsync(Long roomID, final ApiCallback<Room> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getRoomValidateBeforeCall(roomID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Room>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateRoom
     * @param roomID room ID that need to be updated (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateRoomCall(Long roomID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/room/{roomID}"
            .replaceAll("\\{" + "roomID" + "\\}", apiClient.escapeString(roomID.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateRoomValidateBeforeCall(Long roomID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'roomID' is set
        if (roomID == null) {
            throw new ApiException("Missing the required parameter 'roomID' when calling updateRoom(Async)");
        }
        
        com.squareup.okhttp.Call call = updateRoomCall(roomID, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update room by ID
     * Update room by ID
     * @param roomID room ID that need to be updated (required)
     * @return Room
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Room updateRoom(Long roomID) throws ApiException {
        ApiResponse<Room> resp = updateRoomWithHttpInfo(roomID);
        return resp.getData();
    }

    /**
     * Update room by ID
     * Update room by ID
     * @param roomID room ID that need to be updated (required)
     * @return ApiResponse&lt;Room&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Room> updateRoomWithHttpInfo(Long roomID) throws ApiException {
        com.squareup.okhttp.Call call = updateRoomValidateBeforeCall(roomID, null, null);
        Type localVarReturnType = new TypeToken<Room>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update room by ID (asynchronously)
     * Update room by ID
     * @param roomID room ID that need to be updated (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateRoomAsync(Long roomID, final ApiCallback<Room> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateRoomValidateBeforeCall(roomID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Room>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}