package com.example.a21608838.apppuebasefecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen = findViewById(R.id.iv1);
        Animation alpha1 = AnimationUtils.loadAnimation(this, R.anim.opacidad);
        imagen.startAnimation(alpha1);

    }
    public void onClick(View v ){
        Intent intent = new Intent(this,FondoColor.class);
        startActivity(intent);
    }


}
