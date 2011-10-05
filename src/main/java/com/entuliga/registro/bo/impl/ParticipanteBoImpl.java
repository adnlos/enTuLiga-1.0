package com.entuliga.registro.bo.impl;

import org.apache.log4j.Logger;

import com.entuliga.registro.bo.ParticipanteBo;
import com.entuliga.registro.dao.ParticipanteDao;
import com.entuliga.registro.dto.ParticipanteDto;

public class ParticipanteBoImpl implements ParticipanteBo{
	
	private static final Logger logger = Logger.getLogger(ParticipanteBoImpl.class);
	private ParticipanteDao participanteDao;
	
	
	public Boolean insertParticipante(ParticipanteDto participanteDto)
			throws Exception {
		logger.debug("Inicia Bo InserParticipante");
		Boolean res = true;
		if (participanteDto ==null) {
			throw new Exception("El participante es nulo",
					new NullPointerException("El participante no debe de ser nulo"));
		}
		try {
			res = participanteDao.insertParticipante(participanteDto);
		} catch (Exception e) {
			logger.error(e);
			res = false;
		}
		logger.debug("Finaliza Bo InserParticipante");
		return res;
	}


	public ParticipanteDao getParticipanteDao() {
		return participanteDao;
	}


	public void setParticipanteDao(ParticipanteDao participanteDao) {
		this.participanteDao = participanteDao;
	}

}
