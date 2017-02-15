package com.meusmeducamentos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.meusmedicamentos.R;

public class MainActivity extends AppCompatActivity {

    private long backPressedTime = 0;

    @Override
    public void onBackPressed() {
        long t = System.currentTimeMillis();
        if (t - backPressedTime > 2000) {
            backPressedTime = t;
            Toast.makeText(this, "Pressione novamente para sair",
                    Toast.LENGTH_SHORT).show();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btPACIENTE = (Button)findViewById(R.id.btPACIENTES);
        btPACIENTE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, CadPacientes.class);
                startActivity(it);
                finish();
            }
        });

        Button btMEDICAMENTOS = (Button)findViewById(R.id.btMEDICAMENTOS);
        btMEDICAMENTOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, CadMedicamentos.class);
                startActivity(it);
                finish();
            }
        });

        Button btHISTORICO = (Button)findViewById(R.id.btHISTORICO);
        btHISTORICO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Historico.class);
                startActivity(it);
                finish();
            }
        });
    }
}
