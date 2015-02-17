package com.westtextile.action;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = 1L;

	@Override
	/*
	 * ÑéÖ¤ÊÇ·ñÒÑµÇÂ¼ LOGIN_TYPE = 1 :ÒÑµÇÂ¼ LOGIN_TYPE = 0 :Î´µÇÂ¼
	 */
	public String intercept(ActionInvocation invocation) throws Exception {
		Map sessionMap = invocation.getInvocationContext().getSession();
		if (!invocation.getAction().getClass().getName().endsWith("Home")
				&& !invocation.getAction().getClass().getName().endsWith("Login_Forward")
				&& !invocation.getAction().getClass().getName().endsWith("Login")
				&& !invocation.getAction().getClass().getName().endsWith("Logout")
				&& !invocation.getAction().getClass().getName().endsWith("Register_Forward")
				&& !invocation.getAction().getClass().getName().endsWith("Register")
				&& (sessionMap.get("username") == null) ) {
				return Action.LOGIN;
		} else {
			return invocation.invoke();
		}

	}

}