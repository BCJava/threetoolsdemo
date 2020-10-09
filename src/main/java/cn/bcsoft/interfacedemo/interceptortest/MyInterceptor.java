package cn.bcsoft.interfacedemo.interceptortest;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MyInterceptor implements HandlerInterceptor {


	/**
	 * 该方法实在执行执行servlet的 service方法之前执行的
	 * 即在进入controller之前调用
	 * @return 如果返回true表示继续执行下一个拦截器的PreHandle方法；如果没有拦截器了,则执行controller
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
		String url = request.getRequestURI();
		System.out.println("进入Controller之前");
		if(url.indexOf("login") >= 0){//判断方法
			return true;
		}

		String username = request.getParameter("name");
		if (username == null) {
			System.out.println("空");
			return false;
		}
		return true;
	}

	/**
	 * 在执行完controller之后，返回视图之前执行，我们可以对controller返回的结果做处理
	 * 执行顺序：先执行最后一个拦截器的postHandle方法，一次向前
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
						   Object handler, ModelAndView modelAndView) throws Exception{

		System.out.println("解析视图之前.....");
	}

	/**
	 * 整个请求结束之后，即返回视图之后执行
	 * 该方法需要同一拦截器的preHandle返回true时执行，
	 * 如果该拦截器preHandle返回false，则该拦截器的afterCompletion不执行
	 * 执行顺序：先执行最后一个返回true的拦截器的afterCompletion，在依次向前
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
								Object handler, Exception ex) throws Exception{
		request.getAttribute("Count");
		System.out.println("视图解析完成......");
	}
}


