package ru.bulatov.liferay.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import ru.bulatov.liferay.model.employees;

import java.util.List;

/**
 * The persistence utility for the employees service. This utility wraps {@link employeesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see employeesPersistence
 * @see employeesPersistenceImpl
 * @generated
 */
public class employeesUtil {
    private static employeesPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(employees employees) {
        getPersistence().clearCache(employees);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<employees> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<employees> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<employees> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static employees update(employees employees)
        throws SystemException {
        return getPersistence().update(employees);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static employees update(employees employees,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(employees, serviceContext);
    }

    /**
    * Returns all the employeeses where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @return the matching employeeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.bulatov.liferay.model.employees> findByArchive(
        boolean archive_status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByArchive(archive_status);
    }

    /**
    * Returns a range of all the employeeses where archive_status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.bulatov.liferay.model.impl.employeesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param archive_status the archive_status
    * @param start the lower bound of the range of employeeses
    * @param end the upper bound of the range of employeeses (not inclusive)
    * @return the range of matching employeeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.bulatov.liferay.model.employees> findByArchive(
        boolean archive_status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByArchive(archive_status, start, end);
    }

    /**
    * Returns an ordered range of all the employeeses where archive_status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.bulatov.liferay.model.impl.employeesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param archive_status the archive_status
    * @param start the lower bound of the range of employeeses
    * @param end the upper bound of the range of employeeses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching employeeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.bulatov.liferay.model.employees> findByArchive(
        boolean archive_status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByArchive(archive_status, start, end, orderByComparator);
    }

    /**
    * Returns the first employees in the ordered set where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employees
    * @throws ru.bulatov.liferay.NoSuchemployeesException if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.employees findByArchive_First(
        boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchemployeesException {
        return getPersistence()
                   .findByArchive_First(archive_status, orderByComparator);
    }

    /**
    * Returns the first employees in the ordered set where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employees, or <code>null</code> if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.employees fetchByArchive_First(
        boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByArchive_First(archive_status, orderByComparator);
    }

    /**
    * Returns the last employees in the ordered set where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employees
    * @throws ru.bulatov.liferay.NoSuchemployeesException if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.employees findByArchive_Last(
        boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchemployeesException {
        return getPersistence()
                   .findByArchive_Last(archive_status, orderByComparator);
    }

    /**
    * Returns the last employees in the ordered set where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employees, or <code>null</code> if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.employees fetchByArchive_Last(
        boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByArchive_Last(archive_status, orderByComparator);
    }

    /**
    * Returns the employeeses before and after the current employees in the ordered set where archive_status = &#63;.
    *
    * @param employee_id the primary key of the current employees
    * @param archive_status the archive_status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next employees
    * @throws ru.bulatov.liferay.NoSuchemployeesException if a employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.employees[] findByArchive_PrevAndNext(
        long employee_id, boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchemployeesException {
        return getPersistence()
                   .findByArchive_PrevAndNext(employee_id, archive_status,
            orderByComparator);
    }

    /**
    * Removes all the employeeses where archive_status = &#63; from the database.
    *
    * @param archive_status the archive_status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByArchive(boolean archive_status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByArchive(archive_status);
    }

    /**
    * Returns the number of employeeses where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @return the number of matching employeeses
    * @throws SystemException if a system exception occurred
    */
    public static int countByArchive(boolean archive_status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByArchive(archive_status);
    }

    /**
    * Returns all the employeeses where bank_id = &#63;.
    *
    * @param bank_id the bank_id
    * @return the matching employeeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.bulatov.liferay.model.employees> findByBank_id(
        long bank_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByBank_id(bank_id);
    }

    /**
    * Returns a range of all the employeeses where bank_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.bulatov.liferay.model.impl.employeesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param bank_id the bank_id
    * @param start the lower bound of the range of employeeses
    * @param end the upper bound of the range of employeeses (not inclusive)
    * @return the range of matching employeeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.bulatov.liferay.model.employees> findByBank_id(
        long bank_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByBank_id(bank_id, start, end);
    }

    /**
    * Returns an ordered range of all the employeeses where bank_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.bulatov.liferay.model.impl.employeesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param bank_id the bank_id
    * @param start the lower bound of the range of employeeses
    * @param end the upper bound of the range of employeeses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching employeeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.bulatov.liferay.model.employees> findByBank_id(
        long bank_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByBank_id(bank_id, start, end, orderByComparator);
    }

    /**
    * Returns the first employees in the ordered set where bank_id = &#63;.
    *
    * @param bank_id the bank_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employees
    * @throws ru.bulatov.liferay.NoSuchemployeesException if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.employees findByBank_id_First(
        long bank_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchemployeesException {
        return getPersistence().findByBank_id_First(bank_id, orderByComparator);
    }

    /**
    * Returns the first employees in the ordered set where bank_id = &#63;.
    *
    * @param bank_id the bank_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employees, or <code>null</code> if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.employees fetchByBank_id_First(
        long bank_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByBank_id_First(bank_id, orderByComparator);
    }

    /**
    * Returns the last employees in the ordered set where bank_id = &#63;.
    *
    * @param bank_id the bank_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employees
    * @throws ru.bulatov.liferay.NoSuchemployeesException if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.employees findByBank_id_Last(
        long bank_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchemployeesException {
        return getPersistence().findByBank_id_Last(bank_id, orderByComparator);
    }

    /**
    * Returns the last employees in the ordered set where bank_id = &#63;.
    *
    * @param bank_id the bank_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employees, or <code>null</code> if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.employees fetchByBank_id_Last(
        long bank_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByBank_id_Last(bank_id, orderByComparator);
    }

    /**
    * Returns the employeeses before and after the current employees in the ordered set where bank_id = &#63;.
    *
    * @param employee_id the primary key of the current employees
    * @param bank_id the bank_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next employees
    * @throws ru.bulatov.liferay.NoSuchemployeesException if a employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.employees[] findByBank_id_PrevAndNext(
        long employee_id, long bank_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchemployeesException {
        return getPersistence()
                   .findByBank_id_PrevAndNext(employee_id, bank_id,
            orderByComparator);
    }

    /**
    * Removes all the employeeses where bank_id = &#63; from the database.
    *
    * @param bank_id the bank_id
    * @throws SystemException if a system exception occurred
    */
    public static void removeByBank_id(long bank_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByBank_id(bank_id);
    }

    /**
    * Returns the number of employeeses where bank_id = &#63;.
    *
    * @param bank_id the bank_id
    * @return the number of matching employeeses
    * @throws SystemException if a system exception occurred
    */
    public static int countByBank_id(long bank_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByBank_id(bank_id);
    }

    /**
    * Returns all the employeeses where position_id = &#63;.
    *
    * @param position_id the position_id
    * @return the matching employeeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.bulatov.liferay.model.employees> findByPosition_id(
        long position_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPosition_id(position_id);
    }

    /**
    * Returns a range of all the employeeses where position_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.bulatov.liferay.model.impl.employeesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param position_id the position_id
    * @param start the lower bound of the range of employeeses
    * @param end the upper bound of the range of employeeses (not inclusive)
    * @return the range of matching employeeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.bulatov.liferay.model.employees> findByPosition_id(
        long position_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPosition_id(position_id, start, end);
    }

    /**
    * Returns an ordered range of all the employeeses where position_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.bulatov.liferay.model.impl.employeesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param position_id the position_id
    * @param start the lower bound of the range of employeeses
    * @param end the upper bound of the range of employeeses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching employeeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.bulatov.liferay.model.employees> findByPosition_id(
        long position_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByPosition_id(position_id, start, end, orderByComparator);
    }

    /**
    * Returns the first employees in the ordered set where position_id = &#63;.
    *
    * @param position_id the position_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employees
    * @throws ru.bulatov.liferay.NoSuchemployeesException if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.employees findByPosition_id_First(
        long position_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchemployeesException {
        return getPersistence()
                   .findByPosition_id_First(position_id, orderByComparator);
    }

    /**
    * Returns the first employees in the ordered set where position_id = &#63;.
    *
    * @param position_id the position_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employees, or <code>null</code> if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.employees fetchByPosition_id_First(
        long position_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByPosition_id_First(position_id, orderByComparator);
    }

    /**
    * Returns the last employees in the ordered set where position_id = &#63;.
    *
    * @param position_id the position_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employees
    * @throws ru.bulatov.liferay.NoSuchemployeesException if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.employees findByPosition_id_Last(
        long position_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchemployeesException {
        return getPersistence()
                   .findByPosition_id_Last(position_id, orderByComparator);
    }

    /**
    * Returns the last employees in the ordered set where position_id = &#63;.
    *
    * @param position_id the position_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employees, or <code>null</code> if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.employees fetchByPosition_id_Last(
        long position_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByPosition_id_Last(position_id, orderByComparator);
    }

    /**
    * Returns the employeeses before and after the current employees in the ordered set where position_id = &#63;.
    *
    * @param employee_id the primary key of the current employees
    * @param position_id the position_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next employees
    * @throws ru.bulatov.liferay.NoSuchemployeesException if a employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.employees[] findByPosition_id_PrevAndNext(
        long employee_id, long position_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchemployeesException {
        return getPersistence()
                   .findByPosition_id_PrevAndNext(employee_id, position_id,
            orderByComparator);
    }

    /**
    * Removes all the employeeses where position_id = &#63; from the database.
    *
    * @param position_id the position_id
    * @throws SystemException if a system exception occurred
    */
    public static void removeByPosition_id(long position_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByPosition_id(position_id);
    }

    /**
    * Returns the number of employeeses where position_id = &#63;.
    *
    * @param position_id the position_id
    * @return the number of matching employeeses
    * @throws SystemException if a system exception occurred
    */
    public static int countByPosition_id(long position_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByPosition_id(position_id);
    }

    /**
    * Caches the employees in the entity cache if it is enabled.
    *
    * @param employees the employees
    */
    public static void cacheResult(ru.bulatov.liferay.model.employees employees) {
        getPersistence().cacheResult(employees);
    }

    /**
    * Caches the employeeses in the entity cache if it is enabled.
    *
    * @param employeeses the employeeses
    */
    public static void cacheResult(
        java.util.List<ru.bulatov.liferay.model.employees> employeeses) {
        getPersistence().cacheResult(employeeses);
    }

    /**
    * Creates a new employees with the primary key. Does not add the employees to the database.
    *
    * @param employee_id the primary key for the new employees
    * @return the new employees
    */
    public static ru.bulatov.liferay.model.employees create(long employee_id) {
        return getPersistence().create(employee_id);
    }

    /**
    * Removes the employees with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param employee_id the primary key of the employees
    * @return the employees that was removed
    * @throws ru.bulatov.liferay.NoSuchemployeesException if a employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.employees remove(long employee_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchemployeesException {
        return getPersistence().remove(employee_id);
    }

    public static ru.bulatov.liferay.model.employees updateImpl(
        ru.bulatov.liferay.model.employees employees)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(employees);
    }

    /**
    * Returns the employees with the primary key or throws a {@link ru.bulatov.liferay.NoSuchemployeesException} if it could not be found.
    *
    * @param employee_id the primary key of the employees
    * @return the employees
    * @throws ru.bulatov.liferay.NoSuchemployeesException if a employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.employees findByPrimaryKey(
        long employee_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchemployeesException {
        return getPersistence().findByPrimaryKey(employee_id);
    }

    /**
    * Returns the employees with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param employee_id the primary key of the employees
    * @return the employees, or <code>null</code> if a employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.bulatov.liferay.model.employees fetchByPrimaryKey(
        long employee_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(employee_id);
    }

    /**
    * Returns all the employeeses.
    *
    * @return the employeeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.bulatov.liferay.model.employees> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<ru.bulatov.liferay.model.employees> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the employeeses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.bulatov.liferay.model.impl.employeesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of employeeses
    * @param end the upper bound of the range of employeeses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of employeeses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.bulatov.liferay.model.employees> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the employeeses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of employeeses.
    *
    * @return the number of employeeses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static employeesPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (employeesPersistence) PortletBeanLocatorUtil.locate(ru.bulatov.liferay.service.ClpSerializer.getServletContextName(),
                    employeesPersistence.class.getName());

            ReferenceRegistry.registerReference(employeesUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(employeesPersistence persistence) {
    }
}
