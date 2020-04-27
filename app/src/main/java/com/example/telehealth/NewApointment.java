package com.example.telehealth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class NewApointment extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_apointment);
        final ArrayList<String> arrayList =new ArrayList<>();

        DatePicker simpleDatePicker = (DatePicker)findViewById(R.id.simpleDatePicker); // initiate a date picker
        simpleDatePicker.setSpinnersShown(true); // set false value for the spinner shown function

        int day = simpleDatePicker.getDayOfMonth(); // get the selected day of the month
        int month = simpleDatePicker.getMonth(); // get the selected month
        int year = simpleDatePicker.getYear(); // get the selected year
        int firstDay=simpleDatePicker.getFirstDayOfWeek(); // get the first day of the week


        Spinner mySpinner = (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(NewApointment.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                int count = 0;
                if (i == 1) {
                    count = i;
                } else if (i == 2) {
                    count = i;
                }else if (i == 3) {
                    count = i;
                }else if (i == 4) {
                    count = i;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }


    public void book(View view) {
        Toast.makeText(getApplicationContext(),"تم حجز الموعد",Toast.LENGTH_SHORT).show();
    }
}
