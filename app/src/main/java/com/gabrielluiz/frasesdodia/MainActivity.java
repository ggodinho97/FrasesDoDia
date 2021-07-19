package com.gabrielluiz.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String [] frases = {
                "Eu te amo muito.",
                "Que o seu dia seja abençoado por Deus.",
                "Se você não existisse, eu te inventaria.",
                "É, eu não paro de pensar em você.",
                "E tem como não sorrir quando me lembro de você?",
                "Me disseram: pense em algo que te faz muito feliz, e eu imaginei você.",
                "Obrigado por me fazer a pessoa mais feliz desse mundo.",
                "Não existe um dia se quer em que eu não acorde pensando em você."

        };
        int numero = new Random().nextInt(8);

        TextView texto = findViewById(R.id.textResultado);
        texto.setText( frases [numero]);

    }

}
