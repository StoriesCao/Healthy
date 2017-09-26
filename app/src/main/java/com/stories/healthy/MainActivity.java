package com.stories.healthy;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.stories.healthy.adapter.MainViewPaperAdapter;
import com.stories.healthy.fragments.Moment;
import com.stories.healthy.fragments.News;

public class MainActivity extends AppCompatActivity {

    private ViewPager mMainViewPager;

    private BottomNavigationView mBottomNavigationView;

    private MenuItem mSelectedBottomMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainViewPager = (ViewPager) findViewById(R.id.main_view_paper);
        FragmentManager fm = getSupportFragmentManager();
        MainViewPaperAdapter  mainViewPaperAdapter = new MainViewPaperAdapter(fm);
        mainViewPaperAdapter.addFragment(new Moment());
        mainViewPaperAdapter.addFragment(new News());
        mMainViewPager.setAdapter(mainViewPaperAdapter);


        mBottomNavigationView = (BottomNavigationView) findViewById(R.id.main_bottom_navigation_view);
        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_view_moment:
                    mMainViewPager.setCurrentItem(0);
                        break;
                    case R.id.navigation_view_news:
                        mMainViewPager.setCurrentItem(1);
                        break;
                    default:
                        return true;
                }
                return true;
            }
        });

        mMainViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                mBottomNavigationView.getMenu().getItem(position).setChecked(true);
               // prevMenuItem =mBottomNavigationView.getMenu().getItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
