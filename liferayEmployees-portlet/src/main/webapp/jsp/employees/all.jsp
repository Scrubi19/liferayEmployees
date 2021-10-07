<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib prefix="aui" uri="http://alloy.liferay.com/tld/aui" %>
<%@ taglib prefix="portlet" uri="http://java.sun.com/portlet" %>


<%--<liferay-ui:search-container-row--%>
<%--&lt;%&ndash;        className="ru.bulatov.liferay.model.Employee" modelVar="employee">&ndash;%&gt;--%>

<%--&lt;%&ndash;    <liferay-ui:search-container-column-text property="lastname" name = "Last name"/>&ndash;%&gt;--%>
<%--&lt;%&ndash;    <liferay-ui:search-container-column-text property="firstname" name = "First name"/>&ndash;%&gt;--%>
<%--&lt;%&ndash;    <liferay-ui:search-container-column-text property="middlename" name = "Middle name"/>&ndash;%&gt;--%>
<%--&lt;%&ndash;    <liferay-ui:search-container-column-text property="gender" name = "Gender"/>&ndash;%&gt;--%>
<%--&lt;%&ndash;    <liferay-ui:search-container-column-text property="date_of_birth" name = "Date of birth"/>&ndash;%&gt;--%>
<%--&lt;%&ndash;    <liferay-ui:search-container-column-text property="date_of_employment" name = "Date of employment"/>&ndash;%&gt;--%>
<%--&lt;%&ndash;    <liferay-ui:search-container-column-text property="position_id" name = "Position"/>&ndash;%&gt;--%>
<%--&lt;%&ndash;    <liferay-ui:search-container-column-text property="salary" name = "Salary"/>&ndash;%&gt;--%>
<%--&lt;%&ndash;    <liferay-ui:search-container-column-text property="work_phonenumber" name = "Work phonenumber"/>&ndash;%&gt;--%>
<%--&lt;%&ndash;    <liferay-ui:search-container-column-text property="mobile_phonenumber" name = "Mobile phonenumber"/>&ndash;%&gt;--%>
<%--&lt;%&ndash;    <liferay-ui:search-container-column-text property="bank_id" name = "Bank id"/>&ndash;%&gt;--%>
<%--&lt;%&ndash;    <liferay-ui:search-container-column-text property="archive_status" name = "Archive"/>&ndash;%&gt;--%>

<%--</liferay-ui:search-container-row>--%>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/jsp/employee/menu.jsp"></portlet:param>
</portlet:renderURL>

<aui:button-row>
    <aui:button type="cancel" onClick="<%= viewURL %>"></aui:button>
</aui:button-row>