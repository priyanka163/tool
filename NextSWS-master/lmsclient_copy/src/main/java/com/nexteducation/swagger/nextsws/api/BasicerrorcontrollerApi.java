package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BasicerrorcontrollerApi {
  /**
   * error
   * 
   * @return Call&lt;Map<String, Object>&gt;
   */
  
  @DELETE("error")
  Call<Map<String, Object>> errorUsingDELETE();
    

  /**
   * error
   * 
   * @return Call&lt;Map<String, Object>&gt;
   */
  
  @GET("error")
  Call<Map<String, Object>> errorUsingGET();
    

  /**
   * error
   * 
   * @return Call&lt;Map<String, Object>&gt;
   */
  
  @HEAD("error")
  Call<Map<String, Object>> errorUsingHEAD();
    

  /**
   * error
   * 
   * @return Call&lt;Map<String, Object>&gt;
   */
  
  @OPTIONS("error")
  Call<Map<String, Object>> errorUsingOPTIONS();
    

  /**
   * error
   * 
   * @return Call&lt;Map<String, Object>&gt;
   */
  
  @PATCH("error")
  Call<Map<String, Object>> errorUsingPATCH();
    

  /**
   * error
   * 
   * @return Call&lt;Map<String, Object>&gt;
   */
  
  @POST("error")
  Call<Map<String, Object>> errorUsingPOST();
    

  /**
   * error
   * 
   * @return Call&lt;Map<String, Object>&gt;
   */
  
  @PUT("error")
  Call<Map<String, Object>> errorUsingPUT();
    

}
