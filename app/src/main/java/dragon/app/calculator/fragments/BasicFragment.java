package dragon.app.calculator.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.mariuszgromada.math.mxparser.Expression;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import dragon.app.calculator.R;
import dragon.app.calculator.interfaces.ICallBack;
import dragon.app.calculator.models.KeyEntity;
import dragon.app.calculator.utils.Calculation;
import dragon.app.calculator.utils.Logs;

import static dragon.app.calculator.data.OriginValue.KEY_0;
import static dragon.app.calculator.data.OriginValue.KEY_1;
import static dragon.app.calculator.data.OriginValue.KEY_2;
import static dragon.app.calculator.data.OriginValue.KEY_3;
import static dragon.app.calculator.data.OriginValue.KEY_4;
import static dragon.app.calculator.data.OriginValue.KEY_5;
import static dragon.app.calculator.data.OriginValue.KEY_6;
import static dragon.app.calculator.data.OriginValue.KEY_7;
import static dragon.app.calculator.data.OriginValue.KEY_8;
import static dragon.app.calculator.data.OriginValue.KEY_9;
import static dragon.app.calculator.data.OriginValue.KEY_ADD;
import static dragon.app.calculator.data.OriginValue.KEY_BACKSPACE;
import static dragon.app.calculator.data.OriginValue.KEY_CLEAR;
import static dragon.app.calculator.data.OriginValue.KEY_COMMA;
import static dragon.app.calculator.data.OriginValue.KEY_DIV;
import static dragon.app.calculator.data.OriginValue.KEY_EQUAL;
import static dragon.app.calculator.data.OriginValue.KEY_MUL;
import static dragon.app.calculator.data.OriginValue.KEY_PARENTHESIS_1;
import static dragon.app.calculator.data.OriginValue.KEY_PARENTHESIS_2;
import static dragon.app.calculator.data.OriginValue.KEY_PERSENT;
import static dragon.app.calculator.data.OriginValue.KEY_PLUS_MINUS;
import static dragon.app.calculator.data.OriginValue.KEY_SUB;

/**
 * A simple {@link Fragment} subclass.
 */
public class BasicFragment extends Fragment implements View.OnClickListener {
    @BindView(R.id.tv_0)
    TextView tv_0;
    @BindView(R.id.tv_1)
    TextView tv_1;
    @BindView(R.id.tv_2)
    TextView tv_2;
    @BindView(R.id.tv_3)
    TextView tv_3;
    @BindView(R.id.tv_4)
    TextView tv_4;
    @BindView(R.id.tv_5)
    TextView tv_5;
    @BindView(R.id.tv_6)
    TextView tv_6;
    @BindView(R.id.tv_7)
    TextView tv_7;
    @BindView(R.id.tv_8)
    TextView tv_8;
    @BindView(R.id.tv_9)
    TextView tv_9;
    @BindView(R.id.iv_setting)
    ImageView iv_setting;
    @BindView(R.id.iv_backspace)
    ImageView iv_backspace;
    @BindView(R.id.tv_clear)
    TextView tv_clear;
    @BindView(R.id.tv_div)
    TextView tv_div;
    @BindView(R.id.tv_mul)
    TextView tv_mul;
    @BindView(R.id.tv_sub)
    TextView tv_sub;
    @BindView(R.id.tv_add)
    TextView tv_add;
    @BindView(R.id.tv_equal)
    TextView tv_equal;
    @BindView(R.id.tv_percent)
    TextView tv_percent;
    @BindView(R.id.tv_parenthesis_1)
    TextView tv_parenthesis_1;
    @BindView(R.id.tv_parenthesis_2)
    TextView tv_parenthesis_2;
    @BindView(R.id.tv_plus_minus)
    TextView tv_plus_minus;
    @BindView(R.id.tv_comma)
    TextView tv_comma;


