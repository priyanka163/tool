package com.nexteducation.swagger.nextsws.api;

import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.model.NoteReminderRequest;
import com.nexteducation.swagger.nextsws.model.NoteReminderResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NoteremindercontrollerApi
 */
public class NoteremindercontrollerApiTest {

    private NoteremindercontrollerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(NoteremindercontrollerApi.class);
    }

    
    /**
     * addReminder
     *
     * 
     */
    @Test
    public void addReminderUsingPOSTTest() {
        NoteReminderRequest noteReminderRequest = null;
        // NoteReminderResponse response = api.addReminderUsingPOST(noteReminderRequest);

        // TODO: test validations
    }
    
    /**
     * deleteReminder
     *
     * 
     */
    @Test
    public void deleteReminderUsingGETTest() {
        String reminderUuid = null;
        // NoteReminderResponse response = api.deleteReminderUsingGET(reminderUuid);

        // TODO: test validations
    }
    
    /**
     * listReminderbyNote
     *
     * 
     */
    @Test
    public void listReminderbyNoteUsingGETTest() {
        Long noteId = null;
        // NoteReminderResponse response = api.listReminderbyNoteUsingGET(noteId);

        // TODO: test validations
    }
    
    /**
     * updateReminder
     *
     * 
     */
    @Test
    public void updateReminderUsingPOSTTest() {
        NoteReminderRequest noteReminderRequest = null;
        // NoteReminderResponse response = api.updateReminderUsingPOST(noteReminderRequest);

        // TODO: test validations
    }
    
}
