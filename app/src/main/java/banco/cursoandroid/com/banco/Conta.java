package banco.cursoandroid.com.banco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Conta extends AppCompatActivity {

    private EditText deposito;
    private EditText saque;
    private Button extrato;
    private EditText saldo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conta);

        deposito = (EditText) findViewById(R.id.ValorDepositoId);
        saque = (EditText) findViewById(R.id.SaqueId);
        extrato = (Button) findViewById(R.id.ExtratoId);
        saldo = (EditText) findViewById(R.id.SaldoId);


        int valorDeposito = Integer.parseInt(String.valueOf(deposito));
        int valorSaque = Integer.parseInt(String.valueOf(saque));
        int valorFinal = valorDeposito - valorSaque;

        saldo.setText("Saldo disponível: " + valorFinal + ",00" );

    }
}
