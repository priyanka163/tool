package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface HeapdumpmvcendpointApi {
  /**
   * invoke
   * 
   * @param live live (optional, default to true)
   * @return Call&lt;Void&gt;
   */
  
  @GET("heapdump")
  Call<Void> invokeUsingGET22(
    @Query("live") Boolean live
  );

  /**
   * invoke
   * 
   * @param live live (optional, default to true)
   * @return Call&lt;Void&gt;
   */
  
  @GET("heapdump.json")
  Call<Void> invokeUsingGET23(
    @Query("live") Boolean live
  );

}
