package com.github.wxiaoqi.security.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("")
public class HomeController {
    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
    @RequestMapping(value = "about",method = RequestMethod.GET)
    public String about(){
        return "about";
    }
    @RequestMapping(value = "user",method = RequestMethod.GET)
    public String user(){
        return "user/list";
    }
    @RequestMapping(value = "user/edit",method = RequestMethod.GET)
    public String userEdit(){
        return "user/edit";
    }
    @RequestMapping(value = "menu",method = RequestMethod.GET)
    public String menu(){
        return "menu/list";
    }
    @RequestMapping(value = "menu/edit",method = RequestMethod.GET)
    public String menuEdit(){
        return "menu/edit";
    }
    @RequestMapping(value = "group",method = RequestMethod.GET)
    public String group(){
        return "group/list";
    }
    @RequestMapping(value = "group/user",method = RequestMethod.GET)
    public String groupUser(){
        return "group/user";
    }
    @RequestMapping(value = "group/edit",method = RequestMethod.GET)
    public String groupEdit(){
        return "group/edit";
    }
    @RequestMapping(value = "groupType",method = RequestMethod.GET)
    public String groupType(){
        return "groupType/list";
    }
    @RequestMapping(value = "groupType/edit",method = RequestMethod.GET)
    public String groupTypeEdit(){
        return "groupType/edit";
    }

}
