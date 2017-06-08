package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.CustomSyllabusDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BoardcontrollerApi {
  /**
   * listAllBoards
   * 
   * @return Call&lt;CustomSyllabusDTO&gt;
   */
  
  @DELETE("data/getAllBoards.app")
  Call<CustomSyllabusDTO> listAllBoardsUsingDELETE();
    

  /**
   * listAllBoards
   * 
   * @return Call&lt;CustomSyllabusDTO&gt;
   */
  
  @GET("data/getAllBoards.app")
  Call<CustomSyllabusDTO> listAllBoardsUsingGET();
    

  /**
   * listAllBoards
   * 
   * @return Call&lt;CustomSyllabusDTO&gt;
   */
  
  @HEAD("data/getAllBoards.app")
  Call<CustomSyllabusDTO> listAllBoardsUsingHEAD();
    

  /**
   * listAllBoards
   * 
   * @return Call&lt;CustomSyllabusDTO&gt;
   */
  
  @OPTIONS("data/getAllBoards.app")
  Call<CustomSyllabusDTO> listAllBoardsUsingOPTIONS();
    

  /**
   * listAllBoards
   * 
   * @return Call&lt;CustomSyllabusDTO&gt;
   */
  
  @PATCH("data/getAllBoards.app")
  Call<CustomSyllabusDTO> listAllBoardsUsingPATCH();
    

  /**
   * listAllBoards
   * 
   * @return Call&lt;CustomSyllabusDTO&gt;
   */
  
  @POST("data/getAllBoards.app")
  Call<CustomSyllabusDTO> listAllBoardsUsingPOST();
    

  /**
   * listAllBoards
   * 
   * @return Call&lt;CustomSyllabusDTO&gt;
   */
  
  @PUT("data/getAllBoards.app")
  Call<CustomSyllabusDTO> listAllBoardsUsingPUT();
    

  /**
   * listAllClasses
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;CustomSyllabusDTO&gt;
   */
  
  @DELETE("data/getAllClasses.app")
  Call<CustomSyllabusDTO> listAllClassesUsingDELETE(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId, @Query("sortBy") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("pageSize") Integer pageSize, @Query("select") String select
  );

  /**
   * listAllClasses
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;CustomSyllabusDTO&gt;
   */
  
  @GET("data/getAllClasses.app")
  Call<CustomSyllabusDTO> listAllClassesUsingGET(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId, @Query("sortBy") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("pageSize") Integer pageSize, @Query("select") String select
  );

  /**
   * listAllClasses
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;CustomSyllabusDTO&gt;
   */
  
  @HEAD("data/getAllClasses.app")
  Call<CustomSyllabusDTO> listAllClassesUsingHEAD(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId, @Query("sortBy") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("pageSize") Integer pageSize, @Query("select") String select
  );

  /**
   * listAllClasses
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;CustomSyllabusDTO&gt;
   */
  
  @OPTIONS("data/getAllClasses.app")
  Call<CustomSyllabusDTO> listAllClassesUsingOPTIONS(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId, @Query("sortBy") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("pageSize") Integer pageSize, @Query("select") String select
  );

  /**
   * listAllClasses
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;CustomSyllabusDTO&gt;
   */
  
  @PATCH("data/getAllClasses.app")
  Call<CustomSyllabusDTO> listAllClassesUsingPATCH(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId, @Query("sortBy") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("pageSize") Integer pageSize, @Query("select") String select
  );

  /**
   * listAllClasses
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;CustomSyllabusDTO&gt;
   */
  
  @POST("data/getAllClasses.app")
  Call<CustomSyllabusDTO> listAllClassesUsingPOST(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId, @Query("sortBy") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("pageSize") Integer pageSize, @Query("select") String select
  );

  /**
   * listAllClasses
   * 
   * @param branchId Session Parameter - Branch Id (optional)
   * @param academicSessionId Session Parameter - Academic Session Id (optional)
   * @param userId Session Parameter - User Id (optional)
   * @param sortBy Sort Response By (optional)
   * @param filter Filter Response By (optional)
   * @param page Pageable - Page Number (optional)
   * @param pageSize Pageable - Page Size (optional)
   * @param select Jersey Filtering - Get specified values (optional)
   * @return Call&lt;CustomSyllabusDTO&gt;
   */
  
  @PUT("data/getAllClasses.app")
  Call<CustomSyllabusDTO> listAllClassesUsingPUT(
    @Query("branchId") Long branchId, @Query("academicSessionId") Long academicSessionId, @Query("userId") Long userId, @Query("sortBy") String sortBy, @Query("filter") String filter, @Query("page") Integer page, @Query("pageSize") Integer pageSize, @Query("select") String select
  );

}
