package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.LearningPlanResourceResponse;
import com.nexteducation.swagger.nextsws.model.LPResourceRequest;
import com.nexteducation.swagger.nextsws.model.LectureResourceResponse;
import com.nexteducation.swagger.nextsws.model.SyllabusNodeResponse;
import com.nexteducation.swagger.nextsws.model.LearningPlanResourceDTO;
import com.nexteducation.swagger.nextsws.model.TopicResponse;
import com.nexteducation.swagger.nextsws.model.LearningPlanTaskFetchRequest;
import com.nexteducation.swagger.nextsws.model.LearningPlanTaskResponse;
import com.nexteducation.swagger.nextsws.model.LearningPlanMemberResponse;
import com.nexteducation.swagger.nextsws.model.LearningPlanTaskDetailResponse;
import com.nexteducation.swagger.nextsws.model.TaskFetchRequest;
import com.nexteducation.swagger.nextsws.model.LearningPlanChapterResponse;
import com.nexteducation.swagger.nextsws.model.LearningPlanScheduleResponse;
import com.nexteducation.swagger.nextsws.model.LearningPlanTimeTableResponse;
import com.nexteducation.swagger.nextsws.model.LearningPlanRequest;
import com.nexteducation.swagger.nextsws.model.LearningPlanHomeworkTaskResponse;
import com.nexteducation.swagger.nextsws.model.LearningPlanResponse;
import com.nexteducation.swagger.nextsws.model.StudyPlanTypeResponse;
import com.nexteducation.swagger.nextsws.model.LectureBreakupRequest;
import com.nexteducation.swagger.nextsws.model.StudyPlanResponse;
import com.nexteducation.swagger.nextsws.model.LectureBreakupDTO;
import com.nexteducation.swagger.nextsws.model.LearningPlanResourceRequest;
import com.nexteducation.swagger.nextsws.model.LecturePlanDTO;
import com.nexteducation.swagger.nextsws.model.LearningPlanTaskUpdateRequest;
import com.nexteducation.swagger.nextsws.model.Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface LearningplancontrollerApi {
  /**
   * addLearningPlanResource
   * 
   * @param resourceRequests resourceRequests (required)
   * @param learningPlanMemberUuid learningPlanMemberUuid (required)
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param subjectId subjectId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<LearningPlanResourceResponse>&gt;
   */
  
  @POST("data/addLearningPlanResource/{classId}/{subjectId}/{sectionId}/{learningPlanMemberUuid}")
  Call<List<LearningPlanResourceResponse>> addLearningPlanResourceUsingPOST(
    @Body List<LPResourceRequest> resourceRequests, @Path("learningPlanMemberUuid") String learningPlanMemberUuid, @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("subjectId") Long subjectId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * addLectureResource
   * 
   * @param resourceUuids resourceUuids (required)
   * @param learningPlanMemberUuid learningPlanMemberUuid (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<LectureResourceResponse>&gt;
   */
  
  @POST("data/addLectureResource/{learningPlanMemberUuid}/{sectionId}")
  Call<List<LectureResourceResponse>> addLectureResourceUsingPOST(
    @Body List<String> resourceUuids, @Path("learningPlanMemberUuid") String learningPlanMemberUuid, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteLearningPlanResource
   * 
   * @param resourceUuid resourceUuid (required)
   * @param learningPlanMemberUuid learningPlanMemberUuid (required)
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param subjectId subjectId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;String&gt;
   */
  
  @DELETE("data/deleteLearningPlanResource/{classId}/{subjectId}/{sectionId}/{learningPlanMemberUuid}/{resourceUuid}")
  Call<String> deleteLearningPlanResourceUsingDELETE(
    @Path("resourceUuid") String resourceUuid, @Path("learningPlanMemberUuid") String learningPlanMemberUuid, @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("subjectId") Long subjectId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteLearningPlanResource
   * 
   * @param resourceUuid resourceUuid (required)
   * @param learningPlanMemberUuid learningPlanMemberUuid (required)
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param subjectId subjectId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;String&gt;
   */
  
  @GET("data/deleteLearningPlanResource/{classId}/{subjectId}/{sectionId}/{learningPlanMemberUuid}/{resourceUuid}")
  Call<String> deleteLearningPlanResourceUsingGET(
    @Path("resourceUuid") String resourceUuid, @Path("learningPlanMemberUuid") String learningPlanMemberUuid, @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("subjectId") Long subjectId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteLearningPlanResource
   * 
   * @param resourceUuid resourceUuid (required)
   * @param learningPlanMemberUuid learningPlanMemberUuid (required)
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param subjectId subjectId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;String&gt;
   */
  
  @HEAD("data/deleteLearningPlanResource/{classId}/{subjectId}/{sectionId}/{learningPlanMemberUuid}/{resourceUuid}")
  Call<String> deleteLearningPlanResourceUsingHEAD(
    @Path("resourceUuid") String resourceUuid, @Path("learningPlanMemberUuid") String learningPlanMemberUuid, @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("subjectId") Long subjectId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteLearningPlanResource
   * 
   * @param resourceUuid resourceUuid (required)
   * @param learningPlanMemberUuid learningPlanMemberUuid (required)
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param subjectId subjectId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;String&gt;
   */
  
  @OPTIONS("data/deleteLearningPlanResource/{classId}/{subjectId}/{sectionId}/{learningPlanMemberUuid}/{resourceUuid}")
  Call<String> deleteLearningPlanResourceUsingOPTIONS(
    @Path("resourceUuid") String resourceUuid, @Path("learningPlanMemberUuid") String learningPlanMemberUuid, @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("subjectId") Long subjectId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteLearningPlanResource
   * 
   * @param resourceUuid resourceUuid (required)
   * @param learningPlanMemberUuid learningPlanMemberUuid (required)
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param subjectId subjectId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;String&gt;
   */
  
  @PATCH("data/deleteLearningPlanResource/{classId}/{subjectId}/{sectionId}/{learningPlanMemberUuid}/{resourceUuid}")
  Call<String> deleteLearningPlanResourceUsingPATCH(
    @Path("resourceUuid") String resourceUuid, @Path("learningPlanMemberUuid") String learningPlanMemberUuid, @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("subjectId") Long subjectId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteLearningPlanResource
   * 
   * @param resourceUuid resourceUuid (required)
   * @param learningPlanMemberUuid learningPlanMemberUuid (required)
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param subjectId subjectId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;String&gt;
   */
  
  @POST("data/deleteLearningPlanResource/{classId}/{subjectId}/{sectionId}/{learningPlanMemberUuid}/{resourceUuid}")
  Call<String> deleteLearningPlanResourceUsingPOST(
    @Path("resourceUuid") String resourceUuid, @Path("learningPlanMemberUuid") String learningPlanMemberUuid, @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("subjectId") Long subjectId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteLearningPlanResource
   * 
   * @param resourceUuid resourceUuid (required)
   * @param learningPlanMemberUuid learningPlanMemberUuid (required)
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param subjectId subjectId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;String&gt;
   */
  
  @PUT("data/deleteLearningPlanResource/{classId}/{subjectId}/{sectionId}/{learningPlanMemberUuid}/{resourceUuid}")
  Call<String> deleteLearningPlanResourceUsingPUT(
    @Path("resourceUuid") String resourceUuid, @Path("learningPlanMemberUuid") String learningPlanMemberUuid, @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("subjectId") Long subjectId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteLectureResource
   * 
   * @param learningPlanMemberUuid learningPlanMemberUuid (required)
   * @param resourceUuid resourceUuid (required)
   * @param sectionId sectionId (required)
   * @return Call&lt;Void&gt;
   */
  
  @DELETE("data/deleteLecturePlanResource/{learningPlanMemberUuid}/{sectionId}/{resourceUuid}")
  Call<Void> deleteLectureResourceUsingDELETE(
    @Path("learningPlanMemberUuid") String learningPlanMemberUuid, @Path("resourceUuid") String resourceUuid, @Path("sectionId") Long sectionId
  );

  /**
   * deleteLectureResource
   * 
   * @param learningPlanMemberUuid learningPlanMemberUuid (required)
   * @param resourceUuid resourceUuid (required)
   * @param sectionId sectionId (required)
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/deleteLecturePlanResource/{learningPlanMemberUuid}/{sectionId}/{resourceUuid}")
  Call<Void> deleteLectureResourceUsingGET(
    @Path("learningPlanMemberUuid") String learningPlanMemberUuid, @Path("resourceUuid") String resourceUuid, @Path("sectionId") Long sectionId
  );

  /**
   * deleteLectureResource
   * 
   * @param learningPlanMemberUuid learningPlanMemberUuid (required)
   * @param resourceUuid resourceUuid (required)
   * @param sectionId sectionId (required)
   * @return Call&lt;Void&gt;
   */
  
  @HEAD("data/deleteLecturePlanResource/{learningPlanMemberUuid}/{sectionId}/{resourceUuid}")
  Call<Void> deleteLectureResourceUsingHEAD(
    @Path("learningPlanMemberUuid") String learningPlanMemberUuid, @Path("resourceUuid") String resourceUuid, @Path("sectionId") Long sectionId
  );

  /**
   * deleteLectureResource
   * 
   * @param learningPlanMemberUuid learningPlanMemberUuid (required)
   * @param resourceUuid resourceUuid (required)
   * @param sectionId sectionId (required)
   * @return Call&lt;Void&gt;
   */
  
  @OPTIONS("data/deleteLecturePlanResource/{learningPlanMemberUuid}/{sectionId}/{resourceUuid}")
  Call<Void> deleteLectureResourceUsingOPTIONS(
    @Path("learningPlanMemberUuid") String learningPlanMemberUuid, @Path("resourceUuid") String resourceUuid, @Path("sectionId") Long sectionId
  );

  /**
   * deleteLectureResource
   * 
   * @param learningPlanMemberUuid learningPlanMemberUuid (required)
   * @param resourceUuid resourceUuid (required)
   * @param sectionId sectionId (required)
   * @return Call&lt;Void&gt;
   */
  
  @PATCH("data/deleteLecturePlanResource/{learningPlanMemberUuid}/{sectionId}/{resourceUuid}")
  Call<Void> deleteLectureResourceUsingPATCH(
    @Path("learningPlanMemberUuid") String learningPlanMemberUuid, @Path("resourceUuid") String resourceUuid, @Path("sectionId") Long sectionId
  );

  /**
   * deleteLectureResource
   * 
   * @param learningPlanMemberUuid learningPlanMemberUuid (required)
   * @param resourceUuid resourceUuid (required)
   * @param sectionId sectionId (required)
   * @return Call&lt;Void&gt;
   */
  
  @POST("data/deleteLecturePlanResource/{learningPlanMemberUuid}/{sectionId}/{resourceUuid}")
  Call<Void> deleteLectureResourceUsingPOST(
    @Path("learningPlanMemberUuid") String learningPlanMemberUuid, @Path("resourceUuid") String resourceUuid, @Path("sectionId") Long sectionId
  );

  /**
   * deleteLectureResource
   * 
   * @param learningPlanMemberUuid learningPlanMemberUuid (required)
   * @param resourceUuid resourceUuid (required)
   * @param sectionId sectionId (required)
   * @return Call&lt;Void&gt;
   */
  
  @PUT("data/deleteLecturePlanResource/{learningPlanMemberUuid}/{sectionId}/{resourceUuid}")
  Call<Void> deleteLectureResourceUsingPUT(
    @Path("learningPlanMemberUuid") String learningPlanMemberUuid, @Path("resourceUuid") String resourceUuid, @Path("sectionId") Long sectionId
  );

  /**
   * fetchChapterDetails
   * 
   * @param subjectId subjectId (required)
   * @param sectionId sectionId (required)
   * @param studyClassId studyClassId (required)
   * @param chapterList chapterList (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Map<String, List<LearningPlanMemberResponse>>&gt;
   */
  
  @DELETE("data/chapterList/{subjectId}/{sectionId}/{studyClassId}")
  Call<Map<String, List<LearningPlanMemberResponse>>> fetchChapterDetailsUsingDELETE(
    @Path("subjectId") Long subjectId, @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Body List<SyllabusNodeResponse> chapterList, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchChapterDetails
   * 
   * @param subjectId subjectId (required)
   * @param sectionId sectionId (required)
   * @param studyClassId studyClassId (required)
   * @param chapterList chapterList (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Map<String, List<LearningPlanMemberResponse>>&gt;
   */
  
  @GET("data/chapterList/{subjectId}/{sectionId}/{studyClassId}")
  Call<Map<String, List<LearningPlanMemberResponse>>> fetchChapterDetailsUsingGET(
    @Path("subjectId") Long subjectId, @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Body List<SyllabusNodeResponse> chapterList, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchChapterDetails
   * 
   * @param subjectId subjectId (required)
   * @param sectionId sectionId (required)
   * @param studyClassId studyClassId (required)
   * @param chapterList chapterList (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Map<String, List<LearningPlanMemberResponse>>&gt;
   */
  
  @HEAD("data/chapterList/{subjectId}/{sectionId}/{studyClassId}")
  Call<Map<String, List<LearningPlanMemberResponse>>> fetchChapterDetailsUsingHEAD(
    @Path("subjectId") Long subjectId, @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Body List<SyllabusNodeResponse> chapterList, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchChapterDetails
   * 
   * @param subjectId subjectId (required)
   * @param sectionId sectionId (required)
   * @param studyClassId studyClassId (required)
   * @param chapterList chapterList (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Map<String, List<LearningPlanMemberResponse>>&gt;
   */
  
  @OPTIONS("data/chapterList/{subjectId}/{sectionId}/{studyClassId}")
  Call<Map<String, List<LearningPlanMemberResponse>>> fetchChapterDetailsUsingOPTIONS(
    @Path("subjectId") Long subjectId, @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Body List<SyllabusNodeResponse> chapterList, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchChapterDetails
   * 
   * @param subjectId subjectId (required)
   * @param sectionId sectionId (required)
   * @param studyClassId studyClassId (required)
   * @param chapterList chapterList (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Map<String, List<LearningPlanMemberResponse>>&gt;
   */
  
  @PATCH("data/chapterList/{subjectId}/{sectionId}/{studyClassId}")
  Call<Map<String, List<LearningPlanMemberResponse>>> fetchChapterDetailsUsingPATCH(
    @Path("subjectId") Long subjectId, @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Body List<SyllabusNodeResponse> chapterList, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchChapterDetails
   * 
   * @param subjectId subjectId (required)
   * @param sectionId sectionId (required)
   * @param studyClassId studyClassId (required)
   * @param chapterList chapterList (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Map<String, List<LearningPlanMemberResponse>>&gt;
   */
  
  @POST("data/chapterList/{subjectId}/{sectionId}/{studyClassId}")
  Call<Map<String, List<LearningPlanMemberResponse>>> fetchChapterDetailsUsingPOST(
    @Path("subjectId") Long subjectId, @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Body List<SyllabusNodeResponse> chapterList, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchChapterDetails
   * 
   * @param subjectId subjectId (required)
   * @param sectionId sectionId (required)
   * @param studyClassId studyClassId (required)
   * @param chapterList chapterList (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Map<String, List<LearningPlanMemberResponse>>&gt;
   */
  
  @PUT("data/chapterList/{subjectId}/{sectionId}/{studyClassId}")
  Call<Map<String, List<LearningPlanMemberResponse>>> fetchChapterDetailsUsingPUT(
    @Path("subjectId") Long subjectId, @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Body List<SyllabusNodeResponse> chapterList, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchLearningPlanResourceTopic
   * 
   * @param learningPlanResourceDTO learningPlanResourceDTO (required)
   * @return Call&lt;List<TopicResponse>&gt;
   */
  
  @DELETE("data/fetchResourceTopic")
  Call<List<TopicResponse>> fetchLearningPlanResourceTopicUsingDELETE(
    @Body LearningPlanResourceDTO learningPlanResourceDTO
  );

  /**
   * fetchLearningPlanResourceTopic
   * 
   * @param learningPlanResourceDTO learningPlanResourceDTO (required)
   * @return Call&lt;List<TopicResponse>&gt;
   */
  
  @GET("data/fetchResourceTopic")
  Call<List<TopicResponse>> fetchLearningPlanResourceTopicUsingGET(
    @Body LearningPlanResourceDTO learningPlanResourceDTO
  );

  /**
   * fetchLearningPlanResourceTopic
   * 
   * @param learningPlanResourceDTO learningPlanResourceDTO (required)
   * @return Call&lt;List<TopicResponse>&gt;
   */
  
  @HEAD("data/fetchResourceTopic")
  Call<List<TopicResponse>> fetchLearningPlanResourceTopicUsingHEAD(
    @Body LearningPlanResourceDTO learningPlanResourceDTO
  );

  /**
   * fetchLearningPlanResourceTopic
   * 
   * @param learningPlanResourceDTO learningPlanResourceDTO (required)
   * @return Call&lt;List<TopicResponse>&gt;
   */
  
  @OPTIONS("data/fetchResourceTopic")
  Call<List<TopicResponse>> fetchLearningPlanResourceTopicUsingOPTIONS(
    @Body LearningPlanResourceDTO learningPlanResourceDTO
  );

  /**
   * fetchLearningPlanResourceTopic
   * 
   * @param learningPlanResourceDTO learningPlanResourceDTO (required)
   * @return Call&lt;List<TopicResponse>&gt;
   */
  
  @PATCH("data/fetchResourceTopic")
  Call<List<TopicResponse>> fetchLearningPlanResourceTopicUsingPATCH(
    @Body LearningPlanResourceDTO learningPlanResourceDTO
  );

  /**
   * fetchLearningPlanResourceTopic
   * 
   * @param learningPlanResourceDTO learningPlanResourceDTO (required)
   * @return Call&lt;List<TopicResponse>&gt;
   */
  
  @POST("data/fetchResourceTopic")
  Call<List<TopicResponse>> fetchLearningPlanResourceTopicUsingPOST(
    @Body LearningPlanResourceDTO learningPlanResourceDTO
  );

  /**
   * fetchLearningPlanResourceTopic
   * 
   * @param learningPlanResourceDTO learningPlanResourceDTO (required)
   * @return Call&lt;List<TopicResponse>&gt;
   */
  
  @PUT("data/fetchResourceTopic")
  Call<List<TopicResponse>> fetchLearningPlanResourceTopicUsingPUT(
    @Body LearningPlanResourceDTO learningPlanResourceDTO
  );

  /**
   * fetchLearningPlanTasks
   * 
   * @param fetchRequest fetchRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<LearningPlanTaskResponse>&gt;
   */
  
  @POST("data/fetchlearningplantask")
  Call<List<LearningPlanTaskResponse>> fetchLearningPlanTasksUsingPOST(
    @Body LearningPlanTaskFetchRequest fetchRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * fetchSyllabusByLearningPlanMember
   * 
   * @param lpmuuid lpmuuid (required)
   * @return Call&lt;List<LearningPlanMemberResponse>&gt;
   */
  
  @DELETE("data/fetchsyllabusbylearningplanmember/{lpmuuid}")
  Call<List<LearningPlanMemberResponse>> fetchSyllabusByLearningPlanMemberUsingDELETE(
    @Path("lpmuuid") String lpmuuid
  );

  /**
   * fetchSyllabusByLearningPlanMember
   * 
   * @param lpmuuid lpmuuid (required)
   * @return Call&lt;List<LearningPlanMemberResponse>&gt;
   */
  
  @GET("data/fetchsyllabusbylearningplanmember/{lpmuuid}")
  Call<List<LearningPlanMemberResponse>> fetchSyllabusByLearningPlanMemberUsingGET(
    @Path("lpmuuid") String lpmuuid
  );

  /**
   * fetchSyllabusByLearningPlanMember
   * 
   * @param lpmuuid lpmuuid (required)
   * @return Call&lt;List<LearningPlanMemberResponse>&gt;
   */
  
  @HEAD("data/fetchsyllabusbylearningplanmember/{lpmuuid}")
  Call<List<LearningPlanMemberResponse>> fetchSyllabusByLearningPlanMemberUsingHEAD(
    @Path("lpmuuid") String lpmuuid
  );

  /**
   * fetchSyllabusByLearningPlanMember
   * 
   * @param lpmuuid lpmuuid (required)
   * @return Call&lt;List<LearningPlanMemberResponse>&gt;
   */
  
  @OPTIONS("data/fetchsyllabusbylearningplanmember/{lpmuuid}")
  Call<List<LearningPlanMemberResponse>> fetchSyllabusByLearningPlanMemberUsingOPTIONS(
    @Path("lpmuuid") String lpmuuid
  );

  /**
   * fetchSyllabusByLearningPlanMember
   * 
   * @param lpmuuid lpmuuid (required)
   * @return Call&lt;List<LearningPlanMemberResponse>&gt;
   */
  
  @PATCH("data/fetchsyllabusbylearningplanmember/{lpmuuid}")
  Call<List<LearningPlanMemberResponse>> fetchSyllabusByLearningPlanMemberUsingPATCH(
    @Path("lpmuuid") String lpmuuid
  );

  /**
   * fetchSyllabusByLearningPlanMember
   * 
   * @param lpmuuid lpmuuid (required)
   * @return Call&lt;List<LearningPlanMemberResponse>&gt;
   */
  
  @POST("data/fetchsyllabusbylearningplanmember/{lpmuuid}")
  Call<List<LearningPlanMemberResponse>> fetchSyllabusByLearningPlanMemberUsingPOST(
    @Path("lpmuuid") String lpmuuid
  );

  /**
   * fetchSyllabusByLearningPlanMember
   * 
   * @param lpmuuid lpmuuid (required)
   * @return Call&lt;List<LearningPlanMemberResponse>&gt;
   */
  
  @PUT("data/fetchsyllabusbylearningplanmember/{lpmuuid}")
  Call<List<LearningPlanMemberResponse>> fetchSyllabusByLearningPlanMemberUsingPUT(
    @Path("lpmuuid") String lpmuuid
  );

  /**
   * fetchUserTasks
   * 
   * @param fetchRequest fetchRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<LearningPlanTaskDetailResponse>&gt;
   */
  
  @POST("data/fetchusertask")
  Call<List<LearningPlanTaskDetailResponse>> fetchUserTasksUsingPOST(
    @Body TaskFetchRequest fetchRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCompletionCount
   * 
   * @param subjectId subjectId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<LearningPlanChapterResponse>&gt;
   */
  
  @DELETE("data/getCompletionCount/{subjectId}/{sectionId}")
  Call<List<LearningPlanChapterResponse>> getCompletionCountUsingDELETE(
    @Path("subjectId") Long subjectId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCompletionCount
   * 
   * @param subjectId subjectId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<LearningPlanChapterResponse>&gt;
   */
  
  @GET("data/getCompletionCount/{subjectId}/{sectionId}")
  Call<List<LearningPlanChapterResponse>> getCompletionCountUsingGET(
    @Path("subjectId") Long subjectId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCompletionCount
   * 
   * @param subjectId subjectId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<LearningPlanChapterResponse>&gt;
   */
  
  @HEAD("data/getCompletionCount/{subjectId}/{sectionId}")
  Call<List<LearningPlanChapterResponse>> getCompletionCountUsingHEAD(
    @Path("subjectId") Long subjectId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCompletionCount
   * 
   * @param subjectId subjectId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<LearningPlanChapterResponse>&gt;
   */
  
  @OPTIONS("data/getCompletionCount/{subjectId}/{sectionId}")
  Call<List<LearningPlanChapterResponse>> getCompletionCountUsingOPTIONS(
    @Path("subjectId") Long subjectId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCompletionCount
   * 
   * @param subjectId subjectId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<LearningPlanChapterResponse>&gt;
   */
  
  @PATCH("data/getCompletionCount/{subjectId}/{sectionId}")
  Call<List<LearningPlanChapterResponse>> getCompletionCountUsingPATCH(
    @Path("subjectId") Long subjectId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCompletionCount
   * 
   * @param subjectId subjectId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<LearningPlanChapterResponse>&gt;
   */
  
  @POST("data/getCompletionCount/{subjectId}/{sectionId}")
  Call<List<LearningPlanChapterResponse>> getCompletionCountUsingPOST(
    @Path("subjectId") Long subjectId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getCompletionCount
   * 
   * @param subjectId subjectId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<LearningPlanChapterResponse>&gt;
   */
  
  @PUT("data/getCompletionCount/{subjectId}/{sectionId}")
  Call<List<LearningPlanChapterResponse>> getCompletionCountUsingPUT(
    @Path("subjectId") Long subjectId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLearningPlanResourceByResourceUuid
   * 
   * @param lpmuuid lpmuuid (required)
   * @return Call&lt;List<LearningPlanScheduleResponse>&gt;
   */
  
  @DELETE("data/fetchLearningPlanScheduleByMember/{lpmuuid}")
  Call<List<LearningPlanScheduleResponse>> getLearningPlanResourceByResourceUuidUsingDELETE(
    @Path("lpmuuid") String lpmuuid
  );

  /**
   * getLearningPlanResourceByResourceUuid
   * 
   * @param lpmuuid lpmuuid (required)
   * @return Call&lt;List<LearningPlanScheduleResponse>&gt;
   */
  
  @GET("data/fetchLearningPlanScheduleByMember/{lpmuuid}")
  Call<List<LearningPlanScheduleResponse>> getLearningPlanResourceByResourceUuidUsingGET(
    @Path("lpmuuid") String lpmuuid
  );

  /**
   * getLearningPlanResourceByResourceUuid
   * 
   * @param lpmuuid lpmuuid (required)
   * @return Call&lt;List<LearningPlanScheduleResponse>&gt;
   */
  
  @HEAD("data/fetchLearningPlanScheduleByMember/{lpmuuid}")
  Call<List<LearningPlanScheduleResponse>> getLearningPlanResourceByResourceUuidUsingHEAD(
    @Path("lpmuuid") String lpmuuid
  );

  /**
   * getLearningPlanResourceByResourceUuid
   * 
   * @param lpmuuid lpmuuid (required)
   * @return Call&lt;List<LearningPlanScheduleResponse>&gt;
   */
  
  @OPTIONS("data/fetchLearningPlanScheduleByMember/{lpmuuid}")
  Call<List<LearningPlanScheduleResponse>> getLearningPlanResourceByResourceUuidUsingOPTIONS(
    @Path("lpmuuid") String lpmuuid
  );

  /**
   * getLearningPlanResourceByResourceUuid
   * 
   * @param lpmuuid lpmuuid (required)
   * @return Call&lt;List<LearningPlanScheduleResponse>&gt;
   */
  
  @PATCH("data/fetchLearningPlanScheduleByMember/{lpmuuid}")
  Call<List<LearningPlanScheduleResponse>> getLearningPlanResourceByResourceUuidUsingPATCH(
    @Path("lpmuuid") String lpmuuid
  );

  /**
   * getLearningPlanResourceByResourceUuid
   * 
   * @param lpmuuid lpmuuid (required)
   * @return Call&lt;List<LearningPlanScheduleResponse>&gt;
   */
  
  @POST("data/fetchLearningPlanScheduleByMember/{lpmuuid}")
  Call<List<LearningPlanScheduleResponse>> getLearningPlanResourceByResourceUuidUsingPOST(
    @Path("lpmuuid") String lpmuuid
  );

  /**
   * getLearningPlanResourceByResourceUuid
   * 
   * @param lpmuuid lpmuuid (required)
   * @return Call&lt;List<LearningPlanScheduleResponse>&gt;
   */
  
  @PUT("data/fetchLearningPlanScheduleByMember/{lpmuuid}")
  Call<List<LearningPlanScheduleResponse>> getLearningPlanResourceByResourceUuidUsingPUT(
    @Path("lpmuuid") String lpmuuid
  );

  /**
   * getLearningPlanSWSHome
   * 
   * @param learningPlanRequest learningPlanRequest (required)
   * @return Call&lt;List<LearningPlanTimeTableResponse>&gt;
   */
  
  @DELETE("data/getLearningPlanSWSHome")
  Call<List<LearningPlanTimeTableResponse>> getLearningPlanSWSHomeUsingDELETE(
    @Body LearningPlanRequest learningPlanRequest
  );

  /**
   * getLearningPlanSWSHome
   * 
   * @param learningPlanRequest learningPlanRequest (required)
   * @return Call&lt;List<LearningPlanTimeTableResponse>&gt;
   */
  
  @GET("data/getLearningPlanSWSHome")
  Call<List<LearningPlanTimeTableResponse>> getLearningPlanSWSHomeUsingGET(
    @Body LearningPlanRequest learningPlanRequest
  );

  /**
   * getLearningPlanSWSHome
   * 
   * @param learningPlanRequest learningPlanRequest (required)
   * @return Call&lt;List<LearningPlanTimeTableResponse>&gt;
   */
  
  @HEAD("data/getLearningPlanSWSHome")
  Call<List<LearningPlanTimeTableResponse>> getLearningPlanSWSHomeUsingHEAD(
    @Body LearningPlanRequest learningPlanRequest
  );

  /**
   * getLearningPlanSWSHome
   * 
   * @param learningPlanRequest learningPlanRequest (required)
   * @return Call&lt;List<LearningPlanTimeTableResponse>&gt;
   */
  
  @OPTIONS("data/getLearningPlanSWSHome")
  Call<List<LearningPlanTimeTableResponse>> getLearningPlanSWSHomeUsingOPTIONS(
    @Body LearningPlanRequest learningPlanRequest
  );

  /**
   * getLearningPlanSWSHome
   * 
   * @param learningPlanRequest learningPlanRequest (required)
   * @return Call&lt;List<LearningPlanTimeTableResponse>&gt;
   */
  
  @PATCH("data/getLearningPlanSWSHome")
  Call<List<LearningPlanTimeTableResponse>> getLearningPlanSWSHomeUsingPATCH(
    @Body LearningPlanRequest learningPlanRequest
  );

  /**
   * getLearningPlanSWSHome
   * 
   * @param learningPlanRequest learningPlanRequest (required)
   * @return Call&lt;List<LearningPlanTimeTableResponse>&gt;
   */
  
  @POST("data/getLearningPlanSWSHome")
  Call<List<LearningPlanTimeTableResponse>> getLearningPlanSWSHomeUsingPOST(
    @Body LearningPlanRequest learningPlanRequest
  );

  /**
   * getLearningPlanSWSHome
   * 
   * @param learningPlanRequest learningPlanRequest (required)
   * @return Call&lt;List<LearningPlanTimeTableResponse>&gt;
   */
  
  @PUT("data/getLearningPlanSWSHome")
  Call<List<LearningPlanTimeTableResponse>> getLearningPlanSWSHomeUsingPUT(
    @Body LearningPlanRequest learningPlanRequest
  );

  /**
   * getLearningPlanTaskBasedOnLearningPlanMemberUuid
   * 
   * @param fetchRequest fetchRequest (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LearningPlanHomeworkTaskResponse&gt;
   */
  
  @DELETE("data/getLearningPlanTaskBasedOnLearningPlanMemberUuid")
  Call<LearningPlanHomeworkTaskResponse> getLearningPlanTaskBasedOnLearningPlanMemberUuidUsingDELETE(
    @Body LearningPlanTaskFetchRequest fetchRequest, @Query("classId") Long classId, @Query("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLearningPlanTaskBasedOnLearningPlanMemberUuid
   * 
   * @param fetchRequest fetchRequest (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LearningPlanHomeworkTaskResponse&gt;
   */
  
  @GET("data/getLearningPlanTaskBasedOnLearningPlanMemberUuid")
  Call<LearningPlanHomeworkTaskResponse> getLearningPlanTaskBasedOnLearningPlanMemberUuidUsingGET(
    @Body LearningPlanTaskFetchRequest fetchRequest, @Query("classId") Long classId, @Query("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLearningPlanTaskBasedOnLearningPlanMemberUuid
   * 
   * @param fetchRequest fetchRequest (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LearningPlanHomeworkTaskResponse&gt;
   */
  
  @HEAD("data/getLearningPlanTaskBasedOnLearningPlanMemberUuid")
  Call<LearningPlanHomeworkTaskResponse> getLearningPlanTaskBasedOnLearningPlanMemberUuidUsingHEAD(
    @Body LearningPlanTaskFetchRequest fetchRequest, @Query("classId") Long classId, @Query("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLearningPlanTaskBasedOnLearningPlanMemberUuid
   * 
   * @param fetchRequest fetchRequest (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LearningPlanHomeworkTaskResponse&gt;
   */
  
  @OPTIONS("data/getLearningPlanTaskBasedOnLearningPlanMemberUuid")
  Call<LearningPlanHomeworkTaskResponse> getLearningPlanTaskBasedOnLearningPlanMemberUuidUsingOPTIONS(
    @Body LearningPlanTaskFetchRequest fetchRequest, @Query("classId") Long classId, @Query("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLearningPlanTaskBasedOnLearningPlanMemberUuid
   * 
   * @param fetchRequest fetchRequest (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LearningPlanHomeworkTaskResponse&gt;
   */
  
  @PATCH("data/getLearningPlanTaskBasedOnLearningPlanMemberUuid")
  Call<LearningPlanHomeworkTaskResponse> getLearningPlanTaskBasedOnLearningPlanMemberUuidUsingPATCH(
    @Body LearningPlanTaskFetchRequest fetchRequest, @Query("classId") Long classId, @Query("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLearningPlanTaskBasedOnLearningPlanMemberUuid
   * 
   * @param fetchRequest fetchRequest (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LearningPlanHomeworkTaskResponse&gt;
   */
  
  @POST("data/getLearningPlanTaskBasedOnLearningPlanMemberUuid")
  Call<LearningPlanHomeworkTaskResponse> getLearningPlanTaskBasedOnLearningPlanMemberUuidUsingPOST(
    @Body LearningPlanTaskFetchRequest fetchRequest, @Query("classId") Long classId, @Query("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLearningPlanTaskBasedOnLearningPlanMemberUuid
   * 
   * @param fetchRequest fetchRequest (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LearningPlanHomeworkTaskResponse&gt;
   */
  
  @PUT("data/getLearningPlanTaskBasedOnLearningPlanMemberUuid")
  Call<LearningPlanHomeworkTaskResponse> getLearningPlanTaskBasedOnLearningPlanMemberUuidUsingPUT(
    @Body LearningPlanTaskFetchRequest fetchRequest, @Query("classId") Long classId, @Query("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getLearningPlansBasedOnStudyPlanUuid
   * 
   * @param studyPlanUuid studyPlanUuid (required)
   * @return Call&lt;List<LearningPlanResponse>&gt;
   */
  
  @GET("data/getLearningPlansBasedOnStudyPlanUuid/{studyPlanUuid}")
  Call<List<LearningPlanResponse>> getLearningPlansBasedOnStudyPlanUuidUsingGET(
    @Path("studyPlanUuid") String studyPlanUuid
  );

  /**
   * getStudyPlanTypes
   * 
   * @return Call&lt;List<StudyPlanTypeResponse>&gt;
   */
  
  @GET("data/getStudyPlanTypes")
  Call<List<StudyPlanTypeResponse>> getStudyPlanTypesUsingGET();
    

  /**
   * getStudyPlansBasedOnFilter
   * 
   * @param lectureBreakupRequest lectureBreakupRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<StudyPlanResponse>&gt;
   */
  
  @POST("data/getStudyPlansBasedOnFilter")
  Call<List<StudyPlanResponse>> getStudyPlansBasedOnFilterUsingPOST(
    @Body LectureBreakupRequest lectureBreakupRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * insertLearningPlan
   * 
   * @param breakupDTO breakupDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/insertLecturePlan")
  Call<Object> insertLearningPlanUsingPOST(
    @Body LectureBreakupDTO breakupDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateLearningPlanResourceDueDate
   * 
   * @param learningPlanResourceRequest learningPlanResourceRequest (required)
   * @return Call&lt;LearningPlanResourceResponse&gt;
   */
  
  @POST("data/updateLearningPlanResourceDueDateWithLearningPlanDueDate")
  Call<LearningPlanResourceResponse> updateLearningPlanResourceDueDateUsingPOST(
    @Body LearningPlanResourceRequest learningPlanResourceRequest
  );

  /**
   * updateLearningPlanResourceType
   * 
   * @param learningPlanResourceUuid learningPlanResourceUuid (required)
   * @param learningPlanResourceType learningPlanResourceType (required)
   * @return Call&lt;LearningPlanResourceResponse&gt;
   */
  
  @DELETE("data/updateLearningPlanResourceType/{learningPlanResourceUuid}/{learningPlanResourceType}")
  Call<LearningPlanResourceResponse> updateLearningPlanResourceTypeUsingDELETE(
    @Path("learningPlanResourceUuid") String learningPlanResourceUuid, @Path("learningPlanResourceType") String learningPlanResourceType
  );

  /**
   * updateLearningPlanResourceType
   * 
   * @param learningPlanResourceUuid learningPlanResourceUuid (required)
   * @param learningPlanResourceType learningPlanResourceType (required)
   * @return Call&lt;LearningPlanResourceResponse&gt;
   */
  
  @GET("data/updateLearningPlanResourceType/{learningPlanResourceUuid}/{learningPlanResourceType}")
  Call<LearningPlanResourceResponse> updateLearningPlanResourceTypeUsingGET(
    @Path("learningPlanResourceUuid") String learningPlanResourceUuid, @Path("learningPlanResourceType") String learningPlanResourceType
  );

  /**
   * updateLearningPlanResourceType
   * 
   * @param learningPlanResourceUuid learningPlanResourceUuid (required)
   * @param learningPlanResourceType learningPlanResourceType (required)
   * @return Call&lt;LearningPlanResourceResponse&gt;
   */
  
  @HEAD("data/updateLearningPlanResourceType/{learningPlanResourceUuid}/{learningPlanResourceType}")
  Call<LearningPlanResourceResponse> updateLearningPlanResourceTypeUsingHEAD(
    @Path("learningPlanResourceUuid") String learningPlanResourceUuid, @Path("learningPlanResourceType") String learningPlanResourceType
  );

  /**
   * updateLearningPlanResourceType
   * 
   * @param learningPlanResourceUuid learningPlanResourceUuid (required)
   * @param learningPlanResourceType learningPlanResourceType (required)
   * @return Call&lt;LearningPlanResourceResponse&gt;
   */
  
  @OPTIONS("data/updateLearningPlanResourceType/{learningPlanResourceUuid}/{learningPlanResourceType}")
  Call<LearningPlanResourceResponse> updateLearningPlanResourceTypeUsingOPTIONS(
    @Path("learningPlanResourceUuid") String learningPlanResourceUuid, @Path("learningPlanResourceType") String learningPlanResourceType
  );

  /**
   * updateLearningPlanResourceType
   * 
   * @param learningPlanResourceUuid learningPlanResourceUuid (required)
   * @param learningPlanResourceType learningPlanResourceType (required)
   * @return Call&lt;LearningPlanResourceResponse&gt;
   */
  
  @PATCH("data/updateLearningPlanResourceType/{learningPlanResourceUuid}/{learningPlanResourceType}")
  Call<LearningPlanResourceResponse> updateLearningPlanResourceTypeUsingPATCH(
    @Path("learningPlanResourceUuid") String learningPlanResourceUuid, @Path("learningPlanResourceType") String learningPlanResourceType
  );

  /**
   * updateLearningPlanResourceType
   * 
   * @param learningPlanResourceUuid learningPlanResourceUuid (required)
   * @param learningPlanResourceType learningPlanResourceType (required)
   * @return Call&lt;LearningPlanResourceResponse&gt;
   */
  
  @POST("data/updateLearningPlanResourceType/{learningPlanResourceUuid}/{learningPlanResourceType}")
  Call<LearningPlanResourceResponse> updateLearningPlanResourceTypeUsingPOST(
    @Path("learningPlanResourceUuid") String learningPlanResourceUuid, @Path("learningPlanResourceType") String learningPlanResourceType
  );

  /**
   * updateLearningPlanResourceType
   * 
   * @param learningPlanResourceUuid learningPlanResourceUuid (required)
   * @param learningPlanResourceType learningPlanResourceType (required)
   * @return Call&lt;LearningPlanResourceResponse&gt;
   */
  
  @PUT("data/updateLearningPlanResourceType/{learningPlanResourceUuid}/{learningPlanResourceType}")
  Call<LearningPlanResourceResponse> updateLearningPlanResourceTypeUsingPUT(
    @Path("learningPlanResourceUuid") String learningPlanResourceUuid, @Path("learningPlanResourceType") String learningPlanResourceType
  );

  /**
   * updateLearningPlan
   * 
   * @param lecturePlanDTO lecturePlanDTO (required)
   * @param lecturePlanUuid lecturePlanUuid (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @DELETE("data/updateLecturePlan/{lecturePlanUuid}/{sectionId}")
  Call<Void> updateLearningPlanUsingDELETE(
    @Body LecturePlanDTO lecturePlanDTO, @Path("lecturePlanUuid") String lecturePlanUuid, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateLearningPlan
   * 
   * @param dtoList dtoList (required)
   * @return Call&lt;Void&gt;
   */
  
  @DELETE("data/updateLectureResourceSeq")
  Call<Void> updateLearningPlanUsingDELETE1(
    @Body List<LearningPlanResourceDTO> dtoList
  );

  /**
   * updateLearningPlan
   * 
   * @param lecturePlanDTO lecturePlanDTO (required)
   * @param lecturePlanUuid lecturePlanUuid (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/updateLecturePlan/{lecturePlanUuid}/{sectionId}")
  Call<Void> updateLearningPlanUsingGET(
    @Body LecturePlanDTO lecturePlanDTO, @Path("lecturePlanUuid") String lecturePlanUuid, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateLearningPlan
   * 
   * @param dtoList dtoList (required)
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/updateLectureResourceSeq")
  Call<Void> updateLearningPlanUsingGET1(
    @Body List<LearningPlanResourceDTO> dtoList
  );

  /**
   * updateLearningPlan
   * 
   * @param lecturePlanDTO lecturePlanDTO (required)
   * @param lecturePlanUuid lecturePlanUuid (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @HEAD("data/updateLecturePlan/{lecturePlanUuid}/{sectionId}")
  Call<Void> updateLearningPlanUsingHEAD(
    @Body LecturePlanDTO lecturePlanDTO, @Path("lecturePlanUuid") String lecturePlanUuid, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateLearningPlan
   * 
   * @param dtoList dtoList (required)
   * @return Call&lt;Void&gt;
   */
  
  @HEAD("data/updateLectureResourceSeq")
  Call<Void> updateLearningPlanUsingHEAD1(
    @Body List<LearningPlanResourceDTO> dtoList
  );

  /**
   * updateLearningPlan
   * 
   * @param lecturePlanDTO lecturePlanDTO (required)
   * @param lecturePlanUuid lecturePlanUuid (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @OPTIONS("data/updateLecturePlan/{lecturePlanUuid}/{sectionId}")
  Call<Void> updateLearningPlanUsingOPTIONS(
    @Body LecturePlanDTO lecturePlanDTO, @Path("lecturePlanUuid") String lecturePlanUuid, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateLearningPlan
   * 
   * @param dtoList dtoList (required)
   * @return Call&lt;Void&gt;
   */
  
  @OPTIONS("data/updateLectureResourceSeq")
  Call<Void> updateLearningPlanUsingOPTIONS1(
    @Body List<LearningPlanResourceDTO> dtoList
  );

  /**
   * updateLearningPlan
   * 
   * @param lecturePlanDTO lecturePlanDTO (required)
   * @param lecturePlanUuid lecturePlanUuid (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @PATCH("data/updateLecturePlan/{lecturePlanUuid}/{sectionId}")
  Call<Void> updateLearningPlanUsingPATCH(
    @Body LecturePlanDTO lecturePlanDTO, @Path("lecturePlanUuid") String lecturePlanUuid, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateLearningPlan
   * 
   * @param dtoList dtoList (required)
   * @return Call&lt;Void&gt;
   */
  
  @PATCH("data/updateLectureResourceSeq")
  Call<Void> updateLearningPlanUsingPATCH1(
    @Body List<LearningPlanResourceDTO> dtoList
  );

  /**
   * updateLearningPlan
   * 
   * @param learningPlanUuid learningPlanUuid (required)
   * @return Call&lt;String&gt;
   */
  
  @POST("data/updateLearningPlan/{learningPlanUuid}")
  Call<String> updateLearningPlanUsingPOST(
    @Path("learningPlanUuid") String learningPlanUuid
  );

  /**
   * updateLearningPlan
   * 
   * @param lecturePlanDTO lecturePlanDTO (required)
   * @param lecturePlanUuid lecturePlanUuid (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @POST("data/updateLecturePlan/{lecturePlanUuid}/{sectionId}")
  Call<Void> updateLearningPlanUsingPOST1(
    @Body LecturePlanDTO lecturePlanDTO, @Path("lecturePlanUuid") String lecturePlanUuid, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateLearningPlan
   * 
   * @param dtoList dtoList (required)
   * @return Call&lt;Void&gt;
   */
  
  @POST("data/updateLectureResourceSeq")
  Call<Void> updateLearningPlanUsingPOST2(
    @Body List<LearningPlanResourceDTO> dtoList
  );

  /**
   * updateLearningPlan
   * 
   * @param lecturePlanDTO lecturePlanDTO (required)
   * @param lecturePlanUuid lecturePlanUuid (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @PUT("data/updateLecturePlan/{lecturePlanUuid}/{sectionId}")
  Call<Void> updateLearningPlanUsingPUT(
    @Body LecturePlanDTO lecturePlanDTO, @Path("lecturePlanUuid") String lecturePlanUuid, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateLearningPlan
   * 
   * @param dtoList dtoList (required)
   * @return Call&lt;Void&gt;
   */
  
  @PUT("data/updateLectureResourceSeq")
  Call<Void> updateLearningPlanUsingPUT1(
    @Body List<LearningPlanResourceDTO> dtoList
  );

  /**
   * updateLearningPlansTasksBasedOnUuid
   * 
   * @param taskUpdateRequests taskUpdateRequests (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Response&gt;
   */
  
  @POST("data/updateTasks")
  Call<Response> updateLearningPlansTasksBasedOnUuidUsingPOST(
    @Body List<LearningPlanTaskUpdateRequest> taskUpdateRequests, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateLectureResourceDetail
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LectureResourceResponse&gt;
   */
  
  @DELETE("data/updateLectureResourceDetail")
  Call<LectureResourceResponse> updateLectureResourceDetailUsingDELETE(
    @Body LearningPlanResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateLectureResourceDetail
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LectureResourceResponse&gt;
   */
  
  @GET("data/updateLectureResourceDetail")
  Call<LectureResourceResponse> updateLectureResourceDetailUsingGET(
    @Body LearningPlanResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateLectureResourceDetail
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LectureResourceResponse&gt;
   */
  
  @HEAD("data/updateLectureResourceDetail")
  Call<LectureResourceResponse> updateLectureResourceDetailUsingHEAD(
    @Body LearningPlanResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateLectureResourceDetail
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LectureResourceResponse&gt;
   */
  
  @OPTIONS("data/updateLectureResourceDetail")
  Call<LectureResourceResponse> updateLectureResourceDetailUsingOPTIONS(
    @Body LearningPlanResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateLectureResourceDetail
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LectureResourceResponse&gt;
   */
  
  @PATCH("data/updateLectureResourceDetail")
  Call<LectureResourceResponse> updateLectureResourceDetailUsingPATCH(
    @Body LearningPlanResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateLectureResourceDetail
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LectureResourceResponse&gt;
   */
  
  @POST("data/updateLectureResourceDetail")
  Call<LectureResourceResponse> updateLectureResourceDetailUsingPOST(
    @Body LearningPlanResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateLectureResourceDetail
   * 
   * @param resourceDTO resourceDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;LectureResourceResponse&gt;
   */
  
  @PUT("data/updateLectureResourceDetail")
  Call<LectureResourceResponse> updateLectureResourceDetailUsingPUT(
    @Body LearningPlanResourceDTO resourceDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

}
