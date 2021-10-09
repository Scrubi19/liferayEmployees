package ru.bulatov.liferay.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import ru.bulatov.liferay.model.employees;

/**
 * The persistence interface for the employees service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see employeesPersistenceImpl
 * @see employeesUtil
 * @generated
 */
public interface employeesPersistence extends BasePersistence<employees> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link employeesUtil} to access the employees persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the employeeses where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @return the matching employeeses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.bulatov.liferay.model.employees> findByArchive(
        boolean archive_status)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.bulatov.liferay.model.employees> findByArchive(
        boolean archive_status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.bulatov.liferay.model.employees> findByArchive(
        boolean archive_status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first employees in the ordered set where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employees
    * @throws ru.bulatov.liferay.NoSuchemployeesException if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.bulatov.liferay.model.employees findByArchive_First(
        boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchemployeesException;

    /**
    * Returns the first employees in the ordered set where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employees, or <code>null</code> if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.bulatov.liferay.model.employees fetchByArchive_First(
        boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last employees in the ordered set where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employees
    * @throws ru.bulatov.liferay.NoSuchemployeesException if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.bulatov.liferay.model.employees findByArchive_Last(
        boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchemployeesException;

    /**
    * Returns the last employees in the ordered set where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employees, or <code>null</code> if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.bulatov.liferay.model.employees fetchByArchive_Last(
        boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public ru.bulatov.liferay.model.employees[] findByArchive_PrevAndNext(
        long employee_id, boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchemployeesException;

    /**
    * Removes all the employeeses where archive_status = &#63; from the database.
    *
    * @param archive_status the archive_status
    * @throws SystemException if a system exception occurred
    */
    public void removeByArchive(boolean archive_status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of employeeses where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @return the number of matching employeeses
    * @throws SystemException if a system exception occurred
    */
    public int countByArchive(boolean archive_status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the employeeses where bank_id = &#63;.
    *
    * @param bank_id the bank_id
    * @return the matching employeeses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.bulatov.liferay.model.employees> findByBank_id(
        long bank_id)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.bulatov.liferay.model.employees> findByBank_id(
        long bank_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.bulatov.liferay.model.employees> findByBank_id(
        long bank_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first employees in the ordered set where bank_id = &#63;.
    *
    * @param bank_id the bank_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employees
    * @throws ru.bulatov.liferay.NoSuchemployeesException if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.bulatov.liferay.model.employees findByBank_id_First(
        long bank_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchemployeesException;

    /**
    * Returns the first employees in the ordered set where bank_id = &#63;.
    *
    * @param bank_id the bank_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employees, or <code>null</code> if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.bulatov.liferay.model.employees fetchByBank_id_First(
        long bank_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last employees in the ordered set where bank_id = &#63;.
    *
    * @param bank_id the bank_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employees
    * @throws ru.bulatov.liferay.NoSuchemployeesException if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.bulatov.liferay.model.employees findByBank_id_Last(long bank_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchemployeesException;

    /**
    * Returns the last employees in the ordered set where bank_id = &#63;.
    *
    * @param bank_id the bank_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employees, or <code>null</code> if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.bulatov.liferay.model.employees fetchByBank_id_Last(
        long bank_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public ru.bulatov.liferay.model.employees[] findByBank_id_PrevAndNext(
        long employee_id, long bank_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchemployeesException;

    /**
    * Removes all the employeeses where bank_id = &#63; from the database.
    *
    * @param bank_id the bank_id
    * @throws SystemException if a system exception occurred
    */
    public void removeByBank_id(long bank_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of employeeses where bank_id = &#63;.
    *
    * @param bank_id the bank_id
    * @return the number of matching employeeses
    * @throws SystemException if a system exception occurred
    */
    public int countByBank_id(long bank_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the employeeses where position_id = &#63;.
    *
    * @param position_id the position_id
    * @return the matching employeeses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.bulatov.liferay.model.employees> findByPosition_id(
        long position_id)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.bulatov.liferay.model.employees> findByPosition_id(
        long position_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.bulatov.liferay.model.employees> findByPosition_id(
        long position_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first employees in the ordered set where position_id = &#63;.
    *
    * @param position_id the position_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employees
    * @throws ru.bulatov.liferay.NoSuchemployeesException if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.bulatov.liferay.model.employees findByPosition_id_First(
        long position_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchemployeesException;

    /**
    * Returns the first employees in the ordered set where position_id = &#63;.
    *
    * @param position_id the position_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employees, or <code>null</code> if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.bulatov.liferay.model.employees fetchByPosition_id_First(
        long position_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last employees in the ordered set where position_id = &#63;.
    *
    * @param position_id the position_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employees
    * @throws ru.bulatov.liferay.NoSuchemployeesException if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.bulatov.liferay.model.employees findByPosition_id_Last(
        long position_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchemployeesException;

    /**
    * Returns the last employees in the ordered set where position_id = &#63;.
    *
    * @param position_id the position_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employees, or <code>null</code> if a matching employees could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.bulatov.liferay.model.employees fetchByPosition_id_Last(
        long position_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public ru.bulatov.liferay.model.employees[] findByPosition_id_PrevAndNext(
        long employee_id, long position_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchemployeesException;

    /**
    * Removes all the employeeses where position_id = &#63; from the database.
    *
    * @param position_id the position_id
    * @throws SystemException if a system exception occurred
    */
    public void removeByPosition_id(long position_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of employeeses where position_id = &#63;.
    *
    * @param position_id the position_id
    * @return the number of matching employeeses
    * @throws SystemException if a system exception occurred
    */
    public int countByPosition_id(long position_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the employees in the entity cache if it is enabled.
    *
    * @param employees the employees
    */
    public void cacheResult(ru.bulatov.liferay.model.employees employees);

    /**
    * Caches the employeeses in the entity cache if it is enabled.
    *
    * @param employeeses the employeeses
    */
    public void cacheResult(
        java.util.List<ru.bulatov.liferay.model.employees> employeeses);

    /**
    * Creates a new employees with the primary key. Does not add the employees to the database.
    *
    * @param employee_id the primary key for the new employees
    * @return the new employees
    */
    public ru.bulatov.liferay.model.employees create(long employee_id);

    /**
    * Removes the employees with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param employee_id the primary key of the employees
    * @return the employees that was removed
    * @throws ru.bulatov.liferay.NoSuchemployeesException if a employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.bulatov.liferay.model.employees remove(long employee_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchemployeesException;

    public ru.bulatov.liferay.model.employees updateImpl(
        ru.bulatov.liferay.model.employees employees)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the employees with the primary key or throws a {@link ru.bulatov.liferay.NoSuchemployeesException} if it could not be found.
    *
    * @param employee_id the primary key of the employees
    * @return the employees
    * @throws ru.bulatov.liferay.NoSuchemployeesException if a employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.bulatov.liferay.model.employees findByPrimaryKey(long employee_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.bulatov.liferay.NoSuchemployeesException;

    /**
    * Returns the employees with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param employee_id the primary key of the employees
    * @return the employees, or <code>null</code> if a employees with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.bulatov.liferay.model.employees fetchByPrimaryKey(
        long employee_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the employeeses.
    *
    * @return the employeeses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.bulatov.liferay.model.employees> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.bulatov.liferay.model.employees> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.bulatov.liferay.model.employees> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the employeeses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of employeeses.
    *
    * @return the number of employeeses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
