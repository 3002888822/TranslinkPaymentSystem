package com.TransitProject.dao;

import com.TransitProject.model.Login;
import com.TransitProject.model.User;

public interface UserDao {

  void register(User user);

  User validateUser(Login login);
}
