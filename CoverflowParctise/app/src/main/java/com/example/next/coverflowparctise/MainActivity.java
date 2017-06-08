package com.example.next.coverflowparctise;

import android.databinding.DataBindingUtil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.next.coverflowparctise.databinding.ActivityMainBinding;
import com.example.next.coverflowparctise.databinding.ItemViewBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


    }


    private  class  TestAdapter extends RecyclerView.Adapter<TestViewHolder>{

        @Override
        public TestViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            ItemViewBinding mItemViewBinding=DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),R.layout.item_view,parent,false);

            return new TestViewHolder(mItemViewBinding);
        }

        @Override
        public void onBindViewHolder(TestViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }

    private class TestViewHolder extends RecyclerView.ViewHolder {
    public  final  ItemViewBinding mItemViewBinding;

        public TestViewHolder(final ItemViewBinding mItemViewBinding) {
            super(mItemViewBinding.getRoot());
            this.mItemViewBinding = mItemViewBinding;

        }
    }
}
