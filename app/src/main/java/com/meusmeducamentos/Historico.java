package com.meusmeducamentos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.meusmedicamentos.R;

public class Historico extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        Intent it = new Intent(Historico.this, MainActivity.class);
        startActivity(it);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.historico);

        Button btVOLTAR = (Button)findViewById(R.id.btVOLTAR);
        btVOLTAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Historico.this, MainActivity.class);
                startActivity(it);
                finish();
            }
        });

    }
}
