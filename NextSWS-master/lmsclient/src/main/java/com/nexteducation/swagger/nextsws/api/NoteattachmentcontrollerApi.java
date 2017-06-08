package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.CollectionFormats.*;


import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.nexteducation.swagger.nextsws.model.NoteAttachmentResponse;
import com.nexteducation.swagger.nextsws.model.NoteAttachmentRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface NoteattachmentcontrollerApi {
  /**
   * addNoteAttachment
   * 
   * @param noteattachmentuuid noteattachmentuuid (required)
   * @return Call&lt;NoteAttachmentResponse&gt;
   */
  
  @GET("data/noteattachment/delete/{noteattachmentuuid}")
  Call<NoteAttachmentResponse> addNoteAttachmentUsingGET(
    @Path("noteattachmentuuid") String noteattachmentuuid
  );

  /**
   * addNoteAttachment
   * 
   * @param noteAttachmentRequest noteAttachmentRequest (required)
   * @return Call&lt;NoteAttachmentResponse&gt;
   */
  
  @POST("data/noteattachment/add")
  Call<NoteAttachmentResponse> addNoteAttachmentUsingPOST(
    @Body NoteAttachmentRequest noteAttachmentRequest
  );

  /**
   * getNoteAttachment
   * 
   * @param noteattachmentuuid noteattachmentuuid (required)
   * @return Call&lt;NoteAttachmentResponse&gt;
   */
  
  @GET("data/noteattachment/get/{noteattachmentuuid}")
  Call<NoteAttachmentResponse> getNoteAttachmentUsingGET(
    @Path("noteattachmentuuid") String noteattachmentuuid
  );

  /**
   * getNoteAttachmentsByNote
   * 
   * @param noteuuid noteuuid (required)
   * @return Call&lt;List<NoteAttachmentResponse>&gt;
   */
  
  @GET("data/noteattachment/getbynote/{noteuuid}")
  Call<List<NoteAttachmentResponse>> getNoteAttachmentsByNoteUsingGET(
    @Path("noteuuid") String noteuuid
  );

  /**
   * updateNoteAttachment
   * 
   * @param noteAttachmentRequest noteAttachmentRequest (required)
   * @return Call&lt;NoteAttachmentResponse&gt;
   */
  
  @POST("data/noteattachment/update")
  Call<NoteAttachmentResponse> updateNoteAttachmentUsingPOST(
    @Body NoteAttachmentRequest noteAttachmentRequest
  );

}
