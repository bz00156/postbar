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

    @RequestMapping("/doLogin")
    public Result login(HttpServletRequest request, String userName, String password) {
        HttpSession session = request.getSession();
        String pwd = Utils.md5(password);
        User user = userService.login(userName);
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
}
