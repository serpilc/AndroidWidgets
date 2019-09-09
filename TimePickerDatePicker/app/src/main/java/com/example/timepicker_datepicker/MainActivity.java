package com.example.timepicker_datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private EditText editTextHour,editTextDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextHour=findViewById(R.id.editTextHour);
        editTextDate=findViewById(R.id.editTextDate);

        editTextHour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar c=Calendar.getInstance();
                int hour=c.get(Calendar.HOUR_OF_DAY);
                int min=c.get(Calendar.MINUTE);

                //current activity
                TimePickerDialog timePickerDialog=new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {

                        editTextHour.setText(i+":"+i1);

                    }
                },hour,min,true);

                timePickerDialog.setTitle("Select Hour");
                timePickerDialog.setButton(TimePickerDialog.BUTTON_POSITIVE,"Set",timePickerDialog);
                timePickerDialog.setButton(TimePickerDialog.BUTTON_NEGATIVE,"Cancel",timePickerDialog);
                timePickerDialog.show();
            }
        });


        editTextDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar c=Calendar.getInstance();
                int year=c.get(Calendar.YEAR);
                int month=c.get(Calendar.MONTH);
                int day=c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        editTextDate.setText(i2+"/"+(i1+1)+"/"+i);
                    }
                },year,month,day);

                datePickerDialog.setTitle("Select Date");
                datePickerDialog.setButton(DatePickerDialog.BUTTON_POSITIVE,"Set",datePickerDialog);
                datePickerDialog.setButton(DatePickerDialog.BUTTON_NEGATIVE,"Cancel",datePickerDialog);
                datePickerDialog.show();
            }
        });
    }
}
