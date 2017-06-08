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

public interface MgscontentcontrollerApi {
  /**
   * deleteContent
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/deleteContent")
  Call<ModelAndView> deleteContentUsingGET();
    

  /**
   * getContentsByLesson
   * 
   * @param lessonId lessonId (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/getContents")
  Call<ModelAndView> getContentsByLessonUsingPOST(
    @Query("lessonId") Long lessonId
  );

  /**
   * showContent
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("manageContent")
  Call<ModelAndView> showContentUsingGET();
    

  /**
   * uploadContent
   * 
   * @param mGSContentSectionRequest  (optional)
   * @param oldContents  (optional)
   * @param uploads  (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  

}
