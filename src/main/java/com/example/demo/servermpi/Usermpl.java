package com.example.demo.servermpi;

import com.example.demo.dao.UserDao;
import com.example.demo.entiey.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Usermpl {
   @Autowired
   private  UserDao userDao = new UserDao();
   public int InsterUser(User user){return userDao.ResUser(user);}
}
