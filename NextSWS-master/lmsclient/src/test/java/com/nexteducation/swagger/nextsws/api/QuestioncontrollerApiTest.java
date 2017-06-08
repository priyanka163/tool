package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
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
        String file = null;
        String bookName = null;
        String bookPublisher = null;
        String boardId = null;
        String classId = null;
        String year = null;
        String fileName = null;
        String fileExtension = null;
        SessionParams sessionParams = null;
        // BookResponse response = api.addBookUsingPOST(file, bookName, bookPublisher, boardId, classId, year, fileName, fileExtension, sessionParams);

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
    public void getAssetUsingGETTest() {
        String uuid = null;
        // List<byte[]> response = api.getAssetUsingGET(uuid);

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
    public void getBooksForBoardAndQueryUsingGETTest() {
        String boardId = null;
        String query = null;
        // List<BookResponse> response = api.getBooksForBoardAndQueryUsingGET(boardId, query);

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
        SessionParams sessionParams = null;
        // List<ConceptLOResponse> response = api.getConceptLOMapUsingPOST(request, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getConceptsSearch
     *
     * 
     */
    @Test
    public void getConceptsSearchUsingGETTest() {
        SessionParams sessionParams = null;
        // List<ConceptShortResponse> response = api.getConceptsSearchUsingGET(sessionParams);

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
     * getRelatedConcepts
     *
     * 
     */
    @Test
    public void getRelatedConceptsUsingGETTest() {
        SessionParams sessionParams = null;
        // List<ConceptShortResponse> response = api.getRelatedConceptsUsingGET(sessionParams);

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
        SessionParams sessionParams = null;
        // String response = api.insertQuestionWithOutSyllabusUsingPOST(questionDTO, sessionParams);

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
    public void saveQuestionConceptsLOLDMapUsingGETTest() {
        List<QuestionConceptLOLDRequest> questionConcepts = null;
        SessionParams sessionParams = null;
        // Void response = api.saveQuestionConceptsLOLDMapUsingGET(questionConcepts, sessionParams);

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
        SessionParams sessionParams = null;
        // ModelAndView response = api.saveQuestionWithConceptsAndAssessmentsUsingPOST(questionConceptAssessmentRequest, sessionParams);

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
    
}
