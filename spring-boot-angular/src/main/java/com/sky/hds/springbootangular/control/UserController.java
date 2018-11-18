package com.sky.hds.springbootangular.control;

import com.sky.hds.springbootangular.entity.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @RequestMapping("/")
    public String toLogin(){
        return "forward:/login.html";
    }

    //json数据不能为空
    @RequestMapping("/index")
    @ResponseBody
    public Map<String,Object> index(HttpServletRequest  request){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("menus",request.getSession().getAttribute("menus"));
        map.put("principle",new String("haha"));
        return map;
    }

    @RequestMapping("/login")
    @ResponseBody
    public List<Menu> login(HttpServletRequest  request){
        List<Menu> list = new ArrayList<>();

        list.add(new Menu("学校","/school"));
        list.add(new Menu("学生","/user"));
        list.add(new Menu("uu","/uu"));
        request.getSession(true).setAttribute("menus",list);
        return list;
    }

    @RequestMapping("/school")
    @ResponseBody
    public String school(HttpServletRequest  request){

        return "南昌航空大学";
    }
    @RequestMapping("/user")
    @ResponseBody
    public String user(HttpServletRequest  request){

        return "黄达盛";
    }
}
