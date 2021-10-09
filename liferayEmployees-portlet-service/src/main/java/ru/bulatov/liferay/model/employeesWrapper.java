package ru.bulatov.liferay.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link employees}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see employees
 * @generated
 */
public class employeesWrapper implements employees, ModelWrapper<employees> {
    private employees _employees;

    public employeesWrapper(employees employees) {
        _employees = employees;
    }

    @Override
    public Class<?> getModelClass() {
        return employees.class;
    }

    @Override
    public String getModelClassName() {
        return employees.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("employee_id", getEmployee_id());
        attributes.put("lastname", getLastname());
        attributes.put("firstname", getFirstname());
        attributes.put("middlename", getMiddlename());
        attributes.put("gender", getGender());
        attributes.put("date_of_birth", getDate_of_birth());
        attributes.put("date_of_employment", getDate_of_employment());
        attributes.put("position_id", getPosition_id());
        attributes.put("salary", getSalary());
        attributes.put("work_phonenumber", getWork_phonenumber());
        attributes.put("mobile_phonenumber", getMobile_phonenumber());
        attributes.put("bank_id", getBank_id());
        attributes.put("archive_status", getArchive_status());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long employee_id = (Long) attributes.get("employee_id");

        if (employee_id != null) {
            setEmployee_id(employee_id);
        }

        String lastname = (String) attributes.get("lastname");

        if (lastname != null) {
            setLastname(lastname);
        }

        String firstname = (String) attributes.get("firstname");

        if (firstname != null) {
            setFirstname(firstname);
        }

        String middlename = (String) attributes.get("middlename");

        if (middlename != null) {
            setMiddlename(middlename);
        }

        String gender = (String) attributes.get("gender");

        if (gender != null) {
            setGender(gender);
        }

        String date_of_birth = (String) attributes.get("date_of_birth");

        if (date_of_birth != null) {
            setDate_of_birth(date_of_birth);
        }

        String date_of_employment = (String) attributes.get(
                "date_of_employment");

        if (date_of_employment != null) {
            setDate_of_employment(date_of_employment);
        }

        Long position_id = (Long) attributes.get("position_id");

        if (position_id != null) {
            setPosition_id(position_id);
        }

        Long salary = (Long) attributes.get("salary");

        if (salary != null) {
            setSalary(salary);
        }

        String work_phonenumber = (String) attributes.get("work_phonenumber");

        if (work_phonenumber != null) {
            setWork_phonenumber(work_phonenumber);
        }

        String mobile_phonenumber = (String) attributes.get(
                "mobile_phonenumber");

        if (mobile_phonenumber != null) {
            setMobile_phonenumber(mobile_phonenumber);
        }

        Long bank_id = (Long) attributes.get("bank_id");

        if (bank_id != null) {
            setBank_id(bank_id);
        }

        Boolean archive_status = (Boolean) attributes.get("archive_status");

        if (archive_status != null) {
            setArchive_status(archive_status);
        }
    }

    /**
    * Returns the primary key of this employees.
    *
    * @return the primary key of this employees
    */
    @Override
    public long getPrimaryKey() {
        return _employees.getPrimaryKey();
    }

    /**
    * Sets the primary key of this employees.
    *
    * @param primaryKey the primary key of this employees
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _employees.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the employee_id of this employees.
    *
    * @return the employee_id of this employees
    */
    @Override
    public long getEmployee_id() {
        return _employees.getEmployee_id();
    }

    /**
    * Sets the employee_id of this employees.
    *
    * @param employee_id the employee_id of this employees
    */
    @Override
    public void setEmployee_id(long employee_id) {
        _employees.setEmployee_id(employee_id);
    }

    /**
    * Returns the lastname of this employees.
    *
    * @return the lastname of this employees
    */
    @Override
    public java.lang.String getLastname() {
        return _employees.getLastname();
    }

    /**
    * Sets the lastname of this employees.
    *
    * @param lastname the lastname of this employees
    */
    @Override
    public void setLastname(java.lang.String lastname) {
        _employees.setLastname(lastname);
    }

    /**
    * Returns the firstname of this employees.
    *
    * @return the firstname of this employees
    */
    @Override
    public java.lang.String getFirstname() {
        return _employees.getFirstname();
    }

    /**
    * Sets the firstname of this employees.
    *
    * @param firstname the firstname of this employees
    */
    @Override
    public void setFirstname(java.lang.String firstname) {
        _employees.setFirstname(firstname);
    }

    /**
    * Returns the middlename of this employees.
    *
    * @return the middlename of this employees
    */
    @Override
    public java.lang.String getMiddlename() {
        return _employees.getMiddlename();
    }

    /**
    * Sets the middlename of this employees.
    *
    * @param middlename the middlename of this employees
    */
    @Override
    public void setMiddlename(java.lang.String middlename) {
        _employees.setMiddlename(middlename);
    }

    /**
    * Returns the gender of this employees.
    *
    * @return the gender of this employees
    */
    @Override
    public java.lang.String getGender() {
        return _employees.getGender();
    }

    /**
    * Sets the gender of this employees.
    *
    * @param gender the gender of this employees
    */
    @Override
    public void setGender(java.lang.String gender) {
        _employees.setGender(gender);
    }

