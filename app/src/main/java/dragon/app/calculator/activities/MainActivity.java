package dragon.app.calculator.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import dragon.app.calculator.R;
import dragon.app.calculator.adapters.ViewPagerAdapter;
import dragon.app.calculator.interfaces.OnSetResult;

import static dragon.app.calculator.utils.Constants.STATUS_BAR_DELAY_HIDE;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener, OnSetResult{
    @BindView(R.id.layout_root)
    View layout_root;
    @BindView(R.id.view_pager)
    ViewPager view_pager;



    private final Handler mHideHandler = new Handler();
    private ViewPagerAdapter mViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        view_pager.setAdapter(mViewPagerAdapter);
        view_pager.setOnPageChangeListener(this);
//        view_pager.setOffscreenPageLimit(3);
        view_pager.setCurrentItem(0);

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
    public void setResult(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
