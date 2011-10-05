package com.entuliga.registro.vo;

import java.util.Date;

public class ParticipanteVo {
	private Integer idParticipante;
	private String nombreP;
	private String apellidoPaternoP;
	private String apellidoMaternoP;
	private Date fechaNacimientoP;
	private Integer idGeneroP;
	private String MailP;
	private String estadoP;
	private String usuarioP;
	private String passwordP;
	
	public Integer getIdParticipante() {
		return idParticipante;
	}
	public void setIdParticipante(Integer idParticipante) {
		this.idParticipante = idParticipante;
	}
	public String getNombreP() {
		return nombreP;
	}
	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}
	public String getApellidoPaternoP() {
		return apellidoPaternoP;
	}
	public void setApellidoPaternoP(String apellidoPaternoP) {
		this.apellidoPaternoP = apellidoPaternoP;
	}
	public String getApellidoMaternoP() {
		return apellidoMaternoP;
	}
	public void setApellidoMaternoP(String apellidoMaternoP) {
		this.apellidoMaternoP = apellidoMaternoP;
	}
	public Date getFechaNacimientoP() {
		return fechaNacimientoP;
	}
	public void setFechaNacimientoP(Date fechaNacimientoP) {
		this.fechaNacimientoP = fechaNacimientoP;
	}
	public Integer getIdGeneroP() {
		return idGeneroP;
	}
	public void setIdGeneroP(Integer idGeneroP) {
		this.idGeneroP = idGeneroP;
	}
	public String getMailP() {
		return MailP;
	}
	public void setMailP(String mailP) {
		MailP = mailP;
	}
	public String getEstadoP() {
		return estadoP;
	}
	public void setEstadoP(String estadoP) {
		this.estadoP = estadoP;
	}
	public String getUsuarioP() {
		return usuarioP;
	}
	public void setUsuarioP(String usuarioP) {
		this.usuarioP = usuarioP;
	}
	public String getPasswordP() {
		return passwordP;
	}
	public void setPasswordP(String passwordP) {
		this.passwordP = passwordP;
	}
}
