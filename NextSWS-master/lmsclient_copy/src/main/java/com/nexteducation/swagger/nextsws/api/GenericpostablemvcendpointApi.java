package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface GenericpostablemvcendpointApi {
  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @POST("pause")
  Call<Object> invokeUsingPOST();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @POST("pause.json")
  Call<Object> invokeUsingPOST1();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @POST("refresh")
  Call<Object> invokeUsingPOST2();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @POST("refresh.json")
  Call<Object> invokeUsingPOST3();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @POST("resume")
  Call<Object> invokeUsingPOST4();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @POST("resume.json")
  Call<Object> invokeUsingPOST5();
    

}
