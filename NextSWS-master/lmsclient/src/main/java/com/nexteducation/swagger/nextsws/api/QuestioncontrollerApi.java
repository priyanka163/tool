package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.BookResponse;
import com.nexteducation.swagger.nextsws.model.ProductTypeResponse;
import com.nexteducation.swagger.nextsws.model.Mapstringstring;
import com.nexteducation.swagger.nextsws.model.SyllabusNodeResponse;
import com.nexteducation.swagger.nextsws.model.ConceptLOResponse;
import com.nexteducation.swagger.nextsws.model.ConceptLORequest;
import com.nexteducation.swagger.nextsws.model.ConceptShortResponse;
import com.nexteducation.swagger.nextsws.model.SimilarQuestionRequest;
import com.nexteducation.swagger.nextsws.model.AssessmentQuestionShortResponse;
import com.nexteducation.swagger.nextsws.model.QuestionRequestDTO;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.QuestionConceptLOLDRequest;
import com.nexteducation.swagger.nextsws.model.QuestionConceptAssessmentRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface QuestioncontrollerApi {
  /**
   * addBook
   * 
   * @param file file (required)
   * @param bookName bookName (required)
   * @param bookPublisher bookPublisher (required)
   * @param boardId boardId (required)
   * @param classId classId (required)
   * @param year year (required)
   * @param fileName fileName (required)
   * @param fileExtension fileExtension (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;BookResponse&gt;
   */
  
  @POST("data/saveBookWithImageforQB")
  Call<BookResponse> addBookUsingPOST(
    @Query("file") String file, @Query("bookName") String bookName, @Query("bookPublisher") String bookPublisher, @Query("boardId") String boardId, @Query("classId") String classId, @Query("year") String year, @Query("fileName") String fileName, @Query("fileExtension") String fileExtension, @Body SessionParams sessionParams
  );

  /**
   * deleteQuestionAssessment
   * 
   * @param questionUUID questionUUID (required)
   * @param assessmentId assessmentId (required)
   * @return Call&lt;Boolean&gt;
   */
  
  @GET("data/deleteQuestionAssessment/{questionUUID}/{assessmentId}")
  Call<Boolean> deleteQuestionAssessmentUsingGET(
    @Path("questionUUID") String questionUUID, @Path("assessmentId") String assessmentId
  );

  /**
   * deleteQuestionLabActivity
   * 
   * @param questionUUID questionUUID (required)
   * @param sectionType sectionType (required)
   * @param subjectId subjectId (required)
   * @return Call&lt;Boolean&gt;
   */
  
  @GET("data/deleteQuestionLabActivity/{questionUUID}/{sectionType}/{subjectId}")
  Call<Boolean> deleteQuestionLabActivityUsingGET(
    @Path("questionUUID") String questionUUID, @Path("sectionType") String sectionType, @Path("subjectId") String subjectId
  );

  /**
   * generateQuestionXML
   * 
   * @param questionID questionID (required)
   * @return Call&lt;String&gt;
   */
  
  @GET("data/getQuestionXML.app")
  Call<String> generateQuestionXMLUsingGET(
    @Path("questionID") Long questionID
  );

  /**
   * getAllProductTypes
   * 
   * @return Call&lt;List<ProductTypeResponse>&gt;
   */
  
  @GET("data/getAllProductTypes")
  Call<List<ProductTypeResponse>> getAllProductTypesUsingGET();
    

  /**
   * getAllSectionTypes
   * 
   * @param conceptUUID conceptUUID (required)
   * @return Call&lt;List<List<Object>>&gt;
   */
  
  @GET("data/getAllSectionTypes/{conceptUUID}")
  Call<List<List<Object>>> getAllSectionTypesUsingGET(
    @Path("conceptUUID") String conceptUUID
  );

  /**
   * getAsset
   * 
   * @param uuid uuid (required)
   * @return Call&lt;List<byte[]>&gt;
   */
  
  @GET("data/asset/{uuid}")
  Call<List<byte[]>> getAssetUsingGET(
    @Path("uuid") String uuid
  );

  /**
   * getBloomsTaxonomyValues
   * 
   * @return Call&lt;List<String>&gt;
   */
  
  @GET("data/getBloomsTaxonomyValues")
  Call<List<String>> getBloomsTaxonomyValuesUsingGET();
    

  /**
   * getBoards
   * 
   * @return Call&lt;List<Mapstringstring>&gt;
   */
  
  @GET("data/getMasterBoards")
  Call<List<Mapstringstring>> getBoardsUsingGET();
    

  /**
   * getBooksForBoardAndQuery
   * 
   * @param boardId boardId (required)
   * @param query query (required)
   * @return Call&lt;List<BookResponse>&gt;
   */
  
  @GET("data/getBooksForBoardAndQuery")
  Call<List<BookResponse>> getBooksForBoardAndQueryUsingGET(
    @Query("boardId") String boardId, @Query("query") String query
  );

  /**
   * getBooksForBoardClassAndQuery
   * 
   * @param boardId boardId (required)
   * @param classId classId (required)
   * @param query query (required)
   * @return Call&lt;List<BookResponse>&gt;
   */
  
  @GET("data/getBooksForBoardClassAndQuery")
  Call<List<BookResponse>> getBooksForBoardClassAndQueryUsingGET(
    @Query("boardId") String boardId, @Query("classId") String classId, @Query("query") String query
  );

  /**
   * getChaptersForBoardClassSyllabus
   * 
   * @return Call&lt;List<SyllabusNodeResponse>&gt;
   */
  
  @GET("data/getChaptersForBoardClassSubject")
  Call<List<SyllabusNodeResponse>> getChaptersForBoardClassSyllabusUsingGET();
    

  /**
   * getClassesForBoard
   * 
   * @return Call&lt;List<Mapstringstring>&gt;
   */
  
  @GET("data/getClassesForBoard")
  Call<List<Mapstringstring>> getClassesForBoardUsingGET();
    

  /**
   * getConceptLOMap
   * 
   * @param request request (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<ConceptLOResponse>&gt;
   */
  
  @POST("data/getQuestionConceptLOMap")
  Call<List<ConceptLOResponse>> getConceptLOMapUsingPOST(
    @Body ConceptLORequest request, @Body SessionParams sessionParams
  );

  /**
   * getConceptsSearch
   * 
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<ConceptShortResponse>&gt;
   */
  
  @GET("data/getConceptsSearch")
  Call<List<ConceptShortResponse>> getConceptsSearchUsingGET(
    @Body SessionParams sessionParams
  );

  /**
   * getFilteredQuestions
   * 
   * @param chapterId chapterId (required)
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/getQuestions/{chapterId}.app")
  Call<Void> getFilteredQuestionsUsingGET(
    @Path("chapterId") Long chapterId
  );

  /**
   * getRelatedConcepts
   * 
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<ConceptShortResponse>&gt;
   */
  
  @GET("data/getRelatedConcepts")
  Call<List<ConceptShortResponse>> getRelatedConceptsUsingGET(
    @Body SessionParams sessionParams
  );

  /**
   * getSimilarQuestions
   * 
   * @param sqr sqr (required)
   * @return Call&lt;List<AssessmentQuestionShortResponse>&gt;
   */
  
  @GET("data/getSimilarQuestions")
  Call<List<AssessmentQuestionShortResponse>> getSimilarQuestionsUsingGET(
    @Body SimilarQuestionRequest sqr
  );

  /**
   * getSubjectsForBoardClass
   * 
   * @return Call&lt;List<Mapstringstring>&gt;
   */
  
  @DELETE("data/getSubjectsForBoardClass")
  Call<List<Mapstringstring>> getSubjectsForBoardClassUsingDELETE();
    

  /**
   * getSubjectsForBoardClass
   * 
   * @return Call&lt;List<Mapstringstring>&gt;
   */
  
  @GET("data/getSubjectsForBoardClass")
  Call<List<Mapstringstring>> getSubjectsForBoardClassUsingGET();
    

  /**
   * getSubjectsForBoardClass
   * 
   * @return Call&lt;List<Mapstringstring>&gt;
   */
  
  @HEAD("data/getSubjectsForBoardClass")
  Call<List<Mapstringstring>> getSubjectsForBoardClassUsingHEAD();
    

  /**
   * getSubjectsForBoardClass
   * 
   * @return Call&lt;List<Mapstringstring>&gt;
   */
  
  @OPTIONS("data/getSubjectsForBoardClass")
  Call<List<Mapstringstring>> getSubjectsForBoardClassUsingOPTIONS();
    

  /**
   * getSubjectsForBoardClass
   * 
   * @return Call&lt;List<Mapstringstring>&gt;
   */
  
  @PATCH("data/getSubjectsForBoardClass")
  Call<List<Mapstringstring>> getSubjectsForBoardClassUsingPATCH();
    

  /**
   * getSubjectsForBoardClass
   * 
   * @return Call&lt;List<Mapstringstring>&gt;
   */
  
  @POST("data/getSubjectsForBoardClass")
  Call<List<Mapstringstring>> getSubjectsForBoardClassUsingPOST();
    

  /**
   * getSubjectsForBoardClass
   * 
   * @return Call&lt;List<Mapstringstring>&gt;
   */
  
  @PUT("data/getSubjectsForBoardClass")
  Call<List<Mapstringstring>> getSubjectsForBoardClassUsingPUT();
    

  /**
   * insertQuestionWithOutSyllabus
   * 
   * @param questionDTO questionDTO (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;String&gt;
   */
  
  @POST("data/insertQuestionWithoutSyllabus")
  Call<String> insertQuestionWithOutSyllabusUsingPOST(
    @Body QuestionRequestDTO questionDTO, @Body SessionParams sessionParams
  );

  /**
   * loadLanguageAndConcepts
   * 
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/loadLanguageAndConcepts.app")
  Call<Void> loadLanguageAndConceptsUsingGET();
    

  /**
   * previewQuestion
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/previewQuestion.app")
  Call<ModelAndView> previewQuestionUsingGET();
    

  /**
   * questionDevelopmentContinued
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("questionBankDevelopmentContinued")
  Call<ModelAndView> questionDevelopmentContinuedUsingGET();
    

  /**
   * sampleQuestionDevelopment
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("questionBankDevelopment")
  Call<ModelAndView> sampleQuestionDevelopmentUsingGET();
    

  /**
   * saveQuestionAssessment
   * 
   * @param questionUUID questionUUID (required)
   * @param assessmentId assessmentId (required)
   * @return Call&lt;Boolean&gt;
   */
  
  @GET("data/saveQuestionAssessment/{questionUUID}/{assessmentId}")
  Call<Boolean> saveQuestionAssessmentUsingGET(
    @Path("questionUUID") String questionUUID, @Path("assessmentId") String assessmentId
  );

  /**
   * saveQuestionConceptsLOLDMap
   * 
   * @param questionConcepts questionConcepts (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/saveQuestionConceptMap")
  Call<Void> saveQuestionConceptsLOLDMapUsingGET(
    @Body List<QuestionConceptLOLDRequest> questionConcepts, @Body SessionParams sessionParams
  );

  /**
   * saveQuestionLabActivity
   * 
   * @param questionUUID questionUUID (required)
   * @param sectionType sectionType (required)
   * @param subjectId subjectId (required)
   * @return Call&lt;Boolean&gt;
   */
  
  @GET("data/saveQuestionLabActivity/{questionUUID}/{sectionType}/{subjectId}")
  Call<Boolean> saveQuestionLabActivityUsingGET(
    @Path("questionUUID") String questionUUID, @Path("sectionType") String sectionType, @Path("subjectId") String subjectId
  );

  /**
   * saveQuestionWithConceptsAndAssessments
   * 
   * @param questionConceptAssessmentRequest questionConceptAssessmentRequest (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/saveQuestionConceptAssessment")
  Call<ModelAndView> saveQuestionWithConceptsAndAssessmentsUsingPOST(
    @Body QuestionConceptAssessmentRequest questionConceptAssessmentRequest, @Body SessionParams sessionParams
  );

  /**
   * searchQuestionSources
   * 
   * @param query query (required)
   * @return Call&lt;List<BookResponse>&gt;
   */
  
  @GET("data/searchQuestionSources")
  Call<List<BookResponse>> searchQuestionSourcesUsingGET(
    @Query("query") String query
  );

}
