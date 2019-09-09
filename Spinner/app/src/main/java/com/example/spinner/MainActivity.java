package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private ArrayList<String> brands=new ArrayList<>();
    private ArrayAdapter<String> dataAdaptor;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner);
        button=findViewById(R.id.button);

        brands.add("Nike");
        brands.add("Adidas");
        brands.add("Hummel");
        brands.add("Zara");
        brands.add("Puma");

        dataAdaptor=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,android.R.id.text1,brands);

        spinner.setAdapter(dataAdaptor);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data=spinner.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(),"Selected Brand: "+data,Toast.LENGTH_SHORT).show();
            }
        });


    }
}