    public ICallBack iCallBack;
    private String calculation = "";
    private String result = "";
    private ArrayList<KeyEntity> listHistoryKey;
    private String num = "";
    private ArrayList<String> listNums = new ArrayList<>();
    private ArrayList<String> listCals = new ArrayList<>();
    private boolean isNumMinus = false;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getContext() instanceof ICallBack) {
            iCallBack = (ICallBack) getContext();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_basic, container, false);
        ButterKnife.bind(this, v);

        init();
        return v;
    }

    public void init() {
        tv_0.setOnClickListener(this);
        tv_1.setOnClickListener(this);
        tv_2.setOnClickListener(this);
        tv_3.setOnClickListener(this);
        tv_4.setOnClickListener(this);
        tv_5.setOnClickListener(this);
        tv_6.setOnClickListener(this);
        tv_7.setOnClickListener(this);
        tv_8.setOnClickListener(this);
        tv_9.setOnClickListener(this);
        iv_setting.setOnClickListener(this);
        iv_backspace.setOnClickListener(this);
        tv_clear.setOnClickListener(this);
        tv_div.setOnClickListener(this);
        tv_mul.setOnClickListener(this);
        tv_sub.setOnClickListener(this);
        tv_add.setOnClickListener(this);
        tv_equal.setOnClickListener(this);
        tv_percent.setOnClickListener(this);
        tv_parenthesis_1.setOnClickListener(this);
        tv_parenthesis_2.setOnClickListener(this);
        tv_plus_minus.setOnClickListener(this);
        tv_comma.setOnClickListener(this);


        listHistoryKey = new ArrayList<>();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_0:
                handlingKey(KEY_0);
                break;
            case R.id.tv_1:
                handlingKey(KEY_1);
                break;
            case R.id.tv_2:
                handlingKey(KEY_2);
                break;
            case R.id.tv_3:
                handlingKey(KEY_3);
                break;
            case R.id.tv_4:
                handlingKey(KEY_4);
                break;
            case R.id.tv_5:
                handlingKey(KEY_5);
                break;
            case R.id.tv_6:
                handlingKey(KEY_6);
                break;
            case R.id.tv_7:
                handlingKey(KEY_7);
                break;
            case R.id.tv_8:
                handlingKey(KEY_8);
                break;
            case R.id.tv_9:
                handlingKey(KEY_9);
                break;
            case R.id.iv_setting:
                setting();
                break;
            case R.id.iv_backspace:
                handlingKey(KEY_BACKSPACE);
                break;
            case R.id.tv_clear:
                handlingKey(KEY_CLEAR);
                break;
            case R.id.tv_div:
                handlingKey(KEY_DIV);
                break;
            case R.id.tv_mul:
                handlingKey(KEY_MUL);

                break;
            case R.id.tv_sub:
                handlingKey(KEY_SUB);

                break;
            case R.id.tv_add:
                handlingKey(KEY_ADD);

                break;
            case R.id.tv_percent:
                handlingKey(KEY_PERSENT);
                break;

            case R.id.tv_equal:
                handlingKey(KEY_EQUAL);
                break;
            case R.id.tv_parenthesis_1:

                break;
            case R.id.tv_parenthesis_2:

                break;
            case R.id.tv_plus_minus:
                handlingKey(KEY_PLUS_MINUS);
                break;
            case R.id.tv_comma:
                handlingKey(KEY_COMMA);
                break;

        }
    }


    public void handlingKey(KeyEntity key) {
        // Saving key to list history
        listHistoryKey.add(key);


        switch (key.getResType()) {
            case R.string.type_num:
                if (!key.equals(KEY_0) || !listHistoryKey.get(listHistoryKey.size() - 1).equals(key)) {
                    num += key.getKeyName();
                    calculation += key.getKeyName();

                    if (listHistoryKey.get(listHistoryKey.size() - 1).getResType() == R.string.type_num) {
                        if (num.replace(KEY_PLUS_MINUS.getKeyValue(), "").length() > 1) {
                            listNums.remove(listNums.size() - 1);
                        }


                        listNums.add(listCals.size(), num);

                    }

                    result = calcutate();
                    iCallBack.setResult(result, R.string.type_num);
                    iCallBack.setCalculation(calculation, R.string.type_num);
                }


                break;
            case R.string.type_cal:
                if (!num.equals("")) {
                    listCals.add(key.getKeyValue());
                    num = "";


                    calculation += key.getKeyName();
                    iCallBack.setCalculation(calculation, R.string.type_cal);

                }

                break;
            case R.string.type_bac:
                if (calculation.length() > 1) {
                    calculation = calculation.substring(0, calculation.length() - 1);
                    iCallBack.setResult(calculation, R.string.type_bac);
                    iCallBack.setCalculation(calculation, R.string.type_bac);
                } else {
                    iCallBack.setResult("0", R.string.type_bac);
                    iCallBack.setCalculation("0", R.string.type_bac);
                }
                break;
            case R.string.type_res:
                calculation = result;

                iCallBack.setResult(result, R.string.type_res);
                iCallBack.setCalculation(calculation, R.string.type_res);
                break;

            case R.string.type_com:
                calculation += key.getKeyName();
                num += key.getKeyValue();

                iCallBack.setCalculation(calculation, R.string.type_com);

                break;
            case R.string.type_cle:
                clear();
                break;

            case R.string.type_min:


                if (listNums.size() > 0) {


                    if(num.contains(KEY_PLUS_MINUS.getKeyValue())){
                        calculation = calculation.substring(0, calculation.length() - 1);
                        num = num.substring(1, num.length());
                    }else{
                        calculation += key.getKeyValue();
                        num = key.getKeyValue();
                    }


                } else {
                    if (calculation.length() > 0) {
                        calculation = "";
                    } else {
                        calculation += key.getKeyValue();

                    }
                }


                iCallBack.setCalculation(calculation, R.string.type_min);

                break;
        }


        checkLogs();

    }


    public void clear() {
        listHistoryKey = new ArrayList<>();
        listNums = new ArrayList<>();
        listCals = new ArrayList<>();
        calculation = "";
        result = "";
        num = "";

        iCallBack.setResult("0", R.string.type_cle);
        iCallBack.setCalculation("0", R.string.type_cle);
    }


    public String calcutate() {
        double result = 0;
        String str_result = getCalculation();
        str_result = str_result.replace('×', '*');
        str_result = str_result.replace('÷', '/');


        Logs.e("The calculation to calculate is : " + str_result);


        try {
            result = Calculation.caculate(str_result);
        } catch (Exception e) {
            Logs.e(e.toString());
        }
        return Calculation.round(String.valueOf(result));
    }


    public void setting() {
        Toast.makeText(getContext(), "Setting", Toast.LENGTH_SHORT).show();
    }


    public void checkLogs() {
        String str = "";
        Logs.e("----------------------------------------------------------------------------------");

        //Log numbers
//        Logs.e(listNums.size());
        for (int i = 0; i < listNums.size(); i++) {
            str += listNums.get(i) + "  ";
        }
        Logs.e(str);


        //Log cals
        str = "";
//        Logs.e(listCals.size());
        for (int i = 0; i < listCals.size(); i++) {
            str += "  " + listCals.get(i);
        }
        Logs.e(str);
    }


    public String getCalculation() {
        String mCaculation = "";
        if (listNums.size() > 0) {
            mCaculation = listNums.get(0);


            try {
                for (int i = 0; i < listCals.size(); i++) {
                    String valueNumber = listNums.get(i + 1);
                    if (valueNumber.contains(KEY_PLUS_MINUS.getKeyValue())) {
                        valueNumber = KEY_PARENTHESIS_1.getKeyValue() + valueNumber + KEY_PARENTHESIS_2.getKeyValue();
                    }


                    if (listCals.get(i).equals("+")) {
                        mCaculation += "+" + valueNumber;

                    }

                    if (listCals.get(i).equals("-")) {
                        mCaculation += "-" + valueNumber;
                    }

                    if (listCals.get(i).equals("*")) {
                        mCaculation += "×" + valueNumber;
                    }

                    if (listCals.get(i).equals("/")) {
                        mCaculation += "÷" + valueNumber;
                    }


                }
            } catch (Exception e) {
                Logs.e(e.getMessage().toString());
            }


        }

        return mCaculation;
    }


}
