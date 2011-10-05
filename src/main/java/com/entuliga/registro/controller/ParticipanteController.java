package com.entuliga.registro.controller;

import java.util.Map;
import java.util.TreeMap;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.entuliga.factory.BeanFactory;
import com.entuliga.registro.facade.ParticipanteFacade;
import com.entuliga.registro.form.ParticipanteForm;
import com.entuliga.util.Constantes;

@Controller
public class ParticipanteController {
	
	private static final Logger logger = Logger.getLogger(ParticipanteController.class);
	private static final String REGISTRO_PARTICIPANTE_VIEW = "registroParticipante";
	private Map<String, Object> jsonMap;
	private ParticipanteFacade participanteFacade;

	@RequestMapping("/registroParticipante.htm")
	public ModelAndView registroParticipante(){
		logger.info("Inicia View Registro Participante");
		ParticipanteForm participanteForm = new ParticipanteForm();
		participanteFacade = (ParticipanteFacade) BeanFactory.getBean(Constantes.PARTICIPANTE_FACADE);
		
		logger.info("Termina View Registro Participante");
		return new ModelAndView(REGISTRO_PARTICIPANTE_VIEW, "command",participanteForm);
	}
	
	@RequestMapping(value= "/registroNuevoUsuario", method = RequestMethod.POST)
	public ModelAndView registroNuevoParticipante(@ModelAttribute("participante") ParticipanteForm participanteForm, BindingResult result){
		logger.info("inicia controler participante");
		Map<String , Object> jsonMap = new TreeMap<String, Object>();
		participanteFacade = (ParticipanteFacade) BeanFactory.getBean(Constantes.PARTICIPANTE_FACADE);
		jsonMap = participanteFacade.guardaParticipante(participanteForm.getParticipanteVo());
		logger.info("fonaliza controller participante");
		return new ModelAndView(Constantes.JSON_VIEW, jsonMap);
	}
		
}