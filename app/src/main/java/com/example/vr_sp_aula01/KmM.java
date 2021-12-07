package com.example.vr_sp_aula01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KmM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_km_m);

        //Desenvolvimento dos componentes da programação
        //e interligação dos componentes da Tela

        final EditText edtKm_prog = (EditText) findViewById(R.id.edtKM);
        final EditText edtM_prog = (EditText) findViewById(R.id.edtM);
        Button btnConverter_prog = (Button) findViewById(R.id.btnConverter);

        //Ação de click do botão

        btnConverter_prog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Declaração de variáveis
                float km, m;

                //Leitura e atribuição do valor de Km.
                //Observação: O valor vem como "String" do "PlainText",
                //e vamos converter em número através do
                //"Float.parseFloat".

                km = Float.parseFloat(edtKm_prog.getText().toString());

                //Calculo para converter "Km" em "Metro"

                m = km * 1000;

                //Conversão de número para "String", para mostrar o resultado na Tela

                edtM_prog.setText(String.valueOf(m));
            }
        });
    }
}
