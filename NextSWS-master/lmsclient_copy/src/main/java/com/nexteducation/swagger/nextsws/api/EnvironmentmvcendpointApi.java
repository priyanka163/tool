package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface EnvironmentmvcendpointApi {
  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @GET("env")
  Call<Object> invokeUsingGET18();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @GET("env.json")
  Call<Object> invokeUsingGET19();
    

  /**
   * value
   * 
   * @param name name (required)
   * @return Call&lt;Object&gt;
   */
  
  @GET("env/{name}")
  Call<Object> valueUsingGET(
    @Path("name") String name
  );

}
