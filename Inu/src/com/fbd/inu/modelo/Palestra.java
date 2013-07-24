package com.fbd.inu.modelo;

import java.net.URLEncoder;

import org.json.JSONException;
import org.json.JSONStringer;

public class Palestra {

	private long idpalestras;
	private String titulo;
	private String nome_palestrante;
	private String descricao;
	private String data_horario;
	private int areas_academicas_idareas_academicas;
	private int endereco_idendereco;
	private int usuarios_idusuarios;
	private String data_criacao;

	
	



	public String getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(String data_criacao) {
		this.data_criacao = data_criacao;
	}

	public long getIdpalestras() {
		return idpalestras;
	}

	public void setIdpalestras(long idpalestras) {
		this.idpalestras = idpalestras;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = URLEncoder.encode(titulo);
	}

	public String getNome_palestrante() {
		return nome_palestrante;
	}

	public void setNome_palestrante(String nome_palestrante) {
		this.nome_palestrante = URLEncoder.encode(nome_palestrante);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = URLEncoder.encode(descricao);
	}

	public String getData_horario() {
		return data_horario;
	}

	public void setData_horario(String data_horario) {
		this.data_horario = URLEncoder.encode(data_horario);
	}

	public int getAreas_academicas_idareas_academicas() {
		return areas_academicas_idareas_academicas;
	}

	public void setAreas_academicas_idareas_academias(
			int areas_academicas_idareas_academias) {
		this.areas_academicas_idareas_academicas = areas_academicas_idareas_academias;
	}

	public int getEndereco_idendereco() {
		return endereco_idendereco;
	}

	public void setEndereco_idendereco(int endereco_idendereco) {
		this.endereco_idendereco = endereco_idendereco;
	}

	public int getUsuarios_idusuarios() {
		return usuarios_idusuarios;
	}

	public void setUsuarios_idusuarios(int usuarios_idusuarios) {
		this.usuarios_idusuarios = usuarios_idusuarios;
	}

	@Override
	public String toString() {
		return "idpalestras=" + idpalestras + "&titulo=" + titulo
				+ "&nome_palestrante=" + nome_palestrante + "&descricao="
				+ descricao + "&data_horario=" + data_horario
				+ "&areas_academicas_idareas_academicas="
				+ areas_academicas_idareas_academicas + "&endereco_idendereco="
				+ endereco_idendereco + "&usuarios_idusuarios="
				+ usuarios_idusuarios + "&data_criacao=" + data_criacao + "";
	}
	
	

}
