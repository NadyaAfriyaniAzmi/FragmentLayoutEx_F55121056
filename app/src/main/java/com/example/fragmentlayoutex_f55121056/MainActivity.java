package com.example.fragmentlayoutex_f55121056;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout_id);
        appBarLayout = (AppBarLayout)  findViewById(R.id.appBar_id);
        viewPager = (ViewPager) findViewById(R.id.Viewpage_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter((getSupportFragmentManager()));
        adapter.AddFragment(new FragmentHome(), "home");
        adapter.AddFragment(new FragmentExplore(), "explore");
        adapter.AddFragment(new FragmentAccount(), "account");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}