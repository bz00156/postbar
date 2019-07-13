package com.chinasofti.postbar.controller;

import com.chinasofti.postbar.dto.User;
import com.chinasofti.postbar.service.UserService;
import com.chinasofti.postbar.utils.Result;
import com.chinasofti.postbar.utils.ResultOther;
import com.chinasofti.postbar.utils.TokenUtil;
import com.chinasofti.postbar.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public Result test1(){
        return Result.ok("您所拨打的用户已关机11113123");
    }


    @RequestMapping("/doLogin")
    public Result login(String userName, String password) {
        String pwd = Utils.md5(password);
        User user = userService.getUserByUserName(userName);
        if(user == null){
            return Result.err("用户名或密码错误");
        }else if(!user.getPassword().equals(pwd)){
            return Result.err("密码输入错误，请重新输入");
        }else{
            String token = TokenUtil.sign(userName,user.getAdmin(),user.getUserUUID());
            return  Result.ok(token);
        }
    }

    @RequestMapping("/loginOut")
    public ResultOther loginOut(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.invalidate();
        return ResultOther.ok();
    }

    @RequestMapping("/editPassword")
    public ResultOther editPassword(HttpServletRequest request, String oldPassword, String newPassword){
        String message = "";
        if(Utils.sessionTimeout(request)){
            message = "页面过期，请重新登陆";
        }else{
            String userName = (String)request.getSession().getAttribute("username");
            User user = userService.getUserByUserName(userName);
            if(user!=null && !user.getPassword().equals(Utils.md5(oldPassword))){
                return ResultOther.err("当前密码输入错误");
            }else{
                // 执行修改密码
                userService.updatePasswordByUserName(userName,Utils.md5(newPassword));
            }
        }
        return ResultOther.ok(message);
    }
}
