package com.chinasofti.postbar.service;

import com.chinasofti.postbar.dto.User;

import java.util.Date;

public interface UserService {
    User getUserByUserName(String userName);

    void changeLoginTimeByUserName(String userName, Date datetime);

    void updatePasswordByUserName(String userName,String newPassword);
}
