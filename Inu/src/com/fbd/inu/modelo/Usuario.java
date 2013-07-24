package com.fbd.inu.modelo;

import org.json.JSONException;
import org.json.JSONStringer;

public class Usuario {

	private long idusuarios;
	private String nome;
	private String email;
	private String senha;
	private String linkLattes;
	private String telefone;
	private String celular;
	private String curso;
	private String areaPesquisa;
	private String pesquisaAtual;
	private String grupoPesquisa;
	private String empresaInstituicao;
	private String cargo;
	private String nomeOrientador;
	private String dataNascimento;
	
	public long getIdusuarios() {
		return idusuarios;
	}



	public void setIdusuarios(long idusuarios) {
		this.idusuarios = idusuarios;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}



	public String getLinkLattes() {
		return linkLattes;
	}



	public void setLinkLattes(String linkLattes) {
		this.linkLattes = linkLattes;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public String getCelular() {
		return celular;
	}



	public void setCelular(String celular) {
		this.celular = celular;
	}



	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}



	public String getAreaPesquisa() {
		return areaPesquisa;
	}



	public void setAreaPesquisa(String areaPesquisa) {
		this.areaPesquisa = areaPesquisa;
	}



	public String getPesquisaAtual() {
		return pesquisaAtual;
	}



	public void setPesquisaAtual(String pesquisaAtual) {
		this.pesquisaAtual = pesquisaAtual;
	}



	public String getGrupoPesquisa() {
		return grupoPesquisa;
	}



	public void setGrupoPesquisa(String grupoPesquisa) {
		this.grupoPesquisa = grupoPesquisa;
	}



	public String getEmpresaInstituicao() {
		return empresaInstituicao;
	}



	public void setEmpresaInstituicao(String empresaInstituicao) {
		this.empresaInstituicao = empresaInstituicao;
	}



	public String getCargo() {
		return cargo;
	}



	public void setCargo(String cargo) {
		this.cargo = cargo;
	}



	public String getNomeOrientador() {
		return nomeOrientador;
	}



	public void setNomeOrientador(String nomeOrientador) {
		this.nomeOrientador = nomeOrientador;
	}



	public String getDataNascimento() {
		return dataNascimento;
	}



	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}



	@Override
	public String toString() {
		return "idusuarios=" + idusuarios + "&nome=" + nome
				+ "&email=" + email + "&senha=" + senha + "&linkLattes="
				+ linkLattes + "&telefone=" + telefone + "&celular="
				+ celular + "&curso=" + curso + "&areaPesquisa="
				+ areaPesquisa + "&pesquisaAtual=" + pesquisaAtual
				+ "&grupoPesquisa=" + grupoPesquisa + "&empresaInstituicao="
				+ empresaInstituicao + "&cargo=" + cargo + "&nomeOrientador="
				+ nomeOrientador + "&dataNascimento=" + dataNascimento + "";
	}

}
