package com.Demo.dboke.Controller;

import com.Demo.dboke.Entity.User;
import com.Demo.dboke.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

@RestController
public class IndexRestController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/hello")
    public String index(){
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);

        userRepository.delete(userRepository.findByUserName("aa1"));
        userRepository.delete(userRepository.findByUserName("bb2"));
        userRepository.delete(userRepository.findByUserName("cc3"));

        userRepository.save(new User("aa1", "aa@126.com", "aa", "aa123456",formattedDate));
        userRepository.save(new User("bb2", "bb@126.com", "bb", "bb123456",formattedDate));
        userRepository.save(new User("cc3", "cc@126.com", "cc", "cc123456",formattedDate));

        //Assert.assertEquals(9, userRepository.findAll().size());
        //Assert.assertEquals("bb", userRepository.findByUserNameOrEmail("bb", "cc@126.com").getNickName());

      return "hello world";
    }
}
