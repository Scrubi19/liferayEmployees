package ru.bulatov.liferay.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import ru.bulatov.liferay.model.employees;
import ru.bulatov.liferay.service.employeesLocalServiceUtil;

/**
 * The extended model base implementation for the employees service. Represents a row in the &quot;liferay_employees&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link employeesImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see employeesImpl
 * @see ru.bulatov.liferay.model.employees
 * @generated
 */
public abstract class employeesBaseImpl extends employeesModelImpl
    implements employees {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a employees model instance should use the {@link employees} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            employeesLocalServiceUtil.addemployees(this);
        } else {
            employeesLocalServiceUtil.updateemployees(this);
        }
    }
}
