package com.chinasofti.postbar.controller;

import com.chinasofti.postbar.utils.Result;
import com.chinasofti.postbar.utils.TokenUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/postController")
public class PostController {

    @RequestMapping("/getPostList")
    public Result getPostList(HttpServletRequest request) {
        String token = request.getHeader("token");
        if(token!=null){
            if(!TokenUtil.verify(token)){
                return Result.err("用户过期，请重新登录");
            }
        }
        return Result.ok();
    }
}
