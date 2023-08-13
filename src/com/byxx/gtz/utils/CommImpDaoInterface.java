package com.byxx.gtz.utils;

import javax.ejb.EJBException;
import java.sql.Timestamp;
import java.util.List;

/**
 * ����Ejb�����ӿ� ��������ʵ�����ɾ��ķ���
 * ��ʵ���ࣺitcmor.statelessbeans.CommDaoImp
 *
 *
 * @param <T>
 */
public interface CommImpDaoInterface<T> {


	/**
	 * ִ��ʵ���е��޲�����ѯ���
	 * @param queryName ��ѯ����
	 * @return �������ִ�н����
	 *
	 */
	public List<T> getAllByQueryName(String queryName) throws EJBException, Exception ;
	
	/**
	 * ִ��ʵ���е����
	 * @param queryName ��ѯ����
	 * @param parname �������Ƽ���
	 * @param pars ������������ֵ����
	 * @return ����ִ�н����
	 *
	 */
	public List<T> getListByCondition(String queryName, String[] parname, Object... pars) throws EJBException, Exception ;

	/**
	 * ִ��ʵ���е����
	 * @param parname �������Ƽ���
	 * @param pars ������������ֵ����
	 * @return ����ִ�н����
	 *
	 */
	public List<T> getListByCondition(String queryName, Object... pars) throws EJBException, Exception ;

	/**
	 * ִ��EJBQL
	 * @param ejbql
	 * @param paraname �������Ƽ���
	 * @param pars ������������ֵ����
	 * @return �������������ݼ���
	 *
	 */
	public List<T> getListByEjbQl(String ejbql, String[] parname, Object... pars) throws EJBException, Exception ;

	/**
	 * ִ��EJBQL
	 * @param ejbql
	 * @param paraname �������Ƽ���
	 * @param pars ������������ֵ����
	 * @return �������������ݼ���
	 *
	 */
	public List<T> getListByEjbQl(String ejbql, Object... pars) throws EJBException, Exception ;

	/**
	 * ���ҵ�������
	 * @param queryName ʵ���еĲ�ѯ����
	 * @param parname ����������
	 * @param pars ����ֵ
	 * @return <T> ���������Ķ��� ���򷵻�null
	 *
	 */
	public T getObjectByCondition(String queryName, String[] parname, Object... pars) throws EJBException, Exception ;
	/**
	 * ���ҵ�������
	 * @param parname ����������
	 * @param pars ����ֵ
	 * @return <T> ���������Ķ��� ���򷵻�null
	 *
	 */
	public T getObjectByCondition(String queryName, Object... pars) throws EJBException, Exception ;
	/**
	 * ���ҵ�������
	 * @param ejbql
	 * @param parname ��������
	 * @param pars ����ֵ
	 * @return <T> ���������Ķ��� ���򷵻�null
	 *
	 */
	public T getObjectByEjbQl(String ejbql, String[] parname, Object... pars) throws EJBException, Exception ;
	/**
	 * ���ҵ�������
	 * @param ejbql
	 * @param pars ����ֵ
	 * @return <T> ���������Ķ��� ���򷵻�null
	 */
	public T getObjectByEjbQl(String ejbql, Object... pars) throws EJBException, Exception ;
	/**
	 * ִ�и��²��� ����EJBQL
	 * @param EJBQL  EJB QL
	 * @param parname �������Ƽ���
	 * @param pars һ����������ֵ
	 * @return ����ִ��״̬
	 *
	 */
	public int execUpdateByEjbQl(String EJBQL, String[] parname, Object... pars) throws EJBException, Exception ;
	/**
	 * ִ�и��²��� ����EJBQL
	 * @param EJBQL  EJB QL
	 * @param pars һ����������ֵ
	 * @return ����ִ��״̬
	 *
	 */
	public int execUpdateByEjbQl(String EJBQL, Object... pars) throws EJBException, Exception ;

	/**
	 * ִ�и��²��� ����ʵ���ж���� Query Name
	 * @param queryName
	 * @param parname
	 * @param pars
	 * @return
	 */
	public int execUpdateByQueryName(String queryName, String[] parname, Object... pars) throws EJBException, Exception ;
	/**
	 * ִ�и��²��� ����ʵ���ж���� Query Name
	 * @param parname
	 * @param pars
	 * @return
	 */
	public int execUpdateByQueryName(String queryName, Object... pars) throws EJBException, Exception ;
	/**
	 * �޸Ķ���
	 * @param  t �޸ĵĶ���
	 *
	 */
	public T update(T t) throws EJBException, Exception ;
	/**
	 * �������� t Ҫ��ӵ��¶���
	 * @param t
	 *
	 */
	public T insert(T t) throws EJBException, Exception ;
	/**
	 * ��������
	 * @param list
	 * @return
	 * @throws EJBException
	 * @throws Exception
	 */
	public List<T> insertBatch(List<T> list) throws EJBException, Exception;
	/**
	 * ��������
	 * @param tList
	 * @return
	 * @throws EJBException
	 * @throws Exception
	 */
	public List<T> update(List<T> tList) throws EJBException,Exception;

	/**
	 * ��������
	 * @param list
	 * @return
	 * @throws EJBException
	 * @throws Exception
	 */
	public List<T> updateBatch(List<T> list) throws EJBException, Exception;
	/**
	 * ��������
	 * @param tList
	 * @return
	 * @throws EJBException
	 * @throws Exception
	 */
	public List<T> insert(List<T> tList) throws EJBException,Exception;
	/**
	 * ɾ������
	 * @param t Ҫɾ���Ķ���
	 * @param pkid �����е�����ֵ
	 *
	 */
	public void remove(T t, Object pkid) throws EJBException, Exception ;

	/**
	 * ˢ�¶��������ݿ�������ֵͬ��
	 * @param t Ҫˢ�µĶ���
	 *  @param pkid ʵ�������
	 * @return ��ˢ�µĶ���
	 *
	 */
	public T refurbish(T t, Object pkid) throws EJBException, Exception ;
	
	/**
	 * ��������
	 * @param sequenceName
	 * @return
	 * @throws EJBException
	 * @throws Exception
	 */
	public int getSequence(String sequenceName) throws EJBException,Exception;
	
	/**
	 * �õ����ݿ��ʱ��
	 * @return
	 * @throws EJBException
	 * @throws Exception
	 */
	public Timestamp getDbDateTime() throws EJBException,Exception;
}
