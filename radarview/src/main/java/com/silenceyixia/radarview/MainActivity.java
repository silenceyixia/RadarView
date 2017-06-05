package com.silenceyixia.radarview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.silenceyixia.radarview.bean.ElementBean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private List<ElementBean> mElementBeanList = new ArrayList<>();
    private RadarView mRadarView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);
        init();
        mRadarView.initData(mElementBeanList);
    }

    private void init() {
        mRadarView = (RadarView) findViewById(R.id.radarview);
        mElementBeanList.add(new ElementBean("参团", 50));
        mElementBeanList.add(new ElementBean("输出", 60));
        mElementBeanList.add(new ElementBean("生存", 40));
        mElementBeanList.add(new ElementBean("推塔", 90));
        mElementBeanList.add(new ElementBean("打野", 80));
        mElementBeanList.add(new ElementBean("打野", 40));
        mElementBeanList.add(new ElementBean("助攻", 70));
        mElementBeanList.add(new ElementBean("打野", 50));

    }
}
