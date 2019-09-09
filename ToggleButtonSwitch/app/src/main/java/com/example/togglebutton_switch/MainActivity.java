package com.example.togglebutton_switch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleButton;
    private Switch mswitch1;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton=findViewById(R.id.toggleButton);
        mswitch1=findViewById(R.id.mswitch1);
        button=findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean switchSituation=mswitch1.isChecked();
                boolean toggleSituation=toggleButton.isChecked();

                Toast.makeText(MainActivity.this,"SS: "+switchSituation+ " TS: "+ toggleSituation, Toast.LENGTH_SHORT).show();


            }
        });
    }
}
