/**
 * 
 */
package com.byxx.gtz.utils;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Properties;

public class EjbProxy {

	private InitialContext ictx = null;// 上下文根
	private static String contextFactory = "weblogic.jndi.WLInitialContextFactory";
	public static String url = null;

	protected InitialContext getEJBLink() throws Exception {
		if (ictx == null) {
			// 属性对象
			Properties props = new Properties();
			if (url == null) {
				ictx = new InitialContext();
			} else {
				// 设置属性
				props.setProperty(Context.INITIAL_CONTEXT_FACTORY, contextFactory);
				props.setProperty(Context.PROVIDER_URL, url);
				// 初始化上下文
				ictx = new InitialContext(props);
			}
		}
		return ictx;
	}
}
