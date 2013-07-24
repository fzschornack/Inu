package com.fbd.inu;

import org.json.JSONException;

import com.fbd.inu.controle.ConexaoServidor;
import com.fbd.inu.modelo.Endereco;
import com.fbd.inu.modelo.Palestra;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class CadastroEnderecoActivity extends Activity {
	
	EditText endereco;
	EditText numero;
	EditText complemento;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastro_endereco);
		
		endereco = (EditText) findViewById(R.id.editTextEndereco);
		numero = (EditText) findViewById(R.id.editTextNumero);
		complemento = (EditText) findViewById(R.id.editTextComplemento);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cadastro_endereco, menu);
		return true;
	}
	
	public void cadastrar(View v) throws JSONException {
		Endereco u = new Endereco();
		u.setEndereco(endereco.getText().toString());
		u.setNumero(numero.getText().toString());
		u.setComplemento(complemento.getText().toString());
		
		new ConexaoServidor().execute("http://10.0.2.2/inu/cadastro_endereco.php?"+u.toString());
		
	}

}
