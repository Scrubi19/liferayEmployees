package ru.bulatov.liferay.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import ru.bulatov.liferay.NoSuchemployeesException;
import ru.bulatov.liferay.model.employees;
import ru.bulatov.liferay.model.impl.employeesImpl;
import ru.bulatov.liferay.model.impl.employeesModelImpl;
import ru.bulatov.liferay.service.persistence.employeesPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the employees service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see employeesPersistence
 * @see employeesUtil
 * @generated
 */
public class employeesPersistenceImpl extends BasePersistenceImpl<employees>
    implements employeesPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link employeesUtil} to access the employees persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = employeesImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(employeesModelImpl.ENTITY_CACHE_ENABLED,
            employeesModelImpl.FINDER_CACHE_ENABLED, employeesImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(employeesModelImpl.ENTITY_CACHE_ENABLED,
            employeesModelImpl.FINDER_CACHE_ENABLED, employeesImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(employeesModelImpl.ENTITY_CACHE_ENABLED,
            employeesModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ARCHIVE = new FinderPath(employeesModelImpl.ENTITY_CACHE_ENABLED,
            employeesModelImpl.FINDER_CACHE_ENABLED, employeesImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByArchive",
            new String[] {
                Boolean.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVE =
        new FinderPath(employeesModelImpl.ENTITY_CACHE_ENABLED,
            employeesModelImpl.FINDER_CACHE_ENABLED, employeesImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByArchive",
            new String[] { Boolean.class.getName() },
            employeesModelImpl.ARCHIVE_STATUS_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ARCHIVE = new FinderPath(employeesModelImpl.ENTITY_CACHE_ENABLED,
            employeesModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByArchive",
            new String[] { Boolean.class.getName() });
    private static final String _FINDER_COLUMN_ARCHIVE_ARCHIVE_STATUS_2 = "employees.archive_status = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BANK_ID = new FinderPath(employeesModelImpl.ENTITY_CACHE_ENABLED,
            employeesModelImpl.FINDER_CACHE_ENABLED, employeesImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByBank_id",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANK_ID =
        new FinderPath(employeesModelImpl.ENTITY_CACHE_ENABLED,
            employeesModelImpl.FINDER_CACHE_ENABLED, employeesImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByBank_id",
            new String[] { Long.class.getName() },
            employeesModelImpl.BANK_ID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_BANK_ID = new FinderPath(employeesModelImpl.ENTITY_CACHE_ENABLED,
            employeesModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByBank_id",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_BANK_ID_BANK_ID_2 = "employees.bank_id = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_POSITION_ID =
        new FinderPath(employeesModelImpl.ENTITY_CACHE_ENABLED,
            employeesModelImpl.FINDER_CACHE_ENABLED, employeesImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPosition_id",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSITION_ID =
        new FinderPath(employeesModelImpl.ENTITY_CACHE_ENABLED,
            employeesModelImpl.FINDER_CACHE_ENABLED, employeesImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPosition_id",
            new String[] { Long.class.getName() },
            employeesModelImpl.POSITION_ID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_POSITION_ID = new FinderPath(employeesModelImpl.ENTITY_CACHE_ENABLED,
            employeesModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPosition_id",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_POSITION_ID_POSITION_ID_2 = "employees.position_id = ?";
    private static final String _SQL_SELECT_EMPLOYEES = "SELECT employees FROM employees employees";
    private static final String _SQL_SELECT_EMPLOYEES_WHERE = "SELECT employees FROM employees employees WHERE ";
    private static final String _SQL_COUNT_EMPLOYEES = "SELECT COUNT(employees) FROM employees employees";
    private static final String _SQL_COUNT_EMPLOYEES_WHERE = "SELECT COUNT(employees) FROM employees employees WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "employees.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No employees exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No employees exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(employeesPersistenceImpl.class);
    private static employees _nullemployees = new employeesImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<employees> toCacheModel() {
                return _nullemployeesCacheModel;
            }
        };

    private static CacheModel<employees> _nullemployeesCacheModel = new CacheModel<employees>() {
            @Override
            public employees toEntityModel() {
                return _nullemployees;
            }
        };

    public employeesPersistenceImpl() {
        setModelClass(employees.class);
    }

    /**
     * Returns all the employeeses where archive_status = &#63;.
     *
     * @param archive_status the archive_status
     * @return the matching employeeses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<employees> findByArchive(boolean archive_status)
        throws SystemException {
        return findByArchive(archive_status, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<employees> findByArchive(boolean archive_status, int start,
        int end) throws SystemException {
        return findByArchive(archive_status, start, end, null);
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
    @Override
    public List<employees> findByArchive(boolean archive_status, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVE;
            finderArgs = new Object[] { archive_status };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ARCHIVE;
            finderArgs = new Object[] {
                    archive_status,
                    
                    start, end, orderByComparator
                };
        }

        List<employees> list = (List<employees>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (employees employees : list) {
                if ((archive_status != employees.getArchive_status())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_EMPLOYEES_WHERE);

            query.append(_FINDER_COLUMN_ARCHIVE_ARCHIVE_STATUS_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(employeesModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(archive_status);

                if (!pagination) {
                    list = (List<employees>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<employees>(list);
                } else {
                    list = (List<employees>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public employees findByArchive_First(boolean archive_status,
        OrderByComparator orderByComparator)
        throws NoSuchemployeesException, SystemException {
        employees employees = fetchByArchive_First(archive_status,
                orderByComparator);

        if (employees != null) {
            return employees;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("archive_status=");
        msg.append(archive_status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchemployeesException(msg.toString());
    }

    /**
     * Returns the first employees in the ordered set where archive_status = &#63;.
     *
     * @param archive_status the archive_status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching employees, or <code>null</code> if a matching employees could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public employees fetchByArchive_First(boolean archive_status,
        OrderByComparator orderByComparator) throws SystemException {
        List<employees> list = findByArchive(archive_status, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public employees findByArchive_Last(boolean archive_status,
        OrderByComparator orderByComparator)
        throws NoSuchemployeesException, SystemException {
        employees employees = fetchByArchive_Last(archive_status,
                orderByComparator);

        if (employees != null) {
            return employees;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("archive_status=");
        msg.append(archive_status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchemployeesException(msg.toString());
    }

    /**
     * Returns the last employees in the ordered set where archive_status = &#63;.
     *
     * @param archive_status the archive_status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching employees, or <code>null</code> if a matching employees could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public employees fetchByArchive_Last(boolean archive_status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByArchive(archive_status);

        if (count == 0) {
            return null;
        }

        List<employees> list = findByArchive(archive_status, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public employees[] findByArchive_PrevAndNext(long employee_id,
        boolean archive_status, OrderByComparator orderByComparator)
        throws NoSuchemployeesException, SystemException {
        employees employees = findByPrimaryKey(employee_id);

        Session session = null;

        try {
            session = openSession();

            employees[] array = new employeesImpl[3];

            array[0] = getByArchive_PrevAndNext(session, employees,
                    archive_status, orderByComparator, true);

            array[1] = employees;

            array[2] = getByArchive_PrevAndNext(session, employees,
                    archive_status, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected employees getByArchive_PrevAndNext(Session session,
        employees employees, boolean archive_status,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EMPLOYEES_WHERE);

        query.append(_FINDER_COLUMN_ARCHIVE_ARCHIVE_STATUS_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(employeesModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(archive_status);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(employees);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<employees> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the employeeses where archive_status = &#63; from the database.
     *
     * @param archive_status the archive_status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByArchive(boolean archive_status)
        throws SystemException {
        for (employees employees : findByArchive(archive_status,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(employees);
        }
    }

    /**
     * Returns the number of employeeses where archive_status = &#63;.
     *
     * @param archive_status the archive_status
     * @return the number of matching employeeses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByArchive(boolean archive_status) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ARCHIVE;

        Object[] finderArgs = new Object[] { archive_status };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_EMPLOYEES_WHERE);

            query.append(_FINDER_COLUMN_ARCHIVE_ARCHIVE_STATUS_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(archive_status);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the employeeses where bank_id = &#63;.
     *
     * @param bank_id the bank_id
     * @return the matching employeeses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<employees> findByBank_id(long bank_id)
        throws SystemException {
        return findByBank_id(bank_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<employees> findByBank_id(long bank_id, int start, int end)
        throws SystemException {
        return findByBank_id(bank_id, start, end, null);
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
    @Override
    public List<employees> findByBank_id(long bank_id, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANK_ID;
            finderArgs = new Object[] { bank_id };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BANK_ID;
            finderArgs = new Object[] { bank_id, start, end, orderByComparator };
        }

        List<employees> list = (List<employees>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (employees employees : list) {
                if ((bank_id != employees.getBank_id())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_EMPLOYEES_WHERE);

            query.append(_FINDER_COLUMN_BANK_ID_BANK_ID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(employeesModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(bank_id);

                if (!pagination) {
                    list = (List<employees>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<employees>(list);
                } else {
                    list = (List<employees>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public employees findByBank_id_First(long bank_id,
        OrderByComparator orderByComparator)
        throws NoSuchemployeesException, SystemException {
        employees employees = fetchByBank_id_First(bank_id, orderByComparator);

        if (employees != null) {
            return employees;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("bank_id=");
        msg.append(bank_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchemployeesException(msg.toString());
    }

    /**
     * Returns the first employees in the ordered set where bank_id = &#63;.
     *
     * @param bank_id the bank_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching employees, or <code>null</code> if a matching employees could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public employees fetchByBank_id_First(long bank_id,
        OrderByComparator orderByComparator) throws SystemException {
        List<employees> list = findByBank_id(bank_id, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public employees findByBank_id_Last(long bank_id,
        OrderByComparator orderByComparator)
        throws NoSuchemployeesException, SystemException {
        employees employees = fetchByBank_id_Last(bank_id, orderByComparator);

        if (employees != null) {
            return employees;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("bank_id=");
        msg.append(bank_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchemployeesException(msg.toString());
    }

    /**
     * Returns the last employees in the ordered set where bank_id = &#63;.
     *
     * @param bank_id the bank_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching employees, or <code>null</code> if a matching employees could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public employees fetchByBank_id_Last(long bank_id,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByBank_id(bank_id);

        if (count == 0) {
            return null;
        }

        List<employees> list = findByBank_id(bank_id, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public employees[] findByBank_id_PrevAndNext(long employee_id,
        long bank_id, OrderByComparator orderByComparator)
        throws NoSuchemployeesException, SystemException {
        employees employees = findByPrimaryKey(employee_id);

        Session session = null;

        try {
            session = openSession();

            employees[] array = new employeesImpl[3];

            array[0] = getByBank_id_PrevAndNext(session, employees, bank_id,
                    orderByComparator, true);

            array[1] = employees;

            array[2] = getByBank_id_PrevAndNext(session, employees, bank_id,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected employees getByBank_id_PrevAndNext(Session session,
        employees employees, long bank_id, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EMPLOYEES_WHERE);

        query.append(_FINDER_COLUMN_BANK_ID_BANK_ID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(employeesModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(bank_id);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(employees);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<employees> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the employeeses where bank_id = &#63; from the database.
     *
     * @param bank_id the bank_id
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByBank_id(long bank_id) throws SystemException {
        for (employees employees : findByBank_id(bank_id, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(employees);
        }
    }

    /**
     * Returns the number of employeeses where bank_id = &#63;.
     *
     * @param bank_id the bank_id
     * @return the number of matching employeeses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByBank_id(long bank_id) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_BANK_ID;

        Object[] finderArgs = new Object[] { bank_id };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_EMPLOYEES_WHERE);

            query.append(_FINDER_COLUMN_BANK_ID_BANK_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(bank_id);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the employeeses where position_id = &#63;.
     *
     * @param position_id the position_id
     * @return the matching employeeses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<employees> findByPosition_id(long position_id)
        throws SystemException {
        return findByPosition_id(position_id, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<employees> findByPosition_id(long position_id, int start,
        int end) throws SystemException {
        return findByPosition_id(position_id, start, end, null);
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
    @Override
    public List<employees> findByPosition_id(long position_id, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSITION_ID;
            finderArgs = new Object[] { position_id };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_POSITION_ID;
            finderArgs = new Object[] { position_id, start, end, orderByComparator };
        }

        List<employees> list = (List<employees>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (employees employees : list) {
                if ((position_id != employees.getPosition_id())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_EMPLOYEES_WHERE);

            query.append(_FINDER_COLUMN_POSITION_ID_POSITION_ID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(employeesModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(position_id);

                if (!pagination) {
                    list = (List<employees>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<employees>(list);
                } else {
                    list = (List<employees>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public employees findByPosition_id_First(long position_id,
        OrderByComparator orderByComparator)
        throws NoSuchemployeesException, SystemException {
        employees employees = fetchByPosition_id_First(position_id,
                orderByComparator);

        if (employees != null) {
            return employees;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("position_id=");
        msg.append(position_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchemployeesException(msg.toString());
    }

    /**
     * Returns the first employees in the ordered set where position_id = &#63;.
     *
     * @param position_id the position_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching employees, or <code>null</code> if a matching employees could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public employees fetchByPosition_id_First(long position_id,
        OrderByComparator orderByComparator) throws SystemException {
        List<employees> list = findByPosition_id(position_id, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public employees findByPosition_id_Last(long position_id,
        OrderByComparator orderByComparator)
        throws NoSuchemployeesException, SystemException {
        employees employees = fetchByPosition_id_Last(position_id,
                orderByComparator);

        if (employees != null) {
            return employees;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("position_id=");
        msg.append(position_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchemployeesException(msg.toString());
    }

    /**
     * Returns the last employees in the ordered set where position_id = &#63;.
     *
     * @param position_id the position_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching employees, or <code>null</code> if a matching employees could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public employees fetchByPosition_id_Last(long position_id,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByPosition_id(position_id);

        if (count == 0) {
            return null;
        }

        List<employees> list = findByPosition_id(position_id, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public employees[] findByPosition_id_PrevAndNext(long employee_id,
        long position_id, OrderByComparator orderByComparator)
        throws NoSuchemployeesException, SystemException {
        employees employees = findByPrimaryKey(employee_id);

        Session session = null;

        try {
            session = openSession();

            employees[] array = new employeesImpl[3];

            array[0] = getByPosition_id_PrevAndNext(session, employees,
                    position_id, orderByComparator, true);

            array[1] = employees;

            array[2] = getByPosition_id_PrevAndNext(session, employees,
                    position_id, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected employees getByPosition_id_PrevAndNext(Session session,
        employees employees, long position_id,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EMPLOYEES_WHERE);

        query.append(_FINDER_COLUMN_POSITION_ID_POSITION_ID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(employeesModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(position_id);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(employees);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<employees> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the employeeses where position_id = &#63; from the database.
     *
     * @param position_id the position_id
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByPosition_id(long position_id) throws SystemException {
        for (employees employees : findByPosition_id(position_id,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(employees);
        }
    }

    /**
     * Returns the number of employeeses where position_id = &#63;.
     *
     * @param position_id the position_id
     * @return the number of matching employeeses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByPosition_id(long position_id) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_POSITION_ID;

        Object[] finderArgs = new Object[] { position_id };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_EMPLOYEES_WHERE);

            query.append(_FINDER_COLUMN_POSITION_ID_POSITION_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(position_id);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the employees in the entity cache if it is enabled.
     *
     * @param employees the employees
     */
    @Override
    public void cacheResult(employees employees) {
        EntityCacheUtil.putResult(employeesModelImpl.ENTITY_CACHE_ENABLED,
            employeesImpl.class, employees.getPrimaryKey(), employees);

        employees.resetOriginalValues();
    }

    /**
     * Caches the employeeses in the entity cache if it is enabled.
     *
     * @param employeeses the employeeses
     */
    @Override
    public void cacheResult(List<employees> employeeses) {
        for (employees employees : employeeses) {
            if (EntityCacheUtil.getResult(
                        employeesModelImpl.ENTITY_CACHE_ENABLED,
                        employeesImpl.class, employees.getPrimaryKey()) == null) {
                cacheResult(employees);
            } else {
                employees.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all employeeses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(employeesImpl.class.getName());
        }

        EntityCacheUtil.clearCache(employeesImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the employees.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(employees employees) {
        EntityCacheUtil.removeResult(employeesModelImpl.ENTITY_CACHE_ENABLED,
            employeesImpl.class, employees.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<employees> employeeses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (employees employees : employeeses) {
            EntityCacheUtil.removeResult(employeesModelImpl.ENTITY_CACHE_ENABLED,
                employeesImpl.class, employees.getPrimaryKey());
        }
    }

    /**
     * Creates a new employees with the primary key. Does not add the employees to the database.
     *
     * @param employee_id the primary key for the new employees
     * @return the new employees
     */
    @Override
    public employees create(long employee_id) {
        employees employees = new employeesImpl();

        employees.setNew(true);
        employees.setPrimaryKey(employee_id);

        return employees;
    }

    /**
     * Removes the employees with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param employee_id the primary key of the employees
     * @return the employees that was removed
     * @throws ru.bulatov.liferay.NoSuchemployeesException if a employees with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public employees remove(long employee_id)
        throws NoSuchemployeesException, SystemException {
        return remove((Serializable) employee_id);
    }

    /**
     * Removes the employees with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the employees
     * @return the employees that was removed
     * @throws ru.bulatov.liferay.NoSuchemployeesException if a employees with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public employees remove(Serializable primaryKey)
        throws NoSuchemployeesException, SystemException {
        Session session = null;

        try {
            session = openSession();

            employees employees = (employees) session.get(employeesImpl.class,
                    primaryKey);

            if (employees == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchemployeesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(employees);
        } catch (NoSuchemployeesException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected employees removeImpl(employees employees)
        throws SystemException {
        employees = toUnwrappedModel(employees);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(employees)) {
                employees = (employees) session.get(employeesImpl.class,
                        employees.getPrimaryKeyObj());
            }

            if (employees != null) {
                session.delete(employees);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (employees != null) {
            clearCache(employees);
        }

        return employees;
    }

    @Override
    public employees updateImpl(ru.bulatov.liferay.model.employees employees)
        throws SystemException {
        employees = toUnwrappedModel(employees);

        boolean isNew = employees.isNew();

        employeesModelImpl employeesModelImpl = (employeesModelImpl) employees;

        Session session = null;

        try {
            session = openSession();

            if (employees.isNew()) {
                session.save(employees);

                employees.setNew(false);
            } else {
                session.merge(employees);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !employeesModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((employeesModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVE.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        employeesModelImpl.getOriginalArchive_status()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ARCHIVE, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVE,
                    args);

                args = new Object[] { employeesModelImpl.getArchive_status() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ARCHIVE, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVE,
                    args);
            }

            if ((employeesModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANK_ID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        employeesModelImpl.getOriginalBank_id()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BANK_ID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANK_ID,
                    args);

                args = new Object[] { employeesModelImpl.getBank_id() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BANK_ID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANK_ID,
                    args);
            }

            if ((employeesModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSITION_ID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        employeesModelImpl.getOriginalPosition_id()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_POSITION_ID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSITION_ID,
                    args);

                args = new Object[] { employeesModelImpl.getPosition_id() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_POSITION_ID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSITION_ID,
                    args);
            }
        }

        EntityCacheUtil.putResult(employeesModelImpl.ENTITY_CACHE_ENABLED,
            employeesImpl.class, employees.getPrimaryKey(), employees);

        return employees;
    }

    protected employees toUnwrappedModel(employees employees) {
        if (employees instanceof employeesImpl) {
            return employees;
        }

        employeesImpl employeesImpl = new employeesImpl();

        employeesImpl.setNew(employees.isNew());
        employeesImpl.setPrimaryKey(employees.getPrimaryKey());

        employeesImpl.setEmployee_id(employees.getEmployee_id());
        employeesImpl.setLastname(employees.getLastname());
        employeesImpl.setFirstname(employees.getFirstname());
        employeesImpl.setMiddlename(employees.getMiddlename());
        employeesImpl.setGender(employees.getGender());
        employeesImpl.setDate_of_birth(employees.getDate_of_birth());
        employeesImpl.setDate_of_employment(employees.getDate_of_employment());
        employeesImpl.setPosition_id(employees.getPosition_id());
        employeesImpl.setSalary(employees.getSalary());
        employeesImpl.setWork_phonenumber(employees.getWork_phonenumber());
        employeesImpl.setMobile_phonenumber(employees.getMobile_phonenumber());
        employeesImpl.setBank_id(employees.getBank_id());
        employeesImpl.setArchive_status(employees.isArchive_status());

        return employeesImpl;
    }

    /**
     * Returns the employees with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the employees
     * @return the employees
     * @throws ru.bulatov.liferay.NoSuchemployeesException if a employees with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public employees findByPrimaryKey(Serializable primaryKey)
        throws NoSuchemployeesException, SystemException {
        employees employees = fetchByPrimaryKey(primaryKey);

        if (employees == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchemployeesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return employees;
    }

    /**
     * Returns the employees with the primary key or throws a {@link ru.bulatov.liferay.NoSuchemployeesException} if it could not be found.
     *
     * @param employee_id the primary key of the employees
     * @return the employees
     * @throws ru.bulatov.liferay.NoSuchemployeesException if a employees with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public employees findByPrimaryKey(long employee_id)
        throws NoSuchemployeesException, SystemException {
        return findByPrimaryKey((Serializable) employee_id);
    }

    /**
     * Returns the employees with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the employees
     * @return the employees, or <code>null</code> if a employees with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public employees fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        employees employees = (employees) EntityCacheUtil.getResult(employeesModelImpl.ENTITY_CACHE_ENABLED,
                employeesImpl.class, primaryKey);

        if (employees == _nullemployees) {
            return null;
        }

        if (employees == null) {
            Session session = null;

            try {
                session = openSession();

                employees = (employees) session.get(employeesImpl.class,
                        primaryKey);

                if (employees != null) {
                    cacheResult(employees);
                } else {
                    EntityCacheUtil.putResult(employeesModelImpl.ENTITY_CACHE_ENABLED,
                        employeesImpl.class, primaryKey, _nullemployees);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(employeesModelImpl.ENTITY_CACHE_ENABLED,
                    employeesImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return employees;
    }

    /**
     * Returns the employees with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param employee_id the primary key of the employees
     * @return the employees, or <code>null</code> if a employees with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public employees fetchByPrimaryKey(long employee_id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) employee_id);
    }

    /**
     * Returns all the employeeses.
     *
     * @return the employeeses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<employees> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<employees> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<employees> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<employees> list = (List<employees>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_EMPLOYEES);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_EMPLOYEES;

                if (pagination) {
                    sql = sql.concat(employeesModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<employees>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<employees>(list);
                } else {
                    list = (List<employees>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the employeeses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (employees employees : findAll()) {
            remove(employees);
        }
    }

    /**
     * Returns the number of employeeses.
     *
     * @return the number of employeeses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_EMPLOYEES);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the employees persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.ru.bulatov.liferay.model.employees")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<employees>> listenersList = new ArrayList<ModelListener<employees>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<employees>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(employeesImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
