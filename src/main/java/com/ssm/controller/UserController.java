package com.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ssm.Entity.User;
import com.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;

@Controller
@RequestMapping("/")
public class UserController {
    @Resource // 资源引用
    private UserService userService;

    @RequestMapping(value = "/")
    public String getUser() {
        User u = userService.findUserById(1);
        return "/login";
    }
    @RequestMapping("/index")
    public String index(){
        User u = userService.findUserById(2);
        return "/index";
    }
    @RequestMapping("/welcome")
    public String welcome(){
        User u = userService.findUserById(3);
      return "/welcome";
    }
    @RequestMapping("/welcome1")
    public String welcome1(){
        User u = userService.findUserById(4);
        return "/welcome1";
    }
    @ResponseBody
    @RequestMapping("/wx")
    public Object wx(){
        HashMap<String, String> map = new HashMap<String, String>();
        User u = userService.findUserById(1);
        map.put("name",u.getUsername());
        JSONObject json = JSONObject.parseObject(JSON.toJSONString(map));//把map转为json数据
        return json;
    }
}
