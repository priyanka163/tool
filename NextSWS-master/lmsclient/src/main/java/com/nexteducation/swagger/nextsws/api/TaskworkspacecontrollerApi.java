package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.TaskDocRequest;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.TaskListRequest;
import com.nexteducation.swagger.nextsws.model.SessionParams;
import com.nexteducation.swagger.nextsws.model.TaskRequest;
import com.nexteducation.swagger.nextsws.model.ResourceShortResponse;
import com.nexteducation.swagger.nextsws.model.TaskDoc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TaskworkspacecontrollerApi {
  /**
   * createTask
   * 
   * @param request request (required)
   * @return Call&lt;Object&gt;
   */
  
  @POST("data/task/createTask")
  Call<Object> createTaskUsingPOST(
    @Body TaskDocRequest request
  );

  /**
   * getDueTaskList
   * 
   * @param request request (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/task/getListOfDueTasks")
  Call<ModelAndView> getDueTaskListUsingPOST(
    @Body TaskListRequest request, @Body SessionParams sessionParams
  );

  /**
   * getResourceListForHomework
   * 
   * @param profileId profileId (required)
   * @param parentId parentId (required)
   * @param request request (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<ResourceShortResponse>&gt;
   */
  
  @POST("data/v1/student/{profileId}/homeworkTask/{parentId}/getResourceTaskList")
  Call<List<ResourceShortResponse>> getResourceListForHomeworkUsingPOST(
    @Path("profileId") Long profileId, @Path("parentId") String parentId, @Body TaskRequest request, @Body SessionParams sessionParams
  );

  /**
   * getTaskList
   * 
   * @param request request (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/task/getListOfTasks")
  Call<ModelAndView> getTaskListUsingPOST(
    @Body TaskListRequest request, @Body SessionParams sessionParams
  );

  /**
   * getUserDueTaskList
   * 
   * @param profileId profileId (required)
   * @param request request (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<TaskDoc>&gt;
   */
  
  @POST("data/v1/student/{profileId}/task/getDueList")
  Call<List<TaskDoc>> getUserDueTaskListUsingPOST(
    @Path("profileId") Long profileId, @Body TaskRequest request, @Body SessionParams sessionParams
  );

  /**
   * getUserFutureTaskList
   * 
   * @param profileId profileId (required)
   * @param request request (required)
   * @param sessionParams sessionParams (optional)
   * @return Call&lt;List<TaskDoc>&gt;
   */
  
  @POST("data/v1/student/{profileId}/task/getList")
  Call<List<TaskDoc>> getUserFutureTaskListUsingPOST(
    @Path("profileId") Long profileId, @Body TaskRequest request, @Body SessionParams sessionParams
  );

}
