package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.ModelAndView;
import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MgscontentcontrollerApi {
  /**
   * deleteContent
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/deleteContent")
  Call<ModelAndView> deleteContentUsingGET();
    

  /**
   * getContentsByLesson
   * 
   * @param lessonId lessonId (required)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/getContents")
  Call<ModelAndView> getContentsByLessonUsingPOST(
    @Query("lessonId") Long lessonId
  );

  /**
   * showContent
   * 
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("manageContent")
  Call<ModelAndView> showContentUsingGET();
    

  /**
   * uploadContent
   * 
   * @param mGSContentSectionRequest0Id  (optional)
   * @param mGSContentSectionRequest0Status  (optional)
   * @param mGSContentSectionRequest0LessonId  (optional)
   * @param oldContents0SwfMetadataRequestSlides0Id  (optional)
   * @param oldContents0SwfMetadataRequestSlides0AddKeyWords  (optional)
   * @param oldContents0SwfMetadataRequestSlides0Frame  (optional)
   * @param oldContents0SwfMetadataRequestSlides0Length  (optional)
   * @param oldContents0SwfMetadataRequestSlides0SceneName  (optional)
   * @param oldContents0SwfMetadataRequestSlides0TextContent  (optional)
   * @param oldContents0SwfMetadataRequestSlides0Title  (optional)
   * @param oldContents0SwfMetadataRequestSlides0Uuid  (optional)
   * @param oldContents0SwfMetadataRequestSlides0ContentId  (optional)
   * @param oldContents0SwfMetadataRequestSlides0Text  (optional)
   * @param oldContents0SwfMetadataRequestSlides0Published  (optional)
   * @param oldContents0SwfMetadataRequestSlides0Tlm  (optional)
   * @param oldContents0SwfMetadataRequestSlides0SyllabusId  (optional)
   * @param oldContents0SwfMetadataRequestErrorMessage  (optional)
   * @param oldContents0FileByteArray  (optional)
   * @param oldContents0Attach  (optional)
   * @param oldContents0SvnURLFile  (optional)
   * @param oldContents0AttachContentType  (optional)
   * @param oldContents0AttachFileName  (optional)
   * @param oldContents0Id  (optional)
   * @param oldContents0Name  (optional)
   * @param oldContents0Path  (optional)
   * @param oldContents0ContentId  (optional)
   * @param oldContents0ScriptBased  (optional)
   * @param oldContents0LanguageIsoCode  (optional)
   * @param oldContents0ContentPartnerId  (optional)
   * @param oldContents0Label  (optional)
   * @param oldContents0SvnURL  (optional)
   * @param oldContents0SvnURLFileName  (optional)
   * @param oldContents0SvnURLContentType  (optional)
   * @param oldContents0SvnURLRev  (optional)
   * @param oldContents0Seq  (optional)
   * @param oldContents0ShouldGenerateDummySlides  (optional)
   * @param oldContents0Tags  (optional)
   * @param oldContents0MetaInfo  (optional)
   * @param oldContents0FileContent  (optional)
   * @param oldContents0SectionName  (optional)
   * @param uploads0SwfMetadataRequestSlides0Id  (optional)
   * @param uploads0SwfMetadataRequestSlides0AddKeyWords  (optional)
   * @param uploads0SwfMetadataRequestSlides0Frame  (optional)
   * @param uploads0SwfMetadataRequestSlides0Length  (optional)
   * @param uploads0SwfMetadataRequestSlides0SceneName  (optional)
   * @param uploads0SwfMetadataRequestSlides0TextContent  (optional)
   * @param uploads0SwfMetadataRequestSlides0Title  (optional)
   * @param uploads0SwfMetadataRequestSlides0Uuid  (optional)
   * @param uploads0SwfMetadataRequestSlides0ContentId  (optional)
   * @param uploads0SwfMetadataRequestSlides0Text  (optional)
   * @param uploads0SwfMetadataRequestSlides0Published  (optional)
   * @param uploads0SwfMetadataRequestSlides0Tlm  (optional)
   * @param uploads0SwfMetadataRequestSlides0SyllabusId  (optional)
   * @param uploads0SwfMetadataRequestErrorMessage  (optional)
   * @param uploads0FileByteArray  (optional)
   * @param uploads0Attach  (optional)
   * @param uploads0SvnURLFile  (optional)
   * @param uploads0AttachContentType  (optional)
   * @param uploads0AttachFileName  (optional)
   * @param uploads0Id  (optional)
   * @param uploads0Name  (optional)
   * @param uploads0Path  (optional)
   * @param uploads0ContentId  (optional)
   * @param uploads0ScriptBased  (optional)
   * @param uploads0LanguageIsoCode  (optional)
   * @param uploads0ContentPartnerId  (optional)
   * @param uploads0Label  (optional)
   * @param uploads0SvnURL  (optional)
   * @param uploads0SvnURLFileName  (optional)
   * @param uploads0SvnURLContentType  (optional)
   * @param uploads0SvnURLRev  (optional)
   * @param uploads0Seq  (optional)
   * @param uploads0ShouldGenerateDummySlides  (optional)
   * @param uploads0Tags  (optional)
   * @param uploads0MetaInfo  (optional)
   * @param uploads0FileContent  (optional)
   * @param uploads0SectionName  (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/uploadContents")
  Call<ModelAndView> uploadContentUsingPOST(
    @Query("mGSContentSectionRequest[0].id") Long mGSContentSectionRequest0Id, @Query("mGSContentSectionRequest[0].status") String mGSContentSectionRequest0Status, @Query("mGSContentSectionRequest[0].lessonId") Long mGSContentSectionRequest0LessonId, @Query("oldContents[0].swfMetadataRequest.slides[0].id") String oldContents0SwfMetadataRequestSlides0Id, @Query("oldContents[0].swfMetadataRequest.slides[0].addKeyWords") String oldContents0SwfMetadataRequestSlides0AddKeyWords, @Query("oldContents[0].swfMetadataRequest.slides[0].frame") Integer oldContents0SwfMetadataRequestSlides0Frame, @Query("oldContents[0].swfMetadataRequest.slides[0].length") Integer oldContents0SwfMetadataRequestSlides0Length, @Query("oldContents[0].swfMetadataRequest.slides[0].sceneName") String oldContents0SwfMetadataRequestSlides0SceneName, @Query("oldContents[0].swfMetadataRequest.slides[0].textContent") String oldContents0SwfMetadataRequestSlides0TextContent, @Query("oldContents[0].swfMetadataRequest.slides[0].title") String oldContents0SwfMetadataRequestSlides0Title, @Query("oldContents[0].swfMetadataRequest.slides[0].uuid") String oldContents0SwfMetadataRequestSlides0Uuid, @Query("oldContents[0].swfMetadataRequest.slides[0].contentId") Long oldContents0SwfMetadataRequestSlides0ContentId, @Query("oldContents[0].swfMetadataRequest.slides[0].text") Object oldContents0SwfMetadataRequestSlides0Text, @Query("oldContents[0].swfMetadataRequest.slides[0].published") Boolean oldContents0SwfMetadataRequestSlides0Published, @Query("oldContents[0].swfMetadataRequest.slides[0].tlm") Boolean oldContents0SwfMetadataRequestSlides0Tlm, @Query("oldContents[0].swfMetadataRequest.slides[0].syllabusId") Long oldContents0SwfMetadataRequestSlides0SyllabusId, @Query("oldContents[0].swfMetadataRequest.errorMessage") String oldContents0SwfMetadataRequestErrorMessage, @Query("oldContents[0].fileByteArray") byte[] oldContents0FileByteArray, @Query("oldContents[0].attach") File oldContents0Attach, @Query("oldContents[0].svnURLFile") File oldContents0SvnURLFile, @Query("oldContents[0].attachContentType") String oldContents0AttachContentType, @Query("oldContents[0].attachFileName") String oldContents0AttachFileName, @Query("oldContents[0].id") Long oldContents0Id, @Query("oldContents[0].name") String oldContents0Name, @Query("oldContents[0].path") String oldContents0Path, @Query("oldContents[0].contentId") Long oldContents0ContentId, @Query("oldContents[0].scriptBased") Boolean oldContents0ScriptBased, @Query("oldContents[0].languageIsoCode") String oldContents0LanguageIsoCode, @Query("oldContents[0].contentPartnerId") Long oldContents0ContentPartnerId, @Query("oldContents[0].label") String oldContents0Label, @Query("oldContents[0].svnURL") String oldContents0SvnURL, @Query("oldContents[0].svnURLFileName") String oldContents0SvnURLFileName, @Query("oldContents[0].svnURLContentType") String oldContents0SvnURLContentType, @Query("oldContents[0].svnURLRev") Long oldContents0SvnURLRev, @Query("oldContents[0].seq") Long oldContents0Seq, @Query("oldContents[0].shouldGenerateDummySlides") Boolean oldContents0ShouldGenerateDummySlides, @Query("oldContents[0].tags") String oldContents0Tags, @Query("oldContents[0].metaInfo") String oldContents0MetaInfo, @Query("oldContents[0].fileContent") String oldContents0FileContent, @Query("oldContents[0].sectionName") String oldContents0SectionName, @Query("uploads[0].swfMetadataRequest.slides[0].id") String uploads0SwfMetadataRequestSlides0Id, @Query("uploads[0].swfMetadataRequest.slides[0].addKeyWords") String uploads0SwfMetadataRequestSlides0AddKeyWords, @Query("uploads[0].swfMetadataRequest.slides[0].frame") Integer uploads0SwfMetadataRequestSlides0Frame, @Query("uploads[0].swfMetadataRequest.slides[0].length") Integer uploads0SwfMetadataRequestSlides0Length, @Query("uploads[0].swfMetadataRequest.slides[0].sceneName") String uploads0SwfMetadataRequestSlides0SceneName, @Query("uploads[0].swfMetadataRequest.slides[0].textContent") String uploads0SwfMetadataRequestSlides0TextContent, @Query("uploads[0].swfMetadataRequest.slides[0].title") String uploads0SwfMetadataRequestSlides0Title, @Query("uploads[0].swfMetadataRequest.slides[0].uuid") String uploads0SwfMetadataRequestSlides0Uuid, @Query("uploads[0].swfMetadataRequest.slides[0].contentId") Long uploads0SwfMetadataRequestSlides0ContentId, @Query("uploads[0].swfMetadataRequest.slides[0].text") Object uploads0SwfMetadataRequestSlides0Text, @Query("uploads[0].swfMetadataRequest.slides[0].published") Boolean uploads0SwfMetadataRequestSlides0Published, @Query("uploads[0].swfMetadataRequest.slides[0].tlm") Boolean uploads0SwfMetadataRequestSlides0Tlm, @Query("uploads[0].swfMetadataRequest.slides[0].syllabusId") Long uploads0SwfMetadataRequestSlides0SyllabusId, @Query("uploads[0].swfMetadataRequest.errorMessage") String uploads0SwfMetadataRequestErrorMessage, @Query("uploads[0].fileByteArray") byte[] uploads0FileByteArray, @Query("uploads[0].attach") File uploads0Attach, @Query("uploads[0].svnURLFile") File uploads0SvnURLFile, @Query("uploads[0].attachContentType") String uploads0AttachContentType, @Query("uploads[0].attachFileName") String uploads0AttachFileName, @Query("uploads[0].id") Long uploads0Id, @Query("uploads[0].name") String uploads0Name, @Query("uploads[0].path") String uploads0Path, @Query("uploads[0].contentId") Long uploads0ContentId, @Query("uploads[0].scriptBased") Boolean uploads0ScriptBased, @Query("uploads[0].languageIsoCode") String uploads0LanguageIsoCode, @Query("uploads[0].contentPartnerId") Long uploads0ContentPartnerId, @Query("uploads[0].label") String uploads0Label, @Query("uploads[0].svnURL") String uploads0SvnURL, @Query("uploads[0].svnURLFileName") String uploads0SvnURLFileName, @Query("uploads[0].svnURLContentType") String uploads0SvnURLContentType, @Query("uploads[0].svnURLRev") Long uploads0SvnURLRev, @Query("uploads[0].seq") Long uploads0Seq, @Query("uploads[0].shouldGenerateDummySlides") Boolean uploads0ShouldGenerateDummySlides, @Query("uploads[0].tags") String uploads0Tags, @Query("uploads[0].metaInfo") String uploads0MetaInfo, @Query("uploads[0].fileContent") String uploads0FileContent, @Query("uploads[0].sectionName") String uploads0SectionName
  );

}
