package devandroid.edergularte.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.edergularte.applistacurso.R;
import devandroid.edergularte.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pessoa = new Pessoa();
        //Atribuir conteúdo, dados, valores para o Objeto
        // Conforme o seu MODELO TEMPLATE
        pessoa.setPrimeiroNome("Eder");
        pessoa.setSobreNome("Gularte");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("62-985618759");
    }
}