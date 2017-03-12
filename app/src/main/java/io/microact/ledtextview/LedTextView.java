package io.microact.ledtextview;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * 类似LED数码管显示的效果
 * <p>
 * 参考了 50 Android Hack 的Hack 11 Adding text growing effects
 */
public class LedTextView extends AppCompatTextView {
    public LedTextView(Context context) {
        super(context, null);
    }

    public LedTextView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LedTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(), "font_digital.ttf");
        this.setTypeface(typeface);
    }

}
