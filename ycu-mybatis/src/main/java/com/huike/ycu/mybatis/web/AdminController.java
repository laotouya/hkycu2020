package com.huike.ycu.mybatis.web;

import com.huike.ycu.mybatis.model.UmsAdmin;
import com.huike.ycu.mybatis.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "Hello, 欢迎！！！";
    }

    @PostMapping("/login")
    @ResponseBody
    public String login(Model model, String username, String password) {
        ModelAndView mav = new ModelAndView();

        UmsAdmin admin = new UmsAdmin();
        admin.setUsername(username);
        admin.setPassword(password);

        UmsAdmin dbAdmin = this.adminService.login(admin);
        if(ObjectUtils.isEmpty(dbAdmin)) {
            mav.setStatus(HttpStatus.OK);
            mav.addObject("msg", "该用户不存在");
            return mav.toString();
        }else {
            mav.addObject("admin", dbAdmin);
        }

        return mav.toString();
    }
}
