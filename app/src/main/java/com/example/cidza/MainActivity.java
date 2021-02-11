package com.example.cidza;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    Adapter adapter;
    final List<Model> mList = new ArrayList<>();
    ImageView position1, position2, position3;
    TextView nextBtn;
    int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        position1 = findViewById(R.id.positionBtn1);
        position2 = findViewById(R.id.positionBtn2);
        position3 = findViewById(R.id.positionBtn3);
        nextBtn = findViewById(R.id.nextBtn);
        mList.add(new Model(R.mipmap.page1));
        mList.add(new Model(R.mipmap.page2));
        mList.add(new Model(R.mipmap.page3));
        adapter = new Adapter(mList, this);
        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(final int position, float positionOffset, int positionOffsetPixels) {

                if (position == 0) {
                    position1.setImageResource(R.mipmap.whitebtn);
                    position2.setImageResource(R.mipmap.greybtn);
                    position3.setImageResource(R.mipmap.greybtn);
                    nextBtn.setText("NEXT");

                }
                if (position == 1) {
                    position1.setImageResource(R.mipmap.greybtn);
                    position2.setImageResource(R.mipmap.whitebtn);
                    position3.setImageResource(R.mipmap.greybtn);
                    nextBtn.setText("NEXT");

                }
                if (position == 2) {
                    position1.setImageResource(R.mipmap.greybtn);
                    position2.setImageResource(R.mipmap.greybtn);
                    position3.setImageResource(R.mipmap.whitebtn);
                    nextBtn.setText("FINISH");
                }

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position = viewPager.getCurrentItem();
                if (position < mList.size()) {
                    position++;
                    viewPager.setCurrentItem(position);
                }
                if (position == mList.size()) {
                    startAct();
                }
            }
        });

    }

    private void startAct() {
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
    }

}