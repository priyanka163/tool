package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.CustomSyllabusNodeResponse;
import com.nexteducation.swagger.nextsws.model.SyllabusDTO;
import com.nexteducation.swagger.nextsws.model.SessionParams;
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
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<CustomSyllabusNodeResponse>&gt;
   */
  
  @GET("data/addChapterList")
  Call<List<CustomSyllabusNodeResponse>> addChaptersUsingGET(
    @Body SyllabusDTO syllabusDTO, @Body SessionParams sessionParams
  );

  /**
   * deleteChapter
   * 
   * @param nodeRequest nodeRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/deleteChapter")
  Call<Void> deleteChapterUsingGET(
    @Body CustomSyllabusNodeRequest nodeRequest, @Body SessionParams sessionParams
  );

  /**
   * getChaptersBySubjectClassBoard
   * 
   * @param boardId boardId (required)
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param customSyllabus customSyllabus (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<SyllabusNodeResponse>&gt;
   */
  
  @GET("data/chapterList/{boardId}/{subjectId}/{customSyllabus}/{classId}/{sectionId}.app")
  Call<List<SyllabusNodeResponse>> getChaptersBySubjectClassBoardUsingGET(
    @Path("boardId") Long boardId, @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("customSyllabus") Boolean customSyllabus, @Body SessionParams sessionParams
  );

  /**
   * getChapters
   * 
   * @param syllabusId syllabusId (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param customSyllabus customSyllabus (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<SyllabusNodeResponse>&gt;
   */
  
  @GET("data/chapterList/{syllabusId}/{customSyllabus}/{classId}/{sectionId}.app")
  Call<List<SyllabusNodeResponse>> getChaptersUsingGET(
    @Path("syllabusId") Long syllabusId, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Path("customSyllabus") Boolean customSyllabus, @Body SessionParams sessionParams
  );

  /**
   * getSyllabus
   * 
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param boardId boardId (required)
   * @param sectionId sectionId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;SyllabusResponse&gt;
   */
  
  @GET("data/syllabus/{subjectId}/{classId}/{boardId}/{sectionId}.app")
  Call<SyllabusResponse> getSyllabusUsingGET(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("boardId") Long boardId, @Path("sectionId") Long sectionId, @Body SessionParams sessionParams
  );

  /**
   * insertCustomSyllabus
   * 
   * @param subjectId subjectId (required)
   * @param classId classId (required)
   * @param boardId boardId (required)
   * @param sectionId sectionId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;SyllabusResponse&gt;
   */
  
  @GET("data/addCustomSyllabus/{subjectId}/{classId}/{boardId}/{sectionId}.app")
  Call<SyllabusResponse> insertCustomSyllabusUsingGET(
    @Path("subjectId") Long subjectId, @Path("classId") Long classId, @Path("boardId") Long boardId, @Path("sectionId") Long sectionId, @Body SessionParams sessionParams
  );

  /**
   * listChapters
   * 
   * @param syllabusNodeDTO syllabusNodeDTO (required)
   * @param classId classId (required)
   * @param sectionId sectionId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<SyllabusNodeResponse>&gt;
   */
  
  @GET("data/listChapters/{classId}/{sectionId}.app")
  Call<List<SyllabusNodeResponse>> listChaptersUsingGET(
    @Body SyllabusNodeDTO syllabusNodeDTO, @Path("classId") Long classId, @Path("sectionId") Long sectionId, @Body SessionParams sessionParams
  );

  /**
   * updateChapterName
   * 
   * @param nodeRequest nodeRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;CustomSyllabusNodeResponse&gt;
   */
  
  @GET("data/updateChapterName")
  Call<CustomSyllabusNodeResponse> updateChapterNameUsingGET(
    @Body CustomSyllabusNodeRequest nodeRequest, @Body SessionParams sessionParams
  );

}
