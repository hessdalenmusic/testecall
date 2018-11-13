package com.example.tecinfo.simulator_call;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.tecinfo.simulator_call.MainActivity.mypreference;

public class CadrastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadrastro);

        meuDados = getSharedPreferences(mypreference, Context.MODE_PRIVATE);

        EditText nome = findViewById(R.id.ent_nomecad);
        final EditText novoEmail = findViewById(R.id.ent_emailcad);
        final EditText senha = findViewById(R.id.ent_senhacad);
        EditText confimarsenha = findViewById(R.id.ent_senhacad2);
        Button cadastrar = findViewById(R.id.bt_cad_cadastrar);



        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if (ent_senhacad.get().toString().equals(ent_senhacad2.getText().toString())){

                        SharedPreferences.Editor editor = meuDados.edit();

                    } else {
                        Toast.makeText(getApplicationContext(),
                                "as senhas não conferem", Toast.LENGTH_LONG);
                    }
            }
        });
    }
}
