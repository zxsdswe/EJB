package com.byxx.gtz.utils;

import javax.ejb.EJBException;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

/**
 * 公共Ejb操作类 包括所有实体的增删查改方法 实现接口： itcmor.statelessbeans.InterfaceCommDao
 * 
 * @param <T>
 */

public class CommOpDaoImp<T> implements CommImpDaoInterface<T> {
	private EntityManager em;

	public CommOpDaoImp() {
	}

	public CommOpDaoImp(EntityManager em) {
		this.em = em;
	}

	/**
	 * 执行实体中的无参数查询语句
	 * 
	 * @param queryName
	 *            查询名称
	 * @return 返回语句执行结果集
	 * 
	 */
	@SuppressWarnings("unchecked")
	public List<T> getAllByQueryName(String queryName) {
		Query q = em.createNamedQuery(queryName);
		return q.getResultList();
	}

	/**
	 * 执行实体中的语句
	 * 
	 * @param queryName
	 *            查询名称
	 * @param parname
	 *            参数名称集合
	 * @param pars
	 *            单个或多个参数值集合
	 * @return 返回执行结果集
	 * 
	 */
	@SuppressWarnings("unchecked")
	public List<T> getListByCondition(String queryName, String[] parname,
			Object... pars) {
		Query q = em.createNamedQuery(queryName);
		if (parname != null && pars != null) {
			int index = 0;
			for (Object object : pars) {
				q.setParameter(parname[index++], object);
			}
		}
		return q.getResultList();
	}

	/**
	 * 执行实体中的语句
	 * 
	 * @param queryName
	 *            查询名称
	 * @param pars
	 *            单个或多个参数值集合
	 * @return 返回执行结果集
	 * 
	 */
	@SuppressWarnings("unchecked")
	public List<T> getListByCondition(String queryName, Object... pars)
			throws EJBException, Exception {
		Query q = em.createNamedQuery(queryName);
		if (pars != null) {
			int index = 0;
			for (Object object : pars) {
				q.setParameter(++index, object);
			}
		}
		return q.getResultList();
	}

	/**
	 * 执行EJBQL
	 * 
	 * @param ejbql
	 * @param paraname
	 *            参数名称集合
	 * @param pars
	 *            单个或多个参数值集合
	 * @return 符合条件的数据集合
	 * 
	 */
	@SuppressWarnings("unchecked")
	public List<T> getListByEjbQl(String ejbql, String[] parname,
			Object... pars) {
		Query q = em.createQuery(ejbql);
		if (parname != null && pars != null) {
			int index = 0;
			for (Object object : pars) {
				q.setParameter(parname[index++], object);
			}
		}
		return q.getResultList();
	}

	/**
	 * 执行EJBQL
	 * 
	 * @param ejbql
	 * @param pars
	 *            单个或多个参数值集合
	 * @return 符合条件的数据集合
	 * 
	 */
	@SuppressWarnings("unchecked")
	public List<T> getListByEjbQl(String ejbql, Object... pars)
			throws EJBException, Exception {
		Query q = em.createQuery(ejbql);
		if (pars != null) {
			int index = 0;
			for (Object object : pars) {
				q.setParameter(++index, object);
			}
		}
		return q.getResultList();
	}

	/**
	 * 查找单个对象
	 * 
	 * @param queryName
	 *            实体中的查询名称
	 * @param parname
	 *            参数名集合
	 * @param pars
	 *            参数值
	 * @return <T> 符合条件的对象 否则返回null
	 * 
	 */
	@SuppressWarnings("unchecked")
	public T getObjectByCondition(String queryName, String[] parname,
			Object... pars) {
		Query q = em.createNamedQuery(queryName);
		if (parname != null && pars != null) {
			int index = 0;
			for (Object object : pars) {
				q.setParameter(parname[index++], object);
			}
		}
		try {
			return (T) q.getSingleResult();
		} catch (Exception ex) {
			return null;
		}
	}

	/**
	 * 查找单个对象
	 * 
	 * @param queryName
	 *            实体中的查询名称
	 * @param pars
	 *            参数值
	 * @return <T> 符合条件的对象 否则返回null
	 * 
	 */
	@SuppressWarnings("unchecked")
	public T getObjectByCondition(String queryName, Object... pars)
			throws EJBException, Exception {
		Query q = em.createNamedQuery(queryName);
		if (pars != null) {
			int index = 0;
			for (Object object : pars) {
				q.setParameter(++index, object);
			}
		}
		try {
			return (T) q.getSingleResult();
		} catch (Exception ex) {
			return null;
		}
	}

	/**
	 * 查找单个对象
	 * 
	 * @param ejbql
	 * @param parname
	 *            参数集合
	 * @param pars
	 *            参数值
	 * @return <T> 符合条件的对象 否则返回null
	 * 
	 */
	@SuppressWarnings("unchecked")
	public T getObjectByEjbQl(String ejbql, String[] parname, Object... pars) {
		Query q = em.createQuery(ejbql);
		if (parname != null && pars != null) {
			int index = 0;
			for (Object object : pars) {
				q.setParameter(parname[index++], object);
			}
		}
		try {
			return (T) q.getSingleResult();
		} catch (Exception ex) {
			return null;
		}
	}

	/**
	 * 查找单个对象
	 * 
	 * @param ejbql
	 * @param pars
	 *            参数值
	 * @return <T> 符合条件的对象 否则返回null
	 */
	@SuppressWarnings("unchecked")
	public T getObjectByEjbQl(String ejbql, Object... pars)
			throws EJBException, Exception {
		Query q = em.createQuery(ejbql);
		if (pars != null) {
			int index = 0;
			for (Object object : pars) {
				q.setParameter(++index, object);
			}
		}
		try {
			return (T) q.getSingleResult();
		} catch (Exception ex) {
			return null;
		}
	}

