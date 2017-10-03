package com.example.farahinlab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView) findViewById(R.id.gridView);

        //instance of ImageAdapter(this));
        gridView.setAdapter(new ImageAdapter(this));

        /**
         * On Click event for Single GridView Item
         */

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
         @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id){

             //sending image id to FullScreenActivity
             Intent i = new Intent(getApplicationContext(),FullImageActivity.class);

             //passing array index
             i.putExtra("id",position);
             startActivity(i);
         }




                                        }





        );
    }
}
