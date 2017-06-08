package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.AssignmentSubmissionAttachmentResponse;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.AssignmentSubmissionResponse;
import com.nexteducation.swagger.nextsws.model.DocResponse;
import com.nexteducation.swagger.nextsws.model.AssignmentResponse;
import java.io.File;

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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/assignment/get/{assignmentAssetuuid}")
  Call<ModelAndView> getAssignmentDetailUsingGET(
    @Path("assignmentAssetuuid") String assignmentAssetuuid, @Query("lpmuuid") String lpmuuid, @Query("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("ifCustomChapter") Boolean ifCustomChapter, @Query("chapterId") Long chapterId, @Query("resourceLocation") String resourceLocation, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getAssignmentSubmission
   * 
   * @param assignmentUUID assignmentUUID (required)
   * @param userId userId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId2 Session Parameter - User Id (optional)
   * @return Call&lt;AssignmentSubmissionResponse&gt;
   */
  
  @GET("data/assignment/displayattachment/{assignmentUUID}/{userId}")
  Call<AssignmentSubmissionResponse> getAssignmentSubmissionUsingGET(
    @Path("assignmentUUID") String assignmentUUID, @Path("userId") String userId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId2
  );

  /**
   * getAssignmentSubmission
   * 
   * @param assignmentUUID assignmentUUID (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;AssignmentSubmissionResponse&gt;
   */
  
  @GET("nextmentee/assignment/displayattachment/{assignmentUUID}")
  Call<AssignmentSubmissionResponse> getAssignmentSubmissionUsingGET1(
    @Path("assignmentUUID") String assignmentUUID, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * saveDocument
   * 
   * @param branchId branchId (optional)
   * @param fileName fileName (optional, default to NewFile)
   * @return Call&lt;DocResponse&gt;
   */
  
  @DELETE("data/saveAssignmentDocFile")
  Call<DocResponse> saveDocumentUsingDELETE(
    @Query("branchId") Long branchId, @Query("fileName") String fileName
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
   * saveDocument
   * 
   * @param branchId branchId (optional)
   * @param fileName fileName (optional, default to NewFile)
   * @return Call&lt;DocResponse&gt;
   */
  
  @HEAD("data/saveAssignmentDocFile")
  Call<DocResponse> saveDocumentUsingHEAD(
    @Query("branchId") Long branchId, @Query("fileName") String fileName
  );

  /**
   * saveDocument
   * 
   * @param branchId branchId (optional)
   * @param fileName fileName (optional, default to NewFile)
   * @return Call&lt;DocResponse&gt;
   */
  
  @OPTIONS("data/saveAssignmentDocFile")
  Call<DocResponse> saveDocumentUsingOPTIONS(
    @Query("branchId") Long branchId, @Query("fileName") String fileName
  );

  /**
   * saveDocument
   * 
   * @param branchId branchId (optional)
   * @param fileName fileName (optional, default to NewFile)
   * @return Call&lt;DocResponse&gt;
   */
  
  @PATCH("data/saveAssignmentDocFile")
  Call<DocResponse> saveDocumentUsingPATCH(
    @Query("branchId") Long branchId, @Query("fileName") String fileName
  );

  /**
   * saveDocument
   * 
   * @param branchId branchId (optional)
   * @param fileName fileName (optional, default to NewFile)
   * @return Call&lt;DocResponse&gt;
   */
  
  @POST("data/saveAssignmentDocFile")
  Call<DocResponse> saveDocumentUsingPOST(
    @Query("branchId") Long branchId, @Query("fileName") String fileName
  );

  /**
   * saveDocument
   * 
   * @param branchId branchId (optional)
   * @param fileName fileName (optional, default to NewFile)
   * @return Call&lt;DocResponse&gt;
   */
  
  @PUT("data/saveAssignmentDocFile")
  Call<DocResponse> saveDocumentUsingPUT(
    @Query("branchId") Long branchId, @Query("fileName") String fileName
  );

  /**
   * savePresentation
   * 
   * @param branchId branchId (optional)
   * @param fileName fileName (optional, default to NewFile)
   * @return Call&lt;DocResponse&gt;
   */
  
  @DELETE("data/saveAssignmentPresentation")
  Call<DocResponse> savePresentationUsingDELETE(
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
   * savePresentation
   * 
   * @param branchId branchId (optional)
   * @param fileName fileName (optional, default to NewFile)
   * @return Call&lt;DocResponse&gt;
   */
  
  @HEAD("data/saveAssignmentPresentation")
  Call<DocResponse> savePresentationUsingHEAD(
    @Query("branchId") Long branchId, @Query("fileName") String fileName
  );

  /**
   * savePresentation
   * 
   * @param branchId branchId (optional)
   * @param fileName fileName (optional, default to NewFile)
   * @return Call&lt;DocResponse&gt;
   */
  
  @OPTIONS("data/saveAssignmentPresentation")
  Call<DocResponse> savePresentationUsingOPTIONS(
    @Query("branchId") Long branchId, @Query("fileName") String fileName
  );

  /**
   * savePresentation
   * 
   * @param branchId branchId (optional)
   * @param fileName fileName (optional, default to NewFile)
   * @return Call&lt;DocResponse&gt;
   */
  
  @PATCH("data/saveAssignmentPresentation")
  Call<DocResponse> savePresentationUsingPATCH(
    @Query("branchId") Long branchId, @Query("fileName") String fileName
  );

  /**
   * savePresentation
   * 
   * @param branchId branchId (optional)
   * @param fileName fileName (optional, default to NewFile)
   * @return Call&lt;DocResponse&gt;
   */
  
  @POST("data/saveAssignmentPresentation")
  Call<DocResponse> savePresentationUsingPOST(
    @Query("branchId") Long branchId, @Query("fileName") String fileName
  );

  /**
   * savePresentation
   * 
   * @param branchId branchId (optional)
   * @param fileName fileName (optional, default to NewFile)
   * @return Call&lt;DocResponse&gt;
   */
  
  @PUT("data/saveAssignmentPresentation")
  Call<DocResponse> savePresentationUsingPUT(
    @Query("branchId") Long branchId, @Query("fileName") String fileName
  );

  /**
   * saveSpreadSheet
   * 
   * @param branchId branchId (optional)
   * @param fileName fileName (optional, default to NewFile)
   * @return Call&lt;DocResponse&gt;
   */
  
  @DELETE("data/saveAssignmentSpreadSheet")
  Call<DocResponse> saveSpreadSheetUsingDELETE(
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
   * saveSpreadSheet
   * 
   * @param branchId branchId (optional)
   * @param fileName fileName (optional, default to NewFile)
   * @return Call&lt;DocResponse&gt;
   */
  
  @HEAD("data/saveAssignmentSpreadSheet")
  Call<DocResponse> saveSpreadSheetUsingHEAD(
    @Query("branchId") Long branchId, @Query("fileName") String fileName
  );

  /**
   * saveSpreadSheet
   * 
   * @param branchId branchId (optional)
   * @param fileName fileName (optional, default to NewFile)
   * @return Call&lt;DocResponse&gt;
   */
  
  @OPTIONS("data/saveAssignmentSpreadSheet")
  Call<DocResponse> saveSpreadSheetUsingOPTIONS(
    @Query("branchId") Long branchId, @Query("fileName") String fileName
  );

  /**
   * saveSpreadSheet
   * 
   * @param branchId branchId (optional)
   * @param fileName fileName (optional, default to NewFile)
   * @return Call&lt;DocResponse&gt;
   */
  
  @PATCH("data/saveAssignmentSpreadSheet")
  Call<DocResponse> saveSpreadSheetUsingPATCH(
    @Query("branchId") Long branchId, @Query("fileName") String fileName
  );

  /**
   * saveSpreadSheet
   * 
   * @param branchId branchId (optional)
   * @param fileName fileName (optional, default to NewFile)
   * @return Call&lt;DocResponse&gt;
   */
  
  @POST("data/saveAssignmentSpreadSheet")
  Call<DocResponse> saveSpreadSheetUsingPOST(
    @Query("branchId") Long branchId, @Query("fileName") String fileName
  );

  /**
   * saveSpreadSheet
   * 
   * @param branchId branchId (optional)
   * @param fileName fileName (optional, default to NewFile)
   * @return Call&lt;DocResponse&gt;
   */
  
  @PUT("data/saveAssignmentSpreadSheet")
  Call<DocResponse> saveSpreadSheetUsingPUT(
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Object&gt;
   */
  
  @POST("nextmentee/assignmentSubmission/add")
  Call<Object> submitAssignmentUsingPOST(
    @Query("file") List<File> file, @Query("assignmentUUID") String assignmentUUID, @Query("publish") String publish, @Query("fileuuidlist") List<String> fileuuidlist, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

}
