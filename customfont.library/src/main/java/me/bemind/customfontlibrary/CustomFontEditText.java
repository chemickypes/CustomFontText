package me.bemind.customfontlibrary;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

/**
 * Created by angelomoroni on 17/08/17.
 */

public class CustomFontEditText extends AppCompatEditText {
    public CustomFontEditText(Context context) {
        super(context);
        if(!this.isInEditMode()){
            setTypeface(FontUtil.getInstance().getFont(FontUtil.FontStyle.REGULAR));
        }
    }

    public CustomFontEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        if(!this.isInEditMode()){
            init(attrs);
        }
    }

    public CustomFontEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if(!this.isInEditMode()){
            init(attrs);
        }
    }

    private void init(AttributeSet attrs){
        if(attrs!=null){
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.CustomFontEditText);

            String font = FontUtil.getInstance().getFont(
                    a.getInt(R.styleable.CustomFontEditText_fontStyle, FontUtil.FontStyle.REGULAR.id)
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
