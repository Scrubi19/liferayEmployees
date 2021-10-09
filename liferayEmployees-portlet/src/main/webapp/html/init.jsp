<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>

<%--DB model--%>
<%@ page import="ru.bulatov.liferay.model.employees" %>
<%@ page import="ru.bulatov.liferay.model.banks" %>
<%@ page import="ru.bulatov.liferay.model.positions" %>

<%--Controller--%>
<%@ page import="ru.bulatov.liferay.service.employeesLocalServiceUtil" %>
<%@ page import="ru.bulatov.liferay.service.positionsLocalServiceUtil" %>
<%@ page import="ru.bulatov.liferay.service.banksLocalServiceUtil" %>

<portlet:defineObjects />