package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.NoteBookRequest;
import com.nexteducation.swagger.nextsws.model.NoteBookResponse;
import com.nexteducation.swagger.nextsws.model.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface NotebookcontrollerApi {
  /**
   * addNoteBook
   * 
   * @param noteBookRequest noteBookRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;NoteBookResponse&gt;
   */
  
  @POST("data/notebook/add.app")
  Call<NoteBookResponse> addNoteBookUsingPOST(
    @Body NoteBookRequest noteBookRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteNoteBook
   * 
   * @param noteBookUuid noteBookUuid (required)
   * @return Call&lt;NoteBookResponse&gt;
   */
  
  @GET("data/notebook/{noteBookUuid}/delete.app")
  Call<NoteBookResponse> deleteNoteBookUsingGET(
    @Path("noteBookUuid") String noteBookUuid
  );

  /**
   * deleteNoteBooks
   * 
   * @param noteBookUuids noteBookUuids (required)
   * @return Call&lt;List<NoteBookResponse>&gt;
   */
  
  @POST("data/notebook/deletenotebooks")
  Call<List<NoteBookResponse>> deleteNoteBooksUsingPOST(
    @Body List<String> noteBookUuids
  );

  /**
   * getNoteBookByBranch
   * 
   * @param tenantId tenantId (required)
   * @return Call&lt;List<NoteBookResponse>&gt;
   */
  
  @GET("data/notebook/{tenantId}/getnotebooksbybranch.app")
  Call<List<NoteBookResponse>> getNoteBookByBranchUsingGET(
    @Path("tenantId") Long tenantId
  );

  /**
   * getNoteBookBySubjects
   * 
   * @param syllabusId syllabusId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<NoteBookResponse>&gt;
   */
  
  @GET("data/notebook/getnotebooksbysyllabus/{syllabusId}")
  Call<List<NoteBookResponse>> getNoteBookBySubjectsUsingGET(
    @Path("syllabusId") Long syllabusId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getNoteBookByUuids
   * 
   * @param noteBookRequest noteBookRequest (required)
   * @return Call&lt;List<NoteBookResponse>&gt;
   */
  
  @POST("data/notebook/getnotebooksbyuuid.app")
  Call<List<NoteBookResponse>> getNoteBookByUuidsUsingPOST(
    @Body NoteBookRequest noteBookRequest
  );

  /**
   * getNoteBooks
   * 
   * @param syllabusId syllabusId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param subjectName subjectName (optional)
   * @param chapterId chapterId (optional)
   * @param schoolSubjectName schoolSubjectName (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/subject/{syllabusId}/notebook.app")
  Call<ModelAndView> getNoteBooksUsingGET(
    @Path("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("subjectName") String subjectName, @Query("chapterId") String chapterId, @Query("schoolSubjectName") String schoolSubjectName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * listNoteBooks
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<NoteBookResponse>&gt;
   */
  
  @GET("data/notebook/getnotebooks")
  Call<List<NoteBookResponse>> listNoteBooksUsingGET(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateNoteBook
   * 
   * @param noteBookRequest noteBookRequest (required)
   * @return Call&lt;NoteBookResponse&gt;
   */
  
  @POST("data/notebook/update.app")
  Call<NoteBookResponse> updateNoteBookUsingPOST(
    @Body NoteBookRequest noteBookRequest
  );

}
