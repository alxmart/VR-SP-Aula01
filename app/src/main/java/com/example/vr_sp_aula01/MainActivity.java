package com.example.vr_sp_aula01;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Desenvolvimento do Button btnKmMT e associação
        //ao Button btnKmMT da Activity (tela)

        Button btnKmMt_prog = (Button) findViewById(R.id.btnKmMt);

        Button btnMtKm_prog = (Button) findViewById(R.id.btnMtKm);

        //Estrutura responsável por verificar o momenta que o
        //botao e pressionado, disparando as ações (códigos)
        //para chamar a tela.

        btnKmMt_prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent informando que estamos na Activity "MainActivity"
                //e vamos para a Activity "Intent"

                Intent intent = new Intent(MainActivity.this, KmM.class);

                //Comando que executa a intenção desenvolvida anteriormente
                startActivity(intent);
            }
        }
        );

        btnMtKm_prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Intent informando que estamos na Activity "MainActivity"
                //e vamos para a Activity "Intent"

                Intent intent = new Intent(MainActivity.this, MKm.class);

                    //Comando que executa a intenção desenvolvida anteriormente
                startActivity(intent);
            }
        }
        );

    }
}
