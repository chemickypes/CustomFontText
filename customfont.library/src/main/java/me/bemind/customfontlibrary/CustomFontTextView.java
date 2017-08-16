package me.bemind.customfontlibrary;

import android.content.Context;
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

        }
    }

    private void setTypeface(String font){
        try {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(),font);
            setTypeface(tf);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
