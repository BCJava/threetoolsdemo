package cn.bcsoft.interfacedemo.filtertest;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Description: idea-workspace
 * Created by blackchen on 2020/9/16 14:44
 */

/**
 * Servlet3.0特性
 * urlPatterns:过滤的url地址
 * filterName:过滤器名称
 */
@WebFilter(urlPatterns="/threetest/**", filterName="LoginFilter")
public class LoginFilter implements Filter{
	/*
	 * 容器加载完成调用
	 * */
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("filter init...");
	}

	/*
	 *  请求被过滤的时候调用
	 * */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("过滤...");

		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse)response;

		String username = req.getParameter("name");
		if(!username.isEmpty()) {//过滤条件
			System.out.println("过滤到(值对)..." + username);
		} else {//条件不符合,做啥?
			System.out.println("过滤到(值不对)...");
			//重定向
			resp.sendRedirect("/Filter.html");
			return;
		}
		chain.doFilter(request, response);

	}

	/*
	 * 容器被销毁的时候调用
	 * */
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("销毁...");
	}
}
