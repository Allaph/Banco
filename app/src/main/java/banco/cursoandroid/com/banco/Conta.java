package banco.cursoandroid.com.banco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Conta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conta);

        final EditText deposito = (EditText) findViewById(R.id.DepositoId);
        final EditText saque = (EditText) findViewById(R.id.SaqueId);
        Button extrato = (Button) findViewById(R.id.ExtratoId);
        final TextView saldo = (TextView) findViewById(R.id.SaldoId);

        extrato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String saqueCliente = saque.getText().toString();
                String depositoCliente = deposito.getText().toString();
                String saldoCliente = saldo.getText().toString();

                float ValorSaqueCliente = Float.parseFloat(saqueCliente);
                float ValorDepositoCliente = Float.parseFloat(depositoCliente);

                float ValorExtratoFinal = ValorDepositoCliente - ValorSaqueCliente;

                saldo.setText("Saldo disponível: " + ValorExtratoFinal +"");


            }
        });



    }
}