    /**
    * Returns the date_of_birth of this employees.
    *
    * @return the date_of_birth of this employees
    */
    @Override
    public java.lang.String getDate_of_birth() {
        return _employees.getDate_of_birth();
    }

    /**
    * Sets the date_of_birth of this employees.
    *
    * @param date_of_birth the date_of_birth of this employees
    */
    @Override
    public void setDate_of_birth(java.lang.String date_of_birth) {
        _employees.setDate_of_birth(date_of_birth);
    }

    /**
    * Returns the date_of_employment of this employees.
    *
    * @return the date_of_employment of this employees
    */
    @Override
    public java.lang.String getDate_of_employment() {
        return _employees.getDate_of_employment();
    }

    /**
    * Sets the date_of_employment of this employees.
    *
    * @param date_of_employment the date_of_employment of this employees
    */
    @Override
    public void setDate_of_employment(java.lang.String date_of_employment) {
        _employees.setDate_of_employment(date_of_employment);
    }

    /**
    * Returns the position_id of this employees.
    *
    * @return the position_id of this employees
    */
    @Override
    public long getPosition_id() {
        return _employees.getPosition_id();
    }

    /**
    * Sets the position_id of this employees.
    *
    * @param position_id the position_id of this employees
    */
    @Override
    public void setPosition_id(long position_id) {
        _employees.setPosition_id(position_id);
    }

    /**
    * Returns the salary of this employees.
    *
    * @return the salary of this employees
    */
    @Override
    public long getSalary() {
        return _employees.getSalary();
    }

    /**
    * Sets the salary of this employees.
    *
    * @param salary the salary of this employees
    */
    @Override
    public void setSalary(long salary) {
        _employees.setSalary(salary);
    }

    /**
    * Returns the work_phonenumber of this employees.
    *
    * @return the work_phonenumber of this employees
    */
    @Override
    public java.lang.String getWork_phonenumber() {
        return _employees.getWork_phonenumber();
    }

    /**
    * Sets the work_phonenumber of this employees.
    *
    * @param work_phonenumber the work_phonenumber of this employees
    */
    @Override
    public void setWork_phonenumber(java.lang.String work_phonenumber) {
        _employees.setWork_phonenumber(work_phonenumber);
    }

    /**
    * Returns the mobile_phonenumber of this employees.
    *
    * @return the mobile_phonenumber of this employees
    */
    @Override
    public java.lang.String getMobile_phonenumber() {
        return _employees.getMobile_phonenumber();
    }

    /**
    * Sets the mobile_phonenumber of this employees.
    *
    * @param mobile_phonenumber the mobile_phonenumber of this employees
    */
    @Override
    public void setMobile_phonenumber(java.lang.String mobile_phonenumber) {
        _employees.setMobile_phonenumber(mobile_phonenumber);
    }

    /**
    * Returns the bank_id of this employees.
    *
    * @return the bank_id of this employees
    */
    @Override
    public long getBank_id() {
        return _employees.getBank_id();
    }

    /**
    * Sets the bank_id of this employees.
    *
    * @param bank_id the bank_id of this employees
    */
    @Override
    public void setBank_id(long bank_id) {
        _employees.setBank_id(bank_id);
    }

    /**
    * Returns the archive_status of this employees.
    *
    * @return the archive_status of this employees
    */
    @Override
    public boolean getArchive_status() {
        return _employees.getArchive_status();
    }

    /**
    * Returns <code>true</code> if this employees is archive_status.
    *
    * @return <code>true</code> if this employees is archive_status; <code>false</code> otherwise
    */
    @Override
    public boolean isArchive_status() {
        return _employees.isArchive_status();
    }

    /**
    * Sets whether this employees is archive_status.
    *
    * @param archive_status the archive_status of this employees
    */
    @Override
    public void setArchive_status(boolean archive_status) {
        _employees.setArchive_status(archive_status);
    }

    @Override
    public boolean isNew() {
        return _employees.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _employees.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _employees.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _employees.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _employees.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _employees.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _employees.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _employees.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _employees.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _employees.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _employees.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new employeesWrapper((employees) _employees.clone());
    }

    @Override
    public int compareTo(ru.bulatov.liferay.model.employees employees) {
        return _employees.compareTo(employees);
    }

    @Override
    public int hashCode() {
        return _employees.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<ru.bulatov.liferay.model.employees> toCacheModel() {
        return _employees.toCacheModel();
    }

    @Override
    public ru.bulatov.liferay.model.employees toEscapedModel() {
        return new employeesWrapper(_employees.toEscapedModel());
    }

    @Override
    public ru.bulatov.liferay.model.employees toUnescapedModel() {
        return new employeesWrapper(_employees.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _employees.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _employees.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _employees.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof employeesWrapper)) {
            return false;
        }

        employeesWrapper employeesWrapper = (employeesWrapper) obj;

        if (Validator.equals(_employees, employeesWrapper._employees)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public employees getWrappedemployees() {
        return _employees;
    }

    @Override
    public employees getWrappedModel() {
        return _employees;
    }

    @Override
    public void resetOriginalValues() {
        _employees.resetOriginalValues();
    }
}
