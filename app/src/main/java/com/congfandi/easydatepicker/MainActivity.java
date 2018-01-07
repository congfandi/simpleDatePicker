package com.congfandi.easydatepicker;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.Toast;

import com.congfandi.simpledatepicker.Picker;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Picker().show(getSupportFragmentManager(),null);

    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
        Toast.makeText(this, "year : "+year +" | month : "+(month+1), Toast.LENGTH_SHORT).show();
    }
}
