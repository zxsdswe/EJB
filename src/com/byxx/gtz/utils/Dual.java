/**
 * 
 */
package com.byxx.gtz.utils;

import java.sql.Timestamp;

public class Dual {
	private Timestamp sysdate;
	private int nextval;

	public Timestamp getSysdate() {
		return sysdate;
	}

	public void setSysdate(Timestamp sysdate) {
		this.sysdate = sysdate;
	}

	public int getNextval() {
		return nextval;
	}

	public void setNextval(int nextval) {
		this.nextval = nextval;
	}
}