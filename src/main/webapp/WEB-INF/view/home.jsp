<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>
	<h1>Movies Currently on HBO GO</h1>

	<div>
		<div>Title</div>
		<c:forEach var="movie" items="${allMovies}">
			<div><c:out value="${movie.title}"/></div>
		</c:forEach>
	</div>

</body>
</html>