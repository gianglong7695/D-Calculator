package dragon.app.calculator.data;

import dragon.app.calculator.models.KeyEntity;

/**
 * Created by giang on 11/27/2017.
 */

public class OriginValue {
    public static final String TYPE_NUM = "number";
    public static final String TYPE_SET = "setting";
    public static final String TYPE_BAC = "backspace";
    public static final String TYPE_CLR = "clear";
    public static final String TYPE_CAL = "calculation";
    public static final String TYPE_RES = "result";
    public static final String TYPE_PAR = "parenthesis";
    public static final String TYPE_MIN = "minus";
    public static final String TYPE_COM = "comma";


    public static final KeyEntity KEY_0 = new KeyEntity("0", "0", TYPE_NUM);
    public static final KeyEntity KEY_1 = new KeyEntity("1", "1", TYPE_NUM);
    public static final KeyEntity KEY_2 = new KeyEntity("2", "2", TYPE_NUM);
    public static final KeyEntity KEY_3 = new KeyEntity("3", "3", TYPE_NUM);
    public static final KeyEntity KEY_4 = new KeyEntity("4", "4", TYPE_NUM);
    public static final KeyEntity KEY_5 = new KeyEntity("5", "5", TYPE_NUM);
    public static final KeyEntity KEY_6 = new KeyEntity("6", "6", TYPE_NUM);
    public static final KeyEntity KEY_7 = new KeyEntity("7", "7", TYPE_NUM);
    public static final KeyEntity KEY_8 = new KeyEntity("8", "8", TYPE_NUM);
    public static final KeyEntity KEY_9 = new KeyEntity("9", "9", TYPE_NUM);
    public static final KeyEntity KEY_SETTING = new KeyEntity("setting", "setting", TYPE_SET);
    public static final KeyEntity KEY_BACKSPACE = new KeyEntity("backspace", "backspace", TYPE_BAC);
    public static final KeyEntity KEY_CLEAR = new KeyEntity("clear", "clear", TYPE_CLR);
    public static final KeyEntity KEY_DIV = new KeyEntity("÷", "/", TYPE_CAL);
    public static final KeyEntity KEY_MUL = new KeyEntity("×", "*", TYPE_CAL);
    public static final KeyEntity KEY_SUB = new KeyEntity("-", "-", TYPE_CAL);
    public static final KeyEntity KEY_ADD = new KeyEntity("+", "+", TYPE_CAL);
    public static final KeyEntity KEY_PERSENT = new KeyEntity("%", "%", TYPE_CAL);
    public static final KeyEntity KEY_EQUAL = new KeyEntity("=", "=", TYPE_RES);
    public static final KeyEntity KEY_PARENTHESIS_1 = new KeyEntity("(", "(", TYPE_PAR);
    public static final KeyEntity KEY_PARENTHESIS_2 = new KeyEntity(")", ")", TYPE_PAR);
    public static final KeyEntity KEY_PLUS_MINUS = new KeyEntity("+/-", "+/-", TYPE_MIN);
    public static final KeyEntity KEY_COMMA = new KeyEntity(",", ",", TYPE_COM);







}
