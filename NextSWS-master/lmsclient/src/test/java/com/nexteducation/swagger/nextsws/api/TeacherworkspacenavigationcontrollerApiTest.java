package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TeacherworkspacenavigationcontrollerApi
 */
public class TeacherworkspacenavigationcontrollerApiTest {

    private TeacherworkspacenavigationcontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TeacherworkspacenavigationcontrollerApi.class);
    }

    
    /**
     * getAdoptPlanPage
     *
     * 
     */
    @Test
    public void getAdoptPlanPageUsingGETTest() {
        Long academicYear = null;
        Long subjectId = null;
        Long classId = null;
        String className = null;
        Long sectionId = null;
        String sectionName = null;
        String subjectName = null;
        Long boardId = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getAdoptPlanPageUsingGET(academicYear, subjectId, classId, className, sectionId, sectionName, subjectName, boardId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getChapterInfoPage
     *
     * 
     */
    @Test
    public void getChapterInfoPageUsingGETTest() {
        Long studyClassId = null;
        Long sectionId = null;
        Long chapterid = null;
        String chapterName = null;
        Boolean customChapter = null;
        Long subjectId = null;
        Long currentSyllabusObjectId = null;
        Long currentBoardId = null;
        String sectionName = null;
        String className = null;
        Boolean isCustom = null;
        String subjectName = null;
        // ModelAndView response = api.getChapterInfoPageUsingGET(studyClassId, sectionId, chapterid, chapterName, customChapter, subjectId, currentSyllabusObjectId, currentBoardId, sectionName, className, isCustom, subjectName);

        // TODO: test validations
    }
    
    /**
     * getCourseworkPage
     *
     * 
     */
    @Test
    public void getCourseworkPageUsingGETTest() {
        Long studyClassId = null;
        String className = null;
        Long sectionId = null;
        String sectionName = null;
        Long subjectId = null;
        String subjectName = null;
        Long boardId = null;
        // ModelAndView response = api.getCourseworkPageUsingGET(studyClassId, className, sectionId, sectionName, subjectId, subjectName, boardId);

        // TODO: test validations
    }
    
    /**
     * getDetailedDayWisePlan
     *
     * 
     */
    @Test
    public void getDetailedDayWisePlanUsingGETTest() {
        Long subjectId = null;
        String subjectName = null;
        Long classId = null;
        String className = null;
        Long sectionId = null;
        String sectionName = null;
        Long boardId = null;
        Long chapterId = null;
        Boolean customChapter = null;
        Long currentSyllabusObjectId = null;
        Boolean isCustom = null;
        String chapterName = null;
        String type = null;
        String lpuuid = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getDetailedDayWisePlanUsingGET(subjectId, subjectName, classId, className, sectionId, sectionName, boardId, chapterId, customChapter, currentSyllabusObjectId, isCustom, chapterName, type, lpuuid, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getDetailedStudyPlan
     *
     * 
     */
    @Test
    public void getDetailedStudyPlanUsingGETTest() {
        Long subjectId = null;
        String subjectName = null;
        Long classId = null;
        String className = null;
        Long sectionId = null;
        String sectionName = null;
        Long boardId = null;
        Long chapterId = null;
        Boolean customChapter = null;
        Long currentSyllabusObjectId = null;
        Boolean isCustom = null;
        String chapterName = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getDetailedStudyPlanUsingGET(subjectId, subjectName, classId, className, sectionId, sectionName, boardId, chapterId, customChapter, currentSyllabusObjectId, isCustom, chapterName, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getDomainMap
     *
     * 
     */
    @Test
    public void getDomainMapUsingGETTest() {
        // String response = api.getDomainMapUsingGET();

        // TODO: test validations
    }
    
    /**
     * getLectureBreakupDetails
     *
     * 
     */
    @Test
    public void getLectureBreakupDetailsUsingGETTest() {
        Long subjectId = null;
        Long studyClassId = null;
        Long sectionId = null;
        Long currentBoardId = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getLectureBreakupDetailsUsingGET(subjectId, studyClassId, sectionId, currentBoardId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getLectureBreakupPage
     *
     * 
     */
    @Test
    public void getLectureBreakupPageUsingGETTest() {
        Long addSelectedSyllabus = null;
        Long subjectId = null;
        String subjectName = null;
        String className = null;
        String sectionName = null;
        Long studyClassId = null;
        Long sectionId = null;
        Long currentBoardId = null;
        Boolean custom = null;
        // ModelAndView response = api.getLectureBreakupPageUsingGET(addSelectedSyllabus, subjectId, subjectName, className, sectionName, studyClassId, sectionId, currentBoardId, custom);

        // TODO: test validations
    }
    
    /**
     * getLectureDetails
     *
     * 
     */
    @Test
    public void getLectureDetailsUsingGETTest() {
        Long sectionId = null;
        Long studyClassId = null;
        Long subjectId = null;
        String className = null;
        String sectionName = null;
        String subjectName = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getLectureDetailsUsingGET(sectionId, studyClassId, subjectId, className, sectionName, subjectName, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getLecturePlanPage
     *
     * 
     */
    @Test
    public void getLecturePlanPageUsingGETTest() {
        Long studyClassId = null;
        String className = null;
        Long sectionId = null;
        String sectionName = null;
        Long subjectId = null;
        String subjectName = null;
        Long boardId = null;
        // ModelAndView response = api.getLecturePlanPageUsingGET(studyClassId, className, sectionId, sectionName, subjectId, subjectName, boardId);

        // TODO: test validations
    }
    
    /**
     * getLecturesForChapters
     *
     * 
     */
    @Test
    public void getLecturesForChaptersUsingGET1Test() {
        Long sectionId = null;
        Long classId = null;
        Long chapterId = null;
        Boolean isCustom = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getLecturesForChaptersUsingGET1(sectionId, classId, chapterId, isCustom, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getLessonPlan
     *
     * 
     */
    @Test
    public void getLessonPlanUsingGET2Test() {
        Long subjectId = null;
        String subjectName = null;
        Long classId = null;
        String className = null;
        Long sectionId = null;
        String sectionName = null;
        Long boardId = null;
        Long chapterId = null;
        Boolean customChapter = null;
        Long currentSyllabusObjectId = null;
        Boolean isCustom = null;
        String chapterName = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getLessonPlanUsingGET2(subjectId, subjectName, classId, className, sectionId, sectionName, boardId, chapterId, customChapter, currentSyllabusObjectId, isCustom, chapterName, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getPage
     *
     * 
     */
    @Test
    public void getPageUsingGETTest() {
        Long sectionId = null;
        Long studyClassId = null;
        Long subjectId = null;
        String className = null;
        String sectionName = null;
        String subjectName = null;
        Long boardId = null;
        // ModelAndView response = api.getPageUsingGET(sectionId, studyClassId, subjectId, className, sectionName, subjectName, boardId);

        // TODO: test validations
    }
    
    /**
     * getPlanPreviewPage
     *
     * 
     */
    @Test
    public void getPlanPreviewPageUsingGETTest() {
        Long studyClassId = null;
        String className = null;
        Long sectionId = null;
        String sectionName = null;
        Long subjectId = null;
        String subjectName = null;
        Long boardId = null;
        // ModelAndView response = api.getPlanPreviewPageUsingGET(studyClassId, className, sectionId, sectionName, subjectId, subjectName, boardId);

        // TODO: test validations
    }
    
    /**
     * getPreviousOrNextLectureDetails
     *
     * 
     */
    @Test
    public void getPreviousOrNextLectureDetailsUsingGETTest() {
        Long sectionId = null;
        Long studyClassId = null;
        Long subjectId = null;
        String date = null;
        Boolean isNextLecture = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getPreviousOrNextLectureDetailsUsingGET(sectionId, studyClassId, subjectId, date, isNextLecture, sessionParams);

        // TODO: test validations
    }
    
    /**
     * getStudyPlan
     *
     * 
     */
    @Test
    public void getStudyPlanUsingGETTest() {
        Long subjectId = null;
        String subjectName = null;
        Long classId = null;
        String className = null;
        Long sectionId = null;
        String sectionName = null;
        Long boardId = null;
        Long chapterId = null;
        Boolean customChapter = null;
        Long currentSyllabusObjectId = null;
        Boolean isCustom = null;
        String chapterName = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.getStudyPlanUsingGET(subjectId, subjectName, classId, className, sectionId, sectionName, boardId, chapterId, customChapter, currentSyllabusObjectId, isCustom, chapterName, sessionParams);

        // TODO: test validations
    }
    
    /**
     * goToRunAClass
     *
     * 
     */
    @Test
    public void goToRunAClassUsingGETTest() {
        Long learningPlanId = null;
        Long subjectId = null;
        Long sectionId = null;
        // ModelAndView response = api.goToRunAClassUsingGET(learningPlanId, subjectId, sectionId);

        // TODO: test validations
    }
    
    /**
     * navigateToAddFromNextEducation
     *
     * 
     */
    @Test
    public void navigateToAddFromNextEducationUsingGETTest() {
        Long subjectId = null;
        Long studyClassId = null;
        Long sectionId = null;
        Long chapterId = null;
        Boolean customChapter = null;
        Boolean isForCreate = null;
        // ModelAndView response = api.navigateToAddFromNextEducationUsingGET(subjectId, studyClassId, sectionId, chapterId, customChapter, isForCreate);

        // TODO: test validations
    }
    
    /**
     * navigateToAddFromWebPage
     *
     * 
     */
    @Test
    public void navigateToAddFromWebPageUsingGETTest() {
        Long subjectId = null;
        Long studyClassId = null;
        Long sectionId = null;
        Long chapterId = null;
        Boolean customChapter = null;
        Boolean isForCreate = null;
        // ModelAndView response = api.navigateToAddFromWebPageUsingGET(subjectId, studyClassId, sectionId, chapterId, customChapter, isForCreate);

        // TODO: test validations
    }
    
    /**
     * navigateToCollaborationPage
     *
     * 
     */
    @Test
    public void navigateToCollaborationPageUsingGETTest() {
        Long subjectId = null;
        Long classId = null;
        Long sectionId = null;
        Long boardId = null;
        Long chapterId = null;
        Boolean customChapter = null;
        // ModelAndView response = api.navigateToCollaborationPageUsingGET(subjectId, classId, sectionId, boardId, chapterId, customChapter);

        // TODO: test validations
    }
    
    /**
     * navigateToCreateActivity
     *
     * 
     */
    @Test
    public void navigateToCreateActivityUsingGETTest() {
        Long subjectId = null;
        Long studyClassId = null;
        Long sectionId = null;
        Long chapterId = null;
        Boolean customChapter = null;
        Boolean isForCreate = null;
        String resourceUuid = null;
        String assetUuid = null;
        // ModelAndView response = api.navigateToCreateActivityUsingGET(subjectId, studyClassId, sectionId, chapterId, customChapter, isForCreate, resourceUuid, assetUuid);

        // TODO: test validations
    }
    
    /**
     * navigateToCreateAssessment
     *
     * 
     */
    @Test
    public void navigateToCreateAssessmentUsingGETTest() {
        Long boardId = null;
        Long subjectId = null;
        Long studyClassId = null;
        Long sectionId = null;
        Long chapterId = null;
        Boolean customChapter = null;
        Boolean isForCreate = null;
        String assessmentUuid = null;
        // ModelAndView response = api.navigateToCreateAssessmentUsingGET(boardId, subjectId, studyClassId, sectionId, chapterId, customChapter, isForCreate, assessmentUuid);

        // TODO: test validations
    }
    
    /**
     * navigateToCreateAssignment
     *
     * 
     */
    @Test
    public void navigateToCreateAssignmentUsingGETTest() {
        Long subjectId = null;
        Long studyClassId = null;
        Long sectionId = null;
        Long chapterId = null;
        Boolean customChapter = null;
        Boolean isForCreate = null;
        String resourceUuid = null;
        String assetUuid = null;
        // ModelAndView response = api.navigateToCreateAssignmentUsingGET(subjectId, studyClassId, sectionId, chapterId, customChapter, isForCreate, resourceUuid, assetUuid);

        // TODO: test validations
    }
    
    /**
     * navigateToCreateDocument
     *
     * 
     */
    @Test
    public void navigateToCreateDocumentUsingGETTest() {
        Long subjectId = null;
        Long studyClassId = null;
        Long sectionId = null;
        Long chapterId = null;
        Boolean customChapter = null;
        Boolean isForCreate = null;
        String assetUuid = null;
        String assetUrl = null;
        String resourceUuid = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.navigateToCreateDocumentUsingGET(subjectId, studyClassId, sectionId, chapterId, customChapter, isForCreate, assetUuid, assetUrl, resourceUuid, sessionParams);

        // TODO: test validations
    }
    
    /**
     * navigateToCreatePpt
     *
     * 
     */
    @Test
    public void navigateToCreatePptUsingGETTest() {
        Long subjectId = null;
        Long studyClassId = null;
        Long sectionId = null;
        Long chapterId = null;
        Boolean customChapter = null;
        Boolean isForCreate = null;
        String assetUuid = null;
        String assetUrl = null;
        String resourceUuid = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.navigateToCreatePptUsingGET(subjectId, studyClassId, sectionId, chapterId, customChapter, isForCreate, assetUuid, assetUrl, resourceUuid, sessionParams);

        // TODO: test validations
    }
    
    /**
     * navigateToCreateSpreadsheet
     *
     * 
     */
    @Test
    public void navigateToCreateSpreadsheetUsingGETTest() {
        Long subjectId = null;
        Long studyClassId = null;
        Long sectionId = null;
        Long chapterId = null;
        Boolean customChapter = null;
        Boolean isForCreate = null;
        String assetUuid = null;
        String assetUrl = null;
        String resourceUuid = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.navigateToCreateSpreadsheetUsingGET(subjectId, studyClassId, sectionId, chapterId, customChapter, isForCreate, assetUuid, assetUrl, resourceUuid, sessionParams);

        // TODO: test validations
    }
    
    /**
     * navigateToCreateWorksheet
     *
     * 
     */
    @Test
    public void navigateToCreateWorksheetUsingGETTest() {
        Long subjectId = null;
        Long studyClassId = null;
        Long sectionId = null;
        Long chapterId = null;
        Boolean customChapter = null;
        Boolean isForCreate = null;
        String resourceUuid = null;
        String assetUuid = null;
        String location = null;
        // ModelAndView response = api.navigateToCreateWorksheetUsingGET(subjectId, studyClassId, sectionId, chapterId, customChapter, isForCreate, resourceUuid, assetUuid, location);

        // TODO: test validations
    }
    
    /**
     * navigateToDayWisePlanPage
     *
     * 
     */
    @Test
    public void navigateToDayWisePlanPageUsingGETTest() {
        Long subjectId = null;
        String subjectName = null;
        Long classId = null;
        String className = null;
        Long sectionId = null;
        String sectionName = null;
        Long boardId = null;
        Long chapterId = null;
        Boolean customChapter = null;
        Long currentSyllabusObjectId = null;
        Boolean isCustom = null;
        String chapterName = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.navigateToDayWisePlanPageUsingGET(subjectId, subjectName, classId, className, sectionId, sectionName, boardId, chapterId, customChapter, currentSyllabusObjectId, isCustom, chapterName, sessionParams);

        // TODO: test validations
    }
    
    /**
     * navigateToFetchDocument
     *
     * 
     */
    @Test
    public void navigateToFetchDocumentUsingGETTest() {
        Long subjectId = null;
        Long studyClassId = null;
        Long sectionId = null;
        Long chapterId = null;
        Boolean customChapter = null;
        Boolean isForCreate = null;
        String assetUuid = null;
        String name = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.navigateToFetchDocumentUsingGET(subjectId, studyClassId, sectionId, chapterId, customChapter, isForCreate, assetUuid, name, sessionParams);

        // TODO: test validations
    }
    
    /**
     * navigateToHomeworkTracker
     *
     * 
     */
    @Test
    public void navigateToHomeworkTrackerUsingGETTest() {
        Long academicYear = null;
        Long subjectId = null;
        Long classId = null;
        String className = null;
        Long sectionId = null;
        String sectionName = null;
        String subjectName = null;
        Long boardId = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.navigateToHomeworkTrackerUsingGET(academicYear, subjectId, classId, className, sectionId, sectionName, subjectName, boardId, sessionParams);

        // TODO: test validations
    }
    
    /**
     * navigateToPreviewAssessment
     *
     * 
     */
    @Test
    public void navigateToPreviewAssessmentUsingGETTest() {
        Long boardId = null;
        Long subjectId = null;
        Long studyClassId = null;
        Long sectionId = null;
        Long chapterId = null;
        Boolean customChapter = null;
        Boolean isForCreate = null;
        String assessmentUuid = null;
        // ModelAndView response = api.navigateToPreviewAssessmentUsingGET(boardId, subjectId, studyClassId, sectionId, chapterId, customChapter, isForCreate, assessmentUuid);

        // TODO: test validations
    }
    
    /**
     * navigateToResourceBankPage
     *
     * 
     */
    @Test
    public void navigateToResourceBankPageUsingGETTest() {
        Long subjectId = null;
        Long classId = null;
        String className = null;
        Long sectionId = null;
        String sectionName = null;
        Long boardId = null;
        Long chapterId = null;
        String chapterName = null;
        Boolean customChapter = null;
        Boolean isCheck = null;
        String learningPlanMemberUuid = null;
        String lpuuid = null;
        // ModelAndView response = api.navigateToResourceBankPageUsingGET(subjectId, classId, className, sectionId, sectionName, boardId, chapterId, chapterName, customChapter, isCheck, learningPlanMemberUuid, lpuuid);

        // TODO: test validations
    }
    
    /**
     * navigateToResourcePlayer
     *
     * 
     */
    @Test
    public void navigateToResourcePlayerUsingGET1Test() {
        String resourceUuid = null;
        Long chapterId = null;
        Long syllabusId = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        String sectionType = null;
        String category = null;
        SessionParams sessionParams = null;
        // ModelAndView response = api.navigateToResourcePlayerUsingGET1(resourceUuid, chapterId, syllabusId, ifCustomSyllabus, ifCustomChapter, sectionType, category, sessionParams);

        // TODO: test validations
    }
    
    /**
     * navigateToRunAClassPage
     *
     * 
     */
    @Test
    public void navigateToRunAClassPageUsingGETTest() {
        // ModelAndView response = api.navigateToRunAClassPageUsingGET();

        // TODO: test validations
    }
    
    /**
     * navigateToStudyPlan
     *
     * 
     */
    @Test
    public void navigateToStudyPlanUsingGETTest() {
        Long subjectId = null;
        String subjectName = null;
        Long classId = null;
        String className = null;
        Long sectionId = null;
        String sectionName = null;
        Long boardId = null;
        Long chapterId = null;
        Boolean customChapter = null;
        Long currentSyllabusObjectId = null;
        Boolean isCustom = null;
        String chapterName = null;
        // ModelAndView response = api.navigateToStudyPlanUsingGET(subjectId, subjectName, classId, className, sectionId, sectionName, boardId, chapterId, customChapter, currentSyllabusObjectId, isCustom, chapterName);

        // TODO: test validations
    }
    
    /**
     * showHome
     *
     * 
     */
    @Test
    public void showHomeUsingGET2Test() {
        SessionParams sessionParams = null;
        // ModelAndView response = api.showHomeUsingGET2(sessionParams);

        // TODO: test validations
    }
    
}
