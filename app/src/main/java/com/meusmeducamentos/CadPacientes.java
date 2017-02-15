package com.meusmeducamentos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.meusmedicamentos.R;

public class CadPacientes extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        Intent it = new Intent(CadPacientes.this, MainActivity.class);
        startActivity(it);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cad_pacientes);

        Button btVOLTAR = (Button)findViewById(R.id.btVOLTAR);
        btVOLTAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(CadPacientes.this, MainActivity.class);
                startActivity(it);
                finish();
            }
        });

        Button btSALVAR = (Button)findViewById(R.id.btSALVAR);
        btSALVAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(CadPacientes.this, MainActivity.class);
                startActivity(it);
                finish();
            }
        });

    }
}
