package com.example.cidza;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class Adapter extends PagerAdapter implements View.OnClickListener {
    private final List<Model> models;
    private final Context context;

    public Adapter(List<Model> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @Override
    public void onClick(View v) {
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals((View) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.story, container, false);
        ImageView image = view.findViewById(R.id.imageMainActivity);
        image.setImageResource(models.get(position).getImage());
        container.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
