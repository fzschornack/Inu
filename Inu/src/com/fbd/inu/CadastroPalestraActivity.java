package com.fbd.inu;

import org.json.JSONException;

import com.fbd.inu.controle.ConexaoServidor;
import com.fbd.inu.modelo.Palestra;
import com.fbd.inu.modelo.Usuario;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroPalestraActivity extends Activity {
	
	
	
	
	
	
	
	EditText titulo;
	EditText nomepalestrante;
	EditText descricao;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastro_palestra);
		
		titulo = (EditText) findViewById(R.id.editTextTituloPalestra);
		nomepalestrante = (EditText) findViewById(R.id.editTextNomePalestrante);
		descricao = (EditText) findViewById(R.id.editTextDescricao);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cadastro_palestra, menu);
		return true;
	}
	
	public void cadastrar(View v) throws JSONException {
		Palestra u = new Palestra();
		u.setTitulo(titulo.getText().toString());
		u.setNome_palestrante(nomepalestrante.getText().toString());
		u.setDescricao(descricao.getText().toString());
		
		new ConexaoServidor().execute("http://10.0.2.2/inu/cadastro_palestras.php?"+u.toString());
		
	}

}
