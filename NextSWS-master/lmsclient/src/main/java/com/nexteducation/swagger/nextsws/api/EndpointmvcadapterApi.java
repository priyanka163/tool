package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface EndpointmvcadapterApi {
  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @GET("archaius")
  Call<Object> invokeUsingGET();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @GET("archaius.json")
  Call<Object> invokeUsingGET1();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @GET("features")
  Call<Object> invokeUsingGET10();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @GET("features.json")
  Call<Object> invokeUsingGET11();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @GET("info")
  Call<Object> invokeUsingGET12();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @GET("info.json")
  Call<Object> invokeUsingGET13();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @GET("mappings")
  Call<Object> invokeUsingGET14();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @GET("mappings.json")
  Call<Object> invokeUsingGET15();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @GET("trace")
  Call<Object> invokeUsingGET16();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @GET("trace.json")
  Call<Object> invokeUsingGET17();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @GET("autoconfig")
  Call<Object> invokeUsingGET2();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @GET("autoconfig.json")
  Call<Object> invokeUsingGET3();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @GET("beans")
  Call<Object> invokeUsingGET4();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @GET("beans.json")
  Call<Object> invokeUsingGET5();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @GET("configprops")
  Call<Object> invokeUsingGET6();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @GET("configprops.json")
  Call<Object> invokeUsingGET7();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @GET("dump")
  Call<Object> invokeUsingGET8();
    

  /**
   * invoke
   * 
   * @return Call&lt;Object&gt;
   */
  
  @GET("dump.json")
  Call<Object> invokeUsingGET9();
    

}
