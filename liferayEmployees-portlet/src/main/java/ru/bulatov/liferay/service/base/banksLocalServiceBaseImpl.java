package ru.bulatov.liferay.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import ru.bulatov.liferay.model.banks;
import ru.bulatov.liferay.service.banksLocalService;
import ru.bulatov.liferay.service.persistence.banksPersistence;
import ru.bulatov.liferay.service.persistence.employeesPersistence;
import ru.bulatov.liferay.service.persistence.positionsPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the banks local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link ru.bulatov.liferay.service.impl.banksLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ru.bulatov.liferay.service.impl.banksLocalServiceImpl
 * @see ru.bulatov.liferay.service.banksLocalServiceUtil
 * @generated
 */
public abstract class banksLocalServiceBaseImpl extends BaseLocalServiceImpl
    implements banksLocalService, IdentifiableBean {
    @BeanReference(type = ru.bulatov.liferay.service.banksLocalService.class)
    protected ru.bulatov.liferay.service.banksLocalService banksLocalService;
    @BeanReference(type = banksPersistence.class)
    protected banksPersistence banksPersistence;
    @BeanReference(type = ru.bulatov.liferay.service.employeesLocalService.class)
    protected ru.bulatov.liferay.service.employeesLocalService employeesLocalService;
    @BeanReference(type = employeesPersistence.class)
    protected employeesPersistence employeesPersistence;
    @BeanReference(type = ru.bulatov.liferay.service.positionsLocalService.class)
    protected ru.bulatov.liferay.service.positionsLocalService positionsLocalService;
    @BeanReference(type = positionsPersistence.class)
    protected positionsPersistence positionsPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private banksLocalServiceClpInvoker _clpInvoker = new banksLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link ru.bulatov.liferay.service.banksLocalServiceUtil} to access the banks local service.
     */

    /**
     * Adds the banks to the database. Also notifies the appropriate model listeners.
     *
     * @param banks the banks
     * @return the banks that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public banks addbanks(banks banks) throws SystemException {
        banks.setNew(true);

        return banksPersistence.update(banks);
    }

    /**
     * Creates a new banks with the primary key. Does not add the banks to the database.
     *
     * @param bank_id the primary key for the new banks
     * @return the new banks
     */
    @Override
    public banks createbanks(long bank_id) {
        return banksPersistence.create(bank_id);
    }

    /**
     * Deletes the banks with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param bank_id the primary key of the banks
     * @return the banks that was removed
     * @throws PortalException if a banks with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public banks deletebanks(long bank_id)
        throws PortalException, SystemException {
        return banksPersistence.remove(bank_id);
    }

    /**
     * Deletes the banks from the database. Also notifies the appropriate model listeners.
     *
     * @param banks the banks
     * @return the banks that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public banks deletebanks(banks banks) throws SystemException {
        return banksPersistence.remove(banks);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(banks.class,
            clazz.getClassLoader());
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
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return banksPersistence.findWithDynamicQuery(dynamicQuery);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return banksPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return banksPersistence.findWithDynamicQuery(dynamicQuery, start, end,
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
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return banksPersistence.countWithDynamicQuery(dynamicQuery);
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
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return banksPersistence.countWithDynamicQuery(dynamicQuery, projection);
    }

    @Override
    public banks fetchbanks(long bank_id) throws SystemException {
        return banksPersistence.fetchByPrimaryKey(bank_id);
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
    public banks getbanks(long bank_id) throws PortalException, SystemException {
        return banksPersistence.findByPrimaryKey(bank_id);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return banksPersistence.findByPrimaryKey(primaryKeyObj);
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
    public List<banks> getbankses(int start, int end) throws SystemException {
        return banksPersistence.findAll(start, end);
    }

    /**
     * Returns the number of bankses.
     *
     * @return the number of bankses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getbanksesCount() throws SystemException {
        return banksPersistence.countAll();
    }

    /**
     * Updates the banks in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param banks the banks
     * @return the banks that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public banks updatebanks(banks banks) throws SystemException {
        return banksPersistence.update(banks);
    }

    /**
     * Returns the banks local service.
     *
     * @return the banks local service
     */
    public ru.bulatov.liferay.service.banksLocalService getbanksLocalService() {
        return banksLocalService;
    }

    /**
     * Sets the banks local service.
     *
     * @param banksLocalService the banks local service
     */
    public void setbanksLocalService(
        ru.bulatov.liferay.service.banksLocalService banksLocalService) {
        this.banksLocalService = banksLocalService;
    }

    /**
     * Returns the banks persistence.
     *
     * @return the banks persistence
     */
    public banksPersistence getbanksPersistence() {
        return banksPersistence;
    }

    /**
     * Sets the banks persistence.
     *
     * @param banksPersistence the banks persistence
     */
    public void setbanksPersistence(banksPersistence banksPersistence) {
        this.banksPersistence = banksPersistence;
    }

    /**
     * Returns the employees local service.
     *
     * @return the employees local service
     */
    public ru.bulatov.liferay.service.employeesLocalService getemployeesLocalService() {
        return employeesLocalService;
    }

    /**
     * Sets the employees local service.
     *
     * @param employeesLocalService the employees local service
     */
    public void setemployeesLocalService(
        ru.bulatov.liferay.service.employeesLocalService employeesLocalService) {
        this.employeesLocalService = employeesLocalService;
    }

    /**
     * Returns the employees persistence.
     *
     * @return the employees persistence
     */
    public employeesPersistence getemployeesPersistence() {
        return employeesPersistence;
    }

    /**
     * Sets the employees persistence.
     *
     * @param employeesPersistence the employees persistence
     */
    public void setemployeesPersistence(
        employeesPersistence employeesPersistence) {
        this.employeesPersistence = employeesPersistence;
    }

    /**
     * Returns the positions local service.
     *
     * @return the positions local service
     */
    public ru.bulatov.liferay.service.positionsLocalService getpositionsLocalService() {
        return positionsLocalService;
    }

    /**
     * Sets the positions local service.
     *
     * @param positionsLocalService the positions local service
     */
    public void setpositionsLocalService(
        ru.bulatov.liferay.service.positionsLocalService positionsLocalService) {
        this.positionsLocalService = positionsLocalService;
    }

    /**
     * Returns the positions persistence.
     *
     * @return the positions persistence
     */
    public positionsPersistence getpositionsPersistence() {
        return positionsPersistence;
    }

    /**
     * Sets the positions persistence.
     *
     * @param positionsPersistence the positions persistence
     */
    public void setpositionsPersistence(
        positionsPersistence positionsPersistence) {
        this.positionsPersistence = positionsPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("ru.bulatov.liferay.model.banks",
            banksLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "ru.bulatov.liferay.model.banks");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return banks.class;
    }

    protected String getModelClassName() {
        return banks.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = banksPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
