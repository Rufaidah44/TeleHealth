package com.example.telehealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyApintments extends AppCompatActivity {

    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_apintments);

        listView =(ListView)findViewById(R.id.listview);

        final ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("د. خالد الماجد || 26-04-2020");
        arrayList.add("د. خالد الماجد || 21-04-2020");
        arrayList.add("د. خالد الماجد || 20-04-2020");


        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int count = 0;
                    Intent mySuperIntent = new Intent( MyApintments.this, ApointmentDetails.class);
                    startActivity(mySuperIntent);
            }
        });


    }
}
