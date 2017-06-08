package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.MasterStudyClassDTO;
import com.nexteducation.swagger.nextsws.model.LessonPlanRO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MasterstudyclasscontrollerApi {
  /**
   * listClassSections
   * 
   * @param studyClassDTO studyClassDTO (required)
   * @return Call&lt;LessonPlanRO&gt;
   */
  
  @GET("data/listClassSections.app")
  Call<LessonPlanRO> listClassSectionsUsingGET(
    @Body MasterStudyClassDTO studyClassDTO
  );

  /**
   * listClasses
   * 
   * @param studyClassDTO studyClassDTO (required)
   * @return Call&lt;LessonPlanRO&gt;
   */
  
  @GET("data/listClasses.app")
  Call<LessonPlanRO> listClassesUsingGET(
    @Body MasterStudyClassDTO studyClassDTO
  );

}
