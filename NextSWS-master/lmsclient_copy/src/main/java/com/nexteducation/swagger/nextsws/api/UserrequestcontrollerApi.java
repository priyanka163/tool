package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserrequestcontrollerApi {
  /**
   * getClient
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("data/client.app")
  Call<ModelAndView> getClientUsingDELETE();
    

  /**
   * getClient
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/client.app")
  Call<ModelAndView> getClientUsingGET();
    

  /**
   * getClient
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("data/client.app")
  Call<ModelAndView> getClientUsingHEAD();
    

  /**
   * getClient
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("data/client.app")
  Call<ModelAndView> getClientUsingOPTIONS();
    

  /**
   * getClient
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("data/client.app")
  Call<ModelAndView> getClientUsingPATCH();
    

  /**
   * getClient
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/client.app")
  Call<ModelAndView> getClientUsingPOST();
    

  /**
   * getClient
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("data/client.app")
  Call<ModelAndView> getClientUsingPUT();
    

}
