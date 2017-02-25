package com.yumingqin.walkphilly;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

/**
 * Created by eherzog on 2/25/2017.
 */

public class ShareActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        final Button facebook = (Button) findViewById(R.id.button2);
        facebook.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //open Facebook app
                Intent intent = new Intent("android.intent.category.LAUNCHER");
                intent.setClassName("com.facebook", "com.facebook.FacebookActivity");
                startActivity(intent);
            }
        });

        final Button instagram = (Button) findViewById(R.id.button3);
        instagram.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //open Facebook app
                Intent intent = new Intent("android.intent.category.LAUNCHER");
                intent.setClassName("com.instagram", "com.instagram.android");
                startActivity(intent);
            }
        });

        final Button twitter = (Button) findViewById(R.id.button4);
        twitter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //open Facebook app
                Intent intent = new Intent("android.intent.category.LAUNCHER");
                intent.setClassName("com.twitter.android", "com.twitter");
                startActivity(intent);
            }
        });


        final Button continueTour = (Button) findViewById(R.id.button5);
        continueTour.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                goBack();
            }
        });

        final Button cancel = (Button) findViewById(R.id.button6);
        cancel.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                goBack();
            }

        });

    }

    private void goBack(){

        Intent i = new Intent(this, MapsActivity.class);
        startActivity(i);

    }


}


