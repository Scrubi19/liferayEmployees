<%@include file="/html/init.jsp"%>

<portlet:renderURL var="addBankURL">
    <portlet:param name="mvcPath" value="/html/banks/all.jsp"/>
</portlet:renderURL>

<portlet:actionURL name="addBank" var="addBankURL"/>

<aui:form action="<%= addBankURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="Bank name"/>
        <aui:input name="BIC"/>
        <aui:input name="Address"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"/>
        <aui:button type="cancel" onClick="<%= addBankURL %>"/>
    </aui:button-row>
</aui:form>
