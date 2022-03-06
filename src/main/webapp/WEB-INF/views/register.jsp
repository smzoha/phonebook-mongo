<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!--
    @author Shamah M Zoha
    @since  3/6/2022
-->

<html>
<head>
    <title>Phonebook | Register</title>

    <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>
    <link type="text/css" rel="stylesheet" href="css/fontawesome.min.css"/>
    <link type="text/css" rel="stylesheet" href="css/solid.min.css"/>

    <script type="text/javascript" src="js/jquery-3.6.0.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>
<body>
    <form:form modelAttribute="user" method="POST">
        <div class="container" style="padding-top: 10pt;">
            <div class="row form-group">
                <div class="col-sm-3 text-right">
                    <label for="username"><strong>User Name:</strong></label>
                </div>
                <div class="col-sm-6">
                    <form:input path="username" maxlength="30" cssClass="form-control"/>
                </div>
            </div>

            <div class="row form-group">
                <div class="col-sm-3 text-right">
                    <label for="username"><strong>Password:</strong></label>
                </div>
                <div class="col-sm-6">
                    <form:password path="password" maxlength="30" cssClass="form-control"/>
                </div>
            </div>

            <div class="row form-group">
                <div class="col-sm-3 text-right">
                    <label for="username"><strong>First Name:</strong></label>
                </div>
                <div class="col-sm-6">
                    <form:input path="firstName" maxlength="30" cssClass="form-control"/>
                </div>
            </div>

            <div class="row form-group">
                <div class="col-sm-3 text-right">
                    <label for="username"><strong>Last Name:</strong></label>
                </div>
                <div class="col-sm-6">
                    <form:input path="lastName" maxlength="30" cssClass="form-control"/>
                </div>
            </div>

            <div class="row col-sm-12 justify-content-center">
                <button type="submit" name="save" value="Save" class="btn btn-primary btn-lg">
                    Register
                </button>
            </div>
        </div>
    </form:form>
</body>
</html>