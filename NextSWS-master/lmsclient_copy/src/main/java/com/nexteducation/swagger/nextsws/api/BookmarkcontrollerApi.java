package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.BookMarkResponse;
import com.nexteducation.swagger.nextsws.model.BookMarkRequest;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.SubjectAndSyllabusResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BookmarkcontrollerApi {
  /**
   * addBookMark
   * 
   * @param bookMarkRequest bookMarkRequest (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;BookMarkResponse&gt;
   */
  
  @POST("nextmentee/bookmarks/add")
  Call<BookMarkResponse> addBookMarkUsingPOST(
    @Body BookMarkRequest bookMarkRequest, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * deleteBookMark
   * 
   * @param bookMarkRequest bookMarkRequest (required)
   * @return Call&lt;BookMarkResponse&gt;
   */
  
  @POST("nextmentee/bookmarks/delete")
  Call<BookMarkResponse> deleteBookMarkUsingPOST(
    @Body BookMarkRequest bookMarkRequest
  );

  /**
   * getBMByUserAndSubjectAndChapter
   * 
   * @param subjectId subjectId (required)
   * @param chapterId chapterId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<BookMarkResponse>&gt;
   */
  
  @GET("nextmentee/{subjectId}/{chapterId}/fetchbookmarksbysubject")
  Call<List<BookMarkResponse>> getBMByUserAndSubjectAndChapterUsingGET(
    @Path("subjectId") String subjectId, @Path("chapterId") String chapterId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getBMByUserAndSubject
   * 
   * @param subjectId subjectId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<BookMarkResponse>&gt;
   */
  
  @GET("nextmentee/{subjectId}/fetchbookmarksbysubject")
  Call<List<BookMarkResponse>> getBMByUserAndSubjectUsingGET(
    @Path("subjectId") String subjectId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getBMByUser
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<BookMarkResponse>&gt;
   */
  
  @GET("nextmentee/fetchbookmarks")
  Call<List<BookMarkResponse>> getBMByUserUsingGET(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getBookMarksByChapter
   * 
   * @param subjectId subjectId (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/{subjectId}/bookmarks")
  Call<ModelAndView> getBookMarksByChapterUsingGET(
    @Path("subjectId") String subjectId, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getBookMarks
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/bookmarks")
  Call<ModelAndView> getBookMarksUsingGET(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getSubjects
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<SubjectAndSyllabusResponse>&gt;
   */
  
  @GET("nextmentee/fetchsubjects")
  Call<List<SubjectAndSyllabusResponse>> getSubjectsUsingGET(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * listBookMarkByUser
   * 
   * @param userId userId (required)
   * @return Call&lt;List<BookMarkResponse>&gt;
   */
  
  @GET("nextmentee/bookmarks/list")
  Call<List<BookMarkResponse>> listBookMarkByUserUsingGET(
    @Path("userId") String userId
  );

  /**
   * updateBookMark
   * 
   * @param bookMarkRequest bookMarkRequest (required)
   * @return Call&lt;BookMarkResponse&gt;
   */
  
  @PUT("nextmentee/bookmarks/update")
  Call<BookMarkResponse> updateBookMarkUsingPUT(
    @Body BookMarkRequest bookMarkRequest
  );

}
