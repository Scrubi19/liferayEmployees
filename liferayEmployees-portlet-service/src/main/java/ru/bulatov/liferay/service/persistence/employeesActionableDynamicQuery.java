package ru.bulatov.liferay.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import ru.bulatov.liferay.model.employees;
import ru.bulatov.liferay.service.employeesLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class employeesActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public employeesActionableDynamicQuery() throws SystemException {
        setBaseLocalService(employeesLocalServiceUtil.getService());
        setClass(employees.class);

        setClassLoader(ru.bulatov.liferay.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("employee_id");
    }
}
