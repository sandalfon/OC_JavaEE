<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Test</title>
</head>
<body>
<p><c:out value="${auteur.nom} & ${auteur.prenom }" >par défaut </c:out></p>
<c:set var="pseudo" value="Sdlf" scope="page" />
<p><c:out value="${pseudo }"/></p>
<c:set var="pseudo" scope="page" >rob</c:set>
<p><c:out value="${pseudo }"/></p>
<p>${auteur.actif ? 'Vous êtes actif' : 'inactif' }</p>
<c:set target="${auteur }" property="nom" value="Thomas"/>
<p><c:out value="${auteur.nom} & ${auteur.prenom }" >par défaut </c:out></p>
<c:remove var="pseudo" scope="page"/>
<p><c:out value="${pseudo }">pas de pseudo</c:out></p>
<c:if test="${50>100 }" var="variable" scope="session">
C'est vrai
</c:if>
<c:choose>
<c:when test="${variable }"> Vrai</c:when>
<c:otherwise>Faux </c:otherwise>
</c:choose>
</body>
</html>