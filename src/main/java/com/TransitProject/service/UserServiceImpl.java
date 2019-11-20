package com.TransitProject.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.TransitProject.dao.UserDao;
import com.TransitProject.model.Login;
import com.TransitProject.model.User;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public void register(User user) {
    userDao.register(user);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }
  public User delete(Login login) {
    return userDao.delete(login);
  }

}
