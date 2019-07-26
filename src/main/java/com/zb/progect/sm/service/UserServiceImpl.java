package com.zb.progect.sm.service;

import com.zb.progect.sm.dao.UserMapper;
import com.zb.progect.sm.entity.Role;
import com.zb.progect.sm.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper um;

    @Override
    public List<User> findAll(String name) {
        return um.findAll(name);
    }

    @Override
    public List<Role> findRole() {
        return um.findRole();
    }

    @Override
    public int addInfo(User user) {
        return um.addInfo(user);
    }
}
