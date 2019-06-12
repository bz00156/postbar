package com.chinasofti.postbar.service;

import com.chinasofti.postbar.dto.User;
import com.chinasofti.postbar.dto.UserExample;
import com.chinasofti.postbar.dto.UserExample.Criteria;
import com.chinasofti.postbar.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String userName) {
        UserExample example = new UserExample();
        Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(userName);
        List<User> users = userMapper.selectByExample(example);
        if (users.size() > 0) {
            return users.get(0);
        }
        return null;
    }

    @Override
    public void changeLoginTimeByUserName(String userName, Date datetime) {
        UserExample example = new UserExample();
        Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(userName);

        User user = new User();
        user.setLoginTime(datetime);
        userMapper.updateByExampleSelective(user, example);
    }
}

















