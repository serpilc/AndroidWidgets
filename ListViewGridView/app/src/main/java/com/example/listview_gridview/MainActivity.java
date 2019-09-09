package com.example.listview_gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayList <String> brands=new ArrayList<>();
    private ArrayAdapter<String> dataAdaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);
        brands.add("Zara");
        brands.add("Nike");
        brands.add("Adidas");
        brands.add("Lacoste");
        brands.add("Beymen");
        brands.add("Puma");
        brands.add("Hummel");
        brands.add("Twist");

        //default listView
        dataAdaptor=new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,android.R.id.text1,brands);


        listView.setAdapter(dataAdaptor);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                brands.get(i);
                Toast.makeText(getApplicationContext(),"Brands: "+brands.get(i),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
//for gridView -> change activity_main GridView instead of ListView and android:numColumns ->2 or 3 etc.