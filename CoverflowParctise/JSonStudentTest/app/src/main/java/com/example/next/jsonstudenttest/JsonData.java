package com.example.next.jsonstudenttest;

import android.content.Context;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by next on 23/3/17.
 */
public class JsonData {




    public  void readJson(String mJson) {
        JSONObject jsonObject = null;
        JSONArray jsonArray = null;
        try {
            jsonObject = new JSONObject(mJson);
            jsonArray = jsonObject.getJSONArray("studentdetails");
            ArrayList<StudentModel> arrayList = new ArrayList<>();

            for (int i = 0; i < jsonArray.length(); i++) {
                StudentModel model = new StudentModel();
                JSONObject childObject = jsonArray.getJSONObject(i);
                model.setStudentID(childObject.getString("id"));
                model.setStudentName(childObject.getString("name"));
                model.setStudentRollnumb(childObject.getString("roolNo"));
                arrayList.add(model);

            }

            Collections.sort(arrayList, new Comparator<StudentModel>() {
                @Override
                public int compare(StudentModel o1, StudentModel o2) {

                    //based on id
                    String s = o1.getStudentID();
                    String ss = o2.getStudentID();

                    String id1 = s.substring(s.lastIndexOf("_") + 1);
                    String id2 = ss.substring(s.lastIndexOf("_") + 1);
                    return id1.compareToIgnoreCase(id2);
                }
            });
            for (int i = 0; i < arrayList.size(); i++) {

                Log.i("Mainactivity", "readJson: based on id " + arrayList.get(i).getStudentID());
            }

            Collections.sort(arrayList, new Comparator<StudentModel>() {
                @Override
                public int compare(StudentModel o1, StudentModel o2) {
                    //based on roll no
                    int r1 = Integer.parseInt(o1.getStudentRollnumb());
                    int r2 = Integer.parseInt(o2.getStudentRollnumb());
                    return r1 - r2;
                }
            });

            for (int i = 0; i < arrayList.size(); i++) {
                Log.i("Mainactivity", "readJson: based on roll no" + arrayList.get(i).getStudentRollnumb());
            }
            Collections.sort(arrayList, new Comparator<StudentModel>() {
                @Override
                public int compare(StudentModel o1, StudentModel o2) {
                    //based on name
                    return o2.getStudentName().compareToIgnoreCase(o1.getStudentName());
                }
            });
            for (int i = 0; i < arrayList.size(); i++) {
                Log.i("Mainactivity", "readJson: based on name " + arrayList.get(i).getStudentName());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
    }
