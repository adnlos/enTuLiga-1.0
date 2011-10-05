package com.entuliga.vo;

public class MensajeAlertaVo {
	
	private String icono;
	private String titulo;
	private String descripcion;
	
	public MensajeAlertaVo(){
		super();
	}
	
	public MensajeAlertaVo(String icono, String titulo, String descripcion){
		super();
		this.icono = icono;
		this.titulo = titulo;
		this.descripcion = descripcion;
	}
	
	public String getIcono() {
		return icono;
	}
	public void setIcono(String icono) {
		this.icono = icono;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
