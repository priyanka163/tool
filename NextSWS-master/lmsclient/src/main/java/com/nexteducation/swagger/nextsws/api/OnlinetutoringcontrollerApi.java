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

public interface OnlinetutoringcontrollerApi {
  /**
   * getOnlineLectures
   * 
   * @param chapterId chapterId (required)
   * @param syllabusId syllabusId (required)
   * @param category category (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param module module (optional)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("nextmentee/subject/{syllabusId}/chapter/{chapterId}/onlineTutoring.app")
  Call<ModelAndView> getOnlineLecturesUsingPOST(
    @Path("chapterId") Long chapterId, @Path("syllabusId") Long syllabusId, @Query("category") String category, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("module") String module, @Body SessionParams sessionParams
  );

}
