package com.nexteducation.nextsws.customviews.coverflow;

import android.support.annotation.NonNull;
import android.view.View;

import com.nexteducation.nextsws.customviews.coverflow.library.CarouselLayoutManager;
import com.nexteducation.nextsws.customviews.coverflow.library.ItemTransformation;


/**
 * Created by saisasank on 1/4/2017.
 */
public class MyZoomPostLayoutListener implements CarouselLayoutManager.PostLayoutListener {

    @Override
    public ItemTransformation transformChild(@NonNull final View child, final float itemPositionToCenterDiff, final int orientation) {
        final float scale =  (float) (2 * (2 * -StrictMath.atan(Math.abs(itemPositionToCenterDiff/6) + 1.0) / Math.PI + 1));
        System.out.println("Scale factor " + scale);

        // because scaling will make view smaller in its center, then we should move this item to the top or bottom to make it visible
        final float translateY;
        final float translateX;
        if (CarouselLayoutManager.VERTICAL == orientation) {
            final float translateYGeneral = child.getMeasuredHeight() * (1 - scale) / 8f;
            translateY = Math.signum(itemPositionToCenterDiff) * translateYGeneral;
            translateX = 0;
        } else {
            float translateXGeneral = 0.0f;
            if(itemPositionToCenterDiff < 1.0 && itemPositionToCenterDiff > -1.0) {
                translateXGeneral = child.getMeasuredWidth() * (1 - scale) / 8f;
            } else {
                translateXGeneral = child.getMeasuredWidth() * (1 - scale) / 8f;
            }
            translateX = Math.signum(itemPositionToCenterDiff) * translateXGeneral;
            translateY = 0;
        }

        return new ItemTransformation(1f * scale, 1f * scale, translateX, translateY);
    }
}
