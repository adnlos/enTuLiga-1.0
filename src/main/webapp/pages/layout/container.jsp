<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" /></title>
</head>
<!-- ICONOS -->

<!-- HOJAS CSS -->
<link rel="stylesheet" href="css/general.css" type="text/css">

<link rel="stylesheet" href="jquery/jquery-ui-1.8.16.custom/css/cupertino/jquery-ui-1.8.16.custom.css" 
type="text/css">


<!-- JQUERY PLUGINS-->
<script type="text/javascript"
	src="jquery/jquery-ui-1.8.16.custom/js/jquery-1.6.2.min.js"></script>
<script type="text/javascript"
	src="jquery/jquery-ui-1.8.16.custom/js/jquery-ui-1.8.16.custom.min.js"></script>
<script type="text/javascript" 
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.effects.blind.js"></script>
<script type="text/javascript" 
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.effects.bounce.js"></script>
<script type="text/javascript" 
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.effects.clip.js"></script>
<script type="text/javascript" 
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.effects.core.js"></script>
<script type="text/javascript" 
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.effects.drop.js"></script>
<script type="text/javascript" 
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.effects.explode.js"></script>
<script type="text/javascript" 
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.effects.fade.js"></script>
<script type="text/javascript" 
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.effects.fold.js"></script>
<script type="text/javascript" 
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.effects.highlight.js"></script>
<script type="text/javascript" 
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.effects.pulsate.js"></script>
<script type="text/javascript" 
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.effects.scale.js"></script>
<script type="text/javascript" 
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.effects.shake.js"></script>
<script type="text/javascript" 
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.effects.slide.js"></script>
<script type="text/javascript" 
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.effects.transfer.js"></script>
<script type="text/javascript" 
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.ui.accordion.js"></script>
<script type="text/javascript"
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.ui.autocomplete.js"></script>
<script type="text/javascript"
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.ui.button.js"></script>
<script type="text/javascript"
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.ui.core.js"></script>
<script type="text/javascript"
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.ui.datepicker.js"></script>
<script type="text/javascript"
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.ui.dialog.js"></script>
<script type="text/javascript"
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.ui.draggable.js"></script>
<script type="text/javascript"
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.ui.droppable.js"></script>
<script type="text/javascript"
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.ui.mouse.js"></script>
<script type="text/javascript"
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.ui.position.js"></script>
<script type="text/javascript"
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.ui.progressbar.js"></script>
<script type="text/javascript"
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.ui.resizable.js"></script>
<script type="text/javascript"
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.ui.selectable.js"></script>
<script type="text/javascript"
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.ui.slider.js"></script>
<script type="text/javascript"
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.ui.sortable.js"></script>
<script type="text/javascript"
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.ui.tabs.js"></script>
<script type="text/javascript"
	src="jquery/jquery-ui-1.8.16.custom/development-bundle/ui/jquery.ui.widget.js"></script>

<!-- Pnotify -->
<link rel="stylesheet" href="jquery/pnotify/jquery.pnotify.default.css" 
	type="text/css">
<link rel="stylesheet" href="jquery/pnotify/jquery.pnotify.default.icons.css" 
	type="text/css">
<script type="text/javascript"
	src="jquery/pnotify/jquery.pnotify.min.js"></script>

<!-- Corner -->
<script type="text/javascript"
	src="jquery/corner/jquery.corner.js"></script>

<!-- Json -->	
<script type="text/javascript"
	src="jquery/json/jquery.json-2.2.js"></script>

<!-- Xml -->
<script type="text/javascript"
	src="jquery/xml/xml2json.js"></script>
	
<!-- Validation -->
<script type="text/javascript"
	src="jquery/validation/jquery.validate.js"></script>

<!-- Blokc ui -->
<script type="text/javascript"
	src="jquery/blockui/jquery.blockUI.js"></script>
	
<link rel="stylesheet" type="text/css" media="screen"
	 href="http://jquery.malsup.com/block/block.css?v3">
<!--<link rel="stylesheet" href="jquery/blockui/block.css" -->
<!--type="text/css">-->

<script type="text/javascript">
	var nuevonotify;
	var edicionnotify;
	var consultanotify;
	var busquedanotify;
	var actionnotify;

	function upperCase(elemento){
		var upperText = $(elemento).val().toUpperCase();
		$(elemento).val(upperText);
	}

	jQuery().ready(function(){
		$("#main-table-content").corner("bottom");
	});
	</script>
 
<body>
<!-- Contenendor principal este debe mantener la plantilla centrada -->
<div id ="entuliga-container">
	<table cellpadding="0" cellspacing="0" width="100%">
	<tr>
			<td align="center">
				<table cellpadding="0" cellspacing="0" width="1200" height="680px" id="main-table-content">
					<tr valign="top" height="100px">
						<td class="ui-widget app-background"><tiles:insertAttribute name="header" /></td>
					</tr>
					<tr valign="top">
						<td align="left" class="app-background">
							<table class="content">
								<tr class="content_resize">
									<td id="tilesBody" width="900px">
										<tiles:insertAttribute name="body"/>
									</td>
									<td id="tilesAvisos" >
										<tiles:insertAttribute name="avisos" />
									</td>
								</tr>
							</table>
						</td>
					</tr>
					<tr height="60px">
						<td class="app-footter-background"><tiles:insertAttribute name="footer" /></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</div>

</body>
</html>