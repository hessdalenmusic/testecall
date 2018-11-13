package com.example.tecinfo.simulator_call;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    public static final String mypreference = "call";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        meuDados = getSharedPreferences(mypreference, Context.MODE_PRIVATE);

        final Button login = findViewById(R.id.bt_login);
        final Button registrar = findViewById(R.id.bt_registrar);
        EditText email = findViewById(R.id.ent_email_log);
        EditText senha = findViewById(R.id.ent_senha_log)


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CallActivity.class);
                startActivity(intent);

            }
        });

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CadrastroActivity.class);
                startActivity(intent);
            }
        });
    }
}
