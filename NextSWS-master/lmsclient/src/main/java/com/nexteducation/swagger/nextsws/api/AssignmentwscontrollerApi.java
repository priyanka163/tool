package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.AssignmentSubmissionAttachmentResponse;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.AssignmentSubmissionResponse;
import com.nexteducation.swagger.nextsws.model.DocResponse;
import com.nexteducation.swagger.nextsws.model.AssignmentResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AssignmentwscontrollerApi {
  /**
   * deleteAssignmentSubmissionAttachment
   * 
   * @param assignmentSubmissionAttachmentUuid assignmentSubmissionAttachmentUuid (required)
   * @return Call&lt;AssignmentSubmissionAttachmentResponse&gt;
   */
  
  @GET("nextmentee/assignment/deleteattachment/{assignmentSubmissionAttachmentUuid}")
  Call<AssignmentSubmissionAttachmentResponse> deleteAssignmentSubmissionAttachmentUsingGET(
    @Path("assignmentSubmissionAttachmentUuid") String assignmentSubmissionAttachmentUuid
  );

  /**
   * getAssignmentDetail
   * 
   * @param assignmentAssetuuid assignmentAssetuuid (required)
   * @param lpmuuid lpmuuid (required)
   * @param syllabusId syllabusId (optional)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param ifCustomChapter ifCustomChapter (optional)
   * @param chapterId chapterId (optional)
   * @param resourceLocation resourceLocation (optional)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/assignment/get/{assignmentAssetuuid}")
  Call<ModelAndView> getAssignmentDetailUsingGET(
    @Path("assignmentAssetuuid") String assignmentAssetuuid, @Query("lpmuuid") String lpmuuid, @Query("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("chapterId") Long chapterId, @Query("resourceLocation") String resourceLocation, @Body SessionParams sessionParams
  );

  /**
   * getAssignmentSubmission
   * 
   * @param assignmentUUID assignmentUUID (required)
   * @param userId userId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;AssignmentSubmissionResponse&gt;
   */
  
  @GET("data/assignment/displayattachment/{assignmentUUID}/{userId}")
  Call<AssignmentSubmissionResponse> getAssignmentSubmissionUsingGET(
    @Path("assignmentUUID") String assignmentUUID, @Path("userId") String userId, @Body SessionParams sessionParams
  );

  /**
   * getAssignmentSubmission
   * 
   * @param assignmentUUID assignmentUUID (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;AssignmentSubmissionResponse&gt;
   */
  
  @GET("nextmentee/assignment/displayattachment/{assignmentUUID}")
  Call<AssignmentSubmissionResponse> getAssignmentSubmissionUsingGET1(
    @Path("assignmentUUID") String assignmentUUID, @Body SessionParams sessionParams
  );

  /**
   * saveDocument
   * 
   * @param branchId branchId (optional)
   * @param fileName fileName (optional, default to NewFile)
   * @return Call&lt;DocResponse&gt;
   */
  
  @GET("data/saveAssignmentDocFile")
  Call<DocResponse> saveDocumentUsingGET(
    @Query("branchId") Long branchId, @Query("fileName") String fileName
  );

  /**
   * savePresentation
   * 
   * @param branchId branchId (optional)
   * @param fileName fileName (optional, default to NewFile)
   * @return Call&lt;DocResponse&gt;
   */
  
  @GET("data/saveAssignmentPresentation")
  Call<DocResponse> savePresentationUsingGET(
    @Query("branchId") Long branchId, @Query("fileName") String fileName
  );

  /**
   * saveSpreadSheet
   * 
   * @param branchId branchId (optional)
   * @param fileName fileName (optional, default to NewFile)
   * @return Call&lt;DocResponse&gt;
   */
  
  @GET("data/saveAssignmentSpreadSheet")
  Call<DocResponse> saveSpreadSheetUsingGET(
    @Query("branchId") Long branchId, @Query("fileName") String fileName
  );

  /**
   * showAssignment
   * 
   * @param assignmentuuid assignmentuuid (required)
   * @return Call&lt;AssignmentResponse&gt;
   */
  
  @GET("nextmentee/assignment/show/{assignmentuuid}")
  Call<AssignmentResponse> showAssignmentUsingGET(
    @Path("assignmentuuid") String assignmentuuid
  );

  /**
   * submitAssignment
   * 
   * @param file file (required)
   * @param assignmentUUID assignmentUUID (required)
   * @param publish publish (required)
   * @param fileuuidlist fileuuidlist (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("nextmentee/assignmentSubmission/add")
  Call<Object> submitAssignmentUsingPOST(
    @Query("file") String file, @Query("assignmentUUID") String assignmentUUID, @Query("publish") String publish, @Query("fileuuidlist") List<String> fileuuidlist, @Body SessionParams sessionParams
  );

}
