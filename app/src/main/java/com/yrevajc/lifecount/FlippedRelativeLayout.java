package com.yrevajc.lifecount;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * Created by CJ on 9/5/2017.
 */
public class FlippedRelativeLayout extends RelativeLayout
{
    public FlippedRelativeLayout(Context context)
    {
        super(context);
    }

    public FlippedRelativeLayout(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    public FlippedRelativeLayout(Context context, AttributeSet attrs,
                                 int defStyle)
    {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        canvas.save();
        canvas.rotate(180);
        super.onDraw(canvas);
        canvas.restore();
    }
}