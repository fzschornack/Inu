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
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroUsuarioActivity extends Activity {

	EditText nome;
	EditText email;
	EditText senha;
	EditText confirmarSenha;
	EditText dataNascimento;
	EditText linkLattes;
	EditText telefone;
	EditText celular;
	EditText curso;
	EditText areaPesquisa;
	EditText pesquisaAtual;
	EditText grupoPesquisa;
	EditText nomeOrientador;
	EditText empresaInstituicao;
	EditText cargo;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastro_usuario);
		
		nome = (EditText) findViewById(R.id.editTextNome);
		email = (EditText) findViewById(R.id.editTextEmail);
		senha = (EditText) findViewById(R.id.editTextSenha);
		confirmarSenha = (EditText) findViewById(R.id.editTextConfirmarSenha);
		dataNascimento = (EditText) findViewById(R.id.editTextDataNascimento);
		linkLattes = (EditText) findViewById(R.id.editTextLinkLattes);
		telefone = (EditText) findViewById(R.id.editTextTelefone);
		celular = (EditText) findViewById(R.id.editTextCelular);
		curso = (EditText) findViewById(R.id.editTextCurso);
		areaPesquisa = (EditText) findViewById(R.id.editTextAreaPesquisa);
		pesquisaAtual = (EditText) findViewById(R.id.editTextPesquisaAtual);
		grupoPesquisa = (EditText) findViewById(R.id.editTextGrupoPesquisa);
		nomeOrientador = (EditText) findViewById(R.id.editTextNomeOrientador);
		empresaInstituicao = (EditText) findViewById(R.id.editTextEmpresaInstituicao);
		cargo = (EditText) findViewById(R.id.editTextCargo);
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
		u.setDataNascimento(dataNascimento.getText().toString());
		u.setLinkLattes(linkLattes.getText().toString());
		u.setTelefone(telefone.getText().toString());
		u.setCelular(celular.getText().toString());
		u.setCurso(curso.getText().toString());
		u.setAreaPesquisa(areaPesquisa.getText().toString());
		u.setPesquisaAtual(pesquisaAtual.getText().toString());
		u.setGrupoPesquisa(grupoPesquisa.getText().toString());
		u.setNomeOrientador(nomeOrientador.getText().toString());
		u.setEmpresaInstituicao(empresaInstituicao.getText().toString());
		u.setCargo(cargo.getText().toString());
		
		if(u.getNome().equals("") || u.getEmail().equals("") || u.getSenha().equals(""))
			Toast.makeText(this, "Campos obrigatórios: 'Nome', 'Email' e 'Senha'", Toast.LENGTH_LONG).show();
		else if(!u.getSenha().equals(confirmarSenha.getText().toString()))
			Toast.makeText(this, "Campos 'Senha' e 'Confirmar senha' diferentes", Toast.LENGTH_LONG).show();
		else {
			System.out.println("http://10.0.2.2/inu/cadastro_usuario.php?"+u.toString());
		
			new ConexaoServidor().execute("http://10.0.2.2/inu/cadastro_usuario.php?"+u.toString());
			
			startActivity(new Intent(this, LoginActivity.class));
		
		}
	}

}
