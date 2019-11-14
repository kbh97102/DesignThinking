package com.example.designthinkingprototype;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SelectedFoodMenu extends AppCompatActivity {

    private TextView selected_menu_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selected_food_menu);

        selected_menu_name = (TextView) findViewById(R.id.selected_menu_name);

        Intent intent = getIntent();

        String selected_food_name = intent.getExtras().getString("selected_food_name");
        String selected_food_cost = intent.getExtras().getString("selected_food_cost");
        int selected_food_image = intent.getExtras().getInt("selected_food_image");

        selected_menu_name.setText(selected_food_name);

    }
}
