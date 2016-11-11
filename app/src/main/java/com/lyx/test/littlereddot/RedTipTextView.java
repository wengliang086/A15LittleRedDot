package com.lyx.test.littlereddot;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * textView上的小红点
 * Created by Administrator on 2016/11/11.
 */

public class RedTipTextView extends TextView {
    public RedTipTextView(Context context) {
        super(context);
        init(null);
    }

    public RedTipTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public RedTipTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    public static final int RED_TIP_INVISIBLE = 0;
    public static final int RED_TIP_VISIBLE = 1;
    public static final int RED_TIP_GONE = 2;
    private int tipVisibility = 0;

    private void init(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray array = getContext().obtainStyledAttributes(attrs, R.styleable.RedTipTextView);
            tipVisibility = array.getInt(R.styleable.RedTipTextView_redTipsVisibility, 0);
            array.recycle();
        }
    }

    Paint paint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (tipVisibility == 1) {
            int width = getWidth();
            int paddingRight = getPaddingRight();

            paint.setColor(Color.RED);
            paint.setAntiAlias(true);
            paint.setDither(true);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            canvas.drawCircle(width - paddingRight / 2, paddingRight / 2, paddingRight / 2, paint);
        }
    }

    public void setTipVisibility(int visibility) {
        tipVisibility = visibility;
        invalidate();
    }
}
