package dragon.app.calculator.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import dragon.app.calculator.R;
import dragon.app.calculator.interfaces.ICallBack;

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


        return v;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_0:

                break;
            case R.id.tv_1:

                break;
            case R.id.tv_2:

                break;
            case R.id.tv_3:

                break;
            case R.id.tv_4:

                break;
            case R.id.tv_5:

                break;
            case R.id.tv_6:

                break;
            case R.id.tv_7:

                break;
            case R.id.tv_8:

                break;
            case R.id.tv_9:

                break;
            case R.id.iv_setting:

                break;
            case R.id.iv_backspace:

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
}
