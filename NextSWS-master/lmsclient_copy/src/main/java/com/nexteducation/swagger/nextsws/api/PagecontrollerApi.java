package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.PageRequest;
import com.nexteducation.swagger.nextsws.model.PageResponse;
import com.nexteducation.swagger.nextsws.model.SyllabusResponseV2;
import com.nexteducation.swagger.nextsws.model.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PagecontrollerApi {
  /**
   * addPage
   * 
   * @param pageRequest pageRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;PageResponse&gt;
   */
  
  @POST("data/page/add.app")
  Call<PageResponse> addPageUsingPOST(
    @Body PageRequest pageRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deletePage
   * 
   * @param pageUuid pageUuid (required)
   * @return Call&lt;PageResponse&gt;
   */
  
  @GET("data/page/{pageUuid}/delete.app")
  Call<PageResponse> deletePageUsingGET(
    @Path("pageUuid") String pageUuid
  );

  /**
   * deletePages
   * 
   * @param pageUuids pageUuids (required)
   * @return Call&lt;List<PageResponse>&gt;
   */
  
  @POST("data/page/deletelist")
  Call<List<PageResponse>> deletePagesUsingPOST(
    @Body List<String> pageUuids
  );

  /**
   * getChapterList
   * 
   * @param syllabusId syllabusId (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SyllabusResponseV2&gt;
   */
  
  @GET("nextmentee/subject/{syllabusId}/getChapterList")
  Call<SyllabusResponseV2> getChapterListUsingGET(
    @Path("syllabusId") Long syllabusId, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSubjectPageByChapter
   * 
   * @param syllabusId syllabusId (required)
   * @param reference reference (required)
   * @param noteBookUuid noteBookUuid (required)
   * @param noteBookName noteBookName (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param subjectName subjectName (optional)
   * @param chapterId chapterId (optional)
   * @param schoolSubjectName schoolSubjectName (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/subject/{syllabusId}/{reference}/pageinChapter")
  Call<ModelAndView> getSubjectPageByChapterUsingGET(
    @Path("syllabusId") Long syllabusId, @Path("reference") String reference, @Query("noteBookUuid") String noteBookUuid, @Query("noteBookName") String noteBookName, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("subjectName") String subjectName, @Query("chapterId") String chapterId, @Query("schoolSubjectName") String schoolSubjectName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSubjectPage
   * 
   * @param syllabusId syllabusId (required)
   * @param noteBookName noteBookName (required)
   * @param noteBookUuid noteBookUuid (required)
   * @param ifCustomSyllabus ifCustomSyllabus (optional)
   * @param subjectName subjectName (optional)
   * @param chapterId chapterId (optional)
   * @param schoolSubjectName schoolSubjectName (optional)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/subject/{syllabusId}/page.app")
  Call<ModelAndView> getSubjectPageUsingGET1(
    @Path("syllabusId") Long syllabusId, @Query("noteBookName") String noteBookName, @Query("noteBookUuid") String noteBookUuid, @Query("ifCustomSyllabus") Boolean ifCustomSyllabus, @Query("subjectName") String subjectName, @Query("chapterId") String chapterId, @Query("schoolSubjectName") String schoolSubjectName, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * listPageByNoteBook
   * 
   * @param noteBookUuid noteBookUuid (required)
   * @return Call&lt;List<PageResponse>&gt;
   */
  
  @GET("data/page/{noteBookUuid}/listactivepagebynotebook")
  Call<List<PageResponse>> listPageByNoteBookUsingGET(
    @Path("noteBookUuid") String noteBookUuid
  );

  /**
   * listPage
   * 
   * @param tenantId tenantId (required)
   * @return Call&lt;List<PageResponse>&gt;
   */
  
  @GET("data/page/listpagebybranch.app")
  Call<List<PageResponse>> listPageUsingGET(
    @Path("tenantId") Long tenantId
  );

  /**
   * updatePage
   * 
   * @param pageRequest pageRequest (required)
   * @return Call&lt;PageResponse&gt;
   */
  
  @POST("data/page/update.app")
  Call<PageResponse> updatePageUsingPOST(
    @Body PageRequest pageRequest
  );

}
