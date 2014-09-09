<%@ tag pageEncoding="UTF-8" %>
<%@attribute name="form" type="br.com.caelum.vraptor.form.modelform.ModelForm" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<form method="post">
    <c:forEach items="${form.fields}" var="f">
        <label> ${f}:
            <input name="${form.modelName}.${f}">
        </label>
        <br>
    </c:forEach>

    <input type="submit">
</form>
