package com.example.marvel_cars;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class emp_customerlist extends AppCompatActivity {
   private RecyclerView  empcustlist;
   private int[] cus={1,2,3,4,5,6,7,8,9};
   private emp_customerlist_adapter adapter;
   private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emp_customerlist);
        empcustlist =findViewById(R.id.empcustlist);
        layoutManager=new GridLayoutManager(this,1);
        empcustlist.setHasFixedSize(true);
        empcustlist.setLayoutManager(layoutManager);
        adapter=new emp_customerlist_adapter(cus);
        empcustlist.setAdapter(adapter);

    }

}
