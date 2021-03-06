package com.example.crixonina.tarea11pcrixo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView texto= (TextView) findViewById(R.id.texAnim);
        try {
            Animation animacion = AnimationUtils.loadAnimation(this,R.anim.animaciones);
            texto.startAnimation(animacion);
        }catch (Exception e){

            texto.setText(e.getMessage());

        }
    }
}
