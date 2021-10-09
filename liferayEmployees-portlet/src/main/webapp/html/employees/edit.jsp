<%@include file="/html/init.jsp"%>

<jsp:useBean id="currentEmployee" type="ru.bulatov.liferay.model.employees" scope="request" />

<portlet:actionURL name="updateEmployee" var="updateEmployeeURL"/>
<aui:form  action="<%= updateEmployeeURL %>" name="<portlet:namespace />fm">

    <aui:fieldset>
        <aui:input name="key" value="<%= currentEmployee.getEmployee_id() %>" type="hidden" />
        <aui:input name="Last name" value="<%= currentEmployee.getLastname() %>"  />
        <aui:input name="First name" value="<%= currentEmployee.getFirstname() %>"/>
        <aui:input name="Middle name" value="<%= currentEmployee.getMiddlename() %>"  />
        <aui:input name="Gender" value="<%= currentEmployee.getGender() %>"  />
        <aui:input name="Date of birth" value="<%= currentEmployee.getDate_of_birth() %>"  />
        <aui:input name="Date of employment" value="<%= currentEmployee.getDate_of_employment() %>"  />
        <aui:input name="Position id" value="<%= currentEmployee.getPosition_id() %>"  />
        <aui:input name="Salary" value="<%= currentEmployee.getSalary() %>"  />
        <aui:input name="Work phonenumber" value="<%= currentEmployee.getWork_phonenumber() %>"  />
        <aui:input name="Mobile phonenumber" value="<%= currentEmployee.getMobile_phonenumber() %>"  />
        <aui:input name="Bank id" value="<%= currentEmployee.getBank_id() %>"  />
        <aui:input name="Archive status" value="<%= currentEmployee.getArchive_status() %>"  />

    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" value="Save"/>
    </aui:button-row>
</aui:form>