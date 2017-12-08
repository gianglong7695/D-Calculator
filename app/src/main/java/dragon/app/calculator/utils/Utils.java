package dragon.app.calculator.utils;

import android.os.Build;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by VCCORP on 12/8/2017.
 */

public class Utils {
    public static void MathSetText(String txt, TextView textView) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            textView.setText(Html.fromHtml(txt, Html.FROM_HTML_MODE_COMPACT));
        } else {
            textView.setText(Html.fromHtml(txt));
        }
//        textView.setText(Html.fromHtml(txt));
    }
}
