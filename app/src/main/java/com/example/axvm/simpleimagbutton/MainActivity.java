package com.example.axvm.simpleimagbutton;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import static com.example.axvm.simpleimagbutton.R.color.colorsend;


public class MainActivity extends AppCompatActivity {

    private ImageButton send;
    private ImageButton closet;
    private TextView text;
    private boolean llamando =  false;
    private View vista ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        send = (ImageButton)findViewById(R.id.send);
        text = (TextView)findViewById(R.id.text);
        closet = (ImageButton)findViewById(R.id.b2);


    }


    @SuppressLint("ResourceAsColor")
    public void llamar(View vista){
        if (!llamando) {
            text.setText("Llamando");
            //getWindow().getDecorView().setBackgroundColor(Color.GRAY);
            send.setVisibility(vista.GONE);
            closet.setVisibility(vista.VISIBLE);
            llamando= true;
        }else{
            text.setText("stop call");
            //send.setBackgroundColor(Color.GREEN);
            closet.setVisibility(vista.GONE);
            send.setVisibility(vista.VISIBLE);
            llamando= false;
            defecto();
        }

    }

    private boolean defecto(){
        //SystemClock.sleep(1000);
        getWindow().getDecorView().setBackgroundColor(Color.WHITE);

        return true;
    }
}
