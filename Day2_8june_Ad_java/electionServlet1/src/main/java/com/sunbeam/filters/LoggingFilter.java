package com.sunbeam.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class LoggingFilter implements Filter{
	 
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("LoggingFilter.init() called");
	}
	
	@Override
	public void destroy() {
		System.out.println("LoggingFilter.destroy() called");
		Filter.super.destroy();
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest rq =(HttpServletRequest) req;
		System.out.println("Log before:" + rq.getRequestURL());
		chain.doFilter(req, resp);
		System.out.println("Log After:" + rq.getRequestURL());
		
		
	}

}
