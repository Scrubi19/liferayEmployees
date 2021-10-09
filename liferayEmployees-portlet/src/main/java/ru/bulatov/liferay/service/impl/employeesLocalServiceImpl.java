package ru.bulatov.liferay.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import ru.bulatov.liferay.model.employees;
import ru.bulatov.liferay.service.base.employeesLocalServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the employees local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link ru.bulatov.liferay.service.employeesLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ru.bulatov.liferay.service.base.employeesLocalServiceBaseImpl
 * @see ru.bulatov.liferay.service.employeesLocalServiceUtil
 */
public class employeesLocalServiceImpl extends employeesLocalServiceBaseImpl {
    public List<employees> getemployeesesByArchive(boolean archive, int start, int end) throws SystemException {
        return employeesPersistence.findByArchive(archive);
    }
}
