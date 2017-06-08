package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface HealthmvcendpointApi {
  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @DELETE("health")
  Call<Object> invokeUsingDELETE();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @DELETE("health.json")
  Call<Object> invokeUsingDELETE1();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @GET("health")
  Call<Object> invokeUsingGET20();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @GET("health.json")
  Call<Object> invokeUsingGET21();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @HEAD("health")
  Call<Object> invokeUsingHEAD();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @HEAD("health.json")
  Call<Object> invokeUsingHEAD1();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @OPTIONS("health")
  Call<Object> invokeUsingOPTIONS();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @OPTIONS("health.json")
  Call<Object> invokeUsingOPTIONS1();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @PATCH("health")
  Call<Object> invokeUsingPATCH();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @PATCH("health.json")
  Call<Object> invokeUsingPATCH1();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @POST("health")
  Call<Object> invokeUsingPOST6();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @POST("health.json")
  Call<Object> invokeUsingPOST7();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @PUT("health")
  Call<Object> invokeUsingPUT();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @PUT("health.json")
  Call<Object> invokeUsingPUT1();
    

}
