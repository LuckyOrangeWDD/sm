package com.zb.progect.sm.service;

import com.zb.progect.sm.entity.Role;
import com.zb.progect.sm.entity.User;

import java.util.List;

public interface UserService {

    public List<User> findAll(String name);

    public List<Role> findRole();

    public int addInfo(User user);

}
