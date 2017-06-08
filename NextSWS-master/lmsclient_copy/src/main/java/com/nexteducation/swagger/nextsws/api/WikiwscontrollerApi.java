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

public interface WikiwscontrollerApi {
  /**
   * getChapterWiki
   * 
   * @param chapterId chapterId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/wiki/chapter/{chapterId}/get")
  Call<Object> getChapterWikiUsingGET(
    @Path("chapterId") String chapterId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChapterWiseSyllabusWiki
   * 
   * @param syllabusId syllabusId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/wiki/syllabus/{syllabusId}/chapterWise/get")
  Call<Object> getChapterWiseSyllabusWikiUsingGET(
    @Path("syllabusId") String syllabusId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getDetailWikiPage
   * 
   * @param wikiId wikiId (required)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/wiki/detail/get/{wikiId}")
  Call<Object> getDetailWikiPageUsingGET(
    @Path("wikiId") String wikiId
  );

  /**
   * getSyllabusWiki
   * 
   * @param syllabusId syllabusId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/wiki/syllabus/{syllabusId}/get")
  Call<Object> getSyllabusWikiUsingGET(
    @Path("syllabusId") String syllabusId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getWikiPage
   * 
   * @param wikiId wikiId (required)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/wiki/get/{wikiId}")
  Call<Object> getWikiPageUsingGET1(
    @Path("wikiId") String wikiId
  );

  /**
   * lessonWikiDetails
   * 
   * @param lessonId lessonId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/wiki/lesson/{lessonId}")
  Call<ModelAndView> lessonWikiDetailsUsingGET(
    @Path("lessonId") String lessonId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showWikiCategories
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("wikiCategory")
  Call<ModelAndView> showWikiCategoriesUsingDELETE();
    

  /**
   * showWikiCategories
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("wikiCategory")
  Call<ModelAndView> showWikiCategoriesUsingGET();
    

  /**
   * showWikiCategories
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("wikiCategory")
  Call<ModelAndView> showWikiCategoriesUsingHEAD();
    

  /**
   * showWikiCategories
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("wikiCategory")
  Call<ModelAndView> showWikiCategoriesUsingOPTIONS();
    

  /**
   * showWikiCategories
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("wikiCategory")
  Call<ModelAndView> showWikiCategoriesUsingPATCH();
    

  /**
   * showWikiCategories
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("wikiCategory")
  Call<ModelAndView> showWikiCategoriesUsingPOST();
    

  /**
   * showWikiCategories
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("wikiCategory")
  Call<ModelAndView> showWikiCategoriesUsingPUT();
    

  /**
   * wikiDetailsByResource
   * 
   * @param resourceUUID resourceUUID (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/wiki/resource/{resourceUUID}")
  Call<ModelAndView> wikiDetailsByResourceUsingGET(
    @Path("resourceUUID") String resourceUUID
  );

  /**
   * wikiDetails
   * 
   * @param wikiUUID wikiUUID (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/wiki/{wikiUUID}")
  Call<ModelAndView> wikiDetailsUsingGET(
    @Path("wikiUUID") String wikiUUID
  );

}
