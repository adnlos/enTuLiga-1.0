<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="cr" uri="http://java.sun.com/jstl/core" %>

<!-- TABLA CONTENEDORA -->
<table cellpadding="0" cellspacing="0" width="900px">
	<tr>
		<td class="app-titulo">
			<spring:message code="registro.titulo"></spring:message>
		</td>
	</tr>
	<tr height="13px"></tr>
	<tr>
		<td align="center">
			<form:form id="form-participante" method="post">
				<!-- FORMULARIO DEL PARTICIPANTE -->
				<spring:nestedPath path="participanteVo">
					<table border="0" align="center" >
						<tr>	
							<td width="150px"><spring:message code="registro.participante.usuario"></spring:message></td>
							<td><form:input path="usuarioP" size="20" maxlength="20" /></td>
						</tr>
						<tr>	
							<td><spring:message code="registro.participante.nombre"></spring:message></td>
							<td colspan="2"><form:input path="nombreP" size="20"/></td>
						</tr>
						<tr>	
							<td><spring:message code="registro.participante.aPaterno"></spring:message></td>
							<td colspan="2"><form:input path="apellidoPaternoP" size="20"/></td>
							
						</tr>
						<tr>	
							<td><spring:message code="registro.participante.aMaterno"></spring:message></td>
							<td colspan="2"><form:input path="apellidoMaternoP" size="20"/></td>
							
						</tr>
						<tr>	
							<td><spring:message code="registro.participante.email"></spring:message></td>
							<td  colspan="2">
								<form:input path="MailP" size="20" />
							</td>
						</tr>
					</table>
				</spring:nestedPath>
			</form:form>
		</td>
	</tr>
	<tr height="13px"></tr>
	<tr>
		<td align="center" >
			<input type="button" value="Guardar" id="btn-guardar" class="ui-button ui-button-text-only ui-widget ui-corner-all">
			<input type="button" value="Cancelar" id="btn-cancelar" class="ui-button ui-button-text-only ui-widget  ui-corner-all">
		</td>
	</tr>
</table>
<script type="text/javascript">	
	jQuery().ready(function(){

		/*Desbloqueamos al cargar el contenido*/
		$.unblockUI();
		
		
		$("#btn-cancelar").click(function(){
			$("#entuliga-container").load("registroParticipante.htm");
		});
		
		$("#btn-guardar").click(function(json){

	
			//Verificamos que todo sea valido y generamos la accion.
			if($("#form-participante").valid()){
				//Bloqueamos la pantalla
				$.blockUI({ message: null });
				//generamos un mensaje de proceso  
				actionnotify = $.pnotify({
								pnotify_title:'Procesando Intervalo',
								pnotify_text:'Espere un momento se esta procesando el nuevo intervalo',
								pnotify_notice_icon:'ui-icon ui-icon-info',
								pnotify_hide: false,
								pnotify_closer: false,
								pnotify_after_open:function(notice){
									//Obtenemos los datos del form para enviarlos al controller
									var form = $("#form-participante").serialize();

									
									$.post("registroNuevoUsuario.htm?"+form,function(json){
										//si el proceso fue correcto se genera una notificacion 
										//indicando que se ha guardado el perfil correctamente
										if(json.insert == "true"){
											notice.pnotify({
												pnotify_title:json.alerta.titulo,
												pnotify_text:json.alerta.descripcion,
												pnotify_notice_icon:json.alerta.icono,
												pnotify_hide: true,
												pnotify_closer: true});
												$("#entuliga-container").load("registroParticipante.htm");
										}else{
											//En caso de fallar la notificacion se transforma en un error
											//Notificando la cuasa del fallo.
											actionnotify.pnotify({
												pnotify_title:json.alerta.titulo,
												pnotify_text:json.alerta.descripcion,
												pnotify_notice_icon:json.alerta.icono,
												pnotify_hide: true,
												pnotify_closer: true,
												pnotify_type:'error'});
												$.unblockUI();
										}
									});
								}
				});
			}
			return false;
		});

		
		
		
	});
</script>