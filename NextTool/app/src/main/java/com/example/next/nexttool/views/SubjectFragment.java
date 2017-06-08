package com.example.next.nexttool.views;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.next.nexttool.R;
import com.example.next.nexttool.adpter.RecyclerAdapter;
import com.example.next.nexttool.dao.Cards;
import com.example.next.nexttool.dao.Tabs;
import com.example.next.nexttool.threads.NlpConstants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by next on 11/5/17.
 */
public class SubjectFragment extends Fragment {

    String fragtitle;
    int fragpos;

    public  static SubjectFragment getInstance(int position,String title)
    {
        SubjectFragment frag = new SubjectFragment();
        Bundle args = new Bundle();
        args.putInt("fragmentposition", position);
        args.putString("FragmentTitle", title);
        frag.setArguments(args);
        return frag;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         fragpos = getArguments().getInt("fragmentposition", 0);
        fragtitle = getArguments().getString("FragmentTitle");

    }


    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        RecyclerView recyclerView= (RecyclerView) view.findViewById(R.id.recyclerView_Chem);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<Tabs> tabsArrayList =NlpConstants.tabsArrayList;
      /*  for (int i = 0; i <tabsArrayList.size() ; i++) {

            Tabs tasbDAta =tabsArrayList.get(i);
            if(tasbDAta.getTitle().equals(fragtitle))
            {
                List<Cards> card = tasbDAta.getCardInfo();
            }
        }*/
       Tabs tabdata= tabsArrayList.get(fragpos);
        List<Cards> cardsData=tabdata.getCardInfo();


        RecyclerAdapter recyclerAdapter  = new RecyclerAdapter(getContext(),cardsData);
        recyclerView.setAdapter(recyclerAdapter);
        return view;
    }



}
