package com.example.hhhhentai.ulife;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import main_fragment.fragment.Fragment_show;
import main_fragment.fragment.MyAdapter;
import main_fragment.fragment.item_fragment;
//TODO 赵效慷and江守鑫---
public class main_part extends AppCompatActivity implements View.OnClickListener {

    private FragmentManager manager = getSupportFragmentManager();
    private FragmentTransaction ft;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_part);
        init();
    }

    //初始化
    private void init() {
        findViewById(R.id.btn_show).setOnClickListener(this);
        findViewById(R.id.btn_upload).setOnClickListener(this);
        findViewById(R.id.btn_life_tools).setOnClickListener(this);
        findViewById(R.id.btn_user).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        x.view().inject(this);

         manager = getSupportFragmentManager();
         ft = manager.beginTransaction();

        //主界面展示
        Fragment_show item_fragment= new Fragment_show();
         ft.add(R.id.content,item_fragment);
         ft.commit();

    }
}
