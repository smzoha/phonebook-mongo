<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--
    @author Shamah M Zoha
    @since 10-Mar-22
--%>
<html>
<head>
    <title>Phonebook | Login</title>

    <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>
    <link type="text/css" rel="stylesheet" href="css/fontawesome.min.css"/>
    <link type="text/css" rel="stylesheet" href="css/solid.min.css"/>

    <script type="text/javascript" src="js/jquery-3.6.0.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>
<body class="bg-dark">
    <div class="container" style="padding-top: 10pt">
        <div class="row col-sm-12 justify-content-center">
            <h2 class="text-success"><c:out value="Welcome to Phonebook!"/></h2>
        </div>

        <form:form method="POST">
            <div class="row form-group">
                <div class="col-sm-3 text-right text-light">
                    <label for="username"><strong>Username:</strong></label>
                </div>

                <div class="col-sm-6">
                    <input id="username" name="username" class="form-control bg-dark text-light border-light"/>
                </div>
            </div>

            <div class="row form-group">
                <div class="col-sm-3 text-right text-light">
                    <label for="password"><strong>Password:</strong></label>
                </div>

                <div class="col-sm-6">
                    <input type="password" id="password" name="password" class="form-control bg-dark text-light border-light"/>
                </div>
            </div>

            <div class="row col-sm-12 justify-content-center">
                <button type="submit" name="login" value="Login" class="btn btn-success btn-lg">
                    <c:out value="Login"/>
                </button>
            </div>
        </form:form>
    </div>
</body>