package com.example.a21608838.apppuebasefecto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CalendarView;

/**
 * Created by 21608838 on 02/02/2018.
 */

public class EfectosLocos extends AppCompatActivity {

    CalendarView calendar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.efectoslocos);

        calendar = findViewById(R.id.cw1);
        Animation rotation = AnimationUtils.loadAnimation(this, R.anim.rotaciones);
        calendar.startAnimation(rotation);

    }


    public void onClickF(View v ){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
