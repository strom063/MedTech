package com.medtech.medtech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView poison,shock,stroke,fractures,allergies,heartattack,electrickshock,burns,drowning,bleeding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        poison = (CardView) findViewById(R.id.poison);
        shock = (CardView) findViewById(R.id.shock);
        stroke = (CardView) findViewById(R.id.stroke);
        fractures = (CardView) findViewById(R.id.fractures);
        allergies = (CardView) findViewById(R.id.allergies);
        heartattack = (CardView) findViewById(R.id.heartattack);
        electrickshock = (CardView) findViewById(R.id.electrickshock);
        burns = (CardView) findViewById(R.id.burns);
        drowning = (CardView) findViewById(R.id.drowning);
        bleeding = (CardView) findViewById(R.id.bleeding);

        poison.setOnClickListener(this);
        shock.setOnClickListener(this);
        stroke.setOnClickListener(this);
        fractures.setOnClickListener(this);
        allergies.setOnClickListener(this);
        heartattack.setOnClickListener(this);
        electrickshock.setOnClickListener(this);
        burns.setOnClickListener(this);
        drowning.setOnClickListener(this);
        bleeding.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
        case R.id.poison : i = new Intent(this,Poison.class);startActivity(i); break ;
        case R.id.shock : i = new Intent(this,shock.class);startActivity(i); break ;
        case R.id.stroke : i = new Intent(this,stroke.class);startActivity(i); break;
        case R.id.fractures : i = new Intent(this,fractures.class);startActivity(i); break;
        case R.id.allergies : i = new Intent(this,allergies.class);startActivity(i); break;
        case R.id.heartattack : i = new Intent(this,heartattack.class);startActivity(i); break;
        case R.id.electrickshock : i = new Intent(this,electrickshock.class);startActivity(i); break;
        case R.id.burns : i = new Intent(this,burns.class);startActivity(i); break;
        case R.id.drowning : i = new Intent(this,drowning.class);startActivity(i); break;
        case R.id.bleeding : i = new Intent(this,bleeding.class);startActivity(i); break;
        default:break;
        }

    }
}
