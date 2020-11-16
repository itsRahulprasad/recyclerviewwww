package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv=(RecyclerView)findViewById(R.id.rclview);
        rcv.setLayoutManager(new LinearLayoutManager(this));


        String arr[]={"one","two","three","four","five","six","seven","one","two","three","four","five","six","seven","one","two","three","four","five","six","seven","one","two","three","four","five","six","seven","one","two","three","four","five","six","seven",};
        rcv.setAdapter(new myAdapter(arr));

    }

}