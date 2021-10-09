<%@include file="/html/init.jsp"%>

<portlet:renderURL var="addBank">
    <portlet:param name="mvcPath" value="/html/banks/add.jsp"/>
</portlet:renderURL>

<aui:button onClick="<%= addBank %>" value="Add new Bank"/>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%=banksLocalServiceUtil.getbankses(searchContainer.getStart(), searchContainer.getEnd())%>"/>

    <liferay-ui:search-container-row
            className="ru.bulatov.liferay.model.banks" modelVar="banks">

        <liferay-ui:search-container-column-jsp  path="/html/banks/buttons/edit.jsp" align="left"/>
        <liferay-ui:search-container-column-text property="bank_id" name = "Bank id"/>
        <liferay-ui:search-container-column-text property="bank_name" name = "Bank name"/>
        <liferay-ui:search-container-column-text property="bik" name = "BIC"/>
        <liferay-ui:search-container-column-text property="bank_address" name = "Address"/>
        <liferay-ui:search-container-column-jsp  path="/html/banks/buttons/clients.jsp" align="right"/>

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>

<aui:button-row cssClass="back">

    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="/html/banks/menu.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backViewURL %>" value="Back"/>
</aui:button-row>