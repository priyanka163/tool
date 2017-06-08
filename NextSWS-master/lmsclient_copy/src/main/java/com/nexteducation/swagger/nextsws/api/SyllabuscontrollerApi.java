package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.CustomSyllabusNodeResponse;
import com.nexteducation.swagger.nextsws.model.SyllabusDTO;
import com.nexteducation.swagger.nextsws.model.CustomSyllabusNodeRequest;
import com.nexteducation.swagger.nextsws.model.SyllabusNodeResponse;
import com.nexteducation.swagger.nextsws.model.SyllabusResponse;
import com.nexteducation.swagger.nextsws.model.SyllabusNodeDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SyllabuscontrollerApi {
  /**
   * addChapters
   * 
   * @param syllabusDTO syllabusDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<CustomSyllabusNodeResponse>&gt;
   */
  
  @DELETE("data/addChapterList")
  Call<List<CustomSyllabusNodeResponse>> addChaptersUsingDELETE(
    @Body SyllabusDTO syllabusDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * addChapters
   * 
   * @param syllabusDTO syllabusDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<CustomSyllabusNodeResponse>&gt;
   */
  
  @GET("data/addChapterList")
  Call<List<CustomSyllabusNodeResponse>> addChaptersUsingGET(
    @Body SyllabusDTO syllabusDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * addChapters
   * 
   * @param syllabusDTO syllabusDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<CustomSyllabusNodeResponse>&gt;
   */
  
  @HEAD("data/addChapterList")
  Call<List<CustomSyllabusNodeResponse>> addChaptersUsingHEAD(
    @Body SyllabusDTO syllabusDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * addChapters
   * 
   * @param syllabusDTO syllabusDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<CustomSyllabusNodeResponse>&gt;
   */
  
  @OPTIONS("data/addChapterList")
  Call<List<CustomSyllabusNodeResponse>> addChaptersUsingOPTIONS(
    @Body SyllabusDTO syllabusDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * addChapters
   * 
   * @param syllabusDTO syllabusDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<CustomSyllabusNodeResponse>&gt;
   */
  
  @PATCH("data/addChapterList")
  Call<List<CustomSyllabusNodeResponse>> addChaptersUsingPATCH(
    @Body SyllabusDTO syllabusDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * addChapters
   * 
   * @param syllabusDTO syllabusDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<CustomSyllabusNodeResponse>&gt;
   */
  
  @POST("data/addChapterList")
  Call<List<CustomSyllabusNodeResponse>> addChaptersUsingPOST(
    @Body SyllabusDTO syllabusDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * addChapters
   * 
   * @param syllabusDTO syllabusDTO (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<CustomSyllabusNodeResponse>&gt;
   */
  
  @PUT("data/addChapterList")
  Call<List<CustomSyllabusNodeResponse>> addChaptersUsingPUT(
    @Body SyllabusDTO syllabusDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteChapter
   * 
   * @param nodeRequest nodeRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @DELETE("data/deleteChapter")
  Call<Void> deleteChapterUsingDELETE(
    @Body CustomSyllabusNodeRequest nodeRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteChapter
   * 
   * @param nodeRequest nodeRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/deleteChapter")
  Call<Void> deleteChapterUsingGET(
    @Body CustomSyllabusNodeRequest nodeRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteChapter
   * 
   * @param nodeRequest nodeRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @HEAD("data/deleteChapter")
  Call<Void> deleteChapterUsingHEAD(
    @Body CustomSyllabusNodeRequest nodeRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteChapter
   * 
   * @param nodeRequest nodeRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @OPTIONS("data/deleteChapter")
  Call<Void> deleteChapterUsingOPTIONS(
    @Body CustomSyllabusNodeRequest nodeRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteChapter
   * 
   * @param nodeRequest nodeRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @PATCH("data/deleteChapter")
  Call<Void> deleteChapterUsingPATCH(
    @Body CustomSyllabusNodeRequest nodeRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteChapter
   * 
   * @param nodeRequest nodeRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @POST("data/deleteChapter")
  Call<Void> deleteChapterUsingPOST(
    @Body CustomSyllabusNodeRequest nodeRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteChapter
   * 
   * @param nodeRequest nodeRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @PUT("data/deleteChapter")
  Call<Void> deleteChapterUsingPUT(
    @Body CustomSyllabusNodeRequest nodeRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChaptersBySubjectClassBoard
   * 
   * @param boardId boardId (required)
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param customSyllabus customSyllabus (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SyllabusNodeResponse>&gt;
   */
  
  @DELETE("data/chapterList/{boardId}/{subjectId}/{customSyllabus}/{classId}/{sectionId}.app")
  Call<List<SyllabusNodeResponse>> getChaptersBySubjectClassBoardUsingDELETE(
    @Path("boardId") Long boardId, @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("customSyllabus") Boolean customSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChaptersBySubjectClassBoard
   * 
   * @param boardId boardId (required)
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param customSyllabus customSyllabus (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SyllabusNodeResponse>&gt;
   */
  
  @GET("data/chapterList/{boardId}/{subjectId}/{customSyllabus}/{classId}/{sectionId}.app")
  Call<List<SyllabusNodeResponse>> getChaptersBySubjectClassBoardUsingGET(
    @Path("boardId") Long boardId, @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("customSyllabus") Boolean customSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChaptersBySubjectClassBoard
   * 
   * @param boardId boardId (required)
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param customSyllabus customSyllabus (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SyllabusNodeResponse>&gt;
   */
  
  @HEAD("data/chapterList/{boardId}/{subjectId}/{customSyllabus}/{classId}/{sectionId}.app")
  Call<List<SyllabusNodeResponse>> getChaptersBySubjectClassBoardUsingHEAD(
    @Path("boardId") Long boardId, @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("customSyllabus") Boolean customSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChaptersBySubjectClassBoard
   * 
   * @param boardId boardId (required)
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param customSyllabus customSyllabus (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SyllabusNodeResponse>&gt;
   */
  
  @OPTIONS("data/chapterList/{boardId}/{subjectId}/{customSyllabus}/{classId}/{sectionId}.app")
  Call<List<SyllabusNodeResponse>> getChaptersBySubjectClassBoardUsingOPTIONS(
    @Path("boardId") Long boardId, @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("customSyllabus") Boolean customSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChaptersBySubjectClassBoard
   * 
   * @param boardId boardId (required)
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param customSyllabus customSyllabus (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SyllabusNodeResponse>&gt;
   */
  
  @PATCH("data/chapterList/{boardId}/{subjectId}/{customSyllabus}/{classId}/{sectionId}.app")
  Call<List<SyllabusNodeResponse>> getChaptersBySubjectClassBoardUsingPATCH(
    @Path("boardId") Long boardId, @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("customSyllabus") Boolean customSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChaptersBySubjectClassBoard
   * 
   * @param boardId boardId (required)
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param customSyllabus customSyllabus (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SyllabusNodeResponse>&gt;
   */
  
  @POST("data/chapterList/{boardId}/{subjectId}/{customSyllabus}/{classId}/{sectionId}.app")
  Call<List<SyllabusNodeResponse>> getChaptersBySubjectClassBoardUsingPOST(
    @Path("boardId") Long boardId, @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("customSyllabus") Boolean customSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChaptersBySubjectClassBoard
   * 
   * @param boardId boardId (required)
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param customSyllabus customSyllabus (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SyllabusNodeResponse>&gt;
   */
  
  @PUT("data/chapterList/{boardId}/{subjectId}/{customSyllabus}/{classId}/{sectionId}.app")
  Call<List<SyllabusNodeResponse>> getChaptersBySubjectClassBoardUsingPUT(
    @Path("boardId") Long boardId, @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("customSyllabus") Boolean customSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChapters
   * 
   * @param syllabusId syllabusId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param customSyllabus customSyllabus (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SyllabusNodeResponse>&gt;
   */
  
  @DELETE("data/chapterList/{syllabusId}/{customSyllabus}/{classId}/{sectionId}.app")
  Call<List<SyllabusNodeResponse>> getChaptersUsingDELETE(
    @Path("syllabusId") Long syllabusId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("customSyllabus") Boolean customSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChapters
   * 
   * @param syllabusId syllabusId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param customSyllabus customSyllabus (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SyllabusNodeResponse>&gt;
   */
  
  @GET("data/chapterList/{syllabusId}/{customSyllabus}/{classId}/{sectionId}.app")
  Call<List<SyllabusNodeResponse>> getChaptersUsingGET(
    @Path("syllabusId") Long syllabusId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("customSyllabus") Boolean customSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChapters
   * 
   * @param syllabusId syllabusId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param customSyllabus customSyllabus (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SyllabusNodeResponse>&gt;
   */
  
  @HEAD("data/chapterList/{syllabusId}/{customSyllabus}/{classId}/{sectionId}.app")
  Call<List<SyllabusNodeResponse>> getChaptersUsingHEAD(
    @Path("syllabusId") Long syllabusId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("customSyllabus") Boolean customSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChapters
   * 
   * @param syllabusId syllabusId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param customSyllabus customSyllabus (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SyllabusNodeResponse>&gt;
   */
  
  @OPTIONS("data/chapterList/{syllabusId}/{customSyllabus}/{classId}/{sectionId}.app")
  Call<List<SyllabusNodeResponse>> getChaptersUsingOPTIONS(
    @Path("syllabusId") Long syllabusId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("customSyllabus") Boolean customSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChapters
   * 
   * @param syllabusId syllabusId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param customSyllabus customSyllabus (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SyllabusNodeResponse>&gt;
   */
  
  @PATCH("data/chapterList/{syllabusId}/{customSyllabus}/{classId}/{sectionId}.app")
  Call<List<SyllabusNodeResponse>> getChaptersUsingPATCH(
    @Path("syllabusId") Long syllabusId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("customSyllabus") Boolean customSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChapters
   * 
   * @param syllabusId syllabusId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param customSyllabus customSyllabus (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SyllabusNodeResponse>&gt;
   */
  
  @POST("data/chapterList/{syllabusId}/{customSyllabus}/{classId}/{sectionId}.app")
  Call<List<SyllabusNodeResponse>> getChaptersUsingPOST(
    @Path("syllabusId") Long syllabusId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("customSyllabus") Boolean customSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getChapters
   * 
   * @param syllabusId syllabusId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param customSyllabus customSyllabus (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SyllabusNodeResponse>&gt;
   */
  
  @PUT("data/chapterList/{syllabusId}/{customSyllabus}/{classId}/{sectionId}.app")
  Call<List<SyllabusNodeResponse>> getChaptersUsingPUT(
    @Path("syllabusId") Long syllabusId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("customSyllabus") Boolean customSyllabus, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabus
   * 
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param boardId boardId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SyllabusResponse&gt;
   */
  
  @DELETE("data/syllabus/{subjectId}/{classId}/{boardId}/{sectionId}.app")
  Call<SyllabusResponse> getSyllabusUsingDELETE(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("boardId") Long boardId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabus
   * 
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param boardId boardId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SyllabusResponse&gt;
   */
  
  @GET("data/syllabus/{subjectId}/{classId}/{boardId}/{sectionId}.app")
  Call<SyllabusResponse> getSyllabusUsingGET(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("boardId") Long boardId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabus
   * 
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param boardId boardId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SyllabusResponse&gt;
   */
  
  @HEAD("data/syllabus/{subjectId}/{classId}/{boardId}/{sectionId}.app")
  Call<SyllabusResponse> getSyllabusUsingHEAD(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("boardId") Long boardId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabus
   * 
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param boardId boardId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SyllabusResponse&gt;
   */
  
  @OPTIONS("data/syllabus/{subjectId}/{classId}/{boardId}/{sectionId}.app")
  Call<SyllabusResponse> getSyllabusUsingOPTIONS(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("boardId") Long boardId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabus
   * 
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param boardId boardId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SyllabusResponse&gt;
   */
  
  @PATCH("data/syllabus/{subjectId}/{classId}/{boardId}/{sectionId}.app")
  Call<SyllabusResponse> getSyllabusUsingPATCH(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("boardId") Long boardId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabus
   * 
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param boardId boardId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SyllabusResponse&gt;
   */
  
  @POST("data/syllabus/{subjectId}/{classId}/{boardId}/{sectionId}.app")
  Call<SyllabusResponse> getSyllabusUsingPOST(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("boardId") Long boardId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSyllabus
   * 
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param boardId boardId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SyllabusResponse&gt;
   */
  
  @PUT("data/syllabus/{subjectId}/{classId}/{boardId}/{sectionId}.app")
  Call<SyllabusResponse> getSyllabusUsingPUT(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("boardId") Long boardId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * insertCustomSyllabus
   * 
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param boardId boardId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SyllabusResponse&gt;
   */
  
  @DELETE("data/addCustomSyllabus/{subjectId}/{classId}/{boardId}/{sectionId}.app")
  Call<SyllabusResponse> insertCustomSyllabusUsingDELETE(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("boardId") Long boardId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * insertCustomSyllabus
   * 
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param boardId boardId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SyllabusResponse&gt;
   */
  
  @GET("data/addCustomSyllabus/{subjectId}/{classId}/{boardId}/{sectionId}.app")
  Call<SyllabusResponse> insertCustomSyllabusUsingGET(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("boardId") Long boardId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * insertCustomSyllabus
   * 
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param boardId boardId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SyllabusResponse&gt;
   */
  
  @HEAD("data/addCustomSyllabus/{subjectId}/{classId}/{boardId}/{sectionId}.app")
  Call<SyllabusResponse> insertCustomSyllabusUsingHEAD(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("boardId") Long boardId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * insertCustomSyllabus
   * 
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param boardId boardId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SyllabusResponse&gt;
   */
  
  @OPTIONS("data/addCustomSyllabus/{subjectId}/{classId}/{boardId}/{sectionId}.app")
  Call<SyllabusResponse> insertCustomSyllabusUsingOPTIONS(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("boardId") Long boardId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * insertCustomSyllabus
   * 
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param boardId boardId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SyllabusResponse&gt;
   */
  
  @PATCH("data/addCustomSyllabus/{subjectId}/{classId}/{boardId}/{sectionId}.app")
  Call<SyllabusResponse> insertCustomSyllabusUsingPATCH(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("boardId") Long boardId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * insertCustomSyllabus
   * 
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param boardId boardId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SyllabusResponse&gt;
   */
  
  @POST("data/addCustomSyllabus/{subjectId}/{classId}/{boardId}/{sectionId}.app")
  Call<SyllabusResponse> insertCustomSyllabusUsingPOST(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("boardId") Long boardId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * insertCustomSyllabus
   * 
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param boardId boardId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;SyllabusResponse&gt;
   */
  
  @PUT("data/addCustomSyllabus/{subjectId}/{classId}/{boardId}/{sectionId}.app")
  Call<SyllabusResponse> insertCustomSyllabusUsingPUT(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("boardId") Long boardId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * listChapters
   * 
   * @param syllabusNodeDTO syllabusNodeDTO (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SyllabusNodeResponse>&gt;
   */
  
  @DELETE("data/listChapters/{classId}/{sectionId}.app")
  Call<List<SyllabusNodeResponse>> listChaptersUsingDELETE(
    @Body SyllabusNodeDTO syllabusNodeDTO, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * listChapters
   * 
   * @param syllabusNodeDTO syllabusNodeDTO (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SyllabusNodeResponse>&gt;
   */
  
  @GET("data/listChapters/{classId}/{sectionId}.app")
  Call<List<SyllabusNodeResponse>> listChaptersUsingGET(
    @Body SyllabusNodeDTO syllabusNodeDTO, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * listChapters
   * 
   * @param syllabusNodeDTO syllabusNodeDTO (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SyllabusNodeResponse>&gt;
   */
  
  @HEAD("data/listChapters/{classId}/{sectionId}.app")
  Call<List<SyllabusNodeResponse>> listChaptersUsingHEAD(
    @Body SyllabusNodeDTO syllabusNodeDTO, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * listChapters
   * 
   * @param syllabusNodeDTO syllabusNodeDTO (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SyllabusNodeResponse>&gt;
   */
  
  @OPTIONS("data/listChapters/{classId}/{sectionId}.app")
  Call<List<SyllabusNodeResponse>> listChaptersUsingOPTIONS(
    @Body SyllabusNodeDTO syllabusNodeDTO, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * listChapters
   * 
   * @param syllabusNodeDTO syllabusNodeDTO (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SyllabusNodeResponse>&gt;
   */
  
  @PATCH("data/listChapters/{classId}/{sectionId}.app")
  Call<List<SyllabusNodeResponse>> listChaptersUsingPATCH(
    @Body SyllabusNodeDTO syllabusNodeDTO, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * listChapters
   * 
   * @param syllabusNodeDTO syllabusNodeDTO (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SyllabusNodeResponse>&gt;
   */
  
  @POST("data/listChapters/{classId}/{sectionId}.app")
  Call<List<SyllabusNodeResponse>> listChaptersUsingPOST(
    @Body SyllabusNodeDTO syllabusNodeDTO, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * listChapters
   * 
   * @param syllabusNodeDTO syllabusNodeDTO (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SyllabusNodeResponse>&gt;
   */
  
  @PUT("data/listChapters/{classId}/{sectionId}.app")
  Call<List<SyllabusNodeResponse>> listChaptersUsingPUT(
    @Body SyllabusNodeDTO syllabusNodeDTO, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateChapterName
   * 
   * @param nodeRequest nodeRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;CustomSyllabusNodeResponse&gt;
   */
  
  @DELETE("data/updateChapterName")
  Call<CustomSyllabusNodeResponse> updateChapterNameUsingDELETE(
    @Body CustomSyllabusNodeRequest nodeRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateChapterName
   * 
   * @param nodeRequest nodeRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;CustomSyllabusNodeResponse&gt;
   */
  
  @GET("data/updateChapterName")
  Call<CustomSyllabusNodeResponse> updateChapterNameUsingGET(
    @Body CustomSyllabusNodeRequest nodeRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateChapterName
   * 
   * @param nodeRequest nodeRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;CustomSyllabusNodeResponse&gt;
   */
  
  @HEAD("data/updateChapterName")
  Call<CustomSyllabusNodeResponse> updateChapterNameUsingHEAD(
    @Body CustomSyllabusNodeRequest nodeRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateChapterName
   * 
   * @param nodeRequest nodeRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;CustomSyllabusNodeResponse&gt;
   */
  
  @OPTIONS("data/updateChapterName")
  Call<CustomSyllabusNodeResponse> updateChapterNameUsingOPTIONS(
    @Body CustomSyllabusNodeRequest nodeRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateChapterName
   * 
   * @param nodeRequest nodeRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;CustomSyllabusNodeResponse&gt;
   */
  
  @PATCH("data/updateChapterName")
  Call<CustomSyllabusNodeResponse> updateChapterNameUsingPATCH(
    @Body CustomSyllabusNodeRequest nodeRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateChapterName
   * 
   * @param nodeRequest nodeRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;CustomSyllabusNodeResponse&gt;
   */
  
  @POST("data/updateChapterName")
  Call<CustomSyllabusNodeResponse> updateChapterNameUsingPOST(
    @Body CustomSyllabusNodeRequest nodeRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * updateChapterName
   * 
   * @param nodeRequest nodeRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;CustomSyllabusNodeResponse&gt;
   */
  
  @PUT("data/updateChapterName")
  Call<CustomSyllabusNodeResponse> updateChapterNameUsingPUT(
    @Body CustomSyllabusNodeRequest nodeRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

}
