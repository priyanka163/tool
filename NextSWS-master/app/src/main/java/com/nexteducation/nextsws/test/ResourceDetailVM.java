package com.nexteducation.nextsws.test;

import android.databinding.BindingAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.nexteducation.nextsws.R;
import com.nexteducation.nextsws.common.GenericAdapter;

/**
 * Created by saisasank on 1/30/2017.
 */

public class ResourceDetailVM implements GenericAdapter.ViewModel {

    public int mPosition;

    public String title;

    public String system;

    public String type;

    public int[] colors;

    public int[] drawables = {R.drawable.v1, R.drawable.v2, R.drawable.v3, R.drawable.v4, R.drawable.v5, R.drawable.v6, R.drawable.v8};

    public ResourceDetailVM(String title, String system, String type, int[] colors) {
        this.title = title;
        this.system = system;
        this.type = type;
        this.colors = colors;
    }

    @Override
    public int getLayoutId() {
        return R.layout.resource_card_day_layout;
    }

    @Override
    public void setItemPosition(int position) {
        this.mPosition = position;
    }

    @BindingAdapter({"bind:thumbnail", "bind:position"})
    public static void loadResourceThumbnail(ImageView imageView, int[] drawables, int position) {
        imageView.setImageDrawable(imageView.getResources().getDrawable(drawables[position % 7]));
    }

}
