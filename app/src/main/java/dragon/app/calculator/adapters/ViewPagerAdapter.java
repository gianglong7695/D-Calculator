package dragon.app.calculator.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import dragon.app.calculator.fragments.AdvanceFragment;
import dragon.app.calculator.fragments.BasicFragment;
import dragon.app.calculator.fragments.HistoryFragment;

/**
 * Created by giang on 11/9/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HistoryFragment();
        } else if (position == 1) {
            return new BasicFragment();
        } else if (position == 2) {
            return new AdvanceFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
