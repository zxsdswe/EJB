package com.byxx.gtz.utils;

import javax.ejb.EJBException;
import java.sql.Timestamp;
import java.util.List;

/**
 * 公共Ejb操作接口 包括所有实体的增删查改方法
 * 已实现类：itcmor.statelessbeans.CommDaoImp
 *
 *
 * @param <T>
 */
public interface CommImpDaoInterface<T> {


	/**
	 * 执行实体中的无参数查询语句
	 * @param queryName 查询名称
	 * @return 返回语句执行结果集
	 *
	 */
	public List<T> getAllByQueryName(String queryName) throws EJBException, Exception ;
	
	/**
	 * 执行实体中的语句
	 * @param queryName 查询名称
	 * @param parname 参数名称集合
	 * @param pars 单个或多个参数值集合
	 * @return 返回执行结果集
	 *
	 */
	public List<T> getListByCondition(String queryName, String[] parname, Object... pars) throws EJBException, Exception ;

	/**
	 * 执行实体中的语句
	 * @param parname 参数名称集合
	 * @param pars 单个或多个参数值集合
	 * @return 返回执行结果集
	 *
	 */
	public List<T> getListByCondition(String queryName, Object... pars) throws EJBException, Exception ;

	/**
	 * 执行EJBQL
	 * @param ejbql
	 * @param paraname 参数名称集合
	 * @param pars 单个或多个参数值集合
	 * @return 符合条件的数据集合
	 *
	 */
	public List<T> getListByEjbQl(String ejbql, String[] parname, Object... pars) throws EJBException, Exception ;

	/**
	 * 执行EJBQL
	 * @param ejbql
	 * @param paraname 参数名称集合
	 * @param pars 单个或多个参数值集合
	 * @return 符合条件的数据集合
	 *
	 */
	public List<T> getListByEjbQl(String ejbql, Object... pars) throws EJBException, Exception ;

	/**
	 * 查找单个对象
	 * @param queryName 实体中的查询名称
	 * @param parname 参数名集合
	 * @param pars 参数值
	 * @return <T> 符合条件的对象 否则返回null
	 *
	 */
	public T getObjectByCondition(String queryName, String[] parname, Object... pars) throws EJBException, Exception ;
	/**
	 * 查找单个对象
	 * @param parname 参数名集合
	 * @param pars 参数值
	 * @return <T> 符合条件的对象 否则返回null
	 *
	 */
	public T getObjectByCondition(String queryName, Object... pars) throws EJBException, Exception ;
	/**
	 * 查找单个对象
	 * @param ejbql
	 * @param parname 参数集合
	 * @param pars 参数值
	 * @return <T> 符合条件的对象 否则返回null
	 *
	 */
	public T getObjectByEjbQl(String ejbql, String[] parname, Object... pars) throws EJBException, Exception ;
	/**
	 * 查找单个对象
	 * @param ejbql
	 * @param pars 参数值
	 * @return <T> 符合条件的对象 否则返回null
	 */
	public T getObjectByEjbQl(String ejbql, Object... pars) throws EJBException, Exception ;
	/**
	 * 执行更新操作 根据EJBQL
	 * @param EJBQL  EJB QL
	 * @param parname 参数名称集合
	 * @param pars 一个或多个参数值
	 * @return 返回执行状态
	 *
	 */
	public int execUpdateByEjbQl(String EJBQL, String[] parname, Object... pars) throws EJBException, Exception ;
	/**
	 * 执行更新操作 根据EJBQL
	 * @param EJBQL  EJB QL
	 * @param pars 一个或多个参数值
	 * @return 返回执行状态
	 *
	 */
	public int execUpdateByEjbQl(String EJBQL, Object... pars) throws EJBException, Exception ;

	/**
	 * 执行更新操作 根据实体中定义的 Query Name
	 * @param queryName
	 * @param parname
	 * @param pars
	 * @return
	 */
	public int execUpdateByQueryName(String queryName, String[] parname, Object... pars) throws EJBException, Exception ;
	/**
	 * 执行更新操作 根据实体中定义的 Query Name
	 * @param parname
	 * @param pars
	 * @return
	 */
	public int execUpdateByQueryName(String queryName, Object... pars) throws EJBException, Exception ;
	/**
	 * 修改对象
	 * @param  t 修改的对象
	 *
	 */
	public T update(T t) throws EJBException, Exception ;
	/**
	 * 插入数据 t 要添加的新对象
	 * @param t
	 *
	 */
	public T insert(T t) throws EJBException, Exception ;
	/**
	 * 插入数据
	 * @param list
	 * @return
	 * @throws EJBException
	 * @throws Exception
	 */
	public List<T> insertBatch(List<T> list) throws EJBException, Exception;
	/**
	 * 更新数据
	 * @param tList
	 * @return
	 * @throws EJBException
	 * @throws Exception
	 */
	public List<T> update(List<T> tList) throws EJBException,Exception;

	/**
	 * 更新数据
	 * @param list
	 * @return
	 * @throws EJBException
	 * @throws Exception
	 */
	public List<T> updateBatch(List<T> list) throws EJBException, Exception;
	/**
	 * 插入数据
	 * @param tList
	 * @return
	 * @throws EJBException
	 * @throws Exception
	 */
	public List<T> insert(List<T> tList) throws EJBException,Exception;
	/**
	 * 删除对象
	 * @param t 要删除的对象
	 * @param pkid 对象中的主键值
	 *
	 */
	public void remove(T t, Object pkid) throws EJBException, Exception ;

	/**
	 * 刷新对象于数据库数据数值同步
	 * @param t 要刷新的对象
	 *  @param pkid 实体的主键
	 * @return 已刷新的对象
	 *
	 */
	public T refurbish(T t, Object pkid) throws EJBException, Exception ;
	
	/**
	 * 生成序列
	 * @param sequenceName
	 * @return
	 * @throws EJBException
	 * @throws Exception
	 */
	public int getSequence(String sequenceName) throws EJBException,Exception;
	
	/**
	 * 得到数据库的时间
	 * @return
	 * @throws EJBException
	 * @throws Exception
	 */
	public Timestamp getDbDateTime() throws EJBException,Exception;
}
