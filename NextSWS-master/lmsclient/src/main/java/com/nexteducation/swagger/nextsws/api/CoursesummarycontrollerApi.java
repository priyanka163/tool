package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.SessionParams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CoursesummarycontrollerApi {
  /**
   * getLatestPublishedLectureBasedonChapter
   * 
   * @param sectionId sectionId (required)
   * @param userId userId (required)
   * @param chapterId chapterId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/workspace/section/{sectionId}/user/{userId}/chapter/{chapterId}/latestLecture")
  Call<Object> getLatestPublishedLectureBasedonChapterUsingGET(
    @Path("sectionId") Long sectionId, @Path("userId") Long userId, @Path("chapterId") Long chapterId, @Body SessionParams sessionParams
  );

  /**
   * getLatestPublishedLectureBasedonSection
   * 
   * @param sectionId sectionId (required)
   * @param userId userId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;Object&gt;
   */
  
  @GET("data/workspace/section/{sectionId}/user/{userId}/latestLecture")
  Call<Object> getLatestPublishedLectureBasedonSectionUsingGET(
    @Path("sectionId") Long sectionId, @Path("userId") Long userId, @Body SessionParams sessionParams
  );

  /**
   * getLectureListBasedonChapter
   * 
   * @param sectionId sectionId (required)
   * @param userId userId (required)
   * @param chapterId chapterId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<Object>&gt;
   */
  
  @GET("data/workspace/section/{sectionId}/user/{userId}/chapter/{chapterId}/lecturesList")
  Call<List<Object>> getLectureListBasedonChapterUsingGET(
    @Path("sectionId") Long sectionId, @Path("userId") Long userId, @Path("chapterId") Long chapterId, @Body SessionParams sessionParams
  );

  /**
   * getLectureListBasedonSection
   * 
   * @param sectionId sectionId (required)
   * @param userId userId (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<Object>&gt;
   */
  
  @GET("data/workspace/section/{sectionId}/user/{userId}/lecturesList")
  Call<List<Object>> getLectureListBasedonSectionUsingGET(
    @Path("sectionId") Long sectionId, @Path("userId") Long userId, @Body SessionParams sessionParams
  );

  /**
   * getResourceListForTask
   * 
   * @param taskId taskId (required)
   * @return Call&lt;List<Object>&gt;
   */
  
  @GET("data/workspace/task/{taskId}/resourceList")
  Call<List<Object>> getResourceListForTaskUsingGET(
    @Path("taskId") Long taskId
  );

}
