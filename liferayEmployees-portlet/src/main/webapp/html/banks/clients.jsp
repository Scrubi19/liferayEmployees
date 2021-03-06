<%@include file="/html/init.jsp"%>

<jsp:useBean id="currentBankWithClients" type="ru.bulatov.liferay.model.banks" scope="request" />

<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%= employeesLocalServiceUtil.getBankClients(currentBankWithClients.getBank_id()) %>"/>

    <liferay-ui:search-container-row
            className="ru.bulatov.liferay.model.employees" modelVar="employees">

        <liferay-ui:search-container-column-jsp  path="/html/employees/buttons/edit.jsp" align="left"/>
        <liferay-ui:search-container-column-text property="lastname" name = "Last name"/>
        <liferay-ui:search-container-column-text property="firstname" name = "First name"/>
        <liferay-ui:search-container-column-text property="middlename" name = "Middle name"/>
        <liferay-ui:search-container-column-text property="gender" name = "Gender"/>
        <liferay-ui:search-container-column-text property="date_of_birth" name = "Date of birth"/>
        <liferay-ui:search-container-column-text property="date_of_employment" name = "Date of employment"/>
        <liferay-ui:search-container-column-text property="position_id" name = "Position"/>
        <liferay-ui:search-container-column-text property="salary" name = "Salary"/>
        <liferay-ui:search-container-column-text property="work_phonenumber" name = "Work phonenumber"/>
        <liferay-ui:search-container-column-text property="mobile_phonenumber" name = "Mobile phonenumber"/>
        <liferay-ui:search-container-column-text property="bank_id" name = "Bank id"/>
        <liferay-ui:search-container-column-text property="archive_status" name = "Archive"/>
        <liferay-ui:search-container-column-jsp  path="/html/employees/buttons/archive.jsp" align="right"/>
    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>

<aui:button-row cssClass="menu-buttons">

    <portlet:renderURL var="backURL">
        <portlet:param name="mvcPath" value="/html/employees/all.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backURL %>" value="Back"/>
</aui:button-row>