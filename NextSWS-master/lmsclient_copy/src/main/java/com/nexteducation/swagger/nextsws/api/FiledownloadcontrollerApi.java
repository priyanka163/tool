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
  
  @DELETE("data/Annotations.app")
  Call<Void> getAnnotationsSwfUsingDELETE();
    

  /**
   * getAnnotationsSwf
   * 
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/Annotations.app")
  Call<Void> getAnnotationsSwfUsingGET();
    

  /**
   * getAnnotationsSwf
   * 
   * @return Call&lt;Void&gt;
   */
  
  @HEAD("data/Annotations.app")
  Call<Void> getAnnotationsSwfUsingHEAD();
    

  /**
   * getAnnotationsSwf
   * 
   * @return Call&lt;Void&gt;
   */
  
  @OPTIONS("data/Annotations.app")
  Call<Void> getAnnotationsSwfUsingOPTIONS();
    

  /**
   * getAnnotationsSwf
   * 
   * @return Call&lt;Void&gt;
   */
  
  @PATCH("data/Annotations.app")
  Call<Void> getAnnotationsSwfUsingPATCH();
    

  /**
   * getAnnotationsSwf
   * 
   * @return Call&lt;Void&gt;
   */
  
  @POST("data/Annotations.app")
  Call<Void> getAnnotationsSwfUsingPOST();
    

  /**
   * getAnnotationsSwf
   * 
   * @return Call&lt;Void&gt;
   */
  
  @PUT("data/Annotations.app")
  Call<Void> getAnnotationsSwfUsingPUT();
    

  /**
   * getSchoolNextSwf
   * 
   * @return Call&lt;Void&gt;
   */
  
  @DELETE("data/SchoolNext.app")
  Call<Void> getSchoolNextSwfUsingDELETE();
    

  /**
   * getSchoolNextSwf
   * 
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/SchoolNext.app")
  Call<Void> getSchoolNextSwfUsingGET();
    

  /**
   * getSchoolNextSwf
   * 
   * @return Call&lt;Void&gt;
   */
  
  @HEAD("data/SchoolNext.app")
  Call<Void> getSchoolNextSwfUsingHEAD();
    

  /**
   * getSchoolNextSwf
   * 
   * @return Call&lt;Void&gt;
   */
  
  @OPTIONS("data/SchoolNext.app")
  Call<Void> getSchoolNextSwfUsingOPTIONS();
    

  /**
   * getSchoolNextSwf
   * 
   * @return Call&lt;Void&gt;
   */
  
  @PATCH("data/SchoolNext.app")
  Call<Void> getSchoolNextSwfUsingPATCH();
    

  /**
   * getSchoolNextSwf
   * 
   * @return Call&lt;Void&gt;
   */
  
  @POST("data/SchoolNext.app")
  Call<Void> getSchoolNextSwfUsingPOST();
    

  /**
   * getSchoolNextSwf
   * 
   * @return Call&lt;Void&gt;
   */
  
  @PUT("data/SchoolNext.app")
  Call<Void> getSchoolNextSwfUsingPUT();
    

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
  
  @DELETE("data/hideModuleInfo.app")
  Call<Void> hideModuleInfoUsingDELETE();
    

  /**
   * hideModuleInfo
   * 
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/hideModuleInfo.app")
  Call<Void> hideModuleInfoUsingGET();
    

  /**
   * hideModuleInfo
   * 
   * @return Call&lt;Void&gt;
   */
  
  @HEAD("data/hideModuleInfo.app")
  Call<Void> hideModuleInfoUsingHEAD();
    

  /**
   * hideModuleInfo
   * 
   * @return Call&lt;Void&gt;
   */
  
  @OPTIONS("data/hideModuleInfo.app")
  Call<Void> hideModuleInfoUsingOPTIONS();
    

  /**
   * hideModuleInfo
   * 
   * @return Call&lt;Void&gt;
   */
  
  @PATCH("data/hideModuleInfo.app")
  Call<Void> hideModuleInfoUsingPATCH();
    

  /**
   * hideModuleInfo
   * 
   * @return Call&lt;Void&gt;
   */
  
  @POST("data/hideModuleInfo.app")
  Call<Void> hideModuleInfoUsingPOST();
    

  /**
   * hideModuleInfo
   * 
   * @return Call&lt;Void&gt;
   */
  
  @PUT("data/hideModuleInfo.app")
  Call<Void> hideModuleInfoUsingPUT();
    

  /**
   * installInfo
   * 
   * @return Call&lt;Void&gt;
   */
  
  @DELETE("data/school/installInfo.app")
  Call<Void> installInfoUsingDELETE();
    

  /**
   * installInfo
   * 
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/school/installInfo.app")
  Call<Void> installInfoUsingGET();
    

  /**
   * installInfo
   * 
   * @return Call&lt;Void&gt;
   */
  
  @HEAD("data/school/installInfo.app")
  Call<Void> installInfoUsingHEAD();
    

  /**
   * installInfo
   * 
   * @return Call&lt;Void&gt;
   */
  
  @OPTIONS("data/school/installInfo.app")
  Call<Void> installInfoUsingOPTIONS();
    

  /**
   * installInfo
   * 
   * @return Call&lt;Void&gt;
   */
  
  @PATCH("data/school/installInfo.app")
  Call<Void> installInfoUsingPATCH();
    

  /**
   * installInfo
   * 
   * @return Call&lt;Void&gt;
   */
  
  @POST("data/school/installInfo.app")
  Call<Void> installInfoUsingPOST();
    

  /**
   * installInfo
   * 
   * @return Call&lt;Void&gt;
   */
  
  @PUT("data/school/installInfo.app")
  Call<Void> installInfoUsingPUT();
    

  /**
   * loadGenericProfile
   * 
   * @return Call&lt;Void&gt;
   */
  
  @DELETE("client/loadGenericProfile.app")
  Call<Void> loadGenericProfileUsingDELETE();
    

  /**
   * loadGenericProfile
   * 
   * @return Call&lt;Void&gt;
   */
  
  @GET("client/loadGenericProfile.app")
  Call<Void> loadGenericProfileUsingGET();
    

  /**
   * loadGenericProfile
   * 
   * @return Call&lt;Void&gt;
   */
  
  @HEAD("client/loadGenericProfile.app")
  Call<Void> loadGenericProfileUsingHEAD();
    

  /**
   * loadGenericProfile
   * 
   * @return Call&lt;Void&gt;
   */
  
  @OPTIONS("client/loadGenericProfile.app")
  Call<Void> loadGenericProfileUsingOPTIONS();
    

  /**
   * loadGenericProfile
   * 
   * @return Call&lt;Void&gt;
   */
  
  @PATCH("client/loadGenericProfile.app")
  Call<Void> loadGenericProfileUsingPATCH();
    

  /**
   * loadGenericProfile
   * 
   * @return Call&lt;Void&gt;
   */
  
  @POST("client/loadGenericProfile.app")
  Call<Void> loadGenericProfileUsingPOST();
    

  /**
   * loadGenericProfile
   * 
   * @return Call&lt;Void&gt;
   */
  
  @PUT("client/loadGenericProfile.app")
  Call<Void> loadGenericProfileUsingPUT();
    

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
