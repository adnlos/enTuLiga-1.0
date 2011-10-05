package com.entuliga.registro.facade;

import java.util.Map;
import java.util.TreeMap;

import org.apache.log4j.Logger;

import com.entuliga.registro.bo.ParticipanteBo;
import com.entuliga.registro.dto.ParticipanteDto;
import com.entuliga.registro.vo.ParticipanteVo;
import com.entuliga.util.Constantes;
import com.entuliga.util.ResourceMessages;
import com.entuliga.vo.MensajeAlertaVo;



public class ParticipanteFacade {
	
	private static final Logger logger = Logger.getLogger(ParticipanteFacade.class);
	private ParticipanteBo participanteBo;
	
	private static final String INFO_GUARDA_TITULO = ResourceMessages.getResources("info.guarda.participante");
	private static final String INFO_DESCRIPCION = ResourceMessages.getResources("info.guarda.desc");
	private static final String ALERT_TITULO = ResourceMessages.getResources("alert.titulo");
	private static final String ALERT_DESCRIPCION = ResourceMessages.getResources("alert.guarda.error");
	
	public Map<String,Object> guardaParticipante(ParticipanteVo participanteVo){
		logger.debug("Inicia Facade InsertParticipante");
		Map<String, Object> jsonSeries = new TreeMap<String, Object>();
		Boolean insert = Boolean.FALSE;
		//El objeto Vo se guardara en el Objeto Dto
		
		try {
			ParticipanteDto participanteDto = new ParticipanteDto();
			participanteDto.setNombreP(participanteVo.getNombreP());
			participanteDto.setApellidoPaternoP(participanteVo.getApellidoPaternoP());
			participanteDto.setApellidoMaternoP(participanteVo.getApellidoMaternoP());
			participanteDto.setFechaNacimientoP(participanteVo.getFechaNacimientoP());
			participanteDto.setIdGeneroP(participanteVo.getIdGeneroP());
			participanteDto.setEstadoP("1");
			participanteDto.setMailP(participanteVo.getMailP());
			participanteDto.setUsuarioP(participanteVo.getUsuarioP());
			participanteDto.setPasswordP(participanteVo.getPasswordP());
			insert = participanteBo.insertParticipante(participanteDto);
			logger.debug("Fin de insertar el Usuario");
			if (insert) {
				MensajeAlertaVo notificacionVo = new MensajeAlertaVo(Constantes.ICON_CHECK, INFO_GUARDA_TITULO , INFO_DESCRIPCION.replace("???", participanteDto.getNombreP()));
				jsonSeries.put(Constantes.NOTIFY_INFO, notificacionVo);
				logger.info("El participante se ha guardado correctamente");
			}else{
				MensajeAlertaVo alertaVo = new MensajeAlertaVo(Constantes.ICON_ERROR, ALERT_TITULO, ALERT_DESCRIPCION );
				jsonSeries.put(Constantes.NOTIFY_ERROR, alertaVo);
			}
		} catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
		}
		jsonSeries.put("insert", insert);
		logger.debug("Termina Facade InsertParticipante");	
		return jsonSeries;
	}
	
	
	
	
	public ParticipanteBo getParticipanteBo() {
		return participanteBo;
	}
	public void setParticipanteBo(ParticipanteBo participanteBo) {
		this.participanteBo = participanteBo;
	}

}
