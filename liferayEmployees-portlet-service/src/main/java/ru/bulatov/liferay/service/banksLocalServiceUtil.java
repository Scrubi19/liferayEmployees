package ru.bulatov.liferay.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for banks. This utility wraps
 * {@link ru.bulatov.liferay.service.impl.banksLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see banksLocalService
 * @see ru.bulatov.liferay.service.base.banksLocalServiceBaseImpl
 * @see ru.bulatov.liferay.service.impl.banksLocalServiceImpl
 * @generated
 */
public class banksLocalServiceUtil {
    private static banksLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link ru.bulatov.liferay.service.impl.banksLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the banks to the database. Also notifies the appropriate model listeners.
    *
    * @param banks the banks
    * @return the banks that was added
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.banks addbanks(
        ru.bulatov.liferay.model.banks banks)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addbanks(banks);
    }

    /**
    * Creates a new banks with the primary key. Does not add the banks to the database.
    *
    * @param bank_id the primary key for the new banks
    * @return the new banks
    */
    public static ru.bulatov.liferay.model.banks createbanks(long bank_id) {
        return getService().createbanks(bank_id);
    }

    /**
    * Deletes the banks with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param bank_id the primary key of the banks
    * @return the banks that was removed
    * @throws PortalException if a banks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.banks deletebanks(long bank_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deletebanks(bank_id);
    }

    /**
    * Deletes the banks from the database. Also notifies the appropriate model listeners.
    *
    * @param banks the banks
    * @return the banks that was removed
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.banks deletebanks(
        ru.bulatov.liferay.model.banks banks)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deletebanks(banks);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.bulatov.liferay.model.impl.banksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static ru.bulatov.liferay.model.banks fetchbanks(long bank_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchbanks(bank_id);
    }

    /**
    * Returns the banks with the primary key.
    *
    * @param bank_id the primary key of the banks
    * @return the banks
    * @throws PortalException if a banks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.banks getbanks(long bank_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getbanks(bank_id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<ru.bulatov.liferay.model.banks> getbankses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getbankses(start, end);
    }

    /**
    * Returns the number of bankses.
    *
    * @return the number of bankses
    * @throws SystemException if a system exception occurred
    */
    public static int getbanksesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getbanksesCount();
    }

    /**
    * Updates the banks in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param banks the banks
    * @return the banks that was updated
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.banks updatebanks(
        ru.bulatov.liferay.model.banks banks)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updatebanks(banks);
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

    public static void clearService() {
        _service = null;
    }

    public static banksLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    banksLocalService.class.getName());

            if (invokableLocalService instanceof banksLocalService) {
                _service = (banksLocalService) invokableLocalService;
            } else {
                _service = new banksLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(banksLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(banksLocalService service) {
    }
}
