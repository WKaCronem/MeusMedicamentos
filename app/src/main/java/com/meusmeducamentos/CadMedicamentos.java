package com.meusmeducamentos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.meusmedicamentos.R;

public class CadMedicamentos extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        Intent it = new Intent(CadMedicamentos.this, MainActivity.class);
        startActivity(it);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cad_medicamentos);

        Button btVOLTAR = (Button)findViewById(R.id.btVOLTAR);
        btVOLTAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(CadMedicamentos.this, MainActivity.class);
                startActivity(it);
                finish();
            }
        });

        Button btSALVAR = (Button)findViewById(R.id.btSALVAR);
        btSALVAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(CadMedicamentos.this, MainActivity.class);
                startActivity(it);
                finish();
            }
        });

        Spinner spinner = (Spinner) findViewById(R.id.spINTERVALOS);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spINTERVALOS, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }
}
