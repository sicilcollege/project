package com.example.sicillyasjs.latprak;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Toast;

import java.util.ArrayList;

public class GridViewImageTextActivity extends AppCompatActivity {
    Button showPopupBtn, closePopupBtn;
    PopupWindow popupWindow;
    LinearLayout linearLayout1;
    GridView androidGridView;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;


    String[] gridViewString = {
            "A", "B", "C", "D", "E", "F","G",

    } ;
    int[] gridViewImageId = {
            R.drawable.andro, R.drawable.andro, R.drawable.andro, R.drawable.andro, R.drawable.andro, R.drawable.andro,R.drawable.andro,
    };
    int[] gridViewButton = {
            1000,2000,3000,4000,5000,6000,7000,
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview_image_text_example);
        showPopupBtn = (Button) findViewById(R.id.keranjang);

        CustomGridViewActivity adapterViewAndroid = new CustomGridViewActivity(GridViewImageTextActivity.this, gridViewString, gridViewImageId, gridViewButton);
        androidGridView = (GridView) findViewById(R.id.grid_view_image_text);
        androidGridView.setAdapter(adapterViewAndroid);

//        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view,
//                                    int i, long id) {
//                Toast.makeText(GridViewImageTextActivity.this, "GridView Item: " + gridViewString[+i], Toast.LENGTH_LONG).show();
//            }
//        });
//        pilihBtn = (Button) findViewById(R.id.pilih);
//        pilihBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (pilihBtn.isPressed()){
//                    Toast.makeText(GridViewImageTextActivity.this, "You are doing this in the right order!", Toast.LENGTH_LONG).show();
//                }
//            }
//        });

        showPopupBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(GridViewImageTextActivity.this,Pop.class));
            }
        });

    }

}
