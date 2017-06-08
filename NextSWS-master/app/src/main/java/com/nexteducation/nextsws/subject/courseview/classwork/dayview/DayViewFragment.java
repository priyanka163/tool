package com.nexteducation.nextsws.subject.courseview.classwork.dayview;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Toast;

import com.nexteducation.nextsws.BR;
import com.nexteducation.nextsws.BaseFragment;
import com.nexteducation.nextsws.MainActivity;
import com.nexteducation.nextsws.R;
import com.nexteducation.nextsws.common.GenericAdapter;
import com.nexteducation.nextsws.customviews.coverflow.MyZoomPostLayoutListener;
import com.nexteducation.nextsws.customviews.coverflow.library.CarouselLayoutManager;
import com.nexteducation.nextsws.customviews.coverflow.library.CenterScrollListener;
import com.nexteducation.nextsws.customviews.coverflow.library.DefaultChildSelectionListener;
import com.nexteducation.nextsws.databinding.FragmentDayviewBinding;
import com.nexteducation.nextsws.test.ResourceDetailVM;
import com.nexteducation.swagger.nextsws.ApiClient;
import com.nexteducation.swagger.nextsws.api.SwscontrollerApi;
import com.nexteducation.swagger.nextsws.model.LearningPlanDayWiseResponse;
import com.nexteducation.swagger.nextsws.model.LearningPlanRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by saisasank on 1/27/2017.
 */

public class DayViewFragment extends BaseFragment {

    private FragmentDayviewBinding mFragmentDayviewBinding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mFragmentDayviewBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_dayview, container, false);
        return mFragmentDayviewBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        /* Testing Code */
        ApiClient apiClient = new ApiClient();
        SwscontrollerApi swscontrollerApi = apiClient.createService(SwscontrollerApi.class);


        /* creating Body for LearningPlanRequest */
        LearningPlanRequest learningPlanRequest = new LearningPlanRequest()
                                                        .addLearningPlanTypesItem(LearningPlanRequest.LearningPlanTypesEnum.LECTURE)
                                                        .addLearningPlanTypesItem(LearningPlanRequest.LearningPlanTypesEnum.LABSESSION)
                                                        .subject(Long.valueOf(10710))
                                                        .classId(Long.valueOf(4425))
                                                        .section(Long.valueOf(4533));

       /* Call<LearningPlanDayWiseResponse> call = swscontrollerApi.getDayWisePlanUsingPOST(learningPlanRequest, Long.valueOf(113393), Long.valueOf(2626), Long.valueOf(124489));
        call.enqueue(new Callback<LearningPlanDayWiseResponse>() {
            @Override
            public void onResponse(Call<LearningPlanDayWiseResponse> call, Response<LearningPlanDayWiseResponse> response) {
                System.out.println("GOt the response");
            }

            @Override
            public void onFailure(Call<LearningPlanDayWiseResponse> call, Throwable t) {
                System.out.println("Got Failure");
            }
        });*/


        /* PlaceHolder Code */
        List<ResourceDetailVM> resources = new ArrayList<>();
        resources.add(new ResourceDetailVM("Mole Concept and Stochiometry Mole Concept", "Next Education", "Presentation", null));
        resources.add(new ResourceDetailVM("Mole Concept and Stochiometry Mole Concept", "Next Education", "Presentation", null));
        resources.add(new ResourceDetailVM("Mole Concept and Stochiometry Mole Concept", "Next Education", "Presentation", null));
        resources.add(new ResourceDetailVM("Mole Concept and Stochiometry Mole Concept", "Next Education", "Presentation", null));
        resources.add(new ResourceDetailVM("Mole Concept and Stochiometry Mole Concept", "Next Education", "Presentation", null));
        resources.add(new ResourceDetailVM("Mole Concept and Stochiometry Mole Concept", "Next Education", "Presentation", null));
        resources.add(new ResourceDetailVM("Mole Concept and Stochiometry Mole Concept", "Next Education", "Presentation", null));
        resources.add(new ResourceDetailVM("Mole Concept and Stochiometry Mole Concept", "Next Education", "Presentation", null));


        GenericAdapter<ResourceDetailVM> adapter = new GenericAdapter<ResourceDetailVM>(resources, BR.resourceDetail);

        // create layout manager with needed params: vertical, cycle
        initRecyclerView(mFragmentDayviewBinding.dayResources, new CarouselLayoutManager(CarouselLayoutManager.HORIZONTAL, false), adapter);

        mFragmentDayviewBinding.totalTimeLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                mFragmentDayviewBinding.totalTimeLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                changeTriangleDimensions();
            }
        });
    }

    private void initRecyclerView(final RecyclerView recyclerView, final CarouselLayoutManager layoutManager, final GenericAdapter adapter) {
        // enable zoom effect. this line can be customized
        layoutManager.setPostLayoutListener(new MyZoomPostLayoutListener());
        layoutManager.setMaxVisibleItems(6);

        recyclerView.setLayoutManager(layoutManager);
        // we expect only fixed sized item for now
        recyclerView.setHasFixedSize(true);
        // sample adapter with random data
        recyclerView.setAdapter(adapter);
        // enable center post scrolling
        recyclerView.addOnScrollListener(new CenterScrollListener());

        // enable center post touching on item and item click listener

        recyclerView.smoothScrollToPosition(3);

        recyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
                int action = e.getAction();
                switch (action) {
                    case MotionEvent.ACTION_MOVE:
                        rv.getParent().requestDisallowInterceptTouchEvent(true);
                        break;
                }
                return false;
            }

            @Override
            public void onTouchEvent(RecyclerView rv, MotionEvent e) {

            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }
        });

        DefaultChildSelectionListener.initCenterItemListener(new DefaultChildSelectionListener.OnCenterItemClickListener() {
            @Override
            public void onCenterItemClicked(@NonNull final RecyclerView recyclerView, @NonNull final CarouselLayoutManager carouselLayoutManager, @NonNull final View v) {
                final int position = recyclerView.getChildLayoutPosition(v);
                final String msg = String.format(Locale.US, "Item %1$d was clicked", position);
                Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
            }
        }, recyclerView, layoutManager);

        layoutManager.addOnItemSelectionListener(new CarouselLayoutManager.OnCenterItemSelectionListener() {

            @Override
            public void onCenterItemChanged(final int adapterPosition) {
                if (CarouselLayoutManager.INVALID_POSITION != adapterPosition) {
                    //final int value = adapter.mPosition[adapterPosition];
/*
                    adapter.mPosition[adapterPosition] = (value % 10) + (value / 10 + 1) * 10;
                    adapter.notifyItemChanged(adapterPosition);
*/
                }
            }
        });
    }

    private void changeTriangleDimensions() {
        ViewGroup.LayoutParams layoutParams = mFragmentDayviewBinding.triangle.getLayoutParams();
        layoutParams.width = mFragmentDayviewBinding.totalTimeLayout.getMeasuredHeight();
        layoutParams.height = mFragmentDayviewBinding.totalTimeLayout.getMeasuredHeight();
        mFragmentDayviewBinding.triangle.setLayoutParams(layoutParams);
    }
}
