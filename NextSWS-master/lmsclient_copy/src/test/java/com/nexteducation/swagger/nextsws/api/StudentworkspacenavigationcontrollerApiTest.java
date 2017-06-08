package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.ResourceResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StudentworkspacenavigationcontrollerApi
 */
public class StudentworkspacenavigationcontrollerApiTest {

    private StudentworkspacenavigationcontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(StudentworkspacenavigationcontrollerApi.class);
    }

    
    /**
     * askAQuestion
     *
     * 
     */
    @Test
    public void askAQuestionUsingGETTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.askAQuestionUsingGET(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * classRoom
     *
     * 
     */
    @Test
    public void classRoomUsingGETTest() {
        String syllabusId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.classRoomUsingGET(syllabusId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * createStudyPlan
     *
     * 
     */
    @Test
    public void createStudyPlanUsingGETTest() {
        Long syllabusId = null;
        Boolean ifCustomSyllabus = null;
        String subjectName = null;
        String schoolSubjectName = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.createStudyPlanUsingGET(syllabusId, ifCustomSyllabus, subjectName, schoolSubjectName, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * documentViewer
     *
     * 
     */
    @Test
    public void documentViewerUsingGETTest() {
        String resourceUUID = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.documentViewerUsingGET(resourceUUID, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * fetchAssetByResource
     *
     * 
     */
    @Test
    public void fetchAssetByResourceUsingGETTest() {
        String resUuid = null;
        // ResourceResponse response = api.fetchAssetByResourceUsingGET(resUuid);

        // TODO: test validations
    }
    
    /**
     * getAssessmentTestPage
     *
     * 
     */
    @Test
    public void getAssessmentTestPageUsingGETTest() {
        String assessmentUUID = null;
        Long syllabusId = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        Long chapterId = null;
        String resourceLocation = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getAssessmentTestPageUsingGET(assessmentUUID, syllabusId, ifCustomSyllabus, ifCustomChapter, chapterId, resourceLocation, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getChaterPage
     *
     * 
     */
    @Test
    public void getChaterPageUsingGETTest() {
        Long syllabusId = null;
        Long subjectId = null;
        Boolean ifCustomSyllabus = null;
        String subjectName = null;
        String schoolSubjectName = null;
        Long schoolSubjectId = null;
        String syllabusUUID = null;
        String lpuuid = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getChaterPageUsingGET(syllabusId, subjectId, ifCustomSyllabus, subjectName, schoolSubjectName, schoolSubjectId, syllabusUUID, lpuuid, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getLecturesForChapters
     *
     * 
     */
    @Test
    public void getLecturesForChaptersUsingGETTest() {
        Long chapterId = null;
        Long subjectId = null;
        String chapterName = null;
        Long syllabusId = null;
        Boolean ifCustomChapter = null;
        String schoolSubjectName = null;
        String chapterUUID = null;
        Long schoolSubjectId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getLecturesForChaptersUsingGET(chapterId, subjectId, chapterName, syllabusId, ifCustomChapter, schoolSubjectName, chapterUUID, schoolSubjectId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getResourceListForChapter
     *
     * 
     */
    @Test
    public void getResourceListForChapterUsingDELETETest() {
        Long chapterId = null;
        Long syllabusId = null;
        String category = null;
        String chapterName = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        String module = null;
        String schoolSubjectName = null;
        String subjectId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getResourceListForChapterUsingDELETE(chapterId, syllabusId, category, chapterName, ifCustomSyllabus, ifCustomChapter, module, schoolSubjectName, subjectId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getResourceListForChapter
     *
     * 
     */
    @Test
    public void getResourceListForChapterUsingGETTest() {
        Long chapterId = null;
        Long syllabusId = null;
        String category = null;
        String chapterName = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        String module = null;
        String schoolSubjectName = null;
        String subjectId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getResourceListForChapterUsingGET(chapterId, syllabusId, category, chapterName, ifCustomSyllabus, ifCustomChapter, module, schoolSubjectName, subjectId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getResourceListForChapter
     *
     * 
     */
    @Test
    public void getResourceListForChapterUsingHEADTest() {
        Long chapterId = null;
        Long syllabusId = null;
        String category = null;
        String chapterName = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        String module = null;
        String schoolSubjectName = null;
        String subjectId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getResourceListForChapterUsingHEAD(chapterId, syllabusId, category, chapterName, ifCustomSyllabus, ifCustomChapter, module, schoolSubjectName, subjectId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getResourceListForChapter
     *
     * 
     */
    @Test
    public void getResourceListForChapterUsingOPTIONSTest() {
        Long chapterId = null;
        Long syllabusId = null;
        String category = null;
        String chapterName = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        String module = null;
        String schoolSubjectName = null;
        String subjectId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getResourceListForChapterUsingOPTIONS(chapterId, syllabusId, category, chapterName, ifCustomSyllabus, ifCustomChapter, module, schoolSubjectName, subjectId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getResourceListForChapter
     *
     * 
     */
    @Test
    public void getResourceListForChapterUsingPATCHTest() {
        Long chapterId = null;
        Long syllabusId = null;
        String category = null;
        String chapterName = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        String module = null;
        String schoolSubjectName = null;
        String subjectId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getResourceListForChapterUsingPATCH(chapterId, syllabusId, category, chapterName, ifCustomSyllabus, ifCustomChapter, module, schoolSubjectName, subjectId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getResourceListForChapter
     *
     * 
     */
    @Test
    public void getResourceListForChapterUsingPOSTTest() {
        Long chapterId = null;
        Long syllabusId = null;
        String category = null;
        String chapterName = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        String module = null;
        String schoolSubjectName = null;
        String subjectId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getResourceListForChapterUsingPOST(chapterId, syllabusId, category, chapterName, ifCustomSyllabus, ifCustomChapter, module, schoolSubjectName, subjectId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getResourceListForChapter
     *
     * 
     */
    @Test
    public void getResourceListForChapterUsingPUTTest() {
        Long chapterId = null;
        Long syllabusId = null;
        String category = null;
        String chapterName = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        String module = null;
        String schoolSubjectName = null;
        String subjectId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getResourceListForChapterUsingPUT(chapterId, syllabusId, category, chapterName, ifCustomSyllabus, ifCustomChapter, module, schoolSubjectName, subjectId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getWikiPage
     *
     * 
     */
    @Test
    public void getWikiPageUsingGETTest() {
        String uuid = null;
        String resourceLocation = null;
        // ModelAndView response = api.getWikiPageUsingGET(uuid, resourceLocation);

        // TODO: test validations
    }
    
    /**
     * getWikiResourceListForChapters
     *
     * 
     */
    @Test
    public void getWikiResourceListForChaptersUsingDELETETest() {
        Long chapterId = null;
        Long syllabusId = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        String module = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getWikiResourceListForChaptersUsingDELETE(chapterId, syllabusId, ifCustomSyllabus, ifCustomChapter, module, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getWikiResourceListForChapters
     *
     * 
     */
    @Test
    public void getWikiResourceListForChaptersUsingGETTest() {
        Long chapterId = null;
        Long syllabusId = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        String module = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getWikiResourceListForChaptersUsingGET(chapterId, syllabusId, ifCustomSyllabus, ifCustomChapter, module, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getWikiResourceListForChapters
     *
     * 
     */
    @Test
    public void getWikiResourceListForChaptersUsingHEADTest() {
        Long chapterId = null;
        Long syllabusId = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        String module = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getWikiResourceListForChaptersUsingHEAD(chapterId, syllabusId, ifCustomSyllabus, ifCustomChapter, module, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getWikiResourceListForChapters
     *
     * 
     */
    @Test
    public void getWikiResourceListForChaptersUsingOPTIONSTest() {
        Long chapterId = null;
        Long syllabusId = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        String module = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getWikiResourceListForChaptersUsingOPTIONS(chapterId, syllabusId, ifCustomSyllabus, ifCustomChapter, module, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getWikiResourceListForChapters
     *
     * 
     */
    @Test
    public void getWikiResourceListForChaptersUsingPATCHTest() {
        Long chapterId = null;
        Long syllabusId = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        String module = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getWikiResourceListForChaptersUsingPATCH(chapterId, syllabusId, ifCustomSyllabus, ifCustomChapter, module, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getWikiResourceListForChapters
     *
     * 
     */
    @Test
    public void getWikiResourceListForChaptersUsingPOSTTest() {
        Long chapterId = null;
        Long syllabusId = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        String module = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getWikiResourceListForChaptersUsingPOST(chapterId, syllabusId, ifCustomSyllabus, ifCustomChapter, module, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * getWikiResourceListForChapters
     *
     * 
     */
    @Test
    public void getWikiResourceListForChaptersUsingPUTTest() {
        Long chapterId = null;
        Long syllabusId = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        String module = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.getWikiResourceListForChaptersUsingPUT(chapterId, syllabusId, ifCustomSyllabus, ifCustomChapter, module, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * goToChapterList
     *
     * 
     */
    @Test
    public void goToChapterListUsingGETTest() {
        Long syllabusId = null;
        String category = null;
        Long subjectId = null;
        String schoolSubjectName = null;
        // ModelAndView response = api.goToChapterListUsingGET(syllabusId, category, subjectId, schoolSubjectName);

        // TODO: test validations
    }
    
    /**
     * navigateToActivity
     *
     * 
     */
    @Test
    public void navigateToActivityUsingGETTest() {
        String uuid = null;
        Long chapterId = null;
        Long syllabusId = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        String resourceLocation = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.navigateToActivityUsingGET(uuid, chapterId, syllabusId, ifCustomSyllabus, ifCustomChapter, resourceLocation, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * navigateToResourcePlayer
     *
     * 
     */
    @Test
    public void navigateToResourcePlayerUsingGETTest() {
        String resourceUuid = null;
        Long chapterId = null;
        Long syllabusId = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        String sectionType = null;
        String category = null;
        String resourceLocation = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.navigateToResourcePlayerUsingGET(resourceUuid, chapterId, syllabusId, ifCustomSyllabus, ifCustomChapter, sectionType, category, resourceLocation, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * navigateToSocialView
     *
     * 
     */
    @Test
    public void navigateToSocialViewUsingGETTest() {
        Long syllabusId = null;
        String category = null;
        Long subjectId = null;
        Boolean ifCustomSyllabus = null;
        String subjectName = null;
        String schoolSubjectName = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.navigateToSocialViewUsingGET(syllabusId, category, subjectId, ifCustomSyllabus, subjectName, schoolSubjectName, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * navigateToWorksheet
     *
     * 
     */
    @Test
    public void navigateToWorksheetUsingGETTest() {
        String uuid = null;
        Long chapterId = null;
        Long syllabusId = null;
        Boolean ifCustomSyllabus = null;
        Boolean ifCustomChapter = null;
        String resourceLocation = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.navigateToWorksheetUsingGET(uuid, chapterId, syllabusId, ifCustomSyllabus, ifCustomChapter, resourceLocation, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * nextToolsHome
     *
     * 
     */
    @Test
    public void nextToolsHomeUsingGETTest() {
        String syllabusId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.nextToolsHomeUsingGET(syllabusId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * notesHome
     *
     * 
     */
    @Test
    public void notesHomeUsingGETTest() {
        String syllabusId = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.notesHomeUsingGET(syllabusId, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * postDetail
     *
     * 
     */
    @Test
    public void postDetailUsingGETTest() {
        String postUUID = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.postDetailUsingGET(postUUID, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * q2aHome
     *
     * 
     */
    @Test
    public void q2aHomeUsingGETTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.q2aHomeUsingGET(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showHome
     *
     * 
     */
    @Test
    public void showHomeUsingGETTest() {
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showHomeUsingGET(branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
    /**
     * showStudyPlan
     *
     * 
     */
    @Test
    public void showStudyPlanUsingGETTest() {
        Long syllabusId = null;
        Long subjectId = null;
        Boolean ifCustomSyllabus = null;
        String subjectName = null;
        String schoolSubjectName = null;
        Long branchId = null;
        Long academicSessionId = null;
        Long userId = null;
        // ModelAndView response = api.showStudyPlanUsingGET(syllabusId, subjectId, ifCustomSyllabus, subjectName, schoolSubjectName, branchId, academicSessionId, userId);

        // TODO: test validations
    }
    
}
