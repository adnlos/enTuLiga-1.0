package com.entuliga.registro.form;

import com.entuliga.registro.vo.ParticipanteVo;

public class ParticipanteForm {
	
	private ParticipanteVo participanteVo;
	
	public ParticipanteForm(){
		super();
		this.participanteVo = new ParticipanteVo();
	}

	public ParticipanteVo getParticipanteVo() {
		return participanteVo;
	}

	public void setParticipanteVo(ParticipanteVo participanteVo) {
		this.participanteVo = participanteVo;
	}
	

}
