package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MdcnotificationcontrollerApi {
  /**
   * getNotificationObjectBasedOnId
   * 
   * @param notificationMessageId notificationMessageId (required)
   * @return Call&lt;String&gt;
   */
  
  @GET("data/workspace/notification/{notificationMessageId}/notificationMessage")
  Call<String> getNotificationObjectBasedOnIdUsingGET(
    @Path("notificationMessageId") String notificationMessageId
  );

  /**
   * getNotificationObjectBasedOnUserId
   * 
   * @param userId userId (required)
   * @return Call&lt;List<Object>&gt;
   */
  
  @GET("data/workspace/user/{userId}/notificationMessages")
  Call<List<Object>> getNotificationObjectBasedOnUserIdUsingGET(
    @Path("userId") String userId
  );

}
