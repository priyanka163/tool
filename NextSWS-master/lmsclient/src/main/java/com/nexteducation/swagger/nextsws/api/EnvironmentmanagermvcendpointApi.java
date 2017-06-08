package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface EnvironmentmanagermvcendpointApi {
  /**
   * reset
   * 
   * @return Call&lt;Object&gt;
   */
  
  @POST("env/reset")
  Call<Object> resetUsingPOST();
    

  /**
   * value
   * 
   * @param params params (required)
   * @return Call&lt;Object&gt;
   */
  
  @POST("env")
  Call<Object> valueUsingPOST(
    @Query("params") Object params
  );

}
