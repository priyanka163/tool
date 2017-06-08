package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
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
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QuestioncontrollerApi
 */
public class QuestioncontrollerApiTest {

    private QuestioncontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(QuestioncontrollerApi.class);
    }

    
    /**
     * addBook
     *
     * 
     */
    @Test
    public void addBookUsingPOSTTest() {
        List<File> file = null;
        String bookName = null;
        String bookPublisher = null;
        String boardId = null;
        String classId = null;
        String year = null;
        String fileName = null;
        String fileExtension = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // BookResponse response = api.addBookUsingPOST(file, bookName, bookPublisher, boardId, classId, year, fileName, fileExtension, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * deleteQuestionAssessment
     *
     * 
     */
    @Test
    public void deleteQuestionAssessmentUsingGETTest() {
        String questionUUID = null;
        String assessmentId = null;
        // Boolean response = api.deleteQuestionAssessmentUsingGET(questionUUID, assessmentId);

        // TODO: test validations
    }
    
    /**
     * deleteQuestionLabActivity
     *
     * 
     */
    @Test
    public void deleteQuestionLabActivityUsingGETTest() {
        String questionUUID = null;
        String sectionType = null;
        String subjectId = null;
        // Boolean response = api.deleteQuestionLabActivityUsingGET(questionUUID, sectionType, subjectId);

        // TODO: test validations
    }
    
    /**
     * generateQuestionXML
     *
     * 
     */
    @Test
    public void generateQuestionXMLUsingGETTest() {
        Long questionID = null;
        // String response = api.generateQuestionXMLUsingGET(questionID);

        // TODO: test validations
    }
    
    /**
     * getAllProductTypes
     *
     * 
     */
    @Test
    public void getAllProductTypesUsingGETTest() {
        // List<ProductTypeResponse> response = api.getAllProductTypesUsingGET();

        // TODO: test validations
    }
    
    /**
     * getAllSectionTypes
     *
     * 
     */
    @Test
    public void getAllSectionTypesUsingGETTest() {
        String conceptUUID = null;
        // List<List<Object>> response = api.getAllSectionTypesUsingGET(conceptUUID);

        // TODO: test validations
    }
    
    /**
     * getAsset
     *
     * 
     */
    @Test
    public void getAssetUsingDELETETest() {
        String uuid = null;
        // List<byte[]> response = api.getAssetUsingDELETE(uuid);

        // TODO: test validations
    }
    
    /**
     * getAsset
     *
     * 
     */
    @Test
    public void getAssetUsingGETTest() {
        String uuid = null;
        // List<byte[]> response = api.getAssetUsingGET(uuid);

        // TODO: test validations
    }
    
    /**
     * getAsset
     *
     * 
     */
    @Test
    public void getAssetUsingHEADTest() {
        String uuid = null;
        // List<byte[]> response = api.getAssetUsingHEAD(uuid);

        // TODO: test validations
    }
    
    /**
     * getAsset
     *
     * 
     */
    @Test
    public void getAssetUsingOPTIONSTest() {
        String uuid = null;
        // List<byte[]> response = api.getAssetUsingOPTIONS(uuid);

        // TODO: test validations
    }
    
    /**
     * getAsset
     *
     * 
     */
    @Test
    public void getAssetUsingPATCHTest() {
        String uuid = null;
        // List<byte[]> response = api.getAssetUsingPATCH(uuid);

        // TODO: test validations
    }
    
    /**
     * getAsset
     *
     * 
     */
    @Test
    public void getAssetUsingPOSTTest() {
        String uuid = null;
        // List<byte[]> response = api.getAssetUsingPOST(uuid);

        // TODO: test validations
    }
    
    /**
     * getAsset
     *
     * 
     */
    @Test
    public void getAssetUsingPUTTest() {
        String uuid = null;
        // List<byte[]> response = api.getAssetUsingPUT(uuid);

        // TODO: test validations
    }
    
    /**
     * getBloomsTaxonomyValues
     *
     * 
     */
    @Test
    public void getBloomsTaxonomyValuesUsingDELETETest() {
        // List<String> response = api.getBloomsTaxonomyValuesUsingDELETE();

        // TODO: test validations
    }
    
    /**
     * getBloomsTaxonomyValues
     *
     * 
     */
    @Test
    public void getBloomsTaxonomyValuesUsingGETTest() {
        // List<String> response = api.getBloomsTaxonomyValuesUsingGET();

        // TODO: test validations
    }
    
    /**
     * getBloomsTaxonomyValues
     *
     * 
     */
    @Test
    public void getBloomsTaxonomyValuesUsingHEADTest() {
        // List<String> response = api.getBloomsTaxonomyValuesUsingHEAD();

        // TODO: test validations
    }
    
    /**
     * getBloomsTaxonomyValues
     *
     * 
     */
    @Test
    public void getBloomsTaxonomyValuesUsingOPTIONSTest() {
        // List<String> response = api.getBloomsTaxonomyValuesUsingOPTIONS();

        // TODO: test validations
    }
    
    /**
     * getBloomsTaxonomyValues
     *
     * 
     */
    @Test
    public void getBloomsTaxonomyValuesUsingPATCHTest() {
        // List<String> response = api.getBloomsTaxonomyValuesUsingPATCH();

        // TODO: test validations
    }
    
    /**
     * getBloomsTaxonomyValues
     *
     * 
     */
    @Test
    public void getBloomsTaxonomyValuesUsingPOSTTest() {
        // List<String> response = api.getBloomsTaxonomyValuesUsingPOST();

        // TODO: test validations
    }
    
    /**
     * getBloomsTaxonomyValues
     *
     * 
     */
    @Test
    public void getBloomsTaxonomyValuesUsingPUTTest() {
        // List<String> response = api.getBloomsTaxonomyValuesUsingPUT();

        // TODO: test validations
    }
    
    /**
     * getBoards
     *
     * 
     */
    @Test
    public void getBoardsUsingGETTest() {
        // List<Mapstringstring> response = api.getBoardsUsingGET();

        // TODO: test validations
    }
    
    /**
     * getBooksForBoardAndQuery
     *
     * 
     */
    @Test
    public void getBooksForBoardAndQueryUsingDELETETest() {
        String boardId = null;
        String query = null;
        // List<BookResponse> response = api.getBooksForBoardAndQueryUsingDELETE(boardId, query);

        // TODO: test validations
    }
    
    /**
     * getBooksForBoardAndQuery
     *
     * 
     */
    @Test
    public void getBooksForBoardAndQueryUsingGETTest() {
        String boardId = null;
        String query = null;
        // List<BookResponse> response = api.getBooksForBoardAndQueryUsingGET(boardId, query);

        // TODO: test validations
    }
    
    /**
     * getBooksForBoardAndQuery
     *
     * 
     */
    @Test
    public void getBooksForBoardAndQueryUsingHEADTest() {
        String boardId = null;
        String query = null;
        // List<BookResponse> response = api.getBooksForBoardAndQueryUsingHEAD(boardId, query);

        // TODO: test validations
    }
    
    /**
     * getBooksForBoardAndQuery
     *
     * 
     */
    @Test
    public void getBooksForBoardAndQueryUsingOPTIONSTest() {
        String boardId = null;
        String query = null;
        // List<BookResponse> response = api.getBooksForBoardAndQueryUsingOPTIONS(boardId, query);

        // TODO: test validations
    }
    
    /**
     * getBooksForBoardAndQuery
     *
     * 
     */
    @Test
    public void getBooksForBoardAndQueryUsingPATCHTest() {
        String boardId = null;
        String query = null;
        // List<BookResponse> response = api.getBooksForBoardAndQueryUsingPATCH(boardId, query);

        // TODO: test validations
    }
    
    /**
     * getBooksForBoardAndQuery
     *
     * 
     */
    @Test
    public void getBooksForBoardAndQueryUsingPOSTTest() {
        String boardId = null;
        String query = null;
        // List<BookResponse> response = api.getBooksForBoardAndQueryUsingPOST(boardId, query);

        // TODO: test validations
    }
    
    /**
     * getBooksForBoardAndQuery
     *
     * 
     */
    @Test
    public void getBooksForBoardAndQueryUsingPUTTest() {
        String boardId = null;
        String query = null;
        // List<BookResponse> response = api.getBooksForBoardAndQueryUsingPUT(boardId, query);

        // TODO: test validations
    }
    
    /**
     * getBooksForBoardClassAndQuery
     *
     * 
     */
    @Test
    public void getBooksForBoardClassAndQueryUsingDELETETest() {
        String boardId = null;
        String classId = null;
        String query = null;
        // List<BookResponse> response = api.getBooksForBoardClassAndQueryUsingDELETE(boardId, classId, query);

        // TODO: test validations
    }
    
    /**
     * getBooksForBoardClassAndQuery
     *
     * 
     */
    @Test
    public void getBooksForBoardClassAndQueryUsingGETTest() {
        String boardId = null;
        String classId = null;
        String query = null;
        // List<BookResponse> response = api.getBooksForBoardClassAndQueryUsingGET(boardId, classId, query);

        // TODO: test validations
    }
    
    /**
     * getBooksForBoardClassAndQuery
     *
     * 
     */
    @Test
    public void getBooksForBoardClassAndQueryUsingHEADTest() {
        String boardId = null;
        String classId = null;
        String query = null;
        // List<BookResponse> response = api.getBooksForBoardClassAndQueryUsingHEAD(boardId, classId, query);

        // TODO: test validations
    }
    
    /**
     * getBooksForBoardClassAndQuery
     *
     * 
     */
    @Test
    public void getBooksForBoardClassAndQueryUsingOPTIONSTest() {
        String boardId = null;
        String classId = null;
        String query = null;
        // List<BookResponse> response = api.getBooksForBoardClassAndQueryUsingOPTIONS(boardId, classId, query);

        // TODO: test validations
    }
    
    /**
     * getBooksForBoardClassAndQuery
     *
     * 
     */
    @Test
    public void getBooksForBoardClassAndQueryUsingPATCHTest() {
        String boardId = null;
        String classId = null;
        String query = null;
        // List<BookResponse> response = api.getBooksForBoardClassAndQueryUsingPATCH(boardId, classId, query);

        // TODO: test validations
    }
    
    /**
     * getBooksForBoardClassAndQuery
     *
     * 
     */
    @Test
    public void getBooksForBoardClassAndQueryUsingPOSTTest() {
        String boardId = null;
        String classId = null;
        String query = null;
        // List<BookResponse> response = api.getBooksForBoardClassAndQueryUsingPOST(boardId, classId, query);

        // TODO: test validations
    }
    
    /**
     * getBooksForBoardClassAndQuery
     *
     * 
     */
    @Test
    public void getBooksForBoardClassAndQueryUsingPUTTest() {
        String boardId = null;
        String classId = null;
        String query = null;
        // List<BookResponse> response = api.getBooksForBoardClassAndQueryUsingPUT(boardId, classId, query);

        // TODO: test validations
    }
    
    /**
     * getChaptersForBoardClassSyllabus
     *
     * 
     */
    @Test
    public void getChaptersForBoardClassSyllabusUsingGETTest() {
        // List<SyllabusNodeResponse> response = api.getChaptersForBoardClassSyllabusUsingGET();

        // TODO: test validations
    }
    
    /**
     * getClassesForBoard
     *
     * 
     */
    @Test
    public void getClassesForBoardUsingGETTest() {
        // List<Mapstringstring> response = api.getClassesForBoardUsingGET();

        // TODO: test validations
    }
    
    /**
     * getConceptLOMap
     *
     * 
     */
    @Test
    public void getConceptLOMapUsingPOSTTest() {
        ConceptLORequest request = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<ConceptLOResponse> response = api.getConceptLOMapUsingPOST(request, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getConceptsSearch
     *
     * 
     */
    @Test
    public void getConceptsSearchUsingGETTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<ConceptShortResponse> response = api.getConceptsSearchUsingGET(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getFilteredQuestions
     *
     * 
     */
    @Test
    public void getFilteredQuestionsUsingDELETETest() {
        Long chapterId = null;
        // Void response = api.getFilteredQuestionsUsingDELETE(chapterId);

        // TODO: test validations
    }
    
    /**
     * getFilteredQuestions
     *
     * 
     */
    @Test
    public void getFilteredQuestionsUsingGETTest() {
        Long chapterId = null;
        // Void response = api.getFilteredQuestionsUsingGET(chapterId);

        // TODO: test validations
    }
    
    /**
     * getFilteredQuestions
     *
     * 
     */
    @Test
    public void getFilteredQuestionsUsingHEADTest() {
        Long chapterId = null;
        // Void response = api.getFilteredQuestionsUsingHEAD(chapterId);

        // TODO: test validations
    }
    
    /**
     * getFilteredQuestions
     *
     * 
     */
    @Test
    public void getFilteredQuestionsUsingOPTIONSTest() {
        Long chapterId = null;
        // Void response = api.getFilteredQuestionsUsingOPTIONS(chapterId);

        // TODO: test validations
    }
    
    /**
     * getFilteredQuestions
     *
     * 
     */
    @Test
    public void getFilteredQuestionsUsingPATCHTest() {
        Long chapterId = null;
        // Void response = api.getFilteredQuestionsUsingPATCH(chapterId);

        // TODO: test validations
    }
    
    /**
     * getFilteredQuestions
     *
     * 
     */
    @Test
    public void getFilteredQuestionsUsingPOSTTest() {
        Long chapterId = null;
        // Void response = api.getFilteredQuestionsUsingPOST(chapterId);

        // TODO: test validations
    }
    
    /**
     * getFilteredQuestions
     *
     * 
     */
    @Test
    public void getFilteredQuestionsUsingPUTTest() {
        Long chapterId = null;
        // Void response = api.getFilteredQuestionsUsingPUT(chapterId);

        // TODO: test validations
    }
    
    /**
     * getRelatedConcepts
     *
     * 
     */
    @Test
    public void getRelatedConceptsUsingGETTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // List<ConceptShortResponse> response = api.getRelatedConceptsUsingGET(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getSimilarQuestions
     *
     * 
     */
    @Test
    public void getSimilarQuestionsUsingDELETETest() {
        SimilarQuestionRequest sqr = null;
        // List<AssessmentQuestionShortResponse> response = api.getSimilarQuestionsUsingDELETE(sqr);

        // TODO: test validations
    }
    
    /**
     * getSimilarQuestions
     *
     * 
     */
    @Test
    public void getSimilarQuestionsUsingGETTest() {
        SimilarQuestionRequest sqr = null;
        // List<AssessmentQuestionShortResponse> response = api.getSimilarQuestionsUsingGET(sqr);

        // TODO: test validations
    }
    
    /**
     * getSimilarQuestions
     *
     * 
     */
    @Test
    public void getSimilarQuestionsUsingHEADTest() {
        SimilarQuestionRequest sqr = null;
        // List<AssessmentQuestionShortResponse> response = api.getSimilarQuestionsUsingHEAD(sqr);

        // TODO: test validations
    }
    
    /**
     * getSimilarQuestions
     *
     * 
     */
    @Test
    public void getSimilarQuestionsUsingOPTIONSTest() {
        SimilarQuestionRequest sqr = null;
        // List<AssessmentQuestionShortResponse> response = api.getSimilarQuestionsUsingOPTIONS(sqr);

        // TODO: test validations
    }
    
    /**
     * getSimilarQuestions
     *
     * 
     */
    @Test
    public void getSimilarQuestionsUsingPATCHTest() {
        SimilarQuestionRequest sqr = null;
        // List<AssessmentQuestionShortResponse> response = api.getSimilarQuestionsUsingPATCH(sqr);

        // TODO: test validations
    }
    
    /**
     * getSimilarQuestions
     *
     * 
     */
    @Test
    public void getSimilarQuestionsUsingPOSTTest() {
        SimilarQuestionRequest sqr = null;
        // List<AssessmentQuestionShortResponse> response = api.getSimilarQuestionsUsingPOST(sqr);

        // TODO: test validations
    }
    
    /**
     * getSimilarQuestions
     *
     * 
     */
    @Test
    public void getSimilarQuestionsUsingPUTTest() {
        SimilarQuestionRequest sqr = null;
        // List<AssessmentQuestionShortResponse> response = api.getSimilarQuestionsUsingPUT(sqr);

        // TODO: test validations
    }
    
    /**
     * getSubjectsForBoardClass
     *
     * 
     */
    @Test
    public void getSubjectsForBoardClassUsingDELETETest() {
        // List<Mapstringstring> response = api.getSubjectsForBoardClassUsingDELETE();

        // TODO: test validations
    }
    
    /**
     * getSubjectsForBoardClass
     *
     * 
     */
    @Test
    public void getSubjectsForBoardClassUsingGETTest() {
        // List<Mapstringstring> response = api.getSubjectsForBoardClassUsingGET();

        // TODO: test validations
    }
    
    /**
     * getSubjectsForBoardClass
     *
     * 
     */
    @Test
    public void getSubjectsForBoardClassUsingHEADTest() {
        // List<Mapstringstring> response = api.getSubjectsForBoardClassUsingHEAD();

        // TODO: test validations
    }
    
    /**
     * getSubjectsForBoardClass
     *
     * 
     */
    @Test
    public void getSubjectsForBoardClassUsingOPTIONSTest() {
        // List<Mapstringstring> response = api.getSubjectsForBoardClassUsingOPTIONS();

        // TODO: test validations
    }
    
    /**
     * getSubjectsForBoardClass
     *
     * 
     */
    @Test
    public void getSubjectsForBoardClassUsingPATCHTest() {
        // List<Mapstringstring> response = api.getSubjectsForBoardClassUsingPATCH();

        // TODO: test validations
    }
    
    /**
     * getSubjectsForBoardClass
     *
     * 
     */
    @Test
    public void getSubjectsForBoardClassUsingPOSTTest() {
        // List<Mapstringstring> response = api.getSubjectsForBoardClassUsingPOST();

        // TODO: test validations
    }
    
    /**
     * getSubjectsForBoardClass
     *
     * 
     */
    @Test
    public void getSubjectsForBoardClassUsingPUTTest() {
        // List<Mapstringstring> response = api.getSubjectsForBoardClassUsingPUT();

        // TODO: test validations
    }
    
    /**
     * insertQuestionWithOutSyllabus
     *
     * 
     */
    @Test
    public void insertQuestionWithOutSyllabusUsingPOSTTest() {
        QuestionRequestDTO questionDTO = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // String response = api.insertQuestionWithOutSyllabusUsingPOST(questionDTO, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * loadLanguageAndConcepts
     *
     * 
     */
    @Test
    public void loadLanguageAndConceptsUsingDELETETest() {
        // Void response = api.loadLanguageAndConceptsUsingDELETE();

        // TODO: test validations
    }
    
    /**
     * loadLanguageAndConcepts
     *
     * 
     */
    @Test
    public void loadLanguageAndConceptsUsingGETTest() {
        // Void response = api.loadLanguageAndConceptsUsingGET();

        // TODO: test validations
    }
    
    /**
     * loadLanguageAndConcepts
     *
     * 
     */
    @Test
    public void loadLanguageAndConceptsUsingHEADTest() {
        // Void response = api.loadLanguageAndConceptsUsingHEAD();

        // TODO: test validations
    }
    
    /**
     * loadLanguageAndConcepts
     *
     * 
     */
    @Test
    public void loadLanguageAndConceptsUsingOPTIONSTest() {
        // Void response = api.loadLanguageAndConceptsUsingOPTIONS();

        // TODO: test validations
    }
    
    /**
     * loadLanguageAndConcepts
     *
     * 
     */
    @Test
    public void loadLanguageAndConceptsUsingPATCHTest() {
        // Void response = api.loadLanguageAndConceptsUsingPATCH();

        // TODO: test validations
    }
    
    /**
     * loadLanguageAndConcepts
     *
     * 
     */
    @Test
    public void loadLanguageAndConceptsUsingPOSTTest() {
        // Void response = api.loadLanguageAndConceptsUsingPOST();

        // TODO: test validations
    }
    
    /**
     * loadLanguageAndConcepts
     *
     * 
     */
    @Test
    public void loadLanguageAndConceptsUsingPUTTest() {
        // Void response = api.loadLanguageAndConceptsUsingPUT();

        // TODO: test validations
    }
    
    /**
     * previewQuestion
     *
     * 
     */
    @Test
    public void previewQuestionUsingDELETETest() {
        // ModelAndView response = api.previewQuestionUsingDELETE();

        // TODO: test validations
    }
    
    /**
     * previewQuestion
     *
     * 
     */
    @Test
    public void previewQuestionUsingGETTest() {
        // ModelAndView response = api.previewQuestionUsingGET();

        // TODO: test validations
    }
    
    /**
     * previewQuestion
     *
     * 
     */
    @Test
    public void previewQuestionUsingHEADTest() {
        // ModelAndView response = api.previewQuestionUsingHEAD();

        // TODO: test validations
    }
    
    /**
     * previewQuestion
     *
     * 
     */
    @Test
    public void previewQuestionUsingOPTIONSTest() {
        // ModelAndView response = api.previewQuestionUsingOPTIONS();

        // TODO: test validations
    }
    
    /**
     * previewQuestion
     *
     * 
     */
    @Test
    public void previewQuestionUsingPATCHTest() {
        // ModelAndView response = api.previewQuestionUsingPATCH();

        // TODO: test validations
    }
    
    /**
     * previewQuestion
     *
     * 
     */
    @Test
    public void previewQuestionUsingPOSTTest() {
        // ModelAndView response = api.previewQuestionUsingPOST();

        // TODO: test validations
    }
    
    /**
     * previewQuestion
     *
     * 
     */
    @Test
    public void previewQuestionUsingPUTTest() {
        // ModelAndView response = api.previewQuestionUsingPUT();

        // TODO: test validations
    }
    
    /**
     * questionDevelopmentContinued
     *
     * 
     */
    @Test
    public void questionDevelopmentContinuedUsingDELETETest() {
        // ModelAndView response = api.questionDevelopmentContinuedUsingDELETE();

        // TODO: test validations
    }
    
    /**
     * questionDevelopmentContinued
     *
     * 
     */
    @Test
    public void questionDevelopmentContinuedUsingGETTest() {
        // ModelAndView response = api.questionDevelopmentContinuedUsingGET();

        // TODO: test validations
    }
    
    /**
     * questionDevelopmentContinued
     *
     * 
     */
    @Test
    public void questionDevelopmentContinuedUsingHEADTest() {
        // ModelAndView response = api.questionDevelopmentContinuedUsingHEAD();

        // TODO: test validations
    }
    
    /**
     * questionDevelopmentContinued
     *
     * 
     */
    @Test
    public void questionDevelopmentContinuedUsingOPTIONSTest() {
        // ModelAndView response = api.questionDevelopmentContinuedUsingOPTIONS();

        // TODO: test validations
    }
    
    /**
     * questionDevelopmentContinued
     *
     * 
     */
    @Test
    public void questionDevelopmentContinuedUsingPATCHTest() {
        // ModelAndView response = api.questionDevelopmentContinuedUsingPATCH();

        // TODO: test validations
    }
    
    /**
     * questionDevelopmentContinued
     *
     * 
     */
    @Test
    public void questionDevelopmentContinuedUsingPOSTTest() {
        // ModelAndView response = api.questionDevelopmentContinuedUsingPOST();

        // TODO: test validations
    }
    
    /**
     * questionDevelopmentContinued
     *
     * 
     */
    @Test
    public void questionDevelopmentContinuedUsingPUTTest() {
        // ModelAndView response = api.questionDevelopmentContinuedUsingPUT();

        // TODO: test validations
    }
    
    /**
     * sampleQuestionDevelopment
     *
     * 
     */
    @Test
    public void sampleQuestionDevelopmentUsingDELETETest() {
        // ModelAndView response = api.sampleQuestionDevelopmentUsingDELETE();

        // TODO: test validations
    }
    
    /**
     * sampleQuestionDevelopment
     *
     * 
     */
    @Test
    public void sampleQuestionDevelopmentUsingGETTest() {
        // ModelAndView response = api.sampleQuestionDevelopmentUsingGET();

        // TODO: test validations
    }
    
    /**
     * sampleQuestionDevelopment
     *
     * 
     */
    @Test
    public void sampleQuestionDevelopmentUsingHEADTest() {
        // ModelAndView response = api.sampleQuestionDevelopmentUsingHEAD();

        // TODO: test validations
    }
    
    /**
     * sampleQuestionDevelopment
     *
     * 
     */
    @Test
    public void sampleQuestionDevelopmentUsingOPTIONSTest() {
        // ModelAndView response = api.sampleQuestionDevelopmentUsingOPTIONS();

        // TODO: test validations
    }
    
    /**
     * sampleQuestionDevelopment
     *
     * 
     */
    @Test
    public void sampleQuestionDevelopmentUsingPATCHTest() {
        // ModelAndView response = api.sampleQuestionDevelopmentUsingPATCH();

        // TODO: test validations
    }
    
    /**
     * sampleQuestionDevelopment
     *
     * 
     */
    @Test
    public void sampleQuestionDevelopmentUsingPOSTTest() {
        // ModelAndView response = api.sampleQuestionDevelopmentUsingPOST();

        // TODO: test validations
    }
    
    /**
     * sampleQuestionDevelopment
     *
     * 
     */
    @Test
    public void sampleQuestionDevelopmentUsingPUTTest() {
        // ModelAndView response = api.sampleQuestionDevelopmentUsingPUT();

        // TODO: test validations
    }
    
    /**
     * saveQuestionAssessment
     *
     * 
     */
    @Test
    public void saveQuestionAssessmentUsingGETTest() {
        String questionUUID = null;
        String assessmentId = null;
        // Boolean response = api.saveQuestionAssessmentUsingGET(questionUUID, assessmentId);

        // TODO: test validations
    }
    
    /**
     * saveQuestionConceptsLOLDMap
     *
     * 
     */
    @Test
    public void saveQuestionConceptsLOLDMapUsingDELETETest() {
        List<QuestionConceptLOLDRequest> questionConcepts = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Void response = api.saveQuestionConceptsLOLDMapUsingDELETE(questionConcepts, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * saveQuestionConceptsLOLDMap
     *
     * 
     */
    @Test
    public void saveQuestionConceptsLOLDMapUsingGETTest() {
        List<QuestionConceptLOLDRequest> questionConcepts = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Void response = api.saveQuestionConceptsLOLDMapUsingGET(questionConcepts, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * saveQuestionConceptsLOLDMap
     *
     * 
     */
    @Test
    public void saveQuestionConceptsLOLDMapUsingHEADTest() {
        List<QuestionConceptLOLDRequest> questionConcepts = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Void response = api.saveQuestionConceptsLOLDMapUsingHEAD(questionConcepts, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * saveQuestionConceptsLOLDMap
     *
     * 
     */
    @Test
    public void saveQuestionConceptsLOLDMapUsingOPTIONSTest() {
        List<QuestionConceptLOLDRequest> questionConcepts = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Void response = api.saveQuestionConceptsLOLDMapUsingOPTIONS(questionConcepts, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * saveQuestionConceptsLOLDMap
     *
     * 
     */
    @Test
    public void saveQuestionConceptsLOLDMapUsingPATCHTest() {
        List<QuestionConceptLOLDRequest> questionConcepts = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Void response = api.saveQuestionConceptsLOLDMapUsingPATCH(questionConcepts, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * saveQuestionConceptsLOLDMap
     *
     * 
     */
    @Test
    public void saveQuestionConceptsLOLDMapUsingPOSTTest() {
        List<QuestionConceptLOLDRequest> questionConcepts = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Void response = api.saveQuestionConceptsLOLDMapUsingPOST(questionConcepts, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * saveQuestionConceptsLOLDMap
     *
     * 
     */
    @Test
    public void saveQuestionConceptsLOLDMapUsingPUTTest() {
        List<QuestionConceptLOLDRequest> questionConcepts = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // Void response = api.saveQuestionConceptsLOLDMapUsingPUT(questionConcepts, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * saveQuestionLabActivity
     *
     * 
     */
    @Test
    public void saveQuestionLabActivityUsingGETTest() {
        String questionUUID = null;
        String sectionType = null;
        String subjectId = null;
        // Boolean response = api.saveQuestionLabActivityUsingGET(questionUUID, sectionType, subjectId);

        // TODO: test validations
    }
    
    /**
     * saveQuestionWithConceptsAndAssessments
     *
     * 
     */
    @Test
    public void saveQuestionWithConceptsAndAssessmentsUsingPOSTTest() {
        QuestionConceptAssessmentRequest questionConceptAssessmentRequest = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.saveQuestionWithConceptsAndAssessmentsUsingPOST(questionConceptAssessmentRequest, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * searchQuestionSources
     *
     * 
     */
    @Test
    public void searchQuestionSourcesUsingDELETETest() {
        String query = null;
        // List<BookResponse> response = api.searchQuestionSourcesUsingDELETE(query);

        // TODO: test validations
    }
    
    /**
     * searchQuestionSources
     *
     * 
     */
    @Test
    public void searchQuestionSourcesUsingGETTest() {
        String query = null;
        // List<BookResponse> response = api.searchQuestionSourcesUsingGET(query);

        // TODO: test validations
    }
    
    /**
     * searchQuestionSources
     *
     * 
     */
    @Test
    public void searchQuestionSourcesUsingHEADTest() {
        String query = null;
        // List<BookResponse> response = api.searchQuestionSourcesUsingHEAD(query);

        // TODO: test validations
    }
    
    /**
     * searchQuestionSources
     *
     * 
     */
    @Test
    public void searchQuestionSourcesUsingOPTIONSTest() {
        String query = null;
        // List<BookResponse> response = api.searchQuestionSourcesUsingOPTIONS(query);

        // TODO: test validations
    }
    
    /**
     * searchQuestionSources
     *
     * 
     */
    @Test
    public void searchQuestionSourcesUsingPATCHTest() {
        String query = null;
        // List<BookResponse> response = api.searchQuestionSourcesUsingPATCH(query);

        // TODO: test validations
    }
    
    /**
     * searchQuestionSources
     *
     * 
     */
    @Test
    public void searchQuestionSourcesUsingPOSTTest() {
        String query = null;
        // List<BookResponse> response = api.searchQuestionSourcesUsingPOST(query);

        // TODO: test validations
    }
    
    /**
     * searchQuestionSources
     *
     * 
     */
    @Test
    public void searchQuestionSourcesUsingPUTTest() {
        String query = null;
        // List<BookResponse> response = api.searchQuestionSourcesUsingPUT(query);

        // TODO: test validations
    }
    
}
