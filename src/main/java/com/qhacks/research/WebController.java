package com.qhacks.research;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class WebController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getTestPage() {
        return "index.html";
    }
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration() {
        return "registration.html";
    }
}
