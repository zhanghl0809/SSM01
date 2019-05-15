package com.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.ssm.Entity.User;
import com.ssm.Entity.WebLogs;
import com.ssm.base.exception.AllExceptions;
import com.ssm.service.UserService;
import com.ssm.service.WebLogsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//（1）在返回值前面加"forward:"就可以让结果转发,譬如"forward:user.do?name=method4"
//（2）在返回值前面加"redirect:"就可以让返回值重定向,譬如"redirect:http://www.baidu.com"
@Controller
@RequestMapping("/base")
public class BaseController {
    private final Logger logger = LoggerFactory.getLogger(BaseController.class);
    @Autowired
    private UserService userService;
    @Autowired
    private WebLogsService webLogsService;

    /**
     * @param user
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public Map<String, String> login(User user, HttpSession session) {
        logger.info("进入login方法！！！！");
        Map<String, String> map = new HashMap<String, String>();
//        1、null表示这个字符串不指向任何的东西，如果这时候你调用它的方法，那么就会出现空指针异常。
//　　    2、""表示它指向一个长度为0的字符串，这时候调用它的方法是安全的。
        if (user.getUsername() != null && !"".equals(user.getUsername())) {
            User u = new User();
            u = userService.findUserByName(user.getUsername());
            logger.info("session中的用户名：" + u.getUsername());
            if (u != null) {
                if (u.getPassword().equals(user.getPassword())) {
                    map.put("result", "success");
                    session.setAttribute("username", u.getUsername());
                } else {
                    map.put("result", "密码错误");
                }
            } else {
                map.put("result", "账号不存在");
            }
        } else {
            map.put("result", "null");
        }
        logger.info(map.get("result"));
        return map;
    }

    /**
     * @return
     */
    @RequestMapping("/runToMain")
    public String runToMain() {
        logger.info("进入main方法！！！！");
        return "/index";
    }

    @RequestMapping("/selectAllUser")
    public String selectAllUser() {
        ModelAndView mdv = new ModelAndView();
        logger.info("selectAllUser！！！！" + mdv.getModelMap());
        return "target";
    }

    @RequestMapping("/selectById")
    public String selectById() {
        return "target";
    }

    //    @RequestMapping("/addUser")
//    public String addUser(){
//        return "target";
//    }
    @RequestMapping("/findAllUserLog")
    public String findAllUserLog()  {
        List<WebLogs> list = webLogsService.findAllUserLog();
        for (WebLogs w : list) {
            System.err.println(w);
        }
        return "target";
    }

    @RequestMapping("/addManyLogs")
    public String addLogs() throws Exception {
        List<WebLogs> list = new ArrayList<WebLogs>();
        WebLogs log = null;
        for (int i = 0; i < 5; i++) {
            log = new WebLogs();

            log.setWebUser("事务"+i);
            log.setUsedController("事务controller"+i);
            log.setUserIP("事务IP"+i);
            log.setUsedTime("事务时间"+i);
            list.add(log);
        }
        webLogsService.addManyWebLogs(list);

        return "target";
    }
}
