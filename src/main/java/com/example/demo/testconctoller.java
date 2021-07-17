package com.example.demo;

import com.example.demo.entiey.User;
import com.example.demo.servermpi.Usermpl;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class testconctoller {
    @Autowired
    Usermpl usermpl = new Usermpl();
    @RequestMapping("/sss")
    public String demos(){
        return "/demo.html";
    }
    @PostMapping(value = "/sql")
    @ResponseBody
    public  String sql(User user){
        int a = usermpl.InsterUser(user);
        if(a != 0){
            return "yes";
        }else{
            return "no";
        }

    }
}
