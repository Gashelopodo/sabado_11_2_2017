package com.gashe.myappfont;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface tf = Typeface.createFromAsset(getAssets(), "MaterialIcons-Regular.ttf");
        TextView txt = (TextView)findViewById(R.id.txt);
        txt.setTypeface(tf);

        txt.setTextColor(Color.BLUE);
        txt.setText(R.string.boton3d);

    }
}
