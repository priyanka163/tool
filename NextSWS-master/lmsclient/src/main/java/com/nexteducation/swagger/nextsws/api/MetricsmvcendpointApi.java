package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MetricsmvcendpointApi {
  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @GET("metrics")
  Call<Object> invokeUsingGET24();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @GET("metrics.json")
  Call<Object> invokeUsingGET25();
    

  /**
   * value
   * 
   * @param name name (required)
   * @return Call&lt;Object&gt;
   */
  
  @GET("metrics/{name}")
  Call<Object> valueUsingGET1(
    @Path("name") String name
  );

}
