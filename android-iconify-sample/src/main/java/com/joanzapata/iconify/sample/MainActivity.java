package com.joanzapata.iconify.sample;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    Toolbar toolbar;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tabs);
        toolbar = findViewById(R.id.toolbar);
        viewPager = findViewById(R.id.viewPager);

        // Setup toolbar
        setSupportActionBar(toolbar);

        // Fill view pager
        viewPager.setAdapter(new FontIconsViewPagerAdapter(Font.values()));
        tabLayout.setupWithViewPager(viewPager);
    }
}
