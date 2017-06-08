package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.MGSBoardSyllabusResponse;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.MGSSyllabusNodeResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MgssyllabuscontrollerApi {
  /**
   * getBoardAndSyllabi
   * 
   * @return Call&lt;MGSBoardSyllabusResponse&gt;
   */
  
  @GET("data/getBoardsAndSyllabi")
  Call<MGSBoardSyllabusResponse> getBoardAndSyllabiUsingGET();
    

  /**
   * getContentSectionsByLesson
   * 
   * @param lessonId lessonId (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/getContentSections")
  Call<ModelAndView> getContentSectionsByLessonUsingPOST(
    @Query("lessonId") Long lessonId
  );

  /**
   * getMappedLessonsByLesson
   * 
   * @param lessonId lessonId (required)
   * @return Call&lt;String&gt;
   */
  
  @GET("data/getMappedLessonNodes")
  Call<String> getMappedLessonsByLessonUsingGET(
    @Query("lessonId") Long lessonId
  );

  /**
   * getSyllabusNode
   * 
   * @param syllabusId syllabusId (required)
   * @return Call&lt;MGSSyllabusNodeResponse&gt;
   */
  
  @POST("data/getSyllabusNode")
  Call<MGSSyllabusNodeResponse> getSyllabusNodeUsingPOST(
    @Query("syllabusId") Long syllabusId
  );

  /**
   * showSyllabus
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("manageSyllabus")
  Call<ModelAndView> showSyllabusUsingGET();
    

}
