package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.NoteReminderRequest;
import com.nexteducation.swagger.nextsws.model.NoteReminderResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface NoteremindercontrollerApi {
  /**
   * addReminder
   * 
   * @param noteReminderRequest noteReminderRequest (required)
   * @return Call&lt;NoteReminderResponse&gt;
   */
  
  @POST("nextmentee/notes/addreminder")
  Call<NoteReminderResponse> addReminderUsingPOST(
    @Body NoteReminderRequest noteReminderRequest
  );

  /**
   * deleteReminder
   * 
   * @param reminderUuid reminderUuid (required)
   * @return Call&lt;NoteReminderResponse&gt;
   */
  
  @GET("nextmentee/notes/{reminderUuid}/deletereminder")
  Call<NoteReminderResponse> deleteReminderUsingGET(
    @Path("reminderUuid") String reminderUuid
  );

  /**
   * listReminderbyNote
   * 
   * @param noteId noteId (required)
   * @return Call&lt;NoteReminderResponse&gt;
   */
  
  @GET("nextmentee/notes/{noteId}/getreminderbynote")
  Call<NoteReminderResponse> listReminderbyNoteUsingGET(
    @Path("noteId") Long noteId
  );

  /**
   * updateReminder
   * 
   * @param noteReminderRequest noteReminderRequest (required)
   * @return Call&lt;NoteReminderResponse&gt;
   */
  
  @POST("nextmentee/notes/updatereminder")
  Call<NoteReminderResponse> updateReminderUsingPOST(
    @Body NoteReminderRequest noteReminderRequest
  );

}
