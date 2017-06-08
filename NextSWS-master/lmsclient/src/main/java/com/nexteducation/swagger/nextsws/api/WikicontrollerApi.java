package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.SessionParams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface WikicontrollerApi {
  /**
   * fetchWikiChapterDetails
   * 
   * @param syllabusId syllabusId (required)
   * @param level level (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional, default to false)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/wiki/syllabus/{syllabusId}")
  Call<ModelAndView> fetchWikiChapterDetailsUsingGET(
    @Path("syllabusId") Long syllabusId, @Query("level") Integer level, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Body SessionParams sessionParams
  );

  /**
   * fetchWikiLessonDetails
   * 
   * @param chapterId chapterId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/wiki/chapter/{chapterId}")
  Call<ModelAndView> fetchWikiLessonDetailsUsingGET(
    @Path("chapterId") Long chapterId, @Body SessionParams sessionParams
  );

  /**
   * wikiHome
   * 
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("wiki")
  Call<ModelAndView> wikiHomeUsingGET(
    @Body SessionParams sessionParams
  );

}
