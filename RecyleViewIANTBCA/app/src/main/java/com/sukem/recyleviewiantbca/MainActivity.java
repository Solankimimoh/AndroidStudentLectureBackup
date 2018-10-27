package com.sukem.recyleviewiantbca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView personRecyclerView;
    private ArrayList<PersonModel> personModelArrayList;
    private MyCustomAdapter myCustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setupData();

        myCustomAdapter = new MyCustomAdapter(personModelArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        personRecyclerView.setLayoutManager(layoutManager);
        personRecyclerView.setAdapter(myCustomAdapter);


    }

    private void setupData() {
        personModelArrayList.add(new PersonModel("Yash", "yash@gmail.com"));
        personModelArrayList.add(new PersonModel("Police", "police@gmail.com"));
        personModelArrayList.add(new PersonModel("Swati", "swati@gmail.com"));
        personModelArrayList.add(new PersonModel("Jheel", "jheel@gmail.com"));
        personModelArrayList.add(new PersonModel("Police", "police@gmail.com"));
        personModelArrayList.add(new PersonModel("Rahul", "rahul@gmail.com"));
        personModelArrayList.add(new PersonModel("Niyati", "niyati@gmail.com"));
        personModelArrayList.add(new PersonModel("Police", "police@gmail.com"));
        personModelArrayList.add(new PersonModel("Parisha", "parisha@gmail.com"));
        personModelArrayList.add(new PersonModel("Police", "police@gmail.com"));
        personModelArrayList.add(new PersonModel("Police", "police@gmail.com"));
        personModelArrayList.add(new PersonModel("Mansi", "mansi@gmail.com"));
    }

    private void initView() {

        personRecyclerView = findViewById(R.id.person_recycleview);
        personModelArrayList = new ArrayList<>();
    }
}
