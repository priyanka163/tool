package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.ConceptShortResponse;
import com.nexteducation.swagger.nextsws.model.ConceptDetailedResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ConceptmapcontrollerApi {
  /**
   * getConceptDetails
   * 
   * @param uniqueId uniqueId (required)
   * @param chapterId chapterId (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/conceptmaps/{uniqueId}/conceptdetails")
  Call<ModelAndView> getConceptDetailsUsingGET(
    @Path("uniqueId") String uniqueId, @Query("chapterId") String chapterId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getConceptsForChapter
   * 
   * @param chapterId chapterId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<ConceptShortResponse>&gt;
   */
  
  @GET("nextmentee/{chapterId}/conceptmaps")
  Call<List<ConceptShortResponse>> getConceptsForChapterUsingGET(
    @Path("chapterId") Long chapterId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getConcepts
   * 
   * @param chapterId chapterId (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/conceptmaps")
  Call<ModelAndView> getConceptsUsingGET(
    @Query("chapterId") String chapterId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * listDetailedConceptbyUniqueID
   * 
   * @param uniqueId uniqueId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<ConceptDetailedResponse>&gt;
   */
  
  @GET("nextmentee/conceptmaps/{uniqueId}/goconceptdetails")
  Call<List<ConceptDetailedResponse>> listDetailedConceptbyUniqueIDUsingGET(
    @Path("uniqueId") String uniqueId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * showMultiLevelGraph
   * 
   * @param toConceptId toConceptId (required)
   * @param level level (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/conceptmaps/{toConceptId}/conceptmapdisplay/{level}")
  Call<ModelAndView> showMultiLevelGraphUsingGET(
    @Path("toConceptId") String toConceptId, @Path("level") Long level, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

}
