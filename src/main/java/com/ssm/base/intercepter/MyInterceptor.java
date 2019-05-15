package com.ssm.base.intercepter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//    自定义拦截器一般继承自HandlerInterceptorAdapter 或者实现 HandlerInterceptor 接口。
//    实现接口需要实现对应的3中方法，继承父类只需要实现需要的方法即可。preHandle,postHandle,afterCompletion
//        1、日志记录：记录请求信息的日志，以便进行信息监控、信息统计、计算PV（Page View）等。
//        2、权限检查：如登录检测，进入处理器检测检测是否登录，如果没有直接返回到登录页面；
//        3、性能监控：有时候系统在某段时间莫名其妙的慢，可以通过拦截器在进入处理器之前记录开始时间，在处理完后记录结束时间，从而得到该请求的处理时间（如果有反向代理，如apache可以自动记录）；
//        4、通用行为：读取cookie得到用户信息并将用户对象放入请求，从而方便后续流程使用，还有如提取Locale、Theme信息等，只要是多个处理器都需要的即可使用拦截器实现。
//        5、OpenSessionInView：如Hibernate，在进入处理器打开Session，在完成后关闭Session。
//
public class MyInterceptor implements HandlerInterceptor {
    private final Logger logger = LoggerFactory.getLogger(MyInterceptor.class);

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
      //  logger.info("----------------preHandle" + request.getRequestURL().toString() + "," + request.getRequestURI());

//        if (request.getHeader("x-requested-with") != null && request.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")) {
////            //如果是ajax请求响应头会有，x-requested-with
////            System.out.println("发生ajax请求...");
////            return true;
////        }
////        if ("GET".equalsIgnoreCase(request.getMethod())) {
////            logger.info("get请求"+request.getMethod());
////        }
        logger.info("==============执行顺序: 1、preHandle================");
        String requestUri = request.getRequestURI();
        String contextPath = request.getContextPath();
        String url = requestUri.substring(contextPath.length());
        if ("/SSM/base/login".equals(requestUri)) {
            logger.info("-------------登录login方法进入拦截器");
            return true;
        } else {
            String username = (String) request.getSession().getAttribute("username");
            logger.info("session中的username"+username);
            if (username == null) {
                logger.info("没有登录--跳转到login页面！");
                request.getRequestDispatcher("/WEB-INF/jsp/interceptor.jsp").forward(request, response);
                return false;
            } else
                return true;
        }
    }

    /**
     * 在业务处理器处理请求执行完成后,生成视图之前执行的动作
     * 可在modelAndView中加入数据，比如当前时间
     */
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        logger.info("-------------------postHandle" + httpServletRequest.getRequestURL().toString() + "," + httpServletRequest.getRequestURI());
        if(modelAndView != null){  //加入当前时间
            modelAndView.addObject("haha", "测试postHandle");
        }
    }

    /**
     * 在DispatcherServlet完全处理完请求后被调用,可用于清理资源等
     * 当有拦截器抛出异常时,会从当前拦截器往回执行所有的拦截器的afterCompletion()
     */
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        if(e != null){
            logger.info("----------------afterCompletion---异常" + httpServletRequest.getRequestURL().toString() + "," + httpServletRequest.getRequestURI());
        }else{
            logger.info("----------------afterCompletion---正常" + httpServletRequest.getRequestURL().toString() + "," + httpServletRequest.getRequestURI());
        }
    }
}
