package com.example.project_saraat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

public class onboarding extends AppCompatActivity {
    
    private ViewPager viewPager;
    private LinearLayout dotLayout;
    private SliderAdapter sliderAdapter;
    private TextView[] dots;
    TextView textView_skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.onboarding);
        textView_skip = findViewById(R.id.txt_skip);

        viewPager = (ViewPager) findViewById(R.id.slide_View_Pager);
        dotLayout = (LinearLayout) findViewById(R.id.dots_layout);

        sliderAdapter = new SliderAdapter (this);
        viewPager.setAdapter(sliderAdapter);

        addDotIndicater(0);

        viewPager.addOnPageChangeListener(viewListener);

        textView_skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                Intent intent = new Intent(onboarding.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    @SuppressLint("ResourceType")
    public void addDotIndicater(int position) {
        dots = new TextView[3];
        dotLayout.removeAllViews();
        for (int i=0; i<dots.length; i++) {
            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226;"));
            dots[i].setTextSize(30);
            dots[i].setTextColor(getResources().getColor(R.color.colorTransparentWhite));

            dotLayout.addView(dots[i]);
        }
        if(dots.length > 0)
        {
            dots[position].setTextColor(getResources().getColor(R.color.colorWhite));
            dots[position].setTextSize(45);
        }
    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int i) {
            addDotIndicater(i);
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}