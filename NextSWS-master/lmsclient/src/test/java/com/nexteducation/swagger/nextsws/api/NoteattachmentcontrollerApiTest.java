package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.NoteAttachmentResponse;
import com.nexteducation.swagger.nextsws.model.NoteAttachmentRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NoteattachmentcontrollerApi
 */
public class NoteattachmentcontrollerApiTest {

    private NoteattachmentcontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(NoteattachmentcontrollerApi.class);
    }

    
    /**
     * addNoteAttachment
     *
     * 
     */
    @Test
    public void addNoteAttachmentUsingGETTest() {
        String noteattachmentuuid = null;
        // NoteAttachmentResponse response = api.addNoteAttachmentUsingGET(noteattachmentuuid);

        // TODO: test validations
    }
    
    /**
     * addNoteAttachment
     *
     * 
     */
    @Test
    public void addNoteAttachmentUsingPOSTTest() {
        NoteAttachmentRequest noteAttachmentRequest = null;
        // NoteAttachmentResponse response = api.addNoteAttachmentUsingPOST(noteAttachmentRequest);

        // TODO: test validations
    }
    
    /**
     * getNoteAttachment
     *
     * 
     */
    @Test
    public void getNoteAttachmentUsingGETTest() {
        String noteattachmentuuid = null;
        // NoteAttachmentResponse response = api.getNoteAttachmentUsingGET(noteattachmentuuid);

        // TODO: test validations
    }
    
    /**
     * getNoteAttachmentsByNote
     *
     * 
     */
    @Test
    public void getNoteAttachmentsByNoteUsingGETTest() {
        String noteuuid = null;
        // List<NoteAttachmentResponse> response = api.getNoteAttachmentsByNoteUsingGET(noteuuid);

        // TODO: test validations
    }
    
    /**
     * updateNoteAttachment
     *
     * 
     */
    @Test
    public void updateNoteAttachmentUsingPOSTTest() {
        NoteAttachmentRequest noteAttachmentRequest = null;
        // NoteAttachmentResponse response = api.updateNoteAttachmentUsingPOST(noteAttachmentRequest);

        // TODO: test validations
    }
    
}
