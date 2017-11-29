package dragon.app.calculator.utils;

/**
 * Created by VCCORP on 11/29/2017.
 */

public class Calculation {
    public static String round(String result){

        return result.indexOf(".") < 0 ? result : result.replaceAll("0*$", "").replaceAll("\\.$", "");
    }
}
