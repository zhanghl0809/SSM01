package com.ssm.base.intercepter;

import com.ssm.Entity.WebLogs;
import com.ssm.dao.WebLogsMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;


public class LogsInterceptor implements HandlerInterceptor {

    private Logger logger = LoggerFactory.getLogger(LogsInterceptor.class);
    @Autowired
    private WebLogsMapper webLogsMapper;

    public boolean preHandle(HttpServletRequest request, HttpServletResponse httpServletResponse, Object o) throws Exception {
        return true;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

        String addr = request.getRemoteAddr();
        int port = request.getRemotePort();
        String requestUri = request.getRequestURI();
        String username = (String) request.getSession().getAttribute("username");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        Date time = new Date();
        String usedTime = simpleDateFormat.format(time);

        WebLogs logs = new WebLogs();
        logs.setWebUser(username);
        logs.setUserIP(addr+":"+port);
        logs.setUsedController(requestUri);
        logs.setUsedTime(usedTime);

      //  webLogsMapper.addWebLogs(logs);

    }
}
