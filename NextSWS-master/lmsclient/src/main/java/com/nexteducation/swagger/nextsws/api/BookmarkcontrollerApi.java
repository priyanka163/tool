package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.BookMarkResponse;
import com.nexteducation.swagger.nextsws.model.BookMarkRequest;
import com.nexteducation.swagger.nextsws.model.SessionParams;
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
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;BookMarkResponse&gt;
   */
  
  @POST("nextmentee/bookmarks/add")
  Call<BookMarkResponse> addBookMarkUsingPOST(
    @Body BookMarkRequest bookMarkRequest, @Body SessionParams sessionParams
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
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<BookMarkResponse>&gt;
   */
  
  @GET("nextmentee/{subjectId}/{chapterId}/fetchbookmarksbysubject")
  Call<List<BookMarkResponse>> getBMByUserAndSubjectAndChapterUsingGET(
    @Path("subjectId") String subjectId, @Path("chapterId") String chapterId, @Body SessionParams sessionParams
  );

  /**
   * getBMByUserAndSubject
   * 
   * @param subjectId subjectId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<BookMarkResponse>&gt;
   */
  
  @GET("nextmentee/{subjectId}/fetchbookmarksbysubject")
  Call<List<BookMarkResponse>> getBMByUserAndSubjectUsingGET(
    @Path("subjectId") String subjectId, @Body SessionParams sessionParams
  );

  /**
   * getBMByUser
   * 
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<BookMarkResponse>&gt;
   */
  
  @GET("nextmentee/fetchbookmarks")
  Call<List<BookMarkResponse>> getBMByUserUsingGET(
    @Body SessionParams sessionParams
  );

  /**
   * getBookMarksByChapter
   * 
   * @param subjectId subjectId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/{subjectId}/bookmarks")
  Call<ModelAndView> getBookMarksByChapterUsingGET(
    @Path("subjectId") String subjectId, @Body SessionParams sessionParams
  );

  /**
   * getBookMarks
   * 
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("nextmentee/bookmarks")
  Call<ModelAndView> getBookMarksUsingGET(
    @Body SessionParams sessionParams
  );

  /**
   * getSubjects
   * 
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<SubjectAndSyllabusResponse>&gt;
   */
  
  @GET("nextmentee/fetchsubjects")
  Call<List<SubjectAndSyllabusResponse>> getSubjectsUsingGET(
    @Body SessionParams sessionParams
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
