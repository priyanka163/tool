package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.AssetResponse;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.NoteResponse;
import com.nexteducation.swagger.nextsws.model.NoteRequest;
import com.nexteducation.swagger.nextsws.model.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface NotecontrollerApi {
  /**
   * addNoteFile
   * 
   * @param file file (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;AssetResponse&gt;
   */
  
  @Multipart
  @POST("data/note/addFile")
  Call<AssetResponse> addNoteFileUsingPOST(
    @Part("file") String file, @Body SessionParams sessionParams
  );

  /**
   * addNote
   * 
   * @param noteRequest noteRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;NoteResponse&gt;
   */
  
  @POST("data/note/add")
  Call<NoteResponse> addNoteUsingPOST(
    @Body NoteRequest noteRequest, @Body SessionParams sessionParams
  );

  /**
   * deleteNote
   * 
   * @param noteUuid noteUuid (required)
   * @return Call&lt;NoteResponse&gt;
   */
  
  @GET("data/note/{noteUuid}/delete")
  Call<NoteResponse> deleteNoteUsingGET(
    @Path("noteUuid") String noteUuid
  );

  /**
   * getNoteById
   * 
   * @param noteId noteId (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/subject/{noteId}/getnotebyid")
  Call<ModelAndView> getNoteByIdUsingGET(
    @Path("noteId") Long noteId
  );

  /**
   * getSubjectPage
   * 
   * @param syllabusId syllabusId (required)
   * @param pageUuid pageUuid (required)
   * @param pageName pageName (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param subjectName subjectName (optional)
   * @param schoolSubjectName schoolSubjectName (optional)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/subject/{syllabusId}/note")
  Call<ModelAndView> getSubjectPageUsingGET(
    @Path("syllabusId") Long syllabusId, @Query("pageUuid") String pageUuid, @Query("pageName") String pageName, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("subjectName") String subjectName, @Query("schoolSubjectName") String schoolSubjectName, @Body SessionParams sessionParams
  );

  /**
   * listNoteByBranch
   * 
   * @param tenantId tenantId (required)
   * @return Call&lt;List<NoteResponse>&gt;
   */
  
  @GET("data/note/listbybranch/{tenantId}")
  Call<List<NoteResponse>> listNoteByBranchUsingGET(
    @Path("tenantId") Long tenantId
  );

  /**
   * listNoteById
   * 
   * @param id id (required)
   * @return Call&lt;NoteResponse&gt;
   */
  
  @GET("data/note/listbyid/{id}")
  Call<NoteResponse> listNoteByIdUsingGET(
    @Path("id") Long id
  );

  /**
   * listNoteByPage
   * 
   * @param pageuuid pageuuid (required)
   * @return Call&lt;List<NoteResponse>&gt;
   */
  
  @GET("data/note/listactivenotesofpage/{pageuuid}")
  Call<List<NoteResponse>> listNoteByPageUsingGET(
    @Path("pageuuid") String pageuuid
  );

  /**
   * updateNote
   * 
   * @param noteRequest noteRequest (required)
   * @return Call&lt;NoteResponse&gt;
   */
  
  @POST("data/note/update")
  Call<NoteResponse> updateNoteUsingPOST(
    @Body NoteRequest noteRequest
  );

}
