package com.ddy.data.vue.Controller;

import com.ddy.data.vue.Server.VoteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class WebController {

//    private static Logger log = LoggerFactory.getLogger(WebController.class);

    @GetMapping("/index")
    public String gotoName(Model model){
        model.addAttribute("myname","ddy");
        return "index";
    }
}
