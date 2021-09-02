package com.example.musicshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    int quantity =0;
    Spinner spinner;
    ArrayList spinnerArraylist;
    ArrayAdapter spinnerAdapter;

    HashMap goodsMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        spinnerArraylist = new ArrayList();

        spinnerArraylist.add("guitar");
        spinnerArraylist.add("drums");
        spinnerArraylist.add("keyboard");
        spinnerArraylist.add("notes");

        spinnerAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, spinnerArraylist);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerAdapter);

        goodsMap = new HashMap();
        goodsMap.put("guitar", 500);
        goodsMap.put("drums", 1500);
        goodsMap.put("keyboard", 1000);
        goodsMap.put("notes", 700);



           }

    public void increaseQuantity(View view) {
        quantity = quantity + 1;
        TextView quantityTextView = findViewById(R.id.quantityTextView);
        quantityTextView.setText("" + quantity);
    }

    public void decreaseQuantity(View view) {
        quantity = quantity - 1;
        if (quantity < 0) {
            quantity = 0;
        }
        TextView quantityTextView = findViewById(R.id.quantityTextView);
        quantityTextView.setText("" + quantity);

    }
}