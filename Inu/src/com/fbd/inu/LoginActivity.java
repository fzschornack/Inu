package com.fbd.inu;

import java.util.concurrent.ExecutionException;

import org.json.JSONException;
import org.json.JSONObject;

import com.fbd.inu.controle.ConexaoServidor;
import com.fbd.inu.modelo.Usuario;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

	public static String idUsuario;
	EditText email;
	EditText senha;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		idUsuario = "-1";
		email = (EditText) findViewById(R.id.editTextEmailLogin);
		senha = (EditText) findViewById(R.id.editTextSenhaLogin);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}
	
	public void cadastrarUsuario(View v) {
		startActivity(new Intent(this, CadastroUsuarioActivity.class));
	}
	
	public void logar(View v) {
		try {
			
			Usuario u = new Usuario();
			u.setEmail(email.getText().toString());
			u.setSenha(senha.getText().toString());
			
			idUsuario = new ConexaoServidor().execute("http://10.0.2.2/inu/login.php?"+u.toString()).get();
			try {
				JSONObject obj = new JSONObject(idUsuario);
				System.out.println("idUsuario = "+obj.getString("idusuarios")+"bla");
				
				idUsuario = obj.getString("idusuarios");
				if(idUsuario.equals("-1"))
					Toast.makeText(this, "Email ou Senha incorretos.", Toast.LENGTH_SHORT).show();
				else
					startActivity(new Intent(this, TelaInicialActivity.class));
				
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
