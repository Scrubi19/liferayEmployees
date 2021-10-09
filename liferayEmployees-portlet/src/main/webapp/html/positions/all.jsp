<%@include file="/html/init.jsp"%>

<portlet:renderURL var="addPosition">
    <portlet:param name="mvcPath" value="/html/positions/add.jsp"/>
</portlet:renderURL>

<aui:button onClick="<%= addPosition %>" value="Add new Position"/>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
            results="<%=positionsLocalServiceUtil.getpositionsesByArchive(true, searchContainer.getStart(), searchContainer.getEnd())%>"/>

    <liferay-ui:search-container-row
            className="ru.bulatov.liferay.model.positions" modelVar="positions">

        <liferay-ui:search-container-column-jsp  path="/html/positions/buttons/edit.jsp" align="left"/>
        <liferay-ui:search-container-column-text property="position_id" name = "Position id"/>
        <liferay-ui:search-container-column-text property="position_name" name = "Position name"/>
        <liferay-ui:search-container-column-text property="archive_status" name = "Archive status"/>
        <liferay-ui:search-container-column-jsp  path="/html/positions/buttons/archive.jsp" align="right"/>

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>

<aui:button-row cssClass="back">

    <portlet:renderURL var="backViewURL">
        <portlet:param name="mvcPath" value="/html/positions/menu.jsp"/>
    </portlet:renderURL>

    <aui:button onClick="<%= backViewURL %>" value="Back"/>
</aui:button-row>