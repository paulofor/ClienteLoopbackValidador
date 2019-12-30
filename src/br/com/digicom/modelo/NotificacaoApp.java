package br.com.digicom.modelo;

import java.util.HashMap;
import java.util.Map;

import com.strongloop.android.loopback.Model;

public class NotificacaoApp extends Model{

	private String tokenNotificacao;
	private String resultadoEnvio;
	private String tipoEnvio;
	private String titulo;
	private String corpo;
	private String cor;
	private String badge;
	private String tokenFcm;
	private Integer projetoMySqlId;
	private String erroEnvio;
	
	public Map getMap() {
		Map mapa = new HashMap<String,Object>();
		if (tokenNotificacao!=null) mapa.put("tokenNotificacao", tokenNotificacao);
		if (resultadoEnvio!=null) mapa.put("resultadoEnvio", resultadoEnvio);
		if (tipoEnvio!=null) mapa.put("tipoEnvio", tipoEnvio);
		if (titulo!=null) mapa.put("titulo", titulo);
		if (corpo!=null) mapa.put("corpo", corpo);
		if (cor!=null) mapa.put("cor", cor);
		if (badge!=null) mapa.put("badge", badge);
		if (tokenFcm!=null) mapa.put("tokenFcm", tokenFcm);
		if (projetoMySqlId!=null) mapa.put("projetoMySqlId" , projetoMySqlId);
		if (erroEnvio!=null) mapa.put("erroEnvio", erroEnvio);
		return mapa;
	}
	
	
	
	public String getTokenFcm() {
		return tokenFcm;
	}



	public void setTokenFcm(String tokenFcm) {
		this.tokenFcm = tokenFcm;
	}



	public String getErroEnvio() {
		return erroEnvio;
	}



	public void setErroEnvio(String erroEnvio) {
		this.erroEnvio = erroEnvio;
	}



	public String getTokenNotificacao() {
		return tokenNotificacao;
	}
	public void setTokenNotificacao(String tokenNotificacao) {
		this.tokenNotificacao = tokenNotificacao;
	}
	public String getResultadoEnvio() {
		return resultadoEnvio;
	}
	public void setResultadoEnvio(String resultadoEnvio) {
		this.resultadoEnvio = resultadoEnvio;
	}
	public String getTipoEnvio() {
		return tipoEnvio;
	}
	public void setTipoEnvio(String tipoEnvio) {
		this.tipoEnvio = tipoEnvio;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCorpo() {
		return corpo;
	}
	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getBadge() {
		return badge;
	}
	public void setBadge(String badge) {
		this.badge = badge;
	}

	public Integer getProjetoMySqlId() {
		return projetoMySqlId;
	}

	public void setProjetoMySqlId(Integer projetoMySqlId) {
		this.projetoMySqlId = projetoMySqlId;
	}
	

}
