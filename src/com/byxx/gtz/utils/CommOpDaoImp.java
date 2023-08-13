package com.byxx.gtz.utils;

import javax.ejb.EJBException;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

/**
 * ����Ejb������ ��������ʵ�����ɾ��ķ��� ʵ�ֽӿڣ� itcmor.statelessbeans.InterfaceCommDao
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
	 * ִ��ʵ���е��޲�����ѯ���
	 * 
	 * @param queryName
	 *            ��ѯ����
	 * @return �������ִ�н����
	 * 
	 */
	@SuppressWarnings("unchecked")
	public List<T> getAllByQueryName(String queryName) {
		Query q = em.createNamedQuery(queryName);
		return q.getResultList();
	}

	/**
	 * ִ��ʵ���е����
	 * 
	 * @param queryName
	 *            ��ѯ����
	 * @param parname
	 *            �������Ƽ���
	 * @param pars
	 *            ������������ֵ����
	 * @return ����ִ�н����
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
	 * ִ��ʵ���е����
	 * 
	 * @param queryName
	 *            ��ѯ����
	 * @param pars
	 *            ������������ֵ����
	 * @return ����ִ�н����
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
	 * ִ��EJBQL
	 * 
	 * @param ejbql
	 * @param paraname
	 *            �������Ƽ���
	 * @param pars
	 *            ������������ֵ����
	 * @return �������������ݼ���
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
	 * ִ��EJBQL
	 * 
	 * @param ejbql
	 * @param pars
	 *            ������������ֵ����
	 * @return �������������ݼ���
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
	 * ���ҵ�������
	 * 
	 * @param queryName
	 *            ʵ���еĲ�ѯ����
	 * @param parname
	 *            ����������
	 * @param pars
	 *            ����ֵ
	 * @return <T> ���������Ķ��� ���򷵻�null
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
	 * ���ҵ�������
	 * 
	 * @param queryName
	 *            ʵ���еĲ�ѯ����
	 * @param pars
	 *            ����ֵ
	 * @return <T> ���������Ķ��� ���򷵻�null
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
	 * ���ҵ�������
	 * 
	 * @param ejbql
	 * @param parname
	 *            ��������
	 * @param pars
	 *            ����ֵ
	 * @return <T> ���������Ķ��� ���򷵻�null
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
	 * ���ҵ�������
	 * 
	 * @param ejbql
	 * @param pars
	 *            ����ֵ
	 * @return <T> ���������Ķ��� ���򷵻�null
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
	 * �������� t Ҫ��ӵ��¶���
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
	 * �޸Ķ���
	 * 
	 * @param t
	 *            �޸ĵĶ���
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
	 * ɾ������
	 * 
	 * @param t
	 *            Ҫɾ���Ķ���
	 * @param pkid
	 *            �����е�����ֵ
	 * 
	 */
	public void remove(T t, Object pkid) {
		em.remove(em.find(t.getClass(), pkid));
		em.flush();
	}

	/**
	 * ˢ�¶��������ݿ�������ֵͬ��
	 * 
	 * @param t
	 *            Ҫˢ�µĶ���
	 * @param pkid
	 *            ʵ�������
	 * @return ��ˢ�µĶ���
	 * 
	 */
	@SuppressWarnings("unchecked")
	public T refurbish(T t, Object pkid) {
		return (T) em.find(t.getClass(), pkid);
	}

	/**
	 * ִ�и��²��� ����EJBQL
	 * 
	 * @param EJBQL
	 *            EJBQL
	 * @param parname
	 *            �������Ƽ���
	 * @param pars
	 *            һ����������ֵ
	 * @return ����ִ��״̬
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
	 * ִ�и��²��� ����EJBQL
	 * 
	 * @param EJBQL
	 *            EJBQL
	 * @param pars
	 *            һ����������ֵ
	 * @return ����ִ��״̬
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
	 * ִ�и��²��� ����ʵ���ж���� Query Name
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
	 * ִ�и��²��� ����ʵ���ж���� Query Name
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
	 * ��������
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
	 * �õ����ݿ��ʱ��
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
	 * @return ���� ddmlem��
	 */
	public EntityManager getLfmlem() {
		return em;
	}
}
