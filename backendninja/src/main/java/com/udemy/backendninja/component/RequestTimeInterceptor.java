package com.udemy.backendninja.component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component("requestTimeInterceptor")
public class RequestTimeInterceptor extends HandlerInterceptorAdapter {
	
	private static final Log LOG = LogFactory.getLog(RequestTimeInterceptor.class);

	// Este metodo se ejecuta antes de entrar en el metodo del controlador
	// PRIMERO
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		request.setAttribute("startTime", System.currentTimeMillis());
		return true;
	}

	// Este metodo se ejecuta justo antes de que el metodo del controlador devuelva la vista al navegador
	// SEGUNDO
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		long startTime = (long) request.getAttribute("startTime");
		LOG.info("--REQUEST URL: '" + request.getRequestURI().toString() + "' --TOTAL TIME: '" + (System.currentTimeMillis() - startTime ) + "'ms");
	}

}
