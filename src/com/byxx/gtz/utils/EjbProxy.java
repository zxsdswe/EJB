/**
 * 
 */
package com.byxx.gtz.utils;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Properties;

public class EjbProxy {

	private InitialContext ictx = null;// �����ĸ�
	private static String contextFactory = "weblogic.jndi.WLInitialContextFactory";
	public static String url = null;

	protected InitialContext getEJBLink() throws Exception {
		if (ictx == null) {
			// ���Զ���
			Properties props = new Properties();
			if (url == null) {
				ictx = new InitialContext();
			} else {
				// ��������
				props.setProperty(Context.INITIAL_CONTEXT_FACTORY, contextFactory);
				props.setProperty(Context.PROVIDER_URL, url);
				// ��ʼ��������
				ictx = new InitialContext(props);
			}
		}
		return ictx;
	}
}
