package com.example.next.nexttool.threads;

import android.content.Context;
import android.os.AsyncTask;

import com.example.next.nexttool.dao.Cards;
import com.example.next.nexttool.dao.Guide;
import com.example.next.nexttool.dao.Tabs;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by next on 10/5/17.
 */
public class HomeAsyncTask extends AsyncTask<String , Void, String> {
    ArrayList<Tabs> tabsArrayList = new ArrayList<>();

    Context context;

    public HomeAsyncTask(Context context) {
        this.context = context;
    }

    @Override
    protected String doInBackground(String... params) {

        try {
            InputStream inputStream =context.getAssets().open("DetailsofData.json") ;
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
           String  json = new String(buffer, "UTF-8");
            return json;
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null ;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);


        try {
            JSONObject jsonObj = new JSONObject(s);

            JSONArray jsonArray_Tabs = jsonObj.getJSONArray("tabs");
            for (int i = 0; i < jsonArray_Tabs.length(); i++) {
                ArrayList<Cards> cardsArrayList = new ArrayList<>();
                Tabs tabData = new Tabs();

                JSONObject jsonObject = jsonArray_Tabs.getJSONObject(i);

                String strTitle1 = jsonObject.getString("title");
                String strInfo1 = jsonObject.getString("info");
                String strIcon = jsonObject.getString("icon");
                tabData.setTitle(strTitle1);
                tabData.setIcon(strIcon);
                tabData.setInfo(strInfo1);



                JSONArray jsonArray_Cards = jsonObject.getJSONArray("cards");
                for (int j = 0; j < jsonArray_Cards.length(); j++) {
                    ArrayList<Guide> guideArrayList = new ArrayList<>();
                    Cards cardData = new Cards();

                    JSONObject jsonObject1 = jsonArray_Cards.getJSONObject(j);
                    String strTitle2 = jsonObject1.getString("title");
                    String strThumb1 = jsonObject1.getString("thumb");
                    String strInfo2 = jsonObject1.getString("info");
                    String strURL = jsonObject1.getString("url");
                    cardData.setTitle(strTitle2);
                    cardData.setThumb(strThumb1);
                    cardData.setInfo(strInfo2);
                    cardData.setUrl(strURL);


                    JSONArray jsonArray_Guide = jsonObject1.getJSONArray("guide");
                    for (int k = 0; k < jsonArray_Guide.length(); k++) {


                        Guide guideData = new Guide();
                        JSONObject jsonObject2 = jsonArray_Guide.getJSONObject(k);
                        String strThumb2 = jsonObject2.getString("thumb");
                        String strTitle3 = jsonObject2.getString("title");
                        String strColor = jsonObject2.getString("color");
                        String strDescription = jsonObject2.getString("description");
                        guideData.setThumb(strThumb2);
                        guideData.setTitle(strTitle3);
                        guideData.setColour(strColor);
                        guideData.setDescription(strDescription);
                        guideArrayList.add(guideData);

                    }
                    cardData.setGuideInfo(guideArrayList);
                    cardsArrayList.add(cardData);
                }
                tabData.setCardInfo(cardsArrayList);
                tabsArrayList.add(tabData);
            }

            NlpConstants.tabsArrayList = tabsArrayList;

        } catch (JSONException ex) {
            ex.printStackTrace();
        }

        }



}
