package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface FiledownloadcontrollerApi {
  /**
   * getAnnotationsSwf
   * 
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/Annotations.app")
  Call<Void> getAnnotationsSwfUsingGET();
    

  /**
   * getSchoolNextSwf
   * 
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/SchoolNext.app")
  Call<Void> getSchoolNextSwfUsingGET();
    

  /**
   * getSessionId
   * 
   * @param UCID UCID (required)
   * @return Call&lt;Void&gt;
   */
  
  @GET("lnonline/container/getSession.app")
  Call<Void> getSessionIdUsingGET(
    @Query("UCID") String UCID
  );

  /**
   * hideModuleInfo
   * 
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/hideModuleInfo.app")
  Call<Void> hideModuleInfoUsingGET();
    

  /**
   * installInfo
   * 
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/school/installInfo.app")
  Call<Void> installInfoUsingGET();
    

  /**
   * loadGenericProfile
   * 
   * @return Call&lt;Void&gt;
   */
  
  @GET("client/loadGenericProfile.app")
  Call<Void> loadGenericProfileUsingGET();
    

  /**
   * serveSWFHeader
   * 
   * @param contentId contentId (required)
   * @return Call&lt;Void&gt;
   */
  
  @GET("lnonline/digest/{contentId}")
  Call<Void> serveSWFHeaderUsingGET(
    @Path("contentId") Long contentId
  );

  /**
   * serveSWFWithoutHeader
   * 
   * @param contentId contentId (required)
   * @return Call&lt;Void&gt;
   */
  
  @GET("lnonline/playerContent/{contentId}")
  Call<Void> serveSWFWithoutHeaderUsingGET(
    @Path("contentId") Long contentId
  );

}
