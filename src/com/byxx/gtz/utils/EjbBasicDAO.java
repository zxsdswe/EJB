/**
 * 
 */
package com.byxx.gtz.utils;

import javax.persistence.EntityManager;

public class EjbBasicDAO<T> extends CommOpDaoImp<T> {
	public EjbBasicDAO(EntityManager em) {
		super(em);
	}
}