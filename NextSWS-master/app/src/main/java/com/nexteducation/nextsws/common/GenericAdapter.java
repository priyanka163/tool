package com.nexteducation.nextsws.common;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by saisasank on 1/30/2017.
 */

/**
 * A Generic Recycler View Adapter following MVVM pattern
 * which can be used in the application for rendering List layouts
 * @param <T>
 */

public class GenericAdapter<T extends GenericAdapter.ViewModel> extends RecyclerView.Adapter<GenericAdapter.BindingViewHolder> {

    protected List<T> viewModels;

    protected int mVariableId;

    public GenericAdapter(List<T> viewModels, int variableId ) {
        this.viewModels = viewModels;
        this.mVariableId = variableId;
    }


    @Override
    public BindingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), viewType, parent, false);
        return new BindingViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(BindingViewHolder holder, int position) {
        holder.binding.setVariable(mVariableId, viewModels.get(position));
        holder.binding.executePendingBindings();

    }

    @Override
    public int getItemCount() {
        return viewModels.size();
    }

    @Override
    public int getItemViewType(int position) {
        viewModels.get(position).setItemPosition(position);
        return viewModels.get(position).getLayoutId();
    }

    public void setData(List<T> viewModels) {
        this.viewModels = viewModels;
        notifyDataSetChanged();
    }

    public static class BindingViewHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder {

        public T binding;

        private BindingViewHolder(T binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

    }

    public interface ViewModel {
        public int getLayoutId();

        public void setItemPosition(int position);
    }
}
