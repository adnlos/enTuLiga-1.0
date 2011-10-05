package com.entuliga.registro.dao.impl;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.entuliga.registro.dao.ParticipanteDao;
import com.entuliga.registro.dto.ParticipanteDto;
import com.entuliga.registro.helper.ParticipanteQueryHelper;

public class ParticipanteDaoImpl extends NamedParameterJdbcDaoSupport implements ParticipanteDao {
	
	private static final Logger logger = Logger.getLogger(ParticipanteDaoImpl.class);
	private ParticipanteQueryHelper queryHelper;

	public ParticipanteQueryHelper getQueryHelper() {
		return queryHelper;
	}

	public void setQueryHelper(ParticipanteQueryHelper queryHelper) {
		this.queryHelper = queryHelper;
	}

	
	public Boolean insertParticipante(ParticipanteDto participanteDto)
			throws Exception {
		logger.debug("Inicia");
		Boolean insert = true;
		try {
			List<Integer> key = getJdbcTemplate().queryForList("SELECT ID_PARTICIPANTE FROM TBL_PARTICIPANTE ORDER BY ID_PARTICIPANTE DESC ", Integer.class);
			Integer lastKey  = key.get(0);
			logger.debug("Id del participante >> " + lastKey);
			Integer idParticipante = lastKey + 1;
			participanteDto.setIdParticipante(idParticipante);
			participanteDto.setFechaNacimientoP(new Date());
			participanteDto.setPasswordP("hola como ratas");
			participanteDto.setIdGeneroP(2);
			SqlParameterSource parameterSource = new BeanPropertySqlParameterSource(participanteDto);
			String query = queryHelper.getSqlQuery(ParticipanteQueryHelper.INSERT_PARTICIPANTE);
			Integer result = getNamedParameterJdbcTemplate().update(query, parameterSource);
			
			if (result>1) {
				insert=Boolean.TRUE;
			}
			logger.info("Booleano: " + insert);
			logger.debug("Finaliza");
		} catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
		}
		
		return insert;
	}
}
