package com.jacquan.a14listview_52;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myFriends = (ListView) findViewById(R.id.friendList);

        final ArrayList<String> myfriends = new ArrayList<String>();

        myfriends.add("J.R.");
        myfriends.add("Simon");
        myfriends.add("Mbato");
        myfriends.add("Chip");

        ArrayAdapter<String> friendAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myfriends);

        myFriends.setAdapter(friendAdapter);

        myFriends.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Log.i("Person tapped: ", myfriends.get(i));
                Toast.makeText(getApplicationContext(), myfriends.get(i) + " was tapped", Toast.LENGTH_SHORT  n).show();
            }
        });

    }
}
