package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import java.io.File;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MgscontentcontrollerApi
 */
public class MgscontentcontrollerApiTest {

    private MgscontentcontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MgscontentcontrollerApi.class);
    }

    
    /**
     * deleteContent
     *
     * 
     */
    @Test
    public void deleteContentUsingGETTest() {
        // ModelAndView response = api.deleteContentUsingGET();

        // TODO: test validations
    }
    
    /**
     * getContentsByLesson
     *
     * 
     */
    @Test
    public void getContentsByLessonUsingPOSTTest() {
        Long lessonId = null;
        // ModelAndView response = api.getContentsByLessonUsingPOST(lessonId);

        // TODO: test validations
    }
    
    /**
     * showContent
     *
     * 
     */
    @Test
    public void showContentUsingGETTest() {
        // ModelAndView response = api.showContentUsingGET();

        // TODO: test validations
    }
    
    /**
     * uploadContent
     *
     * 
     */
    @Test
    public void uploadContentUsingPOSTTest() {
        Long mGSContentSectionRequest0Id = null;
        String mGSContentSectionRequest0Status = null;
        Long mGSContentSectionRequest0LessonId = null;
        String oldContents0SwfMetadataRequestSlides0Id = null;
        String oldContents0SwfMetadataRequestSlides0AddKeyWords = null;
        Integer oldContents0SwfMetadataRequestSlides0Frame = null;
        Integer oldContents0SwfMetadataRequestSlides0Length = null;
        String oldContents0SwfMetadataRequestSlides0SceneName = null;
        String oldContents0SwfMetadataRequestSlides0TextContent = null;
        String oldContents0SwfMetadataRequestSlides0Title = null;
        String oldContents0SwfMetadataRequestSlides0Uuid = null;
        Long oldContents0SwfMetadataRequestSlides0ContentId = null;
        Object oldContents0SwfMetadataRequestSlides0Text = null;
        Boolean oldContents0SwfMetadataRequestSlides0Published = null;
        Boolean oldContents0SwfMetadataRequestSlides0Tlm = null;
        Long oldContents0SwfMetadataRequestSlides0SyllabusId = null;
        String oldContents0SwfMetadataRequestErrorMessage = null;
        byte[] oldContents0FileByteArray = null;
        File oldContents0Attach = null;
        File oldContents0SvnURLFile = null;
        String oldContents0AttachContentType = null;
        String oldContents0AttachFileName = null;
        Long oldContents0Id = null;
        String oldContents0Name = null;
        String oldContents0Path = null;
        Long oldContents0ContentId = null;
        Boolean oldContents0ScriptBased = null;
        String oldContents0LanguageIsoCode = null;
        Long oldContents0ContentPartnerId = null;
        String oldContents0Label = null;
        String oldContents0SvnURL = null;
        String oldContents0SvnURLFileName = null;
        String oldContents0SvnURLContentType = null;
        Long oldContents0SvnURLRev = null;
        Long oldContents0Seq = null;
        Boolean oldContents0ShouldGenerateDummySlides = null;
        String oldContents0Tags = null;
        String oldContents0MetaInfo = null;
        String oldContents0FileContent = null;
        String oldContents0SectionName = null;
        String uploads0SwfMetadataRequestSlides0Id = null;
        String uploads0SwfMetadataRequestSlides0AddKeyWords = null;
        Integer uploads0SwfMetadataRequestSlides0Frame = null;
        Integer uploads0SwfMetadataRequestSlides0Length = null;
        String uploads0SwfMetadataRequestSlides0SceneName = null;
        String uploads0SwfMetadataRequestSlides0TextContent = null;
        String uploads0SwfMetadataRequestSlides0Title = null;
        String uploads0SwfMetadataRequestSlides0Uuid = null;
        Long uploads0SwfMetadataRequestSlides0ContentId = null;
        Object uploads0SwfMetadataRequestSlides0Text = null;
        Boolean uploads0SwfMetadataRequestSlides0Published = null;
        Boolean uploads0SwfMetadataRequestSlides0Tlm = null;
        Long uploads0SwfMetadataRequestSlides0SyllabusId = null;
        String uploads0SwfMetadataRequestErrorMessage = null;
        byte[] uploads0FileByteArray = null;
        File uploads0Attach = null;
        File uploads0SvnURLFile = null;
        String uploads0AttachContentType = null;
        String uploads0AttachFileName = null;
        Long uploads0Id = null;
        String uploads0Name = null;
        String uploads0Path = null;
        Long uploads0ContentId = null;
        Boolean uploads0ScriptBased = null;
        String uploads0LanguageIsoCode = null;
        Long uploads0ContentPartnerId = null;
        String uploads0Label = null;
        String uploads0SvnURL = null;
        String uploads0SvnURLFileName = null;
        String uploads0SvnURLContentType = null;
        Long uploads0SvnURLRev = null;
        Long uploads0Seq = null;
        Boolean uploads0ShouldGenerateDummySlides = null;
        String uploads0Tags = null;
        String uploads0MetaInfo = null;
        String uploads0FileContent = null;
        String uploads0SectionName = null;
        // ModelAndView response = api.uploadContentUsingPOST(mGSContentSectionRequest0Id, mGSContentSectionRequest0Status, mGSContentSectionRequest0LessonId, oldContents0SwfMetadataRequestSlides0Id, oldContents0SwfMetadataRequestSlides0AddKeyWords, oldContents0SwfMetadataRequestSlides0Frame, oldContents0SwfMetadataRequestSlides0Length, oldContents0SwfMetadataRequestSlides0SceneName, oldContents0SwfMetadataRequestSlides0TextContent, oldContents0SwfMetadataRequestSlides0Title, oldContents0SwfMetadataRequestSlides0Uuid, oldContents0SwfMetadataRequestSlides0ContentId, oldContents0SwfMetadataRequestSlides0Text, oldContents0SwfMetadataRequestSlides0Published, oldContents0SwfMetadataRequestSlides0Tlm, oldContents0SwfMetadataRequestSlides0SyllabusId, oldContents0SwfMetadataRequestErrorMessage, oldContents0FileByteArray, oldContents0Attach, oldContents0SvnURLFile, oldContents0AttachContentType, oldContents0AttachFileName, oldContents0Id, oldContents0Name, oldContents0Path, oldContents0ContentId, oldContents0ScriptBased, oldContents0LanguageIsoCode, oldContents0ContentPartnerId, oldContents0Label, oldContents0SvnURL, oldContents0SvnURLFileName, oldContents0SvnURLContentType, oldContents0SvnURLRev, oldContents0Seq, oldContents0ShouldGenerateDummySlides, oldContents0Tags, oldContents0MetaInfo, oldContents0FileContent, oldContents0SectionName, uploads0SwfMetadataRequestSlides0Id, uploads0SwfMetadataRequestSlides0AddKeyWords, uploads0SwfMetadataRequestSlides0Frame, uploads0SwfMetadataRequestSlides0Length, uploads0SwfMetadataRequestSlides0SceneName, uploads0SwfMetadataRequestSlides0TextContent, uploads0SwfMetadataRequestSlides0Title, uploads0SwfMetadataRequestSlides0Uuid, uploads0SwfMetadataRequestSlides0ContentId, uploads0SwfMetadataRequestSlides0Text, uploads0SwfMetadataRequestSlides0Published, uploads0SwfMetadataRequestSlides0Tlm, uploads0SwfMetadataRequestSlides0SyllabusId, uploads0SwfMetadataRequestErrorMessage, uploads0FileByteArray, uploads0Attach, uploads0SvnURLFile, uploads0AttachContentType, uploads0AttachFileName, uploads0Id, uploads0Name, uploads0Path, uploads0ContentId, uploads0ScriptBased, uploads0LanguageIsoCode, uploads0ContentPartnerId, uploads0Label, uploads0SvnURL, uploads0SvnURLFileName, uploads0SvnURLContentType, uploads0SvnURLRev, uploads0Seq, uploads0ShouldGenerateDummySlides, uploads0Tags, uploads0MetaInfo, uploads0FileContent, uploads0SectionName);

        // TODO: test validations
    }
    
}
