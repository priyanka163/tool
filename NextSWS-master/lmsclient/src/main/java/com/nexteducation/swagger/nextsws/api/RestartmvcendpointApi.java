package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface RestartmvcendpointApi {
  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @POST("restart")
  Call<Object> invokeUsingPOST8();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @POST("restart.json")
  Call<Object> invokeUsingPOST9();
    

}
