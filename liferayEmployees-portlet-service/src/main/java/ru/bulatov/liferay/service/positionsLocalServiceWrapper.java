package ru.bulatov.liferay.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link positionsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see positionsLocalService
 * @generated
 */
public class positionsLocalServiceWrapper implements positionsLocalService,
    ServiceWrapper<positionsLocalService> {
    private positionsLocalService _positionsLocalService;

    public positionsLocalServiceWrapper(
        positionsLocalService positionsLocalService) {
        _positionsLocalService = positionsLocalService;
    }

    /**
    * Adds the positions to the database. Also notifies the appropriate model listeners.
    *
    * @param positions the positions
    * @return the positions that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.bulatov.liferay.model.positions addpositions(
        ru.bulatov.liferay.model.positions positions)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _positionsLocalService.addpositions(positions);
    }

    /**
    * Creates a new positions with the primary key. Does not add the positions to the database.
    *
    * @param position_id the primary key for the new positions
    * @return the new positions
    */
    @Override
    public ru.bulatov.liferay.model.positions createpositions(long position_id) {
        return _positionsLocalService.createpositions(position_id);
    }

    /**
    * Deletes the positions with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param position_id the primary key of the positions
    * @return the positions that was removed
    * @throws PortalException if a positions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.bulatov.liferay.model.positions deletepositions(long position_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _positionsLocalService.deletepositions(position_id);
    }

    /**
    * Deletes the positions from the database. Also notifies the appropriate model listeners.
    *
    * @param positions the positions
    * @return the positions that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.bulatov.liferay.model.positions deletepositions(
        ru.bulatov.liferay.model.positions positions)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _positionsLocalService.deletepositions(positions);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _positionsLocalService.dynamicQuery();
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
        return _positionsLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.bulatov.liferay.model.impl.positionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _positionsLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.bulatov.liferay.model.impl.positionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _positionsLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _positionsLocalService.dynamicQueryCount(dynamicQuery);
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
        return _positionsLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public ru.bulatov.liferay.model.positions fetchpositions(long position_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _positionsLocalService.fetchpositions(position_id);
    }

    /**
    * Returns the positions with the primary key.
    *
    * @param position_id the primary key of the positions
    * @return the positions
    * @throws PortalException if a positions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.bulatov.liferay.model.positions getpositions(long position_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _positionsLocalService.getpositions(position_id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _positionsLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the positionses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.bulatov.liferay.model.impl.positionsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of positionses
    * @param end the upper bound of the range of positionses (not inclusive)
    * @return the range of positionses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<ru.bulatov.liferay.model.positions> getpositionses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _positionsLocalService.getpositionses(start, end);
    }

    /**
    * Returns the number of positionses.
    *
    * @return the number of positionses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getpositionsesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _positionsLocalService.getpositionsesCount();
    }

    /**
    * Updates the positions in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param positions the positions
    * @return the positions that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public ru.bulatov.liferay.model.positions updatepositions(
        ru.bulatov.liferay.model.positions positions)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _positionsLocalService.updatepositions(positions);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _positionsLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _positionsLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _positionsLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List<ru.bulatov.liferay.model.positions> getpositionsesByArchive(
        boolean archive, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _positionsLocalService.getpositionsesByArchive(archive, start,
            end);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public positionsLocalService getWrappedpositionsLocalService() {
        return _positionsLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedpositionsLocalService(
        positionsLocalService positionsLocalService) {
        _positionsLocalService = positionsLocalService;
    }

    @Override
    public positionsLocalService getWrappedService() {
        return _positionsLocalService;
    }

    @Override
    public void setWrappedService(positionsLocalService positionsLocalService) {
        _positionsLocalService = positionsLocalService;
    }
}
