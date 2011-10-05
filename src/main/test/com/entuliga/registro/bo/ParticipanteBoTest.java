package com.entuliga.registro.bo;

import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.entuliga.factory.BeanFactory;
import com.entuliga.registro.dto.ParticipanteDto;
import com.entuliga.util.Constantes;

public class ParticipanteBoTest {
	public static final Logger logger  = Logger.getLogger(ParticipanteBoTest.class);
	
	@Test
	public void testInsertParticipante() {
		logger.info("Inicia ParticipanteBoTest");
		try {
			ParticipanteBo participanteBo =(ParticipanteBo) BeanFactory.getBean(Constantes.PARTICIPANTE_BO);
			ParticipanteDto participanteDto = new ParticipanteDto();
			participanteDto.setNombreP("betorcido");
			participanteDto.setApellidoPaternoP("Godinez");
			participanteDto.setApellidoMaternoP("SepaSu");
			participanteDto.setIdGeneroP(1);
			participanteDto.setEstadoP("1");
			participanteDto.setMailP("kidd_dac@hotmail.com");
			participanteDto.setFechaNacimientoP(new Date());
			participanteDto.setUsuarioP("kidd");
			participanteDto.setPasswordP("123456789");
			Boolean result =participanteBo.insertParticipante(participanteDto);
			logger.info("Result >> " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		logger.info("Inicia ParticipanteBoTest");
	}

}
