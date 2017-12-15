package dragon.app.calculator.utils;

import org.mariuszgromada.math.mxparser.Expression;

/**
 * Created by VCCORP on 11/29/2017.
 */

public class Calculation {
    public static String round(String result) {

        return result.indexOf(".") < 0 ? result : result.replaceAll("0*$", "").replaceAll("\\.$", "");
    }


    public static Double caculate(String str) {
        try {
            return new Expression(str).calculate();
        } catch (Exception e) {
            Logs.e(e.toString());
        }

        return null;
    }
}
