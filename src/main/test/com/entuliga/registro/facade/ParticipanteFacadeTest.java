package com.entuliga.registro.facade;

import java.util.Date;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.entuliga.factory.BeanFactory;
import com.entuliga.registro.vo.ParticipanteVo;
import com.entuliga.util.Constantes;

public class ParticipanteFacadeTest {
	private static final Logger logger = Logger.getLogger(ParticipanteFacadeTest.class);
	@Test
	public void testGuardaParticipante() {
		logger.info("Inicia ParticipanteFacadeTest");
		try {
			ParticipanteFacade participanteFacade = (ParticipanteFacade) BeanFactory.getBean(Constantes.PARTICIPANTE_FACADE);
			ParticipanteVo participanteVo = new ParticipanteVo();
			participanteVo.setNombreP("betorcido");
			participanteVo.setApellidoPaternoP("betorcido");
			participanteVo.setApellidoMaternoP("betocido");
			participanteVo.setIdGeneroP(1);
			participanteVo.setEstadoP("1");
			participanteVo.setMailP("kidd_dac@hotmail.com");
			participanteVo.setFechaNacimientoP(new Date());
			participanteVo.setUsuarioP("kidd");
			participanteVo.setPasswordP("123456789");
			Map<String, Object> result = participanteFacade.guardaParticipante(participanteVo);
			logger.info("Result >> " + result.containsKey("jsonSeries"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		logger.info("Inicia ParticipanteFacadeTest");
	}

}
