package com.TransitProject.service;

import com.TransitProject.model.Login;
import com.TransitProject.model.User;

public interface UserService {

  void register(User user);

  User validateUser(Login login);
  User delete(Login login);
}
