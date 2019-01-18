package com.Demo.dboke.Controller;

import com.Demo.dboke.Entity.User;
import com.Demo.dboke.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexHtmlController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/index.html")
    public String cdindexhtml(HttpServletRequest request){
        User loginUser = userRepository.findByUserName("admin");
        request.setAttribute("loginUser",loginUser);
        return "index";
    }

    @RequestMapping("/whisper.html")
    public String cdwhisper(){
        return "whisper";
    }

    @RequestMapping("/about.html")
    public String cdabouthtml(){
        return "about";
    }

    @RequestMapping("/album.html")
    public String cdalbumhtml(){
        return "album";
    }

    @RequestMapping("/details.html")
    public String cddetails(){
        return "details";
    }

    @RequestMapping("/leacots.html")
    public String cdleacotshtml(){
        return "leacots";
    }

}
