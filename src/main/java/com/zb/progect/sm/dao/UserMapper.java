package com.zb.progect.sm.dao;

import com.zb.progect.sm.entity.Role;
import com.zb.progect.sm.entity.User;

import java.util.List;

public interface UserMapper {

    public List<User> findAll(String name);

    public List<Role> findRole();

    public int addInfo(User user);

}
