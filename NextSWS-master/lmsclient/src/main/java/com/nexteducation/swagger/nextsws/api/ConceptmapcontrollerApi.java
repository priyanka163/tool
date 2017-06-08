package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.SessionParams;
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
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/conceptmaps/{uniqueId}/conceptdetails")
  Call<ModelAndView> getConceptDetailsUsingGET(
    @Path("uniqueId") String uniqueId, @Query("chapterId") String chapterId, @Body SessionParams sessionParams
  );

  /**
   * getConceptsForChapter
   * 
   * @param chapterId chapterId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<ConceptShortResponse>&gt;
   */
  
  @GET("nextmentee/{chapterId}/conceptmaps")
  Call<List<ConceptShortResponse>> getConceptsForChapterUsingGET(
    @Path("chapterId") Long chapterId, @Body SessionParams sessionParams
  );

  /**
   * getConcepts
   * 
   * @param chapterId chapterId (optional)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/conceptmaps")
  Call<ModelAndView> getConceptsUsingGET(
    @Query("chapterId") String chapterId, @Body SessionParams sessionParams
  );

  /**
   * listDetailedConceptbyUniqueID
   * 
   * @param uniqueId uniqueId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<ConceptDetailedResponse>&gt;
   */
  
  @GET("nextmentee/conceptmaps/{uniqueId}/goconceptdetails")
  Call<List<ConceptDetailedResponse>> listDetailedConceptbyUniqueIDUsingGET(
    @Path("uniqueId") String uniqueId, @Body SessionParams sessionParams
  );

  /**
   * showMultiLevelGraph
   * 
   * @param toConceptId toConceptId (required)
   * @param level level (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/conceptmaps/{toConceptId}/conceptmapdisplay/{level}")
  Call<ModelAndView> showMultiLevelGraphUsingGET(
    @Path("toConceptId") String toConceptId, @Path("level") Long level, @Body SessionParams sessionParams
  );

}
