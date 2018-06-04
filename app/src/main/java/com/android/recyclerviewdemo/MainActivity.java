package com.android.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private MyMainAdapter mAdapter;
    private RecyclerView mMotivationalList;
    private static final int NUM_LIST_ITEMS = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMotivationalList = (RecyclerView) findViewById(R.id.rv_myrecycle);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        mMotivationalList.setLayoutManager(layoutManager);
        mMotivationalList.setHasFixedSize(true);

        mAdapter = new MyMainAdapter(NUM_LIST_ITEMS);
        mMotivationalList.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        mMotivationalList.setAdapter(mAdapter);
    }
}
