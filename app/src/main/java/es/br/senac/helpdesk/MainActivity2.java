package es.br.senac.helpdesk;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import br.senac.es.trabalhoreferencia.model.Mensagem;
import br.senac.es.trabalhoreferencia.model.Status;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ArrayList<Mensagem> mensagens = new ArrayList<Mensagem>();
        mensagens.add(new Mensagem(1L , "reparo de pc" , Status.ENVIADA ) );
        mensagens.add(new Mensagem(2L , "chatuba" , Status.NAOENVIADA ) );
        mensagens.add(new Mensagem(3L , "aloo" , Status.ENVIADA ) );
        mensagens.add(new Mensagem(4L , "mensagem 5" , Status.ENVIADA ) );
        mensagens.add(new Mensagem(5L , "reparo de peça" , Status.NAOENVIADA) );
        mensagens.add(new Mensagem(6L , "jkdhsf" , Status.ENVIADA ) );











        /*TextView text = (TextView) findViewById(R.id.textView);
        String texto = MainActivity.usuario;
       /String retorno = getIntent().getExtras().getString("teste");
        text.setText(texto);
        */

    }
}



