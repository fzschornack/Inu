package com.fbd.inu;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;

import com.fbd.inu.controle.ConexaoServidor;
import com.fbd.inu.modelo.Usuario;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroUsuarioActivity extends Activity {

	EditText nome;
	EditText email;
	EditText senha;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastro_usuario);
		
		nome = (EditText) findViewById(R.id.editTextNome);
		email = (EditText) findViewById(R.id.editTextEmail);
		senha = (EditText) findViewById(R.id.editTextSenha);
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
		
		Toast.makeText(this, u.getNome()+u.getEmail()+u.getSenha()+"127.0.0.1/inu/cadastro_usuario.php?"+u.toString(), Toast.LENGTH_LONG).show();		
		
		new ConexaoServidor().execute("http://10.0.2.2/inu/cadastro_usuario.php?"+u.toString());
		
	}

}
