package com.chinasofti.postbar.controller;

import com.chinasofti.postbar.dto.User;
import com.chinasofti.postbar.service.UserService;
import com.chinasofti.postbar.utils.Result;
import com.chinasofti.postbar.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public Result test1(){
        System.out.println("请求成功");
        return Result.ok();
    }


    @RequestMapping("/doLogin")
    public Result login(HttpServletRequest request, String userName, String password) {
        HttpSession session = request.getSession();
        String pwd = Utils.md5(password);
        User user = userService.getUserByUserName(userName);
        String message = "";
        if (user == null) {
            message = "用户名和密码不正确，请重新输入";
        } else if (!user.getPassword().equals(pwd)) {
            message = "您输入的密码不正确，请重新输入";
        } else {
            session.setAttribute("username", user.getUserName());
            session.setAttribute("admin", user.getAdmin());
            session.setAttribute("id", user.getUserUUID());
            Date datetime = Utils.getDate();
            if (user.getLoginTime() == null) {
                session.setAttribute("dateTiem", datetime);
            } else {
                session.setAttribute("dateTime", user.getLoginTime());
            }
            userService.changeLoginTimeByUserName(userName, datetime);
        }
        return Result.ok(message);
    }

    @RequestMapping("/loginOut")
    public Result loginOut(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.invalidate();
        return Result.ok();
    }

    @RequestMapping("/editPassword")
    public Result editPassword(HttpServletRequest request,String oldPassword,String newPassword){
        String message = "";
        if(Utils.sessionTimeout(request)){
            message = "页面过期，请重新登陆";
        }else{
            String userName = (String)request.getSession().getAttribute("username");
            User user = userService.getUserByUserName(userName);
            if(user!=null && !user.getPassword().equals(Utils.md5(oldPassword))){
                return Result.error("当前密码输入错误");
            }else{
                // 执行修改密码
                userService.updatePasswordByUserName(userName,Utils.md5(newPassword));
            }
        }
        return Result.ok(message);
    }
}
