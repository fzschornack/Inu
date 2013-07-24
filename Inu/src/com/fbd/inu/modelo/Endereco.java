package com.fbd.inu.modelo;

import org.json.JSONException;
import org.json.JSONStringer;

public class Endereco {

	private long idendereco;
	private String endereco;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	private String maps;
	public long getIdendereco() {
		return idendereco;
	}
	public void setIdendereco(long idendereco) {
		this.idendereco = idendereco;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getMaps() {
		return maps;
	}
	public void setMaps(String maps) {
		this.maps = maps;
	}
	@Override
	public String toString() {
		return "idendereco=" + idendereco + "&endereco=" + endereco
				+ "&numero=" + numero + "&complemento=" + complemento
				+ "&bairro=" + bairro + "&cidade=" + cidade + "&estado="
				+ estado + "&pais=" + pais + "&maps=" + maps + "";
	}

	
	


	
	

}