	/**
	 * 插入数据 t 要添加的新对象
	 * 
	 * @param t
	 * 
	 */
	public T insert(T t) {
		em.persist(t);
		em.flush();
		return t;
	}

	public List<T> insert(List<T> list) throws EJBException, Exception {
		Iterator<T> it = list.iterator();
		while (it.hasNext()) {
			T t = (T) it.next();
//			em.persist(t);
			insert(t);
		}
//		em.flush();
		return list;
	}
	
	public List<T> insertBatch(List<T> list) throws EJBException, Exception {
		Iterator<T> it = list.iterator();
		int i = 0;
		while (it.hasNext()) {
			T t = (T) it.next();
			em.persist(t);
			if (i % 20 == 0) { // 20, same as the JDBC batch size
				em.flush();
			}
			i++;
		}
		em.flush();
		return list;
	}

	/**
	 * 修改对象
	 * 
	 * @param t
	 *            修改的对象
	 * 
	 */
	public T update(T t) {
		em.merge(t);
		em.flush();
		return t;
	}

	public List<T> update(List<T> list) throws EJBException, Exception {
		Iterator<T> it = list.iterator();
		while (it.hasNext()) {
			T t = (T) it.next();
			update(t);
		}
		return list;
	}
	
	public List<T> updateBatch(List<T> list) throws EJBException, Exception {
		Iterator<T> it = list.iterator();
		int i = 0;
		while (it.hasNext()) {
			T t = (T) it.next();
			em.merge(t);
			if (i % 20 == 0) { // 20, same as the JDBC batch size
				em.flush();
			}
			i++;
		}
		em.flush();
		return list;
	}

	/**
	 * 删除对象
	 * 
	 * @param t
	 *            要删除的对象
	 * @param pkid
	 *            对象中的主键值
	 * 
	 */
	public void remove(T t, Object pkid) {
		em.remove(em.find(t.getClass(), pkid));
		em.flush();
	}

	/**
	 * 刷新对象于数据库数据数值同步
	 * 
	 * @param t
	 *            要刷新的对象
	 * @param pkid
	 *            实体的主键
	 * @return 已刷新的对象
	 * 
	 */
	@SuppressWarnings("unchecked")
	public T refurbish(T t, Object pkid) {
		return (T) em.find(t.getClass(), pkid);
	}

	/**
	 * 执行更新操作 根据EJBQL
	 * 
	 * @param EJBQL
	 *            EJBQL
	 * @param parname
	 *            参数名称集合
	 * @param pars
	 *            一个或多个参数值
	 * @return 返回执行状态
	 * 
	 */
	public int execUpdateByEjbQl(String EJBQL, String[] parname, Object... pars) {
		Query q = em.createQuery(EJBQL);
		if (parname != null && pars != null) {
			int index = 0;
			for (Object object : pars) {
				q.setParameter(parname[index++], object);
			}
		}
		return q.executeUpdate();
	}

	/**
	 * 执行更新操作 根据EJBQL
	 * 
	 * @param EJBQL
	 *            EJBQL
	 * @param pars
	 *            一个或多个参数值
	 * @return 返回执行状态
	 */
	public int execUpdateByEjbQl(String EJBQL, Object... pars)
			throws EJBException, Exception {
		Query q = em.createQuery(EJBQL);
		if (pars != null) {
			int index = 0;
			for (Object object : pars) {
				q.setParameter(++index, object);
			}
		}
		return q.executeUpdate();
	}

	/**
	 * 执行更新操作 根据实体中定义的 Query Name
	 * 
	 * @param queryName
	 * @param parname
	 * @param pars
	 * @return
	 */
	public int execUpdateByQueryName(String queryName, String[] parname,
			Object... pars) {
		Query q = em.createNamedQuery(queryName);
		if (parname != null && pars != null) {
			int index = 0;
			for (Object object : pars) {
				q.setParameter(parname[index++], object);
			}
		}
		return q.executeUpdate();
	}

	/**
	 * 执行更新操作 根据实体中定义的 Query Name
	 * 
	 * @param queryName
	 * @param pars
	 * @return
	 */
	public int execUpdateByQueryName(String queryName, Object... pars)
			throws EJBException, Exception {
		Query q = em.createNamedQuery(queryName);
		if (pars != null) {
			int index = 0;
			for (Object object : pars) {
				q.setParameter(++index, object);
			}
		}
		return q.executeUpdate();
	}

	/**
	 * 生成序列
	 * 
	 * @param sequenceName
	 * @return
	 * @throws EJBException
	 * @throws Exception
	 */
	public int getSequence(String sequenceName) throws EJBException, Exception {
		Query q = em.createNativeQuery("select "+sequenceName+".nextval from dual",Dual.class);
		try {
			Dual dual = (Dual)q.getSingleResult();
			if(dual!=null){
				return dual.getNextval();
			}
			return 0;
		} catch (Exception ex) {
			return 0;
		}
	}
	
	/**
	 * 得到数据库的时间
	 * @return
	 * @throws EJBException
	 * @throws Exception
	 */
	public Timestamp getDbDateTime() throws EJBException,Exception{
		Query q = em.createNativeQuery("select sysdate from dual",Dual.class);
		try {
			Dual dual = (Dual)q.getSingleResult();
			if(dual!=null){
				return dual.getSysdate();
			}
			return null;
		} catch (Exception ex) {
			return null;
		}
	}

	/**
	 * @return 返回 ddmlem。
	 */
	public EntityManager getLfmlem() {
		return em;
	}
}
