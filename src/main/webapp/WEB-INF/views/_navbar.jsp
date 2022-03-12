<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sc" uri="http://www.springframework.org/security/tags" %>

<%--
    @author Shamah M Zoha
    @since 12-Mar-22
--%>
<nav class="navbar navbar-expand-sm navbar-fixed-top bg-success">
    <a class="navbar-brand text-light" href="/">
        <i class="fas fa-phone-alt"></i>&nbsp;<c:out value="Phonebook"/>
    </a>

    <ul class="navbar-nav mr-auto">
        <sc:authorize access="isAuthenticated()">
            <li class="nav-item pr-1">
                <a class="nav-link text-light" href="/contact">
                    <i class="fas fa-plus-circle"></i>&nbsp;<c:out value="Add Contact"/>
                </a>
            </li>

            <li class="nav-item pr-1">
                <a class="nav-link text-light" href="/contact/list">
                    <i class="fas fa-list-ul"></i>&nbsp;<c:out value="Contact List"/>
                </a>
            </li>
        </sc:authorize>
    </ul>

    <ul class="navbar-nav">
        <sc:authorize access="!isAuthenticated()">
            <li class="nav-item pr-1">
                <a href="/login" class="btn btn-light text-dark">
                    <i class="fas fa-sign-in-alt"></i>&nbsp;<c:out value="Login"/>
                </a>
            </li>
        </sc:authorize>
        <sc:authorize access="isAuthenticated()">
            <li class="nav-item pr-1">
                <a class="btn btn-light text-dark" href="/todo/perform_logout">
                    <i class="fas fa-sign-out-alt"></i>&nbsp;<c:out value="Logout"/>
                </a>
            </li>
        </sc:authorize>
    </ul>
</nav>