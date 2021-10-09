package ru.bulatov.liferay.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link employeesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see employeesLocalService
 * @generated
 */
public class employeesLocalServiceWrapper implements employeesLocalService,
    ServiceWrapper<employeesLocalService> {
    private employeesLocalService _employeesLocalService;

    public employeesLocalServiceWrapper(
        employeesLocalService employeesLocalService) {
        _employeesLocalService = employeesLocalService;
    }

    /**
    * Adds the employees to the database. Also notifies the appropriate model listeners.
    *
    * @param employees the employees
    * @return the employees that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.bulatov.liferay.model.employees addemployees(
        ru.bulatov.liferay.model.employees employees)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.addemployees(employees);
    }

    /**
    * Creates a new employees with the primary key. Does not add the employees to the database.
    *
    * @param employee_id the primary key for the new employees
    * @return the new employees
    */
    @Override
    public ru.bulatov.liferay.model.employees createemployees(long employee_id) {
        return _employeesLocalService.createemployees(employee_id);
    }

    /**
    * Deletes the employees with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param employee_id the primary key of the employees
    * @return the employees that was removed
    * @throws PortalException if a employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.bulatov.liferay.model.employees deleteemployees(long employee_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.deleteemployees(employee_id);
    }

    /**
    * Deletes the employees from the database. Also notifies the appropriate model listeners.
    *
    * @param employees the employees
    * @return the employees that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.bulatov.liferay.model.employees deleteemployees(
        ru.bulatov.liferay.model.employees employees)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.deleteemployees(employees);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _employeesLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.bulatov.liferay.model.impl.employeesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.bulatov.liferay.model.impl.employeesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public ru.bulatov.liferay.model.employees fetchemployees(long employee_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.fetchemployees(employee_id);
    }

    /**
    * Returns the employees with the primary key.
    *
    * @param employee_id the primary key of the employees
    * @return the employees
    * @throws PortalException if a employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.bulatov.liferay.model.employees getemployees(long employee_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.getemployees(employee_id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the employeeses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.bulatov.liferay.model.impl.employeesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of employeeses
    * @param end the upper bound of the range of employeeses (not inclusive)
    * @return the range of employeeses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<ru.bulatov.liferay.model.employees> getemployeeses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.getemployeeses(start, end);
    }

    /**
    * Returns the number of employeeses.
    *
    * @return the number of employeeses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getemployeesesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.getemployeesesCount();
    }

    /**
    * Updates the employees in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param employees the employees
    * @return the employees that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.bulatov.liferay.model.employees updateemployees(
        ru.bulatov.liferay.model.employees employees)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.updateemployees(employees);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _employeesLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _employeesLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _employeesLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List<ru.bulatov.liferay.model.employees> getemployeesesByArchive(
        boolean archive, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employeesLocalService.getemployeesesByArchive(archive, start,
            end);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public employeesLocalService getWrappedemployeesLocalService() {
        return _employeesLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedemployeesLocalService(
        employeesLocalService employeesLocalService) {
        _employeesLocalService = employeesLocalService;
    }

    @Override
    public employeesLocalService getWrappedService() {
        return _employeesLocalService;
    }

    @Override
    public void setWrappedService(employeesLocalService employeesLocalService) {
        _employeesLocalService = employeesLocalService;
    }
}
