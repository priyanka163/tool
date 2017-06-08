package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.WikiDTO;
import com.nexteducation.swagger.nextsws.model.WikiPageDetailResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface WikitwscontrollerApi {
  /**
   * createWiki
   * 
   * @param wikiDTO wikiDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @DELETE("data/createWiki")
  Call<Object> createWikiUsingDELETE(
    @Body WikiDTO wikiDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * createWiki
   * 
   * @param wikiDTO wikiDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/createWiki")
  Call<Object> createWikiUsingGET(
    @Body WikiDTO wikiDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * createWiki
   * 
   * @param wikiDTO wikiDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @HEAD("data/createWiki")
  Call<Object> createWikiUsingHEAD(
    @Body WikiDTO wikiDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * createWiki
   * 
   * @param wikiDTO wikiDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @OPTIONS("data/createWiki")
  Call<Object> createWikiUsingOPTIONS(
    @Body WikiDTO wikiDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * createWiki
   * 
   * @param wikiDTO wikiDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @PATCH("data/createWiki")
  Call<Object> createWikiUsingPATCH(
    @Body WikiDTO wikiDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * createWiki
   * 
   * @param wikiDTO wikiDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/createWiki")
  Call<Object> createWikiUsingPOST(
    @Body WikiDTO wikiDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * createWiki
   * 
   * @param wikiDTO wikiDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @PUT("data/createWiki")
  Call<Object> createWikiUsingPUT(
    @Body WikiDTO wikiDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchWikiForLesson
   * 
   * @param currentSylId currentSylId (required)
   * @param studyClassId studyClassId (required)
   * @param currentChapterId currentChapterId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @DELETE("data/fetchWikiForLesson/{currentSylId}/{studyClassId}/{currentChapterId}/{sectionId}")
  Call<Object> fetchWikiForLessonUsingDELETE(
    @Path("currentSylId") Long currentSylId, @Path("studyClassId") Long studyClassId, @Path("currentChapterId") Long currentChapterId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchWikiForLesson
   * 
   * @param currentSylId currentSylId (required)
   * @param studyClassId studyClassId (required)
   * @param currentChapterId currentChapterId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/fetchWikiForLesson/{currentSylId}/{studyClassId}/{currentChapterId}/{sectionId}")
  Call<Object> fetchWikiForLessonUsingGET(
    @Path("currentSylId") Long currentSylId, @Path("studyClassId") Long studyClassId, @Path("currentChapterId") Long currentChapterId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchWikiForLesson
   * 
   * @param currentSylId currentSylId (required)
   * @param studyClassId studyClassId (required)
   * @param currentChapterId currentChapterId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @HEAD("data/fetchWikiForLesson/{currentSylId}/{studyClassId}/{currentChapterId}/{sectionId}")
  Call<Object> fetchWikiForLessonUsingHEAD(
    @Path("currentSylId") Long currentSylId, @Path("studyClassId") Long studyClassId, @Path("currentChapterId") Long currentChapterId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchWikiForLesson
   * 
   * @param currentSylId currentSylId (required)
   * @param studyClassId studyClassId (required)
   * @param currentChapterId currentChapterId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @OPTIONS("data/fetchWikiForLesson/{currentSylId}/{studyClassId}/{currentChapterId}/{sectionId}")
  Call<Object> fetchWikiForLessonUsingOPTIONS(
    @Path("currentSylId") Long currentSylId, @Path("studyClassId") Long studyClassId, @Path("currentChapterId") Long currentChapterId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchWikiForLesson
   * 
   * @param currentSylId currentSylId (required)
   * @param studyClassId studyClassId (required)
   * @param currentChapterId currentChapterId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @PATCH("data/fetchWikiForLesson/{currentSylId}/{studyClassId}/{currentChapterId}/{sectionId}")
  Call<Object> fetchWikiForLessonUsingPATCH(
    @Path("currentSylId") Long currentSylId, @Path("studyClassId") Long studyClassId, @Path("currentChapterId") Long currentChapterId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchWikiForLesson
   * 
   * @param currentSylId currentSylId (required)
   * @param studyClassId studyClassId (required)
   * @param currentChapterId currentChapterId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/fetchWikiForLesson/{currentSylId}/{studyClassId}/{currentChapterId}/{sectionId}")
  Call<Object> fetchWikiForLessonUsingPOST(
    @Path("currentSylId") Long currentSylId, @Path("studyClassId") Long studyClassId, @Path("currentChapterId") Long currentChapterId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchWikiForLesson
   * 
   * @param currentSylId currentSylId (required)
   * @param studyClassId studyClassId (required)
   * @param currentChapterId currentChapterId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @PUT("data/fetchWikiForLesson/{currentSylId}/{studyClassId}/{currentChapterId}/{sectionId}")
  Call<Object> fetchWikiForLessonUsingPUT(
    @Path("currentSylId") Long currentSylId, @Path("studyClassId") Long studyClassId, @Path("currentChapterId") Long currentChapterId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getWikiDetails
   * 
   * @param wikiUuid wikiUuid (required)
   * @param editMode editMode (required)
   * @return Call&lt;WikiPageDetailResponse&gt;
   */
  
  @DELETE("data/fetchWikidetails/{wikiUuid}/{editMode}")
  Call<WikiPageDetailResponse> getWikiDetailsUsingDELETE(
    @Path("wikiUuid") String wikiUuid, @Path("editMode") Boolean editMode
  );

  /**
   * getWikiDetails
   * 
   * @param wikiUuid wikiUuid (required)
   * @param editMode editMode (required)
   * @return Call&lt;WikiPageDetailResponse&gt;
   */
  
  @GET("data/fetchWikidetails/{wikiUuid}/{editMode}")
  Call<WikiPageDetailResponse> getWikiDetailsUsingGET(
    @Path("wikiUuid") String wikiUuid, @Path("editMode") Boolean editMode
  );

  /**
   * getWikiDetails
   * 
   * @param wikiUuid wikiUuid (required)
   * @param editMode editMode (required)
   * @return Call&lt;WikiPageDetailResponse&gt;
   */
  
  @HEAD("data/fetchWikidetails/{wikiUuid}/{editMode}")
  Call<WikiPageDetailResponse> getWikiDetailsUsingHEAD(
    @Path("wikiUuid") String wikiUuid, @Path("editMode") Boolean editMode
  );

  /**
   * getWikiDetails
   * 
   * @param wikiUuid wikiUuid (required)
   * @param editMode editMode (required)
   * @return Call&lt;WikiPageDetailResponse&gt;
   */
  
  @OPTIONS("data/fetchWikidetails/{wikiUuid}/{editMode}")
  Call<WikiPageDetailResponse> getWikiDetailsUsingOPTIONS(
    @Path("wikiUuid") String wikiUuid, @Path("editMode") Boolean editMode
  );

  /**
   * getWikiDetails
   * 
   * @param wikiUuid wikiUuid (required)
   * @param editMode editMode (required)
   * @return Call&lt;WikiPageDetailResponse&gt;
   */
  
  @PATCH("data/fetchWikidetails/{wikiUuid}/{editMode}")
  Call<WikiPageDetailResponse> getWikiDetailsUsingPATCH(
    @Path("wikiUuid") String wikiUuid, @Path("editMode") Boolean editMode
  );

  /**
   * getWikiDetails
   * 
   * @param wikiUuid wikiUuid (required)
   * @param editMode editMode (required)
   * @return Call&lt;WikiPageDetailResponse&gt;
   */
  
  @POST("data/fetchWikidetails/{wikiUuid}/{editMode}")
  Call<WikiPageDetailResponse> getWikiDetailsUsingPOST(
    @Path("wikiUuid") String wikiUuid, @Path("editMode") Boolean editMode
  );

  /**
   * getWikiDetails
   * 
   * @param wikiUuid wikiUuid (required)
   * @param editMode editMode (required)
   * @return Call&lt;WikiPageDetailResponse&gt;
   */
  
  @PUT("data/fetchWikidetails/{wikiUuid}/{editMode}")
  Call<WikiPageDetailResponse> getWikiDetailsUsingPUT(
    @Path("wikiUuid") String wikiUuid, @Path("editMode") Boolean editMode
  );

}
