<%@include file="/html/init.jsp"%>

<jsp:useBean id="currentPosition" type="ru.bulatov.liferay.model.positions" scope="request" />

<portlet:actionURL name="updatePosition" var="updatePositionURL"/>
<aui:form  action="<%= updatePositionURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>
        <aui:input name="key" value="<%= currentPosition.getPosition_id() %>" type="hidden" />
        <aui:input name="Position name" value="<%= currentPosition.getPosition_name() %>"  />
        <aui:input name="Archive status" value="<%= currentPosition.getArchive_status() %>" type="hidden"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" value="Save"/>
    </aui:button-row>
</aui:form>