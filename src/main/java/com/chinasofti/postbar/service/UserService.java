package com.chinasofti.postbar.service;

import com.chinasofti.postbar.dto.User;

import java.util.Date;

public interface UserService {
    User login(String userName);

    void changeLoginTimeByUserName(String userName, Date datetime);
}
