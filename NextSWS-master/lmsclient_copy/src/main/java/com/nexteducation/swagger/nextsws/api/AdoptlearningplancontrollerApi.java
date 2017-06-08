package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.LectureBreakupResponse;
import com.nexteducation.swagger.nextsws.model.AdoptLecturePlanResponse;
import com.nexteducation.swagger.nextsws.model.LectureBreakupDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AdoptlearningplancontrollerApi {
  /**
   * adoptLecturePlan
   * 
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param subjectId subjectId (required)
   * @param selectedLectureBreakupId selectedLectureBreakupId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LectureBreakupResponse&gt;
   */
  
  @POST("data/adoptLecturePlan/{classId}/{sectionId}/{subjectId}/{selectedLectureBreakupId}")
  Call<LectureBreakupResponse> adoptLecturePlanUsingPOST(
    @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("subjectId") Long subjectId, @Path("selectedLectureBreakupId") String selectedLectureBreakupId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchAdoptableLearningPlans
   * 
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;AdoptLecturePlanResponse&gt;
   */
  
  @GET("data/fetchCurrentLearningPlan/{subjectId}/{classId}/{sectionId}.app")
  Call<AdoptLecturePlanResponse> fetchAdoptableLearningPlansUsingGET(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchLectureBreakupDetailsForSelectedAdoptablePlan
   * 
   * @param lectureBreakupUuid lectureBreakupUuid (required)
   * @return Call&lt;AdoptLecturePlanResponse&gt;
   */
  
  @GET("data/fetchLectureBreakupDetailsForSelectedAdoptablePlan/{lectureBreakupUuid}.app")
  Call<AdoptLecturePlanResponse> fetchLectureBreakupDetailsForSelectedAdoptablePlanUsingGET(
    @Path("lectureBreakupUuid") String lectureBreakupUuid
  );

  /**
   * InsertAdoptedLectureBreakup
   * 
   * @param breakupDTO breakupDTO (required)
   * @param adoptResource adoptResource (required)
   * @param levelOfSelectedPlan levelOfSelectedPlan (required)
   * @param selectedPlanSectionId selectedPlanSectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LectureBreakupResponse&gt;
   */
  
  @DELETE("data/adoptLecturePlan/{adoptResource}/{levelOfSelectedPlan}/{selectedPlanSectionId}")
  Call<LectureBreakupResponse> insertAdoptedLectureBreakupUsingDELETE(
    @Body LectureBreakupDTO breakupDTO, @Path("adoptResource") Boolean adoptResource, @Path("levelOfSelectedPlan") Boolean levelOfSelectedPlan, @Path("selectedPlanSectionId") Long selectedPlanSectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * InsertAdoptedLectureBreakup
   * 
   * @param breakupDTO breakupDTO (required)
   * @param adoptResource adoptResource (required)
   * @param levelOfSelectedPlan levelOfSelectedPlan (required)
   * @param selectedPlanSectionId selectedPlanSectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LectureBreakupResponse&gt;
   */
  
  @GET("data/adoptLecturePlan/{adoptResource}/{levelOfSelectedPlan}/{selectedPlanSectionId}")
  Call<LectureBreakupResponse> insertAdoptedLectureBreakupUsingGET(
    @Body LectureBreakupDTO breakupDTO, @Path("adoptResource") Boolean adoptResource, @Path("levelOfSelectedPlan") Boolean levelOfSelectedPlan, @Path("selectedPlanSectionId") Long selectedPlanSectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * InsertAdoptedLectureBreakup
   * 
   * @param breakupDTO breakupDTO (required)
   * @param adoptResource adoptResource (required)
   * @param levelOfSelectedPlan levelOfSelectedPlan (required)
   * @param selectedPlanSectionId selectedPlanSectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LectureBreakupResponse&gt;
   */
  
  @HEAD("data/adoptLecturePlan/{adoptResource}/{levelOfSelectedPlan}/{selectedPlanSectionId}")
  Call<LectureBreakupResponse> insertAdoptedLectureBreakupUsingHEAD(
    @Body LectureBreakupDTO breakupDTO, @Path("adoptResource") Boolean adoptResource, @Path("levelOfSelectedPlan") Boolean levelOfSelectedPlan, @Path("selectedPlanSectionId") Long selectedPlanSectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * InsertAdoptedLectureBreakup
   * 
   * @param breakupDTO breakupDTO (required)
   * @param adoptResource adoptResource (required)
   * @param levelOfSelectedPlan levelOfSelectedPlan (required)
   * @param selectedPlanSectionId selectedPlanSectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LectureBreakupResponse&gt;
   */
  
  @OPTIONS("data/adoptLecturePlan/{adoptResource}/{levelOfSelectedPlan}/{selectedPlanSectionId}")
  Call<LectureBreakupResponse> insertAdoptedLectureBreakupUsingOPTIONS(
    @Body LectureBreakupDTO breakupDTO, @Path("adoptResource") Boolean adoptResource, @Path("levelOfSelectedPlan") Boolean levelOfSelectedPlan, @Path("selectedPlanSectionId") Long selectedPlanSectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * InsertAdoptedLectureBreakup
   * 
   * @param breakupDTO breakupDTO (required)
   * @param adoptResource adoptResource (required)
   * @param levelOfSelectedPlan levelOfSelectedPlan (required)
   * @param selectedPlanSectionId selectedPlanSectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LectureBreakupResponse&gt;
   */
  
  @PATCH("data/adoptLecturePlan/{adoptResource}/{levelOfSelectedPlan}/{selectedPlanSectionId}")
  Call<LectureBreakupResponse> insertAdoptedLectureBreakupUsingPATCH(
    @Body LectureBreakupDTO breakupDTO, @Path("adoptResource") Boolean adoptResource, @Path("levelOfSelectedPlan") Boolean levelOfSelectedPlan, @Path("selectedPlanSectionId") Long selectedPlanSectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * InsertAdoptedLectureBreakup
   * 
   * @param breakupDTO breakupDTO (required)
   * @param adoptResource adoptResource (required)
   * @param levelOfSelectedPlan levelOfSelectedPlan (required)
   * @param selectedPlanSectionId selectedPlanSectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LectureBreakupResponse&gt;
   */
  
  @POST("data/adoptLecturePlan/{adoptResource}/{levelOfSelectedPlan}/{selectedPlanSectionId}")
  Call<LectureBreakupResponse> insertAdoptedLectureBreakupUsingPOST(
    @Body LectureBreakupDTO breakupDTO, @Path("adoptResource") Boolean adoptResource, @Path("levelOfSelectedPlan") Boolean levelOfSelectedPlan, @Path("selectedPlanSectionId") Long selectedPlanSectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * InsertAdoptedLectureBreakup
   * 
   * @param breakupDTO breakupDTO (required)
   * @param adoptResource adoptResource (required)
   * @param levelOfSelectedPlan levelOfSelectedPlan (required)
   * @param selectedPlanSectionId selectedPlanSectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LectureBreakupResponse&gt;
   */
  
  @PUT("data/adoptLecturePlan/{adoptResource}/{levelOfSelectedPlan}/{selectedPlanSectionId}")
  Call<LectureBreakupResponse> insertAdoptedLectureBreakupUsingPUT(
    @Body LectureBreakupDTO breakupDTO, @Path("adoptResource") Boolean adoptResource, @Path("levelOfSelectedPlan") Boolean levelOfSelectedPlan, @Path("selectedPlanSectionId") Long selectedPlanSectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * publishPlan
   * 
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param subjectId subjectId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;String&gt;
   */
  
  @POST("data/publishPlan/{classId}/{sectionId}/{subjectId}")
  Call<String> publishPlanUsingPOST(
    @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("subjectId") Long subjectId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

}
