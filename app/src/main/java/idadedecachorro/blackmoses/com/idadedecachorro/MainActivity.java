package idadedecachorro.blackmoses.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText caixadetexto;
    private Button botaodescobriridade;
    private TextView resultadoidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixadetexto = (EditText) findViewById(R.id.caixaTextoId);
        botaodescobriridade = (Button) findViewById(R.id.botaoDescobrirIdadeId);
        resultadoidade = (TextView) findViewById(R.id.resultadoIdadeId);

        botaodescobriridade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //recuperar o que foi digitado
              String textoDigitado = caixadetexto.getText().toString(); //caixadetexto.getText() pega oq foi digitado .toString converte para string. essa string eh armazenada na variavel textoDigitado

                if(textoDigitado.isEmpty()){
                    //String vazia , mensagem de erro
                    resultadoidade.setText("Digite a idade do cachorro, na caixa de texto acima.");
                }else{
                    int valorDigitado = Integer.parseInt(textoDigitado); //converte textoDigitado para inteiro
                    int ValorResultadofinal = valorDigitado * 7;
                    resultadoidade.setText("A idade do cachorro em anos humanos é: " + ValorResultadofinal + " anos");
                }
            }
        });
    }
}
