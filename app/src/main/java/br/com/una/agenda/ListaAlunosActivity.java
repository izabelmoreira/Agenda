package br.com.una.agenda;

import android.content.Intent;
import android.support.v4.widget.ListViewAutoScrollHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);

        String[] alunos = {"Izabel" , "Paulo", "Michele", "Matheus" , "Michael" , "Kelly" , "Omar", "Alexandre"};
        ListView listaAlunos = (ListView) findViewById(R.id.lista_alunos);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alunos);
        listaAlunos.setAdapter(adapter);

        Button novo_aluno = (Button) findViewById(R.id.novo_aluno);
        novo_aluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vaiproformulario = new Intent(ListaAlunosActivity.this, FormularioActivity.class);
                startActivity(vaiproformulario);
            }
        });
    }
}
