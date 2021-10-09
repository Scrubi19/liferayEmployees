<%@include file="/html/init.jsp"%>

<portlet:renderURL var="addEmployee">
    <portlet:param name="mvcPath" value="/html/employees/add.jsp"/>
</portlet:renderURL>

<aui:button onClick="<%= addEmployee %>" value="Add Employee"/>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%= employeesLocalServiceUtil.getemployeesesByArchive(true, searchContainer.getStart(), searchContainer.getEnd())%>"/>

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

<aui:button-row cssClass="back">

    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="/html/employees/menu.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backViewURL %>" value="Back"/>
</aui:button-row>