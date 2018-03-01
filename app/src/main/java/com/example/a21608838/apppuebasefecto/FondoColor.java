package com.example.a21608838.apppuebasefecto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by 21608838 on 02/02/2018.
 */

public class FondoColor extends AppCompatActivity {

    ImageView imagen;
    RelativeLayout rl2;

   protected void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       setContentView(R.layout.fondocolor_main);

       rl2= findViewById(R.id.rl2);

       imagen = findViewById(R.id.iv2);
       Animation alpha1 = AnimationUtils.loadAnimation(this, R.anim.opacidad);
       rl2.startAnimation(alpha1);


   }

    public void onClick(View v ){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void onClick1(View v ){
        Intent intent = new Intent(this,EfectosLocos.class);
        startActivity(intent);
    }
}