package com.example.project_saraat;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    public int[] slide_images = {
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
    };

    public int[] slide_headings = {
            R.drawable.text_1,
            R.drawable.text_1,
            R.drawable.text_1,
    };

    public int[] slide_descs = {
            R.drawable.text_1,
            R.drawable.text_1,
            R.drawable.text_1,
    };


    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull  View view, Object object) {
        return view == (RelativeLayout) object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.imageView);
        ImageView slideHeading = (ImageView) view.findViewById(R.id.txt_heading);
        ImageView slideDescription = (ImageView) view.findViewById(R.id.txt_description);


        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setImageResource(slide_headings[position]);
        slideDescription.setImageResource(slide_descs[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }
}
