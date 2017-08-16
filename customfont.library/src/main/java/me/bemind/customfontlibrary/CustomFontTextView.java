package me.bemind.customfontlibrary;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * Created by angelomoroni on 16/08/17.
 */

public class CustomFontTextView extends AppCompatTextView {
    public CustomFontTextView(Context context) {
        super(context);
        if(!this.isInEditMode()){
            setTypeface(FontUtil.getInstance().getFont(FontUtil.FontStyle.REGULAR));
        }
    }

    public CustomFontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        if(!this.isInEditMode()){
            init(attrs);
        }
    }


    public CustomFontTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if(!this.isInEditMode()){
            init(attrs);
        }
    }

    private void init(AttributeSet attrs) {
        if(attrs!=null){
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.CustomFontTextView);

            String font = FontUtil.getInstance().getFont(
                    a.getInt(R.styleable.CustomFontTextView_fontStyle, FontUtil.FontStyle.REGULAR.id)
            );


            if(font!=null){
                setTypeface(font);
            }
            a.recycle();
        }
    }

    private void setTypeface(String font){
        try {
            if(font!=null) {
                Typeface tf = Typeface.createFromAsset(getContext().getAssets(), font);
                setTypeface(tf);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
