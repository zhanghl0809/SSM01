package com.ssm.base.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SessionInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		if (session.getAttribute("username") == null) {// 判断Session是否存在
			request.setAttribute("message", "您需要登录才能进行访问");
			// 返回到登录页面
			request.getRequestDispatcher("/WEB-INF/reception/account_login.jsp").forward(request, response);
			return false;// 结束不再执行
		} else {
			return true;// 继续访问下一个拦截器的preHandle方法或者Controller
		}
	}

}
