package com.fbd.inu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class TelaInicialActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela_inicial);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela_inicial, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
	    switch (item.getItemId()) {
	        case R.id.tela_inicial_menu_notificacoes:
	            return true;
	        case R.id.tela_inicial_menu_calendario:
	        	return true;
	        case R.id.tela_inicial_menu_buscar_palestra:
	        	startActivity(new Intent(this, BuscaPalestraActivity.class));
	        	return true;
	        case R.id.tela_inicial_menu_cadastrar_palestra:
	        	startActivity(new Intent(this, CadastroPalestraActivity.class));
	        	return true;
	        case R.id.tela_inicial_menu_buscar_usuarios:
	        	startActivity(new Intent(this, BuscaUsuarioActivity.class));
	        	return true;
	        case R.id.perfil_visualizar:
	        	startActivity(new Intent(this, VisualizaUsuarioActivity.class));
	        	return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}

}
