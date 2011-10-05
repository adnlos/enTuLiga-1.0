package com.entuliga.registro.dao;

import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.entuliga.factory.BeanFactory;
import com.entuliga.registro.dto.ParticipanteDto;

public class ParticipanteDaoTest {
	private static final Logger logger = Logger.getLogger(ParticipanteDaoTest.class);

	@Test
	public void testInsertParticipante() {
		logger.debug("begin");
		try {
			ParticipanteDao participanteDao = (ParticipanteDao) BeanFactory.getBean("ParticipanteDao");
			ParticipanteDto participanteDto = new ParticipanteDto();
			participanteDto.setNombreP("David");
			participanteDto.setApellidoPaternoP("Godinez");
			participanteDto.setApellidoMaternoP("SepaSu");
			participanteDto.setIdGeneroP(1);
			participanteDto.setEstadoP("1");
			participanteDto.setMailP("kidd_dac@hotmail.com");
			participanteDto.setFechaNacimientoP(new Date());
			participanteDto.setUsuarioP("kidd");
			participanteDto.setPasswordP("123456789");
			Boolean insert = participanteDao.insertParticipante(participanteDto);
			logger.debug("Finaliza el test de insertcion >>" + insert);
		} catch (Exception e) {
			e.printStackTrace();
		}
		logger.debug("Finalize");
	}

}
