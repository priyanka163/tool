package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SearchcontrollerApi {
  /**
   * search
   * 
   * @return Call&lt;Void&gt;
   */
  
  @DELETE("data/serverSearch.app")
  Call<Void> searchUsingDELETE();
    

  /**
   * search
   * 
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/serverSearch.app")
  Call<Void> searchUsingGET();
    

  /**
   * search
   * 
   * @return Call&lt;Void&gt;
   */
  
  @HEAD("data/serverSearch.app")
  Call<Void> searchUsingHEAD();
    

  /**
   * search
   * 
   * @return Call&lt;Void&gt;
   */
  
  @OPTIONS("data/serverSearch.app")
  Call<Void> searchUsingOPTIONS();
    

  /**
   * search
   * 
   * @return Call&lt;Void&gt;
   */
  
  @PATCH("data/serverSearch.app")
  Call<Void> searchUsingPATCH();
    

  /**
   * search
   * 
   * @return Call&lt;Void&gt;
   */
  
  @POST("data/serverSearch.app")
  Call<Void> searchUsingPOST();
    

  /**
   * search
   * 
   * @return Call&lt;Void&gt;
   */
  
  @PUT("data/serverSearch.app")
  Call<Void> searchUsingPUT();
    

}
