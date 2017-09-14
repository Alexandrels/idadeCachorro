package w2.com.br.idadedecachorro;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edEntrada;
    private TextView tvResultado;
    private Button btCalculo;

    //teste git dois arquivos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edEntrada = (EditText) findViewById(R.id.editText);
        tvResultado = (TextView) findViewById(R.id.tv_resultado);
        btCalculo = (Button) findViewById(R.id.bt_descobrir_idade);
        btCalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoDigitado = edEntrada.getText().toString();
                if (textoDigitado.isEmpty()) {

                } else {
                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int resultadoFinal = valorDigitado * 7;

                    limpaCamposEsconeTeclado();
                    tvResultado.setText("Em cachorrês " + textoDigitado + " anos equivalem a " + resultadoFinal + " anos humanos!");
                }
            }
        });

    }

    public void limpaCamposEsconeTeclado() {
        edEntrada.setText("");
        //esconde o teclado
        ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE))
                .hideSoftInputFromWindow(edEntrada.getWindowToken(), 0);
    }
}
