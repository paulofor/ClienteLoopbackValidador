package br.com.digicom.modelo;

import com.strongloop.android.loopback.Model;

public class NotificacaoApp extends Model{

	private String tokenNotificacao;
	private String resultadoEnvio;
	private String tipoEnvio;
	private String titulo;
	private String corpo;
	private String cor;
	private String badge;
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
	

}
