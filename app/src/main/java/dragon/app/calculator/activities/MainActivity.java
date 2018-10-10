package dragon.app.calculator.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.Layout;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import butterknife.BindView;
import butterknife.ButterKnife;
import dragon.app.calculator.R;
import dragon.app.calculator.adapters.ViewPagerAdapter;
import dragon.app.calculator.interfaces.ICallBack;

import static dragon.app.calculator.utils.Constants.STATUS_BAR_DELAY_HIDE;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener, ICallBack {
    @BindView(R.id.layout_root)
    View layout_root;
    @BindView(R.id.view_pager)
    ViewPager view_pager;
    @BindView(R.id.tv_result)
    TextView tv_result;
    @BindView(R.id.tv_calculation)
    TextView tv_calculation;


    private final Handler mHideHandler = new Handler();
    private ViewPagerAdapter mViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initData();

//        Utils.MathSetText("<body>x<sub>2</sub></body>", tv_calculation);


    }


    public void initData() {
        mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        view_pager.setAdapter(mViewPagerAdapter);
        view_pager.addOnPageChangeListener(this);
        view_pager.setOffscreenPageLimit(3);
        view_pager.setCurrentItem(1);
    }


    private void hide() {
        // Hide UI first
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        // Schedule a runnable to remove the status and navigation bar after a delay
        mHideHandler.postDelayed(mHidePart2Runnable, STATUS_BAR_DELAY_HIDE);
    }

    private final Runnable mHidePart2Runnable = new Runnable() {
        @SuppressLint("InlinedApi")
        @Override
        public void run() {
            layout_root.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE
                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        }
    };


    @Override
    protected void onResume() {
        super.onResume();
        hide();
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void setResult(String text, int resType) {
        switch (resType) {
            case R.string.type_num:
                tv_result.setText(text);
                break;
            case R.string.type_bac:
                tv_result.setText(text);
                break;
            case R.string.type_com:
                tv_result.setText(text);
            case R.string.type_cle:
                if (!tv_result.getText().equals("0")) {
                    tv_result.setText("0");
                    YoYo.with(Techniques.BounceInUp)
                            .duration(500)
                            .repeat(0)
                            .playOn(tv_result);
                } else {
                    tv_result.setText("0");
                    YoYo.with(Techniques.Shake)
                            .duration(500)
                            .repeat(0)
                            .playOn(tv_result);
                }

                break;
            case R.string.type_res:
                if(text.length() > 0){
                    tv_result.setText(text);
                    YoYo.with(Techniques.BounceInUp)
                            .duration(500)
                            .repeat(0)
                            .playOn(tv_result);
                }else{
                    tv_result.setText("0");
                    YoYo.with(Techniques.Shake)
                            .duration(500)
                            .repeat(0)
                            .playOn(tv_result);
                }
                break;


        }




    }

    @Override
    public void setCalculation(String text, int resType) {
        switch (resType) {
            case R.string.type_num:
                tv_calculation.setText(text);
                break;
            case R.string.type_bac:
                tv_calculation.setText(text);
                break;
            case R.string.type_com:
                tv_calculation.setText(text);
                break;
            case R.string.type_cle:
                if (!tv_calculation.getText().equals("0")) {
                    tv_calculation.setText("0");
                    YoYo.with(Techniques.BounceInUp)
                            .duration(500)
                            .repeat(0)
                            .playOn(tv_calculation);
                } else {
                    tv_calculation.setText("0");
                    YoYo.with(Techniques.Shake)
                            .duration(500)
                            .repeat(0)
                            .playOn(tv_calculation);

                }
                break;

            case R.string.type_cal:
                tv_calculation.setText(text);
                break;
            case R.string.type_res:
                if(text.length() > 0){
                    tv_calculation.setText(text);
                    YoYo.with(Techniques.BounceInUp)
                            .duration(500)
                            .repeat(0)
                            .playOn(tv_calculation);
                }else{
                    tv_calculation.setText("0");
                    YoYo.with(Techniques.Shake)
                            .duration(500)
                            .repeat(0)
                            .playOn(tv_calculation);
                }


                break;
            case R.string.type_min:
                tv_calculation.setText(text);
                break;

        }

    }
}
