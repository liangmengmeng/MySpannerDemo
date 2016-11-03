package spanner.bwie.com.myspannerdemo;

import android.graphics.BlurMaskFilter;
import android.graphics.Color;
import android.graphics.EmbossMaskFilter;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.MaskFilterSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spannable spanText;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 1.改变文本颜色
        changeTextColor();
        // 2.MaskFilterSpan 修饰效果，如模糊(BlurMaskFilter)、浮雕(EmbossMaskFilter)
        changeBlur();
        // 3.RasterizerSpan 光栅效果
        changeSpan1();
        // 4.StrikethroughSpan 删除线（中划线）
        changeSpan2();
        //  5.UnderlineSpan 下划线
        initUnder();
        // 6 .AbsoluteSizeSpan 绝对大小（文本字体）
        initSize();
        // 7.ScaleXSpan 基于x轴缩放
        initContent();
        // 8.StyleSpan 字体样式：粗体、斜体等
        initStyle();
        // 9.SubscriptSpan 下标（数学公式会用到）
        initTopPosition();
        // 10.SuperscriptSpan 上标（数学公式会用到）
        initNextPostion();
        // 11.TextAppearanceSpan 文本外貌（包括字体、大小、样式和颜色）
        initTextStyle();
        // 12.TypefaceSpan 文本字体
        initText();

    }
    // TypefaceSpan 文本字体
    private void initText() {
        spanText = new SpannableString("  12--每天进步一点点,迭代是最好的老师");
        //若需使用自定义字体，可能要重写类TypefaceSpan
        spanText.setSpan(new TypefaceSpan("monospace"), 3, 10,
                Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        tv.append("\n");
        tv.append(spanText);
    }

    // TextAppearanceSpan 文本外貌（包括字体、大小、样式和颜色）
    private void initTextStyle() {
        spanText = new SpannableString("  11---每天进步一点点,迭代是最好的老师");
        //若需自定义TextAppearance，可以在系统样式上进行修改
        spanText.setSpan(new TextAppearanceSpan(this, android.R.style.TextAppearance_Medium),
                6, 7, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        tv.append("\n");
        tv.append(spanText);


    }

    // SuperscriptSpan 上标（数学公式会用到）
    private void initNextPostion() {
        spanText = new SpannableString("  10---每天进步一点点,迭代是最好的老师");
        spanText.setSpan(new SuperscriptSpan(), 6, 7, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        tv.append("\n");
        tv.append(spanText);

    }

    // SubscriptSpan 下标（数学公式会用到）
    private void initTopPosition() {
        spanText = new SpannableString("  9---每天进步一点点,迭代是最好的老师");
        spanText.setSpan(new SubscriptSpan(), 6, 7, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        tv.append("\n");
        tv.append(spanText);
    }

    // StyleSpan 字体样式：粗体、斜体等
    private void initStyle() {
        spanText = new SpannableString("8---每天进步一点点,迭代是最好的老师");
        //Typeface.BOLD_ITALIC:粗体+斜体
        spanText.setSpan(new StyleSpan(Typeface.BOLD_ITALIC), 3, 7,
                Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        tv.append("\n");
        tv.append(spanText);

    }

    // ScaleXSpan 基于x轴缩放
    private void initContent() {
            spanText = new SpannableString("  7--每天进步一点点,迭代是最好的老师");
            //参数proportion:比例大小
            spanText.setSpan(new ScaleXSpan(3.8f), 3, 7, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
            tv.append("\n");
            tv.append(spanText);
    }

    //AbsoluteSizeSpan 绝对大小（文本字体）
    private void initSize() {
        spanText = new SpannableString("  6--每天进步一点点,迭代是最好的老师");
        spanText.setSpan(new AbsoluteSizeSpan(20, true), 0, spanText.length(),
                Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        tv.append("\n");
        tv.append(spanText);
    }

    //UnderlineSpan 下划线
    private void initUnder() {
        spanText = new SpannableString("  5--每天进步一点点,迭代是最好的老师");
        spanText.setSpan(new UnderlineSpan(), 0, spanText.length(),
                Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        tv.append("\n");
        tv.append(spanText);

    }
    //StrikethroughSpan 删除线（中划线）
    private void changeSpan2() {
        spanText = new SpannableString("  4--每天进步一点点,迭代是最好的老师");
        spanText.setSpan(new StrikethroughSpan(), 0, 7, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        tv.append("\n");
        tv.append(spanText);
    }

    //RasterizerSpan 光栅效果
    private void changeSpan1() {
        spanText = new SpannableString("  3--每天进步一点点,迭代是最好的老师");
        spanText.setSpan(new StrikethroughSpan(), 0, 7, Spannable.
                SPAN_INCLUSIVE_EXCLUSIVE);
        tv.append("\n");
        tv.append(spanText);

    }

    //MaskFilterSpan 修饰效果，如模糊(BlurMaskFilter)、浮雕(EmbossMaskFilter)
    private void changeBlur() {
            spanText = new SpannableString("  2--每天进步一点点,迭代是最好的老师");
        int length = spanText.length();
        //模糊(BlurMaskFilter)
        MaskFilterSpan maskFilterSpan = new MaskFilterSpan(new BlurMaskFilter(3, BlurMaskFilter.Blur.OUTER));
        spanText.setSpan(maskFilterSpan, 0, length - 10, Spannable.
                SPAN_INCLUSIVE_EXCLUSIVE);
        //浮雕(EmbossMaskFilter)
        maskFilterSpan = new MaskFilterSpan(new EmbossMaskFilter(new float[]{1,1,3}, 1.5f, 8, 3));
        spanText.setSpan(maskFilterSpan, length - 10, length, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        tv.append("\n");
        tv.append(spanText);
    }

    //改变文本颜色
    private void changeTextColor() {
        spanText=new SpannableString(" 1--每天进步一点点,迭代是最好的老师");
        //6 表示下标从第6个开始变颜色
        spanText.setSpan(new ForegroundColorSpan(Color.BLUE), 6, spanText.length(),
                Spannable.SPAN_INCLUSIVE_EXCLUSIVE);

        tv = (TextView) findViewById(R.id.tv);
        tv.append("\n");
        tv.append(spanText);
    }
}
