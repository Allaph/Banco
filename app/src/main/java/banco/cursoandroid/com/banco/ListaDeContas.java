package banco.cursoandroid.com.banco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ListaDeContas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_contas);

        final Intent intent = getIntent();
        if (intent != null){
            final Bundle params = intent.getExtras();
            if (params != null){
                String nome = params.getString("nome");
                String agencia = params.getString("agencia");
                final String conta = params.getString("conta");

                TextView dadosCliente = (TextView) findViewById(R.id.DadosClienteId);
                TextView dadosAgencia = (TextView) findViewById(R.id.DadosAgenciaId);
                TextView dadosConta = (TextView) findViewById(R.id.DadosContaId);
                Button acessarConta = (Button) findViewById(R.id.AcessarContaId);

                dadosCliente.setText("Cliente: "+nome);
                dadosAgencia.setText("Agencia: "+agencia);
                dadosConta.setText("Conta: "+conta);

                acessarConta.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                    startActivity(new Intent(ListaDeContas.this, Conta.class));
                    }
                });
            }
        }
    }
}
