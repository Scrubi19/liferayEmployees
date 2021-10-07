<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>

<aui:button-row cssClass="main-menu">

    <portlet:renderURL var="showAllEmployeesFunc">
        <portlet:param name="mvcPath" value="/jsp/employees/menu.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= showAllEmployeesFunc %>" value="Employees"></aui:button>

    <portlet:renderURL var="showAllBanksFunc">
        <portlet:param name="mvcPath" value="/jsp/banks/menu.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= showAllBanksFunc %>" value="Banks"></aui:button>

    <portlet:renderURL var="showAllPositionsFunc">
        <portlet:param name="mvcPath" value="/jsp/positions/menu.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= showAllPositionsFunc %>" value="Positions"></aui:button>

</aui:button-row>