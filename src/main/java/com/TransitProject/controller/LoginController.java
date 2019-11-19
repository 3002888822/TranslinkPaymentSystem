package com.TransitProject.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.TransitProject.dao.UserDaoImpl;
import com.TransitProject.model.Login;
import com.TransitProject.model.User;
import com.TransitProject.service.UserService;

@Controller
public class LoginController {

  @Autowired
  UserService userService;

  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("login");
    mav.addObject("login", new Login());

    return mav;
  }
/*@RequestMapping(value = "/Customer",method = RequestMethod.GET)
public Map referenceData(HttpServletRequest request)throws Exception {
  Map referenceData = new HashMap();
  
  List<String> BtnList = new ArrayList<String>();
  BtnList.add("Customer");
  BtnList.add("Admin");
  referenceData.put("BtnList", BtnList);
  
  
  return referenceData;
}*/
  @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
      @ModelAttribute("login") Login login) {
    ModelAndView mav = null;

    User user = userService.validateUser(login);
    
    if (null != user) {
      
      mav = new ModelAndView("welcome");
      mav.addObject("firstname", user.getFirstname());
    } else {
      mav = new ModelAndView("login");
      mav.addObject("message", "Username or Password is wrong!!");
    }

    return mav;
    
  }
  @RequestMapping(value="delete/{username}", method = RequestMethod.GET)
  public ModelAndView delete( HttpServletRequest request, HttpServletResponse response,
      @ModelAttribute("login") Login login) {
    ModelAndView mav = null;
    User user = userService.validateUser(login);
    return mav;
   
  }
}
