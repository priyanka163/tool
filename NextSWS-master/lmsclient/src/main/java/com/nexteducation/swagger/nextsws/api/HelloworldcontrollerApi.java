package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface HelloworldcontrollerApi {
  /**
   * sayHello
   * 
   * @return Call&lt;String&gt;
   */
  
  @DELETE("hello")
  Call<String> sayHelloUsingDELETE();
    

  /**
   * sayHello
   * 
   * @return Call&lt;String&gt;
   */
  
  @GET("hello")
  Call<String> sayHelloUsingGET();
    

  /**
   * sayHello
   * 
   * @return Call&lt;String&gt;
   */
  
  @HEAD("hello")
  Call<String> sayHelloUsingHEAD();
    

  /**
   * sayHello
   * 
   * @return Call&lt;String&gt;
   */
  
  @OPTIONS("hello")
  Call<String> sayHelloUsingOPTIONS();
    

  /**
   * sayHello
   * 
   * @return Call&lt;String&gt;
   */
  
  @PATCH("hello")
  Call<String> sayHelloUsingPATCH();
    

  /**
   * sayHello
   * 
   * @return Call&lt;String&gt;
   */
  
  @POST("hello")
  Call<String> sayHelloUsingPOST();
    

  /**
   * sayHello
   * 
   * @return Call&lt;String&gt;
   */
  
  @PUT("hello")
  Call<String> sayHelloUsingPUT();
    

}
