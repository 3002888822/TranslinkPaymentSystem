package com.TransitProject.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.TransitProject.dao.UserDao;
import com.TransitProject.dao.UserDaoImpl;
import com.TransitProject.model.Login;
import com.TransitProject.model.User;
import com.TransitProject.service.UserService;
@Controller
public class WelcomeController {
  @Autowired
  UserService userService;
  @DeleteMapping(value ="/login/{username}")
  public ResponseEntity<String> delete(@PathVariable String username){
   // var del = UserService.delete(username);
    
    return null;
    
  }
}
