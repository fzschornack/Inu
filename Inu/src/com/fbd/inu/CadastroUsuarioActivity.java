package com.fbd.inu;

import org.json.JSONException;

import com.fbd.inu.controle.ConexaoServidor;
import com.fbd.inu.modelo.Usuario;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class CadastroUsuarioActivity extends Activity {

	EditText nome;
	EditText email;
	EditText senha;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastro_usuario);
		
		nome = (EditText) findViewById(R.id.editTextNome);
		email = (EditText) findViewById(R.id.editTextEmailLogin);
		senha = (EditText) findViewById(R.id.editTextSenhaLogin);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cadastro_usuario, menu);
		return true;
	}
	
	public void cadastrar(View v) throws JSONException {
		Usuario u = new Usuario();
		u.setNome(nome.getText().toString());
		u.setEmail(email.getText().toString());
		u.setSenha(senha.getText().toString());
		
		ConexaoServidor.enviarPost("localhost/cadastro_usuario.php", u.toJSON());
	}

}
