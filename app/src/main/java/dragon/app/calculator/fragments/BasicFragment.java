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

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import dragon.app.calculator.R;
import dragon.app.calculator.interfaces.ICallBack;
import dragon.app.calculator.models.KeyEntity;

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
import static dragon.app.calculator.data.OriginValue.KEY_BACKSPACE;
import static dragon.app.calculator.data.OriginValue.TYPE_BAC;
import static dragon.app.calculator.data.OriginValue.TYPE_CLR;
import static dragon.app.calculator.data.OriginValue.TYPE_NUM;

/**
 * A simple {@link Fragment} subclass.
 */
public class BasicFragment extends Fragment implements View.OnClickListener{
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
    private ArrayList<KeyEntity> listHistoryKey;


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

    public void init(){
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
        switch (view.getId()){
            case R.id.tv_0:
                saveKeys(KEY_0);
                break;
            case R.id.tv_1:
                saveKeys(KEY_1);
                break;
            case R.id.tv_2:
                saveKeys(KEY_2);
                break;
            case R.id.tv_3:
                saveKeys(KEY_3);
                break;
            case R.id.tv_4:
                saveKeys(KEY_4);
                break;
            case R.id.tv_5:
                saveKeys(KEY_5);
                break;
            case R.id.tv_6:
                saveKeys(KEY_6);
                break;
            case R.id.tv_7:
                saveKeys(KEY_7);
                break;
            case R.id.tv_8:
                saveKeys(KEY_8);
                break;
            case R.id.tv_9:
                saveKeys(KEY_9);
                break;
            case R.id.iv_setting:

                break;
            case R.id.iv_backspace:
                saveKeys(KEY_BACKSPACE);
                break;
            case R.id.tv_clear:

                break;
            case R.id.tv_div:

                break;
            case R.id.tv_mul:

                break;
            case R.id.tv_sub:

                break;
            case R.id.tv_add:

                break;
            case R.id.tv_equal:

                break;
            case R.id.tv_percent:

                break;
            case R.id.tv_parenthesis_1:

                break;
            case R.id.tv_parenthesis_2:

                break;
            case R.id.tv_plus_minus:

                break;
            case R.id.tv_comma:

                break;

        }
    }


    public void saveKeys(KeyEntity key){
//        ((MainActivity)getContext()).setKey(key);
        listHistoryKey.add(key);





        if(key.getType().equals(TYPE_NUM)){
            calculation += key.getKeyName();
            iCallBack.setResult(calculation);
            iCallBack.setCalculation(calculation);
        }else if(key.getType().equals(TYPE_BAC)){
            calculation = calculation.substring(0, calculation.length() - 1);
            iCallBack.setResult(calculation);
            iCallBack.setCalculation(calculation);
            Toast.makeText(getContext(), "sdfds", Toast.LENGTH_SHORT).show();
        }else if(key.getType().equals(TYPE_CLR)){

        }

    }
}
