package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.LearningPlanResourceResponse;
import com.nexteducation.swagger.nextsws.model.LPResourceRequest;
import com.nexteducation.swagger.nextsws.model.SessionParams;
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
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<LearningPlanResourceResponse>&gt;
   */
  
  @POST("data/addLearningPlanResource/{classId}/{subjectId}/{sectionId}/{learningPlanMemberUuid}")
  Call<List<LearningPlanResourceResponse>> addLearningPlanResourceUsingPOST(
    @Body List<LPResourceRequest> resourceRequests, @Path("learningPlanMemberUuid") String learningPlanMemberUuid, @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("subjectId") Long subjectId, @Body SessionParams sessionParams
  );

  /**
   * addLectureResource
   * 
   * @param resourceUuids resourceUuids (required)
   * @param learningPlanMemberUuid learningPlanMemberUuid (required)
   * @param sectionId sectionId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<LectureResourceResponse>&gt;
   */
  
  @POST("data/addLectureResource/{learningPlanMemberUuid}/{sectionId}")
  Call<List<LectureResourceResponse>> addLectureResourceUsingPOST(
    @Body List<String> resourceUuids, @Path("learningPlanMemberUuid") String learningPlanMemberUuid, @Path("sectionId") Long sectionId, @Body SessionParams sessionParams
  );

  /**
   * deleteLearningPlanResource
   * 
   * @param resourceUuid resourceUuid (required)
   * @param learningPlanMemberUuid learningPlanMemberUuid (required)
   * @param sectionId sectionId (required)
   * @param classId classId (required)
   * @param subjectId subjectId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;String&gt;
   */
  
  @GET("data/deleteLearningPlanResource/{classId}/{subjectId}/{sectionId}/{learningPlanMemberUuid}/{resourceUuid}")
  Call<String> deleteLearningPlanResourceUsingGET(
    @Path("resourceUuid") String resourceUuid, @Path("learningPlanMemberUuid") String learningPlanMemberUuid, @Path("sectionId") Long sectionId, @Path("classId") Long classId, @Path("subjectId") Long subjectId, @Body SessionParams sessionParams
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
   * fetchChapterDetails
   * 
   * @param subjectId subjectId (required)
   * @param sectionId sectionId (required)
   * @param studyClassId studyClassId (required)
   * @param chapterList chapterList (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Map<String, List>&gt;
   */
  
  @GET("data/chapterList/{subjectId}/{sectionId}/{studyClassId}")
  Call<Map<String, List>> fetchChapterDetailsUsingGET(
    @Path("subjectId") Long subjectId, @Path("sectionId") Long sectionId, @Path("studyClassId") Long studyClassId, @Body List<SyllabusNodeResponse> chapterList, @Body SessionParams sessionParams
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
   * fetchLearningPlanTasks
   * 
   * @param fetchRequest fetchRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<LearningPlanTaskResponse>&gt;
   */
  
  @POST("data/fetchlearningplantask")
  Call<List<LearningPlanTaskResponse>> fetchLearningPlanTasksUsingPOST(
    @Body LearningPlanTaskFetchRequest fetchRequest, @Body SessionParams sessionParams
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
   * fetchUserTasks
   * 
   * @param fetchRequest fetchRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<LearningPlanTaskDetailResponse>&gt;
   */
  
  @POST("data/fetchusertask")
  Call<List<LearningPlanTaskDetailResponse>> fetchUserTasksUsingPOST(
    @Body TaskFetchRequest fetchRequest, @Body SessionParams sessionParams
  );

  /**
   * getCompletionCount
   * 
   * @param subjectId subjectId (required)
   * @param sectionId sectionId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<LearningPlanChapterResponse>&gt;
   */
  
  @GET("data/getCompletionCount/{subjectId}/{sectionId}")
  Call<List<LearningPlanChapterResponse>> getCompletionCountUsingGET(
    @Path("subjectId") Long subjectId, @Path("sectionId") Long sectionId, @Body SessionParams sessionParams
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
   * getLearningPlanTaskBasedOnLearningPlanMemberUuid
   * 
   * @param fetchRequest fetchRequest (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;LearningPlanHomeworkTaskResponse&gt;
   */
  
  @GET("data/getLearningPlanTaskBasedOnLearningPlanMemberUuid")
  Call<LearningPlanHomeworkTaskResponse> getLearningPlanTaskBasedOnLearningPlanMemberUuidUsingGET(
    @Body LearningPlanTaskFetchRequest fetchRequest, @Query("classId") Long classId, @Query("sectionId") Long sectionId, @Body SessionParams sessionParams
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
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<StudyPlanResponse>&gt;
   */
  
  @POST("data/getStudyPlansBasedOnFilter")
  Call<List<StudyPlanResponse>> getStudyPlansBasedOnFilterUsingPOST(
    @Body LectureBreakupRequest lectureBreakupRequest, @Body SessionParams sessionParams
  );

  /**
   * insertLearningPlan
   * 
   * @param breakupDTO breakupDTO (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/insertLecturePlan")
  Call<Object> insertLearningPlanUsingPOST(
    @Body LectureBreakupDTO breakupDTO, @Body SessionParams sessionParams
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
  
  @GET("data/updateLearningPlanResourceType/{learningPlanResourceUuid}/{learningPlanResourceType}")
  Call<LearningPlanResourceResponse> updateLearningPlanResourceTypeUsingGET(
    @Path("learningPlanResourceUuid") String learningPlanResourceUuid, @Path("learningPlanResourceType") String learningPlanResourceType
  );

  /**
   * updateLearningPlan
   * 
   * @param lecturePlanDTO lecturePlanDTO (required)
   * @param lecturePlanUuid lecturePlanUuid (required)
   * @param sectionId sectionId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/updateLecturePlan/{lecturePlanUuid}/{sectionId}")
  Call<Void> updateLearningPlanUsingGET(
    @Body LecturePlanDTO lecturePlanDTO, @Path("lecturePlanUuid") String lecturePlanUuid, @Path("sectionId") Long sectionId, @Body SessionParams sessionParams
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
   * @param learningPlanUuid learningPlanUuid (required)
   * @return Call&lt;String&gt;
   */
  
  @POST("data/updateLearningPlan/{learningPlanUuid}")
  Call<String> updateLearningPlanUsingPOST(
    @Path("learningPlanUuid") String learningPlanUuid
  );

  /**
   * updateLearningPlansTasksBasedOnUuid
   * 
   * @param taskUpdateRequests taskUpdateRequests (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Response&gt;
   */
  
  @POST("data/updateTasks")
  Call<Response> updateLearningPlansTasksBasedOnUuidUsingPOST(
    @Body List<LearningPlanTaskUpdateRequest> taskUpdateRequests, @Body SessionParams sessionParams
  );

  /**
   * updateLectureResourceDetail
   * 
   * @param resourceDTO resourceDTO (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;LectureResourceResponse&gt;
   */
  
  @GET("data/updateLectureResourceDetail")
  Call<LectureResourceResponse> updateLectureResourceDetailUsingGET(
    @Body LearningPlanResourceDTO resourceDTO, @Body SessionParams sessionParams
  );

}
