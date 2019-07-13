package com.chinasofti.postbar.controller;

import com.chinasofti.postbar.utils.ResultOther;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {
    @RequestMapping("/fileUpload")
    @ResponseBody
    public ResultOther fileUpload(@RequestParam("file") MultipartFile file, Integer id){
        System.out.println("文件上传");
        System.out.println(file);
        System.out.println(id);
        return ResultOther.ok();
    }
}
