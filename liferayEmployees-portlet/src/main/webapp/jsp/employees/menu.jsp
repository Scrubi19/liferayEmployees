<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>

<aui:button-row cssClass="employees_menu">

    <portlet:renderURL var="printAllEmployees">
        <portlet:param name="mvcPath" value="/jsp/employees/all.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= printAllEmployees %>" value="Show All Employees"></aui:button>

    <portlet:renderURL var="addEmployee">
        <portlet:param name="mvcPath" value="/jsp/employees/add.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= addEmployee %>" value="Add new Employee"></aui:button>

    <portlet:renderURL var="editEmployee">
        <portlet:param name="mvcPath" value="/jsp/employees/edit.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= editEmployee %>" value="Edit Employee"></aui:button>

    <portlet:renderURL var="employeeToArchive">
        <portlet:param name="mvcPath" value="/jsp/employees/archive.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= employeeToArchive %>" value="Add/Delete Employee from archive"></aui:button>

</aui:button-row>

