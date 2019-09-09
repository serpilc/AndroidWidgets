package com.example.button_edittext_textview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView1;
    private EditText editText1;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1=findViewById(R.id.textView1);
        editText1=findViewById(R.id.editText1);
        button1=findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data=editText1.getText().toString();

                //for non-empty data
                if (!TextUtils.isEmpty(data)){

                    if (data.length()>10){
                        textView1.setText("Data should not be greater than 10");
                    }else{
                        textView1.setText(data);
                    }
                    
                }else {
                    textView1.setText("-Nothing-");
                }



                //for edittext is blank
                // after send data
                editText1.setText("");

                //edittext-inputtype should be number


            }
        });
    }
}
