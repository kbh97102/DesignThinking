package com.example.designthinkingprototype;


import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class StudentNoodleWindow extends AppCompatActivity {

    private ArrayList<FoodInfo> arrayList;
    private LinearLayoutManager linearLayoutManager;
    private MainAdapter mainAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_noodle_window);



        arrayList = new ArrayList<>();
        mainAdapter = new MainAdapter(arrayList);
        setArrayList();
        recyclerView = (RecyclerView)findViewById(R.id.rv);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);


        recyclerView.setAdapter(mainAdapter);

    }

    public void setArrayList(){

        try{
            FoodInfo foodInfo = new FoodInfo(R.drawable.noodle_icon, "국수", "3500원");
            arrayList.add(foodInfo);
            foodInfo = new FoodInfo(R.drawable.rice_icon, "국수", "3500원");
            arrayList.add(foodInfo);
            foodInfo = new FoodInfo(R.drawable.noodle_icon, "국수", "3500원");
            arrayList.add(foodInfo);
            foodInfo = new FoodInfo(R.drawable.rice_icon, "국수", "3500원");
            arrayList.add(foodInfo);
            foodInfo = new FoodInfo(R.drawable.noodle_icon, "국수", "3500원");
            arrayList.add(foodInfo);
            foodInfo = new FoodInfo(R.drawable.rice_icon, "국수", "3500원");
            arrayList.add(foodInfo);
            foodInfo = new FoodInfo(R.drawable.noodle_icon, "국수", "3500원");
            arrayList.add(foodInfo);
            foodInfo = new FoodInfo(R.drawable.rice_icon, "국수", "3500원");
            arrayList.add(foodInfo);
            foodInfo = new FoodInfo(R.drawable.noodle_icon, "국수", "3500원");
            arrayList.add(foodInfo);
            foodInfo = new FoodInfo(R.drawable.rice_icon, "국수", "3500원");
            arrayList.add(foodInfo);

            mainAdapter.notifyDataSetChanged();
        }
        catch (NullPointerException e1){
            e1.printStackTrace();
        }

    }

}


