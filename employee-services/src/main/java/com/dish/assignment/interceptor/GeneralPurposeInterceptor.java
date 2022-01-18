package com.dish.assignment.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GeneralPurposeInterceptor implements HandlerInterceptor{
    private final Logger logger= LoggerFactory.getLogger(GeneralPurposeInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("In PreHandle method of restTemplate Interceptor "+request.getRequestURI());

        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.info("In PostHandle method of restTemplate Interceptor");

        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.info("In AfterCompletion method of restTemplate Interceptor");

        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}

//implements ClientHttpRequestInterceptor {
//    public  static Logger Log = LoggerFactory.getLogger(RestTemplateInterceptor.class);
//    @Override
//    public ClientHttpResponse intercept(
//            HttpRequest request,
//            byte[] body,
//            ClientHttpRequestExecution execution) throws IOException {
//
//        ClientHttpResponse response = execution.execute(request, body);
//
//        // we can modify the headers
//         response.getHeaders().add("Foo", "bar");
//
//        //logging
//        Log.info("We are in the Interceptor Class and logging and the Uri is"+request.getURI());
//
//        return response;
//    }