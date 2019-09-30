package es.br.senac.helpdesk;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static String usuario = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText viewlogin = (EditText) findViewById(R.id.textlogin);
        final EditText viewsenha = (EditText) findViewById(R.id.textsenha);
        Button botao = (Button) findViewById(R.id.btnlogar);

        final String txtlogin = viewlogin.getText().toString();
        final String txtsenha = viewsenha.getText().toString();


        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usuario = txtlogin;

                if (txtlogin.equals("admin") && txtsenha.equals("senha")) {

                    Toast.makeText(getApplicationContext(), "erro", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent next = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(next);
                }
            }


        });
    }


}
