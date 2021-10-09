package ru.bulatov.liferay.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link banksLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see banksLocalService
 * @generated
 */
public class banksLocalServiceWrapper implements banksLocalService,
    ServiceWrapper<banksLocalService> {
    private banksLocalService _banksLocalService;

    public banksLocalServiceWrapper(banksLocalService banksLocalService) {
        _banksLocalService = banksLocalService;
    }

    /**
    * Adds the banks to the database. Also notifies the appropriate model listeners.
    *
    * @param banks the banks
    * @return the banks that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.bulatov.liferay.model.banks addbanks(
        ru.bulatov.liferay.model.banks banks)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _banksLocalService.addbanks(banks);
    }

    /**
    * Creates a new banks with the primary key. Does not add the banks to the database.
    *
    * @param bank_id the primary key for the new banks
    * @return the new banks
    */
    @Override
    public ru.bulatov.liferay.model.banks createbanks(long bank_id) {
        return _banksLocalService.createbanks(bank_id);
    }

    /**
    * Deletes the banks with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param bank_id the primary key of the banks
    * @return the banks that was removed
    * @throws PortalException if a banks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.bulatov.liferay.model.banks deletebanks(long bank_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _banksLocalService.deletebanks(bank_id);
    }

    /**
    * Deletes the banks from the database. Also notifies the appropriate model listeners.
    *
    * @param banks the banks
    * @return the banks that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.bulatov.liferay.model.banks deletebanks(
        ru.bulatov.liferay.model.banks banks)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _banksLocalService.deletebanks(banks);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _banksLocalService.dynamicQuery();
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
        return _banksLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.bulatov.liferay.model.impl.banksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _banksLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.bulatov.liferay.model.impl.banksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _banksLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _banksLocalService.dynamicQueryCount(dynamicQuery);
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
        return _banksLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public ru.bulatov.liferay.model.banks fetchbanks(long bank_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _banksLocalService.fetchbanks(bank_id);
    }

    /**
    * Returns the banks with the primary key.
    *
    * @param bank_id the primary key of the banks
    * @return the banks
    * @throws PortalException if a banks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.bulatov.liferay.model.banks getbanks(long bank_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _banksLocalService.getbanks(bank_id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _banksLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the bankses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.bulatov.liferay.model.impl.banksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of bankses
    * @param end the upper bound of the range of bankses (not inclusive)
    * @return the range of bankses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<ru.bulatov.liferay.model.banks> getbankses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _banksLocalService.getbankses(start, end);
    }

    /**
    * Returns the number of bankses.
    *
    * @return the number of bankses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getbanksesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _banksLocalService.getbanksesCount();
    }

    /**
    * Updates the banks in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param banks the banks
    * @return the banks that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.bulatov.liferay.model.banks updatebanks(
        ru.bulatov.liferay.model.banks banks)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _banksLocalService.updatebanks(banks);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _banksLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _banksLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _banksLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public banksLocalService getWrappedbanksLocalService() {
        return _banksLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedbanksLocalService(banksLocalService banksLocalService) {
        _banksLocalService = banksLocalService;
    }

    @Override
    public banksLocalService getWrappedService() {
        return _banksLocalService;
    }

    @Override
    public void setWrappedService(banksLocalService banksLocalService) {
        _banksLocalService = banksLocalService;
    }
}
