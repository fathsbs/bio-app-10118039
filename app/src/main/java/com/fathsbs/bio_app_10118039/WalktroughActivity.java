package com.fathsbs.bio_app_10118039;

import android.os.Bundle;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.fathsbs.bio_app_10118039.fragments.PageFragment1;
import com.fathsbs.bio_app_10118039.fragments.PageFragment2;
import com.fathsbs.bio_app_10118039.fragments.PageFragment3;

import java.util.ArrayList;
import java.util.List;

public class WalktroughActivity extends AppCompatActivity {
    private ViewPager pager;
    private PagerAdapter pagerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walktrough);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        List<Fragment> list = new ArrayList<>();
        list.add(new PageFragment1());
        list.add(new PageFragment2());
        list.add(new PageFragment3());

        pager = findViewById(R.id.pager);
        pagerAdapter = new SlidePagerAdapater(getSupportFragmentManager(),list);

        pager.setAdapter(pagerAdapter);
    }
}
