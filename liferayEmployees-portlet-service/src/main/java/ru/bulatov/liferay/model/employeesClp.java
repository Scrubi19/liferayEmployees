package ru.bulatov.liferay.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import ru.bulatov.liferay.service.ClpSerializer;
import ru.bulatov.liferay.service.employeesLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class employeesClp extends BaseModelImpl<employees> implements employees {
    private long _employee_id;
    private String _lastname;
    private String _firstname;
    private String _middlename;
    private String _gender;
    private String _date_of_birth;
    private String _date_of_employment;
    private long _position_id;
    private long _salary;
    private String _work_phonenumber;
    private String _mobile_phonenumber;
    private long _bank_id;
    private boolean _archive_status;
    private BaseModel<?> _employeesRemoteModel;
    private Class<?> _clpSerializerClass = ru.bulatov.liferay.service.ClpSerializer.class;

    public employeesClp() {
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
    public long getPrimaryKey() {
        return _employee_id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setEmployee_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _employee_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getEmployee_id() {
        return _employee_id;
    }

    @Override
    public void setEmployee_id(long employee_id) {
        _employee_id = employee_id;

        if (_employeesRemoteModel != null) {
            try {
                Class<?> clazz = _employeesRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployee_id", long.class);

                method.invoke(_employeesRemoteModel, employee_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLastname() {
        return _lastname;
    }

    @Override
    public void setLastname(String lastname) {
        _lastname = lastname;

        if (_employeesRemoteModel != null) {
            try {
                Class<?> clazz = _employeesRemoteModel.getClass();

                Method method = clazz.getMethod("setLastname", String.class);

                method.invoke(_employeesRemoteModel, lastname);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getFirstname() {
        return _firstname;
    }

    @Override
    public void setFirstname(String firstname) {
        _firstname = firstname;

        if (_employeesRemoteModel != null) {
            try {
                Class<?> clazz = _employeesRemoteModel.getClass();

                Method method = clazz.getMethod("setFirstname", String.class);

                method.invoke(_employeesRemoteModel, firstname);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getMiddlename() {
        return _middlename;
    }

    @Override
    public void setMiddlename(String middlename) {
        _middlename = middlename;

        if (_employeesRemoteModel != null) {
            try {
                Class<?> clazz = _employeesRemoteModel.getClass();

                Method method = clazz.getMethod("setMiddlename", String.class);

                method.invoke(_employeesRemoteModel, middlename);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getGender() {
        return _gender;
    }

    @Override
    public void setGender(String gender) {
        _gender = gender;

        if (_employeesRemoteModel != null) {
            try {
                Class<?> clazz = _employeesRemoteModel.getClass();

                Method method = clazz.getMethod("setGender", String.class);

                method.invoke(_employeesRemoteModel, gender);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDate_of_birth() {
        return _date_of_birth;
    }

    @Override
    public void setDate_of_birth(String date_of_birth) {
        _date_of_birth = date_of_birth;

        if (_employeesRemoteModel != null) {
            try {
                Class<?> clazz = _employeesRemoteModel.getClass();

                Method method = clazz.getMethod("setDate_of_birth", String.class);

                method.invoke(_employeesRemoteModel, date_of_birth);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDate_of_employment() {
        return _date_of_employment;
    }

    @Override
    public void setDate_of_employment(String date_of_employment) {
        _date_of_employment = date_of_employment;

        if (_employeesRemoteModel != null) {
            try {
                Class<?> clazz = _employeesRemoteModel.getClass();

                Method method = clazz.getMethod("setDate_of_employment",
                        String.class);

                method.invoke(_employeesRemoteModel, date_of_employment);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getPosition_id() {
        return _position_id;
    }

    @Override
    public void setPosition_id(long position_id) {
        _position_id = position_id;

        if (_employeesRemoteModel != null) {
            try {
                Class<?> clazz = _employeesRemoteModel.getClass();

                Method method = clazz.getMethod("setPosition_id", long.class);

                method.invoke(_employeesRemoteModel, position_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getSalary() {
        return _salary;
    }

    @Override
    public void setSalary(long salary) {
        _salary = salary;

        if (_employeesRemoteModel != null) {
            try {
                Class<?> clazz = _employeesRemoteModel.getClass();

                Method method = clazz.getMethod("setSalary", long.class);

                method.invoke(_employeesRemoteModel, salary);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getWork_phonenumber() {
        return _work_phonenumber;
    }

    @Override
    public void setWork_phonenumber(String work_phonenumber) {
        _work_phonenumber = work_phonenumber;

        if (_employeesRemoteModel != null) {
            try {
                Class<?> clazz = _employeesRemoteModel.getClass();

                Method method = clazz.getMethod("setWork_phonenumber",
                        String.class);

                method.invoke(_employeesRemoteModel, work_phonenumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getMobile_phonenumber() {
        return _mobile_phonenumber;
    }

    @Override
    public void setMobile_phonenumber(String mobile_phonenumber) {
        _mobile_phonenumber = mobile_phonenumber;

        if (_employeesRemoteModel != null) {
            try {
                Class<?> clazz = _employeesRemoteModel.getClass();

                Method method = clazz.getMethod("setMobile_phonenumber",
                        String.class);

                method.invoke(_employeesRemoteModel, mobile_phonenumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getBank_id() {
        return _bank_id;
    }

    @Override
    public void setBank_id(long bank_id) {
        _bank_id = bank_id;

        if (_employeesRemoteModel != null) {
            try {
                Class<?> clazz = _employeesRemoteModel.getClass();

                Method method = clazz.getMethod("setBank_id", long.class);

                method.invoke(_employeesRemoteModel, bank_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getArchive_status() {
        return _archive_status;
    }

    @Override
    public boolean isArchive_status() {
        return _archive_status;
    }

    @Override
    public void setArchive_status(boolean archive_status) {
        _archive_status = archive_status;

        if (_employeesRemoteModel != null) {
            try {
                Class<?> clazz = _employeesRemoteModel.getClass();

                Method method = clazz.getMethod("setArchive_status",
                        boolean.class);

                method.invoke(_employeesRemoteModel, archive_status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getemployeesRemoteModel() {
        return _employeesRemoteModel;
    }

    public void setemployeesRemoteModel(BaseModel<?> employeesRemoteModel) {
        _employeesRemoteModel = employeesRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _employeesRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_employeesRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            employeesLocalServiceUtil.addemployees(this);
        } else {
            employeesLocalServiceUtil.updateemployees(this);
        }
    }

    @Override
    public employees toEscapedModel() {
        return (employees) ProxyUtil.newProxyInstance(employees.class.getClassLoader(),
            new Class[] { employees.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        employeesClp clone = new employeesClp();

        clone.setEmployee_id(getEmployee_id());
        clone.setLastname(getLastname());
        clone.setFirstname(getFirstname());
        clone.setMiddlename(getMiddlename());
        clone.setGender(getGender());
        clone.setDate_of_birth(getDate_of_birth());
        clone.setDate_of_employment(getDate_of_employment());
        clone.setPosition_id(getPosition_id());
        clone.setSalary(getSalary());
        clone.setWork_phonenumber(getWork_phonenumber());
        clone.setMobile_phonenumber(getMobile_phonenumber());
        clone.setBank_id(getBank_id());
        clone.setArchive_status(getArchive_status());

        return clone;
    }

    @Override
    public int compareTo(employees employees) {
        long primaryKey = employees.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof employeesClp)) {
            return false;
        }

        employeesClp employees = (employeesClp) obj;

        long primaryKey = employees.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{employee_id=");
        sb.append(getEmployee_id());
        sb.append(", lastname=");
        sb.append(getLastname());
        sb.append(", firstname=");
        sb.append(getFirstname());
        sb.append(", middlename=");
        sb.append(getMiddlename());
        sb.append(", gender=");
        sb.append(getGender());
        sb.append(", date_of_birth=");
        sb.append(getDate_of_birth());
        sb.append(", date_of_employment=");
        sb.append(getDate_of_employment());
        sb.append(", position_id=");
        sb.append(getPosition_id());
        sb.append(", salary=");
        sb.append(getSalary());
        sb.append(", work_phonenumber=");
        sb.append(getWork_phonenumber());
        sb.append(", mobile_phonenumber=");
        sb.append(getMobile_phonenumber());
        sb.append(", bank_id=");
        sb.append(getBank_id());
        sb.append(", archive_status=");
        sb.append(getArchive_status());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(43);

        sb.append("<model><model-name>");
        sb.append("ru.bulatov.liferay.model.employees");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>employee_id</column-name><column-value><![CDATA[");
        sb.append(getEmployee_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lastname</column-name><column-value><![CDATA[");
        sb.append(getLastname());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>firstname</column-name><column-value><![CDATA[");
        sb.append(getFirstname());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>middlename</column-name><column-value><![CDATA[");
        sb.append(getMiddlename());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>gender</column-name><column-value><![CDATA[");
        sb.append(getGender());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>date_of_birth</column-name><column-value><![CDATA[");
        sb.append(getDate_of_birth());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>date_of_employment</column-name><column-value><![CDATA[");
        sb.append(getDate_of_employment());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>position_id</column-name><column-value><![CDATA[");
        sb.append(getPosition_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>salary</column-name><column-value><![CDATA[");
        sb.append(getSalary());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>work_phonenumber</column-name><column-value><![CDATA[");
        sb.append(getWork_phonenumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>mobile_phonenumber</column-name><column-value><![CDATA[");
        sb.append(getMobile_phonenumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bank_id</column-name><column-value><![CDATA[");
        sb.append(getBank_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>archive_status</column-name><column-value><![CDATA[");
        sb.append(getArchive_status());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
