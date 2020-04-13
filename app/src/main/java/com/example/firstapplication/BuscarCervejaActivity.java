package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class BuscarCervejaActivity extends AppCompatActivity {

    Spinner cervejas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tx1 = (TextView) findViewById(R.id.tv_nomes);
        final ExpertCerveja ec = new ExpertCerveja();

        cervejas = (Spinner) findViewById(R.id.cb_nomes);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.Cervejas, android.R.layout.simple_spinner_item);
        cervejas.setAdapter(adapter);

        Button encontrar = (Button) findViewById(R.id.b_encontrar);
        encontrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<String> marcas = ec.getMarcas(cervejas.getSelectedItem().toString());

                String src = "";
                for (int i=0; i<marcas.size(); i++){
                   src += "-" + marcas.get(i) + "\n";
                }
                tx1.setText(src);
            }
        });
    }
}
