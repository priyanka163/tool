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
  
  @DELETE("data/listClassSections.app")
  Call<LessonPlanRO> listClassSectionsUsingDELETE(
    @Body MasterStudyClassDTO studyClassDTO
  );

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
   * listClassSections
   * 
   * @param studyClassDTO studyClassDTO (required)
   * @return Call&lt;LessonPlanRO&gt;
   */
  
  @HEAD("data/listClassSections.app")
  Call<LessonPlanRO> listClassSectionsUsingHEAD(
    @Body MasterStudyClassDTO studyClassDTO
  );

  /**
   * listClassSections
   * 
   * @param studyClassDTO studyClassDTO (required)
   * @return Call&lt;LessonPlanRO&gt;
   */
  
  @OPTIONS("data/listClassSections.app")
  Call<LessonPlanRO> listClassSectionsUsingOPTIONS(
    @Body MasterStudyClassDTO studyClassDTO
  );

  /**
   * listClassSections
   * 
   * @param studyClassDTO studyClassDTO (required)
   * @return Call&lt;LessonPlanRO&gt;
   */
  
  @PATCH("data/listClassSections.app")
  Call<LessonPlanRO> listClassSectionsUsingPATCH(
    @Body MasterStudyClassDTO studyClassDTO
  );

  /**
   * listClassSections
   * 
   * @param studyClassDTO studyClassDTO (required)
   * @return Call&lt;LessonPlanRO&gt;
   */
  
  @POST("data/listClassSections.app")
  Call<LessonPlanRO> listClassSectionsUsingPOST(
    @Body MasterStudyClassDTO studyClassDTO
  );

  /**
   * listClassSections
   * 
   * @param studyClassDTO studyClassDTO (required)
   * @return Call&lt;LessonPlanRO&gt;
   */
  
  @PUT("data/listClassSections.app")
  Call<LessonPlanRO> listClassSectionsUsingPUT(
    @Body MasterStudyClassDTO studyClassDTO
  );

  /**
   * listClasses
   * 
   * @param studyClassDTO studyClassDTO (required)
   * @return Call&lt;LessonPlanRO&gt;
   */
  
  @DELETE("data/listClasses.app")
  Call<LessonPlanRO> listClassesUsingDELETE(
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

  /**
   * listClasses
   * 
   * @param studyClassDTO studyClassDTO (required)
   * @return Call&lt;LessonPlanRO&gt;
   */
  
  @HEAD("data/listClasses.app")
  Call<LessonPlanRO> listClassesUsingHEAD(
    @Body MasterStudyClassDTO studyClassDTO
  );

  /**
   * listClasses
   * 
   * @param studyClassDTO studyClassDTO (required)
   * @return Call&lt;LessonPlanRO&gt;
   */
  
  @OPTIONS("data/listClasses.app")
  Call<LessonPlanRO> listClassesUsingOPTIONS(
    @Body MasterStudyClassDTO studyClassDTO
  );

  /**
   * listClasses
   * 
   * @param studyClassDTO studyClassDTO (required)
   * @return Call&lt;LessonPlanRO&gt;
   */
  
  @PATCH("data/listClasses.app")
  Call<LessonPlanRO> listClassesUsingPATCH(
    @Body MasterStudyClassDTO studyClassDTO
  );

  /**
   * listClasses
   * 
   * @param studyClassDTO studyClassDTO (required)
   * @return Call&lt;LessonPlanRO&gt;
   */
  
  @POST("data/listClasses.app")
  Call<LessonPlanRO> listClassesUsingPOST(
    @Body MasterStudyClassDTO studyClassDTO
  );

  /**
   * listClasses
   * 
   * @param studyClassDTO studyClassDTO (required)
   * @return Call&lt;LessonPlanRO&gt;
   */
  
  @PUT("data/listClasses.app")
  Call<LessonPlanRO> listClassesUsingPUT(
    @Body MasterStudyClassDTO studyClassDTO
  );

}
