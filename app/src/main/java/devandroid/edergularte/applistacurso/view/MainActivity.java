package devandroid.edergularte.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.edergularte.applistacurso.R;
import devandroid.edergularte.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;
    String dadosPessoa;
    String dadosOutraPessoa;
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

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Rizney");
        outraPessoa.setSobreNome("Lima");
        outraPessoa.setCursoDesejado("Social Media");
        outraPessoa.setTelefoneContato("62-986053975");

        dadosPessoa = "Primeiro Nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += " Curso Desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " Telefone Contato ";
        dadosPessoa += pessoa.getTelefoneContato();

        dadosOutraPessoa = "Primeiro Nome: ";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += " Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobreNome();
        dadosOutraPessoa += " Curso Desejado: ";
        dadosOutraPessoa += outraPessoa.getCursoDesejado();
        dadosOutraPessoa += " Telefone Contato ";
        dadosOutraPessoa += outraPessoa.getTelefoneContato();

        int parada = 0;
    }
}