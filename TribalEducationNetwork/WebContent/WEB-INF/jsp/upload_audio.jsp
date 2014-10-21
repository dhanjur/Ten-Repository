<!DOCTYPE html>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta charset="UTF-8">
	
	<!-- Stylesheets -->
	<link rel="stylesheet" type="text/css" href="css/page_layout.css">
	
	<title>Tribal Education Network Audio Upload</title>
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script>
		function onAnnotateChange(){
			$("#annotations_div").toggle();
		}
		
		function onFileUpload(){
			$("#uploadPreview_div").show();
			
			var supportedFileTypes = ['audio/mpeg','audio/ogg', 'audio/wav'];
			var file = document.getElementById("upload").files[0];
			if(supportedFileTypes.indexOf(file.type) == -1){
				alert("File type not supported");
				$("#uploadPreview_div").empty();
				$("#uploadPreview_div").hide();
				document.getElementById("upload").value = '';
				return false;
			}
			
			var oFReader = new FileReader();
			oFReader.readAsDataURL(file);			
			oFReader.onloadend = function(_file) {				
				var obj,source;
		
				obj = document.createElement('audio');
				$(obj).attr('width', '100%');
				$(obj).attr('data-height', '80%');
				$(obj).attr('controls', ' ');
						
				source = document.createElement('source');
				$(source).attr('type', file.type);
				$(source).attr('src',_file.target.result);
			
				$("#uploadPreview_div").empty();
				$("#uploadPreview_div").append(obj);
				$(obj).append(source);
			};
		}
	</script>
</head>
<body>
	<form action="${pageContext.request.contextPath}/upload/uploadaudio.action" method="post" enctype="multipart/form-data">
	<header>
		<h1><img src="${pageContext.request.contextPath}/images/TEN_icon.png" alt="TEN Logo" width="60px" height="60px">  Tribal Education Network</h1>
	</header>
	
	<section>
	<table>
		<tr><td>
		<s:if test="hasActionErrors()">
	        <s:actionerror/>
		</s:if>
		</td></tr>
	</table>
	
	<table>
		<tr><td>
		<s:if test="hasActionMessages()">
	  	    <s:actionmessage/>
		</s:if>
		</td></tr>
	</table>
	
	<table>
		 <tr><td><input type="file" id="upload" name="upload" size="50" onchange="onFileUpload()"/></td></tr>
		 <tr><td></td></tr>
		 <tr><td><div id="uploadPreview_div" style="display:none;"></div></td></tr>
  		  <tr><td>
  		 	Annotate: No <input type="radio" name="annotate" value="false" onchange="onAnnotateChange();" <c:if test="${annotate == false}">checked</c:if> />
  		 			  Yes <input type="radio" name="annotate" onchange="onAnnotateChange();" value="true" <c:if test="${annotate == true}">checked</c:if>/>
  		 </td></tr>  		 
  		<tr><td></td></tr>
  		 <tr><td>
	  		 <div id="annotations_div" style="display:<c:choose><c:when test='${annotate == true}'>block</c:when><c:otherwise>none</c:otherwise></c:choose>">
	  		    <%@include file="dc_annotations.jsp"%>	
	  		    <%@include file="ten_annotations.jsp"%>					 
			 </div>
		 </td></tr>
		 
		 <tr><td><input type="submit" value="Upload File" /></td></tr>
	</table>
	</section>
			
	</form>
</body>
</html>