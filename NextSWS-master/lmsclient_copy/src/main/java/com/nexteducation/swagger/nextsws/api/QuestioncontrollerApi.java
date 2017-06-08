package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import java.io.File;
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;BookResponse&gt;
   */
  
  @POST("data/saveBookWithImageforQB")
  Call<BookResponse> addBookUsingPOST(
    @Query("file") List<File> file, @Query("bookName") String bookName, @Query("bookPublisher") String bookPublisher, @Query("boardId") String boardId, @Query("classId") String classId, @Query("year") String year, @Query("fileName") String fileName, @Query("fileExtension") String fileExtension, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
  
  @DELETE("data/asset/{uuid}")
  Call<List<byte[]>> getAssetUsingDELETE(
    @Path("uuid") String uuid
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
   * getAsset
   * 
   * @param uuid uuid (required)
   * @return Call&lt;List<byte[]>&gt;
   */
  
  @HEAD("data/asset/{uuid}")
  Call<List<byte[]>> getAssetUsingHEAD(
    @Path("uuid") String uuid
  );

  /**
   * getAsset
   * 
   * @param uuid uuid (required)
   * @return Call&lt;List<byte[]>&gt;
   */
  
  @OPTIONS("data/asset/{uuid}")
  Call<List<byte[]>> getAssetUsingOPTIONS(
    @Path("uuid") String uuid
  );

  /**
   * getAsset
   * 
   * @param uuid uuid (required)
   * @return Call&lt;List<byte[]>&gt;
   */
  
  @PATCH("data/asset/{uuid}")
  Call<List<byte[]>> getAssetUsingPATCH(
    @Path("uuid") String uuid
  );

  /**
   * getAsset
   * 
   * @param uuid uuid (required)
   * @return Call&lt;List<byte[]>&gt;
   */
  
  @POST("data/asset/{uuid}")
  Call<List<byte[]>> getAssetUsingPOST(
    @Path("uuid") String uuid
  );

  /**
   * getAsset
   * 
   * @param uuid uuid (required)
   * @return Call&lt;List<byte[]>&gt;
   */
  
  @PUT("data/asset/{uuid}")
  Call<List<byte[]>> getAssetUsingPUT(
    @Path("uuid") String uuid
  );

  /**
   * getBloomsTaxonomyValues
   * 
   * @return Call&lt;List<String>&gt;
   */
  
  @DELETE("data/getBloomsTaxonomyValues")
  Call<List<String>> getBloomsTaxonomyValuesUsingDELETE();
    

  /**
   * getBloomsTaxonomyValues
   * 
   * @return Call&lt;List<String>&gt;
   */
  
  @GET("data/getBloomsTaxonomyValues")
  Call<List<String>> getBloomsTaxonomyValuesUsingGET();
    

  /**
   * getBloomsTaxonomyValues
   * 
   * @return Call&lt;List<String>&gt;
   */
  
  @HEAD("data/getBloomsTaxonomyValues")
  Call<List<String>> getBloomsTaxonomyValuesUsingHEAD();
    

  /**
   * getBloomsTaxonomyValues
   * 
   * @return Call&lt;List<String>&gt;
   */
  
  @OPTIONS("data/getBloomsTaxonomyValues")
  Call<List<String>> getBloomsTaxonomyValuesUsingOPTIONS();
    

  /**
   * getBloomsTaxonomyValues
   * 
   * @return Call&lt;List<String>&gt;
   */
  
  @PATCH("data/getBloomsTaxonomyValues")
  Call<List<String>> getBloomsTaxonomyValuesUsingPATCH();
    

  /**
   * getBloomsTaxonomyValues
   * 
   * @return Call&lt;List<String>&gt;
   */
  
  @POST("data/getBloomsTaxonomyValues")
  Call<List<String>> getBloomsTaxonomyValuesUsingPOST();
    

  /**
   * getBloomsTaxonomyValues
   * 
   * @return Call&lt;List<String>&gt;
   */
  
  @PUT("data/getBloomsTaxonomyValues")
  Call<List<String>> getBloomsTaxonomyValuesUsingPUT();
    

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
  
  @DELETE("data/getBooksForBoardAndQuery")
  Call<List<BookResponse>> getBooksForBoardAndQueryUsingDELETE(
    @Query("boardId") String boardId, @Query("query") String query
  );

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
   * getBooksForBoardAndQuery
   * 
   * @param boardId boardId (required)
   * @param query query (required)
   * @return Call&lt;List<BookResponse>&gt;
   */
  
  @HEAD("data/getBooksForBoardAndQuery")
  Call<List<BookResponse>> getBooksForBoardAndQueryUsingHEAD(
    @Query("boardId") String boardId, @Query("query") String query
  );

  /**
   * getBooksForBoardAndQuery
   * 
   * @param boardId boardId (required)
   * @param query query (required)
   * @return Call&lt;List<BookResponse>&gt;
   */
  
  @OPTIONS("data/getBooksForBoardAndQuery")
  Call<List<BookResponse>> getBooksForBoardAndQueryUsingOPTIONS(
    @Query("boardId") String boardId, @Query("query") String query
  );

  /**
   * getBooksForBoardAndQuery
   * 
   * @param boardId boardId (required)
   * @param query query (required)
   * @return Call&lt;List<BookResponse>&gt;
   */
  
  @PATCH("data/getBooksForBoardAndQuery")
  Call<List<BookResponse>> getBooksForBoardAndQueryUsingPATCH(
    @Query("boardId") String boardId, @Query("query") String query
  );

  /**
   * getBooksForBoardAndQuery
   * 
   * @param boardId boardId (required)
   * @param query query (required)
   * @return Call&lt;List<BookResponse>&gt;
   */
  
  @POST("data/getBooksForBoardAndQuery")
  Call<List<BookResponse>> getBooksForBoardAndQueryUsingPOST(
    @Query("boardId") String boardId, @Query("query") String query
  );

  /**
   * getBooksForBoardAndQuery
   * 
   * @param boardId boardId (required)
   * @param query query (required)
   * @return Call&lt;List<BookResponse>&gt;
   */
  
  @PUT("data/getBooksForBoardAndQuery")
  Call<List<BookResponse>> getBooksForBoardAndQueryUsingPUT(
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
  
  @DELETE("data/getBooksForBoardClassAndQuery")
  Call<List<BookResponse>> getBooksForBoardClassAndQueryUsingDELETE(
    @Query("boardId") String boardId, @Query("classId") String classId, @Query("query") String query
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
   * getBooksForBoardClassAndQuery
   * 
   * @param boardId boardId (required)
   * @param classId classId (required)
   * @param query query (required)
   * @return Call&lt;List<BookResponse>&gt;
   */
  
  @HEAD("data/getBooksForBoardClassAndQuery")
  Call<List<BookResponse>> getBooksForBoardClassAndQueryUsingHEAD(
    @Query("boardId") String boardId, @Query("classId") String classId, @Query("query") String query
  );

  /**
   * getBooksForBoardClassAndQuery
   * 
   * @param boardId boardId (required)
   * @param classId classId (required)
   * @param query query (required)
   * @return Call&lt;List<BookResponse>&gt;
   */
  
  @OPTIONS("data/getBooksForBoardClassAndQuery")
  Call<List<BookResponse>> getBooksForBoardClassAndQueryUsingOPTIONS(
    @Query("boardId") String boardId, @Query("classId") String classId, @Query("query") String query
  );

  /**
   * getBooksForBoardClassAndQuery
   * 
   * @param boardId boardId (required)
   * @param classId classId (required)
   * @param query query (required)
   * @return Call&lt;List<BookResponse>&gt;
   */
  
  @PATCH("data/getBooksForBoardClassAndQuery")
  Call<List<BookResponse>> getBooksForBoardClassAndQueryUsingPATCH(
    @Query("boardId") String boardId, @Query("classId") String classId, @Query("query") String query
  );

  /**
   * getBooksForBoardClassAndQuery
   * 
   * @param boardId boardId (required)
   * @param classId classId (required)
   * @param query query (required)
   * @return Call&lt;List<BookResponse>&gt;
   */
  
  @POST("data/getBooksForBoardClassAndQuery")
  Call<List<BookResponse>> getBooksForBoardClassAndQueryUsingPOST(
    @Query("boardId") String boardId, @Query("classId") String classId, @Query("query") String query
  );

  /**
   * getBooksForBoardClassAndQuery
   * 
   * @param boardId boardId (required)
   * @param classId classId (required)
   * @param query query (required)
   * @return Call&lt;List<BookResponse>&gt;
   */
  
  @PUT("data/getBooksForBoardClassAndQuery")
  Call<List<BookResponse>> getBooksForBoardClassAndQueryUsingPUT(
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<ConceptLOResponse>&gt;
   */
  
  @POST("data/getQuestionConceptLOMap")
  Call<List<ConceptLOResponse>> getConceptLOMapUsingPOST(
    @Body ConceptLORequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getConceptsSearch
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<ConceptShortResponse>&gt;
   */
  
  @GET("data/getConceptsSearch")
  Call<List<ConceptShortResponse>> getConceptsSearchUsingGET(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getFilteredQuestions
   * 
   * @param chapterId chapterId (required)
   * @return Call&lt;Void&gt;
   */
  
  @DELETE("data/getQuestions/{chapterId}.app")
  Call<Void> getFilteredQuestionsUsingDELETE(
    @Path("chapterId") Long chapterId
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
   * getFilteredQuestions
   * 
   * @param chapterId chapterId (required)
   * @return Call&lt;Void&gt;
   */
  
  @HEAD("data/getQuestions/{chapterId}.app")
  Call<Void> getFilteredQuestionsUsingHEAD(
    @Path("chapterId") Long chapterId
  );

  /**
   * getFilteredQuestions
   * 
   * @param chapterId chapterId (required)
   * @return Call&lt;Void&gt;
   */
  
  @OPTIONS("data/getQuestions/{chapterId}.app")
  Call<Void> getFilteredQuestionsUsingOPTIONS(
    @Path("chapterId") Long chapterId
  );

  /**
   * getFilteredQuestions
   * 
   * @param chapterId chapterId (required)
   * @return Call&lt;Void&gt;
   */
  
  @PATCH("data/getQuestions/{chapterId}.app")
  Call<Void> getFilteredQuestionsUsingPATCH(
    @Path("chapterId") Long chapterId
  );

  /**
   * getFilteredQuestions
   * 
   * @param chapterId chapterId (required)
   * @return Call&lt;Void&gt;
   */
  
  @POST("data/getQuestions/{chapterId}.app")
  Call<Void> getFilteredQuestionsUsingPOST(
    @Path("chapterId") Long chapterId
  );

  /**
   * getFilteredQuestions
   * 
   * @param chapterId chapterId (required)
   * @return Call&lt;Void&gt;
   */
  
  @PUT("data/getQuestions/{chapterId}.app")
  Call<Void> getFilteredQuestionsUsingPUT(
    @Path("chapterId") Long chapterId
  );

  /**
   * getRelatedConcepts
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<ConceptShortResponse>&gt;
   */
  
  @GET("data/getRelatedConcepts")
  Call<List<ConceptShortResponse>> getRelatedConceptsUsingGET(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSimilarQuestions
   * 
   * @param sqr sqr (required)
   * @return Call&lt;List<AssessmentQuestionShortResponse>&gt;
   */
  
  @DELETE("data/getSimilarQuestions")
  Call<List<AssessmentQuestionShortResponse>> getSimilarQuestionsUsingDELETE(
    @Body SimilarQuestionRequest sqr
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
   * getSimilarQuestions
   * 
   * @param sqr sqr (required)
   * @return Call&lt;List<AssessmentQuestionShortResponse>&gt;
   */
  
  @HEAD("data/getSimilarQuestions")
  Call<List<AssessmentQuestionShortResponse>> getSimilarQuestionsUsingHEAD(
    @Body SimilarQuestionRequest sqr
  );

  /**
   * getSimilarQuestions
   * 
   * @param sqr sqr (required)
   * @return Call&lt;List<AssessmentQuestionShortResponse>&gt;
   */
  
  @OPTIONS("data/getSimilarQuestions")
  Call<List<AssessmentQuestionShortResponse>> getSimilarQuestionsUsingOPTIONS(
    @Body SimilarQuestionRequest sqr
  );

  /**
   * getSimilarQuestions
   * 
   * @param sqr sqr (required)
   * @return Call&lt;List<AssessmentQuestionShortResponse>&gt;
   */
  
  @PATCH("data/getSimilarQuestions")
  Call<List<AssessmentQuestionShortResponse>> getSimilarQuestionsUsingPATCH(
    @Body SimilarQuestionRequest sqr
  );

  /**
   * getSimilarQuestions
   * 
   * @param sqr sqr (required)
   * @return Call&lt;List<AssessmentQuestionShortResponse>&gt;
   */
  
  @POST("data/getSimilarQuestions")
  Call<List<AssessmentQuestionShortResponse>> getSimilarQuestionsUsingPOST(
    @Body SimilarQuestionRequest sqr
  );

  /**
   * getSimilarQuestions
   * 
   * @param sqr sqr (required)
   * @return Call&lt;List<AssessmentQuestionShortResponse>&gt;
   */
  
  @PUT("data/getSimilarQuestions")
  Call<List<AssessmentQuestionShortResponse>> getSimilarQuestionsUsingPUT(
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;String&gt;
   */
  
  @POST("data/insertQuestionWithoutSyllabus")
  Call<String> insertQuestionWithOutSyllabusUsingPOST(
    @Body QuestionRequestDTO questionDTO, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * loadLanguageAndConcepts
   * 
   * @return Call&lt;Void&gt;
   */
  
  @DELETE("data/loadLanguageAndConcepts.app")
  Call<Void> loadLanguageAndConceptsUsingDELETE();
    

  /**
   * loadLanguageAndConcepts
   * 
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/loadLanguageAndConcepts.app")
  Call<Void> loadLanguageAndConceptsUsingGET();
    

  /**
   * loadLanguageAndConcepts
   * 
   * @return Call&lt;Void&gt;
   */
  
  @HEAD("data/loadLanguageAndConcepts.app")
  Call<Void> loadLanguageAndConceptsUsingHEAD();
    

  /**
   * loadLanguageAndConcepts
   * 
   * @return Call&lt;Void&gt;
   */
  
  @OPTIONS("data/loadLanguageAndConcepts.app")
  Call<Void> loadLanguageAndConceptsUsingOPTIONS();
    

  /**
   * loadLanguageAndConcepts
   * 
   * @return Call&lt;Void&gt;
   */
  
  @PATCH("data/loadLanguageAndConcepts.app")
  Call<Void> loadLanguageAndConceptsUsingPATCH();
    

  /**
   * loadLanguageAndConcepts
   * 
   * @return Call&lt;Void&gt;
   */
  
  @POST("data/loadLanguageAndConcepts.app")
  Call<Void> loadLanguageAndConceptsUsingPOST();
    

  /**
   * loadLanguageAndConcepts
   * 
   * @return Call&lt;Void&gt;
   */
  
  @PUT("data/loadLanguageAndConcepts.app")
  Call<Void> loadLanguageAndConceptsUsingPUT();
    

  /**
   * previewQuestion
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("data/previewQuestion.app")
  Call<ModelAndView> previewQuestionUsingDELETE();
    

  /**
   * previewQuestion
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/previewQuestion.app")
  Call<ModelAndView> previewQuestionUsingGET();
    

  /**
   * previewQuestion
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("data/previewQuestion.app")
  Call<ModelAndView> previewQuestionUsingHEAD();
    

  /**
   * previewQuestion
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("data/previewQuestion.app")
  Call<ModelAndView> previewQuestionUsingOPTIONS();
    

  /**
   * previewQuestion
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("data/previewQuestion.app")
  Call<ModelAndView> previewQuestionUsingPATCH();
    

  /**
   * previewQuestion
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/previewQuestion.app")
  Call<ModelAndView> previewQuestionUsingPOST();
    

  /**
   * previewQuestion
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("data/previewQuestion.app")
  Call<ModelAndView> previewQuestionUsingPUT();
    

  /**
   * questionDevelopmentContinued
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("questionBankDevelopmentContinued")
  Call<ModelAndView> questionDevelopmentContinuedUsingDELETE();
    

  /**
   * questionDevelopmentContinued
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("questionBankDevelopmentContinued")
  Call<ModelAndView> questionDevelopmentContinuedUsingGET();
    

  /**
   * questionDevelopmentContinued
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("questionBankDevelopmentContinued")
  Call<ModelAndView> questionDevelopmentContinuedUsingHEAD();
    

  /**
   * questionDevelopmentContinued
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("questionBankDevelopmentContinued")
  Call<ModelAndView> questionDevelopmentContinuedUsingOPTIONS();
    

  /**
   * questionDevelopmentContinued
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("questionBankDevelopmentContinued")
  Call<ModelAndView> questionDevelopmentContinuedUsingPATCH();
    

  /**
   * questionDevelopmentContinued
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("questionBankDevelopmentContinued")
  Call<ModelAndView> questionDevelopmentContinuedUsingPOST();
    

  /**
   * questionDevelopmentContinued
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("questionBankDevelopmentContinued")
  Call<ModelAndView> questionDevelopmentContinuedUsingPUT();
    

  /**
   * sampleQuestionDevelopment
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("questionBankDevelopment")
  Call<ModelAndView> sampleQuestionDevelopmentUsingDELETE();
    

  /**
   * sampleQuestionDevelopment
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("questionBankDevelopment")
  Call<ModelAndView> sampleQuestionDevelopmentUsingGET();
    

  /**
   * sampleQuestionDevelopment
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("questionBankDevelopment")
  Call<ModelAndView> sampleQuestionDevelopmentUsingHEAD();
    

  /**
   * sampleQuestionDevelopment
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("questionBankDevelopment")
  Call<ModelAndView> sampleQuestionDevelopmentUsingOPTIONS();
    

  /**
   * sampleQuestionDevelopment
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("questionBankDevelopment")
  Call<ModelAndView> sampleQuestionDevelopmentUsingPATCH();
    

  /**
   * sampleQuestionDevelopment
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("questionBankDevelopment")
  Call<ModelAndView> sampleQuestionDevelopmentUsingPOST();
    

  /**
   * sampleQuestionDevelopment
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("questionBankDevelopment")
  Call<ModelAndView> sampleQuestionDevelopmentUsingPUT();
    

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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @DELETE("data/saveQuestionConceptMap")
  Call<Void> saveQuestionConceptsLOLDMapUsingDELETE(
    @Body List<QuestionConceptLOLDRequest> questionConcepts, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * saveQuestionConceptsLOLDMap
   * 
   * @param questionConcepts questionConcepts (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @GET("data/saveQuestionConceptMap")
  Call<Void> saveQuestionConceptsLOLDMapUsingGET(
    @Body List<QuestionConceptLOLDRequest> questionConcepts, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * saveQuestionConceptsLOLDMap
   * 
   * @param questionConcepts questionConcepts (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @HEAD("data/saveQuestionConceptMap")
  Call<Void> saveQuestionConceptsLOLDMapUsingHEAD(
    @Body List<QuestionConceptLOLDRequest> questionConcepts, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * saveQuestionConceptsLOLDMap
   * 
   * @param questionConcepts questionConcepts (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @OPTIONS("data/saveQuestionConceptMap")
  Call<Void> saveQuestionConceptsLOLDMapUsingOPTIONS(
    @Body List<QuestionConceptLOLDRequest> questionConcepts, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * saveQuestionConceptsLOLDMap
   * 
   * @param questionConcepts questionConcepts (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @PATCH("data/saveQuestionConceptMap")
  Call<Void> saveQuestionConceptsLOLDMapUsingPATCH(
    @Body List<QuestionConceptLOLDRequest> questionConcepts, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * saveQuestionConceptsLOLDMap
   * 
   * @param questionConcepts questionConcepts (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @POST("data/saveQuestionConceptMap")
  Call<Void> saveQuestionConceptsLOLDMapUsingPOST(
    @Body List<QuestionConceptLOLDRequest> questionConcepts, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * saveQuestionConceptsLOLDMap
   * 
   * @param questionConcepts questionConcepts (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;Void&gt;
   */
  
  @PUT("data/saveQuestionConceptMap")
  Call<Void> saveQuestionConceptsLOLDMapUsingPUT(
    @Body List<QuestionConceptLOLDRequest> questionConcepts, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/saveQuestionConceptAssessment")
  Call<ModelAndView> saveQuestionWithConceptsAndAssessmentsUsingPOST(
    @Body QuestionConceptAssessmentRequest questionConceptAssessmentRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * searchQuestionSources
   * 
   * @param query query (required)
   * @return Call&lt;List<BookResponse>&gt;
   */
  
  @DELETE("data/searchQuestionSources")
  Call<List<BookResponse>> searchQuestionSourcesUsingDELETE(
    @Query("query") String query
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

  /**
   * searchQuestionSources
   * 
   * @param query query (required)
   * @return Call&lt;List<BookResponse>&gt;
   */
  
  @HEAD("data/searchQuestionSources")
  Call<List<BookResponse>> searchQuestionSourcesUsingHEAD(
    @Query("query") String query
  );

  /**
   * searchQuestionSources
   * 
   * @param query query (required)
   * @return Call&lt;List<BookResponse>&gt;
   */
  
  @OPTIONS("data/searchQuestionSources")
  Call<List<BookResponse>> searchQuestionSourcesUsingOPTIONS(
    @Query("query") String query
  );

  /**
   * searchQuestionSources
   * 
   * @param query query (required)
   * @return Call&lt;List<BookResponse>&gt;
   */
  
  @PATCH("data/searchQuestionSources")
  Call<List<BookResponse>> searchQuestionSourcesUsingPATCH(
    @Query("query") String query
  );

  /**
   * searchQuestionSources
   * 
   * @param query query (required)
   * @return Call&lt;List<BookResponse>&gt;
   */
  
  @POST("data/searchQuestionSources")
  Call<List<BookResponse>> searchQuestionSourcesUsingPOST(
    @Query("query") String query
  );

  /**
   * searchQuestionSources
   * 
   * @param query query (required)
   * @return Call&lt;List<BookResponse>&gt;
   */
  
  @PUT("data/searchQuestionSources")
  Call<List<BookResponse>> searchQuestionSourcesUsingPUT(
    @Query("query") String query
  );

}
