package ru.bulatov.liferay.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for positions. This utility wraps
 * {@link ru.bulatov.liferay.service.impl.positionsLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see positionsLocalService
 * @see ru.bulatov.liferay.service.base.positionsLocalServiceBaseImpl
 * @see ru.bulatov.liferay.service.impl.positionsLocalServiceImpl
 * @generated
 */
public class positionsLocalServiceUtil {
    private static positionsLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link ru.bulatov.liferay.service.impl.positionsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the positions to the database. Also notifies the appropriate model listeners.
    *
    * @param positions the positions
    * @return the positions that was added
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.positions addpositions(
        ru.bulatov.liferay.model.positions positions)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addpositions(positions);
    }

    /**
    * Creates a new positions with the primary key. Does not add the positions to the database.
    *
    * @param position_id the primary key for the new positions
    * @return the new positions
    */
    public static ru.bulatov.liferay.model.positions createpositions(
        long position_id) {
        return getService().createpositions(position_id);
    }

    /**
    * Deletes the positions with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param position_id the primary key of the positions
    * @return the positions that was removed
    * @throws PortalException if a positions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.positions deletepositions(
        long position_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deletepositions(position_id);
    }

    /**
    * Deletes the positions from the database. Also notifies the appropriate model listeners.
    *
    * @param positions the positions
    * @return the positions that was removed
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.positions deletepositions(
        ru.bulatov.liferay.model.positions positions)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deletepositions(positions);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static ru.bulatov.liferay.model.positions fetchpositions(
        long position_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchpositions(position_id);
    }

    /**
    * Returns the positions with the primary key.
    *
    * @param position_id the primary key of the positions
    * @return the positions
    * @throws PortalException if a positions with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.positions getpositions(
        long position_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getpositions(position_id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<ru.bulatov.liferay.model.positions> getpositionses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getpositionses(start, end);
    }

    /**
    * Returns the number of positionses.
    *
    * @return the number of positionses
    * @throws SystemException if a system exception occurred
    */
    public static int getpositionsesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getpositionsesCount();
    }

    /**
    * Updates the positions in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param positions the positions
    * @return the positions that was updated
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.positions updatepositions(
        ru.bulatov.liferay.model.positions positions)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updatepositions(positions);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static java.util.List<ru.bulatov.liferay.model.positions> getpositionsesByArchive(
        boolean archive, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getpositionsesByArchive(archive, start, end);
    }

    public static void clearService() {
        _service = null;
    }

    public static positionsLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    positionsLocalService.class.getName());

            if (invokableLocalService instanceof positionsLocalService) {
                _service = (positionsLocalService) invokableLocalService;
            } else {
                _service = new positionsLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(positionsLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(positionsLocalService service) {
    }
}
