package com.example.tecinfo.simulator_call;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        final Button bt1 = findViewById(R.id.bt_1);
        final Button bt2 = findViewById(R.id.bt_2);
        final Button bt3 = findViewById(R.id.bt_3);
        final Button bt4 = findViewById(R.id.bt_4);
        final Button bt5 = findViewById(R.id.bt_5);
        final Button bt6 = findViewById(R.id.bt_6);
        final Button bt7 = findViewById(R.id.bt_7);
        final Button bt8 = findViewById(R.id.bt_8);
        final Button bt9 = findViewById(R.id.bt_9);
        final Button bt0 = findViewById(R.id.bt_0);
        final Button bta = findViewById(R.id.bt_aster);
        final Button bth = findViewById(R.id.bt_hash);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CallActivity.this,CallActivity.class);
                startActivity(intent);
                finish();
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CallActivity.this,CallActivity.class);
                startActivity(intent);
                finish();
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CallActivity.this,CallActivity.class);
                startActivity(intent);
                finish();
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CallActivity.this,CallActivity.class);
                startActivity(intent);
                finish();
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CallActivity.this,CallActivity.class);
                startActivity(intent);
                finish();
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CallActivity.this,CallActivity.class);
                startActivity(intent);
                finish();
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CallActivity.this,CallActivity.class);
                startActivity(intent);
                finish();
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CallActivity.this,CallActivity.class);
                startActivity(intent);
                finish();
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CallActivity.this,CallActivity.class);
                startActivity(intent);
                finish();
            }
        });

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CallActivity.this,CallActivity.class);
                startActivity(intent);
                finish();
            }
        });

        bta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CallActivity.this,CallActivity.class);
                startActivity(intent);
                finish();
            }
        });

        bth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CallActivity.this,CallActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
