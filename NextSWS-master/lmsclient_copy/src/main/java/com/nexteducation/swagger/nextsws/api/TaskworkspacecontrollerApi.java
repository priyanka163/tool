package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.TaskDocRequest;
import com.nexteducation.swagger.nextsws.model.ModelAndView;
import com.nexteducation.swagger.nextsws.model.TaskListRequest;
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
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("data/task/getListOfDueTasks")
  Call<ModelAndView> getDueTaskListUsingDELETE(
    @Body TaskListRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getDueTaskList
   * 
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/task/getListOfDueTasks")
  Call<ModelAndView> getDueTaskListUsingGET(
    @Body TaskListRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getDueTaskList
   * 
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("data/task/getListOfDueTasks")
  Call<ModelAndView> getDueTaskListUsingHEAD(
    @Body TaskListRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getDueTaskList
   * 
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("data/task/getListOfDueTasks")
  Call<ModelAndView> getDueTaskListUsingOPTIONS(
    @Body TaskListRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getDueTaskList
   * 
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("data/task/getListOfDueTasks")
  Call<ModelAndView> getDueTaskListUsingPATCH(
    @Body TaskListRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getDueTaskList
   * 
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/task/getListOfDueTasks")
  Call<ModelAndView> getDueTaskListUsingPOST(
    @Body TaskListRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getDueTaskList
   * 
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("data/task/getListOfDueTasks")
  Call<ModelAndView> getDueTaskListUsingPUT(
    @Body TaskListRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getResourceListForHomework
   * 
   * @param profileId profileId (required)
   * @param parentId parentId (required)
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<ResourceShortResponse>&gt;
   */
  
  @POST("data/v1/student/{profileId}/homeworkTask/{parentId}/getResourceTaskList")
  Call<List<ResourceShortResponse>> getResourceListForHomeworkUsingPOST(
    @Path("profileId") Long profileId, @Path("parentId") String parentId, @Body TaskRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getTaskList
   * 
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @DELETE("data/task/getListOfTasks")
  Call<ModelAndView> getTaskListUsingDELETE(
    @Body TaskListRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getTaskList
   * 
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @GET("data/task/getListOfTasks")
  Call<ModelAndView> getTaskListUsingGET(
    @Body TaskListRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getTaskList
   * 
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @HEAD("data/task/getListOfTasks")
  Call<ModelAndView> getTaskListUsingHEAD(
    @Body TaskListRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getTaskList
   * 
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @OPTIONS("data/task/getListOfTasks")
  Call<ModelAndView> getTaskListUsingOPTIONS(
    @Body TaskListRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getTaskList
   * 
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PATCH("data/task/getListOfTasks")
  Call<ModelAndView> getTaskListUsingPATCH(
    @Body TaskListRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getTaskList
   * 
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @POST("data/task/getListOfTasks")
  Call<ModelAndView> getTaskListUsingPOST(
    @Body TaskListRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getTaskList
   * 
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;ModelAndView&gt;
   */
  
  @PUT("data/task/getListOfTasks")
  Call<ModelAndView> getTaskListUsingPUT(
    @Body TaskListRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getUserDueTaskList
   * 
   * @param profileId profileId (required)
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<TaskDoc>&gt;
   */
  
  @POST("data/v1/student/{profileId}/task/getDueList")
  Call<List<TaskDoc>> getUserDueTaskListUsingPOST(
    @Path("profileId") Long profileId, @Body TaskRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

  /**
   * getUserFutureTaskList
   * 
   * @param profileId profileId (required)
   * @param request request (required)
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @return Call&lt;List<TaskDoc>&gt;
   */
  
  @POST("data/v1/student/{profileId}/task/getList")
  Call<List<TaskDoc>> getUserFutureTaskListUsingPOST(
    @Path("profileId") Long profileId, @Body TaskRequest request, @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId
  );

}
