package com.Demo.dboke.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexHtmlController {

    @RequestMapping("/index.html")
    public String cdindexhtml(){
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
