package dragon.app.calculator.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import dragon.app.calculator.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BasicFragment extends Fragment {
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


    public BasicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_basic, container, false);
        ButterKnife.bind(this, v);






        return v;
    }

}
