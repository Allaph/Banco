package banco.cursoandroid.com.banco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int CONSTANTE_LISTA_CONTAS = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviarDadosListaDeContatos(View view){
        EditText nome = (EditText) findViewById(R.id.ClienteId);
        EditText agencia = (EditText) findViewById(R.id.AgenciaId);
        EditText conta = (EditText) findViewById(R.id.ContaId);

        Bundle params = new Bundle();
        params.putString("nome", nome.getText().toString());
        params.putString("agencia", agencia.getText().toString());
        params.putString("conta", conta.getText().toString());

        Intent intent = new Intent(this, ListaDeContas.class);
        intent.putExtras(params);

        startActivityForResult(intent, CONSTANTE_LISTA_CONTAS);

    }

}
