package dragon.app.calculator.data;

import dragon.app.calculator.R;
import dragon.app.calculator.models.KeyEntity;

/**
 * Created by giang on 11/27/2017.
 */

public class OriginValue {
//    public static final String TYPE_NUM = "number";
//    public static final String TYPE_SET = "setting";
//    public static final String TYPE_BAC = "backspace";
//    public static final String TYPE_CLR = "clear";
//    public static final String TYPE_CAL = "calculation";
//    public static final String TYPE_RES = "result";
//    public static final String TYPE_PAR = "parenthesis";
//    public static final String TYPE_MIN = "minus";
//    public static final String TYPE_COM = "comma";


    public static final KeyEntity KEY_0 = new KeyEntity("0", "0", R.string.type_num);
    public static final KeyEntity KEY_1 = new KeyEntity("1", "1", R.string.type_num);
    public static final KeyEntity KEY_2 = new KeyEntity("2", "2", R.string.type_num);
    public static final KeyEntity KEY_3 = new KeyEntity("3", "3", R.string.type_num);
    public static final KeyEntity KEY_4 = new KeyEntity("4", "4", R.string.type_num);
    public static final KeyEntity KEY_5 = new KeyEntity("5", "5", R.string.type_num);
    public static final KeyEntity KEY_6 = new KeyEntity("6", "6", R.string.type_num);
    public static final KeyEntity KEY_7 = new KeyEntity("7", "7", R.string.type_num);
    public static final KeyEntity KEY_8 = new KeyEntity("8", "8", R.string.type_num);
    public static final KeyEntity KEY_9 = new KeyEntity("9", "9", R.string.type_num);
    public static final KeyEntity KEY_SETTING = new KeyEntity("setting", "setting", R.string.type_set);
    public static final KeyEntity KEY_BACKSPACE = new KeyEntity("backspace", "backspace", R.string.type_bac);
    public static final KeyEntity KEY_CLEAR = new KeyEntity("C", "clear", R.string.type_cle);
    public static final KeyEntity KEY_DIV = new KeyEntity("÷", "/", R.string.type_cal);
    public static final KeyEntity KEY_MUL = new KeyEntity("×", "*", R.string.type_cal);
    public static final KeyEntity KEY_SUB = new KeyEntity("-", "-", R.string.type_cal);
    public static final KeyEntity KEY_ADD = new KeyEntity("+", "+", R.string.type_cal);
    public static final KeyEntity KEY_PERSENT = new KeyEntity("%", "%", R.string.type_cal);
    public static final KeyEntity KEY_EQUAL = new KeyEntity("=", "=", R.string.type_res);
    public static final KeyEntity KEY_PARENTHESIS_1 = new KeyEntity("(", "(", R.string.type_par);
    public static final KeyEntity KEY_PARENTHESIS_2 = new KeyEntity(")", ")", R.string.type_par);
    public static final KeyEntity KEY_PLUS_MINUS = new KeyEntity("+/-", "+/-", R.string.type_min);
    public static final KeyEntity KEY_COMMA = new KeyEntity(",", ",", R.string.type_min);







}
