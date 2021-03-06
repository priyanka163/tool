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

public interface MgsslidecontrollerApi {
  /**
   * getContentsByLesson
   * 
   * @param lessonId lessonId (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/getSlides")
  Call<ModelAndView> getContentsByLessonUsingPOST1(
    @Query("lessonId") Long lessonId
  );

  /**
   * showSlides
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("manageSlides")
  Call<ModelAndView> showSlidesUsingGET();
    

}
